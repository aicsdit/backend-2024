package cs.dit.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BoardService {
	public void execute(HttpServletRequest	request, HttpServletResponse response)
			throws ServletException, IOException;
}
