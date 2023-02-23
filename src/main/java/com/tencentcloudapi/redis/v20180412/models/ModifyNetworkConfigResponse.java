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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigResponse extends AbstractModel{

    /**
    * 执行状态，请忽略该参数。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 指实例新私有网络所属子网 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指实例新的私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 指实例新的内网 IPv4 地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 任务 ID。可获取**taskId**，通过接口 **DescribeTaskInfo **查询任务执行状态。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 执行状态，请忽略该参数。 
     * @return Status 执行状态，请忽略该参数。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态，请忽略该参数。
     * @param Status 执行状态，请忽略该参数。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 指实例新私有网络所属子网 ID。 
     * @return SubnetId 指实例新私有网络所属子网 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 指实例新私有网络所属子网 ID。
     * @param SubnetId 指实例新私有网络所属子网 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指实例新的私有网络ID。 
     * @return VpcId 指实例新的私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 指实例新的私有网络ID。
     * @param VpcId 指实例新的私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 指实例新的内网 IPv4 地址。 
     * @return Vip 指实例新的内网 IPv4 地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 指实例新的内网 IPv4 地址。
     * @param Vip 指实例新的内网 IPv4 地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 任务 ID。可获取**taskId**，通过接口 **DescribeTaskInfo **查询任务执行状态。 
     * @return TaskId 任务 ID。可获取**taskId**，通过接口 **DescribeTaskInfo **查询任务执行状态。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。可获取**taskId**，通过接口 **DescribeTaskInfo **查询任务执行状态。
     * @param TaskId 任务 ID。可获取**taskId**，通过接口 **DescribeTaskInfo **查询任务执行状态。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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

