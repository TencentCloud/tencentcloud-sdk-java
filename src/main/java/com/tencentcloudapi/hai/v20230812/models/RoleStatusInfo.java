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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleStatusInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * 
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * 
    */
    @SerializedName("RunningReplicas")
    @Expose
    private Long RunningReplicas;

    /**
    * 
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
    * 
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * 
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 
    */
    @SerializedName("LastObservedTime")
    @Expose
    private String LastObservedTime;

    /**
    * 
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get  
     * @return RoleName 
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 
     * @param RoleName 
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get  
     * @return WorkloadType 
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set 
     * @param WorkloadType 
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get  
     * @return WorkloadName 
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set 
     * @param WorkloadName 
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get  
     * @return RunningReplicas 
     */
    public Long getRunningReplicas() {
        return this.RunningReplicas;
    }

    /**
     * Set 
     * @param RunningReplicas 
     */
    public void setRunningReplicas(Long RunningReplicas) {
        this.RunningReplicas = RunningReplicas;
    }

    /**
     * Get  
     * @return TargetReplicas 
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set 
     * @param TargetReplicas 
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    /**
     * Get  
     * @return ContainerCount 
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 
     * @param ContainerCount 
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get  
     * @return State 
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 
     * @param State 
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get  
     * @return LastObservedTime 
     */
    public String getLastObservedTime() {
        return this.LastObservedTime;
    }

    /**
     * Set 
     * @param LastObservedTime 
     */
    public void setLastObservedTime(String LastObservedTime) {
        this.LastObservedTime = LastObservedTime;
    }

    /**
     * Get  
     * @return Role 
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 
     * @param Role 
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public RoleStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleStatusInfo(RoleStatusInfo source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.RunningReplicas != null) {
            this.RunningReplicas = new Long(source.RunningReplicas);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.LastObservedTime != null) {
            this.LastObservedTime = new String(source.LastObservedTime);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "RunningReplicas", this.RunningReplicas);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "LastObservedTime", this.LastObservedTime);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

