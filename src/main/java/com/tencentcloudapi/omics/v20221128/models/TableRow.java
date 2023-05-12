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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableRow extends AbstractModel{

    /**
    * 表格行UUID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableRowUuid")
    @Expose
    private String TableRowUuid;

    /**
    * 表格行内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
     * Get 表格行UUID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableRowUuid 表格行UUID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableRowUuid() {
        return this.TableRowUuid;
    }

    /**
     * Set 表格行UUID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableRowUuid 表格行UUID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableRowUuid(String TableRowUuid) {
        this.TableRowUuid = TableRowUuid;
    }

    /**
     * Get 表格行内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 表格行内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set 表格行内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 表格行内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    public TableRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableRow(TableRow source) {
        if (source.TableRowUuid != null) {
            this.TableRowUuid = new String(source.TableRowUuid);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableRowUuid", this.TableRowUuid);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);

    }
}

