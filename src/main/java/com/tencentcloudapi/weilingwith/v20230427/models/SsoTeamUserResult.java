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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SsoTeamUserResult extends AbstractModel{

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 部门用户列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Users")
    @Expose
    private SsoTeamUser [] Users;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 部门用户列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Users 部门用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SsoTeamUser [] getUsers() {
        return this.Users;
    }

    /**
     * Set 部门用户列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Users 部门用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsers(SsoTeamUser [] Users) {
        this.Users = Users;
    }

    public SsoTeamUserResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SsoTeamUserResult(SsoTeamUserResult source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Users != null) {
            this.Users = new SsoTeamUser[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new SsoTeamUser(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);

    }
}

