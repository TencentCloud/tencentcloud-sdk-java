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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogInfoItem extends AbstractModel{

    /**
    * 慢日志开始时间
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * sql语句
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * 数据库
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * User来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * IP来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * 执行时间,单位秒
    */
    @SerializedName("QueryTime")
    @Expose
    private Long QueryTime;

    /**
    * 锁时间,单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
    * 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * 返回行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
     * Get 慢日志开始时间 
     * @return Timestamp 慢日志开始时间
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 慢日志开始时间
     * @param Timestamp 慢日志开始时间
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get sql语句 
     * @return SqlText sql语句
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set sql语句
     * @param SqlText sql语句
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get 数据库 
     * @return Database 数据库
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库
     * @param Database 数据库
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get User来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName User来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName User来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get IP来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserHost IP来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set IP来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserHost IP来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get 执行时间,单位秒 
     * @return QueryTime 执行时间,单位秒
     */
    public Long getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set 执行时间,单位秒
     * @param QueryTime 执行时间,单位秒
     */
    public void setQueryTime(Long QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get 锁时间,单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockTime 锁时间,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 锁时间,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockTime 锁时间,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get 扫描行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowsExamined 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowsExamined 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get 返回行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowsSent 返回行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set 返回行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowsSent 返回行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    public SlowLogInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogInfoItem(SlowLogInfoItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserHost != null) {
            this.UserHost = new String(source.UserHost);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Long(source.QueryTime);
        }
        if (source.LockTime != null) {
            this.LockTime = new Long(source.LockTime);
        }
        if (source.RowsExamined != null) {
            this.RowsExamined = new Long(source.RowsExamined);
        }
        if (source.RowsSent != null) {
            this.RowsSent = new Long(source.RowsSent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserHost", this.UserHost);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);

    }
}

