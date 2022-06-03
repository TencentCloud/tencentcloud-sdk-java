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

public class CreateOpenBankPaymentOrderRequest extends AbstractModel{

    /**
    * 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
__WECHAT__: 微信支付
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 付款方式。如
__EBANK_PAYMENT__:B2B EBank付款
__OPENBANK_PAYMENT__:B2C  openbank付款
__SAFT_ISV__:支付宝安心发
__TRANS_TO_CHANGE__: 微信支付转账到零钱v2
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 付款模式。默认直接支付，如
__DIRECT__:直接支付
__FREEZE__:担保支付
    */
    @SerializedName("PaymentMode")
    @Expose
    private String PaymentMode;

    /**
    * 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 付款金额，单位分。
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 固定值CNY。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 付款方信息。
    */
    @SerializedName("PayerInfo")
    @Expose
    private OpenBankPayerInfo PayerInfo;

    /**
    * 收款方信息。
    */
    @SerializedName("PayeeInfo")
    @Expose
    private OpenBankPayeeInfo PayeeInfo;

    /**
    * 通知地址，如www.test.com。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 前端成功回调URL。条件可选。
    */
    @SerializedName("FrontUrl")
    @Expose
    private String FrontUrl;

    /**
    * 前端刷新 URL。条件可选。
    */
    @SerializedName("RefreshUrl")
    @Expose
    private String RefreshUrl;

    /**
    * 设备信息，条件可选。
    */
    @SerializedName("SceneInfo")
    @Expose
    private OpenBankSceneInfo SceneInfo;

    /**
    * 商品信息，条件可选。
    */
    @SerializedName("GoodsInfo")
    @Expose
    private OpenBankGoodsInfo GoodsInfo;

    /**
    * 附加信息，查询时原样返回。
    */
    @SerializedName("Attachment")
    @Expose
    private String Attachment;

    /**
    * 若不上传，即使用默认值无需分润
__NO_NEED_SHARE__：无需分润；
__SHARE_BY_INFO__：分润时指定金额，此时如果分润信息 ProfitShareInfo为空，只冻结，不分账给其他商户；需要调用解冻接口。
__SHARE_BY_API__：后续调用分润接口决定分润金额
    */
    @SerializedName("ProfitShareFlag")
    @Expose
    private String ProfitShareFlag;

    /**
    * 分润信息，配合ProfitShareFlag使用。
    */
    @SerializedName("ProfitShareInfoList")
    @Expose
    private OpenBankProfitShareInfo [] ProfitShareInfoList;

    /**
    * 备注信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 云企付渠道商户号。外部接入平台入驻云企付平台后下发。 
     * @return ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     * @param ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
__WECHAT__: 微信支付 
     * @return ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
__WECHAT__: 微信支付
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
__WECHAT__: 微信支付
     * @param ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
__WECHAT__: 微信支付
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 付款方式。如
__EBANK_PAYMENT__:B2B EBank付款
__OPENBANK_PAYMENT__:B2C  openbank付款
__SAFT_ISV__:支付宝安心发
__TRANS_TO_CHANGE__: 微信支付转账到零钱v2 
     * @return PaymentMethod 付款方式。如
__EBANK_PAYMENT__:B2B EBank付款
__OPENBANK_PAYMENT__:B2C  openbank付款
__SAFT_ISV__:支付宝安心发
__TRANS_TO_CHANGE__: 微信支付转账到零钱v2
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 付款方式。如
__EBANK_PAYMENT__:B2B EBank付款
__OPENBANK_PAYMENT__:B2C  openbank付款
__SAFT_ISV__:支付宝安心发
__TRANS_TO_CHANGE__: 微信支付转账到零钱v2
     * @param PaymentMethod 付款方式。如
__EBANK_PAYMENT__:B2B EBank付款
__OPENBANK_PAYMENT__:B2C  openbank付款
__SAFT_ISV__:支付宝安心发
__TRANS_TO_CHANGE__: 微信支付转账到零钱v2
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 付款模式。默认直接支付，如
__DIRECT__:直接支付
__FREEZE__:担保支付 
     * @return PaymentMode 付款模式。默认直接支付，如
__DIRECT__:直接支付
__FREEZE__:担保支付
     */
    public String getPaymentMode() {
        return this.PaymentMode;
    }

