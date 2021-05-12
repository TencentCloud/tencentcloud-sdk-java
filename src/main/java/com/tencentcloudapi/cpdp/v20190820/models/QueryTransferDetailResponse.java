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

public class QueryTransferDetailResponse extends AbstractModel{

    /**
    * 商户号。
示例值：19300009329
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
    */
    @SerializedName("MerchantBatchNo")
    @Expose
    private String MerchantBatchNo;

    /**
    * 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
    */
    @SerializedName("MerchantDetailNo")
    @Expose
    private String MerchantDetailNo;

    /**
    * 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
    */
    @SerializedName("DetailId")
    @Expose
    private String DetailId;

    /**
    * 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
    */
    @SerializedName("DetailStatus")
    @Expose
    private String DetailStatus;

    /**
    * 转账金额。
单位为分。
示例值：200
    */
    @SerializedName("TransferAmount")
    @Expose
    private Long TransferAmount;

    /**
    * 失败原因。
如果转账失败则有失败原因
ACCOUNT_FROZEN：账户冻结
REAL_NAME_CHECK_FAIL：用户未实名
NAME_NOT_CORRECT：用户姓名校验失败
OPENID_INVALID：Openid校验失败
TRANSFER_QUOTA_EXCEED：超过用户单笔收款额度
DAY_RECEIVED_QUOTA_EXCEED：超过用户单日收款额度
MONTH_RECEIVED_QUOTA_EXCEED：超过用户单月收款额度
DAY_RECEIVED_COUNT_EXCEED：超过用户单日收款次数
PRODUCT_AUTH_CHECK_FAIL：产品权限校验失败
OVERDUE_CLOSE：转账关闭
ID_CARD_NOT_CORRECT：用户身份证校验失败
ACCOUNT_NOT_EXIST：用户账户不存在
TRANSFER_RISK：转账存在风险
示例值：ACCOUNT_FROZEN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 转账发起时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitiateTime")
    @Expose
    private String InitiateTime;

    /**
    * 转账更新时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 用户名。
示例值：张三
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferRemark")
    @Expose
    private String TransferRemark;

    /**
    * 商家绑定公众号APPID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 用户openId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 商户号。
示例值：19300009329 
     * @return MerchantId 商户号。
示例值：19300009329
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号。
示例值：19300009329
     * @param MerchantId 商户号。
示例值：19300009329
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013 
     * @return MerchantBatchNo 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     */
    public String getMerchantBatchNo() {
        return this.MerchantBatchNo;
    }

    /**
     * Set 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     * @param MerchantBatchNo 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     */
    public void setMerchantBatchNo(String MerchantBatchNo) {
        this.MerchantBatchNo = MerchantBatchNo;
    }

    /**
     * Get 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001 
     * @return BatchId 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     * @param BatchId 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013 
     * @return MerchantDetailNo 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     */
    public String getMerchantDetailNo() {
        return this.MerchantDetailNo;
    }

    /**
     * Set 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     * @param MerchantDetailNo 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     */
    public void setMerchantDetailNo(String MerchantDetailNo) {
        this.MerchantDetailNo = MerchantDetailNo;
    }

    /**
     * Get 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001 
     * @return DetailId 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public String getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     * @param DetailId 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public void setDetailId(String DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS 
     * @return DetailStatus 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
     */
    public String getDetailStatus() {
        return this.DetailStatus;
    }

    /**
     * Set 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
     * @param DetailStatus 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
     */
    public void setDetailStatus(String DetailStatus) {
        this.DetailStatus = DetailStatus;
    }

    /**
     * Get 转账金额。
单位为分。
示例值：200 
     * @return TransferAmount 转账金额。
单位为分。
示例值：200
     */
    public Long getTransferAmount() {
        return this.TransferAmount;
    }

    /**
     * Set 转账金额。
单位为分。
示例值：200
     * @param TransferAmount 转账金额。
单位为分。
示例值：200
     */
    public void setTransferAmount(Long TransferAmount) {
        this.TransferAmount = TransferAmount;
    }

