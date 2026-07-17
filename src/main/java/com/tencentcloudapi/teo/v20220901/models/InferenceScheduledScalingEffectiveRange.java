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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceScheduledScalingEffectiveRange extends AbstractModel {

    /**
    * <p>有效期类型。取值有：<li>LongTerm：长期有效；</li><li>Custom：自定义起止日期。</li></p>
    */
    @SerializedName("EffectiveType")
    @Expose
    private String EffectiveType;

    /**
    * <p>有效期起始日期。当 EffectiveType 为 Custom 时必填；当 EffectiveType 为 LongTerm 时不传该字段。</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>有效期终止日期。当 EffectiveType 为 Custom 时必填，且不得早于 StartDate；当 EffectiveType 为 LongTerm 时不传该字段。</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get <p>有效期类型。取值有：<li>LongTerm：长期有效；</li><li>Custom：自定义起止日期。</li></p> 
     * @return EffectiveType <p>有效期类型。取值有：<li>LongTerm：长期有效；</li><li>Custom：自定义起止日期。</li></p>
     */
    public String getEffectiveType() {
        return this.EffectiveType;
    }

    /**
     * Set <p>有效期类型。取值有：<li>LongTerm：长期有效；</li><li>Custom：自定义起止日期。</li></p>
     * @param EffectiveType <p>有效期类型。取值有：<li>LongTerm：长期有效；</li><li>Custom：自定义起止日期。</li></p>
     */
    public void setEffectiveType(String EffectiveType) {
        this.EffectiveType = EffectiveType;
    }

    /**
     * Get <p>有效期起始日期。当 EffectiveType 为 Custom 时必填；当 EffectiveType 为 LongTerm 时不传该字段。</p> 
     * @return StartDate <p>有效期起始日期。当 EffectiveType 为 Custom 时必填；当 EffectiveType 为 LongTerm 时不传该字段。</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>有效期起始日期。当 EffectiveType 为 Custom 时必填；当 EffectiveType 为 LongTerm 时不传该字段。</p>
     * @param StartDate <p>有效期起始日期。当 EffectiveType 为 Custom 时必填；当 EffectiveType 为 LongTerm 时不传该字段。</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>有效期终止日期。当 EffectiveType 为 Custom 时必填，且不得早于 StartDate；当 EffectiveType 为 LongTerm 时不传该字段。</p> 
     * @return EndDate <p>有效期终止日期。当 EffectiveType 为 Custom 时必填，且不得早于 StartDate；当 EffectiveType 为 LongTerm 时不传该字段。</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>有效期终止日期。当 EffectiveType 为 Custom 时必填，且不得早于 StartDate；当 EffectiveType 为 LongTerm 时不传该字段。</p>
     * @param EndDate <p>有效期终止日期。当 EffectiveType 为 Custom 时必填，且不得早于 StartDate；当 EffectiveType 为 LongTerm 时不传该字段。</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public InferenceScheduledScalingEffectiveRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceScheduledScalingEffectiveRange(InferenceScheduledScalingEffectiveRange source) {
        if (source.EffectiveType != null) {
            this.EffectiveType = new String(source.EffectiveType);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EffectiveType", this.EffectiveType);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

