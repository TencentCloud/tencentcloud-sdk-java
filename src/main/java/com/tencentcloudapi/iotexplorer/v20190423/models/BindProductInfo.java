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

public class BindProductInfo extends AbstractModel {

    /**
    * 产品ID。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品所属项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 物模型类型。
    */
    @SerializedName("DataProtocol")
    @Expose
    private Long DataProtocol;

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
    * 连接类型
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 状态
    */
    @SerializedName("DevStatus")
    @Expose
    private String DevStatus;

    /**
    * 产品拥有者名称
    */
    @SerializedName("ProductOwnerName")
    @Expose
    private String ProductOwnerName;

    /**
     * Get 产品ID。 
     * @return ProductId 产品ID。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID。
     * @param ProductId 产品ID。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品名称。 
     * @return ProductName 产品名称。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称。
     * @param ProductName 产品名称。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品所属项目ID。 
     * @return ProjectId 产品所属项目ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 产品所属项目ID。
     * @param ProjectId 产品所属项目ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 物模型类型。 
     * @return DataProtocol 物模型类型。
     */
    public Long getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set 物模型类型。
     * @param DataProtocol 物模型类型。
     */
    public void setDataProtocol(Long DataProtocol) {
        this.DataProtocol = DataProtocol;
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
     * Get 产品拥有者名称 
     * @return ProductOwnerName 产品拥有者名称
     */
    public String getProductOwnerName() {
        return this.ProductOwnerName;
    }

    /**
     * Set 产品拥有者名称
     * @param ProductOwnerName 产品拥有者名称
     */
    public void setProductOwnerName(String ProductOwnerName) {
        this.ProductOwnerName = ProductOwnerName;
    }

    public BindProductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindProductInfo(BindProductInfo source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DataProtocol != null) {
            this.DataProtocol = new Long(source.DataProtocol);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.DevStatus != null) {
            this.DevStatus = new String(source.DevStatus);
        }
        if (source.ProductOwnerName != null) {
            this.ProductOwnerName = new String(source.ProductOwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "DevStatus", this.DevStatus);
        this.setParamSimple(map, prefix + "ProductOwnerName", this.ProductOwnerName);

    }
}

