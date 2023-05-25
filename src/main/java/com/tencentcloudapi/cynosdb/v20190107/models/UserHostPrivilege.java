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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserHostPrivilege extends AbstractModel{

    /**
    * 授权用户
    */
    @SerializedName("DbUserName")
    @Expose
    private String DbUserName;

    /**
    * 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * 用户权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbPrivilege")
    @Expose
    private String DbPrivilege;

    /**
     * Get 授权用户 
     * @return DbUserName 授权用户
     */
    public String getDbUserName() {
        return this.DbUserName;
    }

    /**
     * Set 授权用户
     * @param DbUserName 授权用户
     */
    public void setDbUserName(String DbUserName) {
        this.DbUserName = DbUserName;
    }

    /**
     * Get 客户端ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbHost 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbHost 客户端ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get 用户权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbPrivilege 用户权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbPrivilege() {
        return this.DbPrivilege;
    }

    /**
     * Set 用户权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbPrivilege 用户权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbPrivilege(String DbPrivilege) {
        this.DbPrivilege = DbPrivilege;
    }

    public UserHostPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserHostPrivilege(UserHostPrivilege source) {
        if (source.DbUserName != null) {
            this.DbUserName = new String(source.DbUserName);
        }
        if (source.DbHost != null) {
            this.DbHost = new String(source.DbHost);
        }
        if (source.DbPrivilege != null) {
            this.DbPrivilege = new String(source.DbPrivilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbUserName", this.DbUserName);
        this.setParamSimple(map, prefix + "DbHost", this.DbHost);
        this.setParamSimple(map, prefix + "DbPrivilege", this.DbPrivilege);

    }
}

