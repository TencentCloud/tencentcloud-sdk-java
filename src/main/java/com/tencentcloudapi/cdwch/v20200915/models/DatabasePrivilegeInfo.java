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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabasePrivilegeInfo extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * //库表权限，SELECT、INSERT_ALL、ALTER、TRUNCATE、DROP_TABLE、CREATE_TABLE、DROP_DATABASE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private String [] DatabasePrivileges;

    /**
    * // 库下面的表权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TablePrivilegeList")
    @Expose
    private TablePrivilegeInfo [] TablePrivilegeList;

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

    /**
     * Get //库表权限，SELECT、INSERT_ALL、ALTER、TRUNCATE、DROP_TABLE、CREATE_TABLE、DROP_DATABASE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabasePrivileges //库表权限，SELECT、INSERT_ALL、ALTER、TRUNCATE、DROP_TABLE、CREATE_TABLE、DROP_DATABASE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set //库表权限，SELECT、INSERT_ALL、ALTER、TRUNCATE、DROP_TABLE、CREATE_TABLE、DROP_DATABASE
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabasePrivileges //库表权限，SELECT、INSERT_ALL、ALTER、TRUNCATE、DROP_TABLE、CREATE_TABLE、DROP_DATABASE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabasePrivileges(String [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get // 库下面的表权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TablePrivilegeList // 库下面的表权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TablePrivilegeInfo [] getTablePrivilegeList() {
        return this.TablePrivilegeList;
    }

    /**
     * Set // 库下面的表权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param TablePrivilegeList // 库下面的表权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTablePrivilegeList(TablePrivilegeInfo [] TablePrivilegeList) {
        this.TablePrivilegeList = TablePrivilegeList;
    }

    public DatabasePrivilegeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabasePrivilegeInfo(DatabasePrivilegeInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabasePrivileges != null) {
            this.DatabasePrivileges = new String[source.DatabasePrivileges.length];
            for (int i = 0; i < source.DatabasePrivileges.length; i++) {
                this.DatabasePrivileges[i] = new String(source.DatabasePrivileges[i]);
            }
        }
        if (source.TablePrivilegeList != null) {
            this.TablePrivilegeList = new TablePrivilegeInfo[source.TablePrivilegeList.length];
            for (int i = 0; i < source.TablePrivilegeList.length; i++) {
                this.TablePrivilegeList[i] = new TablePrivilegeInfo(source.TablePrivilegeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivilegeList.", this.TablePrivilegeList);

    }
}

