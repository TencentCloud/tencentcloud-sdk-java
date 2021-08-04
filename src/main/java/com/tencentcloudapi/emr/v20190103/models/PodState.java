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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodState extends AbstractModel{

    /**
    * pod的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * pod uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * pod的状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * pod处于该状态原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * pod所属集群
    */
    @SerializedName("OwnerCluster")
    @Expose
    private String OwnerCluster;

    /**
    * pod内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
     * Get pod的名称 
     * @return Name pod的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set pod的名称
     * @param Name pod的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get pod uuid 
     * @return Uuid pod uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set pod uuid
     * @param Uuid pod uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get pod的状态 
     * @return State pod的状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set pod的状态
     * @param State pod的状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get pod处于该状态原因 
     * @return Reason pod处于该状态原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set pod处于该状态原因
     * @param Reason pod处于该状态原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get pod所属集群 
     * @return OwnerCluster pod所属集群
     */
    public String getOwnerCluster() {
        return this.OwnerCluster;
    }

    /**
     * Set pod所属集群
     * @param OwnerCluster pod所属集群
     */
    public void setOwnerCluster(String OwnerCluster) {
        this.OwnerCluster = OwnerCluster;
    }

    /**
     * Get pod内存大小 
     * @return Memory pod内存大小
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set pod内存大小
     * @param Memory pod内存大小
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    public PodState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodState(PodState source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.OwnerCluster != null) {
            this.OwnerCluster = new String(source.OwnerCluster);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "OwnerCluster", this.OwnerCluster);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

