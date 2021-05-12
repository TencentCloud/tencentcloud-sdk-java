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

public class DescribeAccountBalanceResponse extends AbstractModel{

    /**
    * 账户类型 1=设备接入;2=云存。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 余额, 单位 : 分(人民币)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * 账户状态，1=正常；8=冻结；9=销户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 最后修改时间，UTC值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账户类型 1=设备接入;2=云存。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountType 账户类型 1=设备接入;2=云存。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账户类型 1=设备接入;2=云存。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountType 账户类型 1=设备接入;2=云存。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 余额, 单位 : 分(人民币)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Balance 余额, 单位 : 分(人民币)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set 余额, 单位 : 分(人民币)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Balance 余额, 单位 : 分(人民币)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 账户状态，1=正常；8=冻结；9=销户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 账户状态，1=正常；8=冻结；9=销户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 账户状态，1=正常；8=冻结；9=销户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 账户状态，1=正常；8=冻结；9=销户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 最后修改时间，UTC值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最后修改时间，UTC值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后修改时间，UTC值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最后修改时间，UTC值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
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

    public DescribeAccountBalanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountBalanceResponse(DescribeAccountBalanceResponse source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

