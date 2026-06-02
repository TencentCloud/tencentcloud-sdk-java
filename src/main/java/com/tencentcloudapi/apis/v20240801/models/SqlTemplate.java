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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlTemplate extends AbstractModel {

    /**
    * <p>配置方式  script  脚本 wizard 向导</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbConfigMode")
    @Expose
    private String DbConfigMode;

    /**
    * <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceID")
    @Expose
    private String DataSourceID;

    /**
    * <p>Sql代码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>向导模式配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WizardConfig")
    @Expose
    private WizardConfig WizardConfig;

    /**
     * Get <p>配置方式  script  脚本 wizard 向导</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbConfigMode <p>配置方式  script  脚本 wizard 向导</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbConfigMode() {
        return this.DbConfigMode;
    }

    /**
     * Set <p>配置方式  script  脚本 wizard 向导</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbConfigMode <p>配置方式  script  脚本 wizard 向导</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbConfigMode(String DbConfigMode) {
        this.DbConfigMode = DbConfigMode;
    }

    /**
     * Get <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceID <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceID() {
        return this.DataSourceID;
    }

    /**
     * Set <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceID <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceID(String DataSourceID) {
        this.DataSourceID = DataSourceID;
    }

    /**
     * Get <p>Sql代码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sql <p>Sql代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>Sql代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sql <p>Sql代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>向导模式配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WizardConfig <p>向导模式配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WizardConfig getWizardConfig() {
        return this.WizardConfig;
    }

    /**
     * Set <p>向导模式配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WizardConfig <p>向导模式配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWizardConfig(WizardConfig WizardConfig) {
        this.WizardConfig = WizardConfig;
    }

    public SqlTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlTemplate(SqlTemplate source) {
        if (source.DbConfigMode != null) {
            this.DbConfigMode = new String(source.DbConfigMode);
        }
        if (source.DataSourceID != null) {
            this.DataSourceID = new String(source.DataSourceID);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.WizardConfig != null) {
            this.WizardConfig = new WizardConfig(source.WizardConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbConfigMode", this.DbConfigMode);
        this.setParamSimple(map, prefix + "DataSourceID", this.DataSourceID);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamObj(map, prefix + "WizardConfig.", this.WizardConfig);

    }
}

