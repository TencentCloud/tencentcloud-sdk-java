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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMFunnelReportRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>漏斗id</p>
    */
    @SerializedName("FunnelId")
    @Expose
    private String FunnelId;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>平台</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>设备类型</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>浏览器</p>
    */
    @SerializedName("Browser")
    @Expose
    private String Browser;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>页面来源</p>
    */
    @SerializedName("Referrer")
    @Expose
    private String Referrer;

    /**
    * <p>应用版本</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>环境选择</p>
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>漏斗id</p> 
     * @return FunnelId <p>漏斗id</p>
     */
    public String getFunnelId() {
        return this.FunnelId;
    }

    /**
     * Set <p>漏斗id</p>
     * @param FunnelId <p>漏斗id</p>
     */
    public void setFunnelId(String FunnelId) {
        this.FunnelId = FunnelId;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>平台</p> 
     * @return Platform <p>平台</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台</p>
     * @param Platform <p>平台</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>设备类型</p> 
     * @return DeviceType <p>设备类型</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>设备类型</p>
     * @param DeviceType <p>设备类型</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>浏览器</p> 
     * @return Browser <p>浏览器</p>
     */
    public String getBrowser() {
        return this.Browser;
    }

    /**
     * Set <p>浏览器</p>
     * @param Browser <p>浏览器</p>
     */
    public void setBrowser(String Browser) {
        this.Browser = Browser;
    }

    /**
     * Get <p>操作系统</p> 
     * @return OS <p>操作系统</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>操作系统</p>
     * @param OS <p>操作系统</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>国家</p> 
     * @return Country <p>国家</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>国家</p>
     * @param Country <p>国家</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>页面来源</p> 
     * @return Referrer <p>页面来源</p>
     */
    public String getReferrer() {
        return this.Referrer;
    }

    /**
     * Set <p>页面来源</p>
     * @param Referrer <p>页面来源</p>
     */
    public void setReferrer(String Referrer) {
        this.Referrer = Referrer;
    }

    /**
     * Get <p>应用版本</p> 
     * @return AppVersion <p>应用版本</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>应用版本</p>
     * @param AppVersion <p>应用版本</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>环境选择</p> 
     * @return Environment <p>环境选择</p>
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set <p>环境选择</p>
     * @param Environment <p>环境选择</p>
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public DescribeTDEMFunnelReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMFunnelReportRequest(DescribeTDEMFunnelReportRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FunnelId != null) {
            this.FunnelId = new String(source.FunnelId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Browser != null) {
            this.Browser = new String(source.Browser);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Referrer != null) {
            this.Referrer = new String(source.Referrer);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "FunnelId", this.FunnelId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Browser", this.Browser);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Referrer", this.Referrer);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

