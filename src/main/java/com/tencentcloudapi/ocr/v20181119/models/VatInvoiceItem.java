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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceItem extends AbstractModel {

    /**
    * <p>行号</p>
    */
    @SerializedName("LineNo")
    @Expose
    private String LineNo;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>规格</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>单位</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>数量</p>
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * <p>单价</p>
    */
    @SerializedName("UnitPrice")
    @Expose
    private String UnitPrice;

    /**
    * <p>不含税金额</p>
    */
    @SerializedName("AmountWithoutTax")
    @Expose
    private String AmountWithoutTax;

    /**
    * <p>税率</p>
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * <p>税额</p>
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * <p>税收分类编码</p>
    */
    @SerializedName("TaxClassifyCode")
    @Expose
    private String TaxClassifyCode;

    /**
    * <p>运输工具类型</p>
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * <p>运输工具牌号</p>
    */
    @SerializedName("VehicleBrand")
    @Expose
    private String VehicleBrand;

    /**
    * <p>起始地</p>
    */
    @SerializedName("DeparturePlace")
    @Expose
    private String DeparturePlace;

    /**
    * <p>到达地</p>
    */
    @SerializedName("ArrivalPlace")
    @Expose
    private String ArrivalPlace;

    /**
    * <p>运输货物名称</p>
    */
    @SerializedName("TransportItemsName")
    @Expose
    private String TransportItemsName;

    /**
    * <p>建筑服务发生地</p>
    */
    @SerializedName("ConstructionPlace")
    @Expose
    private String ConstructionPlace;

    /**
    * <p>建筑项目名称</p>
    */
    @SerializedName("ConstructionName")
    @Expose
    private String ConstructionName;

    /**
    * <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalTaxRate")
    @Expose
    private String OriginalTaxRate;

    /**
    * <p>原始税额</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalTaxAmount")
    @Expose
    private String OriginalTaxAmount;

    /**
    * <p>零税率标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZeroTaxRateMark")
    @Expose
    private String ZeroTaxRateMark;

    /**
    * <p>含税单价</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxIncludedUnitPrice")
    @Expose
    private String TaxIncludedUnitPrice;

    /**
    * <p>含税金额</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxIncludedAmount")
    @Expose
    private Float TaxIncludedAmount;

    /**
     * Get <p>行号</p> 
     * @return LineNo <p>行号</p>
     */
    public String getLineNo() {
        return this.LineNo;
    }

    /**
     * Set <p>行号</p>
     * @param LineNo <p>行号</p>
     */
    public void setLineNo(String LineNo) {
        this.LineNo = LineNo;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>规格</p> 
     * @return Spec <p>规格</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>规格</p>
     * @param Spec <p>规格</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>单位</p> 
     * @return Unit <p>单位</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>单位</p>
     * @param Unit <p>单位</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>数量</p> 
     * @return Quantity <p>数量</p>
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set <p>数量</p>
     * @param Quantity <p>数量</p>
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get <p>单价</p> 
     * @return UnitPrice <p>单价</p>
     */
    public String getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set <p>单价</p>
     * @param UnitPrice <p>单价</p>
     */
    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get <p>不含税金额</p> 
     * @return AmountWithoutTax <p>不含税金额</p>
     */
    public String getAmountWithoutTax() {
        return this.AmountWithoutTax;
    }

    /**
     * Set <p>不含税金额</p>
     * @param AmountWithoutTax <p>不含税金额</p>
     */
    public void setAmountWithoutTax(String AmountWithoutTax) {
        this.AmountWithoutTax = AmountWithoutTax;
    }

    /**
     * Get <p>税率</p> 
     * @return TaxRate <p>税率</p>
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set <p>税率</p>
     * @param TaxRate <p>税率</p>
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get <p>税额</p> 
     * @return TaxAmount <p>税额</p>
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set <p>税额</p>
     * @param TaxAmount <p>税额</p>
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get <p>税收分类编码</p> 
     * @return TaxClassifyCode <p>税收分类编码</p>
     */
    public String getTaxClassifyCode() {
        return this.TaxClassifyCode;
    }

    /**
     * Set <p>税收分类编码</p>
     * @param TaxClassifyCode <p>税收分类编码</p>
     */
    public void setTaxClassifyCode(String TaxClassifyCode) {
        this.TaxClassifyCode = TaxClassifyCode;
    }

    /**
     * Get <p>运输工具类型</p> 
     * @return VehicleType <p>运输工具类型</p>
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set <p>运输工具类型</p>
     * @param VehicleType <p>运输工具类型</p>
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    /**
     * Get <p>运输工具牌号</p> 
     * @return VehicleBrand <p>运输工具牌号</p>
     */
    public String getVehicleBrand() {
        return this.VehicleBrand;
    }

    /**
     * Set <p>运输工具牌号</p>
     * @param VehicleBrand <p>运输工具牌号</p>
     */
    public void setVehicleBrand(String VehicleBrand) {
        this.VehicleBrand = VehicleBrand;
    }

    /**
     * Get <p>起始地</p> 
     * @return DeparturePlace <p>起始地</p>
     */
    public String getDeparturePlace() {
        return this.DeparturePlace;
    }

    /**
     * Set <p>起始地</p>
     * @param DeparturePlace <p>起始地</p>
     */
    public void setDeparturePlace(String DeparturePlace) {
        this.DeparturePlace = DeparturePlace;
    }

    /**
     * Get <p>到达地</p> 
     * @return ArrivalPlace <p>到达地</p>
     */
    public String getArrivalPlace() {
        return this.ArrivalPlace;
    }

    /**
     * Set <p>到达地</p>
     * @param ArrivalPlace <p>到达地</p>
     */
    public void setArrivalPlace(String ArrivalPlace) {
        this.ArrivalPlace = ArrivalPlace;
    }

    /**
     * Get <p>运输货物名称</p> 
     * @return TransportItemsName <p>运输货物名称</p>
     */
    public String getTransportItemsName() {
        return this.TransportItemsName;
    }

    /**
     * Set <p>运输货物名称</p>
     * @param TransportItemsName <p>运输货物名称</p>
     */
    public void setTransportItemsName(String TransportItemsName) {
        this.TransportItemsName = TransportItemsName;
    }

    /**
     * Get <p>建筑服务发生地</p> 
     * @return ConstructionPlace <p>建筑服务发生地</p>
     */
    public String getConstructionPlace() {
        return this.ConstructionPlace;
    }

    /**
     * Set <p>建筑服务发生地</p>
     * @param ConstructionPlace <p>建筑服务发生地</p>
     */
    public void setConstructionPlace(String ConstructionPlace) {
        this.ConstructionPlace = ConstructionPlace;
    }

    /**
     * Get <p>建筑项目名称</p> 
     * @return ConstructionName <p>建筑项目名称</p>
     */
    public String getConstructionName() {
        return this.ConstructionName;
    }

    /**
     * Set <p>建筑项目名称</p>
     * @param ConstructionName <p>建筑项目名称</p>
     */
    public void setConstructionName(String ConstructionName) {
        this.ConstructionName = ConstructionName;
    }

    /**
     * Get <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalTaxRate <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalTaxRate() {
        return this.OriginalTaxRate;
    }

    /**
     * Set <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalTaxRate <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalTaxRate(String OriginalTaxRate) {
        this.OriginalTaxRate = OriginalTaxRate;
    }

    /**
     * Get <p>原始税额</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalTaxAmount <p>原始税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalTaxAmount() {
        return this.OriginalTaxAmount;
    }

    /**
     * Set <p>原始税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalTaxAmount <p>原始税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalTaxAmount(String OriginalTaxAmount) {
        this.OriginalTaxAmount = OriginalTaxAmount;
    }

    /**
     * Get <p>零税率标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZeroTaxRateMark <p>零税率标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZeroTaxRateMark() {
        return this.ZeroTaxRateMark;
    }

    /**
     * Set <p>零税率标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZeroTaxRateMark <p>零税率标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZeroTaxRateMark(String ZeroTaxRateMark) {
        this.ZeroTaxRateMark = ZeroTaxRateMark;
    }

    /**
     * Get <p>含税单价</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxIncludedUnitPrice <p>含税单价</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxIncludedUnitPrice() {
        return this.TaxIncludedUnitPrice;
    }

    /**
     * Set <p>含税单价</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxIncludedUnitPrice <p>含税单价</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxIncludedUnitPrice(String TaxIncludedUnitPrice) {
        this.TaxIncludedUnitPrice = TaxIncludedUnitPrice;
    }

    /**
     * Get <p>含税金额</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxIncludedAmount <p>含税金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaxIncludedAmount() {
        return this.TaxIncludedAmount;
    }

    /**
     * Set <p>含税金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxIncludedAmount <p>含税金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxIncludedAmount(Float TaxIncludedAmount) {
        this.TaxIncludedAmount = TaxIncludedAmount;
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
        if (source.OriginalTaxRate != null) {
            this.OriginalTaxRate = new String(source.OriginalTaxRate);
        }
        if (source.OriginalTaxAmount != null) {
            this.OriginalTaxAmount = new String(source.OriginalTaxAmount);
        }
        if (source.ZeroTaxRateMark != null) {
            this.ZeroTaxRateMark = new String(source.ZeroTaxRateMark);
        }
        if (source.TaxIncludedUnitPrice != null) {
            this.TaxIncludedUnitPrice = new String(source.TaxIncludedUnitPrice);
        }
        if (source.TaxIncludedAmount != null) {
            this.TaxIncludedAmount = new Float(source.TaxIncludedAmount);
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
        this.setParamSimple(map, prefix + "OriginalTaxRate", this.OriginalTaxRate);
        this.setParamSimple(map, prefix + "OriginalTaxAmount", this.OriginalTaxAmount);
        this.setParamSimple(map, prefix + "ZeroTaxRateMark", this.ZeroTaxRateMark);
        this.setParamSimple(map, prefix + "TaxIncludedUnitPrice", this.TaxIncludedUnitPrice);
        this.setParamSimple(map, prefix + "TaxIncludedAmount", this.TaxIncludedAmount);

    }
}

