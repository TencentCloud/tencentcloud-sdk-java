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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductPrivilegeUnit extends AbstractModel {

    /**
    * 权限名称，当前可选：
GlobalPrivileges
DatabasePrivileges
TablePrivileges
ColumnPrivileges

当权限为DatabasePrivileges时，必须通过参数Database指定数据库名；

当权限为TablePrivileges时，必须通过参数Database和TableName指定数据库名以及数据库中的表名；

当权限为ColumnPrivileges时，必须通过参数Database、TableName和CoulmnName指定数据库、数据库中的表名以及表中的列名。
    */
    @SerializedName("PrivilegeName")
    @Expose
    private String PrivilegeName;

    /**
    * 权限列表。
对于Mysql产品来说，可选权限值为：

1. GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

2. DatabasePrivileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

3. TablePrivileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，不传该参数表示清除该权限。

4. ColumnPrivileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，不传该参数表示清除该权限。
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
    * 仅当PrivilegeName为DatabasePrivileges时这个值才有效。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 仅当PrivilegeName为TablePrivileges时这个值才有效，并且此时需要填充Database显式指明所在的数据库实例。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 仅当PrivilegeName为ColumnPrivileges时这个值才生效，并且此时必须填充：
Database - 显式指明所在的数据库实例。
TableName - 显式指明所在表
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 仅当PrivilegeName为SchemaPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 仅当PrivilegeName为SequencePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
    */
    @SerializedName("SequenceName")
    @Expose
    private String SequenceName;

    /**
    * 仅当PrivilegeName为ProcedurePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * 仅当PrivilegeName为TypePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 仅当PrivilegeName为FunctionPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 仅当PrivilegeName为ViewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 仅当PrivilegeName为MatviewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
    */
    @SerializedName("MatviewName")
    @Expose
    private String MatviewName;

    /**
     * Get 权限名称，当前可选：
GlobalPrivileges
DatabasePrivileges
TablePrivileges
ColumnPrivileges

当权限为DatabasePrivileges时，必须通过参数Database指定数据库名；

当权限为TablePrivileges时，必须通过参数Database和TableName指定数据库名以及数据库中的表名；

当权限为ColumnPrivileges时，必须通过参数Database、TableName和CoulmnName指定数据库、数据库中的表名以及表中的列名。 
     * @return PrivilegeName 权限名称，当前可选：
GlobalPrivileges
DatabasePrivileges
TablePrivileges
ColumnPrivileges

当权限为DatabasePrivileges时，必须通过参数Database指定数据库名；

当权限为TablePrivileges时，必须通过参数Database和TableName指定数据库名以及数据库中的表名；

当权限为ColumnPrivileges时，必须通过参数Database、TableName和CoulmnName指定数据库、数据库中的表名以及表中的列名。
     */
    public String getPrivilegeName() {
        return this.PrivilegeName;
    }

    /**
     * Set 权限名称，当前可选：
GlobalPrivileges
DatabasePrivileges
TablePrivileges
ColumnPrivileges

当权限为DatabasePrivileges时，必须通过参数Database指定数据库名；

当权限为TablePrivileges时，必须通过参数Database和TableName指定数据库名以及数据库中的表名；

当权限为ColumnPrivileges时，必须通过参数Database、TableName和CoulmnName指定数据库、数据库中的表名以及表中的列名。
     * @param PrivilegeName 权限名称，当前可选：
GlobalPrivileges
DatabasePrivileges
TablePrivileges
ColumnPrivileges

当权限为DatabasePrivileges时，必须通过参数Database指定数据库名；

当权限为TablePrivileges时，必须通过参数Database和TableName指定数据库名以及数据库中的表名；

当权限为ColumnPrivileges时，必须通过参数Database、TableName和CoulmnName指定数据库、数据库中的表名以及表中的列名。
     */
    public void setPrivilegeName(String PrivilegeName) {
        this.PrivilegeName = PrivilegeName;
    }

    /**
     * Get 权限列表。
对于Mysql产品来说，可选权限值为：

1. GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

2. DatabasePrivileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

3. TablePrivileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，不传该参数表示清除该权限。

4. ColumnPrivileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，不传该参数表示清除该权限。 
     * @return Privileges 权限列表。
对于Mysql产品来说，可选权限值为：

1. GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

2. DatabasePrivileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

3. TablePrivileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，不传该参数表示清除该权限。

4. ColumnPrivileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，不传该参数表示清除该权限。
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限列表。
对于Mysql产品来说，可选权限值为：

1. GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

2. DatabasePrivileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

3. TablePrivileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，不传该参数表示清除该权限。

4. ColumnPrivileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，不传该参数表示清除该权限。
     * @param Privileges 权限列表。
对于Mysql产品来说，可选权限值为：

1. GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

2. DatabasePrivileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，不传该参数表示清除该权限。

3. TablePrivileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，不传该参数表示清除该权限。

4. ColumnPrivileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，不传该参数表示清除该权限。
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get 仅当PrivilegeName为DatabasePrivileges时这个值才有效。 
     * @return Database 仅当PrivilegeName为DatabasePrivileges时这个值才有效。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 仅当PrivilegeName为DatabasePrivileges时这个值才有效。
     * @param Database 仅当PrivilegeName为DatabasePrivileges时这个值才有效。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 仅当PrivilegeName为TablePrivileges时这个值才有效，并且此时需要填充Database显式指明所在的数据库实例。 
     * @return TableName 仅当PrivilegeName为TablePrivileges时这个值才有效，并且此时需要填充Database显式指明所在的数据库实例。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 仅当PrivilegeName为TablePrivileges时这个值才有效，并且此时需要填充Database显式指明所在的数据库实例。
     * @param TableName 仅当PrivilegeName为TablePrivileges时这个值才有效，并且此时需要填充Database显式指明所在的数据库实例。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 仅当PrivilegeName为ColumnPrivileges时这个值才生效，并且此时必须填充：
Database - 显式指明所在的数据库实例。
TableName - 显式指明所在表 
     * @return ColumnName 仅当PrivilegeName为ColumnPrivileges时这个值才生效，并且此时必须填充：
Database - 显式指明所在的数据库实例。
TableName - 显式指明所在表
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 仅当PrivilegeName为ColumnPrivileges时这个值才生效，并且此时必须填充：
Database - 显式指明所在的数据库实例。
TableName - 显式指明所在表
     * @param ColumnName 仅当PrivilegeName为ColumnPrivileges时这个值才生效，并且此时必须填充：
Database - 显式指明所在的数据库实例。
TableName - 显式指明所在表
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 仅当PrivilegeName为SchemaPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要 
     * @return SchemaName 仅当PrivilegeName为SchemaPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 仅当PrivilegeName为SchemaPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     * @param SchemaName 仅当PrivilegeName为SchemaPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 仅当PrivilegeName为SequencePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要 
     * @return SequenceName 仅当PrivilegeName为SequencePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public String getSequenceName() {
        return this.SequenceName;
    }

    /**
     * Set 仅当PrivilegeName为SequencePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     * @param SequenceName 仅当PrivilegeName为SequencePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public void setSequenceName(String SequenceName) {
        this.SequenceName = SequenceName;
    }

    /**
     * Get 仅当PrivilegeName为ProcedurePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要 
     * @return ProcedureName 仅当PrivilegeName为ProcedurePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * Set 仅当PrivilegeName为ProcedurePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     * @param ProcedureName 仅当PrivilegeName为ProcedurePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * Get 仅当PrivilegeName为TypePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要 
     * @return TypeName 仅当PrivilegeName为TypePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 仅当PrivilegeName为TypePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     * @param TypeName 仅当PrivilegeName为TypePrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 仅当PrivilegeName为FunctionPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要 
     * @return FunctionName 仅当PrivilegeName为FunctionPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 仅当PrivilegeName为FunctionPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     * @param FunctionName 仅当PrivilegeName为FunctionPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 仅当PrivilegeName为ViewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要 
     * @return ViewName 仅当PrivilegeName为ViewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 仅当PrivilegeName为ViewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     * @param ViewName 仅当PrivilegeName为ViewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 仅当PrivilegeName为MatviewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要 
     * @return MatviewName 仅当PrivilegeName为MatviewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public String getMatviewName() {
        return this.MatviewName;
    }

    /**
     * Set 仅当PrivilegeName为MatviewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     * @param MatviewName 仅当PrivilegeName为MatviewPrivileges时这个值才生效，并且此时必须填充：
目前仅postgresSQL需要
     */
    public void setMatviewName(String MatviewName) {
        this.MatviewName = MatviewName;
    }

    public ProductPrivilegeUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductPrivilegeUnit(ProductPrivilegeUnit source) {
        if (source.PrivilegeName != null) {
            this.PrivilegeName = new String(source.PrivilegeName);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.SequenceName != null) {
            this.SequenceName = new String(source.SequenceName);
        }
        if (source.ProcedureName != null) {
            this.ProcedureName = new String(source.ProcedureName);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.MatviewName != null) {
            this.MatviewName = new String(source.MatviewName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivilegeName", this.PrivilegeName);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "SequenceName", this.SequenceName);
        this.setParamSimple(map, prefix + "ProcedureName", this.ProcedureName);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "MatviewName", this.MatviewName);

    }
}

