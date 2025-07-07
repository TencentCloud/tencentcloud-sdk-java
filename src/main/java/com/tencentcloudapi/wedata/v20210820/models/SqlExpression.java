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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlExpression extends AbstractModel {

    /**
    * sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableExpressions")
    @Expose
    private SqlExpressionTable [] TableExpressions;

    /**
    * sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamExpressions")
    @Expose
    private String [] ParamExpressions;

    /**
     * Get sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableExpressions sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SqlExpressionTable [] getTableExpressions() {
        return this.TableExpressions;
    }

    /**
     * Set sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableExpressions sql表达式表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableExpressions(SqlExpressionTable [] TableExpressions) {
        this.TableExpressions = TableExpressions;
    }

    /**
     * Get sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamExpressions sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getParamExpressions() {
        return this.ParamExpressions;
    }

    /**
     * Set sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamExpressions sql表达式字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamExpressions(String [] ParamExpressions) {
        this.ParamExpressions = ParamExpressions;
    }

    public SqlExpression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlExpression(SqlExpression source) {
        if (source.TableExpressions != null) {
            this.TableExpressions = new SqlExpressionTable[source.TableExpressions.length];
            for (int i = 0; i < source.TableExpressions.length; i++) {
                this.TableExpressions[i] = new SqlExpressionTable(source.TableExpressions[i]);
            }
        }
        if (source.ParamExpressions != null) {
            this.ParamExpressions = new String[source.ParamExpressions.length];
            for (int i = 0; i < source.ParamExpressions.length; i++) {
                this.ParamExpressions[i] = new String(source.ParamExpressions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableExpressions.", this.TableExpressions);
        this.setParamArraySimple(map, prefix + "ParamExpressions.", this.ParamExpressions);

    }
}

