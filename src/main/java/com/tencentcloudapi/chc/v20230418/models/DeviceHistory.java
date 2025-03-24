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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceHistory extends AbstractModel {

    /**
    * 设备sn
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 机架名
    */
    @SerializedName("RackName")
    @Expose
    private String RackName;

    /**
    * 机位号
    */
    @SerializedName("PositionCode")
    @Expose
    private Long PositionCode;

    /**
    * 机房id
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 机房管理单元id
    */
    @SerializedName("IdcUnitId")
    @Expose
    private Long IdcUnitId;

    /**
    * 机房管理单元名称
    */
    @SerializedName("IdcUnitName")
    @Expose
    private String IdcUnitName;

    /**
    * 固资号
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 设备型号-版本，只有收货单详情返回
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 设备高度，只有收货单详情返回
    */
    @SerializedName("DeviceHeight")
    @Expose
    private String DeviceHeight;

    /**
    * 需要万兆机位，只有收货单详情返回
    */
    @SerializedName("Need10GbSlot")
    @Expose
    private String Need10GbSlot;

    /**
    * 需要直流电，只有收货单详情返回
    */
    @SerializedName("NeedDCPower")
    @Expose
    private String NeedDCPower;

    /**
    * 需要外网，只有收货单详情返回
    */
    @SerializedName("NeedExtranet")
    @Expose
    private String NeedExtranet;

    /**
    * 需要虚拟化，只有收货单详情返回
    */
    @SerializedName("NeedVirtualization")
    @Expose
    private String NeedVirtualization;

    /**
    * 厂商,只有收货单详情返回
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 硬件备注
    */
    @SerializedName("HardwareMemo")
    @Expose
    private String HardwareMemo;

    /**
    * 目标机架
    */
    @SerializedName("DstRackName")
    @Expose
    private String DstRackName;

    /**
    * 目标机位
    */
    @SerializedName("DstPositionCode")
    @Expose
    private String DstPositionCode;

    /**
    * 目标ip
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 设备子类型, 其他设备/线材用
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 线材-数量，只有收货单详情返回
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * 计量单位，，只有收货单详情返回，'箱', '卷', '套'
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 线材-收货凭证号，只有收货单详情返回
    */
    @SerializedName("ReceiptNumber")
    @Expose
    private String ReceiptNumber;

    /**
     * Get 设备sn 
     * @return Sn 设备sn
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set 设备sn
     * @param Sn 设备sn
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 设备类型 
     * @return DeviceType 设备类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
     * @param DeviceType 设备类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 机架名 
     * @return RackName 机架名
     */
    public String getRackName() {
        return this.RackName;
    }

    /**
     * Set 机架名
     * @param RackName 机架名
     */
    public void setRackName(String RackName) {
        this.RackName = RackName;
    }

    /**
     * Get 机位号 
     * @return PositionCode 机位号
     */
    public Long getPositionCode() {
        return this.PositionCode;
    }

    /**
     * Set 机位号
     * @param PositionCode 机位号
     */
    public void setPositionCode(Long PositionCode) {
        this.PositionCode = PositionCode;
    }

    /**
     * Get 机房id 
     * @return IdcId 机房id
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机房id
     * @param IdcId 机房id
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 机房名称 
     * @return IdcName 机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 机房名称
     * @param IdcName 机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 机房管理单元id 
     * @return IdcUnitId 机房管理单元id
     */
    public Long getIdcUnitId() {
        return this.IdcUnitId;
    }

    /**
     * Set 机房管理单元id
     * @param IdcUnitId 机房管理单元id
     */
    public void setIdcUnitId(Long IdcUnitId) {
        this.IdcUnitId = IdcUnitId;
    }

    /**
     * Get 机房管理单元名称 
     * @return IdcUnitName 机房管理单元名称
     */
    public String getIdcUnitName() {
        return this.IdcUnitName;
    }

    /**
     * Set 机房管理单元名称
     * @param IdcUnitName 机房管理单元名称
     */
    public void setIdcUnitName(String IdcUnitName) {
        this.IdcUnitName = IdcUnitName;
    }

    /**
     * Get 固资号 
     * @return AssetId 固资号
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 固资号
     * @param AssetId 固资号
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 设备型号-版本，只有收货单详情返回 
     * @return ModelVersion 设备型号-版本，只有收货单详情返回
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 设备型号-版本，只有收货单详情返回
     * @param ModelVersion 设备型号-版本，只有收货单详情返回
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 设备高度，只有收货单详情返回 
     * @return DeviceHeight 设备高度，只有收货单详情返回
     */
    public String getDeviceHeight() {
        return this.DeviceHeight;
    }

    /**
     * Set 设备高度，只有收货单详情返回
     * @param DeviceHeight 设备高度，只有收货单详情返回
     */
    public void setDeviceHeight(String DeviceHeight) {
        this.DeviceHeight = DeviceHeight;
    }

    /**
     * Get 需要万兆机位，只有收货单详情返回 
     * @return Need10GbSlot 需要万兆机位，只有收货单详情返回
     */
    public String getNeed10GbSlot() {
        return this.Need10GbSlot;
    }

    /**
     * Set 需要万兆机位，只有收货单详情返回
     * @param Need10GbSlot 需要万兆机位，只有收货单详情返回
     */
    public void setNeed10GbSlot(String Need10GbSlot) {
        this.Need10GbSlot = Need10GbSlot;
    }

    /**
     * Get 需要直流电，只有收货单详情返回 
     * @return NeedDCPower 需要直流电，只有收货单详情返回
     */
    public String getNeedDCPower() {
        return this.NeedDCPower;
    }

    /**
     * Set 需要直流电，只有收货单详情返回
     * @param NeedDCPower 需要直流电，只有收货单详情返回
     */
    public void setNeedDCPower(String NeedDCPower) {
        this.NeedDCPower = NeedDCPower;
    }

    /**
     * Get 需要外网，只有收货单详情返回 
     * @return NeedExtranet 需要外网，只有收货单详情返回
     */
    public String getNeedExtranet() {
        return this.NeedExtranet;
    }

    /**
     * Set 需要外网，只有收货单详情返回
     * @param NeedExtranet 需要外网，只有收货单详情返回
     */
    public void setNeedExtranet(String NeedExtranet) {
        this.NeedExtranet = NeedExtranet;
    }

    /**
     * Get 需要虚拟化，只有收货单详情返回 
     * @return NeedVirtualization 需要虚拟化，只有收货单详情返回
     */
    public String getNeedVirtualization() {
        return this.NeedVirtualization;
    }

    /**
     * Set 需要虚拟化，只有收货单详情返回
     * @param NeedVirtualization 需要虚拟化，只有收货单详情返回
     */
    public void setNeedVirtualization(String NeedVirtualization) {
        this.NeedVirtualization = NeedVirtualization;
    }

    /**
     * Get 厂商,只有收货单详情返回 
     * @return Manufacturer 厂商,只有收货单详情返回
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 厂商,只有收货单详情返回
     * @param Manufacturer 厂商,只有收货单详情返回
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 硬件备注 
     * @return HardwareMemo 硬件备注
     */
    public String getHardwareMemo() {
        return this.HardwareMemo;
    }

    /**
     * Set 硬件备注
     * @param HardwareMemo 硬件备注
     */
    public void setHardwareMemo(String HardwareMemo) {
        this.HardwareMemo = HardwareMemo;
    }

    /**
     * Get 目标机架 
     * @return DstRackName 目标机架
     */
    public String getDstRackName() {
        return this.DstRackName;
    }

    /**
     * Set 目标机架
     * @param DstRackName 目标机架
     */
    public void setDstRackName(String DstRackName) {
        this.DstRackName = DstRackName;
    }

    /**
     * Get 目标机位 
     * @return DstPositionCode 目标机位
     */
    public String getDstPositionCode() {
        return this.DstPositionCode;
    }

    /**
     * Set 目标机位
     * @param DstPositionCode 目标机位
     */
    public void setDstPositionCode(String DstPositionCode) {
        this.DstPositionCode = DstPositionCode;
    }

    /**
     * Get 目标ip 
     * @return DstIp 目标ip
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标ip
     * @param DstIp 目标ip
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 设备子类型, 其他设备/线材用 
     * @return TypeName 设备子类型, 其他设备/线材用
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 设备子类型, 其他设备/线材用
     * @param TypeName 设备子类型, 其他设备/线材用
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 线材-数量，只有收货单详情返回 
     * @return Quantity 线材-数量，只有收货单详情返回
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 线材-数量，只有收货单详情返回
     * @param Quantity 线材-数量，只有收货单详情返回
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 计量单位，，只有收货单详情返回，'箱', '卷', '套' 
     * @return Unit 计量单位，，只有收货单详情返回，'箱', '卷', '套'
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 计量单位，，只有收货单详情返回，'箱', '卷', '套'
     * @param Unit 计量单位，，只有收货单详情返回，'箱', '卷', '套'
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 线材-收货凭证号，只有收货单详情返回 
     * @return ReceiptNumber 线材-收货凭证号，只有收货单详情返回
     */
    public String getReceiptNumber() {
        return this.ReceiptNumber;
    }

    /**
     * Set 线材-收货凭证号，只有收货单详情返回
     * @param ReceiptNumber 线材-收货凭证号，只有收货单详情返回
     */
    public void setReceiptNumber(String ReceiptNumber) {
        this.ReceiptNumber = ReceiptNumber;
    }

    public DeviceHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceHistory(DeviceHistory source) {
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.RackName != null) {
            this.RackName = new String(source.RackName);
        }
        if (source.PositionCode != null) {
            this.PositionCode = new Long(source.PositionCode);
        }
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.IdcUnitId != null) {
            this.IdcUnitId = new Long(source.IdcUnitId);
        }
        if (source.IdcUnitName != null) {
            this.IdcUnitName = new String(source.IdcUnitName);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.DeviceHeight != null) {
            this.DeviceHeight = new String(source.DeviceHeight);
        }
        if (source.Need10GbSlot != null) {
            this.Need10GbSlot = new String(source.Need10GbSlot);
        }
        if (source.NeedDCPower != null) {
            this.NeedDCPower = new String(source.NeedDCPower);
        }
        if (source.NeedExtranet != null) {
            this.NeedExtranet = new String(source.NeedExtranet);
        }
        if (source.NeedVirtualization != null) {
            this.NeedVirtualization = new String(source.NeedVirtualization);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.HardwareMemo != null) {
            this.HardwareMemo = new String(source.HardwareMemo);
        }
        if (source.DstRackName != null) {
            this.DstRackName = new String(source.DstRackName);
        }
        if (source.DstPositionCode != null) {
            this.DstPositionCode = new String(source.DstPositionCode);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.ReceiptNumber != null) {
            this.ReceiptNumber = new String(source.ReceiptNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "RackName", this.RackName);
        this.setParamSimple(map, prefix + "PositionCode", this.PositionCode);
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "IdcUnitId", this.IdcUnitId);
        this.setParamSimple(map, prefix + "IdcUnitName", this.IdcUnitName);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "DeviceHeight", this.DeviceHeight);
        this.setParamSimple(map, prefix + "Need10GbSlot", this.Need10GbSlot);
        this.setParamSimple(map, prefix + "NeedDCPower", this.NeedDCPower);
        this.setParamSimple(map, prefix + "NeedExtranet", this.NeedExtranet);
        this.setParamSimple(map, prefix + "NeedVirtualization", this.NeedVirtualization);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "HardwareMemo", this.HardwareMemo);
        this.setParamSimple(map, prefix + "DstRackName", this.DstRackName);
        this.setParamSimple(map, prefix + "DstPositionCode", this.DstPositionCode);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "ReceiptNumber", this.ReceiptNumber);

    }
}

