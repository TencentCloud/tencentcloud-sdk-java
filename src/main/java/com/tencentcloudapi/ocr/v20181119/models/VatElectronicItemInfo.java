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

public class VatElectronicItemInfo extends AbstractModel {

    /**
    * <p>项目名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数量</p>
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * <p>规格型号</p>
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * <p>单价</p>
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * <p>金额</p>
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * <p>税率</p>
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * <p>税额</p>
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * <p>单位</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

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
    * <p>运输货物名称，仅货物运输服务发票返回</p>
    */
    @SerializedName("TransportItemsName")
    @Expose
    private String TransportItemsName;

    /**
    * <p>建筑服务发生地，仅建筑发票返回</p>
    */
    @SerializedName("PlaceOfBuildingService")
    @Expose
    private String PlaceOfBuildingService;

    /**
    * <p>建筑项目名称，仅建筑发票返回</p>
    */
    @SerializedName("BuildingName")
    @Expose
    private String BuildingName;

    /**
    * <p>产权证书/不动产权证号，仅不动产经营租赁服务发票返回</p>
    */
    @SerializedName("EstateNumber")
    @Expose
    private String EstateNumber;

    /**
    * <p>面积单位，仅不动产经营租赁服务发票返回</p>
    */
    @SerializedName("AreaUnit")
    @Expose
    private String AreaUnit;

    /**
    * <p>出行人，仅旅客运输服务发票返回</p>
    */
    @SerializedName("Traveler")
    @Expose
    private String Traveler;

    /**
    * <p>有效身份证件号，仅旅客运输服务发票返回</p>
    */
    @SerializedName("TravelerID")
    @Expose
    private String TravelerID;

    /**
    * <p>出行日期，仅旅客运输服务发票返回</p>
    */
    @SerializedName("TravelDate")
    @Expose
    private String TravelDate;

    /**
    * <p>等级，仅旅客运输服务发票返回</p>
    */
    @SerializedName("TravelLevel")
    @Expose
    private String TravelLevel;

    /**
    * <p>通行日期起</p>
    */
    @SerializedName("DateStart")
    @Expose
    private String DateStart;

    /**
    * <p>通行日期止</p>
    */
    @SerializedName("DateEnd")
    @Expose
    private String DateEnd;

