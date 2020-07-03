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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductInfo extends AbstractModel{

    /**
    * 模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板主题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductTitle")
    @Expose
    private String ProductTitle;

    /**
    * 模板描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * 模板封面地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCover")
    @Expose
    private String ProductCover;

    /**
    * 内容作品id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 作品预览链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductUrl")
    @Expose
    private String ProductUrl;

    /**
    * 作品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get 模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板主题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductTitle 模板主题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductTitle() {
        return this.ProductTitle;
    }

    /**
     * Set 模板主题
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductTitle 模板主题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductTitle(String ProductTitle) {
        this.ProductTitle = ProductTitle;
    }

    /**
     * Get 模板描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductDesc 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductDesc 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get 模板封面地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCover 模板封面地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCover() {
        return this.ProductCover;
    }

    /**
     * Set 模板封面地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCover 模板封面地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCover(String ProductCover) {
        this.ProductCover = ProductCover;
    }

    /**
     * Get 内容作品id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 内容作品id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 内容作品id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 内容作品id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 作品预览链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductUrl 作品预览链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductUrl() {
        return this.ProductUrl;
    }

    /**
     * Set 作品预览链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductUrl 作品预览链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductUrl(String ProductUrl) {
        this.ProductUrl = ProductUrl;
    }

    /**
     * Get 作品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 作品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 作品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 作品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ProductTitle", this.ProductTitle);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "ProductCover", this.ProductCover);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductUrl", this.ProductUrl);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

