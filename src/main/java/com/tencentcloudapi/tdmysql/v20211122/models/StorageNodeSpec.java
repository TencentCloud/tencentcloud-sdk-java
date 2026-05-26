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

public class StorageNodeSpec extends AbstractModel {

    /**
    * <p>规格码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

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
    * <p>存储节点最大数量</p>
    */
    @SerializedName("StorageNodeMaxNum")
    @Expose
    private Long StorageNodeMaxNum;

    /**
    * <p>存储节点磁盘大小上限</p>
    */
    @SerializedName("StorageNodeMaxDisk")
    @Expose
    private Long StorageNodeMaxDisk;

    /**
    * <p>存储节点最小数量</p>
    */
    @SerializedName("StorageNodeMinNum")
    @Expose
    private Long StorageNodeMinNum;

    /**
    * <p>存储节点磁盘大小下限</p>
    */
    @SerializedName("StorageNodeMinDisk")
    @Expose
    private Long StorageNodeMinDisk;

    /**
    * <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>存储节点默认磁盘大小，用于前端展示</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageNodeDefaultDisk")
    @Expose
    private Long StorageNodeDefaultDisk;

    /**
    * <p>规格支持计费模式列表</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String [] InstanceMode;

    /**
    * <p>磁盘类型CLOUD_DISK：云盘LOCAL_DISK：本地盘</p>
    */
    @SerializedName("DiskTypeCategory")
    @Expose
    private String DiskTypeCategory;

    /**
     * Get <p>规格码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecCode <p>规格码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>规格码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecCode <p>规格码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
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
     * Get <p>存储节点最大数量</p> 
     * @return StorageNodeMaxNum <p>存储节点最大数量</p>
     */
    public Long getStorageNodeMaxNum() {
        return this.StorageNodeMaxNum;
    }

    /**
     * Set <p>存储节点最大数量</p>
     * @param StorageNodeMaxNum <p>存储节点最大数量</p>
     */
    public void setStorageNodeMaxNum(Long StorageNodeMaxNum) {
        this.StorageNodeMaxNum = StorageNodeMaxNum;
    }

    /**
     * Get <p>存储节点磁盘大小上限</p> 
     * @return StorageNodeMaxDisk <p>存储节点磁盘大小上限</p>
     */
    public Long getStorageNodeMaxDisk() {
        return this.StorageNodeMaxDisk;
    }

    /**
     * Set <p>存储节点磁盘大小上限</p>
     * @param StorageNodeMaxDisk <p>存储节点磁盘大小上限</p>
     */
    public void setStorageNodeMaxDisk(Long StorageNodeMaxDisk) {
        this.StorageNodeMaxDisk = StorageNodeMaxDisk;
    }

    /**
     * Get <p>存储节点最小数量</p> 
     * @return StorageNodeMinNum <p>存储节点最小数量</p>
     */
    public Long getStorageNodeMinNum() {
        return this.StorageNodeMinNum;
    }

    /**
     * Set <p>存储节点最小数量</p>
     * @param StorageNodeMinNum <p>存储节点最小数量</p>
     */
    public void setStorageNodeMinNum(Long StorageNodeMinNum) {
        this.StorageNodeMinNum = StorageNodeMinNum;
    }

    /**
     * Get <p>存储节点磁盘大小下限</p> 
     * @return StorageNodeMinDisk <p>存储节点磁盘大小下限</p>
     */
    public Long getStorageNodeMinDisk() {
        return this.StorageNodeMinDisk;
    }

    /**
     * Set <p>存储节点磁盘大小下限</p>
     * @param StorageNodeMinDisk <p>存储节点磁盘大小下限</p>
     */
    public void setStorageNodeMinDisk(Long StorageNodeMinDisk) {
        this.StorageNodeMinDisk = StorageNodeMinDisk;
    }

    /**
     * Get <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>存储节点默认磁盘大小，用于前端展示</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageNodeDefaultDisk <p>存储节点默认磁盘大小，用于前端展示</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageNodeDefaultDisk() {
        return this.StorageNodeDefaultDisk;
    }

    /**
     * Set <p>存储节点默认磁盘大小，用于前端展示</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageNodeDefaultDisk <p>存储节点默认磁盘大小，用于前端展示</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageNodeDefaultDisk(Long StorageNodeDefaultDisk) {
        this.StorageNodeDefaultDisk = StorageNodeDefaultDisk;
    }

    /**
     * Get <p>规格支持计费模式列表</p> 
     * @return InstanceMode <p>规格支持计费模式列表</p>
     */
    public String [] getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>规格支持计费模式列表</p>
     * @param InstanceMode <p>规格支持计费模式列表</p>
     */
    public void setInstanceMode(String [] InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>磁盘类型CLOUD_DISK：云盘LOCAL_DISK：本地盘</p> 
     * @return DiskTypeCategory <p>磁盘类型CLOUD_DISK：云盘LOCAL_DISK：本地盘</p>
     */
    public String getDiskTypeCategory() {
        return this.DiskTypeCategory;
    }

    /**
     * Set <p>磁盘类型CLOUD_DISK：云盘LOCAL_DISK：本地盘</p>
     * @param DiskTypeCategory <p>磁盘类型CLOUD_DISK：云盘LOCAL_DISK：本地盘</p>
     */
    public void setDiskTypeCategory(String DiskTypeCategory) {
        this.DiskTypeCategory = DiskTypeCategory;
    }

    public StorageNodeSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageNodeSpec(StorageNodeSpec source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.StorageNodeMaxNum != null) {
            this.StorageNodeMaxNum = new Long(source.StorageNodeMaxNum);
        }
        if (source.StorageNodeMaxDisk != null) {
            this.StorageNodeMaxDisk = new Long(source.StorageNodeMaxDisk);
        }
        if (source.StorageNodeMinNum != null) {
            this.StorageNodeMinNum = new Long(source.StorageNodeMinNum);
        }
        if (source.StorageNodeMinDisk != null) {
            this.StorageNodeMinDisk = new Long(source.StorageNodeMinDisk);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageNodeDefaultDisk != null) {
            this.StorageNodeDefaultDisk = new Long(source.StorageNodeDefaultDisk);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String[source.InstanceMode.length];
            for (int i = 0; i < source.InstanceMode.length; i++) {
                this.InstanceMode[i] = new String(source.InstanceMode[i]);
            }
        }
        if (source.DiskTypeCategory != null) {
            this.DiskTypeCategory = new String(source.DiskTypeCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "StorageNodeMaxNum", this.StorageNodeMaxNum);
        this.setParamSimple(map, prefix + "StorageNodeMaxDisk", this.StorageNodeMaxDisk);
        this.setParamSimple(map, prefix + "StorageNodeMinNum", this.StorageNodeMinNum);
        this.setParamSimple(map, prefix + "StorageNodeMinDisk", this.StorageNodeMinDisk);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageNodeDefaultDisk", this.StorageNodeDefaultDisk);
        this.setParamArraySimple(map, prefix + "InstanceMode.", this.InstanceMode);
        this.setParamSimple(map, prefix + "DiskTypeCategory", this.DiskTypeCategory);

    }
}

