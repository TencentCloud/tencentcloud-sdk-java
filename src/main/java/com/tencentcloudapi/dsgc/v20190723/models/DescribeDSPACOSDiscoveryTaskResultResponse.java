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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPACOSDiscoveryTaskResultResponse extends AbstractModel {

    /**
    * 扫描任务结果项
    */
    @SerializedName("Items")
    @Expose
    private DspaCOSDiscoveryTaskResult [] Items;

    /**
    * 符合条件的数据结果数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 最大展示扫描结果次数
    */
    @SerializedName("MaxCount")
    @Expose
    private Long MaxCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 扫描任务结果项 
     * @return Items 扫描任务结果项
     */
    public DspaCOSDiscoveryTaskResult [] getItems() {
        return this.Items;
    }

    /**
     * Set 扫描任务结果项
     * @param Items 扫描任务结果项
     */
    public void setItems(DspaCOSDiscoveryTaskResult [] Items) {
        this.Items = Items;
    }

    /**
     * Get 符合条件的数据结果数目 
     * @return TotalCount 符合条件的数据结果数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的数据结果数目
     * @param TotalCount 符合条件的数据结果数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 最大展示扫描结果次数 
     * @return MaxCount 最大展示扫描结果次数
     */
    public Long getMaxCount() {
        return this.MaxCount;
    }

    /**
     * Set 最大展示扫描结果次数
     * @param MaxCount 最大展示扫描结果次数
     */
    public void setMaxCount(Long MaxCount) {
        this.MaxCount = MaxCount;
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

    public DescribeDSPACOSDiscoveryTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPACOSDiscoveryTaskResultResponse(DescribeDSPACOSDiscoveryTaskResultResponse source) {
        if (source.Items != null) {
            this.Items = new DspaCOSDiscoveryTaskResult[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DspaCOSDiscoveryTaskResult(source.Items[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MaxCount != null) {
            this.MaxCount = new Long(source.MaxCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "MaxCount", this.MaxCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

