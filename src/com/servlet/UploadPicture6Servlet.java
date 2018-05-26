package com.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.io.IOUtils;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Servlet implementation class UploadPictureServlet
 */
@WebServlet("/UploadPicture6Servlet")
public class UploadPicture6Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 上传文件存储目录
	private static final String UPLOAD_DIRECTORY = "images";

	// 上传配置
	private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//图一修改
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(diskFileItemFactory);
		String name;
		try {
			List<FileItem> list = upload.parseRequest(request);
			for (FileItem fileItem : list) {
				if (!fileItem.isFormField()) {
					String path = fileItem.getName();
					// String filename = path.substring(path.lastIndexOf("\\"));
					String filename = "6.jpg";
					InputStream inputStream = fileItem.getInputStream();
					String realPath = getServletContext().getRealPath("/images");
					System.out.println(realPath);
					OutputStream outputStream = new FileOutputStream(new File(realPath, filename));
					IOUtils.copy(inputStream, outputStream);

					inputStream.close();
					outputStream.close();
					System.out.println("finish");
				}else {
					System.out.println(fileItem.getName());;
					
				}
			}

		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("WEB-INF/jsp/UploadMessage.jsp").forward(request, response);

		// //检测是否为多媒体上传
		// if (!ServletFileUpload.isMultipartContent(request)) {
		// // 如果不是则停止
		// PrintWriter writer = response.getWriter();
		// writer.println("Error: 表单必须包含 enctype=multipart/form-data");
		// writer.flush();
		// return;
		// }
		//
		// // 配置上传参数
		// DiskFileItemFactory factory = new DiskFileItemFactory();
		// // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
		// factory.setSizeThreshold(MEMORY_THRESHOLD);
		// // 设置临时存储目录
		// factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		//
		// ServletFileUpload upload = new ServletFileUpload(factory);
		//
		// // 设置最大文件上传值
		// upload.setFileSizeMax(MAX_FILE_SIZE);
		//
		// // 设置最大请求值 (包含文件和表单数据)
		// upload.setSizeMax(MAX_REQUEST_SIZE);
		//
		// // 中文处理
		// upload.setHeaderEncoding("UTF-8");
		//
		// // 构造临时路径来存储上传的文件
		// // 这个路径相对当前应用的目录
		// String uploadPath = getServletContext().getRealPath("/upload"); //+
		// UPLOAD_DIRECTORY;
		//// System.out.println(uploadPath);
		//
		// // 如果目录不存在则创建
		// File uploadDir = new File(uploadPath);
		// if (!uploadDir.exists()) {
		// uploadDir.mkdir();
		// }
		//
		// try {
		// List<FileItem> fileItems = upload.parseRequest(request);
		// for(FileItem fileItem:fileItems) {
		// String name = fileItem.getName();
		// String fieldName = fileItem.getFieldName();
		// System.out.println(name);
		// System.out.println(fieldName);
		//
		// //获取文件流
		//
		// InputStream inputStream = fileItem.getInputStream();
		// //上传输入流
		// File file = new File(uploadPath + File.separator +name);
		// FileOutputStream fileOutputStream = new FileOutputStream(file);
		// }
		// } catch (Exception e) {
		// // TODO: handle exception
		// }
		//
		//
		// try {
		// // 解析请求的内容提取文件数据
		// @SuppressWarnings("unchecked")
		// List<FileItem> formItems = upload.parseRequest(request);
		//
		// if (formItems != null && formItems.size() > 0) {
		// // 迭代表单数据
		// for (FileItem item : formItems) {
		// // 处理不在表单中的字段
		// if (!item.isFormField()) {
		// String fileName = new File(item.getName()).getName();
		// // String[] temp = fileName.split(".");
		//// fileName = picno;
		// fileName = "2.jpg";
		// System.out.println(fileName);
		// String filePath = uploadPath + File.separator + fileName;
		// File storeFile = new File(filePath);
		// // 在控制台输出文件的上传路径
		// System.out.println(filePath);
		// // 保存文件到硬盘
		// item.write(storeFile);
		// request.setAttribute("message",
		// "文件上传成功!");
		// }
		// }
		// }
		// } catch (Exception ex) {
		// request.setAttribute("message",
		// "错误信息: " + ex.getMessage());
		// }
		// 跳转到 message.jsp

	}
}