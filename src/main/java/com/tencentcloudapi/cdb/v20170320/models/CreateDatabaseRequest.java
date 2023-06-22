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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatabaseRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名称。
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * 字符集，可选值：utf8，gbk，latin1，utf8mb4。
    */
    @SerializedName("CharacterSetName")
    @Expose
    private String CharacterSetName;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名称。 
     * @return DBName 数据库名称。
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名称。
     * @param DBName 数据库名称。
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 字符集，可选值：utf8，gbk，latin1，utf8mb4。 
     * @return CharacterSetName 字符集，可选值：utf8，gbk，latin1，utf8mb4。
     */
    public String getCharacterSetName() {
        return this.CharacterSetName;
    }

    /**
     * Set 字符集，可选值：utf8，gbk，latin1，utf8mb4。
     * @param CharacterSetName 字符集，可选值：utf8，gbk，latin1，utf8mb4。
     */
    public void setCharacterSetName(String CharacterSetName) {
        this.CharacterSetName = CharacterSetName;
    }

    public CreateDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatabaseRequest(CreateDatabaseRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.CharacterSetName != null) {
            this.CharacterSetName = new String(source.CharacterSetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "CharacterSetName", this.CharacterSetName);

    }
}

