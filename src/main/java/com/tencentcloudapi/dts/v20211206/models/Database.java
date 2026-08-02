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

public class Database extends AbstractModel {

    /**
    * <p>需要迁移或同步的库名，当ObjectMode为Partial时，此项必填</p>
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
    * <p>DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

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
    * <p>schema选择模式，pg和sqlserver需要使用</p><p>枚举值：</p><ul><li>All： 当前对象下的所有对象</li><li>Partial： 部分对象</li></ul>
    */
    @SerializedName("SchemaMode")
    @Expose
    private String SchemaMode;

    /**
    * <p>表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。</p>
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * <p>表图对象集合，当 TableMode 为 Partial 时，此项需要填写</p>
    */
    @SerializedName("Tables")
    @Expose
    private Table [] Tables;

    /**
    * <p>视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。</p>
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * <p>视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写</p>
    */
    @SerializedName("Views")
    @Expose
    private View [] Views;

    /**
    * <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * <p>FunctionMode取值为Partial时需要填写</p>
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * <p>ProcedureMode取值为Partial时需要填写</p>
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
    * <p>触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * <p>当TriggerMode为partial，指定要迁移的触发器名称</p>
    */
    @SerializedName("Triggers")
    @Expose
    private String [] Triggers;

    /**
    * <p>事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
    */
    @SerializedName("EventMode")
    @Expose
    private String EventMode;

    /**
    * <p>当EventMode为partial，指定要迁移的事件名称</p>
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
     * Get <p>需要迁移或同步的库名，当ObjectMode为Partial时，此项必填</p> 
     * @return DbName <p>需要迁移或同步的库名，当ObjectMode为Partial时，此项必填</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>需要迁移或同步的库名，当ObjectMode为Partial时，此项必填</p>
     * @param DbName <p>需要迁移或同步的库名，当ObjectMode为Partial时，此项必填</p>
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
     * Get <p>DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。</p> 
     * @return DbMode <p>DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。</p>
     * @param DbMode <p>DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
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
     * Get <p>schema选择模式，pg和sqlserver需要使用</p><p>枚举值：</p><ul><li>All： 当前对象下的所有对象</li><li>Partial： 部分对象</li></ul> 
     * @return SchemaMode <p>schema选择模式，pg和sqlserver需要使用</p><p>枚举值：</p><ul><li>All： 当前对象下的所有对象</li><li>Partial： 部分对象</li></ul>
     */
    public String getSchemaMode() {
        return this.SchemaMode;
    }

    /**
     * Set <p>schema选择模式，pg和sqlserver需要使用</p><p>枚举值：</p><ul><li>All： 当前对象下的所有对象</li><li>Partial： 部分对象</li></ul>
     * @param SchemaMode <p>schema选择模式，pg和sqlserver需要使用</p><p>枚举值：</p><ul><li>All： 当前对象下的所有对象</li><li>Partial： 部分对象</li></ul>
     */
    public void setSchemaMode(String SchemaMode) {
        this.SchemaMode = SchemaMode;
    }

    /**
     * Get <p>表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。</p> 
     * @return TableMode <p>表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。</p>
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set <p>表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。</p>
     * @param TableMode <p>表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。</p>
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get <p>表图对象集合，当 TableMode 为 Partial 时，此项需要填写</p> 
     * @return Tables <p>表图对象集合，当 TableMode 为 Partial 时，此项需要填写</p>
     */
    public Table [] getTables() {
        return this.Tables;
    }

    /**
     * Set <p>表图对象集合，当 TableMode 为 Partial 时，此项需要填写</p>
     * @param Tables <p>表图对象集合，当 TableMode 为 Partial 时，此项需要填写</p>
     */
    public void setTables(Table [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。</p> 
     * @return ViewMode <p>视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。</p>
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set <p>视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。</p>
     * @param ViewMode <p>视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。</p>
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get <p>视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写</p> 
     * @return Views <p>视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写</p>
     */
    public View [] getViews() {
        return this.Views;
    }

    /**
     * Set <p>视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写</p>
     * @param Views <p>视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写</p>
     */
    public void setViews(View [] Views) {
        this.Views = Views;
    }

    /**
     * Get <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p> 
     * @return FunctionMode <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
     * @param FunctionMode <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get <p>FunctionMode取值为Partial时需要填写</p> 
     * @return Functions <p>FunctionMode取值为Partial时需要填写</p>
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set <p>FunctionMode取值为Partial时需要填写</p>
     * @param Functions <p>FunctionMode取值为Partial时需要填写</p>
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p> 
     * @return ProcedureMode <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
     * @param ProcedureMode <p>选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。</p>
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get <p>ProcedureMode取值为Partial时需要填写</p> 
     * @return Procedures <p>ProcedureMode取值为Partial时需要填写</p>
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set <p>ProcedureMode取值为Partial时需要填写</p>
     * @param Procedures <p>ProcedureMode取值为Partial时需要填写</p>
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get <p>触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p> 
     * @return TriggerMode <p>触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set <p>触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
     * @param TriggerMode <p>触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get <p>当TriggerMode为partial，指定要迁移的触发器名称</p> 
     * @return Triggers <p>当TriggerMode为partial，指定要迁移的触发器名称</p>
     */
    public String [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>当TriggerMode为partial，指定要迁移的触发器名称</p>
     * @param Triggers <p>当TriggerMode为partial，指定要迁移的触发器名称</p>
     */
    public void setTriggers(String [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get <p>事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p> 
     * @return EventMode <p>事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
     */
    public String getEventMode() {
        return this.EventMode;
    }

    /**
     * Set <p>事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
     * @param EventMode <p>事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。</p>
     */
    public void setEventMode(String EventMode) {
        this.EventMode = EventMode;
    }

    /**
     * Get <p>当EventMode为partial，指定要迁移的事件名称</p> 
     * @return Events <p>当EventMode为partial，指定要迁移的事件名称</p>
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>当EventMode为partial，指定要迁移的事件名称</p>
     * @param Events <p>当EventMode为partial，指定要迁移的事件名称</p>
     */
    public void setEvents(String [] Events) {
        this.Events = Events;
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
        if (source.SchemaMode != null) {
            this.SchemaMode = new String(source.SchemaMode);
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
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
        if (source.Triggers != null) {
            this.Triggers = new String[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new String(source.Triggers[i]);
            }
        }
        if (source.EventMode != null) {
            this.EventMode = new String(source.EventMode);
        }
        if (source.Events != null) {
            this.Events = new String[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new String(source.Events[i]);
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
        this.setParamSimple(map, prefix + "SchemaMode", this.SchemaMode);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamSimple(map, prefix + "FunctionMode", this.FunctionMode);
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "ProcedureMode", this.ProcedureMode);
        this.setParamArraySimple(map, prefix + "Procedures.", this.Procedures);
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);
        this.setParamArraySimple(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "EventMode", this.EventMode);
        this.setParamArraySimple(map, prefix + "Events.", this.Events);

    }
}

