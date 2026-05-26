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
    * <p>节点数量</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>节点类型<li>hotData: 热数据节点</li></p><li>warmData: 冷数据节点</li><li>dedicatedMaster: 专用主节点</li>默认值为hotData
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>节点磁盘容量（单位GB）</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>节点本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDiskInfo")
    @Expose
    private LocalDiskInfo LocalDiskInfo;

    /**
    * <p>节点磁盘块数</p>
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * <p>节点磁盘是否加密 0: 不加密，1: 加密；默认不加密</p>
    */
    @SerializedName("DiskEncrypt")
    @Expose
    private Long DiskEncrypt;

    /**
    * <p>自定义加密密钥id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>自定义加密密钥name</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyName")
    @Expose
    private String KmsKeyName;

    /**
    * <p>cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * <p>内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>硬盘额外性能</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskEnhance")
    @Expose
    private Long DiskEnhance;

    /**
    * <p>节点Gpu信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuInfo")
    @Expose
    private GpuInfo GpuInfo;

    /**
     * Get <p>节点数量</p> 
     * @return NodeNum <p>节点数量</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>节点数量</p>
     * @param NodeNum <p>节点数量</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p> 
     * @return NodeType <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     * @param NodeType <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>节点类型<li>hotData: 热数据节点</li></p><li>warmData: 冷数据节点</li><li>dedicatedMaster: 专用主节点</li>默认值为hotData 
     * @return Type <p>节点类型<li>hotData: 热数据节点</li></p><li>warmData: 冷数据节点</li><li>dedicatedMaster: 专用主节点</li>默认值为hotData
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>节点类型<li>hotData: 热数据节点</li></p><li>warmData: 冷数据节点</li><li>dedicatedMaster: 专用主节点</li>默认值为hotData
     * @param Type <p>节点类型<li>hotData: 热数据节点</li></p><li>warmData: 冷数据节点</li><li>dedicatedMaster: 专用主节点</li>默认值为hotData
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD</p> 
     * @return DiskType <p>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD</p>
     * @param DiskType <p>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>节点磁盘容量（单位GB）</p> 
     * @return DiskSize <p>节点磁盘容量（单位GB）</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>节点磁盘容量（单位GB）</p>
     * @param DiskSize <p>节点磁盘容量（单位GB）</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>节点本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDiskInfo <p>节点本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalDiskInfo getLocalDiskInfo() {
        return this.LocalDiskInfo;
    }

    /**
     * Set <p>节点本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDiskInfo <p>节点本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDiskInfo(LocalDiskInfo LocalDiskInfo) {
        this.LocalDiskInfo = LocalDiskInfo;
    }

    /**
     * Get <p>节点磁盘块数</p> 
     * @return DiskCount <p>节点磁盘块数</p>
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set <p>节点磁盘块数</p>
     * @param DiskCount <p>节点磁盘块数</p>
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get <p>节点磁盘是否加密 0: 不加密，1: 加密；默认不加密</p> 
     * @return DiskEncrypt <p>节点磁盘是否加密 0: 不加密，1: 加密；默认不加密</p>
     */
    public Long getDiskEncrypt() {
        return this.DiskEncrypt;
    }

    /**
     * Set <p>节点磁盘是否加密 0: 不加密，1: 加密；默认不加密</p>
     * @param DiskEncrypt <p>节点磁盘是否加密 0: 不加密，1: 加密；默认不加密</p>
     */
    public void setDiskEncrypt(Long DiskEncrypt) {
        this.DiskEncrypt = DiskEncrypt;
    }

    /**
     * Get <p>自定义加密密钥id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyId <p>自定义加密密钥id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>自定义加密密钥id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyId <p>自定义加密密钥id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>自定义加密密钥name</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyName <p>自定义加密密钥name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyName() {
        return this.KmsKeyName;
    }

    /**
     * Set <p>自定义加密密钥name</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyName <p>自定义加密密钥name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyName(String KmsKeyName) {
        this.KmsKeyName = KmsKeyName;
    }

    /**
     * Get <p>cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuNum <p>cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set <p>cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuNum <p>cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get <p>内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize <p>内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize <p>内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>硬盘额外性能</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskEnhance <p>硬盘额外性能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskEnhance() {
        return this.DiskEnhance;
    }

    /**
     * Set <p>硬盘额外性能</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskEnhance <p>硬盘额外性能</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskEnhance(Long DiskEnhance) {
        this.DiskEnhance = DiskEnhance;
    }

    /**
     * Get <p>节点Gpu信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuInfo <p>节点Gpu信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GpuInfo getGpuInfo() {
        return this.GpuInfo;
    }

    /**
     * Set <p>节点Gpu信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuInfo <p>节点Gpu信息</p>
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
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.KmsKeyName != null) {
            this.KmsKeyName = new String(source.KmsKeyName);
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
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KmsKeyName", this.KmsKeyName);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskEnhance", this.DiskEnhance);
        this.setParamObj(map, prefix + "GpuInfo.", this.GpuInfo);

    }
}

