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

public class QueryBankWithdrawCashDetailsRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(2)，功能标志（1: 当日; 2: 历史）
    */
    @SerializedName("FunctionFlag")
    @Expose
    private String FunctionFlag;

    /**
    * STRING(50)，见证子帐户的帐号
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(4)，查询标志（2: 提现; 3: 清分）
    */
    @SerializedName("QueryFlag")
    @Expose
    private String QueryFlag;

    /**
    * STRING(10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
    */
    @SerializedName("PageNum")
    @Expose
    private String PageNum;

    /**
    * STRING(8)，开始日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * STRING(8)，结束日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
     * Get String(22)，商户号（签约客户号） 
     * @return MrchCode String(22)，商户号（签约客户号）
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号（签约客户号）
     * @param MrchCode String(22)，商户号（签约客户号）
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(2)，功能标志（1: 当日; 2: 历史） 
     * @return FunctionFlag STRING(2)，功能标志（1: 当日; 2: 历史）
     */
    public String getFunctionFlag() {
        return this.FunctionFlag;
    }

    /**
     * Set STRING(2)，功能标志（1: 当日; 2: 历史）
     * @param FunctionFlag STRING(2)，功能标志（1: 当日; 2: 历史）
     */
    public void setFunctionFlag(String FunctionFlag) {
        this.FunctionFlag = FunctionFlag;
    }

    /**
     * Get STRING(50)，见证子帐户的帐号 
     * @return SubAcctNo STRING(50)，见证子帐户的帐号
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子帐户的帐号
     * @param SubAcctNo STRING(50)，见证子帐户的帐号
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(4)，查询标志（2: 提现; 3: 清分） 
     * @return QueryFlag STRING(4)，查询标志（2: 提现; 3: 清分）
     */
    public String getQueryFlag() {
        return this.QueryFlag;
    }

    /**
     * Set STRING(4)，查询标志（2: 提现; 3: 清分）
     * @param QueryFlag STRING(4)，查询标志（2: 提现; 3: 清分）
     */
    public void setQueryFlag(String QueryFlag) {
        this.QueryFlag = QueryFlag;
    }

    /**
     * Get STRING(10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后） 
     * @return PageNum STRING(10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
     */
    public String getPageNum() {
        return this.PageNum;
    }

    /**
     * Set STRING(10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
     * @param PageNum STRING(10)，页码（起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照建立时间的先后）
     */
    public void setPageNum(String PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get STRING(8)，开始日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101） 
     * @return BeginDate STRING(8)，开始日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set STRING(8)，开始日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
     * @param BeginDate STRING(8)，开始日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get STRING(8)，结束日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101） 
     * @return EndDate STRING(8)，结束日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set STRING(8)，结束日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
     * @param EndDate STRING(8)，结束日期（若是历史查询，则必输，当日查询时，不起作用。格式：20190101）
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get STRING(1027)，保留域 
     * @return ReservedMsg STRING(1027)，保留域
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
     * @param ReservedMsg STRING(1027)，保留域
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "FunctionFlag", this.FunctionFlag);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "QueryFlag", this.QueryFlag);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);

    }
}

