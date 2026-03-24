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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigResource extends AbstractModel {

    /**
    * 产品
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 产品名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源类型名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTypeName")
    @Expose
    private String ResourceTypeName;

    /**
     * Get 产品
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Product 产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品
注意：此字段可能返回 null，表示取不到有效值。
     * @param Product 产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 产品名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源类型名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTypeName 资源类型名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceTypeName() {
        return this.ResourceTypeName;
    }

    /**
     * Set 资源类型名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTypeName 资源类型名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTypeName(String ResourceTypeName) {
        this.ResourceTypeName = ResourceTypeName;
    }

    public ConfigResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigResource(ConfigResource source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceTypeName != null) {
            this.ResourceTypeName = new String(source.ResourceTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceTypeName", this.ResourceTypeName);

    }
}

