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

public class ListUsersInUserGroupResponse extends AbstractModel{

    /**
    * 用户组ID，是用户组的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 返回的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserInfo")
    @Expose
    private UserInfo [] UserInfo;

    /**
    * 返回的用户信息总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户组ID，是用户组的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupId 用户组ID，是用户组的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户组ID，是用户组的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupId 用户组ID，是用户组的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 返回的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserInfo 返回的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 返回的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserInfo 返回的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserInfo(UserInfo [] UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 返回的用户信息总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 返回的用户信息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 返回的用户信息总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 返回的用户信息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
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

    public ListUsersInUserGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsersInUserGroupResponse(ListUsersInUserGroupResponse source) {
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserInfo[source.UserInfo.length];
            for (int i = 0; i < source.UserInfo.length; i++) {
                this.UserInfo[i] = new UserInfo(source.UserInfo[i]);
            }
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

