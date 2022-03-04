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

public class QueryMemberTransactionDetailsRequest extends AbstractModel{

    /**
    * 查询的交易发生时间类型。
__1__：当日
__2__：历史
    */
    @SerializedName("QueryDateType")
    @Expose
    private String QueryDateType;

    /**
    * 查询的交易类型。
__1__：全部
__2__：转出
__3__：转入
    */
    @SerializedName("QueryTranType")
    @Expose
    private String QueryTranType;

    /**
    * 父账户账号。
_平安渠道为资金汇总账号_
    */
    @SerializedName("BankAccountNumber")
    @Expose
    private String BankAccountNumber;

    /**
    * 子账户账号。
_平安渠道为见证子账户的账号_
    */
    @SerializedName("SubAccountNumber")
    @Expose
    private String SubAccountNumber;

    /**
    * 分页号, 起始值为1。
    */
    @SerializedName("PageOffSet")
    @Expose
    private String PageOffSet;

    /**
    * 查询开始日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；开始日期不能超过当前日期__
    */
    @SerializedName("QueryStartDate")
    @Expose
    private String QueryStartDate;

    /**
    * 查询终止日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；终止日期不能超过当前日期__
    */
    @SerializedName("QueryEndDate")
    @Expose
    private String QueryEndDate;

    /**
    * 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
     * Get 查询的交易发生时间类型。
__1__：当日
__2__：历史 
     * @return QueryDateType 查询的交易发生时间类型。
__1__：当日
__2__：历史
     */
    public String getQueryDateType() {
        return this.QueryDateType;
    }

    /**
     * Set 查询的交易发生时间类型。
__1__：当日
__2__：历史
     * @param QueryDateType 查询的交易发生时间类型。
__1__：当日
__2__：历史
     */
    public void setQueryDateType(String QueryDateType) {
        this.QueryDateType = QueryDateType;
    }

    /**
     * Get 查询的交易类型。
__1__：全部
__2__：转出
__3__：转入 
     * @return QueryTranType 查询的交易类型。
__1__：全部
__2__：转出
__3__：转入
     */
    public String getQueryTranType() {
        return this.QueryTranType;
    }

    /**
     * Set 查询的交易类型。
__1__：全部
__2__：转出
__3__：转入
     * @param QueryTranType 查询的交易类型。
__1__：全部
__2__：转出
__3__：转入
     */
    public void setQueryTranType(String QueryTranType) {
        this.QueryTranType = QueryTranType;
    }

    /**
     * Get 父账户账号。
_平安渠道为资金汇总账号_ 
     * @return BankAccountNumber 父账户账号。
_平安渠道为资金汇总账号_
     */
    public String getBankAccountNumber() {
        return this.BankAccountNumber;
    }

    /**
     * Set 父账户账号。
_平安渠道为资金汇总账号_
     * @param BankAccountNumber 父账户账号。
_平安渠道为资金汇总账号_
     */
    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    /**
     * Get 子账户账号。
_平安渠道为见证子账户的账号_ 
     * @return SubAccountNumber 子账户账号。
_平安渠道为见证子账户的账号_
     */
    public String getSubAccountNumber() {
        return this.SubAccountNumber;
    }

    /**
     * Set 子账户账号。
_平安渠道为见证子账户的账号_
     * @param SubAccountNumber 子账户账号。
_平安渠道为见证子账户的账号_
     */
    public void setSubAccountNumber(String SubAccountNumber) {
        this.SubAccountNumber = SubAccountNumber;
    }

    /**
     * Get 分页号, 起始值为1。 
     * @return PageOffSet 分页号, 起始值为1。
     */
    public String getPageOffSet() {
        return this.PageOffSet;
    }

    /**
     * Set 分页号, 起始值为1。
     * @param PageOffSet 分页号, 起始值为1。
     */
    public void setPageOffSet(String PageOffSet) {
        this.PageOffSet = PageOffSet;
    }

    /**
     * Get 查询开始日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；开始日期不能超过当前日期__ 
     * @return QueryStartDate 查询开始日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；开始日期不能超过当前日期__
     */
    public String getQueryStartDate() {
        return this.QueryStartDate;
    }

    /**
     * Set 查询开始日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；开始日期不能超过当前日期__
     * @param QueryStartDate 查询开始日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；开始日期不能超过当前日期__
     */
    public void setQueryStartDate(String QueryStartDate) {
        this.QueryStartDate = QueryStartDate;
    }

    /**
     * Get 查询终止日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；终止日期不能超过当前日期__ 
     * @return QueryEndDate 查询终止日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；终止日期不能超过当前日期__
     */
    public String getQueryEndDate() {
        return this.QueryEndDate;
    }

    /**
     * Set 查询终止日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；终止日期不能超过当前日期__
     * @param QueryEndDate 查询终止日期，格式：yyyyMMdd。
__若是历史查询，则必输，当日查询时，不起作用；终止日期不能超过当前日期__
     */
    public void setQueryEndDate(String QueryEndDate) {
        this.QueryEndDate = QueryEndDate;
    }

    /**
     * Get 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_ 
     * @return MidasEnvironment 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
     * @param MidasEnvironment 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    public QueryMemberTransactionDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMemberTransactionDetailsRequest(QueryMemberTransactionDetailsRequest source) {
        if (source.QueryDateType != null) {
            this.QueryDateType = new String(source.QueryDateType);
        }
        if (source.QueryTranType != null) {
            this.QueryTranType = new String(source.QueryTranType);
        }
        if (source.BankAccountNumber != null) {
            this.BankAccountNumber = new String(source.BankAccountNumber);
        }
        if (source.SubAccountNumber != null) {
            this.SubAccountNumber = new String(source.SubAccountNumber);
        }
        if (source.PageOffSet != null) {
            this.PageOffSet = new String(source.PageOffSet);
        }
        if (source.QueryStartDate != null) {
            this.QueryStartDate = new String(source.QueryStartDate);
        }
        if (source.QueryEndDate != null) {
            this.QueryEndDate = new String(source.QueryEndDate);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryDateType", this.QueryDateType);
        this.setParamSimple(map, prefix + "QueryTranType", this.QueryTranType);
        this.setParamSimple(map, prefix + "BankAccountNumber", this.BankAccountNumber);
        this.setParamSimple(map, prefix + "SubAccountNumber", this.SubAccountNumber);
        this.setParamSimple(map, prefix + "PageOffSet", this.PageOffSet);
        this.setParamSimple(map, prefix + "QueryStartDate", this.QueryStartDate);
        this.setParamSimple(map, prefix + "QueryEndDate", this.QueryEndDate);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

