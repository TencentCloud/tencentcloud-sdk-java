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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeQuotaItem  extends AbstractModel{

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[CDH](https://cloud.tencent.com/document/product/416)付费，即只对CDH计费，不对CDH上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 网卡类型，例如：25代表25G网卡
    */
    @SerializedName("NetworkCard")
    @Expose
    private Integer NetworkCard;

    /**
    * 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * 实例的CPU核数，单位：核。
    */
    @SerializedName("Cpu")
    @Expose
    private Integer Cpu;

    /**
    * 实例内存容量，单位：`GB`。
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例机型系列。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 机型名称。
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
    */
    @SerializedName("LocalDiskTypeList")
    @Expose
    private LocalDiskType [] LocalDiskTypeList;

    /**
    * 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例的售卖价格。
    */
    @SerializedName("Price")
    @Expose
    private ItemPrice Price;

    /**
     * 获取可用区。
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例机型。
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[CDH](https://cloud.tencent.com/document/product/416)付费，即只对CDH计费，不对CDH上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     * @return InstanceChargeType 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[CDH](https://cloud.tencent.com/document/product/416)付费，即只对CDH计费，不对CDH上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * 设置实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[CDH](https://cloud.tencent.com/document/product/416)付费，即只对CDH计费，不对CDH上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     * @param InstanceChargeType 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[CDH](https://cloud.tencent.com/document/product/416)付费，即只对CDH计费，不对CDH上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * 获取网卡类型，例如：25代表25G网卡
     * @return NetworkCard 网卡类型，例如：25代表25G网卡
     */
    public Integer getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * 设置网卡类型，例如：25代表25G网卡
     * @param NetworkCard 网卡类型，例如：25代表25G网卡
     */
    public void setNetworkCard(Integer NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * 获取扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Externals 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * 设置扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Externals 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * 获取实例的CPU核数，单位：核。
     * @return Cpu 实例的CPU核数，单位：核。
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * 设置实例的CPU核数，单位：核。
     * @param Cpu 实例的CPU核数，单位：核。
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取实例内存容量，单位：`GB`。
     * @return Memory 实例内存容量，单位：`GB`。
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例内存容量，单位：`GB`。
     * @param Memory 实例内存容量，单位：`GB`。
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例机型系列。
     * @return InstanceFamily 实例机型系列。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * 设置实例机型系列。
     * @param InstanceFamily 实例机型系列。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * 获取机型名称。
     * @return TypeName 机型名称。
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * 设置机型名称。
     * @param TypeName 机型名称。
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * 获取本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
     * @return LocalDiskTypeList 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
     */
    public LocalDiskType [] getLocalDiskTypeList() {
        return this.LocalDiskTypeList;
    }

    /**
     * 设置本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
     * @param LocalDiskTypeList 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
     */
    public void setLocalDiskTypeList(LocalDiskType [] LocalDiskTypeList) {
        this.LocalDiskTypeList = LocalDiskTypeList;
    }

    /**
     * 获取实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     * @return Status 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     * @param Status 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取实例的售卖价格。
     * @return Price 实例的售卖价格。
     */
    public ItemPrice getPrice() {
        return this.Price;
    }

    /**
     * 设置实例的售卖价格。
     * @param Price 实例的售卖价格。
     */
    public void setPrice(ItemPrice Price) {
        this.Price = Price;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArrayObj(map, prefix + "LocalDiskTypeList.", this.LocalDiskTypeList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Price.", this.Price);

    }
}

