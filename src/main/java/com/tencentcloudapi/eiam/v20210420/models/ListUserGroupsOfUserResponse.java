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

public class ListUserGroupsOfUserResponse extends AbstractModel{

    /**
    * 用户所属的用户组ID列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * 用户ID，是用户的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户所属的用户组ID列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupIds 用户所属的用户组ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set 用户所属的用户组ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupIds 用户所属的用户组ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get 用户ID，是用户的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID，是用户的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID，是用户的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID，是用户的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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

    public ListUserGroupsOfUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsOfUserResponse(ListUserGroupsOfUserResponse source) {
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

