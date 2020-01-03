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

public class QueryItem extends AbstractModel{

    /**
    * 子商户账户
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * 子账户属性 
1：普通会员子账号 
2：挂账子账号 
3：手续费子账号 
4：利息子账号
5：平台担保子账号
    */
    @SerializedName("SubAcctProperty")
    @Expose
    private String SubAcctProperty;

    /**
    * 业务平台的子商户Id，唯一
    */
    @SerializedName("SubMchId")
    @Expose
    private String SubMchId;

    /**
    * 子账户名称
    */
    @SerializedName("SubAcctName")
    @Expose
    private String SubAcctName;

    /**
    * 账户可用余额
    */
    @SerializedName("AcctAvailBal")
    @Expose
    private String AcctAvailBal;

    /**
    * 可提现金额
    */
    @SerializedName("CashAmt")
    @Expose
    private String CashAmt;

    /**
    * 维护日期 开户日期或修改日期
    */
    @SerializedName("MaintenanceDate")
    @Expose
    private String MaintenanceDate;

    /**
     * Get 子商户账户 
     * @return SubAcctNo 子商户账户
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set 子商户账户
     * @param SubAcctNo 子商户账户
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get 子账户属性 
1：普通会员子账号 
2：挂账子账号 
3：手续费子账号 
4：利息子账号
5：平台担保子账号 
     * @return SubAcctProperty 子账户属性 
1：普通会员子账号 
2：挂账子账号 
3：手续费子账号 
4：利息子账号
5：平台担保子账号
     */
    public String getSubAcctProperty() {
        return this.SubAcctProperty;
    }

    /**
     * Set 子账户属性 
1：普通会员子账号 
2：挂账子账号 
3：手续费子账号 
4：利息子账号
5：平台担保子账号
     * @param SubAcctProperty 子账户属性 
1：普通会员子账号 
2：挂账子账号 
3：手续费子账号 
4：利息子账号
5：平台担保子账号
     */
    public void setSubAcctProperty(String SubAcctProperty) {
        this.SubAcctProperty = SubAcctProperty;
    }

    /**
     * Get 业务平台的子商户Id，唯一 
     * @return SubMchId 业务平台的子商户Id，唯一
     */
    public String getSubMchId() {
        return this.SubMchId;
    }

    /**
     * Set 业务平台的子商户Id，唯一
     * @param SubMchId 业务平台的子商户Id，唯一
     */
    public void setSubMchId(String SubMchId) {
        this.SubMchId = SubMchId;
    }

    /**
     * Get 子账户名称 
     * @return SubAcctName 子账户名称
     */
    public String getSubAcctName() {
        return this.SubAcctName;
    }

    /**
     * Set 子账户名称
     * @param SubAcctName 子账户名称
     */
    public void setSubAcctName(String SubAcctName) {
        this.SubAcctName = SubAcctName;
    }

    /**
     * Get 账户可用余额 
     * @return AcctAvailBal 账户可用余额
     */
    public String getAcctAvailBal() {
        return this.AcctAvailBal;
    }

    /**
     * Set 账户可用余额
     * @param AcctAvailBal 账户可用余额
     */
    public void setAcctAvailBal(String AcctAvailBal) {
        this.AcctAvailBal = AcctAvailBal;
    }

    /**
     * Get 可提现金额 
     * @return CashAmt 可提现金额
     */
    public String getCashAmt() {
        return this.CashAmt;
    }

    /**
     * Set 可提现金额
     * @param CashAmt 可提现金额
     */
    public void setCashAmt(String CashAmt) {
        this.CashAmt = CashAmt;
    }

    /**
     * Get 维护日期 开户日期或修改日期 
     * @return MaintenanceDate 维护日期 开户日期或修改日期
     */
    public String getMaintenanceDate() {
        return this.MaintenanceDate;
    }

    /**
     * Set 维护日期 开户日期或修改日期
     * @param MaintenanceDate 维护日期 开户日期或修改日期
     */
    public void setMaintenanceDate(String MaintenanceDate) {
        this.MaintenanceDate = MaintenanceDate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "SubAcctProperty", this.SubAcctProperty);
        this.setParamSimple(map, prefix + "SubMchId", this.SubMchId);
        this.setParamSimple(map, prefix + "SubAcctName", this.SubAcctName);
        this.setParamSimple(map, prefix + "AcctAvailBal", this.AcctAvailBal);
        this.setParamSimple(map, prefix + "CashAmt", this.CashAmt);
        this.setParamSimple(map, prefix + "MaintenanceDate", this.MaintenanceDate);

    }
}

