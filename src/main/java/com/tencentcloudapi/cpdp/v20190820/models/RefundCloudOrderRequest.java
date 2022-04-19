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

public class RefundCloudOrderRequest extends AbstractModel{

    /**
    * 米大师分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 用户Id，长度不小于5位，仅支持字母和数字的组合
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
    */
    @SerializedName("RefundId")
    @Expose
    private String RefundId;

    /**
    * 退款金额，单位：分
当该字段为空或者为0时，系统会默认使用订单当实付金额作为退款金额
    */
    @SerializedName("TotalRefundAmt")
    @Expose
    private Long TotalRefundAmt;

    /**
    * 商品订单，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 平台应收金额，单位：分
    */
    @SerializedName("PlatformRefundAmt")
    @Expose
    private Long PlatformRefundAmt;

    /**
    * 结算应收金额，单位：分
    */
    @SerializedName("MchRefundAmt")
    @Expose
    private Long MchRefundAmt;

    /**
    * 支持多个子订单批量退款单个子订单退款支持传SubOutTradeNo
也支持传SubOrderRefundList，都传的时候以SubOrderRefundList为准。
如果传了子单退款细节，外部不需要再传退款金额，平台应退，商户应退金额
    */
    @SerializedName("SubOrderRefundList")
    @Expose
    private CloudSubOrderRefund [] SubOrderRefundList;

    /**
    * 渠道订单号，当出现重复支付时，可以将重复支付订单的渠道订单号传入，以进行退款（注意：目前该重复支付订单的渠道订单号仅能通过米大师内部获取），更多重复支付订单退款说明，请参考[重复支付订单退款说明](https://dev.tke.midas.qq.com/juxin-doc-next/apidocs/receive-order/Refund.html#%E9%87%8D%E5%A4%8D%E6%94%AF%E4%BB%98%E8%AE%A2%E5%8D%95%E9%80%80%E6%AC%BE%E8%AF%B4%E6%98%8E)
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 通知地址
    */
    @SerializedName("RefundNotifyUrl")
    @Expose
    private String RefundNotifyUrl;

    /**
    * 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 渠道扩展退款促销列表，可将各个渠道的退款促销信息放于该列表
    */
    @SerializedName("ExternalRefundPromptGroupList")
    @Expose
    private String ExternalRefundPromptGroupList;

    /**
     * Get 米大师分配的支付主MidasAppId 
     * @return MidasAppId 米大师分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId
     * @param MidasAppId 米大师分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 用户Id，长度不小于5位，仅支持字母和数字的组合 
     * @return UserId 用户Id，长度不小于5位，仅支持字母和数字的组合
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id，长度不小于5位，仅支持字母和数字的组合
     * @param UserId 用户Id，长度不小于5位，仅支持字母和数字的组合
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合 
     * @return RefundId 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public String getRefundId() {
        return this.RefundId;
    }

    /**
     * Set 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     * @param RefundId 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public void setRefundId(String RefundId) {
        this.RefundId = RefundId;
    }

    /**
     * Get 退款金额，单位：分
当该字段为空或者为0时，系统会默认使用订单当实付金额作为退款金额 
     * @return TotalRefundAmt 退款金额，单位：分
当该字段为空或者为0时，系统会默认使用订单当实付金额作为退款金额
     */
    public Long getTotalRefundAmt() {
        return this.TotalRefundAmt;
    }

    /**
     * Set 退款金额，单位：分
当该字段为空或者为0时，系统会默认使用订单当实付金额作为退款金额
     * @param TotalRefundAmt 退款金额，单位：分
当该字段为空或者为0时，系统会默认使用订单当实付金额作为退款金额
     */
    public void setTotalRefundAmt(Long TotalRefundAmt) {
        this.TotalRefundAmt = TotalRefundAmt;
    }