    /**
     * Set 付款模式。默认直接支付，如
__DIRECT__:直接支付
__FREEZE__:担保支付
     * @param PaymentMode 付款模式。默认直接支付，如
__DIRECT__:直接支付
__FREEZE__:担保支付
     */
    public void setPaymentMode(String PaymentMode) {
        this.PaymentMode = PaymentMode;
    }

    /**
     * Get 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。 
     * @return OutOrderId 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
     * @param OutOrderId 外部订单号,只能是数字、大小写字母，且在同一个接入平台下唯一，限定长度40位。
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 付款金额，单位分。 
     * @return TotalAmount 付款金额，单位分。
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 付款金额，单位分。
     * @param TotalAmount 付款金额，单位分。
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 固定值CNY。 
     * @return Currency 固定值CNY。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 固定值CNY。
     * @param Currency 固定值CNY。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 付款方信息。 
     * @return PayerInfo 付款方信息。
     */
    public OpenBankPayerInfo getPayerInfo() {
        return this.PayerInfo;
    }

    /**
     * Set 付款方信息。
     * @param PayerInfo 付款方信息。
     */
    public void setPayerInfo(OpenBankPayerInfo PayerInfo) {
        this.PayerInfo = PayerInfo;
    }

    /**
     * Get 收款方信息。 
     * @return PayeeInfo 收款方信息。
     */
    public OpenBankPayeeInfo getPayeeInfo() {
        return this.PayeeInfo;
    }

    /**
     * Set 收款方信息。
     * @param PayeeInfo 收款方信息。
     */
    public void setPayeeInfo(OpenBankPayeeInfo PayeeInfo) {
        this.PayeeInfo = PayeeInfo;
    }

    /**
     * Get 通知地址，如www.test.com。 
     * @return NotifyUrl 通知地址，如www.test.com。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 通知地址，如www.test.com。
     * @param NotifyUrl 通知地址，如www.test.com。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 订单过期时间，yyyy-MM-dd HH:mm:ss格式。 
     * @return ExpireTime 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
     * @param ExpireTime 订单过期时间，yyyy-MM-dd HH:mm:ss格式。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 前端成功回调URL。条件可选。 
     * @return FrontUrl 前端成功回调URL。条件可选。
     */
    public String getFrontUrl() {
        return this.FrontUrl;
    }

    /**
     * Set 前端成功回调URL。条件可选。
     * @param FrontUrl 前端成功回调URL。条件可选。
     */
    public void setFrontUrl(String FrontUrl) {
        this.FrontUrl = FrontUrl;
    }

    /**
     * Get 前端刷新 URL。条件可选。 
     * @return RefreshUrl 前端刷新 URL。条件可选。
     */
    public String getRefreshUrl() {
        return this.RefreshUrl;
    }

    /**
     * Set 前端刷新 URL。条件可选。
     * @param RefreshUrl 前端刷新 URL。条件可选。
     */
    public void setRefreshUrl(String RefreshUrl) {
        this.RefreshUrl = RefreshUrl;
    }

