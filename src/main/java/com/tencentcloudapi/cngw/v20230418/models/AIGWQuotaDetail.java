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

public class AIGWQuotaDetail extends AbstractModel {

    /**
    * <p>id</p>
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
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源名字</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： token总数</li><li>Cost： 成本</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>配额单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
    */
    @SerializedName("PeriodUnit")
    @Expose
    private String PeriodUnit;

    /**
    * <p>配额</p><p>如果是成本则数值单位是分，如 1000 表示 10.00 元</p>
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
    * <p>用量</p>
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * <p>使用率</p>
    */
    @SerializedName("UsageRate")
    @Expose
    private Float UsageRate;

    /**
    * <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul>
    */
    @SerializedName("AlarmLevel")
    @Expose
    private String AlarmLevel;

    /**
    * <p>配额规则来源</p><p>枚举值：</p><ul><li>Manual： 手动配置</li><li>Default： 默认配额</li></ul>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>AllowOverage： 允许超支</li></ul>
    */
    @SerializedName("ExceedAction")
    @Expose
    private String ExceedAction;

    /**
    * <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>缓存是否计入限额</p><p>枚举值：</p><ul><li>Full： 全量计入</li><li>Exclude： 不计入网关缓存命中部分</li></ul>
    */
    @SerializedName("CacheHitStat")
    @Expose
    private String CacheHitStat;

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
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
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源名字</p> 
     * @return ResourceName <p>资源名字</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>资源名字</p>
     * @param ResourceName <p>资源名字</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： token总数</li><li>Cost： 成本</li></ul> 
     * @return QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： token总数</li><li>Cost： 成本</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： token总数</li><li>Cost： 成本</li></ul>
     * @param QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>RequestCount： 请求数</li><li>TotalToken： token总数</li><li>Cost： 成本</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>配额单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul> 
     * @return PeriodUnit <p>配额单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
     */
    public String getPeriodUnit() {
        return this.PeriodUnit;
    }

    /**
     * Set <p>配额单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
     * @param PeriodUnit <p>配额单位</p><p>枚举值：</p><ul><li>Day： 天</li><li>Week： 周</li><li>Month： 月</li></ul>
     */
    public void setPeriodUnit(String PeriodUnit) {
        this.PeriodUnit = PeriodUnit;
    }

    /**
     * Get <p>配额</p><p>如果是成本则数值单位是分，如 1000 表示 10.00 元</p> 
     * @return QuotaLimit <p>配额</p><p>如果是成本则数值单位是分，如 1000 表示 10.00 元</p>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>配额</p><p>如果是成本则数值单位是分，如 1000 表示 10.00 元</p>
     * @param QuotaLimit <p>配额</p><p>如果是成本则数值单位是分，如 1000 表示 10.00 元</p>
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
     * Get <p>用量</p> 
     * @return Used <p>用量</p>
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set <p>用量</p>
     * @param Used <p>用量</p>
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get <p>使用率</p> 
     * @return UsageRate <p>使用率</p>
     */
    public Float getUsageRate() {
        return this.UsageRate;
    }

    /**
     * Set <p>使用率</p>
     * @param UsageRate <p>使用率</p>
     */
    public void setUsageRate(Float UsageRate) {
        this.UsageRate = UsageRate;
    }

    /**
     * Get <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul> 
     * @return AlarmLevel <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul>
     */
    public String getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul>
     * @param AlarmLevel <p>预警级别</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Warning： 预警</li><li>NearLimit： 临近超限</li><li>Exceeded： 超限</li></ul>
     */
    public void setAlarmLevel(String AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get <p>配额规则来源</p><p>枚举值：</p><ul><li>Manual： 手动配置</li><li>Default： 默认配额</li></ul> 
     * @return Source <p>配额规则来源</p><p>枚举值：</p><ul><li>Manual： 手动配置</li><li>Default： 默认配额</li></ul>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>配额规则来源</p><p>枚举值：</p><ul><li>Manual： 手动配置</li><li>Default： 默认配额</li></ul>
     * @param Source <p>配额规则来源</p><p>枚举值：</p><ul><li>Manual： 手动配置</li><li>Default： 默认配额</li></ul>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>AllowOverage： 允许超支</li></ul> 
     * @return ExceedAction <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>AllowOverage： 允许超支</li></ul>
     */
    public String getExceedAction() {
        return this.ExceedAction;
    }

    /**
     * Set <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>AllowOverage： 允许超支</li></ul>
     * @param ExceedAction <p>配额超限行为</p><p>枚举值：</p><ul><li>Reject： 拒绝请求</li><li>AllowOverage： 允许超支</li></ul>
     */
    public void setExceedAction(String ExceedAction) {
        this.ExceedAction = ExceedAction;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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

    public AIGWQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWQuotaDetail(AIGWQuotaDetail source) {
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
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.UsageRate != null) {
            this.UsageRate = new Float(source.UsageRate);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new String(source.AlarmLevel);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ExceedAction != null) {
            this.ExceedAction = new String(source.ExceedAction);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CacheHitStat != null) {
            this.CacheHitStat = new String(source.CacheHitStat);
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
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "UsageRate", this.UsageRate);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ExceedAction", this.ExceedAction);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CacheHitStat", this.CacheHitStat);

    }
}

