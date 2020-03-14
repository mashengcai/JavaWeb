package com.imooc.ajax;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContentServlet
 */
@WebServlet(description = "Ajax简单实例1", urlPatterns = { "/ContentServlet" })
public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得输入的内容,从request取数据,通俗说就是从浏览器取数据
        String name = request.getParameter("uname");
        System.out.println("欢迎:"+name);
        PrintWriter out = response.getWriter();//返回的是PrintWriter，这是一个打印输出流。
        out.print("["+name+"]  the message has been received[this is Ajax]");//不仅可以打印输出文本格式的（包括html标签），还可以将一个对象以默认的编码方式转换为二进制字节输出
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
