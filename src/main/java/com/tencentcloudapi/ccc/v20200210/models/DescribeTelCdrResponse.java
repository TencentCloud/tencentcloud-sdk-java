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

public class DescribeTelCdrResponse extends AbstractModel {

    /**
    * <p>话单记录总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>话单记录</p>
    */
    @SerializedName("TelCdrs")
    @Expose
    private TelCdrInfo [] TelCdrs;

    /**
    * <p>话单记录</p>
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
     * Get <p>话单记录总数</p> 
     * @return TotalCount <p>话单记录总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>话单记录总数</p>
     * @param TotalCount <p>话单记录总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>话单记录</p> 
     * @return TelCdrs <p>话单记录</p>
     * @deprecated
     */
    @Deprecated
    public TelCdrInfo [] getTelCdrs() {
        return this.TelCdrs;
    }

    /**
     * Set <p>话单记录</p>
     * @param TelCdrs <p>话单记录</p>
     * @deprecated
     */
    @Deprecated
    public void setTelCdrs(TelCdrInfo [] TelCdrs) {
        this.TelCdrs = TelCdrs;
    }

    /**
     * Get <p>话单记录</p> 
     * @return TelCdrList <p>话单记录</p>
     */
    public TelCdrInfo [] getTelCdrList() {
        return this.TelCdrList;
    }

    /**
     * Set <p>话单记录</p>
     * @param TelCdrList <p>话单记录</p>
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

    public DescribeTelCdrResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTelCdrResponse(DescribeTelCdrResponse source) {
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

