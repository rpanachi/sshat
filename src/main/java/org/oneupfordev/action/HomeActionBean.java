package org.oneupfordev.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;

import org.oneupfordev.sshat.action.GenericActionBean;

public class HomeActionBean extends GenericActionBean {

    @DefaultHandler
    public Resolution view() {
        return render("home");
    }

    public String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public String getOsName() {
        return System.getProperty("os.name");
    }
}
