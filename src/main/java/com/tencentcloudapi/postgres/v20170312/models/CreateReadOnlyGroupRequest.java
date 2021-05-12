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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReadOnlyGroupRequest extends AbstractModel{

    /**
    * 主实例ID
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * 只读组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 延迟时间大小开关：0关、1开
    */
    @SerializedName("ReplayLagEliminate")
    @Expose
    private Long ReplayLagEliminate;

    /**
    * 延迟空间大小开关： 0关、1开
    */
    @SerializedName("ReplayLatencyEliminate")
    @Expose
    private Long ReplayLatencyEliminate;

    /**
    * 延迟时间大小阈值，单位ms
    */
    @SerializedName("MaxReplayLag")
    @Expose
    private Long MaxReplayLag;

    /**
    * 延迟空间大小阈值，单位MB
    */
    @SerializedName("MaxReplayLatency")
    @Expose
    private Long MaxReplayLatency;

    /**
    * 延迟剔除最小保留实例数
    */
    @SerializedName("MinDelayEliminateReserve")
    @Expose
    private Long MinDelayEliminateReserve;

    /**
    * 安全组id
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get 主实例ID 
     * @return MasterDBInstanceId 主实例ID
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set 主实例ID
     * @param MasterDBInstanceId 主实例ID
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get 只读组名称 
     * @return Name 只读组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 只读组名称
     * @param Name 只读组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 延迟时间大小开关：0关、1开 
     * @return ReplayLagEliminate 延迟时间大小开关：0关、1开
     */
    public Long getReplayLagEliminate() {
        return this.ReplayLagEliminate;
    }

    /**
     * Set 延迟时间大小开关：0关、1开
     * @param ReplayLagEliminate 延迟时间大小开关：0关、1开
     */
    public void setReplayLagEliminate(Long ReplayLagEliminate) {
        this.ReplayLagEliminate = ReplayLagEliminate;
    }

    /**
     * Get 延迟空间大小开关： 0关、1开 
     * @return ReplayLatencyEliminate 延迟空间大小开关： 0关、1开
     */
    public Long getReplayLatencyEliminate() {
        return this.ReplayLatencyEliminate;
    }

    /**
     * Set 延迟空间大小开关： 0关、1开
     * @param ReplayLatencyEliminate 延迟空间大小开关： 0关、1开
     */
    public void setReplayLatencyEliminate(Long ReplayLatencyEliminate) {
        this.ReplayLatencyEliminate = ReplayLatencyEliminate;
    }

    /**
     * Get 延迟时间大小阈值，单位ms 
     * @return MaxReplayLag 延迟时间大小阈值，单位ms
     */
    public Long getMaxReplayLag() {
        return this.MaxReplayLag;
    }

    /**
     * Set 延迟时间大小阈值，单位ms
     * @param MaxReplayLag 延迟时间大小阈值，单位ms
     */
    public void setMaxReplayLag(Long MaxReplayLag) {
        this.MaxReplayLag = MaxReplayLag;
    }

    /**
     * Get 延迟空间大小阈值，单位MB 
     * @return MaxReplayLatency 延迟空间大小阈值，单位MB
     */
    public Long getMaxReplayLatency() {
        return this.MaxReplayLatency;
    }

    /**
     * Set 延迟空间大小阈值，单位MB
     * @param MaxReplayLatency 延迟空间大小阈值，单位MB
     */
    public void setMaxReplayLatency(Long MaxReplayLatency) {
        this.MaxReplayLatency = MaxReplayLatency;
    }

    /**
     * Get 延迟剔除最小保留实例数 
     * @return MinDelayEliminateReserve 延迟剔除最小保留实例数
     */
    public Long getMinDelayEliminateReserve() {
        return this.MinDelayEliminateReserve;
    }

    /**
     * Set 延迟剔除最小保留实例数
     * @param MinDelayEliminateReserve 延迟剔除最小保留实例数
     */
    public void setMinDelayEliminateReserve(Long MinDelayEliminateReserve) {
        this.MinDelayEliminateReserve = MinDelayEliminateReserve;
    }

    /**
     * Get 安全组id 
     * @return SecurityGroupIds 安全组id
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组id
     * @param SecurityGroupIds 安全组id
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateReadOnlyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReadOnlyGroupRequest(CreateReadOnlyGroupRequest source) {
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ReplayLagEliminate != null) {
            this.ReplayLagEliminate = new Long(source.ReplayLagEliminate);
        }
        if (source.ReplayLatencyEliminate != null) {
            this.ReplayLatencyEliminate = new Long(source.ReplayLatencyEliminate);
        }
        if (source.MaxReplayLag != null) {
            this.MaxReplayLag = new Long(source.MaxReplayLag);
        }
        if (source.MaxReplayLatency != null) {
            this.MaxReplayLatency = new Long(source.MaxReplayLatency);
        }
        if (source.MinDelayEliminateReserve != null) {
            this.MinDelayEliminateReserve = new Long(source.MinDelayEliminateReserve);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ReplayLagEliminate", this.ReplayLagEliminate);
        this.setParamSimple(map, prefix + "ReplayLatencyEliminate", this.ReplayLatencyEliminate);
        this.setParamSimple(map, prefix + "MaxReplayLag", this.MaxReplayLag);
        this.setParamSimple(map, prefix + "MaxReplayLatency", this.MaxReplayLatency);
        this.setParamSimple(map, prefix + "MinDelayEliminateReserve", this.MinDelayEliminateReserve);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

