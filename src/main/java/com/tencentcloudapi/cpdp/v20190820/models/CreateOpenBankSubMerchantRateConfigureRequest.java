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

public class CreateOpenBankSubMerchantRateConfigureRequest extends AbstractModel{

    /**
    * 渠道进件序列号。
填写子商户进件返回的渠道进件编号。
    */
    @SerializedName("ChannelRegistrationNo")
    @Expose
    private String ChannelRegistrationNo;

    /**
    * 外部产品费率申请序列号。
    */
    @SerializedName("OutProductFeeNo")
    @Expose
    private String OutProductFeeNo;

    /**
    * 渠道商户ID。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道子商户ID。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 渠道名称。详见附录-云企付枚举类说明-ChannelName。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 支付类型。
SWIPE:刷卡
SCAN:扫码
WAP:WAP
PUBLIC:公众号支付
SDK:SDK
MINI_PROGRAM:小程序
注意：HELIPAY渠道传SDK。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 支付渠道。
ALIPAY：支付宝 
WXPAY：微信支付 
UNIONPAY：银联
    */
    @SerializedName("PayChannel")
    @Expose
    private String PayChannel;

    /**
    * 计费模式。
SINGLE：按单笔金额计费
RATIO：按单笔费率计费 
RANGE：按分段区间计费
    */
    @SerializedName("FeeMode")
    @Expose
    private String FeeMode;

    /**
    * 费用值，单位（0.01%或分）。
    */
    @SerializedName("FeeValue")
    @Expose
    private Long FeeValue;

    /**
    * 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
HELIPAY渠道不需要传入。
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 最低收费金额，单位（分）。
    */
    @SerializedName("MinFee")
    @Expose
    private Long MinFee;

    /**
    * 最高收费金额，单位（分）。
    */
    @SerializedName("MaxFee")
    @Expose
    private Long MaxFee;

    /**
    * 通知地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 分段计费区间列表。
    */
    @SerializedName("FeeRangeList")
    @Expose
    private FeeRangInfo [] FeeRangeList;

    /**
    * 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道进件序列号。
填写子商户进件返回的渠道进件编号。 
     * @return ChannelRegistrationNo 渠道进件序列号。
填写子商户进件返回的渠道进件编号。
     */
    public String getChannelRegistrationNo() {
        return this.ChannelRegistrationNo;
    }

    /**
     * Set 渠道进件序列号。
填写子商户进件返回的渠道进件编号。
     * @param ChannelRegistrationNo 渠道进件序列号。
填写子商户进件返回的渠道进件编号。
     */
    public void setChannelRegistrationNo(String ChannelRegistrationNo) {
        this.ChannelRegistrationNo = ChannelRegistrationNo;
    }

    /**
     * Get 外部产品费率申请序列号。 
     * @return OutProductFeeNo 外部产品费率申请序列号。
     */
    public String getOutProductFeeNo() {
        return this.OutProductFeeNo;
    }

    /**
     * Set 外部产品费率申请序列号。
     * @param OutProductFeeNo 外部产品费率申请序列号。
     */
    public void setOutProductFeeNo(String OutProductFeeNo) {
        this.OutProductFeeNo = OutProductFeeNo;
    }

    /**
     * Get 渠道商户ID。 
     * @return ChannelMerchantId 渠道商户ID。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户ID。
     * @param ChannelMerchantId 渠道商户ID。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道子商户ID。 
     * @return ChannelSubMerchantId 渠道子商户ID。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID。
     * @param ChannelSubMerchantId 渠道子商户ID。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 渠道名称。详见附录-云企付枚举类说明-ChannelName。 
     * @return ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。详见附录-云企付枚举类说明-ChannelName。
     * @param ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 支付类型。
SWIPE:刷卡
SCAN:扫码
WAP:WAP
PUBLIC:公众号支付
SDK:SDK
MINI_PROGRAM:小程序
注意：HELIPAY渠道传SDK。 
     * @return PayType 支付类型。
SWIPE:刷卡
SCAN:扫码
WAP:WAP
PUBLIC:公众号支付
SDK:SDK
MINI_PROGRAM:小程序
注意：HELIPAY渠道传SDK。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 支付类型。
SWIPE:刷卡
SCAN:扫码
WAP:WAP
PUBLIC:公众号支付
SDK:SDK
MINI_PROGRAM:小程序
注意：HELIPAY渠道传SDK。
     * @param PayType 支付类型。
SWIPE:刷卡
SCAN:扫码
WAP:WAP
PUBLIC:公众号支付
SDK:SDK
MINI_PROGRAM:小程序
注意：HELIPAY渠道传SDK。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 支付渠道。
ALIPAY：支付宝 
WXPAY：微信支付 
UNIONPAY：银联 
     * @return PayChannel 支付渠道。
ALIPAY：支付宝 
WXPAY：微信支付 
UNIONPAY：银联
     */
    public String getPayChannel() {
        return this.PayChannel;
    }

