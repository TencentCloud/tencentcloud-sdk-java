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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatabaseRequest extends AbstractModel {

    /**
    * 实例ID，形如postgres-6fego161
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 创建的数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库的所有者
    */
    @SerializedName("DatabaseOwner")
    @Expose
    private String DatabaseOwner;

    /**
    * 数据库的字符编码
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * 数据库的排序规则
    */
    @SerializedName("Collate")
    @Expose
    private String Collate;

    /**
    * 数据库的字符分类
    */
    @SerializedName("Ctype")
    @Expose
    private String Ctype;

    /**
     * Get 实例ID，形如postgres-6fego161 
     * @return DBInstanceId 实例ID，形如postgres-6fego161
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-6fego161
     * @param DBInstanceId 实例ID，形如postgres-6fego161
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 创建的数据库名 
     * @return DatabaseName 创建的数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 创建的数据库名
     * @param DatabaseName 创建的数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据库的所有者 
     * @return DatabaseOwner 数据库的所有者
     */
    public String getDatabaseOwner() {
        return this.DatabaseOwner;
    }

    /**
     * Set 数据库的所有者
     * @param DatabaseOwner 数据库的所有者
     */
    public void setDatabaseOwner(String DatabaseOwner) {
        this.DatabaseOwner = DatabaseOwner;
    }

    /**
     * Get 数据库的字符编码 
     * @return Encoding 数据库的字符编码
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 数据库的字符编码
     * @param Encoding 数据库的字符编码
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 数据库的排序规则 
     * @return Collate 数据库的排序规则
     */
    public String getCollate() {
        return this.Collate;
    }

    /**
     * Set 数据库的排序规则
     * @param Collate 数据库的排序规则
     */
    public void setCollate(String Collate) {
        this.Collate = Collate;
    }

    /**
     * Get 数据库的字符分类 
     * @return Ctype 数据库的字符分类
     */
    public String getCtype() {
        return this.Ctype;
    }

    /**
     * Set 数据库的字符分类
     * @param Ctype 数据库的字符分类
     */
    public void setCtype(String Ctype) {
        this.Ctype = Ctype;
    }

    public CreateDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatabaseRequest(CreateDatabaseRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseOwner != null) {
            this.DatabaseOwner = new String(source.DatabaseOwner);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.Collate != null) {
            this.Collate = new String(source.Collate);
        }
        if (source.Ctype != null) {
            this.Ctype = new String(source.Ctype);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseOwner", this.DatabaseOwner);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Collate", this.Collate);
        this.setParamSimple(map, prefix + "Ctype", this.Ctype);

    }
}

