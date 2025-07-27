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
    * 实例ID，形如postgres-6fego161。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 创建的数据库名。
名称规范：由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库的所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
    */
    @SerializedName("DatabaseOwner")
    @Expose
    private String DatabaseOwner;

    /**
    * 数据库的字符编码。
支持的常用字符集包括：UTF8、LATIN1、LATIN2、WIN1250、WIN1251、WIN1252、KOI8R、EUC_JP、EUC_KR
默认值：UTF8
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
     * Get 实例ID，形如postgres-6fego161。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID，形如postgres-6fego161。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-6fego161。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID，形如postgres-6fego161。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 创建的数据库名。
名称规范：由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres。 
     * @return DatabaseName 创建的数据库名。
名称规范：由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 创建的数据库名。
名称规范：由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres。
     * @param DatabaseName 创建的数据库名。
名称规范：由字母（a-z, A-Z）、数字（0-9）、下划线（_）组成，以字母或（_）开头，最多63个字符。不能使用系统保留关键字，不能为postgres。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据库的所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取 
     * @return DatabaseOwner 数据库的所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public String getDatabaseOwner() {
        return this.DatabaseOwner;
    }

    /**
     * Set 数据库的所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     * @param DatabaseOwner 数据库的所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public void setDatabaseOwner(String DatabaseOwner) {
        this.DatabaseOwner = DatabaseOwner;
    }

    /**
     * Get 数据库的字符编码。
支持的常用字符集包括：UTF8、LATIN1、LATIN2、WIN1250、WIN1251、WIN1252、KOI8R、EUC_JP、EUC_KR
默认值：UTF8 
     * @return Encoding 数据库的字符编码。
支持的常用字符集包括：UTF8、LATIN1、LATIN2、WIN1250、WIN1251、WIN1252、KOI8R、EUC_JP、EUC_KR
默认值：UTF8
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 数据库的字符编码。
支持的常用字符集包括：UTF8、LATIN1、LATIN2、WIN1250、WIN1251、WIN1252、KOI8R、EUC_JP、EUC_KR
默认值：UTF8
     * @param Encoding 数据库的字符编码。
支持的常用字符集包括：UTF8、LATIN1、LATIN2、WIN1250、WIN1251、WIN1252、KOI8R、EUC_JP、EUC_KR
默认值：UTF8
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

