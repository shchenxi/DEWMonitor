package com.microraindrop.demo.properties;

public class Menu {

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    private String menuId;
    private String menuName;
    private String Url;

    public String getExtLink() {
        return extLink;
    }

    public void setExtLink(String extLink) {
        this.extLink = extLink;
    }

    private String extLink;


    public Boolean getAutoJmp() {
        return autoJmp;
    }

    public void setAutoJmp(Boolean autoJmp) {
        this.autoJmp = autoJmp;
    }

    private Boolean autoJmp;

}
