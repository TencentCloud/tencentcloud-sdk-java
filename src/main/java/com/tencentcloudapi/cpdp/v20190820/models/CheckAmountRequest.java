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

public class CheckAmountRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(50)，会员的待绑定账户的账号（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户的账号”）
    */
    @SerializedName("TakeCashAcctNo")
    @Expose
    private String TakeCashAcctNo;

    /**
    * STRING(20)，鉴权验证金额（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户收到的验证金额。原小额转账鉴权方式为来账鉴权的情况下此字段须赋值为0.00）
    */
    @SerializedName("AuthAmt")
    @Expose
    private String AuthAmt;

    /**
    * STRING(3)，币种（默认为RMB）
    */
    @SerializedName("Ccy")
    @Expose
    private String Ccy;

    /**
    * STRING(1027)，原小额转账方式（1: 往账鉴权，此为默认值; 2: 来账鉴权）
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
     * Get STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔） 
     * @return TranNetMemberCode STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
     * @param TranNetMemberCode STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(50)，会员的待绑定账户的账号（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户的账号”） 
     * @return TakeCashAcctNo STRING(50)，会员的待绑定账户的账号（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户的账号”）
     */
    public String getTakeCashAcctNo() {
        return this.TakeCashAcctNo;
    }

    /**
     * Set STRING(50)，会员的待绑定账户的账号（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户的账号”）
     * @param TakeCashAcctNo STRING(50)，会员的待绑定账户的账号（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户的账号”）
     */
    public void setTakeCashAcctNo(String TakeCashAcctNo) {
        this.TakeCashAcctNo = TakeCashAcctNo;
    }

    /**
     * Get STRING(20)，鉴权验证金额（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户收到的验证金额。原小额转账鉴权方式为来账鉴权的情况下此字段须赋值为0.00） 
     * @return AuthAmt STRING(20)，鉴权验证金额（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户收到的验证金额。原小额转账鉴权方式为来账鉴权的情况下此字段须赋值为0.00）
     */
    public String getAuthAmt() {
        return this.AuthAmt;
    }

    /**
     * Set STRING(20)，鉴权验证金额（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户收到的验证金额。原小额转账鉴权方式为来账鉴权的情况下此字段须赋值为0.00）
     * @param AuthAmt STRING(20)，鉴权验证金额（即 BindRelateAcctSmallAmount接口中的“会员的待绑定账户收到的验证金额。原小额转账鉴权方式为来账鉴权的情况下此字段须赋值为0.00）
     */
    public void setAuthAmt(String AuthAmt) {
        this.AuthAmt = AuthAmt;
    }

    /**
     * Get STRING(3)，币种（默认为RMB） 
     * @return Ccy STRING(3)，币种（默认为RMB）
     */
    public String getCcy() {
        return this.Ccy;
    }

    /**
     * Set STRING(3)，币种（默认为RMB）
     * @param Ccy STRING(3)，币种（默认为RMB）
     */
    public void setCcy(String Ccy) {
        this.Ccy = Ccy;
    }

    /**
     * Get STRING(1027)，原小额转账方式（1: 往账鉴权，此为默认值; 2: 来账鉴权） 
     * @return ReservedMsg STRING(1027)，原小额转账方式（1: 往账鉴权，此为默认值; 2: 来账鉴权）
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，原小额转账方式（1: 往账鉴权，此为默认值; 2: 来账鉴权）
     * @param ReservedMsg STRING(1027)，原小额转账方式（1: 往账鉴权，此为默认值; 2: 来账鉴权）
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "TakeCashAcctNo", this.TakeCashAcctNo);
        this.setParamSimple(map, prefix + "AuthAmt", this.AuthAmt);
        this.setParamSimple(map, prefix + "Ccy", this.Ccy);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);

    }
}

