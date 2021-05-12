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

public class DescribeRechargeRecordsResponse extends AbstractModel{

    /**
    * 账户类型 1:设备接入 2:云存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 充值记录列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Records")
    @Expose
    private RechargeRecord [] Records;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账户类型 1:设备接入 2:云存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountType 账户类型 1:设备接入 2:云存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账户类型 1:设备接入 2:云存
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountType 账户类型 1:设备接入 2:云存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 充值记录列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Records 充值记录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RechargeRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set 充值记录列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Records 充值记录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecords(RechargeRecord [] Records) {
        this.Records = Records;
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

    public DescribeRechargeRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRechargeRecordsResponse(DescribeRechargeRecordsResponse source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Records != null) {
            this.Records = new RechargeRecord[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new RechargeRecord(source.Records[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

