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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyShardSpecInfo extends AbstractModel {

    /**
    * <p>分片ID</p>
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
    * <p>CPU核数。单位：C。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存大小，单位：GB。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>硬盘大小，单位：GB。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get <p>分片ID</p> 
     * @return ReplicaSetId <p>分片ID</p>
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * Set <p>分片ID</p>
     * @param ReplicaSetId <p>分片ID</p>
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    /**
     * Get <p>CPU核数。单位：C。</p> 
     * @return Cpu <p>CPU核数。单位：C。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU核数。单位：C。</p>
     * @param Cpu <p>CPU核数。单位：C。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存大小，单位：GB。</p> 
     * @return Memory <p>内存大小，单位：GB。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小，单位：GB。</p>
     * @param Memory <p>内存大小，单位：GB。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>硬盘大小，单位：GB。</p> 
     * @return Volume <p>硬盘大小，单位：GB。</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>硬盘大小，单位：GB。</p>
     * @param Volume <p>硬盘大小，单位：GB。</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    public ModifyShardSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyShardSpecInfo(ModifyShardSpecInfo source) {
        if (source.ReplicaSetId != null) {
            this.ReplicaSetId = new String(source.ReplicaSetId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicaSetId", this.ReplicaSetId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

