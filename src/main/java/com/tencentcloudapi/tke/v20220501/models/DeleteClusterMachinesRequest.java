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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteClusterMachinesRequest extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点名列表
    */
    @SerializedName("MachineNames")
    @Expose
    private String [] MachineNames;

    /**
    * 删除节点时是否缩容节点池，true为缩容
    */
    @SerializedName("EnableScaleDown")
    @Expose
    private Boolean EnableScaleDown;

    /**
    * 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例）retain（仅移除，保留实例）
    */
    @SerializedName("InstanceDeleteMode")
    @Expose
    private String InstanceDeleteMode;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点名列表 
     * @return MachineNames 节点名列表
     */
    public String [] getMachineNames() {
        return this.MachineNames;
    }

    /**
     * Set 节点名列表
     * @param MachineNames 节点名列表
     */
    public void setMachineNames(String [] MachineNames) {
        this.MachineNames = MachineNames;
    }

    /**
     * Get 删除节点时是否缩容节点池，true为缩容 
     * @return EnableScaleDown 删除节点时是否缩容节点池，true为缩容
     */
    public Boolean getEnableScaleDown() {
        return this.EnableScaleDown;
    }

    /**
     * Set 删除节点时是否缩容节点池，true为缩容
     * @param EnableScaleDown 删除节点时是否缩容节点池，true为缩容
     */
    public void setEnableScaleDown(Boolean EnableScaleDown) {
        this.EnableScaleDown = EnableScaleDown;
    }

    /**
     * Get 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例）retain（仅移除，保留实例） 
     * @return InstanceDeleteMode 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例）retain（仅移除，保留实例）
     */
    public String getInstanceDeleteMode() {
        return this.InstanceDeleteMode;
    }

    /**
     * Set 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例）retain（仅移除，保留实例）
     * @param InstanceDeleteMode 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例）retain（仅移除，保留实例）
     */
    public void setInstanceDeleteMode(String InstanceDeleteMode) {
        this.InstanceDeleteMode = InstanceDeleteMode;
    }

    public DeleteClusterMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterMachinesRequest(DeleteClusterMachinesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MachineNames != null) {
            this.MachineNames = new String[source.MachineNames.length];
            for (int i = 0; i < source.MachineNames.length; i++) {
                this.MachineNames[i] = new String(source.MachineNames[i]);
            }
        }
        if (source.EnableScaleDown != null) {
            this.EnableScaleDown = new Boolean(source.EnableScaleDown);
        }
        if (source.InstanceDeleteMode != null) {
            this.InstanceDeleteMode = new String(source.InstanceDeleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "MachineNames.", this.MachineNames);
        this.setParamSimple(map, prefix + "EnableScaleDown", this.EnableScaleDown);
        this.setParamSimple(map, prefix + "InstanceDeleteMode", this.InstanceDeleteMode);

    }
}

