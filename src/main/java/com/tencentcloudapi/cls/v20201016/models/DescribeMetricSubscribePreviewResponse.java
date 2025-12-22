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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMetricSubscribePreviewResponse extends AbstractModel {

    /**
    * 总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 成功数量
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败数量
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 成功实例数据
    */
    @SerializedName("SuccessInstances")
    @Expose
    private InstanceData [] SuccessInstances;

    /**
    * 失败实例数据
    */
    @SerializedName("FailInstances")
    @Expose
    private InstanceData [] FailInstances;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数量 
     * @return TotalCount 总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
     * @param TotalCount 总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 成功数量 
     * @return SuccessCount 成功数量
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功数量
     * @param SuccessCount 成功数量
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败数量 
     * @return FailCount 失败数量
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 失败数量
     * @param FailCount 失败数量
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 成功实例数据 
     * @return SuccessInstances 成功实例数据
     */
    public InstanceData [] getSuccessInstances() {
        return this.SuccessInstances;
    }

    /**
     * Set 成功实例数据
     * @param SuccessInstances 成功实例数据
     */
    public void setSuccessInstances(InstanceData [] SuccessInstances) {
        this.SuccessInstances = SuccessInstances;
    }

    /**
     * Get 失败实例数据 
     * @return FailInstances 失败实例数据
     */
    public InstanceData [] getFailInstances() {
        return this.FailInstances;
    }

    /**
     * Set 失败实例数据
     * @param FailInstances 失败实例数据
     */
    public void setFailInstances(InstanceData [] FailInstances) {
        this.FailInstances = FailInstances;
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

    public DescribeMetricSubscribePreviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMetricSubscribePreviewResponse(DescribeMetricSubscribePreviewResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.SuccessInstances != null) {
            this.SuccessInstances = new InstanceData[source.SuccessInstances.length];
            for (int i = 0; i < source.SuccessInstances.length; i++) {
                this.SuccessInstances[i] = new InstanceData(source.SuccessInstances[i]);
            }
        }
        if (source.FailInstances != null) {
            this.FailInstances = new InstanceData[source.FailInstances.length];
            for (int i = 0; i < source.FailInstances.length; i++) {
                this.FailInstances[i] = new InstanceData(source.FailInstances[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamArrayObj(map, prefix + "SuccessInstances.", this.SuccessInstances);
        this.setParamArrayObj(map, prefix + "FailInstances.", this.FailInstances);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

