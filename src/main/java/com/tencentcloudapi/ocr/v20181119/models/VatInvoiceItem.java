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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceItem extends AbstractModel{

    /**
    * 行号
    */
    @SerializedName("LineNo")
    @Expose
    private String LineNo;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规格
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 数量
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * 单价
    */
    @SerializedName("UnitPrice")
    @Expose
    private String UnitPrice;

    /**
    * 不含税金额
    */
    @SerializedName("AmountWithoutTax")
    @Expose
    private String AmountWithoutTax;

    /**
    * 税率
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 税额
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * 税收分类编码
    */
    @SerializedName("TaxClassifyCode")
    @Expose
    private String TaxClassifyCode;

    /**
    * 运输工具类型
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * 运输工具牌号
    */
    @SerializedName("VehicleBrand")
    @Expose
    private String VehicleBrand;

    /**
    * 起始地
    */
    @SerializedName("DeparturePlace")
    @Expose
    private String DeparturePlace;

    /**
    * 到达地
    */
    @SerializedName("ArrivalPlace")
    @Expose
    private String ArrivalPlace;

    /**
    * 运输货物名称
    */
    @SerializedName("TransportItemsName")
    @Expose
    private String TransportItemsName;

    /**
    * 建筑服务发生地
    */
    @SerializedName("ConstructionPlace")
    @Expose
    private String ConstructionPlace;

    /**
    * 建筑项目名称
    */
    @SerializedName("ConstructionName")
    @Expose
    private String ConstructionName;

    /**
     * Get 行号 
     * @return LineNo 行号
     */
    public String getLineNo() {
        return this.LineNo;
    }

    /**
     * Set 行号
     * @param LineNo 行号
     */
    public void setLineNo(String LineNo) {
        this.LineNo = LineNo;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规格 
     * @return Spec 规格
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 规格
     * @param Spec 规格
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 数量 
     * @return Quantity 数量
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 数量
     * @param Quantity 数量
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 单价 
     * @return UnitPrice 单价
     */
    public String getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 单价
     * @param UnitPrice 单价
     */
    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 不含税金额 
     * @return AmountWithoutTax 不含税金额
     */
    public String getAmountWithoutTax() {
        return this.AmountWithoutTax;
    }

    /**
     * Set 不含税金额
     * @param AmountWithoutTax 不含税金额
     */
    public void setAmountWithoutTax(String AmountWithoutTax) {
        this.AmountWithoutTax = AmountWithoutTax;
    }

    /**
     * Get 税率 
     * @return TaxRate 税率
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set 税率
     * @param TaxRate 税率
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get 税额 
     * @return TaxAmount 税额
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set 税额
     * @param TaxAmount 税额
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get 税收分类编码 
     * @return TaxClassifyCode 税收分类编码
     */
    public String getTaxClassifyCode() {
        return this.TaxClassifyCode;
    }

    /**
     * Set 税收分类编码
     * @param TaxClassifyCode 税收分类编码
     */
    public void setTaxClassifyCode(String TaxClassifyCode) {
        this.TaxClassifyCode = TaxClassifyCode;
    }

    /**
     * Get 运输工具类型 
     * @return VehicleType 运输工具类型
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set 运输工具类型
     * @param VehicleType 运输工具类型
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    /**
     * Get 运输工具牌号 
     * @return VehicleBrand 运输工具牌号
     */
    public String getVehicleBrand() {
        return this.VehicleBrand;
    }

    /**
     * Set 运输工具牌号
     * @param VehicleBrand 运输工具牌号
     */
    public void setVehicleBrand(String VehicleBrand) {
        this.VehicleBrand = VehicleBrand;
    }

    /**
     * Get 起始地 
     * @return DeparturePlace 起始地
     */
    public String getDeparturePlace() {
        return this.DeparturePlace;
    }

    /**
     * Set 起始地
     * @param DeparturePlace 起始地
     */
    public void setDeparturePlace(String DeparturePlace) {
        this.DeparturePlace = DeparturePlace;
    }

    /**
     * Get 到达地 
     * @return ArrivalPlace 到达地
     */
    public String getArrivalPlace() {
        return this.ArrivalPlace;
    }

    /**
     * Set 到达地
     * @param ArrivalPlace 到达地
     */
    public void setArrivalPlace(String ArrivalPlace) {
        this.ArrivalPlace = ArrivalPlace;
    }

    /**
     * Get 运输货物名称 
     * @return TransportItemsName 运输货物名称
     */
    public String getTransportItemsName() {
        return this.TransportItemsName;
    }

    /**
     * Set 运输货物名称
     * @param TransportItemsName 运输货物名称
     */
    public void setTransportItemsName(String TransportItemsName) {
        this.TransportItemsName = TransportItemsName;
    }

    /**
     * Get 建筑服务发生地 
     * @return ConstructionPlace 建筑服务发生地
     */
    public String getConstructionPlace() {
        return this.ConstructionPlace;
    }

    /**
     * Set 建筑服务发生地
     * @param ConstructionPlace 建筑服务发生地
     */
    public void setConstructionPlace(String ConstructionPlace) {
        this.ConstructionPlace = ConstructionPlace;
    }

    /**
     * Get 建筑项目名称 
     * @return ConstructionName 建筑项目名称
     */
    public String getConstructionName() {
        return this.ConstructionName;
    }

    /**
     * Set 建筑项目名称
     * @param ConstructionName 建筑项目名称
     */
    public void setConstructionName(String ConstructionName) {
        this.ConstructionName = ConstructionName;
    }

    public VatInvoiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceItem(VatInvoiceItem source) {
        if (source.LineNo != null) {
            this.LineNo = new String(source.LineNo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new String(source.UnitPrice);
        }
        if (source.AmountWithoutTax != null) {
            this.AmountWithoutTax = new String(source.AmountWithoutTax);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.TaxAmount != null) {
            this.TaxAmount = new String(source.TaxAmount);
        }
        if (source.TaxClassifyCode != null) {
            this.TaxClassifyCode = new String(source.TaxClassifyCode);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
        if (source.VehicleBrand != null) {
            this.VehicleBrand = new String(source.VehicleBrand);
        }
        if (source.DeparturePlace != null) {
            this.DeparturePlace = new String(source.DeparturePlace);
        }
        if (source.ArrivalPlace != null) {
            this.ArrivalPlace = new String(source.ArrivalPlace);
        }
        if (source.TransportItemsName != null) {
            this.TransportItemsName = new String(source.TransportItemsName);
        }
        if (source.ConstructionPlace != null) {
            this.ConstructionPlace = new String(source.ConstructionPlace);
        }
        if (source.ConstructionName != null) {
            this.ConstructionName = new String(source.ConstructionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineNo", this.LineNo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "AmountWithoutTax", this.AmountWithoutTax);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "TaxClassifyCode", this.TaxClassifyCode);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "VehicleBrand", this.VehicleBrand);
        this.setParamSimple(map, prefix + "DeparturePlace", this.DeparturePlace);
        this.setParamSimple(map, prefix + "ArrivalPlace", this.ArrivalPlace);
        this.setParamSimple(map, prefix + "TransportItemsName", this.TransportItemsName);
        this.setParamSimple(map, prefix + "ConstructionPlace", this.ConstructionPlace);
        this.setParamSimple(map, prefix + "ConstructionName", this.ConstructionName);

    }
}

