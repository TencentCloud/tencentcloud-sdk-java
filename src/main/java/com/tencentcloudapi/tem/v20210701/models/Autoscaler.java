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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Autoscaler extends AbstractModel {

    /**
    * 弹性伸缩最小实例数
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 弹性伸缩最大实例数
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 指标弹性伸缩策略(指标策略和定时策略必须填写一个)
    */
    @SerializedName("HorizontalAutoscaler")
    @Expose
    private HorizontalAutoscaler [] HorizontalAutoscaler;

    /**
    * 定时弹性伸缩策略(指标策略和定时策略必须填写一个)
    */
    @SerializedName("CronHorizontalAutoscaler")
    @Expose
    private CronHorizontalAutoscaler [] CronHorizontalAutoscaler;

    /**
    * 弹性伸缩ID
    */
    @SerializedName("AutoscalerId")
    @Expose
    private String AutoscalerId;

    /**
    * 弹性伸缩名称
    */
    @SerializedName("AutoscalerName")
    @Expose
    private String AutoscalerName;

    /**
    * 弹性伸缩描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建日期
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 修改时间
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * 启用时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDate")
    @Expose
    private String EnableDate;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 弹性伸缩最小实例数 
     * @return MinReplicas 弹性伸缩最小实例数
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 弹性伸缩最小实例数
     * @param MinReplicas 弹性伸缩最小实例数
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 弹性伸缩最大实例数 
     * @return MaxReplicas 弹性伸缩最大实例数
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 弹性伸缩最大实例数
     * @param MaxReplicas 弹性伸缩最大实例数
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 指标弹性伸缩策略(指标策略和定时策略必须填写一个) 
     * @return HorizontalAutoscaler 指标弹性伸缩策略(指标策略和定时策略必须填写一个)
     */
    public HorizontalAutoscaler [] getHorizontalAutoscaler() {
        return this.HorizontalAutoscaler;
    }

    /**
     * Set 指标弹性伸缩策略(指标策略和定时策略必须填写一个)
     * @param HorizontalAutoscaler 指标弹性伸缩策略(指标策略和定时策略必须填写一个)
     */
    public void setHorizontalAutoscaler(HorizontalAutoscaler [] HorizontalAutoscaler) {
        this.HorizontalAutoscaler = HorizontalAutoscaler;
    }

    /**
     * Get 定时弹性伸缩策略(指标策略和定时策略必须填写一个) 
     * @return CronHorizontalAutoscaler 定时弹性伸缩策略(指标策略和定时策略必须填写一个)
     */
    public CronHorizontalAutoscaler [] getCronHorizontalAutoscaler() {
        return this.CronHorizontalAutoscaler;
    }

    /**
     * Set 定时弹性伸缩策略(指标策略和定时策略必须填写一个)
     * @param CronHorizontalAutoscaler 定时弹性伸缩策略(指标策略和定时策略必须填写一个)
     */
    public void setCronHorizontalAutoscaler(CronHorizontalAutoscaler [] CronHorizontalAutoscaler) {
        this.CronHorizontalAutoscaler = CronHorizontalAutoscaler;
    }

    /**
     * Get 弹性伸缩ID 
     * @return AutoscalerId 弹性伸缩ID
     */
    public String getAutoscalerId() {
        return this.AutoscalerId;
    }

    /**
     * Set 弹性伸缩ID
     * @param AutoscalerId 弹性伸缩ID
     */
    public void setAutoscalerId(String AutoscalerId) {
        this.AutoscalerId = AutoscalerId;
    }

    /**
     * Get 弹性伸缩名称 
     * @return AutoscalerName 弹性伸缩名称
     */
    public String getAutoscalerName() {
        return this.AutoscalerName;
    }

    /**
     * Set 弹性伸缩名称
     * @param AutoscalerName 弹性伸缩名称
     */
    public void setAutoscalerName(String AutoscalerName) {
        this.AutoscalerName = AutoscalerName;
    }

    /**
     * Get 弹性伸缩描述 
     * @return Description 弹性伸缩描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 弹性伸缩描述
     * @param Description 弹性伸缩描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建日期 
     * @return CreateDate 创建日期
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建日期
     * @param CreateDate 创建日期
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 修改时间 
     * @return ModifyDate 修改时间
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set 修改时间
     * @param ModifyDate 修改时间
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get 启用时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDate 启用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnableDate() {
        return this.EnableDate;
    }

    /**
     * Set 启用时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDate 启用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDate(String EnableDate) {
        this.EnableDate = EnableDate;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public Autoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Autoscaler(Autoscaler source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.HorizontalAutoscaler != null) {
            this.HorizontalAutoscaler = new HorizontalAutoscaler[source.HorizontalAutoscaler.length];
            for (int i = 0; i < source.HorizontalAutoscaler.length; i++) {
                this.HorizontalAutoscaler[i] = new HorizontalAutoscaler(source.HorizontalAutoscaler[i]);
            }
        }
        if (source.CronHorizontalAutoscaler != null) {
            this.CronHorizontalAutoscaler = new CronHorizontalAutoscaler[source.CronHorizontalAutoscaler.length];
            for (int i = 0; i < source.CronHorizontalAutoscaler.length; i++) {
                this.CronHorizontalAutoscaler[i] = new CronHorizontalAutoscaler(source.CronHorizontalAutoscaler[i]);
            }
        }
        if (source.AutoscalerId != null) {
            this.AutoscalerId = new String(source.AutoscalerId);
        }
        if (source.AutoscalerName != null) {
            this.AutoscalerName = new String(source.AutoscalerName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.EnableDate != null) {
            this.EnableDate = new String(source.EnableDate);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "HorizontalAutoscaler.", this.HorizontalAutoscaler);
        this.setParamArrayObj(map, prefix + "CronHorizontalAutoscaler.", this.CronHorizontalAutoscaler);
        this.setParamSimple(map, prefix + "AutoscalerId", this.AutoscalerId);
        this.setParamSimple(map, prefix + "AutoscalerName", this.AutoscalerName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "EnableDate", this.EnableDate);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

