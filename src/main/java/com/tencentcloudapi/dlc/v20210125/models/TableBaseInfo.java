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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableBaseInfo extends AbstractModel {

    /**
    * 该数据表所属数据库名字
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据表名字
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 该数据表所属数据源名字
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * 具体类型，表or视图
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据格式类型，hive，iceberg等
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
    * 建表用户昵称
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * 建表用户ID
    */
    @SerializedName("UserSubUin")
    @Expose
    private String UserSubUin;

    /**
    * 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GovernPolicy")
    @Expose
    private DataGovernPolicy GovernPolicy;

    /**
    * 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbGovernPolicyIsDisable")
    @Expose
    private String DbGovernPolicyIsDisable;

    /**
    * 智能数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartPolicy")
    @Expose
    private SmartPolicy SmartPolicy;

    /**
    * T-ICEBERG表的主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrimaryKeys")
    @Expose
    private String [] PrimaryKeys;

    /**
     * Get 该数据表所属数据库名字 
     * @return DatabaseName 该数据表所属数据库名字
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 该数据表所属数据库名字
     * @param DatabaseName 该数据表所属数据库名字
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据表名字 
     * @return TableName 数据表名字
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据表名字
     * @param TableName 数据表名字
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 该数据表所属数据源名字 
     * @return DatasourceConnectionName 该数据表所属数据源名字
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 该数据表所属数据源名字
     * @param DatasourceConnectionName 该数据表所属数据源名字
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableComment 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableComment 该数据表备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get 具体类型，表or视图 
     * @return Type 具体类型，表or视图
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 具体类型，表or视图
     * @param Type 具体类型，表or视图
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据格式类型，hive，iceberg等 
     * @return TableFormat 数据格式类型，hive，iceberg等
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set 数据格式类型，hive，iceberg等
     * @param TableFormat 数据格式类型，hive，iceberg等
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    /**
     * Get 建表用户昵称 
     * @return UserAlias 建表用户昵称
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 建表用户昵称
     * @param UserAlias 建表用户昵称
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get 建表用户ID 
     * @return UserSubUin 建表用户ID
     */
    public String getUserSubUin() {
        return this.UserSubUin;
    }

    /**
     * Set 建表用户ID
     * @param UserSubUin 建表用户ID
     */
    public void setUserSubUin(String UserSubUin) {
        this.UserSubUin = UserSubUin;
    }

    /**
     * Get 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GovernPolicy 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public DataGovernPolicy getGovernPolicy() {
        return this.GovernPolicy;
    }

    /**
     * Set 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @param GovernPolicy 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setGovernPolicy(DataGovernPolicy GovernPolicy) {
        this.GovernPolicy = GovernPolicy;
    }

    /**
     * Get 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbGovernPolicyIsDisable 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getDbGovernPolicyIsDisable() {
        return this.DbGovernPolicyIsDisable;
    }

    /**
     * Set 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbGovernPolicyIsDisable 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDbGovernPolicyIsDisable(String DbGovernPolicyIsDisable) {
        this.DbGovernPolicyIsDisable = DbGovernPolicyIsDisable;
    }

    /**
     * Get 智能数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartPolicy 智能数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartPolicy getSmartPolicy() {
        return this.SmartPolicy;
    }

    /**
     * Set 智能数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartPolicy 智能数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartPolicy(SmartPolicy SmartPolicy) {
        this.SmartPolicy = SmartPolicy;
    }

    /**
     * Get T-ICEBERG表的主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrimaryKeys T-ICEBERG表的主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrimaryKeys() {
        return this.PrimaryKeys;
    }

    /**
     * Set T-ICEBERG表的主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrimaryKeys T-ICEBERG表的主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrimaryKeys(String [] PrimaryKeys) {
        this.PrimaryKeys = PrimaryKeys;
    }

    public TableBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableBaseInfo(TableBaseInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.UserSubUin != null) {
            this.UserSubUin = new String(source.UserSubUin);
        }
        if (source.GovernPolicy != null) {
            this.GovernPolicy = new DataGovernPolicy(source.GovernPolicy);
        }
        if (source.DbGovernPolicyIsDisable != null) {
            this.DbGovernPolicyIsDisable = new String(source.DbGovernPolicyIsDisable);
        }
        if (source.SmartPolicy != null) {
            this.SmartPolicy = new SmartPolicy(source.SmartPolicy);
        }
        if (source.PrimaryKeys != null) {
            this.PrimaryKeys = new String[source.PrimaryKeys.length];
            for (int i = 0; i < source.PrimaryKeys.length; i++) {
                this.PrimaryKeys[i] = new String(source.PrimaryKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamSimple(map, prefix + "UserSubUin", this.UserSubUin);
        this.setParamObj(map, prefix + "GovernPolicy.", this.GovernPolicy);
        this.setParamSimple(map, prefix + "DbGovernPolicyIsDisable", this.DbGovernPolicyIsDisable);
        this.setParamObj(map, prefix + "SmartPolicy.", this.SmartPolicy);
        this.setParamArraySimple(map, prefix + "PrimaryKeys.", this.PrimaryKeys);

    }
}

