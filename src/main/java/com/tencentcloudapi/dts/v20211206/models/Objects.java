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

public class Objects extends AbstractModel {

    /**
    * <p>同步对象类型 Partial(部分对象)</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>同步对象，当 Mode 为 Partial 时，不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Databases")
    @Expose
    private Database [] Databases;

    /**
    * <p>高级对象类型，如function、procedure。注意：如果要迁移同步高级对象，此配置中应该包含对应的高级对象类型。当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full</p>
    */
    @SerializedName("AdvancedObjects")
    @Expose
    private String [] AdvancedObjects;

    /**
    * <p>此字段已废弃。对于临时表的同步应该使用Objects.Databases[n].Tables[n].TmpTables传入。</p>
    */
    @SerializedName("OnlineDDL")
    @Expose
    private OnlineDDL OnlineDDL;

    /**
    * <p>库/表/视图级 DML/DDL 白名单</p>
    */
    @SerializedName("DatabasesOpFilter")
    @Expose
    private DBOpFilter [] DatabasesOpFilter;

    /**
     * Get <p>同步对象类型 Partial(部分对象)</p> 
     * @return Mode <p>同步对象类型 Partial(部分对象)</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>同步对象类型 Partial(部分对象)</p>
     * @param Mode <p>同步对象类型 Partial(部分对象)</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>同步对象，当 Mode 为 Partial 时，不为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Databases <p>同步对象，当 Mode 为 Partial 时，不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Database [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set <p>同步对象，当 Mode 为 Partial 时，不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Databases <p>同步对象，当 Mode 为 Partial 时，不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabases(Database [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get <p>高级对象类型，如function、procedure。注意：如果要迁移同步高级对象，此配置中应该包含对应的高级对象类型。当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full</p> 
     * @return AdvancedObjects <p>高级对象类型，如function、procedure。注意：如果要迁移同步高级对象，此配置中应该包含对应的高级对象类型。当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full</p>
     */
    public String [] getAdvancedObjects() {
        return this.AdvancedObjects;
    }

    /**
     * Set <p>高级对象类型，如function、procedure。注意：如果要迁移同步高级对象，此配置中应该包含对应的高级对象类型。当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full</p>
     * @param AdvancedObjects <p>高级对象类型，如function、procedure。注意：如果要迁移同步高级对象，此配置中应该包含对应的高级对象类型。当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full</p>
     */
    public void setAdvancedObjects(String [] AdvancedObjects) {
        this.AdvancedObjects = AdvancedObjects;
    }

    /**
     * Get <p>此字段已废弃。对于临时表的同步应该使用Objects.Databases[n].Tables[n].TmpTables传入。</p> 
     * @return OnlineDDL <p>此字段已废弃。对于临时表的同步应该使用Objects.Databases[n].Tables[n].TmpTables传入。</p>
     */
    public OnlineDDL getOnlineDDL() {
        return this.OnlineDDL;
    }

    /**
     * Set <p>此字段已废弃。对于临时表的同步应该使用Objects.Databases[n].Tables[n].TmpTables传入。</p>
     * @param OnlineDDL <p>此字段已废弃。对于临时表的同步应该使用Objects.Databases[n].Tables[n].TmpTables传入。</p>
     */
    public void setOnlineDDL(OnlineDDL OnlineDDL) {
        this.OnlineDDL = OnlineDDL;
    }

    /**
     * Get <p>库/表/视图级 DML/DDL 白名单</p> 
     * @return DatabasesOpFilter <p>库/表/视图级 DML/DDL 白名单</p>
     */
    public DBOpFilter [] getDatabasesOpFilter() {
        return this.DatabasesOpFilter;
    }

    /**
     * Set <p>库/表/视图级 DML/DDL 白名单</p>
     * @param DatabasesOpFilter <p>库/表/视图级 DML/DDL 白名单</p>
     */
    public void setDatabasesOpFilter(DBOpFilter [] DatabasesOpFilter) {
        this.DatabasesOpFilter = DatabasesOpFilter;
    }

    public Objects() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Objects(Objects source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Databases != null) {
            this.Databases = new Database[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new Database(source.Databases[i]);
            }
        }
        if (source.AdvancedObjects != null) {
            this.AdvancedObjects = new String[source.AdvancedObjects.length];
            for (int i = 0; i < source.AdvancedObjects.length; i++) {
                this.AdvancedObjects[i] = new String(source.AdvancedObjects[i]);
            }
        }
        if (source.OnlineDDL != null) {
            this.OnlineDDL = new OnlineDDL(source.OnlineDDL);
        }
        if (source.DatabasesOpFilter != null) {
            this.DatabasesOpFilter = new DBOpFilter[source.DatabasesOpFilter.length];
            for (int i = 0; i < source.DatabasesOpFilter.length; i++) {
                this.DatabasesOpFilter[i] = new DBOpFilter(source.DatabasesOpFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArraySimple(map, prefix + "AdvancedObjects.", this.AdvancedObjects);
        this.setParamObj(map, prefix + "OnlineDDL.", this.OnlineDDL);
        this.setParamArrayObj(map, prefix + "DatabasesOpFilter.", this.DatabasesOpFilter);

    }
}

