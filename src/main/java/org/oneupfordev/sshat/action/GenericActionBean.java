package org.oneupfordev.sshat.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.ForwardResolution;

public class GenericActionBean implements ActionBean {

    public static final String VIEWS_PATH = "/WEB-INF/jsp/%s.jsp";

    private ActionBeanContext context;

    public ActionBeanContext getContext() {
        return context;
    }
    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    public Resolution render(String page) {
        return new ForwardResolution(String.format(VIEWS_PATH, page));
    }
}
