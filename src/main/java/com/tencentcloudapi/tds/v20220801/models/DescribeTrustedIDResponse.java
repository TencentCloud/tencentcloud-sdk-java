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

public class DescribeTrustedIDResponse extends AbstractModel {

    /**
    * 设备匿名标识
    */
    @SerializedName("Openid")
    @Expose
    private String Openid;

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
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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

    public DescribeTrustedIDResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrustedIDResponse(DescribeTrustedIDResponse source) {
        if (source.Openid != null) {
            this.Openid = new String(source.Openid);
        }
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Openid", this.Openid);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SystemVersion", this.SystemVersion);
        this.setParamSimple(map, prefix + "SdkBuildNo", this.SdkBuildNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

