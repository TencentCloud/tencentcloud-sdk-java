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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XMagicFeature extends AbstractModel {

    /**
    * 功能名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 可以申请的次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrialCount")
    @Expose
    private Long TrialCount;

    /**
    * 每次申请的时长单位：天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 功能类别
    */
    @SerializedName("Plan")
    @Expose
    private String Plan;

    /**
    * single: 原子能力,combined:套餐
    */
    @SerializedName("XMagicType")
    @Expose
    private String XMagicType;

    /**
    * 此功能是否支持开通测试
    */
    @SerializedName("Trial")
    @Expose
    private Boolean Trial;

    /**
    * 功能所属业务方
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
     * Get 功能名称 
     * @return Name 功能名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 功能名称
     * @param Name 功能名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 可以申请的次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrialCount 可以申请的次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTrialCount() {
        return this.TrialCount;
    }

    /**
     * Set 可以申请的次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrialCount 可以申请的次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrialCount(Long TrialCount) {
        this.TrialCount = TrialCount;
    }

    /**
     * Get 每次申请的时长单位：天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 每次申请的时长单位：天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 每次申请的时长单位：天
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 每次申请的时长单位：天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 功能类别 
     * @return Plan 功能类别
     */
    public String getPlan() {
        return this.Plan;
    }

    /**
     * Set 功能类别
     * @param Plan 功能类别
     */
    public void setPlan(String Plan) {
        this.Plan = Plan;
    }

    /**
     * Get single: 原子能力,combined:套餐 
     * @return XMagicType single: 原子能力,combined:套餐
     */
    public String getXMagicType() {
        return this.XMagicType;
    }

    /**
     * Set single: 原子能力,combined:套餐
     * @param XMagicType single: 原子能力,combined:套餐
     */
    public void setXMagicType(String XMagicType) {
        this.XMagicType = XMagicType;
    }

    /**
     * Get 此功能是否支持开通测试 
     * @return Trial 此功能是否支持开通测试
     */
    public Boolean getTrial() {
        return this.Trial;
    }

    /**
     * Set 此功能是否支持开通测试
     * @param Trial 此功能是否支持开通测试
     */
    public void setTrial(Boolean Trial) {
        this.Trial = Trial;
    }

    /**
     * Get 功能所属业务方 
     * @return BizType 功能所属业务方
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 功能所属业务方
     * @param BizType 功能所属业务方
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    public XMagicFeature() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XMagicFeature(XMagicFeature source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TrialCount != null) {
            this.TrialCount = new Long(source.TrialCount);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Plan != null) {
            this.Plan = new String(source.Plan);
        }
        if (source.XMagicType != null) {
            this.XMagicType = new String(source.XMagicType);
        }
        if (source.Trial != null) {
            this.Trial = new Boolean(source.Trial);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TrialCount", this.TrialCount);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Plan", this.Plan);
        this.setParamSimple(map, prefix + "XMagicType", this.XMagicType);
        this.setParamSimple(map, prefix + "Trial", this.Trial);
        this.setParamSimple(map, prefix + "BizType", this.BizType);

    }
}

