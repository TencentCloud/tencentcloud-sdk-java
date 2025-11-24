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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcTableInfo extends AbstractModel {

    /**
    * 数据目录
    */
    @SerializedName("DataDirectory")
    @Expose
    private String DataDirectory;

    /**
    * 数据库
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据表
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 数据目录 
     * @return DataDirectory 数据目录
     */
    public String getDataDirectory() {
        return this.DataDirectory;
    }

    /**
     * Set 数据目录
     * @param DataDirectory 数据目录
     */
    public void setDataDirectory(String DataDirectory) {
        this.DataDirectory = DataDirectory;
    }

    /**
     * Get 数据库 
     * @return DatabaseName 数据库
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库
     * @param DatabaseName 数据库
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据表 
     * @return TableName 数据表
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据表
     * @param TableName 数据表
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DlcTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcTableInfo(DlcTableInfo source) {
        if (source.DataDirectory != null) {
            this.DataDirectory = new String(source.DataDirectory);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataDirectory", this.DataDirectory);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

