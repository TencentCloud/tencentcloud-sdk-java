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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFwGroupInstanceInfoResponse extends AbstractModel {

    /**
    * 防火墙(组)详细信息
    */
    @SerializedName("VpcFwGroupLst")
    @Expose
    private VpcFwGroupInfo [] VpcFwGroupLst;

    /**
    * 防火墙(组)个数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 防火墙(组)详细信息 
     * @return VpcFwGroupLst 防火墙(组)详细信息
     */
    public VpcFwGroupInfo [] getVpcFwGroupLst() {
        return this.VpcFwGroupLst;
    }

    /**
     * Set 防火墙(组)详细信息
     * @param VpcFwGroupLst 防火墙(组)详细信息
     */
    public void setVpcFwGroupLst(VpcFwGroupInfo [] VpcFwGroupLst) {
        this.VpcFwGroupLst = VpcFwGroupLst;
    }

    /**
     * Get 防火墙(组)个数 
     * @return Total 防火墙(组)个数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 防火墙(组)个数
     * @param Total 防火墙(组)个数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeFwGroupInstanceInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFwGroupInstanceInfoResponse(DescribeFwGroupInstanceInfoResponse source) {
        if (source.VpcFwGroupLst != null) {
            this.VpcFwGroupLst = new VpcFwGroupInfo[source.VpcFwGroupLst.length];
            for (int i = 0; i < source.VpcFwGroupLst.length; i++) {
                this.VpcFwGroupLst[i] = new VpcFwGroupInfo(source.VpcFwGroupLst[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VpcFwGroupLst.", this.VpcFwGroupLst);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

