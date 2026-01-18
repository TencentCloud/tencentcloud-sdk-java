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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesResponse extends AbstractModel {

    /**
    * <p>通道个数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>（旧参数，请切换到ProxySet）通道实例信息列表。</p>
    */
    @SerializedName("InstanceSet")
    @Expose
    private ProxyInfo [] InstanceSet;

    /**
    * <p>（新参数）通道实例信息列表。</p>
    */
    @SerializedName("ProxySet")
    @Expose
    private ProxyInfo [] ProxySet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>通道个数。</p> 
     * @return TotalCount <p>通道个数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>通道个数。</p>
     * @param TotalCount <p>通道个数。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>（旧参数，请切换到ProxySet）通道实例信息列表。</p> 
     * @return InstanceSet <p>（旧参数，请切换到ProxySet）通道实例信息列表。</p>
     */
    public ProxyInfo [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set <p>（旧参数，请切换到ProxySet）通道实例信息列表。</p>
     * @param InstanceSet <p>（旧参数，请切换到ProxySet）通道实例信息列表。</p>
     */
    public void setInstanceSet(ProxyInfo [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get <p>（新参数）通道实例信息列表。</p> 
     * @return ProxySet <p>（新参数）通道实例信息列表。</p>
     */
    public ProxyInfo [] getProxySet() {
        return this.ProxySet;
    }

    /**
     * Set <p>（新参数）通道实例信息列表。</p>
     * @param ProxySet <p>（新参数）通道实例信息列表。</p>
     */
    public void setProxySet(ProxyInfo [] ProxySet) {
        this.ProxySet = ProxySet;
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

    public DescribeProxiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxiesResponse(DescribeProxiesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new ProxyInfo[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new ProxyInfo(source.InstanceSet[i]);
            }
        }
        if (source.ProxySet != null) {
            this.ProxySet = new ProxyInfo[source.ProxySet.length];
            for (int i = 0; i < source.ProxySet.length; i++) {
                this.ProxySet[i] = new ProxyInfo(source.ProxySet[i]);
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
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamArrayObj(map, prefix + "ProxySet.", this.ProxySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

