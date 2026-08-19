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

public class CompareObjectItem extends AbstractModel {

    /**
    * <p>数据库名</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>数据库选择模式: all 为当前对象下的所有对象,partial 为部分对象</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>schema名称</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>表选择模式: all 为当前对象下的所有表对象,partial 为部分表对象</p>
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * <p>用于一致性校验的表配置，当 TableMode 为 partial 时，需要填写</p>
    */
    @SerializedName("Tables")
    @Expose
    private CompareTableItem [] Tables;

    /**
    * <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象(一致性校验不校验视图，当前参数未启作用)</p>
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * <p>用于一致性校验的视图配置，当 ViewMode 为 partial 时， 需要填写(一致性校验不校验视图，当前参数未启作用)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Views")
    @Expose
    private CompareViewItem [] Views;

    /**
     * Get <p>数据库名</p> 
     * @return DbName <p>数据库名</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库名</p>
     * @param DbName <p>数据库名</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>数据库选择模式: all 为当前对象下的所有对象,partial 为部分对象</p> 
     * @return DbMode <p>数据库选择模式: all 为当前对象下的所有对象,partial 为部分对象</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>数据库选择模式: all 为当前对象下的所有对象,partial 为部分对象</p>
     * @param DbMode <p>数据库选择模式: all 为当前对象下的所有对象,partial 为部分对象</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>schema名称</p> 
     * @return SchemaName <p>schema名称</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema名称</p>
     * @param SchemaName <p>schema名称</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>表选择模式: all 为当前对象下的所有表对象,partial 为部分表对象</p> 
     * @return TableMode <p>表选择模式: all 为当前对象下的所有表对象,partial 为部分表对象</p>
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set <p>表选择模式: all 为当前对象下的所有表对象,partial 为部分表对象</p>
     * @param TableMode <p>表选择模式: all 为当前对象下的所有表对象,partial 为部分表对象</p>
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get <p>用于一致性校验的表配置，当 TableMode 为 partial 时，需要填写</p> 
     * @return Tables <p>用于一致性校验的表配置，当 TableMode 为 partial 时，需要填写</p>
     */
    public CompareTableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set <p>用于一致性校验的表配置，当 TableMode 为 partial 时，需要填写</p>
     * @param Tables <p>用于一致性校验的表配置，当 TableMode 为 partial 时，需要填写</p>
     */
    public void setTables(CompareTableItem [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象(一致性校验不校验视图，当前参数未启作用)</p> 
     * @return ViewMode <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象(一致性校验不校验视图，当前参数未启作用)</p>
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象(一致性校验不校验视图，当前参数未启作用)</p>
     * @param ViewMode <p>视图选择模式: all 为当前对象下的所有视图对象,partial 为部分视图对象(一致性校验不校验视图，当前参数未启作用)</p>
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get <p>用于一致性校验的视图配置，当 ViewMode 为 partial 时， 需要填写(一致性校验不校验视图，当前参数未启作用)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Views <p>用于一致性校验的视图配置，当 ViewMode 为 partial 时， 需要填写(一致性校验不校验视图，当前参数未启作用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareViewItem [] getViews() {
        return this.Views;
    }

    /**
     * Set <p>用于一致性校验的视图配置，当 ViewMode 为 partial 时， 需要填写(一致性校验不校验视图，当前参数未启作用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Views <p>用于一致性校验的视图配置，当 ViewMode 为 partial 时， 需要填写(一致性校验不校验视图，当前参数未启作用)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViews(CompareViewItem [] Views) {
        this.Views = Views;
    }

    public CompareObjectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareObjectItem(CompareObjectItem source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
        if (source.Tables != null) {
            this.Tables = new CompareTableItem[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new CompareTableItem(source.Tables[i]);
            }
        }
        if (source.ViewMode != null) {
            this.ViewMode = new String(source.ViewMode);
        }
        if (source.Views != null) {
            this.Views = new CompareViewItem[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new CompareViewItem(source.Views[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);

    }
}

