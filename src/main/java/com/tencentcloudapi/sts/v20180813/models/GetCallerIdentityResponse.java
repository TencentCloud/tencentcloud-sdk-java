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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCallerIdentityResponse extends AbstractModel{

    /**
    * 当前调用者ARN。
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
    * 当前调用者所属主账号Uin。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 身份标识。
1. 调用者是云账号时，返回的是当前账号Uin
2. 调用者是角色时，返回的是roleId:roleSessionName
3. 调用者是联合身份时，返回的是uin:federatedUserName
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 密钥所属账号Uin。
1. 调用者是云账号，返回的当前账号Uin
2, 调用者是角色，返回的申请角色密钥的账号Uin
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * 身份类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前调用者ARN。 
     * @return Arn 当前调用者ARN。
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set 当前调用者ARN。
     * @param Arn 当前调用者ARN。
     */
    public void setArn(String Arn) {
        this.Arn = Arn;
    }

    /**
     * Get 当前调用者所属主账号Uin。 
     * @return AccountId 当前调用者所属主账号Uin。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 当前调用者所属主账号Uin。
     * @param AccountId 当前调用者所属主账号Uin。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 身份标识。
1. 调用者是云账号时，返回的是当前账号Uin
2. 调用者是角色时，返回的是roleId:roleSessionName
3. 调用者是联合身份时，返回的是uin:federatedUserName 
     * @return UserId 身份标识。
1. 调用者是云账号时，返回的是当前账号Uin
2. 调用者是角色时，返回的是roleId:roleSessionName
3. 调用者是联合身份时，返回的是uin:federatedUserName
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 身份标识。
1. 调用者是云账号时，返回的是当前账号Uin
2. 调用者是角色时，返回的是roleId:roleSessionName
3. 调用者是联合身份时，返回的是uin:federatedUserName
     * @param UserId 身份标识。
1. 调用者是云账号时，返回的是当前账号Uin
2. 调用者是角色时，返回的是roleId:roleSessionName
3. 调用者是联合身份时，返回的是uin:federatedUserName
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 密钥所属账号Uin。
1. 调用者是云账号，返回的当前账号Uin
2, 调用者是角色，返回的申请角色密钥的账号Uin 
     * @return PrincipalId 密钥所属账号Uin。
1. 调用者是云账号，返回的当前账号Uin
2, 调用者是角色，返回的申请角色密钥的账号Uin
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set 密钥所属账号Uin。
1. 调用者是云账号，返回的当前账号Uin
2, 调用者是角色，返回的申请角色密钥的账号Uin
     * @param PrincipalId 密钥所属账号Uin。
1. 调用者是云账号，返回的当前账号Uin
2, 调用者是角色，返回的申请角色密钥的账号Uin
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get 身份类型。 
     * @return Type 身份类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 身份类型。
     * @param Type 身份类型。
     */
    public void setType(String Type) {
        this.Type = Type;
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

    public GetCallerIdentityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCallerIdentityResponse(GetCallerIdentityResponse source) {
        if (source.Arn != null) {
            this.Arn = new String(source.Arn);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Arn", this.Arn);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

