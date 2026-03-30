/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFraudBaseResponse extends AbstractModel {

    /**
    * <p>App版本信息</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>品牌</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>客户端IP</p>
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * <p>机型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>网络类型</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>应用包名</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * <p>平台（2-Android，3-iOS，4-H5，5-微信小程序）</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>系统版本</p>
    */
    @SerializedName("SystemVersion")
    @Expose
    private String SystemVersion;

    /**
    * <p>SDK版本号</p>
    */
    @SerializedName("SdkBuildNo")
    @Expose
    private String SdkBuildNo;

    /**
    * <p>实时风险信息</p>
    */
    @SerializedName("RiskInfos")
    @Expose
    private RiskInfo [] RiskInfos;

    /**
    * <p>离线风险信息</p>
    */
    @SerializedName("HistRiskInfos")
    @Expose
    private RiskInfo [] HistRiskInfos;

    /**
    * <p>检测时间戳（毫秒）</p>
    */
    @SerializedName("RiskCheckTimestamp")
    @Expose
    private String RiskCheckTimestamp;

    /**
    * <p>额外信息</p>
    */
    @SerializedName("ExtraInfos")
    @Expose
    private ExtraInfo [] ExtraInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>App版本信息</p> 
     * @return AppVersion <p>App版本信息</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>App版本信息</p>
     * @param AppVersion <p>App版本信息</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>品牌</p> 
     * @return Brand <p>品牌</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>品牌</p>
     * @param Brand <p>品牌</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>客户端IP</p> 
     * @return ClientIp <p>客户端IP</p>
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set <p>客户端IP</p>
     * @param ClientIp <p>客户端IP</p>
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get <p>机型</p> 
     * @return Model <p>机型</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>机型</p>
     * @param Model <p>机型</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>网络类型</p> 
     * @return NetworkType <p>网络类型</p>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>网络类型</p>
     * @param NetworkType <p>网络类型</p>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>应用包名</p> 
     * @return PackageName <p>应用包名</p>
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>应用包名</p>
     * @param PackageName <p>应用包名</p>
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get <p>平台（2-Android，3-iOS，4-H5，5-微信小程序）</p> 
     * @return Platform <p>平台（2-Android，3-iOS，4-H5，5-微信小程序）</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台（2-Android，3-iOS，4-H5，5-微信小程序）</p>
     * @param Platform <p>平台（2-Android，3-iOS，4-H5，5-微信小程序）</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>系统版本</p> 
     * @return SystemVersion <p>系统版本</p>
     */
    public String getSystemVersion() {
        return this.SystemVersion;
    }

    /**
     * Set <p>系统版本</p>
     * @param SystemVersion <p>系统版本</p>
     */
    public void setSystemVersion(String SystemVersion) {
        this.SystemVersion = SystemVersion;
    }

    /**
     * Get <p>SDK版本号</p> 
     * @return SdkBuildNo <p>SDK版本号</p>
     */
    public String getSdkBuildNo() {
        return this.SdkBuildNo;
    }

    /**
     * Set <p>SDK版本号</p>
     * @param SdkBuildNo <p>SDK版本号</p>
     */
    public void setSdkBuildNo(String SdkBuildNo) {
        this.SdkBuildNo = SdkBuildNo;
    }

    /**
     * Get <p>实时风险信息</p> 
     * @return RiskInfos <p>实时风险信息</p>
     */
    public RiskInfo [] getRiskInfos() {
        return this.RiskInfos;
    }

    /**
     * Set <p>实时风险信息</p>
     * @param RiskInfos <p>实时风险信息</p>
     */
    public void setRiskInfos(RiskInfo [] RiskInfos) {
        this.RiskInfos = RiskInfos;
    }

    /**
     * Get <p>离线风险信息</p> 
     * @return HistRiskInfos <p>离线风险信息</p>
     */
    public RiskInfo [] getHistRiskInfos() {
        return this.HistRiskInfos;
    }

    /**
     * Set <p>离线风险信息</p>
     * @param HistRiskInfos <p>离线风险信息</p>
     */
    public void setHistRiskInfos(RiskInfo [] HistRiskInfos) {
        this.HistRiskInfos = HistRiskInfos;
    }

    /**
     * Get <p>检测时间戳（毫秒）</p> 
     * @return RiskCheckTimestamp <p>检测时间戳（毫秒）</p>
     */
    public String getRiskCheckTimestamp() {
        return this.RiskCheckTimestamp;
    }

    /**
     * Set <p>检测时间戳（毫秒）</p>
     * @param RiskCheckTimestamp <p>检测时间戳（毫秒）</p>
     */
    public void setRiskCheckTimestamp(String RiskCheckTimestamp) {
        this.RiskCheckTimestamp = RiskCheckTimestamp;
    }

    /**
     * Get <p>额外信息</p> 
     * @return ExtraInfos <p>额外信息</p>
     */
    public ExtraInfo [] getExtraInfos() {
        return this.ExtraInfos;
    }

    /**
     * Set <p>额外信息</p>
     * @param ExtraInfos <p>额外信息</p>
     */
    public void setExtraInfos(ExtraInfo [] ExtraInfos) {
        this.ExtraInfos = ExtraInfos;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFraudBaseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFraudBaseResponse(DescribeFraudBaseResponse source) {
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
        if (source.RiskCheckTimestamp != null) {
            this.RiskCheckTimestamp = new String(source.RiskCheckTimestamp);
        }
        if (source.ExtraInfos != null) {
            this.ExtraInfos = new ExtraInfo[source.ExtraInfos.length];
            for (int i = 0; i < source.ExtraInfos.length; i++) {
                this.ExtraInfos[i] = new ExtraInfo(source.ExtraInfos[i]);
            }
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
        this.setParamSimple(map, prefix + "RiskCheckTimestamp", this.RiskCheckTimestamp);
        this.setParamArrayObj(map, prefix + "ExtraInfos.", this.ExtraInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

