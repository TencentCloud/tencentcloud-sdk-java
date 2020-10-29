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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableDetectInfo extends AbstractModel{

    /**
    * 单元格内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cells")
    @Expose
    private TableCell [] Cells;

    /**
    * 表格标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Titles")
    @Expose
    private TableTitle [] Titles;

    /**
     * Get 单元格内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cells 单元格内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableCell [] getCells() {
        return this.Cells;
    }

    /**
     * Set 单元格内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cells 单元格内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCells(TableCell [] Cells) {
        this.Cells = Cells;
    }

    /**
     * Get 表格标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Titles 表格标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableTitle [] getTitles() {
        return this.Titles;
    }

    /**
     * Set 表格标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Titles 表格标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitles(TableTitle [] Titles) {
        this.Titles = Titles;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Cells.", this.Cells);
        this.setParamArrayObj(map, prefix + "Titles.", this.Titles);

    }
}

