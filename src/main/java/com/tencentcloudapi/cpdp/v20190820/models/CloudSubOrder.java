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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudSubOrder extends AbstractModel{

    /**
    * 子订单号。
长度32个字符供参考，部分渠道存在长度更短的情况接入时请联系开发咨询。
    */
    @SerializedName("SubOutTradeNo")
    @Expose
    private String SubOutTradeNo;

    /**
    * 支付子商户ID。
米大师计费SubAppId，代表子商户。
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 商品名称。
业务自定义的子订单商品名称，无需URL编码，长度限制以具体所接入渠道为准。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 商品详情。
业务自定义的子订单商品详情，无需URL编码，长度限制以具体所接入渠道为准。
    */
    @SerializedName("ProductDetail")
    @Expose
    private String ProductDetail;

    /**
    * 平台应收。
子订单平台应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
    */
    @SerializedName("PlatformIncome")
    @Expose
    private Long PlatformIncome;

    /**
    * 商户应收。
子订单结算应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
    */
    @SerializedName("SubMchIncome")
    @Expose
    private Long SubMchIncome;

    /**
    * 透传字段。
发货标识，由开发者在调用米大师下单接口的 时候下发。
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 支付金额。
子订单支付金额，需要注意的是Amt = PlatformIncome+SubMchIncome。
    */
    @SerializedName("Amt")
    @Expose
    private Long Amt;

    /**
    * 原始金额。
子订单原始金额，OriginalAmt>=Amt。
    */
    @SerializedName("OriginalAmt")
    @Expose
    private Long OriginalAmt;

    /**
    * 微信子商户号。
    */
    @SerializedName("WxSubMchId")
    @Expose
    private String WxSubMchId;

    /**
    * 结算信息。
例如是否需要分账、是否需要支付确认等。
    */
    @SerializedName("SettleInfo")
    @Expose
    private CloudSettleInfo SettleInfo;

    /**
    * 附加项信息列表。
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能。
    */
    @SerializedName("AttachmentInfoList")
    @Expose
    private CloudAttachmentInfo [] AttachmentInfoList;

    /**
     * Get 子订单号。
长度32个字符供参考，部分渠道存在长度更短的情况接入时请联系开发咨询。 
     * @return SubOutTradeNo 子订单号。
长度32个字符供参考，部分渠道存在长度更短的情况接入时请联系开发咨询。
     */
    public String getSubOutTradeNo() {
        return this.SubOutTradeNo;
    }

    /**
     * Set 子订单号。
长度32个字符供参考，部分渠道存在长度更短的情况接入时请联系开发咨询。
     * @param SubOutTradeNo 子订单号。
长度32个字符供参考，部分渠道存在长度更短的情况接入时请联系开发咨询。
     */
    public void setSubOutTradeNo(String SubOutTradeNo) {
        this.SubOutTradeNo = SubOutTradeNo;
    }

    /**
     * Get 支付子商户ID。
米大师计费SubAppId，代表子商户。 
     * @return SubAppId 支付子商户ID。
米大师计费SubAppId，代表子商户。
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 支付子商户ID。
米大师计费SubAppId，代表子商户。
     * @param SubAppId 支付子商户ID。
米大师计费SubAppId，代表子商户。
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 商品名称。
业务自定义的子订单商品名称，无需URL编码，长度限制以具体所接入渠道为准。 
     * @return ProductName 商品名称。
业务自定义的子订单商品名称，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 商品名称。
业务自定义的子订单商品名称，无需URL编码，长度限制以具体所接入渠道为准。
     * @param ProductName 商品名称。
业务自定义的子订单商品名称，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 商品详情。
业务自定义的子订单商品详情，无需URL编码，长度限制以具体所接入渠道为准。 
     * @return ProductDetail 商品详情。
业务自定义的子订单商品详情，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public String getProductDetail() {
        return this.ProductDetail;
    }

    /**
     * Set 商品详情。
业务自定义的子订单商品详情，无需URL编码，长度限制以具体所接入渠道为准。
     * @param ProductDetail 商品详情。
业务自定义的子订单商品详情，无需URL编码，长度限制以具体所接入渠道为准。
     */
    public void setProductDetail(String ProductDetail) {
        this.ProductDetail = ProductDetail;
    }

    /**
     * Get 平台应收。
子订单平台应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。 
     * @return PlatformIncome 平台应收。
子订单平台应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
     */
    public Long getPlatformIncome() {
        return this.PlatformIncome;
    }

    /**
     * Set 平台应收。
子订单平台应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
     * @param PlatformIncome 平台应收。
子订单平台应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
     */
    public void setPlatformIncome(Long PlatformIncome) {
        this.PlatformIncome = PlatformIncome;
    }

    /**
     * Get 商户应收。
子订单结算应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。 
     * @return SubMchIncome 商户应收。
子订单结算应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
     */
    public Long getSubMchIncome() {
        return this.SubMchIncome;
    }

    /**
     * Set 商户应收。
子订单结算应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
     * @param SubMchIncome 商户应收。
子订单结算应收金额，单位：分，需要注意的是Amt = PlatformIncome+SubMchIncome。
     */
    public void setSubMchIncome(Long SubMchIncome) {
        this.SubMchIncome = SubMchIncome;
    }

    /**
     * Get 透传字段。
发货标识，由开发者在调用米大师下单接口的 时候下发。 
     * @return Metadata 透传字段。
发货标识，由开发者在调用米大师下单接口的 时候下发。
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 透传字段。
发货标识，由开发者在调用米大师下单接口的 时候下发。
     * @param Metadata 透传字段。
发货标识，由开发者在调用米大师下单接口的 时候下发。
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 支付金额。
子订单支付金额，需要注意的是Amt = PlatformIncome+SubMchIncome。 
     * @return Amt 支付金额。
子订单支付金额，需要注意的是Amt = PlatformIncome+SubMchIncome。
     */
    public Long getAmt() {
        return this.Amt;
    }

    /**
     * Set 支付金额。
子订单支付金额，需要注意的是Amt = PlatformIncome+SubMchIncome。
     * @param Amt 支付金额。
子订单支付金额，需要注意的是Amt = PlatformIncome+SubMchIncome。
     */
    public void setAmt(Long Amt) {
        this.Amt = Amt;
    }

    /**
     * Get 原始金额。
子订单原始金额，OriginalAmt>=Amt。 
     * @return OriginalAmt 原始金额。
子订单原始金额，OriginalAmt>=Amt。
     */
    public Long getOriginalAmt() {
        return this.OriginalAmt;
    }

    /**
     * Set 原始金额。
子订单原始金额，OriginalAmt>=Amt。
     * @param OriginalAmt 原始金额。
子订单原始金额，OriginalAmt>=Amt。
     */
    public void setOriginalAmt(Long OriginalAmt) {
        this.OriginalAmt = OriginalAmt;
    }

    /**
     * Get 微信子商户号。 
     * @return WxSubMchId 微信子商户号。
     */
    public String getWxSubMchId() {
        return this.WxSubMchId;
    }

    /**
     * Set 微信子商户号。
     * @param WxSubMchId 微信子商户号。
     */
    public void setWxSubMchId(String WxSubMchId) {
        this.WxSubMchId = WxSubMchId;
    }

    /**
     * Get 结算信息。
例如是否需要分账、是否需要支付确认等。 
     * @return SettleInfo 结算信息。
例如是否需要分账、是否需要支付确认等。
     */
    public CloudSettleInfo getSettleInfo() {
        return this.SettleInfo;
    }

    /**
     * Set 结算信息。
例如是否需要分账、是否需要支付确认等。
     * @param SettleInfo 结算信息。
例如是否需要分账、是否需要支付确认等。
     */
    public void setSettleInfo(CloudSettleInfo SettleInfo) {
        this.SettleInfo = SettleInfo;
    }

    /**
     * Get 附加项信息列表。
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能。 
     * @return AttachmentInfoList 附加项信息列表。
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能。
     */
    public CloudAttachmentInfo [] getAttachmentInfoList() {
        return this.AttachmentInfoList;
    }

    /**
     * Set 附加项信息列表。
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能。
     * @param AttachmentInfoList 附加项信息列表。
例如溢价信息、抵扣信息、积分信息、补贴信息
通过该字段可以实现渠道方的优惠抵扣补贴等营销功能。
     */
    public void setAttachmentInfoList(CloudAttachmentInfo [] AttachmentInfoList) {
        this.AttachmentInfoList = AttachmentInfoList;
    }

    public CloudSubOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudSubOrder(CloudSubOrder source) {
        if (source.SubOutTradeNo != null) {
            this.SubOutTradeNo = new String(source.SubOutTradeNo);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductDetail != null) {
            this.ProductDetail = new String(source.ProductDetail);
        }
        if (source.PlatformIncome != null) {
            this.PlatformIncome = new Long(source.PlatformIncome);
        }
        if (source.SubMchIncome != null) {
            this.SubMchIncome = new Long(source.SubMchIncome);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.Amt != null) {
            this.Amt = new Long(source.Amt);
        }
        if (source.OriginalAmt != null) {
            this.OriginalAmt = new Long(source.OriginalAmt);
        }
        if (source.WxSubMchId != null) {
            this.WxSubMchId = new String(source.WxSubMchId);
        }
        if (source.SettleInfo != null) {
            this.SettleInfo = new CloudSettleInfo(source.SettleInfo);
        }
        if (source.AttachmentInfoList != null) {
            this.AttachmentInfoList = new CloudAttachmentInfo[source.AttachmentInfoList.length];
            for (int i = 0; i < source.AttachmentInfoList.length; i++) {
                this.AttachmentInfoList[i] = new CloudAttachmentInfo(source.AttachmentInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubOutTradeNo", this.SubOutTradeNo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDetail", this.ProductDetail);
        this.setParamSimple(map, prefix + "PlatformIncome", this.PlatformIncome);
        this.setParamSimple(map, prefix + "SubMchIncome", this.SubMchIncome);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "Amt", this.Amt);
        this.setParamSimple(map, prefix + "OriginalAmt", this.OriginalAmt);
        this.setParamSimple(map, prefix + "WxSubMchId", this.WxSubMchId);
        this.setParamObj(map, prefix + "SettleInfo.", this.SettleInfo);
        this.setParamArrayObj(map, prefix + "AttachmentInfoList.", this.AttachmentInfoList);

    }
}

