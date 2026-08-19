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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Item extends AbstractModel {

    /**
    * <p>商品ID</p>
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * <p>商品名称</p>
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * <p>商品类别</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>商品单价</p>
    */
    @SerializedName("Price")
    @Expose
    private Amount Price;

    /**
    * <p>如果商品有UPC码（Universal Product Code），请提供</p>
    */
    @SerializedName("UPC")
    @Expose
    private String UPC;

    /**
    * <p>如果商品有EAN码（European Article Number），请提供</p>
    */
    @SerializedName("EAN")
    @Expose
    private String EAN;

    /**
    * <p>如果商品有SKU码（Stock Keeping Unit），请提供</p>
    */
    @SerializedName("SKU")
    @Expose
    private String SKU;

    /**
    * <p>如果商品有ISBN码（International Standard Book Number ），请提供</p>
    */
    @SerializedName("ISBN")
    @Expose
    private String ISBN;

    /**
    * <p>商品品牌</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>商品数量</p>
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * <p>生产厂商</p>
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * <p>商品标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get <p>商品ID</p> 
     * @return ItemId <p>商品ID</p>
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set <p>商品ID</p>
     * @param ItemId <p>商品ID</p>
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get <p>商品名称</p> 
     * @return ItemName <p>商品名称</p>
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set <p>商品名称</p>
     * @param ItemName <p>商品名称</p>
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get <p>商品类别</p> 
     * @return Category <p>商品类别</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>商品类别</p>
     * @param Category <p>商品类别</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>商品单价</p> 
     * @return Price <p>商品单价</p>
     */
    public Amount getPrice() {
        return this.Price;
    }

    /**
     * Set <p>商品单价</p>
     * @param Price <p>商品单价</p>
     */
    public void setPrice(Amount Price) {
        this.Price = Price;
    }

    /**
     * Get <p>如果商品有UPC码（Universal Product Code），请提供</p> 
     * @return UPC <p>如果商品有UPC码（Universal Product Code），请提供</p>
     */
    public String getUPC() {
        return this.UPC;
    }

    /**
     * Set <p>如果商品有UPC码（Universal Product Code），请提供</p>
     * @param UPC <p>如果商品有UPC码（Universal Product Code），请提供</p>
     */
    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    /**
     * Get <p>如果商品有EAN码（European Article Number），请提供</p> 
     * @return EAN <p>如果商品有EAN码（European Article Number），请提供</p>
     */
    public String getEAN() {
        return this.EAN;
    }

    /**
     * Set <p>如果商品有EAN码（European Article Number），请提供</p>
     * @param EAN <p>如果商品有EAN码（European Article Number），请提供</p>
     */
    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    /**
     * Get <p>如果商品有SKU码（Stock Keeping Unit），请提供</p> 
     * @return SKU <p>如果商品有SKU码（Stock Keeping Unit），请提供</p>
     */
    public String getSKU() {
        return this.SKU;
    }

    /**
     * Set <p>如果商品有SKU码（Stock Keeping Unit），请提供</p>
     * @param SKU <p>如果商品有SKU码（Stock Keeping Unit），请提供</p>
     */
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    /**
     * Get <p>如果商品有ISBN码（International Standard Book Number ），请提供</p> 
     * @return ISBN <p>如果商品有ISBN码（International Standard Book Number ），请提供</p>
     */
    public String getISBN() {
        return this.ISBN;
    }

    /**
     * Set <p>如果商品有ISBN码（International Standard Book Number ），请提供</p>
     * @param ISBN <p>如果商品有ISBN码（International Standard Book Number ），请提供</p>
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Get <p>商品品牌</p> 
     * @return Brand <p>商品品牌</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>商品品牌</p>
     * @param Brand <p>商品品牌</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>商品数量</p> 
     * @return Quantity <p>商品数量</p>
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set <p>商品数量</p>
     * @param Quantity <p>商品数量</p>
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get <p>生产厂商</p> 
     * @return Manufacturer <p>生产厂商</p>
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set <p>生产厂商</p>
     * @param Manufacturer <p>生产厂商</p>
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get <p>商品标签</p> 
     * @return Tags <p>商品标签</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>商品标签</p>
     * @param Tags <p>商品标签</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public Item() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Item(Item source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Price != null) {
            this.Price = new Amount(source.Price);
        }
        if (source.UPC != null) {
            this.UPC = new String(source.UPC);
        }
        if (source.EAN != null) {
            this.EAN = new String(source.EAN);
        }
        if (source.SKU != null) {
            this.SKU = new String(source.SKU);
        }
        if (source.ISBN != null) {
            this.ISBN = new String(source.ISBN);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "UPC", this.UPC);
        this.setParamSimple(map, prefix + "EAN", this.EAN);
        this.setParamSimple(map, prefix + "SKU", this.SKU);
        this.setParamSimple(map, prefix + "ISBN", this.ISBN);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

