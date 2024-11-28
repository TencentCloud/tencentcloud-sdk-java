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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDetails extends AbstractModel {

    /**
    * 商品名
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 商品细节
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * 产品码	
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品码	
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 计费项码	
    */
    @SerializedName("BillingItemCode")
    @Expose
    private String BillingItemCode;

    /**
    * 计费细项码	
    */
    @SerializedName("SubBillingItemCode")
    @Expose
    private String SubBillingItemCode;

    /**
    * 产品英文名	
    */
    @SerializedName("ProductEnName")
    @Expose
    private String ProductEnName;

    /**
    * 子产品英文名	
    */
    @SerializedName("SubProductEnName")
    @Expose
    private String SubProductEnName;

    /**
    * 结算周期	
    */
    @SerializedName("CalcUnit")
    @Expose
    private String CalcUnit;

    /**
    * payMode为prepay 且 payScene为common的情况下存在
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 商品名 
     * @return ProductName 商品名
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 商品名
     * @param ProductName 商品名
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 商品细节 
     * @return SubProductName 商品细节
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set 商品细节
     * @param SubProductName 商品细节
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get 产品码	 
     * @return ProductCode 产品码	
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品码	
     * @param ProductCode 产品码	
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品码	 
     * @return SubProductCode 子产品码	
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品码	
     * @param SubProductCode 子产品码	
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 计费项码	 
     * @return BillingItemCode 计费项码	
     */
    public String getBillingItemCode() {
        return this.BillingItemCode;
    }

    /**
     * Set 计费项码	
     * @param BillingItemCode 计费项码	
     */
    public void setBillingItemCode(String BillingItemCode) {
        this.BillingItemCode = BillingItemCode;
    }

    /**
     * Get 计费细项码	 
     * @return SubBillingItemCode 计费细项码	
     */
    public String getSubBillingItemCode() {
        return this.SubBillingItemCode;
    }

    /**
     * Set 计费细项码	
     * @param SubBillingItemCode 计费细项码	
     */
    public void setSubBillingItemCode(String SubBillingItemCode) {
        this.SubBillingItemCode = SubBillingItemCode;
    }

    /**
     * Get 产品英文名	 
     * @return ProductEnName 产品英文名	
     */
    public String getProductEnName() {
        return this.ProductEnName;
    }

    /**
     * Set 产品英文名	
     * @param ProductEnName 产品英文名	
     */
    public void setProductEnName(String ProductEnName) {
        this.ProductEnName = ProductEnName;
    }

    /**
     * Get 子产品英文名	 
     * @return SubProductEnName 子产品英文名	
     */
    public String getSubProductEnName() {
        return this.SubProductEnName;
    }

    /**
     * Set 子产品英文名	
     * @param SubProductEnName 子产品英文名	
     */
    public void setSubProductEnName(String SubProductEnName) {
        this.SubProductEnName = SubProductEnName;
    }

    /**
     * Get 结算周期	 
     * @return CalcUnit 结算周期	
     */
    public String getCalcUnit() {
        return this.CalcUnit;
    }

    /**
     * Set 结算周期	
     * @param CalcUnit 结算周期	
     */
    public void setCalcUnit(String CalcUnit) {
        this.CalcUnit = CalcUnit;
    }

    /**
     * Get payMode为prepay 且 payScene为common的情况下存在 
     * @return Action payMode为prepay 且 payScene为common的情况下存在
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set payMode为prepay 且 payScene为common的情况下存在
     * @param Action payMode为prepay 且 payScene为common的情况下存在
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public UsageDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetails(UsageDetails source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.BillingItemCode != null) {
            this.BillingItemCode = new String(source.BillingItemCode);
        }
        if (source.SubBillingItemCode != null) {
            this.SubBillingItemCode = new String(source.SubBillingItemCode);
        }
        if (source.ProductEnName != null) {
            this.ProductEnName = new String(source.ProductEnName);
        }
        if (source.SubProductEnName != null) {
            this.SubProductEnName = new String(source.SubProductEnName);
        }
        if (source.CalcUnit != null) {
            this.CalcUnit = new String(source.CalcUnit);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "BillingItemCode", this.BillingItemCode);
        this.setParamSimple(map, prefix + "SubBillingItemCode", this.SubBillingItemCode);
        this.setParamSimple(map, prefix + "ProductEnName", this.ProductEnName);
        this.setParamSimple(map, prefix + "SubProductEnName", this.SubProductEnName);
        this.setParamSimple(map, prefix + "CalcUnit", this.CalcUnit);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

