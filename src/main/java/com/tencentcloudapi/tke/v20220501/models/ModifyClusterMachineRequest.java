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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterMachineRequest extends AbstractModel {

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
    * machine的display name
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 系统盘的信息
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * 安全组列表
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * 节点预付费信息
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

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
     * Get machine的display name 
     * @return DisplayName machine的display name
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set machine的display name
     * @param DisplayName machine的display name
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 系统盘的信息 
     * @return SystemDisk 系统盘的信息
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘的信息
     * @param SystemDisk 系统盘的信息
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 安全组列表 
     * @return SecurityGroupIDs 安全组列表
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set 安全组列表
     * @param SecurityGroupIDs 安全组列表
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get 节点预付费信息 
     * @return InstanceChargePrepaid 节点预付费信息
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 节点预付费信息
     * @param InstanceChargePrepaid 节点预付费信息
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    public ModifyClusterMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterMachineRequest(ModifyClusterMachineRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MachineNames != null) {
            this.MachineNames = new String[source.MachineNames.length];
            for (int i = 0; i < source.MachineNames.length; i++) {
                this.MachineNames[i] = new String(source.MachineNames[i]);
            }
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "MachineNames.", this.MachineNames);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);

    }
}

