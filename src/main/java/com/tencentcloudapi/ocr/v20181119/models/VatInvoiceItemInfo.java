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

public class VatInvoiceItemInfo extends AbstractModel{

    /**
    * 项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规格型号
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

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
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 金额
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 税率
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 税额
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 通行日期起
    */
    @SerializedName("DateStart")
    @Expose
    private String DateStart;

    /**
    * 通行日期止
    */
    @SerializedName("DateEnd")
    @Expose
    private String DateEnd;

    /**
    * 车牌号
    */
    @SerializedName("LicensePlate")
    @Expose
    private String LicensePlate;

    /**
    * 车辆类型
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * 序号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
     * Get 项目名称 
     * @return Name 项目名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
     * @param Name 项目名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规格型号 
     * @return Specification 规格型号
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 规格型号
     * @param Specification 规格型号
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
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
     * @return Price 单价
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 单价
     * @param Price 单价
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 金额 
     * @return Total 金额
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 金额
     * @param Total 金额
     */
    public void setTotal(String Total) {
        this.Total = Total;
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
     * @return Tax 税额
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 税额
     * @param Tax 税额
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 通行日期起 
     * @return DateStart 通行日期起
     */
    public String getDateStart() {
        return this.DateStart;
    }

    /**
     * Set 通行日期起
     * @param DateStart 通行日期起
     */
    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    /**
     * Get 通行日期止 
     * @return DateEnd 通行日期止
     */
    public String getDateEnd() {
        return this.DateEnd;
    }

    /**
     * Set 通行日期止
     * @param DateEnd 通行日期止
     */
    public void setDateEnd(String DateEnd) {
        this.DateEnd = DateEnd;
    }

    /**
     * Get 车牌号 
     * @return LicensePlate 车牌号
     */
    public String getLicensePlate() {
        return this.LicensePlate;
    }

    /**
     * Set 车牌号
     * @param LicensePlate 车牌号
     */
    public void setLicensePlate(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }

    /**
     * Get 车辆类型 
     * @return VehicleType 车辆类型
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set 车辆类型
     * @param VehicleType 车辆类型
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    /**
     * Get 序号 
     * @return SerialNumber 序号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 序号
     * @param SerialNumber 序号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public VatInvoiceItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceItemInfo(VatInvoiceItemInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.DateStart != null) {
            this.DateStart = new String(source.DateStart);
        }
        if (source.DateEnd != null) {
            this.DateEnd = new String(source.DateEnd);
        }
        if (source.LicensePlate != null) {
            this.LicensePlate = new String(source.LicensePlate);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "DateStart", this.DateStart);
        this.setParamSimple(map, prefix + "DateEnd", this.DateEnd);
        this.setParamSimple(map, prefix + "LicensePlate", this.LicensePlate);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);

    }
}

