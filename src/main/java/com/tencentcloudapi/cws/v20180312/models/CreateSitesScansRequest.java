package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateSitesScansRequest  extends AbstractModel{


    /**
    * 站点的ID列表
    */
    @SerializedName("SiteIds")
    @Expose
    private Integer [] SiteIds;

    /**
    * 扫描模式，normal-正常扫描；deep-深度扫描
    */
    @SerializedName("ScannerType")
    @Expose
    private String ScannerType;

    /**
    * 扫描速率限制，每秒发送X个HTTP请求
    */
    @SerializedName("RateLimit")
    @Expose
    private Integer RateLimit;

    /**
     * 获取站点的ID列表
     * @return SiteIds 站点的ID列表
     */
    public Integer [] getSiteIds() {
        return this.SiteIds;
    }

    /**
     * 设置站点的ID列表
     * @param SiteIds 站点的ID列表
     */
    public void setSiteIds(Integer [] SiteIds) {
        this.SiteIds = SiteIds;
    }

    /**
     * 获取扫描模式，normal-正常扫描；deep-深度扫描
     * @return ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public String getScannerType() {
        return this.ScannerType;
    }

    /**
     * 设置扫描模式，normal-正常扫描；deep-深度扫描
     * @param ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public void setScannerType(String ScannerType) {
        this.ScannerType = ScannerType;
    }

    /**
     * 获取扫描速率限制，每秒发送X个HTTP请求
     * @return RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public Integer getRateLimit() {
        return this.RateLimit;
    }

    /**
     * 设置扫描速率限制，每秒发送X个HTTP请求
     * @param RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public void setRateLimit(Integer RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SiteIds.", this.SiteIds);
        this.setParamSimple(map, prefix + "ScannerType", this.ScannerType);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);

    }
}