    /**
     * Get 失败原因。
如果转账失败则有失败原因
ACCOUNT_FROZEN：账户冻结
REAL_NAME_CHECK_FAIL：用户未实名
NAME_NOT_CORRECT：用户姓名校验失败
OPENID_INVALID：Openid校验失败
TRANSFER_QUOTA_EXCEED：超过用户单笔收款额度
DAY_RECEIVED_QUOTA_EXCEED：超过用户单日收款额度
MONTH_RECEIVED_QUOTA_EXCEED：超过用户单月收款额度
DAY_RECEIVED_COUNT_EXCEED：超过用户单日收款次数
PRODUCT_AUTH_CHECK_FAIL：产品权限校验失败
OVERDUE_CLOSE：转账关闭
ID_CARD_NOT_CORRECT：用户身份证校验失败
ACCOUNT_NOT_EXIST：用户账户不存在
TRANSFER_RISK：转账存在风险
示例值：ACCOUNT_FROZEN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因。
如果转账失败则有失败原因
ACCOUNT_FROZEN：账户冻结
REAL_NAME_CHECK_FAIL：用户未实名
NAME_NOT_CORRECT：用户姓名校验失败
OPENID_INVALID：Openid校验失败
TRANSFER_QUOTA_EXCEED：超过用户单笔收款额度
DAY_RECEIVED_QUOTA_EXCEED：超过用户单日收款额度
MONTH_RECEIVED_QUOTA_EXCEED：超过用户单月收款额度
DAY_RECEIVED_COUNT_EXCEED：超过用户单日收款次数
PRODUCT_AUTH_CHECK_FAIL：产品权限校验失败
OVERDUE_CLOSE：转账关闭
ID_CARD_NOT_CORRECT：用户身份证校验失败
ACCOUNT_NOT_EXIST：用户账户不存在
TRANSFER_RISK：转账存在风险
示例值：ACCOUNT_FROZEN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因。
如果转账失败则有失败原因
ACCOUNT_FROZEN：账户冻结
REAL_NAME_CHECK_FAIL：用户未实名
NAME_NOT_CORRECT：用户姓名校验失败
OPENID_INVALID：Openid校验失败
TRANSFER_QUOTA_EXCEED：超过用户单笔收款额度
DAY_RECEIVED_QUOTA_EXCEED：超过用户单日收款额度
MONTH_RECEIVED_QUOTA_EXCEED：超过用户单月收款额度
DAY_RECEIVED_COUNT_EXCEED：超过用户单日收款次数
PRODUCT_AUTH_CHECK_FAIL：产品权限校验失败
OVERDUE_CLOSE：转账关闭
ID_CARD_NOT_CORRECT：用户身份证校验失败
ACCOUNT_NOT_EXIST：用户账户不存在
TRANSFER_RISK：转账存在风险
示例值：ACCOUNT_FROZEN
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因。
如果转账失败则有失败原因
ACCOUNT_FROZEN：账户冻结
REAL_NAME_CHECK_FAIL：用户未实名
NAME_NOT_CORRECT：用户姓名校验失败
OPENID_INVALID：Openid校验失败
TRANSFER_QUOTA_EXCEED：超过用户单笔收款额度
DAY_RECEIVED_QUOTA_EXCEED：超过用户单日收款额度
MONTH_RECEIVED_QUOTA_EXCEED：超过用户单月收款额度
DAY_RECEIVED_COUNT_EXCEED：超过用户单日收款次数
PRODUCT_AUTH_CHECK_FAIL：产品权限校验失败
OVERDUE_CLOSE：转账关闭
ID_CARD_NOT_CORRECT：用户身份证校验失败
ACCOUNT_NOT_EXIST：用户账户不存在
TRANSFER_RISK：转账存在风险
示例值：ACCOUNT_FROZEN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 转账发起时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitiateTime 转账发起时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInitiateTime() {
        return this.InitiateTime;
    }

    /**
     * Set 转账发起时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitiateTime 转账发起时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitiateTime(String InitiateTime) {
        this.InitiateTime = InitiateTime;
    }

    /**
     * Get 转账更新时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 转账更新时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 转账更新时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 转账更新时间。
遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户名。
示例值：张三
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名。
示例值：张三
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名。
示例值：张三
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名。
示例值：张三
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferRemark 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransferRemark() {
        return this.TransferRemark;
    }

    /**
     * Set 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferRemark 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferRemark(String TransferRemark) {
        this.TransferRemark = TransferRemark;
    }

    /**
     * Get 商家绑定公众号APPID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantAppId 商家绑定公众号APPID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 商家绑定公众号APPID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantAppId 商家绑定公众号APPID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 用户openId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId 用户openId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户openId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId 用户openId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryTransferDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTransferDetailResponse(QueryTransferDetailResponse source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.MerchantBatchNo != null) {
            this.MerchantBatchNo = new String(source.MerchantBatchNo);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.MerchantDetailNo != null) {
            this.MerchantDetailNo = new String(source.MerchantDetailNo);
        }
        if (source.DetailId != null) {
            this.DetailId = new String(source.DetailId);
        }
        if (source.DetailStatus != null) {
            this.DetailStatus = new String(source.DetailStatus);
        }
        if (source.TransferAmount != null) {
            this.TransferAmount = new Long(source.TransferAmount);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.InitiateTime != null) {
            this.InitiateTime = new String(source.InitiateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TransferRemark != null) {
            this.TransferRemark = new String(source.TransferRemark);
        }
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "MerchantBatchNo", this.MerchantBatchNo);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "MerchantDetailNo", this.MerchantDetailNo);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "DetailStatus", this.DetailStatus);
        this.setParamSimple(map, prefix + "TransferAmount", this.TransferAmount);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "InitiateTime", this.InitiateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TransferRemark", this.TransferRemark);
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

