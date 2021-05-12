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

public class RefundRequest extends AbstractModel{

    /**
    * 用户ID，长度不小于5位， 仅支持字母和数字的组合
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 退款订单号，仅支持数字、 字母、下划线（_）、横杠字 符（-）、点（.）的组合
    */
    @SerializedName("RefundId")
    @Expose
    private String RefundId;

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 退款金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
    */
    @SerializedName("TotalRefundAmt")
    @Expose
    private Long TotalRefundAmt;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 商品订单，仅支持数字、字 母、下划线（_）、横杠字符 （-）、点（.）的组合。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 结算应收金额，单位：分
    */
    @SerializedName("MchRefundAmt")
    @Expose
    private Long MchRefundAmt;

    /**
    * 调用下单接口获取的聚鑫交 易订单。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 平台应收金额，单位：分
    */
    @SerializedName("PlatformRefundAmt")
    @Expose
    private Long PlatformRefundAmt;

    /**
    * 支持多个子订单批量退款单 个子订单退款支持传 SubOutTradeNo ，也支持传 SubOutTradeNoList ，都传的时候以 SubOutTradeNoList 为准。  如果传了子单退款细节，外 部不需要再传退款金额，平 台应退，商户应退金额，我 们可以直接根据子单退款算出来总和。
    */
    @SerializedName("SubOrderRefundList")
    @Expose
    private RefundOutSubOrderRefundList [] SubOrderRefundList;

    /**
    * 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
     * Get 用户ID，长度不小于5位， 仅支持字母和数字的组合 
     * @return UserId 用户ID，长度不小于5位， 仅支持字母和数字的组合
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID，长度不小于5位， 仅支持字母和数字的组合
     * @param UserId 用户ID，长度不小于5位， 仅支持字母和数字的组合
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 退款订单号，仅支持数字、 字母、下划线（_）、横杠字 符（-）、点（.）的组合 
     * @return RefundId 退款订单号，仅支持数字、 字母、下划线（_）、横杠字 符（-）、点（.）的组合
     */
    public String getRefundId() {
        return this.RefundId;
    }

    /**
     * Set 退款订单号，仅支持数字、 字母、下划线（_）、横杠字 符（-）、点（.）的组合
     * @param RefundId 退款订单号，仅支持数字、 字母、下划线（_）、横杠字 符（-）、点（.）的组合
     */
    public void setRefundId(String RefundId) {
        this.RefundId = RefundId;
    }

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 退款金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额 
     * @return TotalRefundAmt 退款金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
     */
    public Long getTotalRefundAmt() {
        return this.TotalRefundAmt;
    }

    /**
     * Set 退款金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
     * @param TotalRefundAmt 退款金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
     */
    public void setTotalRefundAmt(Long TotalRefundAmt) {
        this.TotalRefundAmt = TotalRefundAmt;
    }

    /**
     * Get 聚鑫分配的安全ID 
     * @return MidasSecretId 聚鑫分配的安全ID
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的安全ID
     * @param MidasSecretId 聚鑫分配的安全ID
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 按照聚鑫安全密钥计算的签名 
     * @return MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 按照聚鑫安全密钥计算的签名
     * @param MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 商品订单，仅支持数字、字 母、下划线（_）、横杠字符 （-）、点（.）的组合。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo 
     * @return OutTradeNo 商品订单，仅支持数字、字 母、下划线（_）、横杠字符 （-）、点（.）的组合。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 商品订单，仅支持数字、字 母、下划线（_）、横杠字符 （-）、点（.）的组合。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
     * @param OutTradeNo 商品订单，仅支持数字、字 母、下划线（_）、横杠字符 （-）、点（.）的组合。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
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
     * Get 调用下单接口获取的聚鑫交 易订单。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo 
     * @return TransactionId 调用下单接口获取的聚鑫交 易订单。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 调用下单接口获取的聚鑫交 易订单。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
     * @param TransactionId 调用下单接口获取的聚鑫交 易订单。  OutTradeNo ,TransactionId 二选一,不能都为空,优先使用 OutTradeNo
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
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
     * Get 支持多个子订单批量退款单 个子订单退款支持传 SubOutTradeNo ，也支持传 SubOutTradeNoList ，都传的时候以 SubOutTradeNoList 为准。  如果传了子单退款细节，外 部不需要再传退款金额，平 台应退，商户应退金额，我 们可以直接根据子单退款算出来总和。 
     * @return SubOrderRefundList 支持多个子订单批量退款单 个子订单退款支持传 SubOutTradeNo ，也支持传 SubOutTradeNoList ，都传的时候以 SubOutTradeNoList 为准。  如果传了子单退款细节，外 部不需要再传退款金额，平 台应退，商户应退金额，我 们可以直接根据子单退款算出来总和。
     */
    public RefundOutSubOrderRefundList [] getSubOrderRefundList() {
        return this.SubOrderRefundList;
    }

    /**
     * Set 支持多个子订单批量退款单 个子订单退款支持传 SubOutTradeNo ，也支持传 SubOutTradeNoList ，都传的时候以 SubOutTradeNoList 为准。  如果传了子单退款细节，外 部不需要再传退款金额，平 台应退，商户应退金额，我 们可以直接根据子单退款算出来总和。
     * @param SubOrderRefundList 支持多个子订单批量退款单 个子订单退款支持传 SubOutTradeNo ，也支持传 SubOutTradeNoList ，都传的时候以 SubOutTradeNoList 为准。  如果传了子单退款细节，外 部不需要再传退款金额，平 台应退，商户应退金额，我 们可以直接根据子单退款算出来总和。
     */
    public void setSubOrderRefundList(RefundOutSubOrderRefundList [] SubOrderRefundList) {
        this.SubOrderRefundList = SubOrderRefundList;
    }

    /**
     * Get 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release 
     * @return MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     * @param MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    public RefundRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundRequest(RefundRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RefundId != null) {
            this.RefundId = new String(source.RefundId);
        }
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.TotalRefundAmt != null) {
            this.TotalRefundAmt = new Long(source.TotalRefundAmt);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.MchRefundAmt != null) {
            this.MchRefundAmt = new Long(source.MchRefundAmt);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.PlatformRefundAmt != null) {
            this.PlatformRefundAmt = new Long(source.PlatformRefundAmt);
        }
        if (source.SubOrderRefundList != null) {
            this.SubOrderRefundList = new RefundOutSubOrderRefundList[source.SubOrderRefundList.length];
            for (int i = 0; i < source.SubOrderRefundList.length; i++) {
                this.SubOrderRefundList[i] = new RefundOutSubOrderRefundList(source.SubOrderRefundList[i]);
            }
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RefundId", this.RefundId);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "TotalRefundAmt", this.TotalRefundAmt);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "MchRefundAmt", this.MchRefundAmt);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "PlatformRefundAmt", this.PlatformRefundAmt);
        this.setParamArrayObj(map, prefix + "SubOrderRefundList.", this.SubOrderRefundList);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

