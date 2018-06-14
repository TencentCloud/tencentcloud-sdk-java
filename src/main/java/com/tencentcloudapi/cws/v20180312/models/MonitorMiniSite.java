package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class MonitorMiniSite  extends AbstractModel{


    /**
    * 站点ID。
    */
    @SerializedName("SiteId")
    @Expose
    private Integer SiteId;

    /**
    * 站点Url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 获取站点ID。
     * @return SiteId 站点ID。
     */
    public Integer getSiteId() {
        return this.SiteId;
    }

    /**
     * 设置站点ID。
     * @param SiteId 站点ID。
     */
    public void setSiteId(Integer SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * 获取站点Url。
     * @return Url 站点Url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置站点Url。
     * @param Url 站点Url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

