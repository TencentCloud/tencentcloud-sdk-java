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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserThirdPartyAccountInfoResponse extends AbstractModel{

    /**
    * 用户 id。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 三方账号的绑定情况。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdPartyAccounts")
    @Expose
    private ThirdPartyAccountInfo [] ThirdPartyAccounts;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户 id。 
     * @return UserId 用户 id。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 id。
     * @param UserId 用户 id。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户名。 
     * @return UserName 用户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名。
     * @param UserName 用户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 三方账号的绑定情况。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdPartyAccounts 三方账号的绑定情况。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThirdPartyAccountInfo [] getThirdPartyAccounts() {
        return this.ThirdPartyAccounts;
    }

    /**
     * Set 三方账号的绑定情况。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdPartyAccounts 三方账号的绑定情况。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdPartyAccounts(ThirdPartyAccountInfo [] ThirdPartyAccounts) {
        this.ThirdPartyAccounts = ThirdPartyAccounts;
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

    public DescribeUserThirdPartyAccountInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserThirdPartyAccountInfoResponse(DescribeUserThirdPartyAccountInfoResponse source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ThirdPartyAccounts != null) {
            this.ThirdPartyAccounts = new ThirdPartyAccountInfo[source.ThirdPartyAccounts.length];
            for (int i = 0; i < source.ThirdPartyAccounts.length; i++) {
                this.ThirdPartyAccounts[i] = new ThirdPartyAccountInfo(source.ThirdPartyAccounts[i]);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "ThirdPartyAccounts.", this.ThirdPartyAccounts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

