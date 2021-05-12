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

public class DatabasesWithCharacterLists extends AbstractModel{

    /**
    * 数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 字符集类型
    */
    @SerializedName("CharacterSet")
    @Expose
    private String CharacterSet;

    /**
     * Get 数据库名 
     * @return DatabaseName 数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名
     * @param DatabaseName 数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 字符集类型 
     * @return CharacterSet 字符集类型
     */
    public String getCharacterSet() {
        return this.CharacterSet;
    }

    /**
     * Set 字符集类型
     * @param CharacterSet 字符集类型
     */
    public void setCharacterSet(String CharacterSet) {
        this.CharacterSet = CharacterSet;
    }

    public DatabasesWithCharacterLists() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabasesWithCharacterLists(DatabasesWithCharacterLists source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.CharacterSet != null) {
            this.CharacterSet = new String(source.CharacterSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "CharacterSet", this.CharacterSet);

    }
}

