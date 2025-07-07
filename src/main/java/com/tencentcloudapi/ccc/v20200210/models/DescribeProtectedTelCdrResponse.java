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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProtectedTelCdrResponse extends AbstractModel {

    /**
    * 话单记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 话单记录
    */
    @SerializedName("TelCdrs")
    @Expose
    private TelCdrInfo [] TelCdrs;

    /**
    * 话单记录
    */
    @SerializedName("TelCdrList")
    @Expose
    private TelCdrInfo [] TelCdrList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 话单记录总数 
     * @return TotalCount 话单记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 话单记录总数
     * @param TotalCount 话单记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 话单记录 
     * @return TelCdrs 话单记录
     * @deprecated
     */
    @Deprecated
    public TelCdrInfo [] getTelCdrs() {
        return this.TelCdrs;
    }

    /**
     * Set 话单记录
     * @param TelCdrs 话单记录
     * @deprecated
     */
    @Deprecated
    public void setTelCdrs(TelCdrInfo [] TelCdrs) {
        this.TelCdrs = TelCdrs;
    }

    /**
     * Get 话单记录 
     * @return TelCdrList 话单记录
     */
    public TelCdrInfo [] getTelCdrList() {
        return this.TelCdrList;
    }

    /**
     * Set 话单记录
     * @param TelCdrList 话单记录
     */
    public void setTelCdrList(TelCdrInfo [] TelCdrList) {
        this.TelCdrList = TelCdrList;
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

    public DescribeProtectedTelCdrResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProtectedTelCdrResponse(DescribeProtectedTelCdrResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TelCdrs != null) {
            this.TelCdrs = new TelCdrInfo[source.TelCdrs.length];
            for (int i = 0; i < source.TelCdrs.length; i++) {
                this.TelCdrs[i] = new TelCdrInfo(source.TelCdrs[i]);
            }
        }
        if (source.TelCdrList != null) {
            this.TelCdrList = new TelCdrInfo[source.TelCdrList.length];
            for (int i = 0; i < source.TelCdrList.length; i++) {
                this.TelCdrList[i] = new TelCdrInfo(source.TelCdrList[i]);
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
        this.setParamArrayObj(map, prefix + "TelCdrs.", this.TelCdrs);
        this.setParamArrayObj(map, prefix + "TelCdrList.", this.TelCdrList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

