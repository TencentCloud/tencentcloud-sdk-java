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

public class DescribeNatFwInfoCountResponse extends AbstractModel {

    /**
    * <p>返回参数 success 成功 failed 失败</p>
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * <p>当前租户的nat防火墙实例个数</p>
    */
    @SerializedName("NatFwInsCount")
    @Expose
    private Long NatFwInsCount;

    /**
    * <p>当前租户接入防火墙的子网个数</p>
    */
    @SerializedName("SubnetCount")
    @Expose
    private Long SubnetCount;

    /**
    * <p>打开NAT防火墙开关个数</p>
    */
    @SerializedName("OpenSwitchCount")
    @Expose
    private Long OpenSwitchCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>返回参数 success 成功 failed 失败</p> 
     * @return ReturnMsg <p>返回参数 success 成功 failed 失败</p>
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set <p>返回参数 success 成功 failed 失败</p>
     * @param ReturnMsg <p>返回参数 success 成功 failed 失败</p>
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get <p>当前租户的nat防火墙实例个数</p> 
     * @return NatFwInsCount <p>当前租户的nat防火墙实例个数</p>
     */
    public Long getNatFwInsCount() {
        return this.NatFwInsCount;
    }

    /**
     * Set <p>当前租户的nat防火墙实例个数</p>
     * @param NatFwInsCount <p>当前租户的nat防火墙实例个数</p>
     */
    public void setNatFwInsCount(Long NatFwInsCount) {
        this.NatFwInsCount = NatFwInsCount;
    }

    /**
     * Get <p>当前租户接入防火墙的子网个数</p> 
     * @return SubnetCount <p>当前租户接入防火墙的子网个数</p>
     */
    public Long getSubnetCount() {
        return this.SubnetCount;
    }

    /**
     * Set <p>当前租户接入防火墙的子网个数</p>
     * @param SubnetCount <p>当前租户接入防火墙的子网个数</p>
     */
    public void setSubnetCount(Long SubnetCount) {
        this.SubnetCount = SubnetCount;
    }

    /**
     * Get <p>打开NAT防火墙开关个数</p> 
     * @return OpenSwitchCount <p>打开NAT防火墙开关个数</p>
     */
    public Long getOpenSwitchCount() {
        return this.OpenSwitchCount;
    }

    /**
     * Set <p>打开NAT防火墙开关个数</p>
     * @param OpenSwitchCount <p>打开NAT防火墙开关个数</p>
     */
    public void setOpenSwitchCount(Long OpenSwitchCount) {
        this.OpenSwitchCount = OpenSwitchCount;
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

    public DescribeNatFwInfoCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwInfoCountResponse(DescribeNatFwInfoCountResponse source) {
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.NatFwInsCount != null) {
            this.NatFwInsCount = new Long(source.NatFwInsCount);
        }
        if (source.SubnetCount != null) {
            this.SubnetCount = new Long(source.SubnetCount);
        }
        if (source.OpenSwitchCount != null) {
            this.OpenSwitchCount = new Long(source.OpenSwitchCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "NatFwInsCount", this.NatFwInsCount);
        this.setParamSimple(map, prefix + "SubnetCount", this.SubnetCount);
        this.setParamSimple(map, prefix + "OpenSwitchCount", this.OpenSwitchCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

