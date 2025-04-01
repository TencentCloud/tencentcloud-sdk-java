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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirmwareInfo extends AbstractModel {

    /**
    * 固件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 固件MD5值
    */
    @SerializedName("Md5sum")
    @Expose
    private String Md5sum;

    /**
    * 固件创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 固件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 固件描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 固件升级模块
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 创建者子 uin
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * 创建者昵称
    */
    @SerializedName("CreatorNickName")
    @Expose
    private String CreatorNickName;

    /**
    * 固件用户自定义配置信息
    */
    @SerializedName("UserDefined")
    @Expose
    private String UserDefined;

    /**
     * Get 固件版本 
     * @return Version 固件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 固件版本
     * @param Version 固件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 固件MD5值 
     * @return Md5sum 固件MD5值
     */
    public String getMd5sum() {
        return this.Md5sum;
    }

    /**
     * Set 固件MD5值
     * @param Md5sum 固件MD5值
     */
    public void setMd5sum(String Md5sum) {
        this.Md5sum = Md5sum;
    }

    /**
     * Get 固件创建时间 
     * @return CreateTime 固件创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 固件创建时间
     * @param CreateTime 固件创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 固件名称 
     * @return Name 固件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 固件名称
     * @param Name 固件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 固件描述 
     * @return Description 固件描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 固件描述
     * @param Description 固件描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 固件升级模块 
     * @return FwType 固件升级模块
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 固件升级模块
     * @param FwType 固件升级模块
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 创建者子 uin 
     * @return CreateUserId 创建者子 uin
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 创建者子 uin
     * @param CreateUserId 创建者子 uin
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get 创建者昵称 
     * @return CreatorNickName 创建者昵称
     */
    public String getCreatorNickName() {
        return this.CreatorNickName;
    }

    /**
     * Set 创建者昵称
     * @param CreatorNickName 创建者昵称
     */
    public void setCreatorNickName(String CreatorNickName) {
        this.CreatorNickName = CreatorNickName;
    }

    /**
     * Get 固件用户自定义配置信息 
     * @return UserDefined 固件用户自定义配置信息
     */
    public String getUserDefined() {
        return this.UserDefined;
    }

    /**
     * Set 固件用户自定义配置信息
     * @param UserDefined 固件用户自定义配置信息
     */
    public void setUserDefined(String UserDefined) {
        this.UserDefined = UserDefined;
    }

    public FirmwareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirmwareInfo(FirmwareInfo source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Md5sum != null) {
            this.Md5sum = new String(source.Md5sum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.CreatorNickName != null) {
            this.CreatorNickName = new String(source.CreatorNickName);
        }
        if (source.UserDefined != null) {
            this.UserDefined = new String(source.UserDefined);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Md5sum", this.Md5sum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "CreatorNickName", this.CreatorNickName);
        this.setParamSimple(map, prefix + "UserDefined", this.UserDefined);

    }
}

