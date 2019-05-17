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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStudioProductRequest  extends AbstractModel{

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品分组模板ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 产品类型
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 加密类型
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * 连接类型
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 数据协议
    */
    @SerializedName("DataProtocol")
    @Expose
    private Long DataProtocol;

    /**
    * 产品描述
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * 产品的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * 获取产品名称
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * 设置产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * 获取产品分组模板ID
     * @return CategoryId 产品分组模板ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * 设置产品分组模板ID
     * @param CategoryId 产品分组模板ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * 获取产品类型
     * @return ProductType 产品类型
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * 设置产品类型
     * @param ProductType 产品类型
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * 获取加密类型
     * @return EncryptionType 加密类型
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * 设置加密类型
     * @param EncryptionType 加密类型
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * 获取连接类型
     * @return NetType 连接类型
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * 设置连接类型
     * @param NetType 连接类型
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * 获取数据协议
     * @return DataProtocol 数据协议
     */
    public Long getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * 设置数据协议
     * @param DataProtocol 数据协议
     */
    public void setDataProtocol(Long DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * 获取产品描述
     * @return ProductDesc 产品描述
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * 设置产品描述
     * @param ProductDesc 产品描述
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * 获取产品的项目ID
     * @return ProjectId 产品的项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置产品的项目ID
     * @param ProjectId 产品的项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

