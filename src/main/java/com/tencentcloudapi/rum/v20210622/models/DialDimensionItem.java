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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DialDimensionItem extends AbstractModel {

    /**
    * <p>维度值。空值在控制台展示为未知。</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>执行次数。target_ip 按探测条数，其它维度按批次。</p>
    */
    @SerializedName("ExecutionCount")
    @Expose
    private Long ExecutionCount;

    /**
    * <p>成功次数</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * <p>失败次数</p>
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * <p>平均时延，单位毫秒</p>
    */
    @SerializedName("AvgDuration")
    @Expose
    private Float AvgDuration;

    /**
    * <p>平均丢包率，0 到 100</p>
    */
    @SerializedName("AvgLoss")
    @Expose
    private Float AvgLoss;

    /**
     * Get <p>维度值。空值在控制台展示为未知。</p> 
     * @return Value <p>维度值。空值在控制台展示为未知。</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>维度值。空值在控制台展示为未知。</p>
     * @param Value <p>维度值。空值在控制台展示为未知。</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>执行次数。target_ip 按探测条数，其它维度按批次。</p> 
     * @return ExecutionCount <p>执行次数。target_ip 按探测条数，其它维度按批次。</p>
     */
    public Long getExecutionCount() {
        return this.ExecutionCount;
    }

    /**
     * Set <p>执行次数。target_ip 按探测条数，其它维度按批次。</p>
     * @param ExecutionCount <p>执行次数。target_ip 按探测条数，其它维度按批次。</p>
     */
    public void setExecutionCount(Long ExecutionCount) {
        this.ExecutionCount = ExecutionCount;
    }

    /**
     * Get <p>成功次数</p> 
     * @return SuccessCount <p>成功次数</p>
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>成功次数</p>
     * @param SuccessCount <p>成功次数</p>
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>失败次数</p> 
     * @return FailCount <p>失败次数</p>
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set <p>失败次数</p>
     * @param FailCount <p>失败次数</p>
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get <p>平均时延，单位毫秒</p> 
     * @return AvgDuration <p>平均时延，单位毫秒</p>
     */
    public Float getAvgDuration() {
        return this.AvgDuration;
    }

    /**
     * Set <p>平均时延，单位毫秒</p>
     * @param AvgDuration <p>平均时延，单位毫秒</p>
     */
    public void setAvgDuration(Float AvgDuration) {
        this.AvgDuration = AvgDuration;
    }

    /**
     * Get <p>平均丢包率，0 到 100</p> 
     * @return AvgLoss <p>平均丢包率，0 到 100</p>
     */
    public Float getAvgLoss() {
        return this.AvgLoss;
    }

    /**
     * Set <p>平均丢包率，0 到 100</p>
     * @param AvgLoss <p>平均丢包率，0 到 100</p>
     */
    public void setAvgLoss(Float AvgLoss) {
        this.AvgLoss = AvgLoss;
    }

    public DialDimensionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DialDimensionItem(DialDimensionItem source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ExecutionCount != null) {
            this.ExecutionCount = new Long(source.ExecutionCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.AvgDuration != null) {
            this.AvgDuration = new Float(source.AvgDuration);
        }
        if (source.AvgLoss != null) {
            this.AvgLoss = new Float(source.AvgLoss);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ExecutionCount", this.ExecutionCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "AvgDuration", this.AvgDuration);
        this.setParamSimple(map, prefix + "AvgLoss", this.AvgLoss);

    }
}

