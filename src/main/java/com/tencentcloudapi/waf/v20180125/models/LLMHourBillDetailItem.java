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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMHourBillDetailItem extends AbstractModel {

    /**
    * 小时区间，如00:00-01:00
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
    * 提示词攻击防护计量值（token）
    */
    @SerializedName("PromptAttackUsage")
    @Expose
    private Long PromptAttackUsage;

    /**
    * 内容合规检测（文本）计量值（token）
    */
    @SerializedName("ContentTextUsage")
    @Expose
    private Long ContentTextUsage;

    /**
    * 内容合规检测（图片）计量值（张）
    */
    @SerializedName("ContentImageUsage")
    @Expose
    private Long ContentImageUsage;

    /**
    * 敏感数据检测计量值（token）
    */
    @SerializedName("SensitiveDataUsage")
    @Expose
    private Long SensitiveDataUsage;

    /**
    * 该小时提示词攻击防护费用（元）
    */
    @SerializedName("PromptAttackFee")
    @Expose
    private String PromptAttackFee;

    /**
    * 该小时内容合规检测（文本）费用（元）
    */
    @SerializedName("ContentTextFee")
    @Expose
    private String ContentTextFee;

    /**
    * 该小时内容合规检测（图片）费用（元）
    */
    @SerializedName("ContentImageFee")
    @Expose
    private String ContentImageFee;

    /**
    * 该小时敏感数据检测费用（元）
    */
    @SerializedName("SensitiveDataFee")
    @Expose
    private String SensitiveDataFee;

    /**
    * 该小时账单总额（元，净费用）
    */
    @SerializedName("TotalFee")
    @Expose
    private String TotalFee;

    /**
     * Get 小时区间，如00:00-01:00 
     * @return TimeRange 小时区间，如00:00-01:00
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 小时区间，如00:00-01:00
     * @param TimeRange 小时区间，如00:00-01:00
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get 提示词攻击防护计量值（token） 
     * @return PromptAttackUsage 提示词攻击防护计量值（token）
     */
    public Long getPromptAttackUsage() {
        return this.PromptAttackUsage;
    }

    /**
     * Set 提示词攻击防护计量值（token）
     * @param PromptAttackUsage 提示词攻击防护计量值（token）
     */
    public void setPromptAttackUsage(Long PromptAttackUsage) {
        this.PromptAttackUsage = PromptAttackUsage;
    }

    /**
     * Get 内容合规检测（文本）计量值（token） 
     * @return ContentTextUsage 内容合规检测（文本）计量值（token）
     */
    public Long getContentTextUsage() {
        return this.ContentTextUsage;
    }

    /**
     * Set 内容合规检测（文本）计量值（token）
     * @param ContentTextUsage 内容合规检测（文本）计量值（token）
     */
    public void setContentTextUsage(Long ContentTextUsage) {
        this.ContentTextUsage = ContentTextUsage;
    }

    /**
     * Get 内容合规检测（图片）计量值（张） 
     * @return ContentImageUsage 内容合规检测（图片）计量值（张）
     */
    public Long getContentImageUsage() {
        return this.ContentImageUsage;
    }

    /**
     * Set 内容合规检测（图片）计量值（张）
     * @param ContentImageUsage 内容合规检测（图片）计量值（张）
     */
    public void setContentImageUsage(Long ContentImageUsage) {
        this.ContentImageUsage = ContentImageUsage;
    }

    /**
     * Get 敏感数据检测计量值（token） 
     * @return SensitiveDataUsage 敏感数据检测计量值（token）
     */
    public Long getSensitiveDataUsage() {
        return this.SensitiveDataUsage;
    }

    /**
     * Set 敏感数据检测计量值（token）
     * @param SensitiveDataUsage 敏感数据检测计量值（token）
     */
    public void setSensitiveDataUsage(Long SensitiveDataUsage) {
        this.SensitiveDataUsage = SensitiveDataUsage;
    }

    /**
     * Get 该小时提示词攻击防护费用（元） 
     * @return PromptAttackFee 该小时提示词攻击防护费用（元）
     */
    public String getPromptAttackFee() {
        return this.PromptAttackFee;
    }

    /**
     * Set 该小时提示词攻击防护费用（元）
     * @param PromptAttackFee 该小时提示词攻击防护费用（元）
     */
    public void setPromptAttackFee(String PromptAttackFee) {
        this.PromptAttackFee = PromptAttackFee;
    }

    /**
     * Get 该小时内容合规检测（文本）费用（元） 
     * @return ContentTextFee 该小时内容合规检测（文本）费用（元）
     */
    public String getContentTextFee() {
        return this.ContentTextFee;
    }

    /**
     * Set 该小时内容合规检测（文本）费用（元）
     * @param ContentTextFee 该小时内容合规检测（文本）费用（元）
     */
    public void setContentTextFee(String ContentTextFee) {
        this.ContentTextFee = ContentTextFee;
    }

    /**
     * Get 该小时内容合规检测（图片）费用（元） 
     * @return ContentImageFee 该小时内容合规检测（图片）费用（元）
     */
    public String getContentImageFee() {
        return this.ContentImageFee;
    }

    /**
     * Set 该小时内容合规检测（图片）费用（元）
     * @param ContentImageFee 该小时内容合规检测（图片）费用（元）
     */
    public void setContentImageFee(String ContentImageFee) {
        this.ContentImageFee = ContentImageFee;
    }

    /**
     * Get 该小时敏感数据检测费用（元） 
     * @return SensitiveDataFee 该小时敏感数据检测费用（元）
     */
    public String getSensitiveDataFee() {
        return this.SensitiveDataFee;
    }

    /**
     * Set 该小时敏感数据检测费用（元）
     * @param SensitiveDataFee 该小时敏感数据检测费用（元）
     */
    public void setSensitiveDataFee(String SensitiveDataFee) {
        this.SensitiveDataFee = SensitiveDataFee;
    }

    /**
     * Get 该小时账单总额（元，净费用） 
     * @return TotalFee 该小时账单总额（元，净费用）
     */
    public String getTotalFee() {
        return this.TotalFee;
    }

    /**
     * Set 该小时账单总额（元，净费用）
     * @param TotalFee 该小时账单总额（元，净费用）
     */
    public void setTotalFee(String TotalFee) {
        this.TotalFee = TotalFee;
    }

    public LLMHourBillDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMHourBillDetailItem(LLMHourBillDetailItem source) {
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
        if (source.PromptAttackUsage != null) {
            this.PromptAttackUsage = new Long(source.PromptAttackUsage);
        }
        if (source.ContentTextUsage != null) {
            this.ContentTextUsage = new Long(source.ContentTextUsage);
        }
        if (source.ContentImageUsage != null) {
            this.ContentImageUsage = new Long(source.ContentImageUsage);
        }
        if (source.SensitiveDataUsage != null) {
            this.SensitiveDataUsage = new Long(source.SensitiveDataUsage);
        }
        if (source.PromptAttackFee != null) {
            this.PromptAttackFee = new String(source.PromptAttackFee);
        }
        if (source.ContentTextFee != null) {
            this.ContentTextFee = new String(source.ContentTextFee);
        }
        if (source.ContentImageFee != null) {
            this.ContentImageFee = new String(source.ContentImageFee);
        }
        if (source.SensitiveDataFee != null) {
            this.SensitiveDataFee = new String(source.SensitiveDataFee);
        }
        if (source.TotalFee != null) {
            this.TotalFee = new String(source.TotalFee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "PromptAttackUsage", this.PromptAttackUsage);
        this.setParamSimple(map, prefix + "ContentTextUsage", this.ContentTextUsage);
        this.setParamSimple(map, prefix + "ContentImageUsage", this.ContentImageUsage);
        this.setParamSimple(map, prefix + "SensitiveDataUsage", this.SensitiveDataUsage);
        this.setParamSimple(map, prefix + "PromptAttackFee", this.PromptAttackFee);
        this.setParamSimple(map, prefix + "ContentTextFee", this.ContentTextFee);
        this.setParamSimple(map, prefix + "ContentImageFee", this.ContentImageFee);
        this.setParamSimple(map, prefix + "SensitiveDataFee", this.SensitiveDataFee);
        this.setParamSimple(map, prefix + "TotalFee", this.TotalFee);

    }
}

