package Vmd;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Messagebox;

import Entity.MstKaryawan;
import service.MstKaryawanSvc;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class LoginVmd {
	@WireVariable
	MstKaryawanSvc mstKaryawanSvc;
	
	private MstKaryawan mstKaryawan;
	private String username;
	private String password;
	
	@Command("login")
	@NotifyChange({"username","password"})
	public void login() {
		
		if (username != null && password != null) {
			mstKaryawan = mstKaryawanSvc.login(username, password);
			
			if (mstKaryawan.getKodeKaryawan() != null)
			{
				Sessions.getCurrent().setAttribute("user", mstKaryawan);
				Executions.sendRedirect("/masuk.zul");
			}
			else {
				Messagebox.show("Invalid Login");
				setUsername(null);
				setPassword(null);
			}
		}else {
			Messagebox.show("Harap diisi terlebih dahulu");
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
