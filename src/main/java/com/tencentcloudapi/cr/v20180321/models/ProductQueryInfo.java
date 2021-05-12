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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductQueryInfo extends AbstractModel{

    /**
    * 产品Id
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
    * 产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 产品状态 0 禁用 1 启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductStatus")
    @Expose
    private Long ProductStatus;

    /**
    * 场景类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

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
     * Get 产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 产品状态 0 禁用 1 启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductStatus 产品状态 0 禁用 1 启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProductStatus() {
        return this.ProductStatus;
    }

    /**
     * Set 产品状态 0 禁用 1 启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductStatus 产品状态 0 禁用 1 启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductStatus(Long ProductStatus) {
        this.ProductStatus = ProductStatus;
    }

    /**
     * Get 场景类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneType 场景类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 场景类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneType 场景类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    public ProductQueryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductQueryInfo(ProductQueryInfo source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductStatus != null) {
            this.ProductStatus = new Long(source.ProductStatus);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductStatus", this.ProductStatus);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);

    }
}

