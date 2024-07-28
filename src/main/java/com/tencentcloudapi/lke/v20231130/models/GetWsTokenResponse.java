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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWsTokenResponse extends AbstractModel {

    /**
    * token值（有效期60s）
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 余额; 余额大于 0 时表示有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Balance")
    @Expose
    private Float Balance;

    /**
    * 对话窗输入字符限制
    */
    @SerializedName("InputLenLimit")
    @Expose
    private Long InputLenLimit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get token值（有效期60s） 
     * @return Token token值（有效期60s）
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set token值（有效期60s）
     * @param Token token值（有效期60s）
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 余额; 余额大于 0 时表示有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Balance 余额; 余额大于 0 时表示有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBalance() {
        return this.Balance;
    }

    /**
     * Set 余额; 余额大于 0 时表示有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Balance 余额; 余额大于 0 时表示有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBalance(Float Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 对话窗输入字符限制 
     * @return InputLenLimit 对话窗输入字符限制
     */
    public Long getInputLenLimit() {
        return this.InputLenLimit;
    }

    /**
     * Set 对话窗输入字符限制
     * @param InputLenLimit 对话窗输入字符限制
     */
    public void setInputLenLimit(Long InputLenLimit) {
        this.InputLenLimit = InputLenLimit;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetWsTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWsTokenResponse(GetWsTokenResponse source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Balance != null) {
            this.Balance = new Float(source.Balance);
        }
        if (source.InputLenLimit != null) {
            this.InputLenLimit = new Long(source.InputLenLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "InputLenLimit", this.InputLenLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

