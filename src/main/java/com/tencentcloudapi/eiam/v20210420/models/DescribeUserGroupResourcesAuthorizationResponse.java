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

public class DescribeUserGroupResourcesAuthorizationResponse extends AbstractModel{

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * 资源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizationUserGroupResourceList")
    @Expose
    private AuthorizationResourceEntityInfo [] AuthorizationUserGroupResourceList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 用户组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupId 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupId 用户组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 用户组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupName 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupName 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get 资源列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationUserGroupResourceList 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthorizationResourceEntityInfo [] getAuthorizationUserGroupResourceList() {
        return this.AuthorizationUserGroupResourceList;
    }

    /**
     * Set 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationUserGroupResourceList 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizationUserGroupResourceList(AuthorizationResourceEntityInfo [] AuthorizationUserGroupResourceList) {
        this.AuthorizationUserGroupResourceList = AuthorizationUserGroupResourceList;
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

    public DescribeUserGroupResourcesAuthorizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserGroupResourcesAuthorizationResponse(DescribeUserGroupResourcesAuthorizationResponse source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.AuthorizationUserGroupResourceList != null) {
            this.AuthorizationUserGroupResourceList = new AuthorizationResourceEntityInfo[source.AuthorizationUserGroupResourceList.length];
            for (int i = 0; i < source.AuthorizationUserGroupResourceList.length; i++) {
                this.AuthorizationUserGroupResourceList[i] = new AuthorizationResourceEntityInfo(source.AuthorizationUserGroupResourceList[i]);
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
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamArrayObj(map, prefix + "AuthorizationUserGroupResourceList.", this.AuthorizationUserGroupResourceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

