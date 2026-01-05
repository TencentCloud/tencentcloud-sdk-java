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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityRuleFieldConfig extends AbstractModel {

    /**
    * where变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhereConfig")
    @Expose
    private QualityFieldConfig [] WhereConfig;

    /**
    * 库表变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableConfig")
    @Expose
    private QualityTableConfig [] TableConfig;

    /**
     * Get where变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhereConfig where变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityFieldConfig [] getWhereConfig() {
        return this.WhereConfig;
    }

    /**
     * Set where变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhereConfig where变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhereConfig(QualityFieldConfig [] WhereConfig) {
        this.WhereConfig = WhereConfig;
    }

    /**
     * Get 库表变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableConfig 库表变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityTableConfig [] getTableConfig() {
        return this.TableConfig;
    }

    /**
     * Set 库表变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableConfig 库表变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableConfig(QualityTableConfig [] TableConfig) {
        this.TableConfig = TableConfig;
    }

    public QualityRuleFieldConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleFieldConfig(QualityRuleFieldConfig source) {
        if (source.WhereConfig != null) {
            this.WhereConfig = new QualityFieldConfig[source.WhereConfig.length];
            for (int i = 0; i < source.WhereConfig.length; i++) {
                this.WhereConfig[i] = new QualityFieldConfig(source.WhereConfig[i]);
            }
        }
        if (source.TableConfig != null) {
            this.TableConfig = new QualityTableConfig[source.TableConfig.length];
            for (int i = 0; i < source.TableConfig.length; i++) {
                this.TableConfig[i] = new QualityTableConfig(source.TableConfig[i]);
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

