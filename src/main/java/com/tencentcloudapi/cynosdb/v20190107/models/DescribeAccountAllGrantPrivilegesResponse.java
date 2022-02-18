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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountAllGrantPrivilegesResponse extends AbstractModel{

    /**
    * 权限语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegeStatements")
    @Expose
    private String [] PrivilegeStatements;

    /**
    * 全局权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * 数据库权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivileges [] DatabasePrivileges;

    /**
    * 数据库表权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivileges [] TablePrivileges;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 权限语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegeStatements 权限语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivilegeStatements() {
        return this.PrivilegeStatements;
    }

    /**
     * Set 权限语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegeStatements 权限语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegeStatements(String [] PrivilegeStatements) {
        this.PrivilegeStatements = PrivilegeStatements;
    }

    /**
     * Get 全局权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalPrivileges 全局权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set 全局权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalPrivileges 全局权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get 数据库权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabasePrivileges 数据库权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatabasePrivileges [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set 数据库权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabasePrivileges 数据库权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabasePrivileges(DatabasePrivileges [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get 数据库表权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TablePrivileges 数据库表权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TablePrivileges [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set 数据库表权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param TablePrivileges 数据库表权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTablePrivileges(TablePrivileges [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAccountAllGrantPrivilegesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountAllGrantPrivilegesResponse(DescribeAccountAllGrantPrivilegesResponse source) {
        if (source.PrivilegeStatements != null) {
            this.PrivilegeStatements = new String[source.PrivilegeStatements.length];
            for (int i = 0; i < source.PrivilegeStatements.length; i++) {
                this.PrivilegeStatements[i] = new String(source.PrivilegeStatements[i]);
            }
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivileges != null) {
            this.DatabasePrivileges = new DatabasePrivileges[source.DatabasePrivileges.length];
            for (int i = 0; i < source.DatabasePrivileges.length; i++) {
                this.DatabasePrivileges[i] = new DatabasePrivileges(source.DatabasePrivileges[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new TablePrivileges[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new TablePrivileges(source.TablePrivileges[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PrivilegeStatements.", this.PrivilegeStatements);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

