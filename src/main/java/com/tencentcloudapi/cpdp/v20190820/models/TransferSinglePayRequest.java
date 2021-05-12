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

public class TransferSinglePayRequest extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 微信申请商户号的appid或者商户号绑定的appid
支付宝、平安填入MerchantId
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 订单流水号，唯一，不能包含特殊字符，长度最大限制64位，推荐使用字母，数字组合，"_","-"组合
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 转账金额，单位分
    */
    @SerializedName("TransferAmount")
    @Expose
    private Long TransferAmount;

    /**
    * 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 收款方姓名。支付宝可选；微信，平安模式下必传
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
    * 收款方附加信息，平安接入使用。需要以JSON格式提供以下字段：
PayeeBankName：收款人开户行名称
 CcyCode：货币类型（RMB-人民币）
 UnionFlag：行内跨行标志（1：行内转账，0：跨行转账）。
    */
    @SerializedName("PayeeExtends")
    @Expose
    private String PayeeExtends;

    /**
    * 请求预留字段，原样透传返回
    */
    @SerializedName("ReqReserved")
    @Expose
    private String ReqReserved;

    /**
    * 业务备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 转账结果回调通知URL。若不填，则不进行回调。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 接入环境。沙箱环境填sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 商户号 
     * @return MerchantId 商户号
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号
     * @param MerchantId 商户号
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 微信申请商户号的appid或者商户号绑定的appid
支付宝、平安填入MerchantId 
     * @return MerchantAppId 微信申请商户号的appid或者商户号绑定的appid
支付宝、平安填入MerchantId
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 微信申请商户号的appid或者商户号绑定的appid
支付宝、平安填入MerchantId
     * @param MerchantAppId 微信申请商户号的appid或者商户号绑定的appid
支付宝、平安填入MerchantId
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账 
     * @return TransferType 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     */
    public Long getTransferType() {
        return this.TransferType;
    }

    /**
     * Set 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     * @param TransferType 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     */
    public void setTransferType(Long TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 订单流水号，唯一，不能包含特殊字符，长度最大限制64位，推荐使用字母，数字组合，"_","-"组合 
     * @return OrderId 订单流水号，唯一，不能包含特殊字符，长度最大限制64位，推荐使用字母，数字组合，"_","-"组合
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单流水号，唯一，不能包含特殊字符，长度最大限制64位，推荐使用字母，数字组合，"_","-"组合
     * @param OrderId 订单流水号，唯一，不能包含特殊字符，长度最大限制64位，推荐使用字母，数字组合，"_","-"组合
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 转账金额，单位分 
     * @return TransferAmount 转账金额，单位分
     */
    public Long getTransferAmount() {
        return this.TransferAmount;
    }

    /**
     * Set 转账金额，单位分
     * @param TransferAmount 转账金额，单位分
     */
    public void setTransferAmount(Long TransferAmount) {
        this.TransferAmount = TransferAmount;
    }

    /**
     * Get 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号 
     * @return PayeeId 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号
     * @param PayeeId 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 收款方姓名。支付宝可选；微信，平安模式下必传 
     * @return PayeeName 收款方姓名。支付宝可选；微信，平安模式下必传
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set 收款方姓名。支付宝可选；微信，平安模式下必传
     * @param PayeeName 收款方姓名。支付宝可选；微信，平安模式下必传
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    /**
     * Get 收款方附加信息，平安接入使用。需要以JSON格式提供以下字段：
PayeeBankName：收款人开户行名称
 CcyCode：货币类型（RMB-人民币）
 UnionFlag：行内跨行标志（1：行内转账，0：跨行转账）。 
     * @return PayeeExtends 收款方附加信息，平安接入使用。需要以JSON格式提供以下字段：
PayeeBankName：收款人开户行名称
 CcyCode：货币类型（RMB-人民币）
 UnionFlag：行内跨行标志（1：行内转账，0：跨行转账）。
     */
    public String getPayeeExtends() {
        return this.PayeeExtends;
    }

    /**
     * Set 收款方附加信息，平安接入使用。需要以JSON格式提供以下字段：
PayeeBankName：收款人开户行名称
 CcyCode：货币类型（RMB-人民币）
 UnionFlag：行内跨行标志（1：行内转账，0：跨行转账）。
     * @param PayeeExtends 收款方附加信息，平安接入使用。需要以JSON格式提供以下字段：
PayeeBankName：收款人开户行名称
 CcyCode：货币类型（RMB-人民币）
 UnionFlag：行内跨行标志（1：行内转账，0：跨行转账）。
     */
    public void setPayeeExtends(String PayeeExtends) {
        this.PayeeExtends = PayeeExtends;
    }

    /**
     * Get 请求预留字段，原样透传返回 
     * @return ReqReserved 请求预留字段，原样透传返回
     */
    public String getReqReserved() {
        return this.ReqReserved;
    }

    /**
     * Set 请求预留字段，原样透传返回
     * @param ReqReserved 请求预留字段，原样透传返回
     */
    public void setReqReserved(String ReqReserved) {
        this.ReqReserved = ReqReserved;
    }

    /**
     * Get 业务备注 
     * @return Remark 业务备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 业务备注
     * @param Remark 业务备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 转账结果回调通知URL。若不填，则不进行回调。 
     * @return NotifyUrl 转账结果回调通知URL。若不填，则不进行回调。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 转账结果回调通知URL。若不填，则不进行回调。
     * @param NotifyUrl 转账结果回调通知URL。若不填，则不进行回调。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox。 
     * @return Profile 接入环境。沙箱环境填sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox。
     * @param Profile 接入环境。沙箱环境填sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public TransferSinglePayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferSinglePayRequest(TransferSinglePayRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.TransferAmount != null) {
            this.TransferAmount = new Long(source.TransferAmount);
        }
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.PayeeName != null) {
            this.PayeeName = new String(source.PayeeName);
        }
        if (source.PayeeExtends != null) {
            this.PayeeExtends = new String(source.PayeeExtends);
        }
        if (source.ReqReserved != null) {
            this.ReqReserved = new String(source.ReqReserved);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "TransferAmount", this.TransferAmount);
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "PayeeName", this.PayeeName);
        this.setParamSimple(map, prefix + "PayeeExtends", this.PayeeExtends);
        this.setParamSimple(map, prefix + "ReqReserved", this.ReqReserved);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

