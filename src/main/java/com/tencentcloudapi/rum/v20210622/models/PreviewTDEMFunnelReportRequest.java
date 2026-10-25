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

public class PreviewTDEMFunnelReportRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间戳（毫秒）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间戳（毫秒）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>漏斗步骤配置JSON字符串（2~20步），格式：[{"StepName":"首页","PagePattern":"/","PageMatchMode":"exact","Selector":"","ActionType":"page_view","VisualName":""}]</p>
    */
    @SerializedName("Steps")
    @Expose
    private String Steps;

    /**
    * <p>平台筛选</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>应用版本筛选</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>设备类型筛选</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>浏览器筛选</p>
    */
    @SerializedName("Browser")
    @Expose
    private String Browser;

    /**
    * <p>操作系统筛选</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>国家/地区筛选</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>来源筛选</p>
    */
    @SerializedName("Referrer")
    @Expose
    private String Referrer;

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
     * Get <p>开始时间戳（毫秒）</p> 
     * @return StartTime <p>开始时间戳（毫秒）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间戳（毫秒）</p>
     * @param StartTime <p>开始时间戳（毫秒）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间戳（毫秒）</p> 
     * @return EndTime <p>结束时间戳（毫秒）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间戳（毫秒）</p>
     * @param EndTime <p>结束时间戳（毫秒）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>漏斗步骤配置JSON字符串（2~20步），格式：[{"StepName":"首页","PagePattern":"/","PageMatchMode":"exact","Selector":"","ActionType":"page_view","VisualName":""}]</p> 
     * @return Steps <p>漏斗步骤配置JSON字符串（2~20步），格式：[{"StepName":"首页","PagePattern":"/","PageMatchMode":"exact","Selector":"","ActionType":"page_view","VisualName":""}]</p>
     */
    public String getSteps() {
        return this.Steps;
    }

    /**
     * Set <p>漏斗步骤配置JSON字符串（2~20步），格式：[{"StepName":"首页","PagePattern":"/","PageMatchMode":"exact","Selector":"","ActionType":"page_view","VisualName":""}]</p>
     * @param Steps <p>漏斗步骤配置JSON字符串（2~20步），格式：[{"StepName":"首页","PagePattern":"/","PageMatchMode":"exact","Selector":"","ActionType":"page_view","VisualName":""}]</p>
     */
    public void setSteps(String Steps) {
        this.Steps = Steps;
    }

    /**
     * Get <p>平台筛选</p> 
     * @return Platform <p>平台筛选</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台筛选</p>
     * @param Platform <p>平台筛选</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>应用版本筛选</p> 
     * @return AppVersion <p>应用版本筛选</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>应用版本筛选</p>
     * @param AppVersion <p>应用版本筛选</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>设备类型筛选</p> 
     * @return DeviceType <p>设备类型筛选</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>设备类型筛选</p>
     * @param DeviceType <p>设备类型筛选</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>浏览器筛选</p> 
     * @return Browser <p>浏览器筛选</p>
     */
    public String getBrowser() {
        return this.Browser;
    }

    /**
     * Set <p>浏览器筛选</p>
     * @param Browser <p>浏览器筛选</p>
     */
    public void setBrowser(String Browser) {
        this.Browser = Browser;
    }

    /**
     * Get <p>操作系统筛选</p> 
     * @return OS <p>操作系统筛选</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>操作系统筛选</p>
     * @param OS <p>操作系统筛选</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>国家/地区筛选</p> 
     * @return Country <p>国家/地区筛选</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>国家/地区筛选</p>
     * @param Country <p>国家/地区筛选</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>来源筛选</p> 
     * @return Referrer <p>来源筛选</p>
     */
    public String getReferrer() {
        return this.Referrer;
    }

    /**
     * Set <p>来源筛选</p>
     * @param Referrer <p>来源筛选</p>
     */
    public void setReferrer(String Referrer) {
        this.Referrer = Referrer;
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

    public PreviewTDEMFunnelReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewTDEMFunnelReportRequest(PreviewTDEMFunnelReportRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Steps != null) {
            this.Steps = new String(source.Steps);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
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
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Steps", this.Steps);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Browser", this.Browser);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Referrer", this.Referrer);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

