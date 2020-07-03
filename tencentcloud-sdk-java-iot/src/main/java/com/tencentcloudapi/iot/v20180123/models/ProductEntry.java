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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductEntry extends AbstractModel{

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品Key
    */
    @SerializedName("ProductKey")
    @Expose
    private String ProductKey;

    /**
    * AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 产品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 产品描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 连接域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 鉴权类型（0：直连，1：Token）
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 数据协议（native/template）
    */
    @SerializedName("DataProtocol")
    @Expose
    private String DataProtocol;

    /**
    * 删除（0未删除）
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * 备注
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 通信方式
    */
    @SerializedName("CommProtocol")
    @Expose
    private String CommProtocol;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品Key 
     * @return ProductKey 产品Key
     */
    public String getProductKey() {
        return this.ProductKey;
    }

    /**
     * Set 产品Key
     * @param ProductKey 产品Key
     */
    public void setProductKey(String ProductKey) {
        this.ProductKey = ProductKey;
    }

    /**
     * Get AppId 
     * @return AppId AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId
     * @param AppId AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 产品名称 
     * @return Name 产品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 产品名称
     * @param Name 产品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 产品描述 
     * @return Description 产品描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 产品描述
     * @param Description 产品描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 连接域名 
     * @return Domain 连接域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 连接域名
     * @param Domain 连接域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 鉴权类型（0：直连，1：Token） 
     * @return AuthType 鉴权类型（0：直连，1：Token）
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 鉴权类型（0：直连，1：Token）
     * @param AuthType 鉴权类型（0：直连，1：Token）
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 数据协议（native/template） 
     * @return DataProtocol 数据协议（native/template）
     */
    public String getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set 数据协议（native/template）
     * @param DataProtocol 数据协议（native/template）
     */
    public void setDataProtocol(String DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * Get 删除（0未删除） 
     * @return Deleted 删除（0未删除）
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 删除（0未删除）
     * @param Deleted 删除（0未删除）
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 备注 
     * @return Message 备注
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 备注
     * @param Message 备注
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 通信方式 
     * @return CommProtocol 通信方式
     */
    public String getCommProtocol() {
        return this.CommProtocol;
    }

    /**
     * Set 通信方式
     * @param CommProtocol 通信方式
     */
    public void setCommProtocol(String CommProtocol) {
        this.CommProtocol = CommProtocol;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductKey", this.ProductKey);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CommProtocol", this.CommProtocol);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

