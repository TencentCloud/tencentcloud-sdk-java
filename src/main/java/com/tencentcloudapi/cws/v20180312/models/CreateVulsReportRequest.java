package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateVulsReportRequest  extends AbstractModel{


    /**
    * 站点ID
    */
    @SerializedName("SiteId")
    @Expose
    private Integer SiteId;

    /**
    * 监控任务ID
    */
    @SerializedName("MonitorId")
    @Expose
    private Integer MonitorId;

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
     * 获取监控任务ID
     * @return MonitorId 监控任务ID
     */
    public Integer getMonitorId() {
        return this.MonitorId;
    }

    /**
     * 设置监控任务ID
     * @param MonitorId 监控任务ID
     */
    public void setMonitorId(Integer MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);

    }
}

