/**
 * Created by HJQYSF on 2018/1/14.
 */
// console.log(window.location.search);
var id = /\d+/.exec(window.location.search)[0];
// console.log("id"+id);
$(".news-item-content")[id-1].style.display = "block";