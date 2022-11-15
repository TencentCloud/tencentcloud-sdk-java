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

public class RuleFieldConfig extends AbstractModel{

    /**
    * where变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhereConfig")
    @Expose
    private FieldConfig [] WhereConfig;

    /**
    * 库表变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableConfig")
    @Expose
    private TableConfig [] TableConfig;

    /**
     * Get where变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhereConfig where变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldConfig [] getWhereConfig() {
        return this.WhereConfig;
    }

    /**
     * Set where变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhereConfig where变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhereConfig(FieldConfig [] WhereConfig) {
        this.WhereConfig = WhereConfig;
    }

    /**
     * Get 库表变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableConfig 库表变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableConfig [] getTableConfig() {
        return this.TableConfig;
    }

    /**
     * Set 库表变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableConfig 库表变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableConfig(TableConfig [] TableConfig) {
        this.TableConfig = TableConfig;
    }

    public RuleFieldConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleFieldConfig(RuleFieldConfig source) {
        if (source.WhereConfig != null) {
            this.WhereConfig = new FieldConfig[source.WhereConfig.length];
            for (int i = 0; i < source.WhereConfig.length; i++) {
                this.WhereConfig[i] = new FieldConfig(source.WhereConfig[i]);
            }
        }
        if (source.TableConfig != null) {
            this.TableConfig = new TableConfig[source.TableConfig.length];
            for (int i = 0; i < source.TableConfig.length; i++) {
                this.TableConfig[i] = new TableConfig(source.TableConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WhereConfig.", this.WhereConfig);
        this.setParamArrayObj(map, prefix + "TableConfig.", this.TableConfig);

    }
}

