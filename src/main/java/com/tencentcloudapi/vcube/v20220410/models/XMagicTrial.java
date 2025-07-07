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

public class XMagicTrial extends AbstractModel {

    /**
    * 功能名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 可以申请的次数
    */
    @SerializedName("TrialCount")
    @Expose
    private Long TrialCount;

    /**
    * 每次申请的时长单位：天
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
    * vod：点播 live：直播
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
     * @return TrialCount 可以申请的次数
     */
    public Long getTrialCount() {
        return this.TrialCount;
    }

    /**
     * Set 可以申请的次数
     * @param TrialCount 可以申请的次数
     */
    public void setTrialCount(Long TrialCount) {
        this.TrialCount = TrialCount;
    }

    /**
     * Get 每次申请的时长单位：天 
     * @return Duration 每次申请的时长单位：天
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 每次申请的时长单位：天
     * @param Duration 每次申请的时长单位：天
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
     * Get vod：点播 live：直播 
     * @return BizType vod：点播 live：直播
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set vod：点播 live：直播
     * @param BizType vod：点播 live：直播
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    public XMagicTrial() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XMagicTrial(XMagicTrial source) {
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);

    }
}

