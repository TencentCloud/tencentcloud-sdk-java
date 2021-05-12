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

public class CreateScriptRequest extends AbstractModel{

    /**
    * 脚本名称，最大不能超过255个字符。
    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * base64编码后的sql语句
    */
    @SerializedName("SQLStatement")
    @Expose
    private String SQLStatement;

    /**
    * 脚本描述， 不能超过50个字符
    */
    @SerializedName("ScriptDesc")
    @Expose
    private String ScriptDesc;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
     * Get 脚本名称，最大不能超过255个字符。 
     * @return ScriptName 脚本名称，最大不能超过255个字符。
     */
    public String getScriptName() {
        return this.ScriptName;
    }

    /**
     * Set 脚本名称，最大不能超过255个字符。
     * @param ScriptName 脚本名称，最大不能超过255个字符。
     */
    public void setScriptName(String ScriptName) {
        this.ScriptName = ScriptName;
    }

    /**
     * Get base64编码后的sql语句 
     * @return SQLStatement base64编码后的sql语句
     */
    public String getSQLStatement() {
        return this.SQLStatement;
    }

    /**
     * Set base64编码后的sql语句
     * @param SQLStatement base64编码后的sql语句
     */
    public void setSQLStatement(String SQLStatement) {
        this.SQLStatement = SQLStatement;
    }

    /**
     * Get 脚本描述， 不能超过50个字符 
     * @return ScriptDesc 脚本描述， 不能超过50个字符
     */
    public String getScriptDesc() {
        return this.ScriptDesc;
    }

    /**
     * Set 脚本描述， 不能超过50个字符
     * @param ScriptDesc 脚本描述， 不能超过50个字符
     */
    public void setScriptDesc(String ScriptDesc) {
        this.ScriptDesc = ScriptDesc;
    }

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    public CreateScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScriptRequest(CreateScriptRequest source) {
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.SQLStatement != null) {
            this.SQLStatement = new String(source.SQLStatement);
        }
        if (source.ScriptDesc != null) {
            this.ScriptDesc = new String(source.ScriptDesc);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "SQLStatement", this.SQLStatement);
        this.setParamSimple(map, prefix + "ScriptDesc", this.ScriptDesc);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);

    }
}

