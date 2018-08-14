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
    * 产品直连密钥
    */
    @SerializedName("ProductSecret")
    @Expose
    private String ProductSecret;

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
    private Object DataTemplate;

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
     * 获取产品直连密钥
     * @return ProductSecret 产品直连密钥
     */
    public String getProductSecret() {
        return this.ProductSecret;
    }

    /**
     * 设置产品直连密钥
     * @param ProductSecret 产品直连密钥
     */
    public void setProductSecret(String ProductSecret) {
        this.ProductSecret = ProductSecret;
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
    public Object getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * 设置数据模版
     * @param DataTemplate 数据模版
     */
    public void setDataTemplate(Object DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductKey", this.ProductKey);
        this.setParamSimple(map, prefix + "ProductSecret", this.ProductSecret);
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
        this.setParamObj(map, prefix + "DataTemplate.", this.DataTemplate);

    }
}

