/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationUsageRequest extends AbstractModel{

    /**
    * 用量开始时间（包括该时间点）
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 用量结束时间（不包括该时间点）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 白板子产品名
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * 时间跨度单位
- MONTHLY：月
- DAILY：天
- MINUTELY：分钟
    */
    @SerializedName("TimeLevel")
    @Expose
    private String TimeLevel;

    /**
    * 白板应用的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * true: 返回加权求和后的用量数据
false: 返回原始用量数据
    */
    @SerializedName("IsWeighted")
    @Expose
    private Boolean IsWeighted;

    /**
     * Get 用量开始时间（包括该时间点） 
     * @return BeginTime 用量开始时间（包括该时间点）
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 用量开始时间（包括该时间点）
     * @param BeginTime 用量开始时间（包括该时间点）
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 用量结束时间（不包括该时间点） 
     * @return EndTime 用量结束时间（不包括该时间点）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 用量结束时间（不包括该时间点）
     * @param EndTime 用量结束时间（不包括该时间点）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 白板子产品名 
     * @return SubProduct 白板子产品名
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set 白板子产品名
     * @param SubProduct 白板子产品名
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get 时间跨度单位
- MONTHLY：月
- DAILY：天
- MINUTELY：分钟 
     * @return TimeLevel 时间跨度单位
- MONTHLY：月
- DAILY：天
- MINUTELY：分钟
     */
    public String getTimeLevel() {
        return this.TimeLevel;
    }

    /**
     * Set 时间跨度单位
- MONTHLY：月
- DAILY：天
- MINUTELY：分钟
     * @param TimeLevel 时间跨度单位
- MONTHLY：月
- DAILY：天
- MINUTELY：分钟
     */
    public void setTimeLevel(String TimeLevel) {
        this.TimeLevel = TimeLevel;
    }

    /**
     * Get 白板应用的SdkAppId 
     * @return SdkAppId 白板应用的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 白板应用的SdkAppId
     * @param SdkAppId 白板应用的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get true: 返回加权求和后的用量数据
false: 返回原始用量数据 
     * @return IsWeighted true: 返回加权求和后的用量数据
false: 返回原始用量数据
     */
    public Boolean getIsWeighted() {
        return this.IsWeighted;
    }

    /**
     * Set true: 返回加权求和后的用量数据
false: 返回原始用量数据
     * @param IsWeighted true: 返回加权求和后的用量数据
false: 返回原始用量数据
     */
    public void setIsWeighted(Boolean IsWeighted) {
        this.IsWeighted = IsWeighted;
    }

    public DescribeApplicationUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationUsageRequest(DescribeApplicationUsageRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.TimeLevel != null) {
            this.TimeLevel = new String(source.TimeLevel);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.IsWeighted != null) {
            this.IsWeighted = new Boolean(source.IsWeighted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "TimeLevel", this.TimeLevel);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "IsWeighted", this.IsWeighted);

    }
}

