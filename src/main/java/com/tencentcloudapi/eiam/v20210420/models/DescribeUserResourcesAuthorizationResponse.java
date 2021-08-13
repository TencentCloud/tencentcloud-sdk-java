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

public class DescribeUserResourcesAuthorizationResponse extends AbstractModel{

    /**
    * 应用的唯一ID。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用账户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationAccounts")
    @Expose
    private String [] ApplicationAccounts;

    /**
    * 授权用户的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 授权的用户名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 返回的资源列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizationUserResourceList")
    @Expose
    private AuthorizationUserResouceInfo [] AuthorizationUserResourceList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用的唯一ID。 
     * @return ApplicationId 应用的唯一ID。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用的唯一ID。
     * @param ApplicationId 应用的唯一ID。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用账户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationAccounts 应用账户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getApplicationAccounts() {
        return this.ApplicationAccounts;
    }

    /**
     * Set 应用账户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationAccounts 应用账户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationAccounts(String [] ApplicationAccounts) {
        this.ApplicationAccounts = ApplicationAccounts;
    }

    /**
     * Get 授权用户的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 授权用户的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 授权用户的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 授权用户的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 授权的用户名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 授权的用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 授权的用户名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 授权的用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 返回的资源列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationUserResourceList 返回的资源列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthorizationUserResouceInfo [] getAuthorizationUserResourceList() {
        return this.AuthorizationUserResourceList;
    }

    /**
     * Set 返回的资源列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationUserResourceList 返回的资源列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizationUserResourceList(AuthorizationUserResouceInfo [] AuthorizationUserResourceList) {
        this.AuthorizationUserResourceList = AuthorizationUserResourceList;
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

    public DescribeUserResourcesAuthorizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserResourcesAuthorizationResponse(DescribeUserResourcesAuthorizationResponse source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationAccounts != null) {
            this.ApplicationAccounts = new String[source.ApplicationAccounts.length];
            for (int i = 0; i < source.ApplicationAccounts.length; i++) {
                this.ApplicationAccounts[i] = new String(source.ApplicationAccounts[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AuthorizationUserResourceList != null) {
            this.AuthorizationUserResourceList = new AuthorizationUserResouceInfo[source.AuthorizationUserResourceList.length];
            for (int i = 0; i < source.AuthorizationUserResourceList.length; i++) {
                this.AuthorizationUserResourceList[i] = new AuthorizationUserResouceInfo(source.AuthorizationUserResourceList[i]);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArraySimple(map, prefix + "ApplicationAccounts.", this.ApplicationAccounts);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "AuthorizationUserResourceList.", this.AuthorizationUserResourceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

