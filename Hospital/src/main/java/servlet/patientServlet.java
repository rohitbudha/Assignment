package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Doctor;
import model.Patient;
import service.DoctorService;
import service.DoctorServiceImp;

/**
 * Servlet implementation class patientSevlet
 */
@WebServlet("/patientServlet")
public class patientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("patient.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String gender= request.getParameter("gender");
		Long phone=Long.parseLong(request.getParameter("phone"));
		//date(dob)
		String mstatus= request.getParameter("mstatus");
		String paddress= request.getParameter("paddress");
		String caddress= request.getParameter("caddress");
		String history= request.getParameter("history");
		String other= request.getParameter("details");
		



		
		
		Patient p= new Patient();
		p.setFname(fname);
		p.setLname(lname);
		p.setGender(gender);
		p.setPhone(phone);
		p.setMarriage(mstatus);
		p.setPaddress(paddress);
		p.setCaddress(caddress);
		p.setHistory(history);
		p.setDetails(other);
		
	
	PatientService  service= new PatientServiceImp();
	
	service.addPatient(p);

	request.setAttribute("message", "new data inserted successfully!!");
	request.getRequestDispatcher("patient.jsp").forward(request, response);
//		
//		}
		
		
	}

}
