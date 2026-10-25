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

public class EventView extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>事件 ID</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>视图 ID</p>
    */
    @SerializedName("ViewId")
    @Expose
    private String ViewId;

    /**
    * <p>事件类型</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>事件分类</p>
    */
    @SerializedName("EventCategory")
    @Expose
    private String EventCategory;

    /**
    * <p>事件名</p>
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * <p>时间 RFC3339</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>分区日期 YYYY-MM-DD</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>平台</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>应用版本</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>SDK 版本</p>
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * <p>问题单 ID</p>
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * <p>错误指纹</p>
    */
    @SerializedName("Fingerprint")
    @Expose
    private String Fingerprint;

    /**
    * <p>是否已符号化 0/1</p>
    */
    @SerializedName("IsSourceMapped")
    @Expose
    private Long IsSourceMapped;

    /**
    * <p>异常栈</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionStacks")
    @Expose
    private EventStack [] ExceptionStacks;

    /**
    * <p>原始堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionFrames")
    @Expose
    private EventFrame [] ExceptionFrames;

    /**
    * <p>事件属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventProperties")
    @Expose
    private StringKeyValue [] EventProperties;

    /**
    * <p>会话 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>业务用户 ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>设备 ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>页面 URL</p>
    */
    @SerializedName("PageUrl")
    @Expose
    private String PageUrl;

    /**
    * <p>归一化页面 URL</p>
    */
    @SerializedName("NormalizedPageUrl")
    @Expose
    private String NormalizedPageUrl;

    /**
    * <p>页面标题</p>
    */
    @SerializedName("PageTitle")
    @Expose
    private String PageTitle;

    /**
    * <p>资源 URL</p>
    */
    @SerializedName("ResourceUrl")
    @Expose
    private String ResourceUrl;

    /**
    * <p>资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>目标元素</p>
    */
    @SerializedName("TargetElement")
    @Expose
    private String TargetElement;

    /**
    * <p>目标文本</p>
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * <p>日志级别</p>
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * <p>IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>省份</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * <p>城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>运营商</p>
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * <p>网络类型</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>设备类型</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * <p>浏览器</p>
    */
    @SerializedName("Browser")
    @Expose
    private String Browser;

    /**
    * <p>环境</p>
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * <p>测量值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Measurements")
    @Expose
    private FloatKeyValue [] Measurements;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private StringKeyValue [] Tags;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>事件 ID</p> 
     * @return EventId <p>事件 ID</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件 ID</p>
     * @param EventId <p>事件 ID</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>视图 ID</p> 
     * @return ViewId <p>视图 ID</p>
     */
    public String getViewId() {
        return this.ViewId;
    }

    /**
     * Set <p>视图 ID</p>
     * @param ViewId <p>视图 ID</p>
     */
    public void setViewId(String ViewId) {
        this.ViewId = ViewId;
    }

    /**
     * Get <p>事件类型</p> 
     * @return EventType <p>事件类型</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型</p>
     * @param EventType <p>事件类型</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>事件分类</p> 
     * @return EventCategory <p>事件分类</p>
     */
    public String getEventCategory() {
        return this.EventCategory;
    }

    /**
     * Set <p>事件分类</p>
     * @param EventCategory <p>事件分类</p>
     */
    public void setEventCategory(String EventCategory) {
        this.EventCategory = EventCategory;
    }

    /**
     * Get <p>事件名</p> 
     * @return EventName <p>事件名</p>
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set <p>事件名</p>
     * @param EventName <p>事件名</p>
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get <p>时间 RFC3339</p> 
     * @return Timestamp <p>时间 RFC3339</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>时间 RFC3339</p>
     * @param Timestamp <p>时间 RFC3339</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>分区日期 YYYY-MM-DD</p> 
     * @return Date <p>分区日期 YYYY-MM-DD</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>分区日期 YYYY-MM-DD</p>
     * @param Date <p>分区日期 YYYY-MM-DD</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
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
     * Get <p>SDK 版本</p> 
     * @return SdkVersion <p>SDK 版本</p>
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set <p>SDK 版本</p>
     * @param SdkVersion <p>SDK 版本</p>
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get <p>问题单 ID</p> 
     * @return IssueId <p>问题单 ID</p>
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set <p>问题单 ID</p>
     * @param IssueId <p>问题单 ID</p>
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get <p>错误指纹</p> 
     * @return Fingerprint <p>错误指纹</p>
     */
    public String getFingerprint() {
        return this.Fingerprint;
    }

    /**
     * Set <p>错误指纹</p>
     * @param Fingerprint <p>错误指纹</p>
     */
    public void setFingerprint(String Fingerprint) {
        this.Fingerprint = Fingerprint;
    }

    /**
     * Get <p>是否已符号化 0/1</p> 
     * @return IsSourceMapped <p>是否已符号化 0/1</p>
     */
    public Long getIsSourceMapped() {
        return this.IsSourceMapped;
    }

    /**
     * Set <p>是否已符号化 0/1</p>
     * @param IsSourceMapped <p>是否已符号化 0/1</p>
     */
    public void setIsSourceMapped(Long IsSourceMapped) {
        this.IsSourceMapped = IsSourceMapped;
    }

    /**
     * Get <p>异常栈</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionStacks <p>异常栈</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventStack [] getExceptionStacks() {
        return this.ExceptionStacks;
    }

    /**
     * Set <p>异常栈</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionStacks <p>异常栈</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionStacks(EventStack [] ExceptionStacks) {
        this.ExceptionStacks = ExceptionStacks;
    }

    /**
     * Get <p>原始堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionFrames <p>原始堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventFrame [] getExceptionFrames() {
        return this.ExceptionFrames;
    }

    /**
     * Set <p>原始堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionFrames <p>原始堆栈帧</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionFrames(EventFrame [] ExceptionFrames) {
        this.ExceptionFrames = ExceptionFrames;
    }

    /**
     * Get <p>事件属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventProperties <p>事件属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringKeyValue [] getEventProperties() {
        return this.EventProperties;
    }

    /**
     * Set <p>事件属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventProperties <p>事件属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventProperties(StringKeyValue [] EventProperties) {
        this.EventProperties = EventProperties;
    }

    /**
     * Get <p>会话 ID</p> 
     * @return SessionId <p>会话 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID</p>
     * @param SessionId <p>会话 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>业务用户 ID</p> 
     * @return UserId <p>业务用户 ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>业务用户 ID</p>
     * @param UserId <p>业务用户 ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>设备 ID</p> 
     * @return DeviceId <p>设备 ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备 ID</p>
     * @param DeviceId <p>设备 ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>页面 URL</p> 
     * @return PageUrl <p>页面 URL</p>
     */
    public String getPageUrl() {
        return this.PageUrl;
    }

    /**
     * Set <p>页面 URL</p>
     * @param PageUrl <p>页面 URL</p>
     */
    public void setPageUrl(String PageUrl) {
        this.PageUrl = PageUrl;
    }

    /**
     * Get <p>归一化页面 URL</p> 
     * @return NormalizedPageUrl <p>归一化页面 URL</p>
     */
    public String getNormalizedPageUrl() {
        return this.NormalizedPageUrl;
    }

    /**
     * Set <p>归一化页面 URL</p>
     * @param NormalizedPageUrl <p>归一化页面 URL</p>
     */
    public void setNormalizedPageUrl(String NormalizedPageUrl) {
        this.NormalizedPageUrl = NormalizedPageUrl;
    }

    /**
     * Get <p>页面标题</p> 
     * @return PageTitle <p>页面标题</p>
     */
    public String getPageTitle() {
        return this.PageTitle;
    }

    /**
     * Set <p>页面标题</p>
     * @param PageTitle <p>页面标题</p>
     */
    public void setPageTitle(String PageTitle) {
        this.PageTitle = PageTitle;
    }

    /**
     * Get <p>资源 URL</p> 
     * @return ResourceUrl <p>资源 URL</p>
     */
    public String getResourceUrl() {
        return this.ResourceUrl;
    }

    /**
     * Set <p>资源 URL</p>
     * @param ResourceUrl <p>资源 URL</p>
     */
    public void setResourceUrl(String ResourceUrl) {
        this.ResourceUrl = ResourceUrl;
    }

    /**
     * Get <p>资源类型</p> 
     * @return ResourceType <p>资源类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p>
     * @param ResourceType <p>资源类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>目标元素</p> 
     * @return TargetElement <p>目标元素</p>
     */
    public String getTargetElement() {
        return this.TargetElement;
    }

    /**
     * Set <p>目标元素</p>
     * @param TargetElement <p>目标元素</p>
     */
    public void setTargetElement(String TargetElement) {
        this.TargetElement = TargetElement;
    }

    /**
     * Get <p>目标文本</p> 
     * @return TargetText <p>目标文本</p>
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set <p>目标文本</p>
     * @param TargetText <p>目标文本</p>
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get <p>日志级别</p> 
     * @return LogLevel <p>日志级别</p>
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set <p>日志级别</p>
     * @param LogLevel <p>日志级别</p>
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get <p>IP</p> 
     * @return Ip <p>IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP</p>
     * @param Ip <p>IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
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
     * Get <p>省份</p> 
     * @return Province <p>省份</p>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set <p>省份</p>
     * @param Province <p>省份</p>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get <p>城市</p> 
     * @return City <p>城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>城市</p>
     * @param City <p>城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>运营商</p> 
     * @return Isp <p>运营商</p>
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set <p>运营商</p>
     * @param Isp <p>运营商</p>
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
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
     * Get <p>操作系统</p> 
     * @return Os <p>操作系统</p>
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set <p>操作系统</p>
     * @param Os <p>操作系统</p>
     */
    public void setOs(String Os) {
        this.Os = Os;
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
     * Get <p>环境</p> 
     * @return Environment <p>环境</p>
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set <p>环境</p>
     * @param Environment <p>环境</p>
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get <p>测量值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Measurements <p>测量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FloatKeyValue [] getMeasurements() {
        return this.Measurements;
    }

    /**
     * Set <p>测量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Measurements <p>测量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMeasurements(FloatKeyValue [] Measurements) {
        this.Measurements = Measurements;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringKeyValue [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(StringKeyValue [] Tags) {
        this.Tags = Tags;
    }

    public EventView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventView(EventView source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.ViewId != null) {
            this.ViewId = new String(source.ViewId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventCategory != null) {
            this.EventCategory = new String(source.EventCategory);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.Fingerprint != null) {
            this.Fingerprint = new String(source.Fingerprint);
        }
        if (source.IsSourceMapped != null) {
            this.IsSourceMapped = new Long(source.IsSourceMapped);
        }
        if (source.ExceptionStacks != null) {
            this.ExceptionStacks = new EventStack[source.ExceptionStacks.length];
            for (int i = 0; i < source.ExceptionStacks.length; i++) {
                this.ExceptionStacks[i] = new EventStack(source.ExceptionStacks[i]);
            }
        }
        if (source.ExceptionFrames != null) {
            this.ExceptionFrames = new EventFrame[source.ExceptionFrames.length];
            for (int i = 0; i < source.ExceptionFrames.length; i++) {
                this.ExceptionFrames[i] = new EventFrame(source.ExceptionFrames[i]);
            }
        }
        if (source.EventProperties != null) {
            this.EventProperties = new StringKeyValue[source.EventProperties.length];
            for (int i = 0; i < source.EventProperties.length; i++) {
                this.EventProperties[i] = new StringKeyValue(source.EventProperties[i]);
            }
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.PageUrl != null) {
            this.PageUrl = new String(source.PageUrl);
        }
        if (source.NormalizedPageUrl != null) {
            this.NormalizedPageUrl = new String(source.NormalizedPageUrl);
        }
        if (source.PageTitle != null) {
            this.PageTitle = new String(source.PageTitle);
        }
        if (source.ResourceUrl != null) {
            this.ResourceUrl = new String(source.ResourceUrl);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.TargetElement != null) {
            this.TargetElement = new String(source.TargetElement);
        }
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.Browser != null) {
            this.Browser = new String(source.Browser);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.Measurements != null) {
            this.Measurements = new FloatKeyValue[source.Measurements.length];
            for (int i = 0; i < source.Measurements.length; i++) {
                this.Measurements[i] = new FloatKeyValue(source.Measurements[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new StringKeyValue[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKeyValue(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ViewId", this.ViewId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventCategory", this.EventCategory);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "Fingerprint", this.Fingerprint);
        this.setParamSimple(map, prefix + "IsSourceMapped", this.IsSourceMapped);
        this.setParamArrayObj(map, prefix + "ExceptionStacks.", this.ExceptionStacks);
        this.setParamArrayObj(map, prefix + "ExceptionFrames.", this.ExceptionFrames);
        this.setParamArrayObj(map, prefix + "EventProperties.", this.EventProperties);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "PageUrl", this.PageUrl);
        this.setParamSimple(map, prefix + "NormalizedPageUrl", this.NormalizedPageUrl);
        this.setParamSimple(map, prefix + "PageTitle", this.PageTitle);
        this.setParamSimple(map, prefix + "ResourceUrl", this.ResourceUrl);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "TargetElement", this.TargetElement);
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Browser", this.Browser);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamArrayObj(map, prefix + "Measurements.", this.Measurements);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

