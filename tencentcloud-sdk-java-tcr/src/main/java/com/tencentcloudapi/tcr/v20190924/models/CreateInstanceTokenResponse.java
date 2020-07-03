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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceTokenResponse extends AbstractModel{

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 访问凭证
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 访问凭证过期时间戳
    */
    @SerializedName("ExpTime")
    @Expose
    private Long ExpTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 访问凭证 
     * @return Token 访问凭证
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 访问凭证
     * @param Token 访问凭证
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 访问凭证过期时间戳 
     * @return ExpTime 访问凭证过期时间戳
     */
    public Long getExpTime() {
        return this.ExpTime;
    }

    /**
     * Set 访问凭证过期时间戳
     * @param ExpTime 访问凭证过期时间戳
     */
    public void setExpTime(Long ExpTime) {
        this.ExpTime = ExpTime;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpTime", this.ExpTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

