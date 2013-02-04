package action.popup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class PopupAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) {

		ActionMessages am = new ActionMessages();

		ActionMessage am1 = new ActionMessage("test.msg");

		am.add(ActionMessages.GLOBAL_MESSAGE, am1);

		saveMessages(req, am);

		return (mapping.findForward("popup"));
	}
}
