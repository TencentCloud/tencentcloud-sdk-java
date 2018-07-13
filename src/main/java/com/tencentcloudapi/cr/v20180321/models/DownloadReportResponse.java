package com.tencentcloudapi.cr.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DownloadReportResponse  extends AbstractModel{


    /**
    * 报告下载地址
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取报告下载地址
     * @return ReportUrl 报告下载地址
     */
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * 设置报告下载地址
     * @param ReportUrl 报告下载地址
     */
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

