package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CustomerGatewayVendor  extends AbstractModel{


    /**
    * 平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;
    

    /**
    * 软件版本。
    */
    @SerializedName("SoftwareVersion")
    @Expose
    private String SoftwareVersion;
    

    /**
    * 供应商名称。
    */
    @SerializedName("VendorName")
    @Expose
    private String VendorName;
    

    /**
     * 获取平台。
     * @return Platform 平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * 设置平台。
     * @param Platform 平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * 获取软件版本。
     * @return SoftwareVersion 软件版本。
     */
    public String getSoftwareVersion() {
        return this.SoftwareVersion;
    }

    /**
     * 设置软件版本。
     * @param SoftwareVersion 软件版本。
     */
    public void setSoftwareVersion(String SoftwareVersion) {
        this.SoftwareVersion = SoftwareVersion;
    }

    /**
     * 获取供应商名称。
     * @return VendorName 供应商名称。
     */
    public String getVendorName() {
        return this.VendorName;
    }

    /**
     * 设置供应商名称。
     * @param VendorName 供应商名称。
     */
    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SoftwareVersion", this.SoftwareVersion);
        this.setParamSimple(map, prefix + "VendorName", this.VendorName);

    }
}