    /**
     * Get 商品订单，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合 
     * @return OutTradeNo 商品订单，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 商品订单，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     * @param OutTradeNo 商品订单，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get 平台应收金额，单位：分 
     * @return PlatformRefundAmt 平台应收金额，单位：分
     */
    public Long getPlatformRefundAmt() {
        return this.PlatformRefundAmt;
    }

    /**
     * Set 平台应收金额，单位：分
     * @param PlatformRefundAmt 平台应收金额，单位：分
     */
    public void setPlatformRefundAmt(Long PlatformRefundAmt) {
        this.PlatformRefundAmt = PlatformRefundAmt;
    }

    /**
     * Get 结算应收金额，单位：分 
     * @return MchRefundAmt 结算应收金额，单位：分
     */
    public Long getMchRefundAmt() {
        return this.MchRefundAmt;
    }

    /**
     * Set 结算应收金额，单位：分
     * @param MchRefundAmt 结算应收金额，单位：分
     */
    public void setMchRefundAmt(Long MchRefundAmt) {
        this.MchRefundAmt = MchRefundAmt;
    }

    /**
     * Get 支持多个子订单批量退款单个子订单退款支持传SubOutTradeNo
也支持传SubOrderRefundList，都传的时候以SubOrderRefundList为准。
如果传了子单退款细节，外部不需要再传退款金额，平台应退，商户应退金额 
     * @return SubOrderRefundList 支持多个子订单批量退款单个子订单退款支持传SubOutTradeNo
也支持传SubOrderRefundList，都传的时候以SubOrderRefundList为准。
如果传了子单退款细节，外部不需要再传退款金额，平台应退，商户应退金额
     */
    public CloudSubOrderRefund [] getSubOrderRefundList() {
        return this.SubOrderRefundList;
    }

    /**
     * Set 支持多个子订单批量退款单个子订单退款支持传SubOutTradeNo
也支持传SubOrderRefundList，都传的时候以SubOrderRefundList为准。
如果传了子单退款细节，外部不需要再传退款金额，平台应退，商户应退金额
     * @param SubOrderRefundList 支持多个子订单批量退款单个子订单退款支持传SubOutTradeNo
也支持传SubOrderRefundList，都传的时候以SubOrderRefundList为准。
如果传了子单退款细节，外部不需要再传退款金额，平台应退，商户应退金额
     */
    public void setSubOrderRefundList(CloudSubOrderRefund [] SubOrderRefundList) {
        this.SubOrderRefundList = SubOrderRefundList;
    }

    /**
     * Get 渠道订单号，当出现重复支付时，可以将重复支付订单的渠道订单号传入，以进行退款（注意：目前该重复支付订单的渠道订单号仅能通过米大师内部获取），更多重复支付订单退款说明，请参考[重复支付订单退款说明](https://dev.tke.midas.qq.com/juxin-doc-next/apidocs/receive-order/Refund.html#%E9%87%8D%E5%A4%8D%E6%94%AF%E4%BB%98%E8%AE%A2%E5%8D%95%E9%80%80%E6%AC%BE%E8%AF%B4%E6%98%8E) 
     * @return ChannelOrderId 渠道订单号，当出现重复支付时，可以将重复支付订单的渠道订单号传入，以进行退款（注意：目前该重复支付订单的渠道订单号仅能通过米大师内部获取），更多重复支付订单退款说明，请参考[重复支付订单退款说明](https://dev.tke.midas.qq.com/juxin-doc-next/apidocs/receive-order/Refund.html#%E9%87%8D%E5%A4%8D%E6%94%AF%E4%BB%98%E8%AE%A2%E5%8D%95%E9%80%80%E6%AC%BE%E8%AF%B4%E6%98%8E)
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 渠道订单号，当出现重复支付时，可以将重复支付订单的渠道订单号传入，以进行退款（注意：目前该重复支付订单的渠道订单号仅能通过米大师内部获取），更多重复支付订单退款说明，请参考[重复支付订单退款说明](https://dev.tke.midas.qq.com/juxin-doc-next/apidocs/receive-order/Refund.html#%E9%87%8D%E5%A4%8D%E6%94%AF%E4%BB%98%E8%AE%A2%E5%8D%95%E9%80%80%E6%AC%BE%E8%AF%B4%E6%98%8E)
     * @param ChannelOrderId 渠道订单号，当出现重复支付时，可以将重复支付订单的渠道订单号传入，以进行退款（注意：目前该重复支付订单的渠道订单号仅能通过米大师内部获取），更多重复支付订单退款说明，请参考[重复支付订单退款说明](https://dev.tke.midas.qq.com/juxin-doc-next/apidocs/receive-order/Refund.html#%E9%87%8D%E5%A4%8D%E6%94%AF%E4%BB%98%E8%AE%A2%E5%8D%95%E9%80%80%E6%AC%BE%E8%AF%B4%E6%98%8E)
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 通知地址 
     * @return RefundNotifyUrl 通知地址
     */
    public String getRefundNotifyUrl() {
        return this.RefundNotifyUrl;
    }

