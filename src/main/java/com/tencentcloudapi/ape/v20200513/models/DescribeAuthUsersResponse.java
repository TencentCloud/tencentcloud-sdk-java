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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuthUsersResponse extends AbstractModel{

    /**
    * 授权人信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Users")
    @Expose
    private AuthInfo [] Users;

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 是否是老策略用户
    */
    @SerializedName("OldUser")
    @Expose
    private Boolean OldUser;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 授权人信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Users 授权人信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthInfo [] getUsers() {
        return this.Users;
    }

    /**
     * Set 授权人信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Users 授权人信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsers(AuthInfo [] Users) {
        this.Users = Users;
    }

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 是否是老策略用户 
     * @return OldUser 是否是老策略用户
     */
    public Boolean getOldUser() {
        return this.OldUser;
    }

    /**
     * Set 是否是老策略用户
     * @param OldUser 是否是老策略用户
     */
    public void setOldUser(Boolean OldUser) {
        this.OldUser = OldUser;
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

    public DescribeAuthUsersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuthUsersResponse(DescribeAuthUsersResponse source) {
        if (source.Users != null) {
            this.Users = new AuthInfo[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new AuthInfo(source.Users[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OldUser != null) {
            this.OldUser = new Boolean(source.OldUser);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "OldUser", this.OldUser);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

