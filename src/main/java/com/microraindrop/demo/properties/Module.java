package com.microraindrop.demo.properties;

import java.util.List;

public class Module {
    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getDefeatUrl() {
        if ( defeatUrl != null && !"".equals(defeatUrl)  ) {
            return defeatUrl;
        }
        else
        {
            if (menus.size() > 0)
            {
                return menus.get(0).getUrl();
            }
            else
            {
                return "";
            }
        }
    }

    public void setDefeatUrl(String defeatUrl) {
        this.defeatUrl = defeatUrl;
    }

    public Boolean getIsdefeatUrl() {
        if ( defeatUrl != null && !"".equals(defeatUrl)   ) {
            return true;
        }
        else
        {
            return false;
        }

    }

    private String defeatUrl;
    private List<Menu> menus;
    private String moduleId;
    private String moduleName;



}
