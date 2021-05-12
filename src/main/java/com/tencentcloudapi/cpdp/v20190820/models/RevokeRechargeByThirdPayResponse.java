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

public class RevokeRechargeByThirdPayResponse extends AbstractModel{

    /**
    * 请求类型
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
    * 保留域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedMessage")
    @Expose
    private String ReservedMessage;

    /**
    * 银行流水号
    */
    @SerializedName("FrontSequenceNumber")
    @Expose
    private String FrontSequenceNumber;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求类型 
     * @return RequestType 请求类型
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 请求类型
     * @param RequestType 请求类型
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    /**
     * Get 保留域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedMessage 保留域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReservedMessage() {
        return this.ReservedMessage;
    }

    /**
     * Set 保留域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedMessage 保留域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedMessage(String ReservedMessage) {
        this.ReservedMessage = ReservedMessage;
    }

    /**
     * Get 银行流水号 
     * @return FrontSequenceNumber 银行流水号
     */
    public String getFrontSequenceNumber() {
        return this.FrontSequenceNumber;
    }

    /**
     * Set 银行流水号
     * @param FrontSequenceNumber 银行流水号
     */
    public void setFrontSequenceNumber(String FrontSequenceNumber) {
        this.FrontSequenceNumber = FrontSequenceNumber;
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

    public RevokeRechargeByThirdPayResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokeRechargeByThirdPayResponse(RevokeRechargeByThirdPayResponse source) {
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
        if (source.ReservedMessage != null) {
            this.ReservedMessage = new String(source.ReservedMessage);
        }
        if (source.FrontSequenceNumber != null) {
            this.FrontSequenceNumber = new String(source.FrontSequenceNumber);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);
        this.setParamSimple(map, prefix + "ReservedMessage", this.ReservedMessage);
        this.setParamSimple(map, prefix + "FrontSequenceNumber", this.FrontSequenceNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

