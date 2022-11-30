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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSpec extends AbstractModel{

    /**
    * 规格名称，例如“SCH1"
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位G
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 系统盘描述信息
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskSpec SystemDisk;

    /**
    * 数据盘描述信息
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpec DataDisk;

    /**
    * 最大节点数目限制
    */
    @SerializedName("MaxNodeSize")
    @Expose
    private Long MaxNodeSize;

    /**
    * 是否可用，false代表售罄
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 规格描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeSpecDesc")
    @Expose
    private String ComputeSpecDesc;

    /**
    * 规格名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 库存数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceQuota")
    @Expose
    private Long InstanceQuota;

    /**
     * Get 规格名称，例如“SCH1" 
     * @return Name 规格名称，例如“SCH1"
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规格名称，例如“SCH1"
     * @param Name 规格名称，例如“SCH1"
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get cpu核数 
     * @return Cpu cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数
     * @param Cpu cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位G 
     * @return Mem 内存大小，单位G
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存大小，单位G
     * @param Mem 内存大小，单位G
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO 
     * @return Type 分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO
     * @param Type 分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 系统盘描述信息 
     * @return SystemDisk 系统盘描述信息
     */
    public DiskSpec getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘描述信息
     * @param SystemDisk 系统盘描述信息
     */
    public void setSystemDisk(DiskSpec SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 数据盘描述信息 
     * @return DataDisk 数据盘描述信息
     */
    public DiskSpec getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set 数据盘描述信息
     * @param DataDisk 数据盘描述信息
     */
    public void setDataDisk(DiskSpec DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get 最大节点数目限制 
     * @return MaxNodeSize 最大节点数目限制
     */
    public Long getMaxNodeSize() {
        return this.MaxNodeSize;
    }

    /**
     * Set 最大节点数目限制
     * @param MaxNodeSize 最大节点数目限制
     */
    public void setMaxNodeSize(Long MaxNodeSize) {
        this.MaxNodeSize = MaxNodeSize;
    }

    /**
     * Get 是否可用，false代表售罄
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Available 是否可用，false代表售罄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 是否可用，false代表售罄
注意：此字段可能返回 null，表示取不到有效值。
     * @param Available 是否可用，false代表售罄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 规格描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeSpecDesc 规格描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeSpecDesc() {
        return this.ComputeSpecDesc;
    }

    /**
     * Set 规格描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeSpecDesc 规格描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeSpecDesc(String ComputeSpecDesc) {
        this.ComputeSpecDesc = ComputeSpecDesc;
    }

    /**
     * Get 规格名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 规格名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 规格名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 规格名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 库存数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceQuota 库存数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceQuota() {
        return this.InstanceQuota;
    }

    /**
     * Set 库存数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceQuota 库存数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceQuota(Long InstanceQuota) {
        this.InstanceQuota = InstanceQuota;
    }

    public ResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpec(ResourceSpec source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new DiskSpec(source.SystemDisk);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DiskSpec(source.DataDisk);
        }
        if (source.MaxNodeSize != null) {
            this.MaxNodeSize = new Long(source.MaxNodeSize);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.ComputeSpecDesc != null) {
            this.ComputeSpecDesc = new String(source.ComputeSpecDesc);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.InstanceQuota != null) {
            this.InstanceQuota = new Long(source.InstanceQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamSimple(map, prefix + "MaxNodeSize", this.MaxNodeSize);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "ComputeSpecDesc", this.ComputeSpecDesc);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "InstanceQuota", this.InstanceQuota);

    }
}