    /**
     * Set 通知地址
     * @param RefundNotifyUrl 通知地址
     */
    public void setRefundNotifyUrl(String RefundNotifyUrl) {
        this.RefundNotifyUrl = RefundNotifyUrl;
    }

    /**
     * Get 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容 
     * @return Metadata 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
     * @param Metadata 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 渠道扩展退款促销列表，可将各个渠道的退款促销信息放于该列表 
     * @return ExternalRefundPromptGroupList 渠道扩展退款促销列表，可将各个渠道的退款促销信息放于该列表
     */
    public String getExternalRefundPromptGroupList() {
        return this.ExternalRefundPromptGroupList;
    }

    /**
     * Set 渠道扩展退款促销列表，可将各个渠道的退款促销信息放于该列表
     * @param ExternalRefundPromptGroupList 渠道扩展退款促销列表，可将各个渠道的退款促销信息放于该列表
     */
    public void setExternalRefundPromptGroupList(String ExternalRefundPromptGroupList) {
        this.ExternalRefundPromptGroupList = ExternalRefundPromptGroupList;
    }

    public RefundCloudOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundCloudOrderRequest(RefundCloudOrderRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RefundId != null) {
            this.RefundId = new String(source.RefundId);
        }
        if (source.TotalRefundAmt != null) {
            this.TotalRefundAmt = new Long(source.TotalRefundAmt);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.PlatformRefundAmt != null) {
            this.PlatformRefundAmt = new Long(source.PlatformRefundAmt);
        }
        if (source.MchRefundAmt != null) {
            this.MchRefundAmt = new Long(source.MchRefundAmt);
        }
        if (source.SubOrderRefundList != null) {
            this.SubOrderRefundList = new CloudSubOrderRefund[source.SubOrderRefundList.length];
            for (int i = 0; i < source.SubOrderRefundList.length; i++) {
                this.SubOrderRefundList[i] = new CloudSubOrderRefund(source.SubOrderRefundList[i]);
            }
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.RefundNotifyUrl != null) {
            this.RefundNotifyUrl = new String(source.RefundNotifyUrl);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.ExternalRefundPromptGroupList != null) {
            this.ExternalRefundPromptGroupList = new String(source.ExternalRefundPromptGroupList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RefundId", this.RefundId);
        this.setParamSimple(map, prefix + "TotalRefundAmt", this.TotalRefundAmt);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "PlatformRefundAmt", this.PlatformRefundAmt);
        this.setParamSimple(map, prefix + "MchRefundAmt", this.MchRefundAmt);
        this.setParamArrayObj(map, prefix + "SubOrderRefundList.", this.SubOrderRefundList);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "RefundNotifyUrl", this.RefundNotifyUrl);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "ExternalRefundPromptGroupList", this.ExternalRefundPromptGroupList);

    }
}

