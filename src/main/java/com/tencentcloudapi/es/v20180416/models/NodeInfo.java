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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfo extends AbstractModel {

    /**
    * 节点数量
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点类型<li>hotData: 热数据节点</li>
<li>warmData: 冷数据节点</li>
<li>dedicatedMaster: 专用主节点</li>
默认值为hotData
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 节点磁盘容量（单位GB）
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 节点本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDiskInfo")
    @Expose
    private LocalDiskInfo LocalDiskInfo;

    /**
    * 节点磁盘块数
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 节点磁盘是否加密 0: 不加密，1: 加密；默认不加密
    */
    @SerializedName("DiskEncrypt")
    @Expose
    private Long DiskEncrypt;

    /**
    * cpu数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * /
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskEnhance")
    @Expose
    private Long DiskEnhance;

    /**
    * 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuInfo")
    @Expose
    private GpuInfo GpuInfo;

    /**
     * Get 节点数量 
     * @return NodeNum 节点数量
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 节点数量
     * @param NodeNum 节点数量
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li> 
     * @return NodeType 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @param NodeType 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点类型<li>hotData: 热数据节点</li>
<li>warmData: 冷数据节点</li>
<li>dedicatedMaster: 专用主节点</li>
默认值为hotData 
     * @return Type 节点类型<li>hotData: 热数据节点</li>
<li>warmData: 冷数据节点</li>
<li>dedicatedMaster: 专用主节点</li>
默认值为hotData
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 节点类型<li>hotData: 热数据节点</li>
<li>warmData: 冷数据节点</li>
<li>dedicatedMaster: 专用主节点</li>
默认值为hotData
     * @param Type 节点类型<li>hotData: 热数据节点</li>
<li>warmData: 冷数据节点</li>
<li>dedicatedMaster: 专用主节点</li>
默认值为hotData
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD 
     * @return DiskType 节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
     * @param DiskType 节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 节点磁盘容量（单位GB） 
     * @return DiskSize 节点磁盘容量（单位GB）
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 节点磁盘容量（单位GB）
     * @param DiskSize 节点磁盘容量（单位GB）
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 节点本地盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDiskInfo 节点本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalDiskInfo getLocalDiskInfo() {
        return this.LocalDiskInfo;
    }

    /**
     * Set 节点本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDiskInfo 节点本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDiskInfo(LocalDiskInfo LocalDiskInfo) {
        this.LocalDiskInfo = LocalDiskInfo;
    }

    /**
     * Get 节点磁盘块数 
     * @return DiskCount 节点磁盘块数
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 节点磁盘块数
     * @param DiskCount 节点磁盘块数
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 节点磁盘是否加密 0: 不加密，1: 加密；默认不加密 
     * @return DiskEncrypt 节点磁盘是否加密 0: 不加密，1: 加密；默认不加密
     */
    public Long getDiskEncrypt() {
        return this.DiskEncrypt;
    }

    /**
     * Set 节点磁盘是否加密 0: 不加密，1: 加密；默认不加密
     * @param DiskEncrypt 节点磁盘是否加密 0: 不加密，1: 加密；默认不加密
     */
    public void setDiskEncrypt(Long DiskEncrypt) {
        this.DiskEncrypt = DiskEncrypt;
    }

    /**
     * Get cpu数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuNum cpu数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set cpu数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuNum cpu数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize 内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get /
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskEnhance /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskEnhance() {
        return this.DiskEnhance;
    }

    /**
     * Set /
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskEnhance /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskEnhance(Long DiskEnhance) {
        this.DiskEnhance = DiskEnhance;
    }

    /**
     * Get 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuInfo 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GpuInfo getGpuInfo() {
        return this.GpuInfo;
    }

    /**
     * Set 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuInfo 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuInfo(GpuInfo GpuInfo) {
        this.GpuInfo = GpuInfo;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.LocalDiskInfo != null) {
            this.LocalDiskInfo = new LocalDiskInfo(source.LocalDiskInfo);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.DiskEncrypt != null) {
            this.DiskEncrypt = new Long(source.DiskEncrypt);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.DiskEnhance != null) {
            this.DiskEnhance = new Long(source.DiskEnhance);
        }
        if (source.GpuInfo != null) {
            this.GpuInfo = new GpuInfo(source.GpuInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamObj(map, prefix + "LocalDiskInfo.", this.LocalDiskInfo);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "DiskEncrypt", this.DiskEncrypt);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskEnhance", this.DiskEnhance);
        this.setParamObj(map, prefix + "GpuInfo.", this.GpuInfo);

    }
}

