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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSBlockRecordsResponse extends AbstractModel {

    /**
    * <p>封堵解封记录总数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>封堵解封记录。</p>
    */
    @SerializedName("BlockRecords")
    @Expose
    private DDoSBlockRecord [] BlockRecords;

    /**
    * <p>解封次数配额信息。</p>
    */
    @SerializedName("UnblockQuotaInfo")
    @Expose
    private DDoSUnblockQuota UnblockQuotaInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>封堵解封记录总数。</p> 
     * @return TotalCount <p>封堵解封记录总数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>封堵解封记录总数。</p>
     * @param TotalCount <p>封堵解封记录总数。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>封堵解封记录。</p> 
     * @return BlockRecords <p>封堵解封记录。</p>
     */
    public DDoSBlockRecord [] getBlockRecords() {
        return this.BlockRecords;
    }

    /**
     * Set <p>封堵解封记录。</p>
     * @param BlockRecords <p>封堵解封记录。</p>
     */
    public void setBlockRecords(DDoSBlockRecord [] BlockRecords) {
        this.BlockRecords = BlockRecords;
    }

    /**
     * Get <p>解封次数配额信息。</p> 
     * @return UnblockQuotaInfo <p>解封次数配额信息。</p>
     */
    public DDoSUnblockQuota getUnblockQuotaInfo() {
        return this.UnblockQuotaInfo;
    }

    /**
     * Set <p>解封次数配额信息。</p>
     * @param UnblockQuotaInfo <p>解封次数配额信息。</p>
     */
    public void setUnblockQuotaInfo(DDoSUnblockQuota UnblockQuotaInfo) {
        this.UnblockQuotaInfo = UnblockQuotaInfo;
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

    public DescribeDDoSBlockRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSBlockRecordsResponse(DescribeDDoSBlockRecordsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BlockRecords != null) {
            this.BlockRecords = new DDoSBlockRecord[source.BlockRecords.length];
            for (int i = 0; i < source.BlockRecords.length; i++) {
                this.BlockRecords[i] = new DDoSBlockRecord(source.BlockRecords[i]);
            }
        }
        if (source.UnblockQuotaInfo != null) {
            this.UnblockQuotaInfo = new DDoSUnblockQuota(source.UnblockQuotaInfo);
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
        this.setParamArrayObj(map, prefix + "BlockRecords.", this.BlockRecords);
        this.setParamObj(map, prefix + "UnblockQuotaInfo.", this.UnblockQuotaInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

