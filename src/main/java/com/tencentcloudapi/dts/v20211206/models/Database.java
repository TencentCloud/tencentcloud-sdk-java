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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Database extends AbstractModel {

    /**
    * 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 迁移或同步后的库名，默认与源库相同
    */
    @SerializedName("NewDbName")
    @Expose
    private String NewDbName;

    /**
    * DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 迁移或同步的 schema
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 迁移或同步后的 schema name
    */
    @SerializedName("NewSchemaName")
    @Expose
    private String NewSchemaName;

    /**
    * 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
    */
    @SerializedName("Tables")
    @Expose
    private Table [] Tables;

    /**
    * 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
    */
    @SerializedName("Views")
    @Expose
    private View [] Views;

    /**
    * 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * FunctionMode取值为Partial时需要填写
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * ProcedureMode取值为Partial时需要填写
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
    * 触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * 当TriggerMode为partial，指定要迁移的触发器名称
    */
    @SerializedName("Triggers")
    @Expose
    private String [] Triggers;

    /**
    * 事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
    */
    @SerializedName("EventMode")
    @Expose
    private String EventMode;

    /**
    * 当EventMode为partial，指定要迁移的事件名称
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
     * Get 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填 
     * @return DbName 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
     * @param DbName 需要迁移或同步的库名，当ObjectMode为Partial时，此项必填
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 迁移或同步后的库名，默认与源库相同 
     * @return NewDbName 迁移或同步后的库名，默认与源库相同
     */
    public String getNewDbName() {
        return this.NewDbName;
    }

    /**
     * Set 迁移或同步后的库名，默认与源库相同
     * @param NewDbName 迁移或同步后的库名，默认与源库相同
     */
    public void setNewDbName(String NewDbName) {
        this.NewDbName = NewDbName;
    }

    /**
     * Get DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。 
     * @return DbMode DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。
     * @param DbMode DB选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当Mode为Partial时，此项必填。注意，高级对象的同步不依赖此值，如果整库同步此处应该为All。
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 迁移或同步的 schema 
     * @return SchemaName 迁移或同步的 schema
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 迁移或同步的 schema
     * @param SchemaName 迁移或同步的 schema
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 迁移或同步后的 schema name 
     * @return NewSchemaName 迁移或同步后的 schema name
     */
    public String getNewSchemaName() {
        return this.NewSchemaName;
    }

    /**
     * Set 迁移或同步后的 schema name
     * @param NewSchemaName 迁移或同步后的 schema name
     */
    public void setNewSchemaName(String NewSchemaName) {
        this.NewSchemaName = NewSchemaName;
    }

    /**
     * Get 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。 
     * @return TableMode 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。
     * @param TableMode 表选择模式: All(为当前对象下的所有对象)，Partial(部分对象)，当DBMode为Partial时此项必填，如果整库同步此处应该为All。
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get 表图对象集合，当 TableMode 为 Partial 时，此项需要填写 
     * @return Tables 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
     */
    public Table [] getTables() {
        return this.Tables;
    }

    /**
     * Set 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
     * @param Tables 表图对象集合，当 TableMode 为 Partial 时，此项需要填写
     */
    public void setTables(Table [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。 
     * @return ViewMode 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。
     * @param ViewMode 视图选择模式: All 为当前对象下的所有视图对象,Partial 为部分视图对象，如果整库同步此处应该为All。
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写 
     * @return Views 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
     */
    public View [] getViews() {
        return this.Views;
    }

    /**
     * Set 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
     * @param Views 视图对象集合，当 ViewMode 为 Partial 时， 此项需要填写
     */
    public void setViews(View [] Views) {
        this.Views = Views;
    }

    /**
     * Get 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。 
     * @return FunctionMode 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
     * @param FunctionMode 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get FunctionMode取值为Partial时需要填写 
     * @return Functions FunctionMode取值为Partial时需要填写
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set FunctionMode取值为Partial时需要填写
     * @param Functions FunctionMode取值为Partial时需要填写
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。 
     * @return ProcedureMode 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
     * @param ProcedureMode 选择要同步的模式，Partial为部分，All为整选，如果整库同步此处应该为All。
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get ProcedureMode取值为Partial时需要填写 
     * @return Procedures ProcedureMode取值为Partial时需要填写
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set ProcedureMode取值为Partial时需要填写
     * @param Procedures ProcedureMode取值为Partial时需要填写
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get 触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。 
     * @return TriggerMode 触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set 触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
     * @param TriggerMode 触发器迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get 当TriggerMode为partial，指定要迁移的触发器名称 
     * @return Triggers 当TriggerMode为partial，指定要迁移的触发器名称
     */
    public String [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set 当TriggerMode为partial，指定要迁移的触发器名称
     * @param Triggers 当TriggerMode为partial，指定要迁移的触发器名称
     */
    public void setTriggers(String [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get 事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。 
     * @return EventMode 事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
     */
    public String getEventMode() {
        return this.EventMode;
    }

    /**
     * Set 事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
     * @param EventMode 事件迁移模式，All(为当前对象下的所有对象)，Partial(部分对象)，如果整库同步此处应该为All。数据同步暂不支持此高级对象。
     */
    public void setEventMode(String EventMode) {
        this.EventMode = EventMode;
    }

    /**
     * Get 当EventMode为partial，指定要迁移的事件名称 
     * @return Events 当EventMode为partial，指定要迁移的事件名称
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set 当EventMode为partial，指定要迁移的事件名称
     * @param Events 当EventMode为partial，指定要迁移的事件名称
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

