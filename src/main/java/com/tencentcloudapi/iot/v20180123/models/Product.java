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

public class Product  extends AbstractModel{

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
    private Integer AppId;

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
    * 产品规格
    */
    @SerializedName("Standard")
    @Expose
    private Integer Standard;

    /**
    * 鉴权类型（0：直连，1：Token）
    */
    @SerializedName("AuthType")
    @Expose
    private Integer AuthType;

    /**
    * 删除（0未删除）
    */
    @SerializedName("Deleted")
    @Expose
    private Integer Deleted;

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
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 数据模版
    */
    @SerializedName("DataTemplate")
    @Expose
    private DataTemplate [] DataTemplate;

    /**
    * 数据协议（native/template）
    */
    @SerializedName("DataProtocol")
    @Expose
    private String DataProtocol;

    /**
    * 直连用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 直连密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 通信方式
    */
    @SerializedName("CommProtocol")
    @Expose
    private String CommProtocol;

    /**
    * qps
    */
    @SerializedName("Qps")
    @Expose
    private Integer Qps;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 产品的设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 关联的产品列表
    */
    @SerializedName("AssociatedProducts")
    @Expose
    private String [] AssociatedProducts;

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取产品Key
     * @return ProductKey 产品Key
     */
    public String getProductKey() {
        return this.ProductKey;
    }

    /**
     * 设置产品Key
     * @param ProductKey 产品Key
     */
    public void setProductKey(String ProductKey) {
        this.ProductKey = ProductKey;
    }

    /**
     * 获取AppId
     * @return AppId AppId
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置AppId
     * @param AppId AppId
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取产品名称
     * @return Name 产品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置产品名称
     * @param Name 产品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取产品描述
     * @return Description 产品描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置产品描述
     * @param Description 产品描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取连接域名
     * @return Domain 连接域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置连接域名
     * @param Domain 连接域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取产品规格
     * @return Standard 产品规格
     */
    public Integer getStandard() {
        return this.Standard;
    }

    /**
     * 设置产品规格
     * @param Standard 产品规格
     */
    public void setStandard(Integer Standard) {
        this.Standard = Standard;
    }

    /**
     * 获取鉴权类型（0：直连，1：Token）
     * @return AuthType 鉴权类型（0：直连，1：Token）
     */
    public Integer getAuthType() {
        return this.AuthType;
    }

    /**
     * 设置鉴权类型（0：直连，1：Token）
     * @param AuthType 鉴权类型（0：直连，1：Token）
     */
    public void setAuthType(Integer AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * 获取删除（0未删除）
     * @return Deleted 删除（0未删除）
     */
    public Integer getDeleted() {
        return this.Deleted;
    }

    /**
     * 设置删除（0未删除）
     * @param Deleted 删除（0未删除）
     */
    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * 获取备注
     * @return Message 备注
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置备注
     * @param Message 备注
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取更新时间
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取数据模版
     * @return DataTemplate 数据模版
     */
    public DataTemplate [] getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * 设置数据模版
     * @param DataTemplate 数据模版
     */
    public void setDataTemplate(DataTemplate [] DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * 获取数据协议（native/template）
     * @return DataProtocol 数据协议（native/template）
     */
    public String getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * 设置数据协议（native/template）
     * @param DataProtocol 数据协议（native/template）
     */
    public void setDataProtocol(String DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * 获取直连用户名
     * @return Username 直连用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * 设置直连用户名
     * @param Username 直连用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * 获取直连密码
     * @return Password 直连密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置直连密码
     * @param Password 直连密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取通信方式
     * @return CommProtocol 通信方式
     */
    public String getCommProtocol() {
        return this.CommProtocol;
    }

    /**
     * 设置通信方式
     * @param CommProtocol 通信方式
     */
    public void setCommProtocol(String CommProtocol) {
        this.CommProtocol = CommProtocol;
    }

    /**
     * 获取qps
     * @return Qps qps
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * 设置qps
     * @param Qps qps
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * 获取地域
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取产品的设备类型
     * @return DeviceType 产品的设备类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * 设置产品的设备类型
     * @param DeviceType 产品的设备类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * 获取关联的产品列表
     * @return AssociatedProducts 关联的产品列表
     */
    public String [] getAssociatedProducts() {
        return this.AssociatedProducts;
    }

    /**
     * 设置关联的产品列表
     * @param AssociatedProducts 关联的产品列表
     */
    public void setAssociatedProducts(String [] AssociatedProducts) {
        this.AssociatedProducts = AssociatedProducts;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductKey", this.ProductKey);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Standard", this.Standard);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "DataTemplate.", this.DataTemplate);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CommProtocol", this.CommProtocol);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamArraySimple(map, prefix + "AssociatedProducts.", this.AssociatedProducts);

    }
}

