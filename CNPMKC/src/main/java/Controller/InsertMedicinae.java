package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MedicineDao;

/**
 * Servlet implementation class InsertMedicinae
 */
@WebServlet("/InsertMedicinae")
public class InsertMedicinae extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMedicinae() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("name trong form");
		String doseMin =  String.getString(request.getParameter("doseMin"));
		String doseMax =  String.toString(request.getParameter("doseMax"));
		String frequencyMin =  Integer.toString(request.getParameter("frequencyMin"));
		String frequencyMax =  Integer.parseInt(request.getParameter("frequencyMax"));
		String daydoseMin =  Integer.parseInt(request.getParameter("daydoseMin"));
		String daydoseMax =  Integer.parseInt(request.getParameter("daydoseMax"));
		MedicineDao medicineDAO = new MedicineDao();
		try {
		    medicineDAO.insertMedicine (id, doseMin, doseMax, frequencyMin, frequencyMax, daydoseMin, daydoseMax);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		response.sendRedirect("Medicine");

	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
