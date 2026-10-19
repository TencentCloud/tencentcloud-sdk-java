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

public class LLMTokenUsage extends AbstractModel {

    /**
    * <p>今日提示词攻击防护 token 消耗量</p>
    */
    @SerializedName("PromptUsage")
    @Expose
    private Long PromptUsage;

    /**
    * <p>今日内容安全文本检测 token 消耗量</p>
    */
    @SerializedName("ContentTextUsage")
    @Expose
    private Long ContentTextUsage;

    /**
    * <p>今日敏感数据检测 token 消耗量</p>
    */
    @SerializedName("SensitiveDataUsage")
    @Expose
    private Long SensitiveDataUsage;

    /**
    * <p>今日图片送检量（单位：张）</p>
    */
    @SerializedName("ContentImageUsage")
    @Expose
    private Long ContentImageUsage;

    /**
    * <p>该实例近7天token总量趋势（按天，缺失日期补0）</p>
    */
    @SerializedName("TokenTrend")
    @Expose
    private LLMTokenTrendItem [] TokenTrend;

    /**
    * <p>该实例近7天图片送检趋势（按天，缺失日期补0）</p>
    */
    @SerializedName("ImageTrend")
    @Expose
    private LLMImageTrendItem [] ImageTrend;

    /**
     * Get <p>今日提示词攻击防护 token 消耗量</p> 
     * @return PromptUsage <p>今日提示词攻击防护 token 消耗量</p>
     */
    public Long getPromptUsage() {
        return this.PromptUsage;
    }

    /**
     * Set <p>今日提示词攻击防护 token 消耗量</p>
     * @param PromptUsage <p>今日提示词攻击防护 token 消耗量</p>
     */
    public void setPromptUsage(Long PromptUsage) {
        this.PromptUsage = PromptUsage;
    }

    /**
     * Get <p>今日内容安全文本检测 token 消耗量</p> 
     * @return ContentTextUsage <p>今日内容安全文本检测 token 消耗量</p>
     */
    public Long getContentTextUsage() {
        return this.ContentTextUsage;
    }

    /**
     * Set <p>今日内容安全文本检测 token 消耗量</p>
     * @param ContentTextUsage <p>今日内容安全文本检测 token 消耗量</p>
     */
    public void setContentTextUsage(Long ContentTextUsage) {
        this.ContentTextUsage = ContentTextUsage;
    }

    /**
     * Get <p>今日敏感数据检测 token 消耗量</p> 
     * @return SensitiveDataUsage <p>今日敏感数据检测 token 消耗量</p>
     */
    public Long getSensitiveDataUsage() {
        return this.SensitiveDataUsage;
    }

    /**
     * Set <p>今日敏感数据检测 token 消耗量</p>
     * @param SensitiveDataUsage <p>今日敏感数据检测 token 消耗量</p>
     */
    public void setSensitiveDataUsage(Long SensitiveDataUsage) {
        this.SensitiveDataUsage = SensitiveDataUsage;
    }

    /**
     * Get <p>今日图片送检量（单位：张）</p> 
     * @return ContentImageUsage <p>今日图片送检量（单位：张）</p>
     */
    public Long getContentImageUsage() {
        return this.ContentImageUsage;
    }

    /**
     * Set <p>今日图片送检量（单位：张）</p>
     * @param ContentImageUsage <p>今日图片送检量（单位：张）</p>
     */
    public void setContentImageUsage(Long ContentImageUsage) {
        this.ContentImageUsage = ContentImageUsage;
    }

    /**
     * Get <p>该实例近7天token总量趋势（按天，缺失日期补0）</p> 
     * @return TokenTrend <p>该实例近7天token总量趋势（按天，缺失日期补0）</p>
     */
    public LLMTokenTrendItem [] getTokenTrend() {
        return this.TokenTrend;
    }

    /**
     * Set <p>该实例近7天token总量趋势（按天，缺失日期补0）</p>
     * @param TokenTrend <p>该实例近7天token总量趋势（按天，缺失日期补0）</p>
     */
    public void setTokenTrend(LLMTokenTrendItem [] TokenTrend) {
        this.TokenTrend = TokenTrend;
    }

    /**
     * Get <p>该实例近7天图片送检趋势（按天，缺失日期补0）</p> 
     * @return ImageTrend <p>该实例近7天图片送检趋势（按天，缺失日期补0）</p>
     */
    public LLMImageTrendItem [] getImageTrend() {
        return this.ImageTrend;
    }

    /**
     * Set <p>该实例近7天图片送检趋势（按天，缺失日期补0）</p>
     * @param ImageTrend <p>该实例近7天图片送检趋势（按天，缺失日期补0）</p>
     */
    public void setImageTrend(LLMImageTrendItem [] ImageTrend) {
        this.ImageTrend = ImageTrend;
    }

    public LLMTokenUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMTokenUsage(LLMTokenUsage source) {
        if (source.PromptUsage != null) {
            this.PromptUsage = new Long(source.PromptUsage);
        }
        if (source.ContentTextUsage != null) {
            this.ContentTextUsage = new Long(source.ContentTextUsage);
        }
        if (source.SensitiveDataUsage != null) {
            this.SensitiveDataUsage = new Long(source.SensitiveDataUsage);
        }
        if (source.ContentImageUsage != null) {
            this.ContentImageUsage = new Long(source.ContentImageUsage);
        }
        if (source.TokenTrend != null) {
            this.TokenTrend = new LLMTokenTrendItem[source.TokenTrend.length];
            for (int i = 0; i < source.TokenTrend.length; i++) {
                this.TokenTrend[i] = new LLMTokenTrendItem(source.TokenTrend[i]);
            }
        }
        if (source.ImageTrend != null) {
            this.ImageTrend = new LLMImageTrendItem[source.ImageTrend.length];
            for (int i = 0; i < source.ImageTrend.length; i++) {
                this.ImageTrend[i] = new LLMImageTrendItem(source.ImageTrend[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptUsage", this.PromptUsage);
        this.setParamSimple(map, prefix + "ContentTextUsage", this.ContentTextUsage);
        this.setParamSimple(map, prefix + "SensitiveDataUsage", this.SensitiveDataUsage);
        this.setParamSimple(map, prefix + "ContentImageUsage", this.ContentImageUsage);
        this.setParamArrayObj(map, prefix + "TokenTrend.", this.TokenTrend);
        this.setParamArrayObj(map, prefix + "ImageTrend.", this.ImageTrend);

    }
}

