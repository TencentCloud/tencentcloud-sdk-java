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

public class QueryOpenBankProfitSharePayeeResult extends AbstractModel{

    /**
    * 账户ID（受益ID）
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 账户号。通联国际指客户银行账户号
    */
    @SerializedName("AccountNo")
    @Expose
    private String AccountNo;

    /**
    * 账户货币。参考附录“币种类型”。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 收款人账户名称
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 银行名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nature")
    @Expose
    private String Nature;

    /**
    * 状态
0-待审核；1-审核通过；2-审核不通过 3-关联实体未审核
    */
    @SerializedName("BindState")
    @Expose
    private String BindState;

    /**
    * 状态描述
    */
    @SerializedName("StateExplain")
    @Expose
    private String StateExplain;

    /**
     * Get 账户ID（受益ID） 
     * @return AccountId 账户ID（受益ID）
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账户ID（受益ID）
     * @param AccountId 账户ID（受益ID）
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 账户号。通联国际指客户银行账户号 
     * @return AccountNo 账户号。通联国际指客户银行账户号
     */
    public String getAccountNo() {
        return this.AccountNo;
    }

    /**
     * Set 账户号。通联国际指客户银行账户号
     * @param AccountNo 账户号。通联国际指客户银行账户号
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * Get 账户货币。参考附录“币种类型”。 
     * @return Currency 账户货币。参考附录“币种类型”。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 账户货币。参考附录“币种类型”。
     * @param Currency 账户货币。参考附录“币种类型”。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 收款人账户名称 
     * @return AccountName 收款人账户名称
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 收款人账户名称
     * @param AccountName 收款人账户名称
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 银行名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankName 银行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set 银行名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankName 银行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nature 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNature() {
        return this.Nature;
    }

    /**
     * Set 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nature 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNature(String Nature) {
        this.Nature = Nature;
    }

    /**
     * Get 状态
0-待审核；1-审核通过；2-审核不通过 3-关联实体未审核 
     * @return BindState 状态
0-待审核；1-审核通过；2-审核不通过 3-关联实体未审核
     */
    public String getBindState() {
        return this.BindState;
    }

    /**
     * Set 状态
0-待审核；1-审核通过；2-审核不通过 3-关联实体未审核
     * @param BindState 状态
0-待审核；1-审核通过；2-审核不通过 3-关联实体未审核
     */
    public void setBindState(String BindState) {
        this.BindState = BindState;
    }

    /**
     * Get 状态描述 
     * @return StateExplain 状态描述
     */
    public String getStateExplain() {
        return this.StateExplain;
    }

    /**
     * Set 状态描述
     * @param StateExplain 状态描述
     */
    public void setStateExplain(String StateExplain) {
        this.StateExplain = StateExplain;
    }

    public QueryOpenBankProfitSharePayeeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankProfitSharePayeeResult(QueryOpenBankProfitSharePayeeResult source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.AccountNo != null) {
            this.AccountNo = new String(source.AccountNo);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.BankName != null) {
            this.BankName = new String(source.BankName);
        }
        if (source.Nature != null) {
            this.Nature = new String(source.Nature);
        }
        if (source.BindState != null) {
            this.BindState = new String(source.BindState);
        }
        if (source.StateExplain != null) {
            this.StateExplain = new String(source.StateExplain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AccountNo", this.AccountNo);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "Nature", this.Nature);
        this.setParamSimple(map, prefix + "BindState", this.BindState);
        this.setParamSimple(map, prefix + "StateExplain", this.StateExplain);

    }
}

