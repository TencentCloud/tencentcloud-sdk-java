/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindOpenBankExternalSubMerchantBankAccountResponse extends AbstractModel {

    /**
    * 错误码。
__SUCCESS__: 成功
__其他__: 见附录-错误码表
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * 错误消息。
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * 返回结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private BindOpenBankExternalSubMerchantBankAccountResult Result;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误码。
__SUCCESS__: 成功
__其他__: 见附录-错误码表 
     * @return ErrCode 错误码。
__SUCCESS__: 成功
__其他__: 见附录-错误码表
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码。
__SUCCESS__: 成功
__其他__: 见附录-错误码表
     * @param ErrCode 错误码。
__SUCCESS__: 成功
__其他__: 见附录-错误码表
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误消息。 
     * @return ErrMessage 错误消息。
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set 错误消息。
     * @param ErrMessage 错误消息。
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get 返回结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 返回结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BindOpenBankExternalSubMerchantBankAccountResult getResult() {
        return this.Result;
    }

    /**
     * Set 返回结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 返回结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(BindOpenBankExternalSubMerchantBankAccountResult Result) {
        this.Result = Result;
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

    public BindOpenBankExternalSubMerchantBankAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindOpenBankExternalSubMerchantBankAccountResponse(BindOpenBankExternalSubMerchantBankAccountResponse source) {
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.Result != null) {
            this.Result = new BindOpenBankExternalSubMerchantBankAccountResult(source.Result);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

