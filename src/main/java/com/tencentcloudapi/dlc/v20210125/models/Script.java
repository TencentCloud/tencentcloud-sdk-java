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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Script extends AbstractModel{

    /**
    * 脚本Id，长度36字节。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 脚本名称，长度0-25。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * 脚本描述，长度0-50。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptDesc")
    @Expose
    private String ScriptDesc;

    /**
    * 默认关联数据库。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * SQL描述，长度0-10000。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQLStatement")
    @Expose
    private String SQLStatement;

    /**
    * 更新时间戳， 单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 脚本Id，长度36字节。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptId 脚本Id，长度36字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本Id，长度36字节。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptId 脚本Id，长度36字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 脚本名称，长度0-25。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptName 脚本名称，长度0-25。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptName() {
        return this.ScriptName;
    }

    /**
     * Set 脚本名称，长度0-25。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptName 脚本名称，长度0-25。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptName(String ScriptName) {
        this.ScriptName = ScriptName;
    }

    /**
     * Get 脚本描述，长度0-50。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptDesc 脚本描述，长度0-50。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptDesc() {
        return this.ScriptDesc;
    }

    /**
     * Set 脚本描述，长度0-50。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptDesc 脚本描述，长度0-50。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptDesc(String ScriptDesc) {
        this.ScriptDesc = ScriptDesc;
    }

    /**
     * Get 默认关联数据库。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 默认关联数据库。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 默认关联数据库。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 默认关联数据库。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get SQL描述，长度0-10000。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQLStatement SQL描述，长度0-10000。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSQLStatement() {
        return this.SQLStatement;
    }

    /**
     * Set SQL描述，长度0-10000。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQLStatement SQL描述，长度0-10000。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQLStatement(String SQLStatement) {
        this.SQLStatement = SQLStatement;
    }

    /**
     * Get 更新时间戳， 单位：ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间戳， 单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳， 单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间戳， 单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Script() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Script(Script source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.ScriptDesc != null) {
            this.ScriptDesc = new String(source.ScriptDesc);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SQLStatement != null) {
            this.SQLStatement = new String(source.SQLStatement);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "ScriptDesc", this.ScriptDesc);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SQLStatement", this.SQLStatement);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

