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

public class CloudSubOrderReturn extends AbstractModel{

    /**
    * 子订单号
    */
    @SerializedName("SubOutTradeNo")
    @Expose
    private String SubOutTradeNo;

    /**
    * 米大师计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 子订单商品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 子订单商品详情
    */
    @SerializedName("ProductDetail")
    @Expose
    private String ProductDetail;

    /**
    * 子订单平台应收金额，单位：分
    */
    @SerializedName("PlatformIncome")
    @Expose
    private Long PlatformIncome;

    /**
    * 子订单结算应收金额，单位：分
    */
    @SerializedName("SubMchIncome")
    @Expose
    private Long SubMchIncome;

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
    * 核销状态，1表示核销，0表示未核销
    */
    @SerializedName("SettleCheck")
    @Expose
    private Long SettleCheck;

    /**
    * 结算信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettleInfo")
    @Expose
    private CloudSettleInfo SettleInfo;

    /**
    * 透传字段，由开发者在调用米大师下单接口的时候下发
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 附加项信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachmentInfoList")
    @Expose
    private CloudAttachmentInfo AttachmentInfoList;

    /**
    * 渠道方应答的订单号，透传处理
    */
    @SerializedName("ChannelExternalSubOrderId")
    @Expose
    private String ChannelExternalSubOrderId;

    /**
    * 微信子商户号
    */
    @SerializedName("WxSubMchId")
    @Expose
    private String WxSubMchId;

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
     * Get 米大师计费SubAppId，代表子商户 
     * @return SubAppId 米大师计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 米大师计费SubAppId，代表子商户
     * @param SubAppId 米大师计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get 子订单结算应收金额，单位：分 
     * @return SubMchIncome 子订单结算应收金额，单位：分
     */
    public Long getSubMchIncome() {
        return this.SubMchIncome;
    }

    /**
     * Set 子订单结算应收金额，单位：分
     * @param SubMchIncome 子订单结算应收金额，单位：分
     */
    public void setSubMchIncome(Long SubMchIncome) {
        this.SubMchIncome = SubMchIncome;
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
     * Get 核销状态，1表示核销，0表示未核销 
     * @return SettleCheck 核销状态，1表示核销，0表示未核销
     */
    public Long getSettleCheck() {
        return this.SettleCheck;
    }

    /**
     * Set 核销状态，1表示核销，0表示未核销
     * @param SettleCheck 核销状态，1表示核销，0表示未核销
     */
    public void setSettleCheck(Long SettleCheck) {
        this.SettleCheck = SettleCheck;
    }

    /**
     * Get 结算信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettleInfo 结算信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudSettleInfo getSettleInfo() {
        return this.SettleInfo;
    }

    /**
     * Set 结算信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettleInfo 结算信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettleInfo(CloudSettleInfo SettleInfo) {
        this.SettleInfo = SettleInfo;
    }

    /**
     * Get 透传字段，由开发者在调用米大师下单接口的时候下发 
     * @return Metadata 透传字段，由开发者在调用米大师下单接口的时候下发
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 透传字段，由开发者在调用米大师下单接口的时候下发
     * @param Metadata 透传字段，由开发者在调用米大师下单接口的时候下发
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 附加项信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachmentInfoList 附加项信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudAttachmentInfo getAttachmentInfoList() {
        return this.AttachmentInfoList;
    }

    /**
     * Set 附加项信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachmentInfoList 附加项信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachmentInfoList(CloudAttachmentInfo AttachmentInfoList) {
        this.AttachmentInfoList = AttachmentInfoList;
    }

    /**
     * Get 渠道方应答的订单号，透传处理 
     * @return ChannelExternalSubOrderId 渠道方应答的订单号，透传处理
     */
    public String getChannelExternalSubOrderId() {
        return this.ChannelExternalSubOrderId;
    }

    /**
     * Set 渠道方应答的订单号，透传处理
     * @param ChannelExternalSubOrderId 渠道方应答的订单号，透传处理
     */
    public void setChannelExternalSubOrderId(String ChannelExternalSubOrderId) {
        this.ChannelExternalSubOrderId = ChannelExternalSubOrderId;
    }

    /**
     * Get 微信子商户号 
     * @return WxSubMchId 微信子商户号
     */
    public String getWxSubMchId() {
        return this.WxSubMchId;
    }

    /**
     * Set 微信子商户号
     * @param WxSubMchId 微信子商户号
     */
    public void setWxSubMchId(String WxSubMchId) {
        this.WxSubMchId = WxSubMchId;
    }

    public CloudSubOrderReturn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudSubOrderReturn(CloudSubOrderReturn source) {
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
        if (source.Amt != null) {
            this.Amt = new Long(source.Amt);
        }
        if (source.OriginalAmt != null) {
            this.OriginalAmt = new Long(source.OriginalAmt);
        }
        if (source.SettleCheck != null) {
            this.SettleCheck = new Long(source.SettleCheck);
        }
        if (source.SettleInfo != null) {
            this.SettleInfo = new CloudSettleInfo(source.SettleInfo);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.AttachmentInfoList != null) {
            this.AttachmentInfoList = new CloudAttachmentInfo(source.AttachmentInfoList);
        }
        if (source.ChannelExternalSubOrderId != null) {
            this.ChannelExternalSubOrderId = new String(source.ChannelExternalSubOrderId);
        }
        if (source.WxSubMchId != null) {
            this.WxSubMchId = new String(source.WxSubMchId);
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
        this.setParamSimple(map, prefix + "Amt", this.Amt);
        this.setParamSimple(map, prefix + "OriginalAmt", this.OriginalAmt);
        this.setParamSimple(map, prefix + "SettleCheck", this.SettleCheck);
        this.setParamObj(map, prefix + "SettleInfo.", this.SettleInfo);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamObj(map, prefix + "AttachmentInfoList.", this.AttachmentInfoList);
        this.setParamSimple(map, prefix + "ChannelExternalSubOrderId", this.ChannelExternalSubOrderId);
        this.setParamSimple(map, prefix + "WxSubMchId", this.WxSubMchId);

    }
}

