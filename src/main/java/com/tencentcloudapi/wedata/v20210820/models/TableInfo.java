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

public class TableInfo extends AbstractModel{

    /**
    * 表Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 表Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

