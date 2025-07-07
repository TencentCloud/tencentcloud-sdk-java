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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesComponent extends AbstractModel {

    /**
    * 底层组件名，需要和产品模型中的保持一致
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 组件cpu大小
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 组件内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 业务节点数
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * 自定义组件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组件磁盘大小
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 磁盘类型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 组件额外参数，通过JSON提交
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get 底层组件名，需要和产品模型中的保持一致 
     * @return Component 底层组件名，需要和产品模型中的保持一致
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 底层组件名，需要和产品模型中的保持一致
     * @param Component 底层组件名，需要和产品模型中的保持一致
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 组件cpu大小 
     * @return Cpu 组件cpu大小
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 组件cpu大小
     * @param Cpu 组件cpu大小
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 组件内存大小 
     * @return Memory 组件内存大小
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 组件内存大小
     * @param Memory 组件内存大小
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 业务节点数 
     * @return ReplicaNum 业务节点数
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 业务节点数
     * @param ReplicaNum 业务节点数
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get 自定义组件名 
     * @return Name 自定义组件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义组件名
     * @param Name 自定义组件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组件磁盘大小 
     * @return StorageSize 组件磁盘大小
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 组件磁盘大小
     * @param StorageSize 组件磁盘大小
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 磁盘类型 
     * @return StorageType 磁盘类型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 磁盘类型
     * @param StorageType 磁盘类型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 组件额外参数，通过JSON提交 
     * @return Params 组件额外参数，通过JSON提交
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 组件额外参数，通过JSON提交
     * @param Params 组件额外参数，通过JSON提交
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public CreateInstancesComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesComponent(CreateInstancesComponent source) {
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

