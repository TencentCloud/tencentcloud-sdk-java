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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeSpecInstanceType extends AbstractModel {

    /**
    * 规格
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 4
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 8，单位G
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 排序，越小排的越前
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 数量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 售罄原因
    */
    @SerializedName("SellOutReason")
    @Expose
    private String SellOutReason;

    /**
    * 系统盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDisk")
    @Expose
    private NodeSpecDisk [] SystemDisk;

    /**
    * 数据盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisk")
    @Expose
    private NodeSpecDisk [] DataDisk;

    /**
    * 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDataDisk")
    @Expose
    private NodeSpecDisk [] LocalDataDisk;

    /**
    * 售罄原因
    */
    @SerializedName("SoldOutReason")
    @Expose
    private String SoldOutReason;

    /**
    * 机型类别
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 类别
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 类别名称
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 类别分类
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
    * cpu类型
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * 售罄 RunOut、库存少 Less、充足 Enough
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 原价
    */
    @SerializedName("OriginPrice")
    @Expose
    private Float OriginPrice;

    /**
    * 包销计费机型支持的购买时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
    * GPU信息
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
     * Get 规格 
     * @return InstanceType 规格
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 规格
     * @param InstanceType 规格
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 4 
     * @return Cpu 4
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 4
     * @param Cpu 4
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 8，单位G 
     * @return Memory 8，单位G
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 8，单位G
     * @param Memory 8，单位G
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 排序，越小排的越前 
     * @return Order 排序，越小排的越前
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序，越小排的越前
     * @param Order 排序，越小排的越前
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 数量 
     * @return Num 数量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 数量
     * @param Num 数量
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 售罄原因 
     * @return SellOutReason 售罄原因
     */
    public String getSellOutReason() {
        return this.SellOutReason;
    }

    /**
     * Set 售罄原因
     * @param SellOutReason 售罄原因
     */
    public void setSellOutReason(String SellOutReason) {
        this.SellOutReason = SellOutReason;
    }

    /**
     * Get 系统盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDisk 系统盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecDisk [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDisk 系统盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDisk(NodeSpecDisk [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 数据盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisk 数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecDisk [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set 数据盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisk 数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisk(NodeSpecDisk [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDataDisk 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecDisk [] getLocalDataDisk() {
        return this.LocalDataDisk;
    }

    /**
     * Set 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDataDisk 本地数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDataDisk(NodeSpecDisk [] LocalDataDisk) {
        this.LocalDataDisk = LocalDataDisk;
    }

    /**
     * Get 售罄原因 
     * @return SoldOutReason 售罄原因
     */
    public String getSoldOutReason() {
        return this.SoldOutReason;
    }

    /**
     * Set 售罄原因
     * @param SoldOutReason 售罄原因
     */
    public void setSoldOutReason(String SoldOutReason) {
        this.SoldOutReason = SoldOutReason;
    }

    /**
     * Get 机型类别 
     * @return InstanceFamily 机型类别
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 机型类别
     * @param InstanceFamily 机型类别
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点类型 
     * @return NodeType 节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
     * @param NodeType 节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 类别 
     * @return Type 类别
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类别
     * @param Type 类别
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 类别名称 
     * @return TypeName 类别名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 类别名称
     * @param TypeName 类别名称
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 类别分类 
     * @return FamilyName 类别分类
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set 类别分类
     * @param FamilyName 类别分类
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    /**
     * Get cpu类型 
     * @return CpuType cpu类型
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set cpu类型
     * @param CpuType cpu类型
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get 售罄 RunOut、库存少 Less、充足 Enough 
     * @return Remark 售罄 RunOut、库存少 Less、充足 Enough
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 售罄 RunOut、库存少 Less、充足 Enough
     * @param Remark 售罄 RunOut、库存少 Less、充足 Enough
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 原价 
     * @return OriginPrice 原价
     */
    public Float getOriginPrice() {
        return this.OriginPrice;
    }

    /**
     * Set 原价
     * @param OriginPrice 原价
     */
    public void setOriginPrice(Float OriginPrice) {
        this.OriginPrice = OriginPrice;
    }

    /**
     * Get 包销计费机型支持的购买时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepaidUnderwritePeriods 包销计费机型支持的购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set 包销计费机型支持的购买时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepaidUnderwritePeriods 包销计费机型支持的购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
    }

    /**
     * Get GPU信息 
     * @return GpuDesc GPU信息
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set GPU信息
     * @param GpuDesc GPU信息
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    public NodeSpecInstanceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecInstanceType(NodeSpecInstanceType source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.SellOutReason != null) {
            this.SellOutReason = new String(source.SellOutReason);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new NodeSpecDisk[source.SystemDisk.length];
            for (int i = 0; i < source.SystemDisk.length; i++) {
                this.SystemDisk[i] = new NodeSpecDisk(source.SystemDisk[i]);
            }
        }
        if (source.DataDisk != null) {
            this.DataDisk = new NodeSpecDisk[source.DataDisk.length];
            for (int i = 0; i < source.DataDisk.length; i++) {
                this.DataDisk[i] = new NodeSpecDisk(source.DataDisk[i]);
            }
        }
        if (source.LocalDataDisk != null) {
            this.LocalDataDisk = new NodeSpecDisk[source.LocalDataDisk.length];
            for (int i = 0; i < source.LocalDataDisk.length; i++) {
                this.LocalDataDisk[i] = new NodeSpecDisk(source.LocalDataDisk[i]);
            }
        }
        if (source.SoldOutReason != null) {
            this.SoldOutReason = new String(source.SoldOutReason);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.FamilyName != null) {
            this.FamilyName = new String(source.FamilyName);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OriginPrice != null) {
            this.OriginPrice = new Float(source.OriginPrice);
        }
        if (source.PrepaidUnderwritePeriods != null) {
            this.PrepaidUnderwritePeriods = new Long[source.PrepaidUnderwritePeriods.length];
            for (int i = 0; i < source.PrepaidUnderwritePeriods.length; i++) {
                this.PrepaidUnderwritePeriods[i] = new Long(source.PrepaidUnderwritePeriods[i]);
            }
        }
        if (source.GpuDesc != null) {
            this.GpuDesc = new String(source.GpuDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "SellOutReason", this.SellOutReason);
        this.setParamArrayObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamArrayObj(map, prefix + "LocalDataDisk.", this.LocalDataDisk);
        this.setParamSimple(map, prefix + "SoldOutReason", this.SoldOutReason);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "FamilyName", this.FamilyName);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OriginPrice", this.OriginPrice);
        this.setParamArraySimple(map, prefix + "PrepaidUnderwritePeriods.", this.PrepaidUnderwritePeriods);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);

    }
}

