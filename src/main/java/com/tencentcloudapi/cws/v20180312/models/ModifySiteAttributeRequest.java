package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifySiteAttributeRequest  extends AbstractModel{


    /**
    * 站点ID
    */
    @SerializedName("SiteId")
    @Expose
    private Integer SiteId;
    

    /**
    * 站点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;
    

    /**
     * 获取站点ID
     * @return SiteId 站点ID
     */
    public Integer getSiteId() {
        return this.SiteId;
    }

    /**
     * 设置站点ID
     * @param SiteId 站点ID
     */
    public void setSiteId(Integer SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * 获取站点名称
     * @return Name 站点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置站点名称
     * @param Name 站点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

