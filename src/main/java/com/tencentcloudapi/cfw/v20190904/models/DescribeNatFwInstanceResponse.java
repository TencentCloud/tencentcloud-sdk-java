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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwInstanceResponse extends AbstractModel {

    /**
    * <p>实例数组</p>
    */
    @SerializedName("NatinsLst")
    @Expose
    private NatFwInstance [] NatinsLst;

    /**
    * <p>nat ccn集群防火墙列表</p>
    */
    @SerializedName("NatClusterLst")
    @Expose
    private NatClusterInfo [] NatClusterLst;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例数组</p> 
     * @return NatinsLst <p>实例数组</p>
     */
    public NatFwInstance [] getNatinsLst() {
        return this.NatinsLst;
    }

    /**
     * Set <p>实例数组</p>
     * @param NatinsLst <p>实例数组</p>
     */
    public void setNatinsLst(NatFwInstance [] NatinsLst) {
        this.NatinsLst = NatinsLst;
    }

    /**
     * Get <p>nat ccn集群防火墙列表</p> 
     * @return NatClusterLst <p>nat ccn集群防火墙列表</p>
     */
    public NatClusterInfo [] getNatClusterLst() {
        return this.NatClusterLst;
    }

    /**
     * Set <p>nat ccn集群防火墙列表</p>
     * @param NatClusterLst <p>nat ccn集群防火墙列表</p>
     */
    public void setNatClusterLst(NatClusterInfo [] NatClusterLst) {
        this.NatClusterLst = NatClusterLst;
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

    public DescribeNatFwInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwInstanceResponse(DescribeNatFwInstanceResponse source) {
        if (source.NatinsLst != null) {
            this.NatinsLst = new NatFwInstance[source.NatinsLst.length];
            for (int i = 0; i < source.NatinsLst.length; i++) {
                this.NatinsLst[i] = new NatFwInstance(source.NatinsLst[i]);
            }
        }
        if (source.NatClusterLst != null) {
            this.NatClusterLst = new NatClusterInfo[source.NatClusterLst.length];
            for (int i = 0; i < source.NatClusterLst.length; i++) {
                this.NatClusterLst[i] = new NatClusterInfo(source.NatClusterLst[i]);
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
        this.setParamArrayObj(map, prefix + "NatinsLst.", this.NatinsLst);
        this.setParamArrayObj(map, prefix + "NatClusterLst.", this.NatClusterLst);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

