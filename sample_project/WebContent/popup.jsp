<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>

<html:html>
<head><title>popup.jsp</title></head>
<ts:body>
	�|�b�v�A�b�v���<br><br>
	�� �� ActionMessages �ɐݒ肵�Ă������b�Z�[�W
	<h1>
	<ts:messages id="msg" message="true">
    	<bean:write name="msg"/>
	</ts:messages>
	</h1>
</ts:body>
</html:html>