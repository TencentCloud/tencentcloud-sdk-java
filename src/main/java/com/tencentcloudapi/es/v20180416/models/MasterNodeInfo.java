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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MasterNodeInfo  extends AbstractModel{

    /**
    * 是否启用了专用主节点
    */
    @SerializedName("EnableDedicatedMaster")
    @Expose
    private Boolean EnableDedicatedMaster;

    /**
    * 专用主节点规格
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * 专用主节点个数
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Integer MasterNodeNum;

    /**
    * 专用主节点CPU核数
    */
    @SerializedName("MasterNodeCpuNum")
    @Expose
    private Integer MasterNodeCpuNum;

    /**
    * 专用主节点内存大小，单位GB
    */
    @SerializedName("MasterNodeMemSize")
    @Expose
    private Integer MasterNodeMemSize;

    /**
    * 专用主节点磁盘大小，单位GB
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Integer MasterNodeDiskSize;

    /**
     * 获取是否启用了专用主节点
     * @return EnableDedicatedMaster 是否启用了专用主节点
     */
    public Boolean getEnableDedicatedMaster() {
        return this.EnableDedicatedMaster;
    }

    /**
     * 设置是否启用了专用主节点
     * @param EnableDedicatedMaster 是否启用了专用主节点
     */
    public void setEnableDedicatedMaster(Boolean EnableDedicatedMaster) {
        this.EnableDedicatedMaster = EnableDedicatedMaster;
    }

    /**
     * 获取专用主节点规格
     * @return MasterNodeType 专用主节点规格
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * 设置专用主节点规格
     * @param MasterNodeType 专用主节点规格
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * 获取专用主节点个数
     * @return MasterNodeNum 专用主节点个数
     */
    public Integer getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * 设置专用主节点个数
     * @param MasterNodeNum 专用主节点个数
     */
    public void setMasterNodeNum(Integer MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * 获取专用主节点CPU核数
     * @return MasterNodeCpuNum 专用主节点CPU核数
     */
    public Integer getMasterNodeCpuNum() {
        return this.MasterNodeCpuNum;
    }

    /**
     * 设置专用主节点CPU核数
     * @param MasterNodeCpuNum 专用主节点CPU核数
     */
    public void setMasterNodeCpuNum(Integer MasterNodeCpuNum) {
        this.MasterNodeCpuNum = MasterNodeCpuNum;
    }

    /**
     * 获取专用主节点内存大小，单位GB
     * @return MasterNodeMemSize 专用主节点内存大小，单位GB
     */
    public Integer getMasterNodeMemSize() {
        return this.MasterNodeMemSize;
    }

    /**
     * 设置专用主节点内存大小，单位GB
     * @param MasterNodeMemSize 专用主节点内存大小，单位GB
     */
    public void setMasterNodeMemSize(Integer MasterNodeMemSize) {
        this.MasterNodeMemSize = MasterNodeMemSize;
    }

    /**
     * 获取专用主节点磁盘大小，单位GB
     * @return MasterNodeDiskSize 专用主节点磁盘大小，单位GB
     */
    public Integer getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * 设置专用主节点磁盘大小，单位GB
     * @param MasterNodeDiskSize 专用主节点磁盘大小，单位GB
     */
    public void setMasterNodeDiskSize(Integer MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableDedicatedMaster", this.EnableDedicatedMaster);
        this.setParamSimple(map, prefix + "MasterNodeType", this.MasterNodeType);
        this.setParamSimple(map, prefix + "MasterNodeNum", this.MasterNodeNum);
        this.setParamSimple(map, prefix + "MasterNodeCpuNum", this.MasterNodeCpuNum);
        this.setParamSimple(map, prefix + "MasterNodeMemSize", this.MasterNodeMemSize);
        this.setParamSimple(map, prefix + "MasterNodeDiskSize", this.MasterNodeDiskSize);

    }
}

