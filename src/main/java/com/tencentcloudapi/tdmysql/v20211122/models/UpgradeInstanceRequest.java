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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例规格码</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>存储节点磁盘容量，单位GB</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>存储节点CPU核数</p>
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>存储节点内存大小</p>
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>磁盘类型，需要修改磁盘类型时传</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例规格码</p> 
     * @return SpecCode <p>实例规格码</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>实例规格码</p>
     * @param SpecCode <p>实例规格码</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>存储节点磁盘容量，单位GB</p> 
     * @return Disk <p>存储节点磁盘容量，单位GB</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>存储节点磁盘容量，单位GB</p>
     * @param Disk <p>存储节点磁盘容量，单位GB</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>存储节点CPU核数</p> 
     * @return StorageNodeCpu <p>存储节点CPU核数</p>
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>存储节点CPU核数</p>
     * @param StorageNodeCpu <p>存储节点CPU核数</p>
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>存储节点内存大小</p> 
     * @return StorageNodeMem <p>存储节点内存大小</p>
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>存储节点内存大小</p>
     * @param StorageNodeMem <p>存储节点内存大小</p>
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>磁盘类型，需要修改磁盘类型时传</p> 
     * @return StorageType <p>磁盘类型，需要修改磁盘类型时传</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>磁盘类型，需要修改磁盘类型时传</p>
     * @param StorageType <p>磁盘类型，需要修改磁盘类型时传</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