    /**
     * Set 支付渠道。
ALIPAY：支付宝 
WXPAY：微信支付 
UNIONPAY：银联
     * @param PayChannel 支付渠道。
ALIPAY：支付宝 
WXPAY：微信支付 
UNIONPAY：银联
     */
    public void setPayChannel(String PayChannel) {
        this.PayChannel = PayChannel;
    }

    /**
     * Get 计费模式。
SINGLE：按单笔金额计费
RATIO：按单笔费率计费 
RANGE：按分段区间计费 
     * @return FeeMode 计费模式。
SINGLE：按单笔金额计费
RATIO：按单笔费率计费 
RANGE：按分段区间计费
     */
    public String getFeeMode() {
        return this.FeeMode;
    }

    /**
     * Set 计费模式。
SINGLE：按单笔金额计费
RATIO：按单笔费率计费 
RANGE：按分段区间计费
     * @param FeeMode 计费模式。
SINGLE：按单笔金额计费
RATIO：按单笔费率计费 
RANGE：按分段区间计费
     */
    public void setFeeMode(String FeeMode) {
        this.FeeMode = FeeMode;
    }

    /**
     * Get 费用值，单位（0.01%或分）。 
     * @return FeeValue 费用值，单位（0.01%或分）。
     */
    public Long getFeeValue() {
        return this.FeeValue;
    }

    /**
     * Set 费用值，单位（0.01%或分）。
     * @param FeeValue 费用值，单位（0.01%或分）。
     */
    public void setFeeValue(Long FeeValue) {
        this.FeeValue = FeeValue;
    }

    /**
     * Get 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
HELIPAY渠道不需要传入。 
     * @return PaymentMethod 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
HELIPAY渠道不需要传入。
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
HELIPAY渠道不需要传入。
     * @param PaymentMethod 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
HELIPAY渠道不需要传入。
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 最低收费金额，单位（分）。 
     * @return MinFee 最低收费金额，单位（分）。
     */
    public Long getMinFee() {
        return this.MinFee;
    }

    /**
     * Set 最低收费金额，单位（分）。
     * @param MinFee 最低收费金额，单位（分）。
     */
    public void setMinFee(Long MinFee) {
        this.MinFee = MinFee;
    }

    /**
     * Get 最高收费金额，单位（分）。 
     * @return MaxFee 最高收费金额，单位（分）。
     */
    public Long getMaxFee() {
        return this.MaxFee;
    }

    /**
     * Set 最高收费金额，单位（分）。
     * @param MaxFee 最高收费金额，单位（分）。
     */
    public void setMaxFee(Long MaxFee) {
        this.MaxFee = MaxFee;
    }

    /**
     * Get 通知地址。 
     * @return NotifyUrl 通知地址。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 通知地址。
     * @param NotifyUrl 通知地址。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 分段计费区间列表。 
     * @return FeeRangeList 分段计费区间列表。
     */
    public FeeRangInfo [] getFeeRangeList() {
        return this.FeeRangeList;
    }

    /**
     * Set 分段计费区间列表。
     * @param FeeRangeList 分段计费区间列表。
     */
    public void setFeeRangeList(FeeRangInfo [] FeeRangeList) {
        this.FeeRangeList = FeeRangeList;
    }

    /**
     * Get 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public CreateOpenBankSubMerchantRateConfigureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankSubMerchantRateConfigureRequest(CreateOpenBankSubMerchantRateConfigureRequest source) {
        if (source.ChannelRegistrationNo != null) {
            this.ChannelRegistrationNo = new String(source.ChannelRegistrationNo);
        }
        if (source.OutProductFeeNo != null) {
            this.OutProductFeeNo = new String(source.OutProductFeeNo);
        }
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.PayChannel != null) {
            this.PayChannel = new String(source.PayChannel);
        }
        if (source.FeeMode != null) {
            this.FeeMode = new String(source.FeeMode);
        }
        if (source.FeeValue != null) {
            this.FeeValue = new Long(source.FeeValue);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.MinFee != null) {
            this.MinFee = new Long(source.MinFee);
        }
        if (source.MaxFee != null) {
            this.MaxFee = new Long(source.MaxFee);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.FeeRangeList != null) {
            this.FeeRangeList = new FeeRangInfo[source.FeeRangeList.length];
            for (int i = 0; i < source.FeeRangeList.length; i++) {
                this.FeeRangeList[i] = new FeeRangInfo(source.FeeRangeList[i]);
            }
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelRegistrationNo", this.ChannelRegistrationNo);
        this.setParamSimple(map, prefix + "OutProductFeeNo", this.OutProductFeeNo);
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "PayChannel", this.PayChannel);
        this.setParamSimple(map, prefix + "FeeMode", this.FeeMode);
        this.setParamSimple(map, prefix + "FeeValue", this.FeeValue);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "MinFee", this.MinFee);
        this.setParamSimple(map, prefix + "MaxFee", this.MaxFee);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamArrayObj(map, prefix + "FeeRangeList.", this.FeeRangeList);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

