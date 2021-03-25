/**
 * \file src/calculateIdealWeight.java
 * \author Josué Teodoro Moreira <jteodomo@gmail.com>
 * \data 25 March, 2021
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class idealWeightCalculatorServlet extends HttpServlet
{
	public static String userName;
	public static String userGender;
	public static int    userHeight;
	public static float  userIdealWeight;

	protected void processRequest(HttpServletRequest request,
		                            HttpServletResponse response)
		throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter pw = response.getWriter())
		{
			this.userName = request.getParameter("user_name");
			this.userGender = request.getParameter("user_gender");
			this.userHeight = Integer.parseInt(request.getParameter("user_height"));

			switch (this.userGender)
			{
				case "gender_male":
					this.userIdealWeight = ((72.7f * (this.userHeight / 100)) - 58);

					break;
				case "gender_female":
					this.userIdealWeight = ((62.1f * (this.userHeight / 100)) - 44.7f);

					break;
				default:
					this.userIdealWeight = -1.0f;

					break;
			}

			request.setAttribute("name", this.userName);
			request.setAttribute("calculatedIdealWeight", (this.userIdealWeight > 0.0f)
																											? String.format(java.util.Locale.US, "%.2f", this.userIdealWeight)
																											: "Could not calculate");
			request.getRequestDispatcher("./web/idealWeightResult.jsp").forward(request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
		                   HttpServletResponse response)
		throws ServletException, IOException
	{
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
		                    HttpServletResponse response)
		throws ServletException, IOException
	{
		processRequest(request, response);
	}
}
