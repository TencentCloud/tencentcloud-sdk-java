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
    * <p>规格</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>4</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>8，单位G</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>排序，越小排的越前</p>
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * <p>数量</p>
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * <p>售罄原因</p>
    */
    @SerializedName("SellOutReason")
    @Expose
    private String SellOutReason;

    /**
    * <p>系统盘</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDisk")
    @Expose
    private NodeSpecDisk [] SystemDisk;

    /**
    * <p>数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisk")
    @Expose
    private NodeSpecDisk [] DataDisk;

    /**
    * <p>本地数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDataDisk")
    @Expose
    private NodeSpecDisk [] LocalDataDisk;

    /**
    * <p>售罄原因</p>
    */
    @SerializedName("SoldOutReason")
    @Expose
    private String SoldOutReason;

    /**
    * <p>机型类别</p>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * <p>节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>节点类型</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>类别</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>类别名称</p>
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * <p>类别分类</p>
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
    * <p>cpu类型</p>
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * <p>售罄 RunOut、库存少 Less、充足 Enough</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>原价</p>
    */
    @SerializedName("OriginPrice")
    @Expose
    private Float OriginPrice;

    /**
    * <p>包销计费机型支持的购买时长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
    * <p>GPU信息</p>
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
    * <p>配额数量</p>
    */
    @SerializedName("QuotaNum")
    @Expose
    private Long QuotaNum;

    /**
    * <p>配额单位</p>
    */
    @SerializedName("QuotaUnit")
    @Expose
    private String QuotaUnit;

    /**
     * Get <p>规格</p> 
     * @return InstanceType <p>规格</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>规格</p>
     * @param InstanceType <p>规格</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>4</p> 
     * @return Cpu <p>4</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>4</p>
     * @param Cpu <p>4</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>8，单位G</p> 
     * @return Memory <p>8，单位G</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>8，单位G</p>
     * @param Memory <p>8，单位G</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>排序，越小排的越前</p> 
     * @return Order <p>排序，越小排的越前</p>
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序，越小排的越前</p>
     * @param Order <p>排序，越小排的越前</p>
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get <p>数量</p> 
     * @return Num <p>数量</p>
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set <p>数量</p>
     * @param Num <p>数量</p>
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get <p>售罄原因</p> 
     * @return SellOutReason <p>售罄原因</p>
     */
    public String getSellOutReason() {
        return this.SellOutReason;
    }

    /**
     * Set <p>售罄原因</p>
     * @param SellOutReason <p>售罄原因</p>
     */
    public void setSellOutReason(String SellOutReason) {
        this.SellOutReason = SellOutReason;
    }

    /**
     * Get <p>系统盘</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDisk <p>系统盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecDisk [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>系统盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDisk <p>系统盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDisk(NodeSpecDisk [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisk <p>数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecDisk [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set <p>数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisk <p>数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisk(NodeSpecDisk [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get <p>本地数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDataDisk <p>本地数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecDisk [] getLocalDataDisk() {
        return this.LocalDataDisk;
    }

    /**
     * Set <p>本地数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDataDisk <p>本地数据盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDataDisk(NodeSpecDisk [] LocalDataDisk) {
        this.LocalDataDisk = LocalDataDisk;
    }

    /**
     * Get <p>售罄原因</p> 
     * @return SoldOutReason <p>售罄原因</p>
     */
    public String getSoldOutReason() {
        return this.SoldOutReason;
    }

    /**
     * Set <p>售罄原因</p>
     * @param SoldOutReason <p>售罄原因</p>
     */
    public void setSoldOutReason(String SoldOutReason) {
        this.SoldOutReason = SoldOutReason;
    }

    /**
     * Get <p>机型类别</p> 
     * @return InstanceFamily <p>机型类别</p>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set <p>机型类别</p>
     * @param InstanceFamily <p>机型类别</p>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get <p>节点名称</p> 
     * @return NodeName <p>节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p>
     * @param NodeName <p>节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>节点类型</p> 
     * @return NodeType <p>节点类型</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型</p>
     * @param NodeType <p>节点类型</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>类别</p> 
     * @return Type <p>类别</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类别</p>
     * @param Type <p>类别</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>类别名称</p> 
     * @return TypeName <p>类别名称</p>
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set <p>类别名称</p>
     * @param TypeName <p>类别名称</p>
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get <p>类别分类</p> 
     * @return FamilyName <p>类别分类</p>
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set <p>类别分类</p>
     * @param FamilyName <p>类别分类</p>
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    /**
     * Get <p>cpu类型</p> 
     * @return CpuType <p>cpu类型</p>
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set <p>cpu类型</p>
     * @param CpuType <p>cpu类型</p>
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get <p>售罄 RunOut、库存少 Less、充足 Enough</p> 
     * @return Remark <p>售罄 RunOut、库存少 Less、充足 Enough</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>售罄 RunOut、库存少 Less、充足 Enough</p>
     * @param Remark <p>售罄 RunOut、库存少 Less、充足 Enough</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>原价</p> 
     * @return OriginPrice <p>原价</p>
     */
    public Float getOriginPrice() {
        return this.OriginPrice;
    }

    /**
     * Set <p>原价</p>
     * @param OriginPrice <p>原价</p>
     */
    public void setOriginPrice(Float OriginPrice) {
        this.OriginPrice = OriginPrice;
    }

    /**
     * Get <p>包销计费机型支持的购买时长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepaidUnderwritePeriods <p>包销计费机型支持的购买时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set <p>包销计费机型支持的购买时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepaidUnderwritePeriods <p>包销计费机型支持的购买时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
    }

    /**
     * Get <p>GPU信息</p> 
     * @return GpuDesc <p>GPU信息</p>
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set <p>GPU信息</p>
     * @param GpuDesc <p>GPU信息</p>
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    /**
     * Get <p>配额数量</p> 
     * @return QuotaNum <p>配额数量</p>
     */
    public Long getQuotaNum() {
        return this.QuotaNum;
    }

    /**
     * Set <p>配额数量</p>
     * @param QuotaNum <p>配额数量</p>
     */
    public void setQuotaNum(Long QuotaNum) {
        this.QuotaNum = QuotaNum;
    }

    /**
     * Get <p>配额单位</p> 
     * @return QuotaUnit <p>配额单位</p>
     */
    public String getQuotaUnit() {
        return this.QuotaUnit;
    }

    /**
     * Set <p>配额单位</p>
     * @param QuotaUnit <p>配额单位</p>
     */
    public void setQuotaUnit(String QuotaUnit) {
        this.QuotaUnit = QuotaUnit;
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
        if (source.QuotaNum != null) {
            this.QuotaNum = new Long(source.QuotaNum);
        }
        if (source.QuotaUnit != null) {
            this.QuotaUnit = new String(source.QuotaUnit);
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
        this.setParamSimple(map, prefix + "QuotaNum", this.QuotaNum);
        this.setParamSimple(map, prefix + "QuotaUnit", this.QuotaUnit);

    }
}

