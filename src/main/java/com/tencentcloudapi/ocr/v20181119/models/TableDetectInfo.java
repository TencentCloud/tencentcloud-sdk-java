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
    * 图像中的文本块类型，0 为非表格文本，
1 为有线表格，2 为无线表格
（接口暂不支持日文无线表格识别，若传入日文无线表格，返回0）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 表格主体四个顶点坐标（依次为左上角，
右上角，右下角，左下角）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableCoordPoint")
    @Expose
    private Coord [] TableCoordPoint;

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
     * Get 图像中的文本块类型，0 为非表格文本，
1 为有线表格，2 为无线表格
（接口暂不支持日文无线表格识别，若传入日文无线表格，返回0）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 图像中的文本块类型，0 为非表格文本，
1 为有线表格，2 为无线表格
（接口暂不支持日文无线表格识别，若传入日文无线表格，返回0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 图像中的文本块类型，0 为非表格文本，
1 为有线表格，2 为无线表格
（接口暂不支持日文无线表格识别，若传入日文无线表格，返回0）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 图像中的文本块类型，0 为非表格文本，
1 为有线表格，2 为无线表格
（接口暂不支持日文无线表格识别，若传入日文无线表格，返回0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 表格主体四个顶点坐标（依次为左上角，
右上角，右下角，左下角）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableCoordPoint 表格主体四个顶点坐标（依次为左上角，
右上角，右下角，左下角）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getTableCoordPoint() {
        return this.TableCoordPoint;
    }

    /**
     * Set 表格主体四个顶点坐标（依次为左上角，
右上角，右下角，左下角）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableCoordPoint 表格主体四个顶点坐标（依次为左上角，
右上角，右下角，左下角）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableCoordPoint(Coord [] TableCoordPoint) {
        this.TableCoordPoint = TableCoordPoint;
    }

    public TableDetectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableDetectInfo(TableDetectInfo source) {
        if (source.Cells != null) {
            this.Cells = new TableCell[source.Cells.length];
            for (int i = 0; i < source.Cells.length; i++) {
                this.Cells[i] = new TableCell(source.Cells[i]);
            }
        }
        if (source.Titles != null) {
            this.Titles = new TableTitle[source.Titles.length];
            for (int i = 0; i < source.Titles.length; i++) {
                this.Titles[i] = new TableTitle(source.Titles[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TableCoordPoint != null) {
            this.TableCoordPoint = new Coord[source.TableCoordPoint.length];
            for (int i = 0; i < source.TableCoordPoint.length; i++) {
                this.TableCoordPoint[i] = new Coord(source.TableCoordPoint[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Cells.", this.Cells);
        this.setParamArrayObj(map, prefix + "Titles.", this.Titles);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "TableCoordPoint.", this.TableCoordPoint);

    }
}

