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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Database extends AbstractModel{

    /**
    * 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 迁移或同步后的库名，默认与源库相同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewDbName")
    @Expose
    private String NewDbName;

    /**
    * DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 迁移或同步的 schema
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 迁移或同步后的 schema name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewSchemaName")
    @Expose
    private String NewSchemaName;

    /**
    * 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tables")
    @Expose
    private Table [] Tables;

    /**
    * 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Views")
    @Expose
    private View [] Views;

    /**
    * 选择要同步的模式，Partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * FunctionMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * 选择要同步的模式，Partial为部分，All为整选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * ProcedureMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
     * Get 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 迁移或同步后的库名，默认与源库相同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewDbName 迁移或同步后的库名，默认与源库相同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewDbName() {
        return this.NewDbName;
    }

    /**
     * Set 迁移或同步后的库名，默认与源库相同
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewDbName 迁移或同步后的库名，默认与源库相同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewDbName(String NewDbName) {
        this.NewDbName = NewDbName;
    }

    /**
     * Get DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbMode DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbMode DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 迁移或同步的 schema
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName 迁移或同步的 schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 迁移或同步的 schema
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName 迁移或同步的 schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 迁移或同步后的 schema name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewSchemaName 迁移或同步后的 schema name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewSchemaName() {
        return this.NewSchemaName;
    }

    /**
     * Set 迁移或同步后的 schema name
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewSchemaName 迁移或同步后的 schema name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewSchemaName(String NewSchemaName) {
        this.NewSchemaName = NewSchemaName;
    }

    /**
     * Get 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableMode 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableMode 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tables 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Table [] getTables() {
        return this.Tables;
    }

    /**
     * Set 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tables 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTables(Table [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ViewMode 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param ViewMode 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Views 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public View [] getViews() {
        return this.Views;
    }

    /**
     * Set 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Views 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViews(View [] Views) {
        this.Views = Views;
    }

    /**
     * Get 选择要同步的模式，Partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunctionMode 选择要同步的模式，Partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set 选择要同步的模式，Partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunctionMode 选择要同步的模式，Partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get FunctionMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Functions FunctionMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set FunctionMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Functions FunctionMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 选择要同步的模式，Partial为部分，All为整选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcedureMode 选择要同步的模式，Partial为部分，All为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set 选择要同步的模式，Partial为部分，All为整选
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureMode 选择要同步的模式，Partial为部分，All为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get ProcedureMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Procedures ProcedureMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set ProcedureMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Procedures ProcedureMode取值为Partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    public Database() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Database(Database source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.NewDbName != null) {
            this.NewDbName = new String(source.NewDbName);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.NewSchemaName != null) {
            this.NewSchemaName = new String(source.NewSchemaName);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
        if (source.Tables != null) {
            this.Tables = new Table[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new Table(source.Tables[i]);
            }
        }
        if (source.ViewMode != null) {
            this.ViewMode = new String(source.ViewMode);
        }
        if (source.Views != null) {
            this.Views = new View[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new View(source.Views[i]);
            }
        }
        if (source.FunctionMode != null) {
            this.FunctionMode = new String(source.FunctionMode);
        }
        if (source.Functions != null) {
            this.Functions = new String[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new String(source.Functions[i]);
            }
        }
        if (source.ProcedureMode != null) {
            this.ProcedureMode = new String(source.ProcedureMode);
        }
        if (source.Procedures != null) {
            this.Procedures = new String[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new String(source.Procedures[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "NewDbName", this.NewDbName);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "NewSchemaName", this.NewSchemaName);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamSimple(map, prefix + "FunctionMode", this.FunctionMode);
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "ProcedureMode", this.ProcedureMode);
        this.setParamArraySimple(map, prefix + "Procedures.", this.Procedures);

    }
}

