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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWQuota extends AbstractModel {

    /**
    * <p>Id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>Consumer： 消费者</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源 id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源名字</p><p>如消费者名字</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： 总 token</li><li>Cost： 成本</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>配额周期单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
    */
    @SerializedName("PeriodUnit")
    @Expose
    private String PeriodUnit;

    /**
    * <p>配额</p>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>配额类型，手动配额还是默认配额</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝消费者请求</li><li>AllowOverage： 允许超限</li></ul>
    */
    @SerializedName("ExceedAction")
    @Expose
    private String ExceedAction;

    /**
    * <p>缓存是否计入限额</p><p>枚举值：</p><ul><li>Full： 全量计入</li><li>Exclude： 不计入网关缓存命中部分</li></ul>
    */
    @SerializedName("CacheHitStat")
    @Expose
    private String CacheHitStat;

    /**
    * <p>超限百分比</p><p>默认值：0</p><p>Consumer 的超量百分比，指定模型服务配额默认为 0；ConsumerGroup 固定为 0。</p><p>举例：20，超出设置额度的20%，可用额度为（1+20%）*QuotaLimit。当SetExceedPercentage=true时，条件必选。</p>
    */
    @SerializedName("ExceedPercentage")
    @Expose
    private Long ExceedPercentage;

    /**
    * <p>是否设置超限百分比</p><p>仅 Consumer 的 AllowOverage 场景可用，指定模型服务的配额必须为 false；ConsumerGroup 必须为 false。</p><p>枚举值：</p><ul><li>true： 设置超限百分比</li><li>false： 不设置超限百分比，即不设上限</li></ul><p>默认值：false</p><p>当ExceedAction=AllowOverage时，条件必选。</p>
    */
    @SerializedName("SetExceedPercentage")
    @Expose
    private Boolean SetExceedPercentage;

    /**
    * <p>Consumer粒度某资源对象的配额范围，支持：全部模型服务（all）、指定模型服务（specified）</p><p>枚举值：</p><ul><li>All： 全部</li><li>Specified： 指定</li></ul><p>默认值：All</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>Consumer粒度配额的资源类型，如“模型服务”</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li></ul><p>默认值：ModelService</p>
    */
    @SerializedName("SubResourceType")
    @Expose
    private String SubResourceType;

    /**
    * <p>Consumer粒度配额若支持指定子资源配额，则该项为子资源配额个数</p>
    */
    @SerializedName("SubResourceCount")
    @Expose
    private Long SubResourceCount;

    /**
    * <p>消费者组完整层级路径。仅 ResourceType=ConsumerGroup 返回，未知时为空字符串；Consumer 行省略。</p>
    */
    @SerializedName("ConsumerGroupPath")
    @Expose
    private String ConsumerGroupPath;

    /**
    * <p>消费者组是否有效。仅 ResourceType=ConsumerGroup 返回；组不存在或非 active 时为 false。与配额规则 Enabled 区分，字段省略与 false 含义不同。</p>
    */
    @SerializedName("ConsumerGroupActive")
    @Expose
    private Boolean ConsumerGroupActive;

    /**
    * <p>兼容用量字段。Cost 为向下取整的整数元；TotalToken 单位为 token；RequestCount 单位为次。精确显示优先使用 UsedExact。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * <p>精确使用量。Cost 单位为元，保留 1e-7 元精度；TotalToken 单位为 token；RequestCount 单位为次。旧版插件不提供精确值时省略，调用方可回退使用 Used；该值已换算为业务单位，不要再除以 ValueScale。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedExact")
    @Expose
    private Float UsedExact;

    /**
    * <p>使用率</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
    */
    @SerializedName("UsageRate")
    @Expose
    private Float UsageRate;

    /**
    * <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private String AlarmLevel;

    /**
    * <p>关联消费者密钥数量。ConsumerGroup 规则固定为 0。</p>
    */
    @SerializedName("SecretKeyCount")
    @Expose
    private Long SecretKeyCount;

    /**
     * Get <p>Id</p> 
     * @return Id <p>Id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Id</p>
     * @param Id <p>Id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>Consumer： 消费者</li></ul> 
     * @return ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>Consumer： 消费者</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>Consumer： 消费者</li></ul>
     * @param ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>Consumer： 消费者</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源 id</p> 
     * @return ResourceId <p>资源 id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源 id</p>
     * @param ResourceId <p>资源 id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源名字</p><p>如消费者名字</p> 
     * @return ResourceName <p>资源名字</p><p>如消费者名字</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>资源名字</p><p>如消费者名字</p>
     * @param ResourceName <p>资源名字</p><p>如消费者名字</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： 总 token</li><li>Cost： 成本</li></ul> 
     * @return QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： 总 token</li><li>Cost： 成本</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： 总 token</li><li>Cost： 成本</li></ul>
     * @param QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： 总 token</li><li>Cost： 成本</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>配额周期单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul> 
     * @return PeriodUnit <p>配额周期单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
     */
    public String getPeriodUnit() {
        return this.PeriodUnit;
    }

    /**
     * Set <p>配额周期单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
     * @param PeriodUnit <p>配额周期单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
     */
    public void setPeriodUnit(String PeriodUnit) {
        this.PeriodUnit = PeriodUnit;
    }

    /**
     * Get <p>配额</p> 
     * @return QuotaLimit <p>配额</p>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>配额</p>
     * @param QuotaLimit <p>配额</p>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>启用</p> 
     * @return Enabled <p>启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>启用</p>
     * @param Enabled <p>启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return ModifyTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param ModifyTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>配额类型，手动配额还是默认配额</p> 
     * @return Source <p>配额类型，手动配额还是默认配额</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>配额类型，手动配额还是默认配额</p>
     * @param Source <p>配额类型，手动配额还是默认配额</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝消费者请求</li><li>AllowOverage： 允许超限</li></ul> 
     * @return ExceedAction <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝消费者请求</li><li>AllowOverage： 允许超限</li></ul>
     */
    public String getExceedAction() {
        return this.ExceedAction;
    }

    /**
     * Set <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝消费者请求</li><li>AllowOverage： 允许超限</li></ul>
     * @param ExceedAction <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝消费者请求</li><li>AllowOverage： 允许超限</li></ul>
     */
    public void setExceedAction(String ExceedAction) {
        this.ExceedAction = ExceedAction;
    }

    /**
     * Get <p>缓存是否计入限额</p><p>枚举值：</p><ul><li>Full： 全量计入</li><li>Exclude： 不计入网关缓存命中部分</li></ul> 
     * @return CacheHitStat <p>缓存是否计入限额</p><p>枚举值：</p><ul><li>Full： 全量计入</li><li>Exclude： 不计入网关缓存命中部分</li></ul>
     */
    public String getCacheHitStat() {
        return this.CacheHitStat;
    }

    /**
     * Set <p>缓存是否计入限额</p><p>枚举值：</p><ul><li>Full： 全量计入</li><li>Exclude： 不计入网关缓存命中部分</li></ul>
     * @param CacheHitStat <p>缓存是否计入限额</p><p>枚举值：</p><ul><li>Full： 全量计入</li><li>Exclude： 不计入网关缓存命中部分</li></ul>
     */
    public void setCacheHitStat(String CacheHitStat) {
        this.CacheHitStat = CacheHitStat;
    }

    /**
     * Get <p>超限百分比</p><p>默认值：0</p><p>Consumer 的超量百分比，指定模型服务配额默认为 0；ConsumerGroup 固定为 0。</p><p>举例：20，超出设置额度的20%，可用额度为（1+20%）*QuotaLimit。当SetExceedPercentage=true时，条件必选。</p> 
     * @return ExceedPercentage <p>超限百分比</p><p>默认值：0</p><p>Consumer 的超量百分比，指定模型服务配额默认为 0；ConsumerGroup 固定为 0。</p><p>举例：20，超出设置额度的20%，可用额度为（1+20%）*QuotaLimit。当SetExceedPercentage=true时，条件必选。</p>
     */
    public Long getExceedPercentage() {
        return this.ExceedPercentage;
    }

    /**
     * Set <p>超限百分比</p><p>默认值：0</p><p>Consumer 的超量百分比，指定模型服务配额默认为 0；ConsumerGroup 固定为 0。</p><p>举例：20，超出设置额度的20%，可用额度为（1+20%）*QuotaLimit。当SetExceedPercentage=true时，条件必选。</p>
     * @param ExceedPercentage <p>超限百分比</p><p>默认值：0</p><p>Consumer 的超量百分比，指定模型服务配额默认为 0；ConsumerGroup 固定为 0。</p><p>举例：20，超出设置额度的20%，可用额度为（1+20%）*QuotaLimit。当SetExceedPercentage=true时，条件必选。</p>
     */
    public void setExceedPercentage(Long ExceedPercentage) {
        this.ExceedPercentage = ExceedPercentage;
    }

    /**
     * Get <p>是否设置超限百分比</p><p>仅 Consumer 的 AllowOverage 场景可用，指定模型服务的配额必须为 false；ConsumerGroup 必须为 false。</p><p>枚举值：</p><ul><li>true： 设置超限百分比</li><li>false： 不设置超限百分比，即不设上限</li></ul><p>默认值：false</p><p>当ExceedAction=AllowOverage时，条件必选。</p> 
     * @return SetExceedPercentage <p>是否设置超限百分比</p><p>仅 Consumer 的 AllowOverage 场景可用，指定模型服务的配额必须为 false；ConsumerGroup 必须为 false。</p><p>枚举值：</p><ul><li>true： 设置超限百分比</li><li>false： 不设置超限百分比，即不设上限</li></ul><p>默认值：false</p><p>当ExceedAction=AllowOverage时，条件必选。</p>
     */
    public Boolean getSetExceedPercentage() {
        return this.SetExceedPercentage;
    }

    /**
     * Set <p>是否设置超限百分比</p><p>仅 Consumer 的 AllowOverage 场景可用，指定模型服务的配额必须为 false；ConsumerGroup 必须为 false。</p><p>枚举值：</p><ul><li>true： 设置超限百分比</li><li>false： 不设置超限百分比，即不设上限</li></ul><p>默认值：false</p><p>当ExceedAction=AllowOverage时，条件必选。</p>
     * @param SetExceedPercentage <p>是否设置超限百分比</p><p>仅 Consumer 的 AllowOverage 场景可用，指定模型服务的配额必须为 false；ConsumerGroup 必须为 false。</p><p>枚举值：</p><ul><li>true： 设置超限百分比</li><li>false： 不设置超限百分比，即不设上限</li></ul><p>默认值：false</p><p>当ExceedAction=AllowOverage时，条件必选。</p>
     */
    public void setSetExceedPercentage(Boolean SetExceedPercentage) {
        this.SetExceedPercentage = SetExceedPercentage;
    }

    /**
     * Get <p>Consumer粒度某资源对象的配额范围，支持：全部模型服务（all）、指定模型服务（specified）</p><p>枚举值：</p><ul><li>All： 全部</li><li>Specified： 指定</li></ul><p>默认值：All</p> 
     * @return Scope <p>Consumer粒度某资源对象的配额范围，支持：全部模型服务（all）、指定模型服务（specified）</p><p>枚举值：</p><ul><li>All： 全部</li><li>Specified： 指定</li></ul><p>默认值：All</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Consumer粒度某资源对象的配额范围，支持：全部模型服务（all）、指定模型服务（specified）</p><p>枚举值：</p><ul><li>All： 全部</li><li>Specified： 指定</li></ul><p>默认值：All</p>
     * @param Scope <p>Consumer粒度某资源对象的配额范围，支持：全部模型服务（all）、指定模型服务（specified）</p><p>枚举值：</p><ul><li>All： 全部</li><li>Specified： 指定</li></ul><p>默认值：All</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Consumer粒度配额的资源类型，如“模型服务”</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li></ul><p>默认值：ModelService</p> 
     * @return SubResourceType <p>Consumer粒度配额的资源类型，如“模型服务”</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li></ul><p>默认值：ModelService</p>
     */
    public String getSubResourceType() {
        return this.SubResourceType;
    }

    /**
     * Set <p>Consumer粒度配额的资源类型，如“模型服务”</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li></ul><p>默认值：ModelService</p>
     * @param SubResourceType <p>Consumer粒度配额的资源类型，如“模型服务”</p><p>枚举值：</p><ul><li>ModelService： 模型服务</li></ul><p>默认值：ModelService</p>
     */
    public void setSubResourceType(String SubResourceType) {
        this.SubResourceType = SubResourceType;
    }

    /**
     * Get <p>Consumer粒度配额若支持指定子资源配额，则该项为子资源配额个数</p> 
     * @return SubResourceCount <p>Consumer粒度配额若支持指定子资源配额，则该项为子资源配额个数</p>
     */
    public Long getSubResourceCount() {
        return this.SubResourceCount;
    }

    /**
     * Set <p>Consumer粒度配额若支持指定子资源配额，则该项为子资源配额个数</p>
     * @param SubResourceCount <p>Consumer粒度配额若支持指定子资源配额，则该项为子资源配额个数</p>
     */
    public void setSubResourceCount(Long SubResourceCount) {
        this.SubResourceCount = SubResourceCount;
    }

    /**
     * Get <p>消费者组完整层级路径。仅 ResourceType=ConsumerGroup 返回，未知时为空字符串；Consumer 行省略。</p> 
     * @return ConsumerGroupPath <p>消费者组完整层级路径。仅 ResourceType=ConsumerGroup 返回，未知时为空字符串；Consumer 行省略。</p>
     */
    public String getConsumerGroupPath() {
        return this.ConsumerGroupPath;
    }

    /**
     * Set <p>消费者组完整层级路径。仅 ResourceType=ConsumerGroup 返回，未知时为空字符串；Consumer 行省略。</p>
     * @param ConsumerGroupPath <p>消费者组完整层级路径。仅 ResourceType=ConsumerGroup 返回，未知时为空字符串；Consumer 行省略。</p>
     */
    public void setConsumerGroupPath(String ConsumerGroupPath) {
        this.ConsumerGroupPath = ConsumerGroupPath;
    }

    /**
     * Get <p>消费者组是否有效。仅 ResourceType=ConsumerGroup 返回；组不存在或非 active 时为 false。与配额规则 Enabled 区分，字段省略与 false 含义不同。</p> 
     * @return ConsumerGroupActive <p>消费者组是否有效。仅 ResourceType=ConsumerGroup 返回；组不存在或非 active 时为 false。与配额规则 Enabled 区分，字段省略与 false 含义不同。</p>
     */
    public Boolean getConsumerGroupActive() {
        return this.ConsumerGroupActive;
    }

    /**
     * Set <p>消费者组是否有效。仅 ResourceType=ConsumerGroup 返回；组不存在或非 active 时为 false。与配额规则 Enabled 区分，字段省略与 false 含义不同。</p>
     * @param ConsumerGroupActive <p>消费者组是否有效。仅 ResourceType=ConsumerGroup 返回；组不存在或非 active 时为 false。与配额规则 Enabled 区分，字段省略与 false 含义不同。</p>
     */
    public void setConsumerGroupActive(Boolean ConsumerGroupActive) {
        this.ConsumerGroupActive = ConsumerGroupActive;
    }

    /**
     * Get <p>兼容用量字段。Cost 为向下取整的整数元；TotalToken 单位为 token；RequestCount 单位为次。精确显示优先使用 UsedExact。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。 
     * @return Used <p>兼容用量字段。Cost 为向下取整的整数元；TotalToken 单位为 token；RequestCount 单位为次。精确显示优先使用 UsedExact。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set <p>兼容用量字段。Cost 为向下取整的整数元；TotalToken 单位为 token；RequestCount 单位为次。精确显示优先使用 UsedExact。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     * @param Used <p>兼容用量字段。Cost 为向下取整的整数元；TotalToken 单位为 token；RequestCount 单位为次。精确显示优先使用 UsedExact。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get <p>精确使用量。Cost 单位为元，保留 1e-7 元精度；TotalToken 单位为 token；RequestCount 单位为次。旧版插件不提供精确值时省略，调用方可回退使用 Used；该值已换算为业务单位，不要再除以 ValueScale。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedExact <p>精确使用量。Cost 单位为元，保留 1e-7 元精度；TotalToken 单位为 token；RequestCount 单位为次。旧版插件不提供精确值时省略，调用方可回退使用 Used；该值已换算为业务单位，不要再除以 ValueScale。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUsedExact() {
        return this.UsedExact;
    }

    /**
     * Set <p>精确使用量。Cost 单位为元，保留 1e-7 元精度；TotalToken 单位为 token；RequestCount 单位为次。旧版插件不提供精确值时省略，调用方可回退使用 Used；该值已换算为业务单位，不要再除以 ValueScale。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedExact <p>精确使用量。Cost 单位为元，保留 1e-7 元精度；TotalToken 单位为 token；RequestCount 单位为次。旧版插件不提供精确值时省略，调用方可回退使用 Used；该值已换算为业务单位，不要再除以 ValueScale。</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedExact(Float UsedExact) {
        this.UsedExact = UsedExact;
    }

    /**
     * Get <p>使用率</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。 
     * @return UsageRate <p>使用率</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     */
    public Float getUsageRate() {
        return this.UsageRate;
    }

    /**
     * Set <p>使用率</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     * @param UsageRate <p>使用率</p> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     */
    public void setUsageRate(Float UsageRate) {
        this.UsageRate = UsageRate;
    }

    /**
     * Get <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。 
     * @return AlarmLevel <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     */
    public String getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     * @param AlarmLevel <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul> 仅支持用量查询的实际规则返回；旧 Consumer 网关和 DefaultPolicy 模板可省略。
     */
    public void setAlarmLevel(String AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get <p>关联消费者密钥数量。ConsumerGroup 规则固定为 0。</p> 
     * @return SecretKeyCount <p>关联消费者密钥数量。ConsumerGroup 规则固定为 0。</p>
     */
    public Long getSecretKeyCount() {
        return this.SecretKeyCount;
    }

    /**
     * Set <p>关联消费者密钥数量。ConsumerGroup 规则固定为 0。</p>
     * @param SecretKeyCount <p>关联消费者密钥数量。ConsumerGroup 规则固定为 0。</p>
     */
    public void setSecretKeyCount(Long SecretKeyCount) {
        this.SecretKeyCount = SecretKeyCount;
    }

    public AIGWQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWQuota(AIGWQuota source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.PeriodUnit != null) {
            this.PeriodUnit = new String(source.PeriodUnit);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ExceedAction != null) {
            this.ExceedAction = new String(source.ExceedAction);
        }
        if (source.CacheHitStat != null) {
            this.CacheHitStat = new String(source.CacheHitStat);
        }
        if (source.ExceedPercentage != null) {
            this.ExceedPercentage = new Long(source.ExceedPercentage);
        }
        if (source.SetExceedPercentage != null) {
            this.SetExceedPercentage = new Boolean(source.SetExceedPercentage);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.SubResourceType != null) {
            this.SubResourceType = new String(source.SubResourceType);
        }
        if (source.SubResourceCount != null) {
            this.SubResourceCount = new Long(source.SubResourceCount);
        }
        if (source.ConsumerGroupPath != null) {
            this.ConsumerGroupPath = new String(source.ConsumerGroupPath);
        }
        if (source.ConsumerGroupActive != null) {
            this.ConsumerGroupActive = new Boolean(source.ConsumerGroupActive);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.UsedExact != null) {
            this.UsedExact = new Float(source.UsedExact);
        }
        if (source.UsageRate != null) {
            this.UsageRate = new Float(source.UsageRate);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new String(source.AlarmLevel);
        }
        if (source.SecretKeyCount != null) {
            this.SecretKeyCount = new Long(source.SecretKeyCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "PeriodUnit", this.PeriodUnit);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ExceedAction", this.ExceedAction);
        this.setParamSimple(map, prefix + "CacheHitStat", this.CacheHitStat);
        this.setParamSimple(map, prefix + "ExceedPercentage", this.ExceedPercentage);
        this.setParamSimple(map, prefix + "SetExceedPercentage", this.SetExceedPercentage);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "SubResourceType", this.SubResourceType);
        this.setParamSimple(map, prefix + "SubResourceCount", this.SubResourceCount);
        this.setParamSimple(map, prefix + "ConsumerGroupPath", this.ConsumerGroupPath);
        this.setParamSimple(map, prefix + "ConsumerGroupActive", this.ConsumerGroupActive);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "UsedExact", this.UsedExact);
        this.setParamSimple(map, prefix + "UsageRate", this.UsageRate);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "SecretKeyCount", this.SecretKeyCount);

    }
}

