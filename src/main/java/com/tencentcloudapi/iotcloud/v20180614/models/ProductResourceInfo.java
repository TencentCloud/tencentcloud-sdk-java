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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductResourceInfo extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 产品名
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源文件md5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 资源文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 资源文件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 资源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 产品名 
     * @return ProductName 产品名
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名
     * @param ProductName 产品名
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源文件md5 
     * @return Md5 资源文件md5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 资源文件md5
     * @param Md5 资源文件md5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 资源文件大小 
     * @return Size 资源文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 资源文件大小
     * @param Size 资源文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 资源文件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 资源文件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 资源文件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 资源文件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 资源创建时间 
     * @return CreateTime 资源创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源创建时间
     * @param CreateTime 资源创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ProductResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductResourceInfo(ProductResourceInfo source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

