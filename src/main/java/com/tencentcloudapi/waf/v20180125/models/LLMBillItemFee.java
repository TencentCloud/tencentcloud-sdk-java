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

public class LLMBillItemFee extends AbstractModel {

    /**
    * 提示词攻击防护费用（元）
    */
    @SerializedName("PromptAttackFee")
    @Expose
    private String PromptAttackFee;

    /**
    * 内容合规检测（文本）费用（元）
    */
    @SerializedName("ContentTextFee")
    @Expose
    private String ContentTextFee;

    /**
    * 内容合规检测（图片）费用（元）
    */
    @SerializedName("ContentImageFee")
    @Expose
    private String ContentImageFee;

    /**
    * 敏感数据检测费用（元）
    */
    @SerializedName("SensitiveDataFee")
    @Expose
    private String SensitiveDataFee;

    /**
     * Get 提示词攻击防护费用（元） 
     * @return PromptAttackFee 提示词攻击防护费用（元）
     */
    public String getPromptAttackFee() {
        return this.PromptAttackFee;
    }

    /**
     * Set 提示词攻击防护费用（元）
     * @param PromptAttackFee 提示词攻击防护费用（元）
     */
    public void setPromptAttackFee(String PromptAttackFee) {
        this.PromptAttackFee = PromptAttackFee;
    }

    /**
     * Get 内容合规检测（文本）费用（元） 
     * @return ContentTextFee 内容合规检测（文本）费用（元）
     */
    public String getContentTextFee() {
        return this.ContentTextFee;
    }

    /**
     * Set 内容合规检测（文本）费用（元）
     * @param ContentTextFee 内容合规检测（文本）费用（元）
     */
    public void setContentTextFee(String ContentTextFee) {
        this.ContentTextFee = ContentTextFee;
    }

    /**
     * Get 内容合规检测（图片）费用（元） 
     * @return ContentImageFee 内容合规检测（图片）费用（元）
     */
    public String getContentImageFee() {
        return this.ContentImageFee;
    }

    /**
     * Set 内容合规检测（图片）费用（元）
     * @param ContentImageFee 内容合规检测（图片）费用（元）
     */
    public void setContentImageFee(String ContentImageFee) {
        this.ContentImageFee = ContentImageFee;
    }

    /**
     * Get 敏感数据检测费用（元） 
     * @return SensitiveDataFee 敏感数据检测费用（元）
     */
    public String getSensitiveDataFee() {
        return this.SensitiveDataFee;
    }

    /**
     * Set 敏感数据检测费用（元）
     * @param SensitiveDataFee 敏感数据检测费用（元）
     */
    public void setSensitiveDataFee(String SensitiveDataFee) {
        this.SensitiveDataFee = SensitiveDataFee;
    }

    public LLMBillItemFee() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMBillItemFee(LLMBillItemFee source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptAttackFee", this.PromptAttackFee);
        this.setParamSimple(map, prefix + "ContentTextFee", this.ContentTextFee);
        this.setParamSimple(map, prefix + "ContentImageFee", this.ContentImageFee);
        this.setParamSimple(map, prefix + "SensitiveDataFee", this.SensitiveDataFee);

    }
}

