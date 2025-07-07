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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgProductFinancial extends AbstractModel {

    /**
    * 产品Code。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品名。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 产品消耗，单位：元。
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * 占比%。
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
     * Get 产品Code。 
     * @return ProductName 产品Code。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品Code。
     * @param ProductName 产品Code。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品名。 
     * @return ProductCode 产品名。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品名。
     * @param ProductCode 产品名。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 产品消耗，单位：元。 
     * @return TotalCost 产品消耗，单位：元。
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 产品消耗，单位：元。
     * @param TotalCost 产品消耗，单位：元。
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 占比%。 
     * @return Ratio 占比%。
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set 占比%。
     * @param Ratio 占比%。
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    public OrgProductFinancial() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgProductFinancial(OrgProductFinancial source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

