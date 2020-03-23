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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessDBAccount extends AbstractModel{

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBUser")
    @Expose
    private String DBUser;

    /**
    * 密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBPassword")
    @Expose
    private String DBPassword;

    /**
    * 连接数限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBConnLimit")
    @Expose
    private Long DBConnLimit;

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBUser 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBUser() {
        return this.DBUser;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBUser 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBUser(String DBUser) {
        this.DBUser = DBUser;
    }

    /**
     * Get 密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBPassword 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBPassword() {
        return this.DBPassword;
    }

    /**
     * Set 密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBPassword 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBPassword(String DBPassword) {
        this.DBPassword = DBPassword;
    }

    /**
     * Get 连接数限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBConnLimit 连接数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDBConnLimit() {
        return this.DBConnLimit;
    }

    /**
     * Set 连接数限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBConnLimit 连接数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBConnLimit(Long DBConnLimit) {
        this.DBConnLimit = DBConnLimit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBUser", this.DBUser);
        this.setParamSimple(map, prefix + "DBPassword", this.DBPassword);
        this.setParamSimple(map, prefix + "DBConnLimit", this.DBConnLimit);

    }
}

