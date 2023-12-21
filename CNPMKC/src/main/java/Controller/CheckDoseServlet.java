package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Medicine;

/**
 * Servlet implementation class CheckDoseServlet
 */
@WebServlet("/CheckDoseServlet")
public class CheckDoseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckDoseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    Medicine medicine; double dose; int frequency; int duration;
	        Double frequency_mg = dose * frequency;
	        Double duration_mg = frequency_mg * duration;
	        String doseMin = medicine.getDayDosemin();
	        String doseMax = medicine.getDayDosemax();
	        String frequencyMax = medicine.getFrequencymax();
	        String frequencyMin = medicine.getFrequencymax();
	       
	        String dayDoseMin = medicine.getDayDosemin();
	        String dayDoseMax = medicine.getDayDosemax();
	      

		RequestDispatcher dispatcher = null;
	        if (dose < doseMin  dose > doseMax) {
	            request.setAttribute("status", "Erorr1");
	            dispatcher = request.getRequestDispatcher("tranghientai.jsp");
	            dispatcher.forward(request, response);
	        }

	        if (frequency_mg < frequencyMin_mg  frequency_mg > frequencyMax_mg) {
	            request.setAttribute("status", "Erorr2"); 
		    dispatcher = request.getRequestDispatcher("tranghientai.jsp");
	            dispatcher.forward(request, response);
	        }
	        if (duration_mg < dayDoseMin_mg || duration_mg > dayDoseMax_mg) {
	            request.setAttribute("status", "Erorr3"); 
		    dispatcher = request.getRequestDispatcher("tranghientai.jsp");
	            dispatcher.forward(request, response);
	        }
	        return true; 
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
