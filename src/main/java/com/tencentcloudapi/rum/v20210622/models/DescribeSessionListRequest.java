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

public class DescribeSessionListRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间</p><p>单位：毫秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p><p>单位：毫秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>session类型</p><p>枚举值：</p><ul><li>all： 所有</li><li>error： 错</li><li>slow： 慢</li></ul>
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * <p>页面号</p><p>默认值：1</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每一页的数量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方式，ASC或DESC</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>用户id</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>session id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>设备类型</p>
    */
    @SerializedName("DeviceTypes")
    @Expose
    private String [] DeviceTypes;

    /**
    * <p>浏览器</p>
    */
    @SerializedName("Browsers")
    @Expose
    private String [] Browsers;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("OSList")
    @Expose
    private String [] OSList;

    /**
    * <p>平台</p>
    */
    @SerializedName("Platforms")
    @Expose
    private String [] Platforms;

    /**
    * <p>应用版本</p>
    */
    @SerializedName("AppVersions")
    @Expose
    private String [] AppVersions;

    /**
    * <p>国家</p>
    */
    @SerializedName("Countries")
    @Expose
    private String [] Countries;

    /**
    * <p>是否有挣扎事件</p>
    */
    @SerializedName("HasStruggle")
    @Expose
    private Boolean HasStruggle;

    /**
    * <p>挣扎等级</p>
    */
    @SerializedName("StruggleRanks")
    @Expose
    private String [] StruggleRanks;

    /**
    * <p>挣扎事件类型</p>
    */
    @SerializedName("StruggleTypes")
    @Expose
    private String [] StruggleTypes;

    /**
    * <p>是否有错误</p>
    */
    @SerializedName("HasError")
    @Expose
    private Boolean HasError;

    /**
    * <p>访问页面</p>
    */
    @SerializedName("VisitedPage")
    @Expose
    private String VisitedPage;

    /**
    * <p>包含事件</p>
    */
    @SerializedName("ContainsEvent")
    @Expose
    private String ContainsEvent;

    /**
    * <p>最小持续时间</p>
    */
    @SerializedName("MinDuration")
    @Expose
    private Long MinDuration;

    /**
    * <p>最大持续时间</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * <p>性能过滤</p>
    */
    @SerializedName("PerfFilter")
    @Expose
    private String PerfFilter;

    /**
    * <p>地区</p>
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
    * <p>环境</p>
    */
    @SerializedName("Environments")
    @Expose
    private String [] Environments;

    /**
    * <p>筛选</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>旅程起点页面。可选。不传表示不过滤。</p>
    */
    @SerializedName("StartPage")
    @Expose
    private String StartPage;

    /**
    * <p>旅程终点页面。可选。不传表示不过滤。</p>
    */
    @SerializedName("EndPage")
    @Expose
    private String EndPage;

    /**
    * <p>旅程筛选条件 JSON 字符串，格式与 Filters 相同：[{Key,Op,Values}]。可选。不传表示不过滤。</p>
    */
    @SerializedName("JourneyFilters")
    @Expose
    private String JourneyFilters;

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
     * Get <p>开始时间</p><p>单位：毫秒</p> 
     * @return StartTime <p>开始时间</p><p>单位：毫秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p><p>单位：毫秒</p>
     * @param StartTime <p>开始时间</p><p>单位：毫秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p><p>单位：毫秒</p> 
     * @return EndTime <p>结束时间</p><p>单位：毫秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p><p>单位：毫秒</p>
     * @param EndTime <p>结束时间</p><p>单位：毫秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>session类型</p><p>枚举值：</p><ul><li>all： 所有</li><li>error： 错</li><li>slow： 慢</li></ul> 
     * @return SessionType <p>session类型</p><p>枚举值：</p><ul><li>all： 所有</li><li>error： 错</li><li>slow： 慢</li></ul>
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>session类型</p><p>枚举值：</p><ul><li>all： 所有</li><li>error： 错</li><li>slow： 慢</li></ul>
     * @param SessionType <p>session类型</p><p>枚举值：</p><ul><li>all： 所有</li><li>error： 错</li><li>slow： 慢</li></ul>
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>页面号</p><p>默认值：1</p> 
     * @return Page <p>页面号</p><p>默认值：1</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页面号</p><p>默认值：1</p>
     * @param Page <p>页面号</p><p>默认值：1</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每一页的数量</p> 
     * @return PageSize <p>每一页的数量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每一页的数量</p>
     * @param PageSize <p>每一页的数量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>排序字段</p> 
     * @return SortBy <p>排序字段</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段</p>
     * @param SortBy <p>排序字段</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方式，ASC或DESC</p> 
     * @return SortOrder <p>排序方式，ASC或DESC</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序方式，ASC或DESC</p>
     * @param SortOrder <p>排序方式，ASC或DESC</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>用户id</p> 
     * @return UserId <p>用户id</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户id</p>
     * @param UserId <p>用户id</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>session id</p> 
     * @return SessionId <p>session id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>session id</p>
     * @param SessionId <p>session id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>设备类型</p> 
     * @return DeviceTypes <p>设备类型</p>
     */
    public String [] getDeviceTypes() {
        return this.DeviceTypes;
    }

    /**
     * Set <p>设备类型</p>
     * @param DeviceTypes <p>设备类型</p>
     */
    public void setDeviceTypes(String [] DeviceTypes) {
        this.DeviceTypes = DeviceTypes;
    }

    /**
     * Get <p>浏览器</p> 
     * @return Browsers <p>浏览器</p>
     */
    public String [] getBrowsers() {
        return this.Browsers;
    }

    /**
     * Set <p>浏览器</p>
     * @param Browsers <p>浏览器</p>
     */
    public void setBrowsers(String [] Browsers) {
        this.Browsers = Browsers;
    }

    /**
     * Get <p>操作系统</p> 
     * @return OSList <p>操作系统</p>
     */
    public String [] getOSList() {
        return this.OSList;
    }

    /**
     * Set <p>操作系统</p>
     * @param OSList <p>操作系统</p>
     */
    public void setOSList(String [] OSList) {
        this.OSList = OSList;
    }

    /**
     * Get <p>平台</p> 
     * @return Platforms <p>平台</p>
     */
    public String [] getPlatforms() {
        return this.Platforms;
    }

    /**
     * Set <p>平台</p>
     * @param Platforms <p>平台</p>
     */
    public void setPlatforms(String [] Platforms) {
        this.Platforms = Platforms;
    }

    /**
     * Get <p>应用版本</p> 
     * @return AppVersions <p>应用版本</p>
     */
    public String [] getAppVersions() {
        return this.AppVersions;
    }

    /**
     * Set <p>应用版本</p>
     * @param AppVersions <p>应用版本</p>
     */
    public void setAppVersions(String [] AppVersions) {
        this.AppVersions = AppVersions;
    }

    /**
     * Get <p>国家</p> 
     * @return Countries <p>国家</p>
     */
    public String [] getCountries() {
        return this.Countries;
    }

    /**
     * Set <p>国家</p>
     * @param Countries <p>国家</p>
     */
    public void setCountries(String [] Countries) {
        this.Countries = Countries;
    }

    /**
     * Get <p>是否有挣扎事件</p> 
     * @return HasStruggle <p>是否有挣扎事件</p>
     */
    public Boolean getHasStruggle() {
        return this.HasStruggle;
    }

    /**
     * Set <p>是否有挣扎事件</p>
     * @param HasStruggle <p>是否有挣扎事件</p>
     */
    public void setHasStruggle(Boolean HasStruggle) {
        this.HasStruggle = HasStruggle;
    }

    /**
     * Get <p>挣扎等级</p> 
     * @return StruggleRanks <p>挣扎等级</p>
     */
    public String [] getStruggleRanks() {
        return this.StruggleRanks;
    }

    /**
     * Set <p>挣扎等级</p>
     * @param StruggleRanks <p>挣扎等级</p>
     */
    public void setStruggleRanks(String [] StruggleRanks) {
        this.StruggleRanks = StruggleRanks;
    }

    /**
     * Get <p>挣扎事件类型</p> 
     * @return StruggleTypes <p>挣扎事件类型</p>
     */
    public String [] getStruggleTypes() {
        return this.StruggleTypes;
    }

    /**
     * Set <p>挣扎事件类型</p>
     * @param StruggleTypes <p>挣扎事件类型</p>
     */
    public void setStruggleTypes(String [] StruggleTypes) {
        this.StruggleTypes = StruggleTypes;
    }

    /**
     * Get <p>是否有错误</p> 
     * @return HasError <p>是否有错误</p>
     */
    public Boolean getHasError() {
        return this.HasError;
    }

    /**
     * Set <p>是否有错误</p>
     * @param HasError <p>是否有错误</p>
     */
    public void setHasError(Boolean HasError) {
        this.HasError = HasError;
    }

    /**
     * Get <p>访问页面</p> 
     * @return VisitedPage <p>访问页面</p>
     */
    public String getVisitedPage() {
        return this.VisitedPage;
    }

    /**
     * Set <p>访问页面</p>
     * @param VisitedPage <p>访问页面</p>
     */
    public void setVisitedPage(String VisitedPage) {
        this.VisitedPage = VisitedPage;
    }

    /**
     * Get <p>包含事件</p> 
     * @return ContainsEvent <p>包含事件</p>
     */
    public String getContainsEvent() {
        return this.ContainsEvent;
    }

    /**
     * Set <p>包含事件</p>
     * @param ContainsEvent <p>包含事件</p>
     */
    public void setContainsEvent(String ContainsEvent) {
        this.ContainsEvent = ContainsEvent;
    }

    /**
     * Get <p>最小持续时间</p> 
     * @return MinDuration <p>最小持续时间</p>
     */
    public Long getMinDuration() {
        return this.MinDuration;
    }

    /**
     * Set <p>最小持续时间</p>
     * @param MinDuration <p>最小持续时间</p>
     */
    public void setMinDuration(Long MinDuration) {
        this.MinDuration = MinDuration;
    }

    /**
     * Get <p>最大持续时间</p> 
     * @return MaxDuration <p>最大持续时间</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>最大持续时间</p>
     * @param MaxDuration <p>最大持续时间</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get <p>性能过滤</p> 
     * @return PerfFilter <p>性能过滤</p>
     */
    public String getPerfFilter() {
        return this.PerfFilter;
    }

    /**
     * Set <p>性能过滤</p>
     * @param PerfFilter <p>性能过滤</p>
     */
    public void setPerfFilter(String PerfFilter) {
        this.PerfFilter = PerfFilter;
    }

    /**
     * Get <p>地区</p> 
     * @return Regions <p>地区</p>
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>地区</p>
     * @param Regions <p>地区</p>
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>环境</p> 
     * @return Environments <p>环境</p>
     */
    public String [] getEnvironments() {
        return this.Environments;
    }

    /**
     * Set <p>环境</p>
     * @param Environments <p>环境</p>
     */
    public void setEnvironments(String [] Environments) {
        this.Environments = Environments;
    }

    /**
     * Get <p>筛选</p> 
     * @return Filters <p>筛选</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选</p>
     * @param Filters <p>筛选</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>旅程起点页面。可选。不传表示不过滤。</p> 
     * @return StartPage <p>旅程起点页面。可选。不传表示不过滤。</p>
     */
    public String getStartPage() {
        return this.StartPage;
    }

    /**
     * Set <p>旅程起点页面。可选。不传表示不过滤。</p>
     * @param StartPage <p>旅程起点页面。可选。不传表示不过滤。</p>
     */
    public void setStartPage(String StartPage) {
        this.StartPage = StartPage;
    }

    /**
     * Get <p>旅程终点页面。可选。不传表示不过滤。</p> 
     * @return EndPage <p>旅程终点页面。可选。不传表示不过滤。</p>
     */
    public String getEndPage() {
        return this.EndPage;
    }

    /**
     * Set <p>旅程终点页面。可选。不传表示不过滤。</p>
     * @param EndPage <p>旅程终点页面。可选。不传表示不过滤。</p>
     */
    public void setEndPage(String EndPage) {
        this.EndPage = EndPage;
    }

    /**
     * Get <p>旅程筛选条件 JSON 字符串，格式与 Filters 相同：[{Key,Op,Values}]。可选。不传表示不过滤。</p> 
     * @return JourneyFilters <p>旅程筛选条件 JSON 字符串，格式与 Filters 相同：[{Key,Op,Values}]。可选。不传表示不过滤。</p>
     */
    public String getJourneyFilters() {
        return this.JourneyFilters;
    }

    /**
     * Set <p>旅程筛选条件 JSON 字符串，格式与 Filters 相同：[{Key,Op,Values}]。可选。不传表示不过滤。</p>
     * @param JourneyFilters <p>旅程筛选条件 JSON 字符串，格式与 Filters 相同：[{Key,Op,Values}]。可选。不传表示不过滤。</p>
     */
    public void setJourneyFilters(String JourneyFilters) {
        this.JourneyFilters = JourneyFilters;
    }

    public DescribeSessionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionListRequest(DescribeSessionListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.DeviceTypes != null) {
            this.DeviceTypes = new String[source.DeviceTypes.length];
            for (int i = 0; i < source.DeviceTypes.length; i++) {
                this.DeviceTypes[i] = new String(source.DeviceTypes[i]);
            }
        }
        if (source.Browsers != null) {
            this.Browsers = new String[source.Browsers.length];
            for (int i = 0; i < source.Browsers.length; i++) {
                this.Browsers[i] = new String(source.Browsers[i]);
            }
        }
        if (source.OSList != null) {
            this.OSList = new String[source.OSList.length];
            for (int i = 0; i < source.OSList.length; i++) {
                this.OSList[i] = new String(source.OSList[i]);
            }
        }
        if (source.Platforms != null) {
            this.Platforms = new String[source.Platforms.length];
            for (int i = 0; i < source.Platforms.length; i++) {
                this.Platforms[i] = new String(source.Platforms[i]);
            }
        }
        if (source.AppVersions != null) {
            this.AppVersions = new String[source.AppVersions.length];
            for (int i = 0; i < source.AppVersions.length; i++) {
                this.AppVersions[i] = new String(source.AppVersions[i]);
            }
        }
        if (source.Countries != null) {
            this.Countries = new String[source.Countries.length];
            for (int i = 0; i < source.Countries.length; i++) {
                this.Countries[i] = new String(source.Countries[i]);
            }
        }
        if (source.HasStruggle != null) {
            this.HasStruggle = new Boolean(source.HasStruggle);
        }
        if (source.StruggleRanks != null) {
            this.StruggleRanks = new String[source.StruggleRanks.length];
            for (int i = 0; i < source.StruggleRanks.length; i++) {
                this.StruggleRanks[i] = new String(source.StruggleRanks[i]);
            }
        }
        if (source.StruggleTypes != null) {
            this.StruggleTypes = new String[source.StruggleTypes.length];
            for (int i = 0; i < source.StruggleTypes.length; i++) {
                this.StruggleTypes[i] = new String(source.StruggleTypes[i]);
            }
        }
        if (source.HasError != null) {
            this.HasError = new Boolean(source.HasError);
        }
        if (source.VisitedPage != null) {
            this.VisitedPage = new String(source.VisitedPage);
        }
        if (source.ContainsEvent != null) {
            this.ContainsEvent = new String(source.ContainsEvent);
        }
        if (source.MinDuration != null) {
            this.MinDuration = new Long(source.MinDuration);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.PerfFilter != null) {
            this.PerfFilter = new String(source.PerfFilter);
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
        if (source.Environments != null) {
            this.Environments = new String[source.Environments.length];
            for (int i = 0; i < source.Environments.length; i++) {
                this.Environments[i] = new String(source.Environments[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.StartPage != null) {
            this.StartPage = new String(source.StartPage);
        }
        if (source.EndPage != null) {
            this.EndPage = new String(source.EndPage);
        }
        if (source.JourneyFilters != null) {
            this.JourneyFilters = new String(source.JourneyFilters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArraySimple(map, prefix + "DeviceTypes.", this.DeviceTypes);
        this.setParamArraySimple(map, prefix + "Browsers.", this.Browsers);
        this.setParamArraySimple(map, prefix + "OSList.", this.OSList);
        this.setParamArraySimple(map, prefix + "Platforms.", this.Platforms);
        this.setParamArraySimple(map, prefix + "AppVersions.", this.AppVersions);
        this.setParamArraySimple(map, prefix + "Countries.", this.Countries);
        this.setParamSimple(map, prefix + "HasStruggle", this.HasStruggle);
        this.setParamArraySimple(map, prefix + "StruggleRanks.", this.StruggleRanks);
        this.setParamArraySimple(map, prefix + "StruggleTypes.", this.StruggleTypes);
        this.setParamSimple(map, prefix + "HasError", this.HasError);
        this.setParamSimple(map, prefix + "VisitedPage", this.VisitedPage);
        this.setParamSimple(map, prefix + "ContainsEvent", this.ContainsEvent);
        this.setParamSimple(map, prefix + "MinDuration", this.MinDuration);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamSimple(map, prefix + "PerfFilter", this.PerfFilter);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);
        this.setParamArraySimple(map, prefix + "Environments.", this.Environments);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "StartPage", this.StartPage);
        this.setParamSimple(map, prefix + "EndPage", this.EndPage);
        this.setParamSimple(map, prefix + "JourneyFilters", this.JourneyFilters);

    }
}