    /**
     * Get 设备信息，条件可选。 
     * @return SceneInfo 设备信息，条件可选。
     */
    public OpenBankSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 设备信息，条件可选。
     * @param SceneInfo 设备信息，条件可选。
     */
    public void setSceneInfo(OpenBankSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get 商品信息，条件可选。 
     * @return GoodsInfo 商品信息，条件可选。
     */
    public OpenBankGoodsInfo getGoodsInfo() {
        return this.GoodsInfo;
    }

    /**
     * Set 商品信息，条件可选。
     * @param GoodsInfo 商品信息，条件可选。
     */
    public void setGoodsInfo(OpenBankGoodsInfo GoodsInfo) {
        this.GoodsInfo = GoodsInfo;
    }

    /**
     * Get 附加信息，查询时原样返回。 
     * @return Attachment 附加信息，查询时原样返回。
     */
    public String getAttachment() {
        return this.Attachment;
    }

    /**
     * Set 附加信息，查询时原样返回。
     * @param Attachment 附加信息，查询时原样返回。
     */
    public void setAttachment(String Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * Get 若不上传，即使用默认值无需分润
__NO_NEED_SHARE__：无需分润；
__SHARE_BY_INFO__：分润时指定金额，此时如果分润信息 ProfitShareInfo为空，只冻结，不分账给其他商户；需要调用解冻接口。
__SHARE_BY_API__：后续调用分润接口决定分润金额 
     * @return ProfitShareFlag 若不上传，即使用默认值无需分润
__NO_NEED_SHARE__：无需分润；
__SHARE_BY_INFO__：分润时指定金额，此时如果分润信息 ProfitShareInfo为空，只冻结，不分账给其他商户；需要调用解冻接口。
__SHARE_BY_API__：后续调用分润接口决定分润金额
     */
    public String getProfitShareFlag() {
        return this.ProfitShareFlag;
    }

    /**
     * Set 若不上传，即使用默认值无需分润
__NO_NEED_SHARE__：无需分润；
__SHARE_BY_INFO__：分润时指定金额，此时如果分润信息 ProfitShareInfo为空，只冻结，不分账给其他商户；需要调用解冻接口。
__SHARE_BY_API__：后续调用分润接口决定分润金额
     * @param ProfitShareFlag 若不上传，即使用默认值无需分润
__NO_NEED_SHARE__：无需分润；
__SHARE_BY_INFO__：分润时指定金额，此时如果分润信息 ProfitShareInfo为空，只冻结，不分账给其他商户；需要调用解冻接口。
__SHARE_BY_API__：后续调用分润接口决定分润金额
     */
    public void setProfitShareFlag(String ProfitShareFlag) {
        this.ProfitShareFlag = ProfitShareFlag;
    }

    /**
     * Get 分润信息，配合ProfitShareFlag使用。 
     * @return ProfitShareInfoList 分润信息，配合ProfitShareFlag使用。
     */
    public OpenBankProfitShareInfo [] getProfitShareInfoList() {
        return this.ProfitShareInfoList;
    }

    /**
     * Set 分润信息，配合ProfitShareFlag使用。
     * @param ProfitShareInfoList 分润信息，配合ProfitShareFlag使用。
     */
    public void setProfitShareInfoList(OpenBankProfitShareInfo [] ProfitShareInfoList) {
        this.ProfitShareInfoList = ProfitShareInfoList;
    }

    /**
     * Get 备注信息。 
     * @return Remark 备注信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息。
     * @param Remark 备注信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public CreateOpenBankPaymentOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankPaymentOrderRequest(CreateOpenBankPaymentOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.PaymentMode != null) {
            this.PaymentMode = new String(source.PaymentMode);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.PayerInfo != null) {
            this.PayerInfo = new OpenBankPayerInfo(source.PayerInfo);
        }
        if (source.PayeeInfo != null) {
            this.PayeeInfo = new OpenBankPayeeInfo(source.PayeeInfo);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FrontUrl != null) {
            this.FrontUrl = new String(source.FrontUrl);
        }
        if (source.RefreshUrl != null) {
            this.RefreshUrl = new String(source.RefreshUrl);
        }
        if (source.SceneInfo != null) {
            this.SceneInfo = new OpenBankSceneInfo(source.SceneInfo);
        }
        if (source.GoodsInfo != null) {
            this.GoodsInfo = new OpenBankGoodsInfo(source.GoodsInfo);
        }
        if (source.Attachment != null) {
            this.Attachment = new String(source.Attachment);
        }
        if (source.ProfitShareFlag != null) {
            this.ProfitShareFlag = new String(source.ProfitShareFlag);
        }
        if (source.ProfitShareInfoList != null) {
            this.ProfitShareInfoList = new OpenBankProfitShareInfo[source.ProfitShareInfoList.length];
            for (int i = 0; i < source.ProfitShareInfoList.length; i++) {
                this.ProfitShareInfoList[i] = new OpenBankProfitShareInfo(source.ProfitShareInfoList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "PaymentMode", this.PaymentMode);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamObj(map, prefix + "PayerInfo.", this.PayerInfo);
        this.setParamObj(map, prefix + "PayeeInfo.", this.PayeeInfo);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FrontUrl", this.FrontUrl);
        this.setParamSimple(map, prefix + "RefreshUrl", this.RefreshUrl);
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);
        this.setParamObj(map, prefix + "GoodsInfo.", this.GoodsInfo);
        this.setParamSimple(map, prefix + "Attachment", this.Attachment);
        this.setParamSimple(map, prefix + "ProfitShareFlag", this.ProfitShareFlag);
        this.setParamArrayObj(map, prefix + "ProfitShareInfoList.", this.ProfitShareInfoList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

