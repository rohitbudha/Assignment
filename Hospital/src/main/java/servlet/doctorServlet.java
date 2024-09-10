package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import com.service.UserServiceImpl;

import model.Doctor;
import service.DoctorService;
import service.DoctorServiceImp;

/**
 * Servlet implementation class doctorServlet
 */
@WebServlet("/doctorServlet")
public class doctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("doctor.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		
		String add= request.getParameter("address");
		Long mobile=Long.parseLong(request.getParameter("mobile"));
		String gender= request.getParameter("gender");
		String note= request.getParameter("note");
		System.out.println("gender="+gender);
		
		Doctor d= new Doctor();
		d.setName(name);
		d.setEmail(email);
		d.setAddress(add);
		d.setMobile(mobile);
		d.setGender(gender);
		d.setNote(note);
		
		
		
	
	DoctorService  service= new DoctorServiceImp();
	
	service.addDoctor(d);

	request.setAttribute("message", "new data inserted successfully!!");
	request.getRequestDispatcher("doctor.jsp").forward(request, response);
//		
//		}
		
	}

}
