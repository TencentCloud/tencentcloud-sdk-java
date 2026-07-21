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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel {

    /**
    * <p>设备ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

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
    * <p>平台</p><p>枚举值：</p><ul><li>2： Android</li><li>3： IOS</li><li>4： H5</li><li>5： 微信小程序</li></ul>
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
    * <p>SDK版本</p>
    */
    @SerializedName("SdkBuildVersion")
    @Expose
    private String SdkBuildVersion;

    /**
     * Get <p>设备ID</p> 
     * @return DeviceId <p>设备ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID</p>
     * @param DeviceId <p>设备ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

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
     * Get <p>平台</p><p>枚举值：</p><ul><li>2： Android</li><li>3： IOS</li><li>4： H5</li><li>5： 微信小程序</li></ul> 
     * @return Platform <p>平台</p><p>枚举值：</p><ul><li>2： Android</li><li>3： IOS</li><li>4： H5</li><li>5： 微信小程序</li></ul>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台</p><p>枚举值：</p><ul><li>2： Android</li><li>3： IOS</li><li>4： H5</li><li>5： 微信小程序</li></ul>
     * @param Platform <p>平台</p><p>枚举值：</p><ul><li>2： Android</li><li>3： IOS</li><li>4： H5</li><li>5： 微信小程序</li></ul>
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
     * Get <p>SDK版本</p> 
     * @return SdkBuildVersion <p>SDK版本</p>
     */
    public String getSdkBuildVersion() {
        return this.SdkBuildVersion;
    }

    /**
     * Set <p>SDK版本</p>
     * @param SdkBuildVersion <p>SDK版本</p>
     */
    public void setSdkBuildVersion(String SdkBuildVersion) {
        this.SdkBuildVersion = SdkBuildVersion;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
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
        if (source.SdkBuildVersion != null) {
            this.SdkBuildVersion = new String(source.SdkBuildVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SystemVersion", this.SystemVersion);
        this.setParamSimple(map, prefix + "SdkBuildVersion", this.SdkBuildVersion);

    }
}

