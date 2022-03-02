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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterInstancesSpecRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例ID列表，目前只支持单个实例修改
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 修改后的CPU核数。取值参考文档【购买指南】
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 修改后的内存大小，单位GiB。取值参考文档【购买指南】
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 操作时机
 - IMMEDIATE：立即执行 
 - MAINTAIN_PERIOD：维护窗口期执行
    */
    @SerializedName("OperationTiming")
    @Expose
    private String OperationTiming;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 实例ID列表，目前只支持单个实例修改 
     * @return InstanceIdSet 实例ID列表，目前只支持单个实例修改
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 实例ID列表，目前只支持单个实例修改
     * @param InstanceIdSet 实例ID列表，目前只支持单个实例修改
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 修改后的CPU核数。取值参考文档【购买指南】 
     * @return CPU 修改后的CPU核数。取值参考文档【购买指南】
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 修改后的CPU核数。取值参考文档【购买指南】
     * @param CPU 修改后的CPU核数。取值参考文档【购买指南】
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 修改后的内存大小，单位GiB。取值参考文档【购买指南】 
     * @return Memory 修改后的内存大小，单位GiB。取值参考文档【购买指南】
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 修改后的内存大小，单位GiB。取值参考文档【购买指南】
     * @param Memory 修改后的内存大小，单位GiB。取值参考文档【购买指南】
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 操作时机
 - IMMEDIATE：立即执行 
 - MAINTAIN_PERIOD：维护窗口期执行 
     * @return OperationTiming 操作时机
 - IMMEDIATE：立即执行 
 - MAINTAIN_PERIOD：维护窗口期执行
     */
    public String getOperationTiming() {
        return this.OperationTiming;
    }

    /**
     * Set 操作时机
 - IMMEDIATE：立即执行 
 - MAINTAIN_PERIOD：维护窗口期执行
     * @param OperationTiming 操作时机
 - IMMEDIATE：立即执行 
 - MAINTAIN_PERIOD：维护窗口期执行
     */
    public void setOperationTiming(String OperationTiming) {
        this.OperationTiming = OperationTiming;
    }

    public ModifyClusterInstancesSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterInstancesSpecRequest(ModifyClusterInstancesSpecRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.OperationTiming != null) {
            this.OperationTiming = new String(source.OperationTiming);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "OperationTiming", this.OperationTiming);

    }
}

