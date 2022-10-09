/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tds.v20220801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFraudPremiumResponse extends AbstractModel{

    /**
    * App版本信息
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 客户端IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 机型
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 网络类型
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 应用包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 平台（2-Android，3-iOS，4-H5，5-微信小程序）
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 系统版本
    */
    @SerializedName("SystemVersion")
    @Expose
    private String SystemVersion;

    /**
    * SDK版本号
    */
    @SerializedName("SdkBuildNo")
    @Expose
    private String SdkBuildNo;

    /**
    * 实时风险信息
    */
    @SerializedName("RiskInfos")
    @Expose
    private RiskInfo [] RiskInfos;

    /**
    * 离线风险信息
    */
    @SerializedName("HistRiskInfos")
    @Expose
    private RiskInfo [] HistRiskInfos;

    /**
    * 设备匿名标识
    */
    @SerializedName("Openid")
    @Expose
    private String Openid;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get App版本信息 
     * @return AppVersion App版本信息
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set App版本信息
     * @param AppVersion App版本信息
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 品牌 
     * @return Brand 品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 品牌
     * @param Brand 品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 客户端IP 
     * @return ClientIp 客户端IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端IP
     * @param ClientIp 客户端IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 机型 
     * @return Model 机型
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 机型
     * @param Model 机型
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 网络类型 
     * @return NetworkType 网络类型
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型
     * @param NetworkType 网络类型
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 应用包名 
     * @return PackageName 应用包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 应用包名
     * @param PackageName 应用包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 平台（2-Android，3-iOS，4-H5，5-微信小程序） 
     * @return Platform 平台（2-Android，3-iOS，4-H5，5-微信小程序）
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台（2-Android，3-iOS，4-H5，5-微信小程序）
     * @param Platform 平台（2-Android，3-iOS，4-H5，5-微信小程序）
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 系统版本 
     * @return SystemVersion 系统版本
     */
    public String getSystemVersion() {
        return this.SystemVersion;
    }

    /**
     * Set 系统版本
     * @param SystemVersion 系统版本
     */
    public void setSystemVersion(String SystemVersion) {
        this.SystemVersion = SystemVersion;
    }

    /**
     * Get SDK版本号 
     * @return SdkBuildNo SDK版本号
     */
    public String getSdkBuildNo() {
        return this.SdkBuildNo;
    }

    /**
     * Set SDK版本号
     * @param SdkBuildNo SDK版本号
     */
    public void setSdkBuildNo(String SdkBuildNo) {
        this.SdkBuildNo = SdkBuildNo;
    }

    /**
     * Get 实时风险信息 
     * @return RiskInfos 实时风险信息
     */
    public RiskInfo [] getRiskInfos() {
        return this.RiskInfos;
    }

    /**
     * Set 实时风险信息
     * @param RiskInfos 实时风险信息
     */
    public void setRiskInfos(RiskInfo [] RiskInfos) {
        this.RiskInfos = RiskInfos;
    }

    /**
     * Get 离线风险信息 
     * @return HistRiskInfos 离线风险信息
     */
    public RiskInfo [] getHistRiskInfos() {
        return this.HistRiskInfos;
    }

    /**
     * Set 离线风险信息
     * @param HistRiskInfos 离线风险信息
     */
    public void setHistRiskInfos(RiskInfo [] HistRiskInfos) {
        this.HistRiskInfos = HistRiskInfos;
    }

    /**
     * Get 设备匿名标识 
     * @return Openid 设备匿名标识
     */
    public String getOpenid() {
        return this.Openid;
    }

    /**
     * Set 设备匿名标识
     * @param Openid 设备匿名标识
     */
    public void setOpenid(String Openid) {
        this.Openid = Openid;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFraudPremiumResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFraudPremiumResponse(DescribeFraudPremiumResponse source) {
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SystemVersion != null) {
            this.SystemVersion = new String(source.SystemVersion);
        }
        if (source.SdkBuildNo != null) {
            this.SdkBuildNo = new String(source.SdkBuildNo);
        }
        if (source.RiskInfos != null) {
            this.RiskInfos = new RiskInfo[source.RiskInfos.length];
            for (int i = 0; i < source.RiskInfos.length; i++) {
                this.RiskInfos[i] = new RiskInfo(source.RiskInfos[i]);
            }
        }
        if (source.HistRiskInfos != null) {
            this.HistRiskInfos = new RiskInfo[source.HistRiskInfos.length];
            for (int i = 0; i < source.HistRiskInfos.length; i++) {
                this.HistRiskInfos[i] = new RiskInfo(source.HistRiskInfos[i]);
            }
        }
        if (source.Openid != null) {
            this.Openid = new String(source.Openid);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SystemVersion", this.SystemVersion);
        this.setParamSimple(map, prefix + "SdkBuildNo", this.SdkBuildNo);
        this.setParamArrayObj(map, prefix + "RiskInfos.", this.RiskInfos);
        this.setParamArrayObj(map, prefix + "HistRiskInfos.", this.HistRiskInfos);
        this.setParamSimple(map, prefix + "Openid", this.Openid);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

