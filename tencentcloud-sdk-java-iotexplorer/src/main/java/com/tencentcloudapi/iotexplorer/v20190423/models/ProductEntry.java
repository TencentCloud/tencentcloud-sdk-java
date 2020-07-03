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

public class ProductEntry extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

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
    * 状态
    */
    @SerializedName("DevStatus")
    @Expose
    private String DevStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 产品类型
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 产品ModuleId
    */
    @SerializedName("ModuleId")
    @Expose
    private Long ModuleId;

    /**
    * 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableProductScript")
    @Expose
    private String EnableProductScript;

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
     * Get 产品分组模板ID 
     * @return CategoryId 产品分组模板ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 产品分组模板ID
     * @param CategoryId 产品分组模板ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 加密类型 
     * @return EncryptionType 加密类型
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 加密类型
     * @param EncryptionType 加密类型
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get 连接类型 
     * @return NetType 连接类型
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 连接类型
     * @param NetType 连接类型
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 数据协议 
     * @return DataProtocol 数据协议
     */
    public Long getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set 数据协议
     * @param DataProtocol 数据协议
     */
    public void setDataProtocol(Long DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * Get 产品描述 
     * @return ProductDesc 产品描述
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set 产品描述
     * @param ProductDesc 产品描述
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get 状态 
     * @return DevStatus 状态
     */
    public String getDevStatus() {
        return this.DevStatus;
    }

    /**
     * Set 状态
     * @param DevStatus 状态
     */
    public void setDevStatus(String DevStatus) {
        this.DevStatus = DevStatus;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 产品类型 
     * @return ProductType 产品类型
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品类型
     * @param ProductType 产品类型
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 产品ModuleId 
     * @return ModuleId 产品ModuleId
     */
    public Long getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 产品ModuleId
     * @param ModuleId 产品ModuleId
     */
    public void setModuleId(Long ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableProductScript 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnableProductScript() {
        return this.EnableProductScript;
    }

    /**
     * Set 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableProductScript 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableProductScript(String EnableProductScript) {
        this.EnableProductScript = EnableProductScript;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "DevStatus", this.DevStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "EnableProductScript", this.EnableProductScript);

    }
}

