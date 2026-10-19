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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Statistic extends AbstractModel {

    /**
    * <p>首token耗时</p>
    */
    @SerializedName("FirstTokenCostMs")
    @Expose
    private Long FirstTokenCostMs;

    /**
    * <p>输入token数量</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>输出token数量</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>推理总耗时</p>
    */
    @SerializedName("TotalCostMs")
    @Expose
    private Long TotalCostMs;

    /**
    * <p>输入+输出总token</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get <p>首token耗时</p> 
     * @return FirstTokenCostMs <p>首token耗时</p>
     */
    public Long getFirstTokenCostMs() {
        return this.FirstTokenCostMs;
    }

    /**
     * Set <p>首token耗时</p>
     * @param FirstTokenCostMs <p>首token耗时</p>
     */
    public void setFirstTokenCostMs(Long FirstTokenCostMs) {
        this.FirstTokenCostMs = FirstTokenCostMs;
    }

    /**
     * Get <p>输入token数量</p> 
     * @return InputTokens <p>输入token数量</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入token数量</p>
     * @param InputTokens <p>输入token数量</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>输出token数量</p> 
     * @return OutputTokens <p>输出token数量</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出token数量</p>
     * @param OutputTokens <p>输出token数量</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>推理总耗时</p> 
     * @return TotalCostMs <p>推理总耗时</p>
     */
    public Long getTotalCostMs() {
        return this.TotalCostMs;
    }

    /**
     * Set <p>推理总耗时</p>
     * @param TotalCostMs <p>推理总耗时</p>
     */
    public void setTotalCostMs(Long TotalCostMs) {
        this.TotalCostMs = TotalCostMs;
    }

    /**
     * Get <p>输入+输出总token</p> 
     * @return TotalTokens <p>输入+输出总token</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>输入+输出总token</p>
     * @param TotalTokens <p>输入+输出总token</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public Statistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Statistic(Statistic source) {
        if (source.FirstTokenCostMs != null) {
            this.FirstTokenCostMs = new Long(source.FirstTokenCostMs);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalCostMs != null) {
            this.TotalCostMs = new Long(source.TotalCostMs);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstTokenCostMs", this.FirstTokenCostMs);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalCostMs", this.TotalCostMs);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

