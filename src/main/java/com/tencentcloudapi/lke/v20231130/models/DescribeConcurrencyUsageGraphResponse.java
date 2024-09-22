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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrencyUsageGraphResponse extends AbstractModel {

    /**
    * 统计信息
    */
    @SerializedName("X")
    @Expose
    private String [] X;

    /**
    * 可用并发y轴坐标
    */
    @SerializedName("AvailableY")
    @Expose
    private Long [] AvailableY;

    /**
    * 成功调用并发y轴坐标
    */
    @SerializedName("SuccessCallY")
    @Expose
    private Long [] SuccessCallY;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 统计信息 
     * @return X 统计信息
     */
    public String [] getX() {
        return this.X;
    }

    /**
     * Set 统计信息
     * @param X 统计信息
     */
    public void setX(String [] X) {
        this.X = X;
    }

    /**
     * Get 可用并发y轴坐标 
     * @return AvailableY 可用并发y轴坐标
     */
    public Long [] getAvailableY() {
        return this.AvailableY;
    }

    /**
     * Set 可用并发y轴坐标
     * @param AvailableY 可用并发y轴坐标
     */
    public void setAvailableY(Long [] AvailableY) {
        this.AvailableY = AvailableY;
    }

    /**
     * Get 成功调用并发y轴坐标 
     * @return SuccessCallY 成功调用并发y轴坐标
     */
    public Long [] getSuccessCallY() {
        return this.SuccessCallY;
    }

    /**
     * Set 成功调用并发y轴坐标
     * @param SuccessCallY 成功调用并发y轴坐标
     */
    public void setSuccessCallY(Long [] SuccessCallY) {
        this.SuccessCallY = SuccessCallY;
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

    public DescribeConcurrencyUsageGraphResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrencyUsageGraphResponse(DescribeConcurrencyUsageGraphResponse source) {
        if (source.X != null) {
            this.X = new String[source.X.length];
            for (int i = 0; i < source.X.length; i++) {
                this.X[i] = new String(source.X[i]);
            }
        }
        if (source.AvailableY != null) {
            this.AvailableY = new Long[source.AvailableY.length];
            for (int i = 0; i < source.AvailableY.length; i++) {
                this.AvailableY[i] = new Long(source.AvailableY[i]);
            }
        }
        if (source.SuccessCallY != null) {
            this.SuccessCallY = new Long[source.SuccessCallY.length];
            for (int i = 0; i < source.SuccessCallY.length; i++) {
                this.SuccessCallY[i] = new Long(source.SuccessCallY[i]);
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
        this.setParamArraySimple(map, prefix + "X.", this.X);
        this.setParamArraySimple(map, prefix + "AvailableY.", this.AvailableY);
        this.setParamArraySimple(map, prefix + "SuccessCallY.", this.SuccessCallY);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

