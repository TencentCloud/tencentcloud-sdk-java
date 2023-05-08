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

public class VatElectronicItemInfo extends AbstractModel{

    /**
    * 项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数量
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * 规格型号
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

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
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

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
    * 运输货物名称，仅货物运输服务发票返回
    */
    @SerializedName("TransportItemsName")
    @Expose
    private String TransportItemsName;

    /**
    * 建筑服务发生地，仅建筑发票返回
    */
    @SerializedName("PlaceOfBuildingService")
    @Expose
    private String PlaceOfBuildingService;

    /**
    * 建筑项目名称，仅建筑发票返回
    */
    @SerializedName("BuildingName")
    @Expose
    private String BuildingName;

    /**
    * 产权证书/不动产权证号，仅不动产经营租赁服务发票返回
    */
    @SerializedName("EstateNumber")
    @Expose
    private String EstateNumber;

    /**
    * 面积单位，仅不动产经营租赁服务发票返回
    */
    @SerializedName("AreaUnit")
    @Expose
    private String AreaUnit;

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
     * Get 运输货物名称，仅货物运输服务发票返回 
     * @return TransportItemsName 运输货物名称，仅货物运输服务发票返回
     */
    public String getTransportItemsName() {
        return this.TransportItemsName;
    }

    /**
     * Set 运输货物名称，仅货物运输服务发票返回
     * @param TransportItemsName 运输货物名称，仅货物运输服务发票返回
     */
    public void setTransportItemsName(String TransportItemsName) {
        this.TransportItemsName = TransportItemsName;
    }

    /**
     * Get 建筑服务发生地，仅建筑发票返回 
     * @return PlaceOfBuildingService 建筑服务发生地，仅建筑发票返回
     */
    public String getPlaceOfBuildingService() {
        return this.PlaceOfBuildingService;
    }

    /**
     * Set 建筑服务发生地，仅建筑发票返回
     * @param PlaceOfBuildingService 建筑服务发生地，仅建筑发票返回
     */
    public void setPlaceOfBuildingService(String PlaceOfBuildingService) {
        this.PlaceOfBuildingService = PlaceOfBuildingService;
    }

    /**
     * Get 建筑项目名称，仅建筑发票返回 
     * @return BuildingName 建筑项目名称，仅建筑发票返回
     */
    public String getBuildingName() {
        return this.BuildingName;
    }

    /**
     * Set 建筑项目名称，仅建筑发票返回
     * @param BuildingName 建筑项目名称，仅建筑发票返回
     */
    public void setBuildingName(String BuildingName) {
        this.BuildingName = BuildingName;
    }

    /**
     * Get 产权证书/不动产权证号，仅不动产经营租赁服务发票返回 
     * @return EstateNumber 产权证书/不动产权证号，仅不动产经营租赁服务发票返回
     */
    public String getEstateNumber() {
        return this.EstateNumber;
    }

    /**
     * Set 产权证书/不动产权证号，仅不动产经营租赁服务发票返回
     * @param EstateNumber 产权证书/不动产权证号，仅不动产经营租赁服务发票返回
     */
    public void setEstateNumber(String EstateNumber) {
        this.EstateNumber = EstateNumber;
    }

    /**
     * Get 面积单位，仅不动产经营租赁服务发票返回 
     * @return AreaUnit 面积单位，仅不动产经营租赁服务发票返回
     */
    public String getAreaUnit() {
        return this.AreaUnit;
    }

    /**
     * Set 面积单位，仅不动产经营租赁服务发票返回
     * @param AreaUnit 面积单位，仅不动产经营租赁服务发票返回
     */
    public void setAreaUnit(String AreaUnit) {
        this.AreaUnit = AreaUnit;
    }

    public VatElectronicItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatElectronicItemInfo(VatElectronicItemInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
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
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
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
        if (source.PlaceOfBuildingService != null) {
            this.PlaceOfBuildingService = new String(source.PlaceOfBuildingService);
        }
        if (source.BuildingName != null) {
            this.BuildingName = new String(source.BuildingName);
        }
        if (source.EstateNumber != null) {
            this.EstateNumber = new String(source.EstateNumber);
        }
        if (source.AreaUnit != null) {
            this.AreaUnit = new String(source.AreaUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "VehicleBrand", this.VehicleBrand);
        this.setParamSimple(map, prefix + "DeparturePlace", this.DeparturePlace);
        this.setParamSimple(map, prefix + "ArrivalPlace", this.ArrivalPlace);
        this.setParamSimple(map, prefix + "TransportItemsName", this.TransportItemsName);
        this.setParamSimple(map, prefix + "PlaceOfBuildingService", this.PlaceOfBuildingService);
        this.setParamSimple(map, prefix + "BuildingName", this.BuildingName);
        this.setParamSimple(map, prefix + "EstateNumber", this.EstateNumber);
        this.setParamSimple(map, prefix + "AreaUnit", this.AreaUnit);

    }
}

