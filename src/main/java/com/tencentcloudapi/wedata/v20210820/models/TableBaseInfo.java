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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableBaseInfo extends AbstractModel{

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 表备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据格式类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * 建表用户ID
注意：此字段可能返回 null，表示取不到有效值。
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
    private DlcDataGovernPolicy GovernPolicy;

    /**
    * 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbGovernPolicyIsDisable")
    @Expose
    private String DbGovernPolicyIsDisable;

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionName 数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionName 数据表所属数据源名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 表备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableComment 表备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set 表备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableComment 表备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据格式类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableFormat 数据格式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set 数据格式类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableFormat 数据格式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAlias 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAlias 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get 建表用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSubUin 建表用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserSubUin() {
        return this.UserSubUin;
    }

    /**
     * Set 建表用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSubUin 建表用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSubUin(String UserSubUin) {
        this.UserSubUin = UserSubUin;
    }

    /**
     * Get 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GovernPolicy 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DlcDataGovernPolicy getGovernPolicy() {
        return this.GovernPolicy;
    }

    /**
     * Set 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @param GovernPolicy 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGovernPolicy(DlcDataGovernPolicy GovernPolicy) {
        this.GovernPolicy = GovernPolicy;
    }

    /**
     * Get 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbGovernPolicyIsDisable 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbGovernPolicyIsDisable() {
        return this.DbGovernPolicyIsDisable;
    }

    /**
     * Set 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbGovernPolicyIsDisable 库数据治理是否关闭，关闭：true，开启：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbGovernPolicyIsDisable(String DbGovernPolicyIsDisable) {
        this.DbGovernPolicyIsDisable = DbGovernPolicyIsDisable;
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
            this.GovernPolicy = new DlcDataGovernPolicy(source.GovernPolicy);
        }
        if (source.DbGovernPolicyIsDisable != null) {
            this.DbGovernPolicyIsDisable = new String(source.DbGovernPolicyIsDisable);
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

    }
}