    /**
     * Get <p>项目名称</p> 
     * @return Name <p>项目名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>项目名称</p>
     * @param Name <p>项目名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>规格型号</p> 
     * @return Specification <p>规格型号</p>
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set <p>规格型号</p>
     * @param Specification <p>规格型号</p>
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get <p>单价</p> 
     * @return Price <p>单价</p>
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set <p>单价</p>
     * @param Price <p>单价</p>
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get <p>金额</p> 
     * @return Total <p>金额</p>
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set <p>金额</p>
     * @param Total <p>金额</p>
     */
    public void setTotal(String Total) {
        this.Total = Total;
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
     * @return Tax <p>税额</p>
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set <p>税额</p>
     * @param Tax <p>税额</p>
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
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
     * Get <p>运输货物名称，仅货物运输服务发票返回</p> 
     * @return TransportItemsName <p>运输货物名称，仅货物运输服务发票返回</p>
     */
    public String getTransportItemsName() {
        return this.TransportItemsName;
    }

    /**
     * Set <p>运输货物名称，仅货物运输服务发票返回</p>
     * @param TransportItemsName <p>运输货物名称，仅货物运输服务发票返回</p>
     */
    public void setTransportItemsName(String TransportItemsName) {
        this.TransportItemsName = TransportItemsName;
    }

    /**
     * Get <p>建筑服务发生地，仅建筑发票返回</p> 
     * @return PlaceOfBuildingService <p>建筑服务发生地，仅建筑发票返回</p>
     */
    public String getPlaceOfBuildingService() {
        return this.PlaceOfBuildingService;
    }

    /**
     * Set <p>建筑服务发生地，仅建筑发票返回</p>
     * @param PlaceOfBuildingService <p>建筑服务发生地，仅建筑发票返回</p>
     */
    public void setPlaceOfBuildingService(String PlaceOfBuildingService) {
        this.PlaceOfBuildingService = PlaceOfBuildingService;
    }

    /**
     * Get <p>建筑项目名称，仅建筑发票返回</p> 
     * @return BuildingName <p>建筑项目名称，仅建筑发票返回</p>
     */
    public String getBuildingName() {
        return this.BuildingName;
    }

    /**
     * Set <p>建筑项目名称，仅建筑发票返回</p>
     * @param BuildingName <p>建筑项目名称，仅建筑发票返回</p>
     */
    public void setBuildingName(String BuildingName) {
        this.BuildingName = BuildingName;
    }

    /**
     * Get <p>产权证书/不动产权证号，仅不动产经营租赁服务发票返回</p> 
     * @return EstateNumber <p>产权证书/不动产权证号，仅不动产经营租赁服务发票返回</p>
     */
    public String getEstateNumber() {
        return this.EstateNumber;
    }

    /**
     * Set <p>产权证书/不动产权证号，仅不动产经营租赁服务发票返回</p>
     * @param EstateNumber <p>产权证书/不动产权证号，仅不动产经营租赁服务发票返回</p>
     */
    public void setEstateNumber(String EstateNumber) {
        this.EstateNumber = EstateNumber;
    }

    /**
     * Get <p>面积单位，仅不动产经营租赁服务发票返回</p> 
     * @return AreaUnit <p>面积单位，仅不动产经营租赁服务发票返回</p>
     */
    public String getAreaUnit() {
        return this.AreaUnit;
    }

    /**
     * Set <p>面积单位，仅不动产经营租赁服务发票返回</p>
     * @param AreaUnit <p>面积单位，仅不动产经营租赁服务发票返回</p>
     */
    public void setAreaUnit(String AreaUnit) {
        this.AreaUnit = AreaUnit;
    }

    /**
     * Get <p>出行人，仅旅客运输服务发票返回</p> 
     * @return Traveler <p>出行人，仅旅客运输服务发票返回</p>
     */
    public String getTraveler() {
        return this.Traveler;
    }

    /**
     * Set <p>出行人，仅旅客运输服务发票返回</p>
     * @param Traveler <p>出行人，仅旅客运输服务发票返回</p>
     */
    public void setTraveler(String Traveler) {
        this.Traveler = Traveler;
    }

    /**
     * Get <p>有效身份证件号，仅旅客运输服务发票返回</p> 
     * @return TravelerID <p>有效身份证件号，仅旅客运输服务发票返回</p>
     */
    public String getTravelerID() {
        return this.TravelerID;
    }

    /**
     * Set <p>有效身份证件号，仅旅客运输服务发票返回</p>
     * @param TravelerID <p>有效身份证件号，仅旅客运输服务发票返回</p>
     */
    public void setTravelerID(String TravelerID) {
        this.TravelerID = TravelerID;
    }

    /**
     * Get <p>出行日期，仅旅客运输服务发票返回</p> 
     * @return TravelDate <p>出行日期，仅旅客运输服务发票返回</p>
     */
    public String getTravelDate() {
        return this.TravelDate;
    }

    /**
     * Set <p>出行日期，仅旅客运输服务发票返回</p>
     * @param TravelDate <p>出行日期，仅旅客运输服务发票返回</p>
     */
    public void setTravelDate(String TravelDate) {
        this.TravelDate = TravelDate;
    }

    /**
     * Get <p>等级，仅旅客运输服务发票返回</p> 
     * @return TravelLevel <p>等级，仅旅客运输服务发票返回</p>
     */
    public String getTravelLevel() {
        return this.TravelLevel;
    }

    /**
     * Set <p>等级，仅旅客运输服务发票返回</p>
     * @param TravelLevel <p>等级，仅旅客运输服务发票返回</p>
     */
    public void setTravelLevel(String TravelLevel) {
        this.TravelLevel = TravelLevel;
    }

    /**
     * Get <p>通行日期起</p> 
     * @return DateStart <p>通行日期起</p>
     */
    public String getDateStart() {
        return this.DateStart;
    }

    /**
     * Set <p>通行日期起</p>
     * @param DateStart <p>通行日期起</p>
     */
    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    /**
     * Get <p>通行日期止</p> 
     * @return DateEnd <p>通行日期止</p>
     */
    public String getDateEnd() {
        return this.DateEnd;
    }

    /**
     * Set <p>通行日期止</p>
     * @param DateEnd <p>通行日期止</p>
     */
    public void setDateEnd(String DateEnd) {
        this.DateEnd = DateEnd;
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
        if (source.Traveler != null) {
            this.Traveler = new String(source.Traveler);
        }
        if (source.TravelerID != null) {
            this.TravelerID = new String(source.TravelerID);
        }
        if (source.TravelDate != null) {
            this.TravelDate = new String(source.TravelDate);
        }
        if (source.TravelLevel != null) {
            this.TravelLevel = new String(source.TravelLevel);
        }
        if (source.DateStart != null) {
            this.DateStart = new String(source.DateStart);
        }
        if (source.DateEnd != null) {
            this.DateEnd = new String(source.DateEnd);
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
        this.setParamSimple(map, prefix + "Traveler", this.Traveler);
        this.setParamSimple(map, prefix + "TravelerID", this.TravelerID);
        this.setParamSimple(map, prefix + "TravelDate", this.TravelDate);
        this.setParamSimple(map, prefix + "TravelLevel", this.TravelLevel);
        this.setParamSimple(map, prefix + "DateStart", this.DateStart);
        this.setParamSimple(map, prefix + "DateEnd", this.DateEnd);

    }
}

