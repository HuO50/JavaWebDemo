/**
 * Created by HJQYSF on 2018/1/6.
 */
angular.module('myApp', [])
    .controller('mainController',function ($scope) {
        // $scope.showTab = 1;
        $scope.showContent = 1;
        var tabHeaderName = [ "研究院简介","bug2","学术交流","重大项目","研究人员聘任条例"];
        $scope.headerText = "";
        console.log(window.location.pathname);
        ["general","news","communication","achievements","management"].forEach(function(item, index){
            if(window.location.pathname.indexOf(item) !== -1){
                $scope.headerText = tabHeaderName[index];
            }
        })

        // $scope.newID = 1;
        // $scope.id = /\d+/.exec(window.location.search)[0];

        // 换导航的函数
       /* $scope.changeTab = function (num) {
            $scope.showTab = num;
            $scope.headerText = tabHeaderName[num - 1];
            $scope.showContent = 1;
            sessionStorage.setItem("tab", num);
            //console.log(localStorage.getItem("tab"));
        }*/
        $scope.changeContent = function ($event,tab,num) {
            window.event? window.event.cancelBubble = true : $event.stopPropagation();
            $scope.showContent = num;
            var t = $event.target;
            $scope.headerText = t.nodeName == "SPAN" ? t.innerText : t.getElementsByTagName("span")[0].innerText;
            // console.log($scope.showContent % 10 == 4);
        }
        $scope.showMb = function ($event, num) {
            $scope.headerText = $event.target.innerText;
            $scope.showContent = num;
            console.log("::"+$scope.showContent);
        }
        // 0. 保持刷新前tab位置
        if(sessionStorage.getItem("tab")){
            $scope.showTab = sessionStorage.getItem("tab");
            $scope.headerText = tabHeaderName[$scope.showTab - 1];

        }

    })

window.onload = function(){
    document.getElementsByClassName("wrap")[0].style.minHeight = window.innerHeight + "px";
};
window.onresize = function () {
    document.getElementsByClassName("wrap")[0].style.minHeight = window.innerHeight + "px";
};
$(function(){
    // 1.       轮播图
    var time = 2500;	// 设定周期循环时间长度
    var interval = setInterval(go, time, true);	// go为核心动画函数，true为正序，false为倒序
    // console.time(1);

    function go (boo) {
        var imgWidth = $(".list img").width();	// 获取图片宽度
        console.log("go ");
        // console.timeEnd(1);
        if(imgWidth !== undefined){
            dir = boo ? "-" : "+";
            // page点的active轮换
            var a = boo ? $(".active").next() : $(".active").prev();
            var active = a.length ? a : (boo ? $(".page span:first") : $(".page span:last"))
            active.addClass('active').siblings().removeClass('active');

            // 若方向是向前，且list已到最前，left跳到-1750px ----在动画前移动
            var listLeft = +$(".list").css("left").slice(0, -2);
            if(!boo && parseInt(listLeft) == 0){
                $(".list").css("left", -$(".page span").length * imgWidth);
            }

            $(".list").animate({
                left: dir + "=" + imgWidth
            }, 800,function () {
                // 若方向是向后，且list已到最后，left跳到0px ----在动画后移动
                var listLeft = +$(".list").css("left").slice(0, -2);
                // console.log(listLeft);
                if(boo && -listLeft >= $(".page span").length * imgWidth - 1){
                    $(".list").css("left", 0);
                }
            });
        }
    }

    // 鼠标放上去停止动画，移开继续动画
    $(".loop-box").hover(function() {
        clearInterval(interval);
    }, function() {
        interval = setInterval(go, time, true);
    });

    // 向前按钮 向后按钮
    $(".toPage a").on("click", function (e) {
        if($(e.target).index() === 0){
            go(false);
        }else{
            go(true);
        }
    })
})