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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmAssetLoginCredentialResponse extends AbstractModel {

    /**
    * 账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 密码信息
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 有效期开始时间
    */
    @SerializedName("ValidateStart")
    @Expose
    private String ValidateStart;

    /**
    * 有效期结束时间
    */
    @SerializedName("ValidateEnd")
    @Expose
    private String ValidateEnd;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账号 
     * @return Account 账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 密码信息 
     * @return Password 密码信息
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码信息
     * @param Password 密码信息
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 有效期开始时间 
     * @return ValidateStart 有效期开始时间
     */
    public String getValidateStart() {
        return this.ValidateStart;
    }

    /**
     * Set 有效期开始时间
     * @param ValidateStart 有效期开始时间
     */
    public void setValidateStart(String ValidateStart) {
        this.ValidateStart = ValidateStart;
    }

    /**
     * Get 有效期结束时间 
     * @return ValidateEnd 有效期结束时间
     */
    public String getValidateEnd() {
        return this.ValidateEnd;
    }

    /**
     * Set 有效期结束时间
     * @param ValidateEnd 有效期结束时间
     */
    public void setValidateEnd(String ValidateEnd) {
        this.ValidateEnd = ValidateEnd;
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

    public DescribeDspmAssetLoginCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAssetLoginCredentialResponse(DescribeDspmAssetLoginCredentialResponse source) {
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ValidateStart != null) {
            this.ValidateStart = new String(source.ValidateStart);
        }
        if (source.ValidateEnd != null) {
            this.ValidateEnd = new String(source.ValidateEnd);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ValidateStart", this.ValidateStart);
        this.setParamSimple(map, prefix + "ValidateEnd", this.ValidateEnd);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

