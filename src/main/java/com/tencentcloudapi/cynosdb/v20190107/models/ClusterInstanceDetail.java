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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstanceDetail extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 引擎类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例状态描述
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * cpu核数
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * 内存
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * 硬盘
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 引擎类型 
     * @return InstanceType 引擎类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 引擎类型
     * @param InstanceType 引擎类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例状态描述 
     * @return InstanceStatusDesc 实例状态描述
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set 实例状态描述
     * @param InstanceStatusDesc 实例状态描述
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get cpu核数 
     * @return InstanceCpu cpu核数
     */
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set cpu核数
     * @param InstanceCpu cpu核数
     */
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get 内存 
     * @return InstanceMemory 内存
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set 内存
     * @param InstanceMemory 内存
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get 硬盘 
     * @return InstanceStorage 硬盘
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set 硬盘
     * @param InstanceStorage 硬盘
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    public ClusterInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstanceDetail(ClusterInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);

    }
}

