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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorLogDetail extends AbstractModel {

    /**
    * 用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 报错时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorTime")
    @Expose
    private String ErrorTime;

    /**
    * 报错信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 报错时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorTime 报错时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorTime() {
        return this.ErrorTime;
    }

    /**
     * Set 报错时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorTime 报错时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorTime(String ErrorTime) {
        this.ErrorTime = ErrorTime;
    }

    /**
     * Get 报错信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 报错信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 报错信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 报错信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public ErrorLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorLogDetail(ErrorLogDetail source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.ErrorTime != null) {
            this.ErrorTime = new String(source.ErrorTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "ErrorTime", this.ErrorTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

