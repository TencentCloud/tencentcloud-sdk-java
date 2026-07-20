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

public class DescribeNatFwVpcDnsLstResponse extends AbstractModel {

    /**
    * <p>nat防火墙vpc dns 信息数组</p>
    */
    @SerializedName("VpcDnsSwitchLst")
    @Expose
    private VpcDnsInfo [] VpcDnsSwitchLst;

    /**
    * <p>返回参数 success成功 failed 失败</p>
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * <p>开关总条数</p>
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
     * Get <p>nat防火墙vpc dns 信息数组</p> 
     * @return VpcDnsSwitchLst <p>nat防火墙vpc dns 信息数组</p>
     */
    public VpcDnsInfo [] getVpcDnsSwitchLst() {
        return this.VpcDnsSwitchLst;
    }

    /**
     * Set <p>nat防火墙vpc dns 信息数组</p>
     * @param VpcDnsSwitchLst <p>nat防火墙vpc dns 信息数组</p>
     */
    public void setVpcDnsSwitchLst(VpcDnsInfo [] VpcDnsSwitchLst) {
        this.VpcDnsSwitchLst = VpcDnsSwitchLst;
    }

    /**
     * Get <p>返回参数 success成功 failed 失败</p> 
     * @return ReturnMsg <p>返回参数 success成功 failed 失败</p>
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set <p>返回参数 success成功 failed 失败</p>
     * @param ReturnMsg <p>返回参数 success成功 failed 失败</p>
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get <p>开关总条数</p> 
     * @return Total <p>开关总条数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>开关总条数</p>
     * @param Total <p>开关总条数</p>
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

    public DescribeNatFwVpcDnsLstResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwVpcDnsLstResponse(DescribeNatFwVpcDnsLstResponse source) {
        if (source.VpcDnsSwitchLst != null) {
            this.VpcDnsSwitchLst = new VpcDnsInfo[source.VpcDnsSwitchLst.length];
            for (int i = 0; i < source.VpcDnsSwitchLst.length; i++) {
                this.VpcDnsSwitchLst[i] = new VpcDnsInfo(source.VpcDnsSwitchLst[i]);
            }
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
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
        this.setParamArrayObj(map, prefix + "VpcDnsSwitchLst.", this.VpcDnsSwitchLst);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

