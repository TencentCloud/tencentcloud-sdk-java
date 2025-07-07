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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOpenPolicyListResponse extends AbstractModel {

    /**
    * 策略信息列表
    */
    @SerializedName("OpenPolicyInfoList")
    @Expose
    private OpenPolicyInfo [] OpenPolicyInfoList;

    /**
    * 集群内是否安装了gatekeeper addon
    */
    @SerializedName("GatekeeperStatus")
    @Expose
    private Long GatekeeperStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略信息列表 
     * @return OpenPolicyInfoList 策略信息列表
     */
    public OpenPolicyInfo [] getOpenPolicyInfoList() {
        return this.OpenPolicyInfoList;
    }

    /**
     * Set 策略信息列表
     * @param OpenPolicyInfoList 策略信息列表
     */
    public void setOpenPolicyInfoList(OpenPolicyInfo [] OpenPolicyInfoList) {
        this.OpenPolicyInfoList = OpenPolicyInfoList;
    }

    /**
     * Get 集群内是否安装了gatekeeper addon 
     * @return GatekeeperStatus 集群内是否安装了gatekeeper addon
     */
    public Long getGatekeeperStatus() {
        return this.GatekeeperStatus;
    }

    /**
     * Set 集群内是否安装了gatekeeper addon
     * @param GatekeeperStatus 集群内是否安装了gatekeeper addon
     */
    public void setGatekeeperStatus(Long GatekeeperStatus) {
        this.GatekeeperStatus = GatekeeperStatus;
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

    public DescribeOpenPolicyListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOpenPolicyListResponse(DescribeOpenPolicyListResponse source) {
        if (source.OpenPolicyInfoList != null) {
            this.OpenPolicyInfoList = new OpenPolicyInfo[source.OpenPolicyInfoList.length];
            for (int i = 0; i < source.OpenPolicyInfoList.length; i++) {
                this.OpenPolicyInfoList[i] = new OpenPolicyInfo(source.OpenPolicyInfoList[i]);
            }
        }
        if (source.GatekeeperStatus != null) {
            this.GatekeeperStatus = new Long(source.GatekeeperStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OpenPolicyInfoList.", this.OpenPolicyInfoList);
        this.setParamSimple(map, prefix + "GatekeeperStatus", this.GatekeeperStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

