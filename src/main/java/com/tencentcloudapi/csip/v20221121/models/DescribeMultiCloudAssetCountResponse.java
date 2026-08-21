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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMultiCloudAssetCountResponse extends AbstractModel {

    /**
    * <p>云上资产总数<br>取值范围：[0, +∞)</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>各云厂商资产数量明细</p>
    */
    @SerializedName("CloudAssetInfos")
    @Expose
    private CloudAssetInfo [] CloudAssetInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>云上资产总数<br>取值范围：[0, +∞)</p> 
     * @return TotalCount <p>云上资产总数<br>取值范围：[0, +∞)</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>云上资产总数<br>取值范围：[0, +∞)</p>
     * @param TotalCount <p>云上资产总数<br>取值范围：[0, +∞)</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>各云厂商资产数量明细</p> 
     * @return CloudAssetInfos <p>各云厂商资产数量明细</p>
     */
    public CloudAssetInfo [] getCloudAssetInfos() {
        return this.CloudAssetInfos;
    }

    /**
     * Set <p>各云厂商资产数量明细</p>
     * @param CloudAssetInfos <p>各云厂商资产数量明细</p>
     */
    public void setCloudAssetInfos(CloudAssetInfo [] CloudAssetInfos) {
        this.CloudAssetInfos = CloudAssetInfos;
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

    public DescribeMultiCloudAssetCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMultiCloudAssetCountResponse(DescribeMultiCloudAssetCountResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.CloudAssetInfos != null) {
            this.CloudAssetInfos = new CloudAssetInfo[source.CloudAssetInfos.length];
            for (int i = 0; i < source.CloudAssetInfos.length; i++) {
                this.CloudAssetInfos[i] = new CloudAssetInfo(source.CloudAssetInfos[i]);
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
        this.setParamArrayObj(map, prefix + "CloudAssetInfos.", this.CloudAssetInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

