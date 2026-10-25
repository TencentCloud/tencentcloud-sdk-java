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

public class DescribeTDEMEventRankRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>排行类型：error/api/resource/api_page/resource_page/api_status/api_status_top/resource_status/tag；exception_dimension 为异常维度同源统计，使用 ExceptionDistribution 返回结果。</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>旧 Kind 保持既有错误类型过滤规则；Kind=exception_dimension 标签模式必填，允许 js_error、promise_error、api_error、resource_error、blank_screen、log、native_crash、crash、no_response、lag_detected、app_launch。合法重复值去重，未知值拒绝；普通维度模式不传。</p>
    */
    @SerializedName("EventTypes")
    @Expose
    private String [] EventTypes;

    /**
    * <p>旧 Kind=tag 保持既有标签查询；Kind=exception_dimension 标签模式必填，与 GroupBy 二选一。使用既有标签名规范，长度 1–64，允许字母数字及 _-.；标签值保留原始内容。</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>返回条数，上限100。旧 Kind 缺省50；Kind=exception_dimension 缺省100，显式值为1–100，限制完整归一化维度行数，不裁剪分类向量。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>旧 Kind 可选粒度5m/1h/1d；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * <p>筛选条件 JSON 字符串，走 events 表白名单</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>旧 Kind 耗时口径 avg/p50/p75/p95/p99；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
    */
    @SerializedName("CostType")
    @Expose
    private String CostType;

    /**
    * <p>异常分布的聚合维度，仅 Kind=exception_dimension 的普通维度模式使用且必填。标签模式只传 TagKey，不传 GroupBy。</p><p>枚举值：</p><ul><li>device_type： 设备型号</li><li>os： 操作系统</li><li>browser： 浏览器</li><li>app_version： 应用版本</li><li>province： 省份</li><li>platform： 平台</li><li>network_type： 网络类型</li></ul>
    */
    @SerializedName("GroupBy")
    @Expose
    private String GroupBy;

    /**
    * <p>仅 Kind=exception_dimension 普通维度模式必填。允许 web、android、ios，须与应用平台及 CategoryKeys 目录一致。标签模式不传。</p>
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * <p>仅 Kind=exception_dimension 普通维度模式必填，为页面实际有效的异常目录 key 非空去重集合。仅接受对应 ProjectType 的固定目录，包含项须同时选择父项；未知、重复、空目录及互斥参数组合返回 InvalidParameter。标签模式不传。</p>
    */
    @SerializedName("CategoryKeys")
    @Expose
    private String [] CategoryKeys;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间 Unix 毫秒（必填）</p> 
     * @return StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间 Unix 毫秒（必填）</p>
     * @param StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间 Unix 毫秒（必填）</p> 
     * @return EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间 Unix 毫秒（必填）</p>
     * @param EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>排行类型：error/api/resource/api_page/resource_page/api_status/api_status_top/resource_status/tag；exception_dimension 为异常维度同源统计，使用 ExceptionDistribution 返回结果。</p> 
     * @return Kind <p>排行类型：error/api/resource/api_page/resource_page/api_status/api_status_top/resource_status/tag；exception_dimension 为异常维度同源统计，使用 ExceptionDistribution 返回结果。</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>排行类型：error/api/resource/api_page/resource_page/api_status/api_status_top/resource_status/tag；exception_dimension 为异常维度同源统计，使用 ExceptionDistribution 返回结果。</p>
     * @param Kind <p>排行类型：error/api/resource/api_page/resource_page/api_status/api_status_top/resource_status/tag；exception_dimension 为异常维度同源统计，使用 ExceptionDistribution 返回结果。</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>旧 Kind 保持既有错误类型过滤规则；Kind=exception_dimension 标签模式必填，允许 js_error、promise_error、api_error、resource_error、blank_screen、log、native_crash、crash、no_response、lag_detected、app_launch。合法重复值去重，未知值拒绝；普通维度模式不传。</p> 
     * @return EventTypes <p>旧 Kind 保持既有错误类型过滤规则；Kind=exception_dimension 标签模式必填，允许 js_error、promise_error、api_error、resource_error、blank_screen、log、native_crash、crash、no_response、lag_detected、app_launch。合法重复值去重，未知值拒绝；普通维度模式不传。</p>
     */
    public String [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set <p>旧 Kind 保持既有错误类型过滤规则；Kind=exception_dimension 标签模式必填，允许 js_error、promise_error、api_error、resource_error、blank_screen、log、native_crash、crash、no_response、lag_detected、app_launch。合法重复值去重，未知值拒绝；普通维度模式不传。</p>
     * @param EventTypes <p>旧 Kind 保持既有错误类型过滤规则；Kind=exception_dimension 标签模式必填，允许 js_error、promise_error、api_error、resource_error、blank_screen、log、native_crash、crash、no_response、lag_detected、app_launch。合法重复值去重，未知值拒绝；普通维度模式不传。</p>
     */
    public void setEventTypes(String [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get <p>旧 Kind=tag 保持既有标签查询；Kind=exception_dimension 标签模式必填，与 GroupBy 二选一。使用既有标签名规范，长度 1–64，允许字母数字及 _-.；标签值保留原始内容。</p> 
     * @return TagKey <p>旧 Kind=tag 保持既有标签查询；Kind=exception_dimension 标签模式必填，与 GroupBy 二选一。使用既有标签名规范，长度 1–64，允许字母数字及 _-.；标签值保留原始内容。</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>旧 Kind=tag 保持既有标签查询；Kind=exception_dimension 标签模式必填，与 GroupBy 二选一。使用既有标签名规范，长度 1–64，允许字母数字及 _-.；标签值保留原始内容。</p>
     * @param TagKey <p>旧 Kind=tag 保持既有标签查询；Kind=exception_dimension 标签模式必填，与 GroupBy 二选一。使用既有标签名规范，长度 1–64，允许字母数字及 _-.；标签值保留原始内容。</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>返回条数，上限100。旧 Kind 缺省50；Kind=exception_dimension 缺省100，显式值为1–100，限制完整归一化维度行数，不裁剪分类向量。</p> 
     * @return Limit <p>返回条数，上限100。旧 Kind 缺省50；Kind=exception_dimension 缺省100，显式值为1–100，限制完整归一化维度行数，不裁剪分类向量。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回条数，上限100。旧 Kind 缺省50；Kind=exception_dimension 缺省100，显式值为1–100，限制完整归一化维度行数，不裁剪分类向量。</p>
     * @param Limit <p>返回条数，上限100。旧 Kind 缺省50；Kind=exception_dimension 缺省100，显式值为1–100，限制完整归一化维度行数，不裁剪分类向量。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>旧 Kind 可选粒度5m/1h/1d；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p> 
     * @return Granularity <p>旧 Kind 可选粒度5m/1h/1d；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set <p>旧 Kind 可选粒度5m/1h/1d；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
     * @param Granularity <p>旧 Kind 可选粒度5m/1h/1d；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get <p>筛选条件 JSON 字符串，走 events 表白名单</p> 
     * @return Filters <p>筛选条件 JSON 字符串，走 events 表白名单</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件 JSON 字符串，走 events 表白名单</p>
     * @param Filters <p>筛选条件 JSON 字符串，走 events 表白名单</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>旧 Kind 耗时口径 avg/p50/p75/p95/p99；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p> 
     * @return CostType <p>旧 Kind 耗时口径 avg/p50/p75/p95/p99；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
     */
    public String getCostType() {
        return this.CostType;
    }

    /**
     * Set <p>旧 Kind 耗时口径 avg/p50/p75/p95/p99；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
     * @param CostType <p>旧 Kind 耗时口径 avg/p50/p75/p95/p99；Kind=exception_dimension 不支持，传非空值返回 InvalidParameter。</p>
     */
    public void setCostType(String CostType) {
        this.CostType = CostType;
    }

    /**
     * Get <p>异常分布的聚合维度，仅 Kind=exception_dimension 的普通维度模式使用且必填。标签模式只传 TagKey，不传 GroupBy。</p><p>枚举值：</p><ul><li>device_type： 设备型号</li><li>os： 操作系统</li><li>browser： 浏览器</li><li>app_version： 应用版本</li><li>province： 省份</li><li>platform： 平台</li><li>network_type： 网络类型</li></ul> 
     * @return GroupBy <p>异常分布的聚合维度，仅 Kind=exception_dimension 的普通维度模式使用且必填。标签模式只传 TagKey，不传 GroupBy。</p><p>枚举值：</p><ul><li>device_type： 设备型号</li><li>os： 操作系统</li><li>browser： 浏览器</li><li>app_version： 应用版本</li><li>province： 省份</li><li>platform： 平台</li><li>network_type： 网络类型</li></ul>
     */
    public String getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set <p>异常分布的聚合维度，仅 Kind=exception_dimension 的普通维度模式使用且必填。标签模式只传 TagKey，不传 GroupBy。</p><p>枚举值：</p><ul><li>device_type： 设备型号</li><li>os： 操作系统</li><li>browser： 浏览器</li><li>app_version： 应用版本</li><li>province： 省份</li><li>platform： 平台</li><li>network_type： 网络类型</li></ul>
     * @param GroupBy <p>异常分布的聚合维度，仅 Kind=exception_dimension 的普通维度模式使用且必填。标签模式只传 TagKey，不传 GroupBy。</p><p>枚举值：</p><ul><li>device_type： 设备型号</li><li>os： 操作系统</li><li>browser： 浏览器</li><li>app_version： 应用版本</li><li>province： 省份</li><li>platform： 平台</li><li>network_type： 网络类型</li></ul>
     */
    public void setGroupBy(String GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get <p>仅 Kind=exception_dimension 普通维度模式必填。允许 web、android、ios，须与应用平台及 CategoryKeys 目录一致。标签模式不传。</p> 
     * @return ProjectType <p>仅 Kind=exception_dimension 普通维度模式必填。允许 web、android、ios，须与应用平台及 CategoryKeys 目录一致。标签模式不传。</p>
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set <p>仅 Kind=exception_dimension 普通维度模式必填。允许 web、android、ios，须与应用平台及 CategoryKeys 目录一致。标签模式不传。</p>
     * @param ProjectType <p>仅 Kind=exception_dimension 普通维度模式必填。允许 web、android、ios，须与应用平台及 CategoryKeys 目录一致。标签模式不传。</p>
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get <p>仅 Kind=exception_dimension 普通维度模式必填，为页面实际有效的异常目录 key 非空去重集合。仅接受对应 ProjectType 的固定目录，包含项须同时选择父项；未知、重复、空目录及互斥参数组合返回 InvalidParameter。标签模式不传。</p> 
     * @return CategoryKeys <p>仅 Kind=exception_dimension 普通维度模式必填，为页面实际有效的异常目录 key 非空去重集合。仅接受对应 ProjectType 的固定目录，包含项须同时选择父项；未知、重复、空目录及互斥参数组合返回 InvalidParameter。标签模式不传。</p>
     */
    public String [] getCategoryKeys() {
        return this.CategoryKeys;
    }

    /**
     * Set <p>仅 Kind=exception_dimension 普通维度模式必填，为页面实际有效的异常目录 key 非空去重集合。仅接受对应 ProjectType 的固定目录，包含项须同时选择父项；未知、重复、空目录及互斥参数组合返回 InvalidParameter。标签模式不传。</p>
     * @param CategoryKeys <p>仅 Kind=exception_dimension 普通维度模式必填，为页面实际有效的异常目录 key 非空去重集合。仅接受对应 ProjectType 的固定目录，包含项须同时选择父项；未知、重复、空目录及互斥参数组合返回 InvalidParameter。标签模式不传。</p>
     */
    public void setCategoryKeys(String [] CategoryKeys) {
        this.CategoryKeys = CategoryKeys;
    }

    public DescribeTDEMEventRankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMEventRankRequest(DescribeTDEMEventRankRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.EventTypes != null) {
            this.EventTypes = new String[source.EventTypes.length];
            for (int i = 0; i < source.EventTypes.length; i++) {
                this.EventTypes[i] = new String(source.EventTypes[i]);
            }
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.CostType != null) {
            this.CostType = new String(source.CostType);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String(source.GroupBy);
        }
        if (source.ProjectType != null) {
            this.ProjectType = new String(source.ProjectType);
        }
        if (source.CategoryKeys != null) {
            this.CategoryKeys = new String[source.CategoryKeys.length];
            for (int i = 0; i < source.CategoryKeys.length; i++) {
                this.CategoryKeys[i] = new String(source.CategoryKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamArraySimple(map, prefix + "EventTypes.", this.EventTypes);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "CostType", this.CostType);
        this.setParamSimple(map, prefix + "GroupBy", this.GroupBy);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamArraySimple(map, prefix + "CategoryKeys.", this.CategoryKeys);

    }
}

