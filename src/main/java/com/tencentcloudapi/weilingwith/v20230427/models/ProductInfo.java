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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductInfo extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 产品PID
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 设备类型
    */
    @SerializedName("DeviceTypeName")
    @Expose
    private String DeviceTypeName;

    /**
    * 设备类型id
    */
    @SerializedName("DeviceTypeId")
    @Expose
    private String DeviceTypeId;

    /**
    * 产品属性，如：网关（1）、直连设备（2）、子设备（3）
    */
    @SerializedName("Attribute")
    @Expose
    private Long Attribute;

    /**
    * 产品型号
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
    */
    @SerializedName("ProductAbility")
    @Expose
    private Long ProductAbility;

    /**
    * 生产厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 维保厂商
    */
    @SerializedName("MaintenanceMfr")
    @Expose
    private String MaintenanceMfr;

    /**
    * 物模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 物模型id
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 物模型类型，产品模型/标准模型
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 产品PID 
     * @return ProductId 产品PID
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品PID
     * @param ProductId 产品PID
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 设备类型 
     * @return DeviceTypeName 设备类型
     */
    public String getDeviceTypeName() {
        return this.DeviceTypeName;
    }

    /**
     * Set 设备类型
     * @param DeviceTypeName 设备类型
     */
    public void setDeviceTypeName(String DeviceTypeName) {
        this.DeviceTypeName = DeviceTypeName;
    }

    /**
     * Get 设备类型id 
     * @return DeviceTypeId 设备类型id
     */
    public String getDeviceTypeId() {
        return this.DeviceTypeId;
    }

    /**
     * Set 设备类型id
     * @param DeviceTypeId 设备类型id
     */
    public void setDeviceTypeId(String DeviceTypeId) {
        this.DeviceTypeId = DeviceTypeId;
    }

    /**
     * Get 产品属性，如：网关（1）、直连设备（2）、子设备（3） 
     * @return Attribute 产品属性，如：网关（1）、直连设备（2）、子设备（3）
     */
    public Long getAttribute() {
        return this.Attribute;
    }

    /**
     * Set 产品属性，如：网关（1）、直连设备（2）、子设备（3）
     * @param Attribute 产品属性，如：网关（1）、直连设备（2）、子设备（3）
     */
    public void setAttribute(Long Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get 产品型号 
     * @return ProductType 产品型号
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品型号
     * @param ProductType 产品型号
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。 
     * @return ProductAbility 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
     */
    public Long getProductAbility() {
        return this.ProductAbility;
    }

    /**
     * Set 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
     * @param ProductAbility 产品能力:信令数据、音视频。二进制数值中第0位表示信令数据、第1位表示音视频 。1（信令数据），3（具有信令数据以及音视频能力）。
     */
    public void setProductAbility(Long ProductAbility) {
        this.ProductAbility = ProductAbility;
    }

    /**
     * Get 生产厂商 
     * @return Manufacturer 生产厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产厂商
     * @param Manufacturer 生产厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 维保厂商 
     * @return MaintenanceMfr 维保厂商
     */
    public String getMaintenanceMfr() {
        return this.MaintenanceMfr;
    }

    /**
     * Set 维保厂商
     * @param MaintenanceMfr 维保厂商
     */
    public void setMaintenanceMfr(String MaintenanceMfr) {
        this.MaintenanceMfr = MaintenanceMfr;
    }

    /**
     * Get 物模型名称 
     * @return ModelName 物模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 物模型名称
     * @param ModelName 物模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 物模型id 
     * @return ModelId 物模型id
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 物模型id
     * @param ModelId 物模型id
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 物模型类型，产品模型/标准模型 
     * @return ModelType 物模型类型，产品模型/标准模型
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set 物模型类型，产品模型/标准模型
     * @param ModelType 物模型类型，产品模型/标准模型
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    public ProductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductInfo(ProductInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.DeviceTypeName != null) {
            this.DeviceTypeName = new String(source.DeviceTypeName);
        }
        if (source.DeviceTypeId != null) {
            this.DeviceTypeId = new String(source.DeviceTypeId);
        }
        if (source.Attribute != null) {
            this.Attribute = new Long(source.Attribute);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.ProductAbility != null) {
            this.ProductAbility = new Long(source.ProductAbility);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.MaintenanceMfr != null) {
            this.MaintenanceMfr = new String(source.MaintenanceMfr);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "DeviceTypeName", this.DeviceTypeName);
        this.setParamSimple(map, prefix + "DeviceTypeId", this.DeviceTypeId);
        this.setParamSimple(map, prefix + "Attribute", this.Attribute);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "ProductAbility", this.ProductAbility);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "MaintenanceMfr", this.MaintenanceMfr);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);

    }
}

