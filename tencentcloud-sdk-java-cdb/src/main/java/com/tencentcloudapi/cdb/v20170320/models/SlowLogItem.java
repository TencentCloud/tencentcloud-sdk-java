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

public class SlowLogItem extends AbstractModel{

    /**
    * Sql的执行时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Sql的执行时长。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * Sql语句。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * 客户端地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * 用户名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 锁时长。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * 结果集行数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * Sql模板。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * Sql语句的md5。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
     * Get Sql的执行时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp Sql的执行时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Sql的执行时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp Sql的执行时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Sql的执行时长。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryTime Sql的执行时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Sql的执行时长。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryTime Sql的执行时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Sql语句。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlText Sql语句。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set Sql语句。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlText Sql语句。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get 客户端地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserHost 客户端地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set 客户端地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserHost 客户端地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get 用户名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 数据库名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database 数据库名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 锁时长。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockTime 锁时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 锁时长。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockTime 锁时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowsExamined 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowsExamined 扫描行数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get 结果集行数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowsSent 结果集行数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set 结果集行数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowsSent 结果集行数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get Sql模板。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlTemplate Sql模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set Sql模板。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlTemplate Sql模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get Sql语句的md5。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5 Sql语句的md5。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Sql语句的md5。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 Sql语句的md5。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "UserHost", this.UserHost);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "Md5", this.Md5);

    }
}

