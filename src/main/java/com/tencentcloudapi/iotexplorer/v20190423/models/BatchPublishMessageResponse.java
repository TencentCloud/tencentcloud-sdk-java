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

public class BatchPublishMessageResponse extends AbstractModel {

    /**
    * <p>批量推送总数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>成功数量</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * <p>失败明细</p>
    */
    @SerializedName("Failures")
    @Expose
    private DeviceResult [] Failures;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>批量推送总数</p> 
     * @return Total <p>批量推送总数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>批量推送总数</p>
     * @param Total <p>批量推送总数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>成功数量</p> 
     * @return SuccessCount <p>成功数量</p>
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>成功数量</p>
     * @param SuccessCount <p>成功数量</p>
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>失败明细</p> 
     * @return Failures <p>失败明细</p>
     */
    public DeviceResult [] getFailures() {
        return this.Failures;
    }

    /**
     * Set <p>失败明细</p>
     * @param Failures <p>失败明细</p>
     */
    public void setFailures(DeviceResult [] Failures) {
        this.Failures = Failures;
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

    public BatchPublishMessageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchPublishMessageResponse(BatchPublishMessageResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.Failures != null) {
            this.Failures = new DeviceResult[source.Failures.length];
            for (int i = 0; i < source.Failures.length; i++) {
                this.Failures[i] = new DeviceResult(source.Failures[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamArrayObj(map, prefix + "Failures.", this.Failures);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

