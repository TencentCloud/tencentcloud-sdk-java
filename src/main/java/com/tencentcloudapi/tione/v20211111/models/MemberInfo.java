/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberInfo extends AbstractModel {

    /**
    * <p>超管成员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuperAdmins")
    @Expose
    private UserBriefInfo [] SuperAdmins;

    /**
    * <p>空间内管理员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Admins")
    @Expose
    private UserBriefInfo [] Admins;

    /**
     * Get <p>超管成员列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperAdmins <p>超管成员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserBriefInfo [] getSuperAdmins() {
        return this.SuperAdmins;
    }

    /**
     * Set <p>超管成员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperAdmins <p>超管成员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuperAdmins(UserBriefInfo [] SuperAdmins) {
        this.SuperAdmins = SuperAdmins;
    }

    /**
     * Get <p>空间内管理员列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Admins <p>空间内管理员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserBriefInfo [] getAdmins() {
        return this.Admins;
    }

    /**
     * Set <p>空间内管理员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Admins <p>空间内管理员列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmins(UserBriefInfo [] Admins) {
        this.Admins = Admins;
    }

    public MemberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberInfo(MemberInfo source) {
        if (source.SuperAdmins != null) {
            this.SuperAdmins = new UserBriefInfo[source.SuperAdmins.length];
            for (int i = 0; i < source.SuperAdmins.length; i++) {
                this.SuperAdmins[i] = new UserBriefInfo(source.SuperAdmins[i]);
            }
        }
        if (source.Admins != null) {
            this.Admins = new UserBriefInfo[source.Admins.length];
            for (int i = 0; i < source.Admins.length; i++) {
                this.Admins[i] = new UserBriefInfo(source.Admins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SuperAdmins.", this.SuperAdmins);
        this.setParamArrayObj(map, prefix + "Admins.", this.Admins);

    }
}

