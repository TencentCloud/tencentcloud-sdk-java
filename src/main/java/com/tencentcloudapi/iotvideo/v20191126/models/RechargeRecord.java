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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RechargeRecord extends AbstractModel{

    /**
    * 流水记录号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaterId")
    @Expose
    private Long WaterId;

    /**
    * 充值前的余额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BalanceBeforeRecharge")
    @Expose
    private Long BalanceBeforeRecharge;

    /**
    * 充值金额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Money")
    @Expose
    private Long Money;

    /**
    * 充值时间, UTC值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateTime")
    @Expose
    private Long OperateTime;

    /**
     * Get 流水记录号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaterId 流水记录号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaterId() {
        return this.WaterId;
    }

    /**
     * Set 流水记录号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaterId 流水记录号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaterId(Long WaterId) {
        this.WaterId = WaterId;
    }

    /**
     * Get 充值前的余额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BalanceBeforeRecharge 充值前的余额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBalanceBeforeRecharge() {
        return this.BalanceBeforeRecharge;
    }

    /**
     * Set 充值前的余额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BalanceBeforeRecharge 充值前的余额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBalanceBeforeRecharge(Long BalanceBeforeRecharge) {
        this.BalanceBeforeRecharge = BalanceBeforeRecharge;
    }

    /**
     * Get 充值金额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Money 充值金额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMoney() {
        return this.Money;
    }

    /**
     * Set 充值金额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Money 充值金额，单位0.01元。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMoney(Long Money) {
        this.Money = Money;
    }

    /**
     * Get 充值时间, UTC值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateTime 充值时间, UTC值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set 充值时间, UTC值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateTime 充值时间, UTC值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateTime(Long OperateTime) {
        this.OperateTime = OperateTime;
    }

    public RechargeRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RechargeRecord(RechargeRecord source) {
        if (source.WaterId != null) {
            this.WaterId = new Long(source.WaterId);
        }
        if (source.BalanceBeforeRecharge != null) {
            this.BalanceBeforeRecharge = new Long(source.BalanceBeforeRecharge);
        }
        if (source.Money != null) {
            this.Money = new Long(source.Money);
        }
        if (source.OperateTime != null) {
            this.OperateTime = new Long(source.OperateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterId", this.WaterId);
        this.setParamSimple(map, prefix + "BalanceBeforeRecharge", this.BalanceBeforeRecharge);
        this.setParamSimple(map, prefix + "Money", this.Money);
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);

    }
}

