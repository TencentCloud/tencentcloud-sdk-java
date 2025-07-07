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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigResponse extends AbstractModel {

    /**
    * 执行状态。<ul><li>true：执行成功。</li><li>false：执行失败。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 修改后的子网 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 修改后的私有网络 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 修改后的 VIP 地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 执行状态。<ul><li>true：执行成功。</li><li>false：执行失败。</li></ul> 
     * @return Status 执行状态。<ul><li>true：执行成功。</li><li>false：执行失败。</li></ul>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态。<ul><li>true：执行成功。</li><li>false：执行失败。</li></ul>
     * @param Status 执行状态。<ul><li>true：执行成功。</li><li>false：执行失败。</li></ul>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 修改后的子网 ID。 
     * @return SubnetId 修改后的子网 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 修改后的子网 ID。
     * @param SubnetId 修改后的子网 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 修改后的私有网络 ID。 
     * @return VpcId 修改后的私有网络 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 修改后的私有网络 ID。
     * @param VpcId 修改后的私有网络 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 修改后的 VIP 地址。 
     * @return Vip 修改后的 VIP 地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 修改后的 VIP 地址。
     * @param Vip 修改后的 VIP 地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 任务ID。 
     * @return TaskId 任务ID。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID。
     * @param TaskId 任务ID。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
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

    public ModifyNetworkConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkConfigResponse(ModifyNetworkConfigResponse source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

