package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateScanInstancesRequest  extends AbstractModel{


    /**
    * 待扫描的app信息列表，一次最多提交20个
    */
    @SerializedName("AppInfos")
    @Expose
    private AppInfo [] AppInfos;
    

    /**
    * 扫描信息
    */
    @SerializedName("ScanInfo")
    @Expose
    private ScanInfo ScanInfo;
    

    /**
     * 获取待扫描的app信息列表，一次最多提交20个
     * @return AppInfos 待扫描的app信息列表，一次最多提交20个
     */
    public AppInfo [] getAppInfos() {
        return this.AppInfos;
    }

    /**
     * 设置待扫描的app信息列表，一次最多提交20个
     * @param AppInfos 待扫描的app信息列表，一次最多提交20个
     */
    public void setAppInfos(AppInfo [] AppInfos) {
        this.AppInfos = AppInfos;
    }

    /**
     * 获取扫描信息
     * @return ScanInfo 扫描信息
     */
    public ScanInfo getScanInfo() {
        return this.ScanInfo;
    }

    /**
     * 设置扫描信息
     * @param ScanInfo 扫描信息
     */
    public void setScanInfo(ScanInfo ScanInfo) {
        this.ScanInfo = ScanInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AppInfos.", this.AppInfos);
        this.setParamObj(map, prefix + "ScanInfo.", this.ScanInfo);

    }
}

