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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmSupportedAssetType extends AbstractModel {

    /**
    * <p>产品名（用于查询）</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>地域列表</p>
    */
    @SerializedName("Regions")
    @Expose
    private RegionConfig [] Regions;

    /**
    * <p>产品名-用于展示</p>
    */
    @SerializedName("ProductDisplayName")
    @Expose
    private String ProductDisplayName;

    /**
    * <p>产品组名</p>
    */
    @SerializedName("ProductGroup")
    @Expose
    private String ProductGroup;

    /**
    * <p>给定资产类型的资产实例总数</p>
    */
    @SerializedName("AssetTotal")
    @Expose
    private Long AssetTotal;

    /**
     * Get <p>产品名（用于查询）</p> 
     * @return Product <p>产品名（用于查询）</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品名（用于查询）</p>
     * @param Product <p>产品名（用于查询）</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>地域列表</p> 
     * @return Regions <p>地域列表</p>
     */
    public RegionConfig [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>地域列表</p>
     * @param Regions <p>地域列表</p>
     */
    public void setRegions(RegionConfig [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>产品名-用于展示</p> 
     * @return ProductDisplayName <p>产品名-用于展示</p>
     */
    public String getProductDisplayName() {
        return this.ProductDisplayName;
    }

    /**
     * Set <p>产品名-用于展示</p>
     * @param ProductDisplayName <p>产品名-用于展示</p>
     */
    public void setProductDisplayName(String ProductDisplayName) {
        this.ProductDisplayName = ProductDisplayName;
    }

    /**
     * Get <p>产品组名</p> 
     * @return ProductGroup <p>产品组名</p>
     */
    public String getProductGroup() {
        return this.ProductGroup;
    }

    /**
     * Set <p>产品组名</p>
     * @param ProductGroup <p>产品组名</p>
     */
    public void setProductGroup(String ProductGroup) {
        this.ProductGroup = ProductGroup;
    }

    /**
     * Get <p>给定资产类型的资产实例总数</p> 
     * @return AssetTotal <p>给定资产类型的资产实例总数</p>
     */
    public Long getAssetTotal() {
        return this.AssetTotal;
    }

    /**
     * Set <p>给定资产类型的资产实例总数</p>
     * @param AssetTotal <p>给定资产类型的资产实例总数</p>
     */
    public void setAssetTotal(Long AssetTotal) {
        this.AssetTotal = AssetTotal;
    }

    public DspmSupportedAssetType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmSupportedAssetType(DspmSupportedAssetType source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Regions != null) {
            this.Regions = new RegionConfig[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new RegionConfig(source.Regions[i]);
            }
        }
        if (source.ProductDisplayName != null) {
            this.ProductDisplayName = new String(source.ProductDisplayName);
        }
        if (source.ProductGroup != null) {
            this.ProductGroup = new String(source.ProductGroup);
        }
        if (source.AssetTotal != null) {
            this.AssetTotal = new Long(source.AssetTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);
        this.setParamSimple(map, prefix + "ProductDisplayName", this.ProductDisplayName);
        this.setParamSimple(map, prefix + "ProductGroup", this.ProductGroup);
        this.setParamSimple(map, prefix + "AssetTotal", this.AssetTotal);

    }
}

