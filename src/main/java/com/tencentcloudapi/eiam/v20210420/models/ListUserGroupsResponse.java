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

public class ListUserGroupsResponse extends AbstractModel{

    /**
    * 返回的用户组列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupList")
    @Expose
    private UserGroupInformation [] UserGroupList;

    /**
    * 返回的用户组信息总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的用户组列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupList 返回的用户组列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserGroupInformation [] getUserGroupList() {
        return this.UserGroupList;
    }

    /**
     * Set 返回的用户组列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupList 返回的用户组列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupList(UserGroupInformation [] UserGroupList) {
        this.UserGroupList = UserGroupList;
    }

    /**
     * Get 返回的用户组信息总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 返回的用户组信息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回的用户组信息总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 返回的用户组信息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public ListUserGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsResponse(ListUserGroupsResponse source) {
        if (source.UserGroupList != null) {
            this.UserGroupList = new UserGroupInformation[source.UserGroupList.length];
            for (int i = 0; i < source.UserGroupList.length; i++) {
                this.UserGroupList[i] = new UserGroupInformation(source.UserGroupList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UserGroupList.", this.UserGroupList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

