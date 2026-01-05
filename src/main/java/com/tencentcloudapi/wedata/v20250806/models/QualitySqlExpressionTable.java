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

public class QualitySqlExpressionTable extends AbstractModel {

    /**
    * sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableExpression")
    @Expose
    private String TableExpression;

    /**
    * sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnExpression")
    @Expose
    private String [] ColumnExpression;

    /**
     * Get sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableExpression sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableExpression() {
        return this.TableExpression;
    }

    /**
     * Set sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableExpression sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableExpression(String TableExpression) {
        this.TableExpression = TableExpression;
    }

    /**
     * Get sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnExpression sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColumnExpression() {
        return this.ColumnExpression;
    }

    /**
     * Set sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnExpression sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnExpression(String [] ColumnExpression) {
        this.ColumnExpression = ColumnExpression;
    }

    public QualitySqlExpressionTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualitySqlExpressionTable(QualitySqlExpressionTable source) {
        if (source.TableExpression != null) {
            this.TableExpression = new String(source.TableExpression);
        }
        if (source.ColumnExpression != null) {
            this.ColumnExpression = new String[source.ColumnExpression.length];
            for (int i = 0; i < source.ColumnExpression.length; i++) {
                this.ColumnExpression[i] = new String(source.ColumnExpression[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableExpression", this.TableExpression);
        this.setParamArraySimple(map, prefix + "ColumnExpression.", this.ColumnExpression);

    }
}

