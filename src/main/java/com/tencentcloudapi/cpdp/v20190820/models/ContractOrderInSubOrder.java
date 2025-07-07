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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContractOrderInSubOrder extends AbstractModel {

    /**
    * 子订单结算应收金额，单位： 分
    */
    @SerializedName("SubMchIncome")
    @Expose
    private Long SubMchIncome;

    /**
    * 子订单平台应收金额，单位：分
    */
    @SerializedName("PlatformIncome")
    @Expose
    private Long PlatformIncome;

    /**
    * 子订单商品详情
    */
    @SerializedName("ProductDetail")
    @Expose
    private String ProductDetail;

    /**
    * 子订单商品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 子订单号
    */
    @SerializedName("SubOutTradeNo")
    @Expose
    private String SubOutTradeNo;

    /**
    * 子订单支付金额
    */
    @SerializedName("Amt")
    @Expose
    private Long Amt;

    /**
    * 子订单原始金额
    */
    @SerializedName("OriginalAmt")
    @Expose
    private Long OriginalAmt;

    /**
    * 发货标识，由业务在调用聚鑫下单接口的 时候下发
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
     * Get 子订单结算应收金额，单位： 分 
     * @return SubMchIncome 子订单结算应收金额，单位： 分
     */
    public Long getSubMchIncome() {
        return this.SubMchIncome;
    }

    /**
     * Set 子订单结算应收金额，单位： 分
     * @param SubMchIncome 子订单结算应收金额，单位： 分
     */
    public void setSubMchIncome(Long SubMchIncome) {
        this.SubMchIncome = SubMchIncome;
    }

    /**
     * Get 子订单平台应收金额，单位：分 
     * @return PlatformIncome 子订单平台应收金额，单位：分
     */
    public Long getPlatformIncome() {
        return this.PlatformIncome;
    }

    /**
     * Set 子订单平台应收金额，单位：分
     * @param PlatformIncome 子订单平台应收金额，单位：分
     */
    public void setPlatformIncome(Long PlatformIncome) {
        this.PlatformIncome = PlatformIncome;
    }

    /**
     * Get 子订单商品详情 
     * @return ProductDetail 子订单商品详情
     */
    public String getProductDetail() {
        return this.ProductDetail;
    }

    /**
     * Set 子订单商品详情
     * @param ProductDetail 子订单商品详情
     */
    public void setProductDetail(String ProductDetail) {
        this.ProductDetail = ProductDetail;
    }

    /**
     * Get 子订单商品名称 
     * @return ProductName 子订单商品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 子订单商品名称
     * @param ProductName 子订单商品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 聚鑫计费SubAppId，代表子商户 
     * @return SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 聚鑫计费SubAppId，代表子商户
     * @param SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 子订单号 
     * @return SubOutTradeNo 子订单号
     */
    public String getSubOutTradeNo() {
        return this.SubOutTradeNo;
    }

    /**
     * Set 子订单号
     * @param SubOutTradeNo 子订单号
     */
    public void setSubOutTradeNo(String SubOutTradeNo) {
        this.SubOutTradeNo = SubOutTradeNo;
    }

    /**
     * Get 子订单支付金额 
     * @return Amt 子订单支付金额
     */
    public Long getAmt() {
        return this.Amt;
    }

    /**
     * Set 子订单支付金额
     * @param Amt 子订单支付金额
     */
    public void setAmt(Long Amt) {
        this.Amt = Amt;
    }

    /**
     * Get 子订单原始金额 
     * @return OriginalAmt 子订单原始金额
     */
    public Long getOriginalAmt() {
        return this.OriginalAmt;
    }

    /**
     * Set 子订单原始金额
     * @param OriginalAmt 子订单原始金额
     */
    public void setOriginalAmt(Long OriginalAmt) {
        this.OriginalAmt = OriginalAmt;
    }

    /**
     * Get 发货标识，由业务在调用聚鑫下单接口的 时候下发 
     * @return Metadata 发货标识，由业务在调用聚鑫下单接口的 时候下发
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 发货标识，由业务在调用聚鑫下单接口的 时候下发
     * @param Metadata 发货标识，由业务在调用聚鑫下单接口的 时候下发
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    public ContractOrderInSubOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractOrderInSubOrder(ContractOrderInSubOrder source) {
        if (source.SubMchIncome != null) {
            this.SubMchIncome = new Long(source.SubMchIncome);
        }
        if (source.PlatformIncome != null) {
            this.PlatformIncome = new Long(source.PlatformIncome);
        }
        if (source.ProductDetail != null) {
            this.ProductDetail = new String(source.ProductDetail);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.SubOutTradeNo != null) {
            this.SubOutTradeNo = new String(source.SubOutTradeNo);
        }
        if (source.Amt != null) {
            this.Amt = new Long(source.Amt);
        }
        if (source.OriginalAmt != null) {
            this.OriginalAmt = new Long(source.OriginalAmt);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubMchIncome", this.SubMchIncome);
        this.setParamSimple(map, prefix + "PlatformIncome", this.PlatformIncome);
        this.setParamSimple(map, prefix + "ProductDetail", this.ProductDetail);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SubOutTradeNo", this.SubOutTradeNo);
        this.setParamSimple(map, prefix + "Amt", this.Amt);
        this.setParamSimple(map, prefix + "OriginalAmt", this.OriginalAmt);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);

    }
}

