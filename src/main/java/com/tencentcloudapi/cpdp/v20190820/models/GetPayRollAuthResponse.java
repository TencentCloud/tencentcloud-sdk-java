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

public class GetPayRollAuthResponse extends AbstractModel{

    /**
    * 授权状态：
UNAUTHORIZED：未授权
AUTHORIZED：已授权
DEAUTHORIZED：已取消授权
    */
    @SerializedName("AuthStatus")
    @Expose
    private String AuthStatus;

    /**
    * 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthTime")
    @Expose
    private String AuthTime;

    /**
    * 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CancelAuthTime")
    @Expose
    private String CancelAuthTime;

    /**
    * 微信服务商商户的商户号，由微信支付生成并下发
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 用户在商户对应appid下的唯一标识
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 微信服务商下特约商户的商户号，由微信支付生成并下发
    */
    @SerializedName("SubMerchantId")
    @Expose
    private String SubMerchantId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 授权状态：
UNAUTHORIZED：未授权
AUTHORIZED：已授权
DEAUTHORIZED：已取消授权 
     * @return AuthStatus 授权状态：
UNAUTHORIZED：未授权
AUTHORIZED：已授权
DEAUTHORIZED：已取消授权
     */
    public String getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 授权状态：
UNAUTHORIZED：未授权
AUTHORIZED：已授权
DEAUTHORIZED：已取消授权
     * @param AuthStatus 授权状态：
UNAUTHORIZED：未授权
AUTHORIZED：已授权
DEAUTHORIZED：已取消授权
     */
    public void setAuthStatus(String AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthTime 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthTime() {
        return this.AuthTime;
    }

    /**
     * Set 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthTime 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthTime(String AuthTime) {
        this.AuthTime = AuthTime;
    }

    /**
     * Get 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CancelAuthTime 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCancelAuthTime() {
        return this.CancelAuthTime;
    }

    /**
     * Set 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     * @param CancelAuthTime 授权时间，遵循[rfc3339](https://datatracker.ietf.org/doc/html/rfc3339)标准格式，格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，空字符串等同null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancelAuthTime(String CancelAuthTime) {
        this.CancelAuthTime = CancelAuthTime;
    }

    /**
     * Get 微信服务商商户的商户号，由微信支付生成并下发 
     * @return MerchantId 微信服务商商户的商户号，由微信支付生成并下发
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 微信服务商商户的商户号，由微信支付生成并下发
     * @param MerchantId 微信服务商商户的商户号，由微信支付生成并下发
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 用户在商户对应appid下的唯一标识 
     * @return OpenId 用户在商户对应appid下的唯一标识
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户在商户对应appid下的唯一标识
     * @param OpenId 用户在商户对应appid下的唯一标识
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 微信服务商下特约商户的商户号，由微信支付生成并下发 
     * @return SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public String getSubMerchantId() {
        return this.SubMerchantId;
    }

    /**
     * Set 微信服务商下特约商户的商户号，由微信支付生成并下发
     * @param SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public void setSubMerchantId(String SubMerchantId) {
        this.SubMerchantId = SubMerchantId;
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

    public GetPayRollAuthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPayRollAuthResponse(GetPayRollAuthResponse source) {
        if (source.AuthStatus != null) {
            this.AuthStatus = new String(source.AuthStatus);
        }
        if (source.AuthTime != null) {
            this.AuthTime = new String(source.AuthTime);
        }
        if (source.CancelAuthTime != null) {
            this.CancelAuthTime = new String(source.CancelAuthTime);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.SubMerchantId != null) {
            this.SubMerchantId = new String(source.SubMerchantId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamSimple(map, prefix + "AuthTime", this.AuthTime);
        this.setParamSimple(map, prefix + "CancelAuthTime", this.CancelAuthTime);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "SubMerchantId", this.SubMerchantId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

