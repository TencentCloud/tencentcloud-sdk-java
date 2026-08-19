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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBItem extends AbstractModel {

    /**
    * <p>需要迁移或同步的库名，当ObjectMode为partial时，此项必填</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>迁移或同步后的库名，默认与源库相同</p>
    */
    @SerializedName("NewDbName")
    @Expose
    private String NewDbName;

    /**
    * <p>迁移或同步的 schema</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>迁移或同步后的 schema name</p>
    */
    @SerializedName("NewSchemaName")
    @Expose
    private String NewSchemaName;

    /**
    * <p>DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填</p>
    */
    @SerializedName("DBMode")
    @Expose
    private String DBMode;

    /**
    * <p>schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)</p>
    */
    @SerializedName("SchemaMode")
    @Expose
    private String SchemaMode;

    /**
    * <p>表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填</p>
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * <p>表图对象集合，当 TableMode 为 partial 时，此项需要填写</p>
    */
    @SerializedName("Tables")
    @Expose
    private TableItem [] Tables;

    /**
    * <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象</p>
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * <p>视图对象集合，当 ViewMode 为 partial 时， 此项需要填写</p>
    */
    @SerializedName("Views")
    @Expose
    private ViewItem [] Views;

    /**
    * <p>postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象</p>
    */
    @SerializedName("RoleMode")
    @Expose
    private String RoleMode;

    /**
    * <p>postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写</p>
    */
    @SerializedName("Roles")
    @Expose
    private RoleItem [] Roles;

    /**
    * <p>选择要同步的模式，partial为部分，all为整选</p>
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * <p>选择要同步的模式，partial为部分，all为整选</p>
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * <p>选择要同步的模式，partial为部分，all为整选</p>
    */
    @SerializedName("EventMode")
    @Expose
    private String EventMode;

    /**
    * <p>选择要同步的模式，partial为部分，all为整选</p>
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * <p>FunctionMode取值为partial时需要填写</p>
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * <p>ProcedureMode取值为partial时需要填写</p>
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
    * <p>EventMode取值为partial时需要填写</p>
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
    * <p>TriggerMode取值为partial时需要填写</p>
    */
    @SerializedName("Triggers")
    @Expose
    private String [] Triggers;

    /**
     * Get <p>需要迁移或同步的库名，当ObjectMode为partial时，此项必填</p> 
     * @return DbName <p>需要迁移或同步的库名，当ObjectMode为partial时，此项必填</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>需要迁移或同步的库名，当ObjectMode为partial时，此项必填</p>
     * @param DbName <p>需要迁移或同步的库名，当ObjectMode为partial时，此项必填</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>迁移或同步后的库名，默认与源库相同</p> 
     * @return NewDbName <p>迁移或同步后的库名，默认与源库相同</p>
     */
    public String getNewDbName() {
        return this.NewDbName;
    }

    /**
     * Set <p>迁移或同步后的库名，默认与源库相同</p>
     * @param NewDbName <p>迁移或同步后的库名，默认与源库相同</p>
     */
    public void setNewDbName(String NewDbName) {
        this.NewDbName = NewDbName;
    }

    /**
     * Get <p>迁移或同步的 schema</p> 
     * @return SchemaName <p>迁移或同步的 schema</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>迁移或同步的 schema</p>
     * @param SchemaName <p>迁移或同步的 schema</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>迁移或同步后的 schema name</p> 
     * @return NewSchemaName <p>迁移或同步后的 schema name</p>
     */
    public String getNewSchemaName() {
        return this.NewSchemaName;
    }

    /**
     * Set <p>迁移或同步后的 schema name</p>
     * @param NewSchemaName <p>迁移或同步后的 schema name</p>
     */
    public void setNewSchemaName(String NewSchemaName) {
        this.NewSchemaName = NewSchemaName;
    }

    /**
     * Get <p>DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填</p> 
     * @return DBMode <p>DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填</p>
     */
    public String getDBMode() {
        return this.DBMode;
    }

    /**
     * Set <p>DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填</p>
     * @param DBMode <p>DB选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当ObjectMode为partial时，此项必填</p>
     */
    public void setDBMode(String DBMode) {
        this.DBMode = DBMode;
    }

    /**
     * Get <p>schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)</p> 
     * @return SchemaMode <p>schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)</p>
     */
    public String getSchemaMode() {
        return this.SchemaMode;
    }

    /**
     * Set <p>schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)</p>
     * @param SchemaMode <p>schema选择模式: all(为当前对象下的所有对象)，partial(部分对象)</p>
     */
    public void setSchemaMode(String SchemaMode) {
        this.SchemaMode = SchemaMode;
    }

    /**
     * Get <p>表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填</p> 
     * @return TableMode <p>表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填</p>
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set <p>表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填</p>
     * @param TableMode <p>表选择模式: all(为当前对象下的所有对象)，partial(部分对象)，当DBMode为partial时此项必填</p>
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get <p>表图对象集合，当 TableMode 为 partial 时，此项需要填写</p> 
     * @return Tables <p>表图对象集合，当 TableMode 为 partial 时，此项需要填写</p>
     */
    public TableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set <p>表图对象集合，当 TableMode 为 partial 时，此项需要填写</p>
     * @param Tables <p>表图对象集合，当 TableMode 为 partial 时，此项需要填写</p>
     */
    public void setTables(TableItem [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象</p> 
     * @return ViewMode <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象</p>
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象</p>
     * @param ViewMode <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象</p>
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get <p>视图对象集合，当 ViewMode 为 partial 时， 此项需要填写</p> 
     * @return Views <p>视图对象集合，当 ViewMode 为 partial 时， 此项需要填写</p>
     */
    public ViewItem [] getViews() {
        return this.Views;
    }

    /**
     * Set <p>视图对象集合，当 ViewMode 为 partial 时， 此项需要填写</p>
     * @param Views <p>视图对象集合，当 ViewMode 为 partial 时， 此项需要填写</p>
     */
    public void setViews(ViewItem [] Views) {
        this.Views = Views;
    }

    /**
     * Get <p>postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象</p> 
     * @return RoleMode <p>postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象</p>
     */
    public String getRoleMode() {
        return this.RoleMode;
    }

    /**
     * Set <p>postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象</p>
     * @param RoleMode <p>postgresql独有参数，角色选择模式: all 为当前对象下的所有角色对象,partial 为部分角色对象</p>
     */
    public void setRoleMode(String RoleMode) {
        this.RoleMode = RoleMode;
    }

    /**
     * Get <p>postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写</p> 
     * @return Roles <p>postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写</p>
     */
    public RoleItem [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写</p>
     * @param Roles <p>postgresql独有参数，当 RoleMode 为 partial 时， 此项需要填写</p>
     */
    public void setRoles(RoleItem [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get <p>选择要同步的模式，partial为部分，all为整选</p> 
     * @return FunctionMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set <p>选择要同步的模式，partial为部分，all为整选</p>
     * @param FunctionMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get <p>选择要同步的模式，partial为部分，all为整选</p> 
     * @return TriggerMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set <p>选择要同步的模式，partial为部分，all为整选</p>
     * @param TriggerMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get <p>选择要同步的模式，partial为部分，all为整选</p> 
     * @return EventMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public String getEventMode() {
        return this.EventMode;
    }

    /**
     * Set <p>选择要同步的模式，partial为部分，all为整选</p>
     * @param EventMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public void setEventMode(String EventMode) {
        this.EventMode = EventMode;
    }

    /**
     * Get <p>选择要同步的模式，partial为部分，all为整选</p> 
     * @return ProcedureMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set <p>选择要同步的模式，partial为部分，all为整选</p>
     * @param ProcedureMode <p>选择要同步的模式，partial为部分，all为整选</p>
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get <p>FunctionMode取值为partial时需要填写</p> 
     * @return Functions <p>FunctionMode取值为partial时需要填写</p>
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set <p>FunctionMode取值为partial时需要填写</p>
     * @param Functions <p>FunctionMode取值为partial时需要填写</p>
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get <p>ProcedureMode取值为partial时需要填写</p> 
     * @return Procedures <p>ProcedureMode取值为partial时需要填写</p>
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set <p>ProcedureMode取值为partial时需要填写</p>
     * @param Procedures <p>ProcedureMode取值为partial时需要填写</p>
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get <p>EventMode取值为partial时需要填写</p> 
     * @return Events <p>EventMode取值为partial时需要填写</p>
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>EventMode取值为partial时需要填写</p>
     * @param Events <p>EventMode取值为partial时需要填写</p>
     */
    public void setEvents(String [] Events) {
        this.Events = Events;
    }

    /**
     * Get <p>TriggerMode取值为partial时需要填写</p> 
     * @return Triggers <p>TriggerMode取值为partial时需要填写</p>
     */
    public String [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>TriggerMode取值为partial时需要填写</p>
     * @param Triggers <p>TriggerMode取值为partial时需要填写</p>
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

