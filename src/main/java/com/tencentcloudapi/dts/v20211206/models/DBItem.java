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

public class DBItem extends AbstractModel{

    /**
    * 需要迁移或同步的库名，当ObjectMode为partial时，此项必填
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
    * DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBMode")
    @Expose
    private String DBMode;

    /**
    * schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaMode")
    @Expose
    private String SchemaMode;

    /**
    * 表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * 表图对象集合，当 TableMode 为 partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tables")
    @Expose
    private TableItem [] Tables;

    /**
    * 视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * 视图对象集合，当 ViewMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Views")
    @Expose
    private ViewItem [] Views;

    /**
    * postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleMode")
    @Expose
    private String RoleMode;

    /**
    * postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Roles")
    @Expose
    private RoleItem [] Roles;

    /**
    * 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventMode")
    @Expose
    private String EventMode;

    /**
    * 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * FunctionMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * ProcedureMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
    * EventMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
    * TriggerMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Triggers")
    @Expose
    private String [] Triggers;

    /**
     * Get 需要迁移或同步的库名，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 需要迁移或同步的库名，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 需要迁移或同步的库名，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 需要迁移或同步的库名，当ObjectMode为partial时，此项必填
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
     * Get DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBMode DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBMode() {
        return this.DBMode;
    }

    /**
     * Set DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBMode DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBMode(String DBMode) {
        this.DBMode = DBMode;
    }

    /**
     * Get schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaMode schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaMode() {
        return this.SchemaMode;
    }

    /**
     * Set schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaMode schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaMode(String SchemaMode) {
        this.SchemaMode = SchemaMode;
    }

    /**
     * Get 表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableMode 表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set 表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableMode 表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get 表图对象集合，当 TableMode 为 partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tables 表图对象集合，当 TableMode 为 partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set 表图对象集合，当 TableMode 为 partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tables 表图对象集合，当 TableMode 为 partial 时，此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTables(TableItem [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get 视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ViewMode 视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set 视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param ViewMode 视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get 视图对象集合，当 ViewMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Views 视图对象集合，当 ViewMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ViewItem [] getViews() {
        return this.Views;
    }

    /**
     * Set 视图对象集合，当 ViewMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Views 视图对象集合，当 ViewMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViews(ViewItem [] Views) {
        this.Views = Views;
    }

    /**
     * Get postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleMode postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleMode() {
        return this.RoleMode;
    }

    /**
     * Set postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleMode postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleMode(String RoleMode) {
        this.RoleMode = RoleMode;
    }

    /**
     * Get postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Roles postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleItem [] getRoles() {
        return this.Roles;
    }

    /**
     * Set postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Roles postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoles(RoleItem [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunctionMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunctionMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventMode() {
        return this.EventMode;
    }

    /**
     * Set 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventMode(String EventMode) {
        this.EventMode = EventMode;
    }

    /**
     * Get 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcedureMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureMode 选择要同步的模式，partial为部分，all为整选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get FunctionMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Functions FunctionMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set FunctionMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Functions FunctionMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get ProcedureMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Procedures ProcedureMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set ProcedureMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Procedures ProcedureMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get EventMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Events EventMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set EventMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Events EventMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvents(String [] Events) {
        this.Events = Events;
    }

    /**
     * Get TriggerMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Triggers TriggerMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set TriggerMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Triggers TriggerMode取值为partial时需要填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggers(String [] Triggers) {
        this.Triggers = Triggers;
    }

    public DBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBItem(DBItem source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.NewDbName != null) {
            this.NewDbName = new String(source.NewDbName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.NewSchemaName != null) {
            this.NewSchemaName = new String(source.NewSchemaName);
        }
        if (source.DBMode != null) {
            this.DBMode = new String(source.DBMode);
        }
        if (source.SchemaMode != null) {
            this.SchemaMode = new String(source.SchemaMode);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
        if (source.Tables != null) {
            this.Tables = new TableItem[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new TableItem(source.Tables[i]);
            }
        }
        if (source.ViewMode != null) {
            this.ViewMode = new String(source.ViewMode);
        }
        if (source.Views != null) {
            this.Views = new ViewItem[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new ViewItem(source.Views[i]);
            }
        }
        if (source.RoleMode != null) {
            this.RoleMode = new String(source.RoleMode);
        }
        if (source.Roles != null) {
            this.Roles = new RoleItem[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleItem(source.Roles[i]);
            }
        }
        if (source.FunctionMode != null) {
            this.FunctionMode = new String(source.FunctionMode);
        }
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
        if (source.EventMode != null) {
            this.EventMode = new String(source.EventMode);
        }
        if (source.ProcedureMode != null) {
            this.ProcedureMode = new String(source.ProcedureMode);
        }
        if (source.Functions != null) {
            this.Functions = new String[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new String(source.Functions[i]);
            }
        }
        if (source.Procedures != null) {
            this.Procedures = new String[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new String(source.Procedures[i]);
            }
        }
        if (source.Events != null) {
            this.Events = new String[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new String(source.Events[i]);
            }
        }
        if (source.Triggers != null) {
            this.Triggers = new String[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new String(source.Triggers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "NewDbName", this.NewDbName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "NewSchemaName", this.NewSchemaName);
        this.setParamSimple(map, prefix + "DBMode", this.DBMode);
        this.setParamSimple(map, prefix + "SchemaMode", this.SchemaMode);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamSimple(map, prefix + "RoleMode", this.RoleMode);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "FunctionMode", this.FunctionMode);
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);
        this.setParamSimple(map, prefix + "EventMode", this.EventMode);
        this.setParamSimple(map, prefix + "ProcedureMode", this.ProcedureMode);
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamArraySimple(map, prefix + "Procedures.", this.Procedures);
        this.setParamArraySimple(map, prefix + "Events.", this.Events);
        this.setParamArraySimple(map, prefix + "Triggers.", this.Triggers);

    }
}

