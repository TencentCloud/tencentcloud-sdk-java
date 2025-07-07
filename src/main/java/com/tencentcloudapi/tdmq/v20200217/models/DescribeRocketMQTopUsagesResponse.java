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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQTopUsagesResponse extends AbstractModel {

    /**
    * 指标值列表
    */
    @SerializedName("Values")
    @Expose
    private Long [] Values;

    /**
    * 指标值对应的维度组合，本接口存在以下几个维度：
tenant，namespace，group，topic
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionInstance [] Dimensions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 指标值列表 
     * @return Values 指标值列表
     */
    public Long [] getValues() {
        return this.Values;
    }

    /**
     * Set 指标值列表
     * @param Values 指标值列表
     */
    public void setValues(Long [] Values) {
        this.Values = Values;
    }

    /**
     * Get 指标值对应的维度组合，本接口存在以下几个维度：
tenant，namespace，group，topic 
     * @return Dimensions 指标值对应的维度组合，本接口存在以下几个维度：
tenant，namespace，group，topic
     */
    public DimensionInstance [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 指标值对应的维度组合，本接口存在以下几个维度：
tenant，namespace，group，topic
     * @param Dimensions 指标值对应的维度组合，本接口存在以下几个维度：
tenant，namespace，group，topic
     */
    public void setDimensions(DimensionInstance [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRocketMQTopUsagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQTopUsagesResponse(DescribeRocketMQTopUsagesResponse source) {
        if (source.Values != null) {
            this.Values = new Long[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Long(source.Values[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DimensionInstance[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DimensionInstance(source.Dimensions[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

