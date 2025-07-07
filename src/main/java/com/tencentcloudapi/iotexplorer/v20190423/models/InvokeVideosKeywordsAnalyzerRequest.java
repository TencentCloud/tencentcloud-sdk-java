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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeVideosKeywordsAnalyzerRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 开始时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * 结束时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * 返回的关键字最大数量，默认为5；最大不能超过10
    */
    @SerializedName("KeywordsMaxNum")
    @Expose
    private Long KeywordsMaxNum;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 开始时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天 
     * @return StartTimeMs 开始时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set 开始时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
     * @param StartTimeMs 开始时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get 结束时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天 
     * @return EndTimeMs 结束时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set 结束时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
     * @param EndTimeMs 结束时间。

注：
1. 单位为毫秒（ms）
2. 时间区间必须控制在某一个自然天内，不支持跨天
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get 返回的关键字最大数量，默认为5；最大不能超过10 
     * @return KeywordsMaxNum 返回的关键字最大数量，默认为5；最大不能超过10
     */
    public Long getKeywordsMaxNum() {
        return this.KeywordsMaxNum;
    }

    /**
     * Set 返回的关键字最大数量，默认为5；最大不能超过10
     * @param KeywordsMaxNum 返回的关键字最大数量，默认为5；最大不能超过10
     */
    public void setKeywordsMaxNum(Long KeywordsMaxNum) {
        this.KeywordsMaxNum = KeywordsMaxNum;
    }

    public InvokeVideosKeywordsAnalyzerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeVideosKeywordsAnalyzerRequest(InvokeVideosKeywordsAnalyzerRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.KeywordsMaxNum != null) {
            this.KeywordsMaxNum = new Long(source.KeywordsMaxNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "KeywordsMaxNum", this.KeywordsMaxNum);

    }
}

