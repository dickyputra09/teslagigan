package Vmd;

import java.util.Map;



import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.Initiator;

public class LoginCheckerVmd implements Initiator {
	public void doInit(Page arg0, Map<String, Object> arg1) throws Exception {
		// TODO Auto-generated method stub
				Session session = Sessions.getCurrent();
				
				if (session.hasAttribute("user")) {
					Executions.sendRedirect("/masuk.zul");
					return;
				}

	}
}
