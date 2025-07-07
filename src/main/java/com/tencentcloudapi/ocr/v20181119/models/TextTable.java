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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTable extends AbstractModel {

    /**
    * 单元格左上角的列索引
    */
    @SerializedName("ColTl")
    @Expose
    private Long ColTl;

    /**
    * 单元格左上角的行索引
    */
    @SerializedName("RowTl")
    @Expose
    private Long RowTl;

    /**
    * 单元格右下角的列索引
    */
    @SerializedName("ColBr")
    @Expose
    private Long ColBr;

    /**
    * 单元格右下角的行索引
    */
    @SerializedName("RowBr")
    @Expose
    private Long RowBr;

    /**
    * 单元格文字
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 置信度 0 ~100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 文本行坐标，以四个顶点坐标表示
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * 此字段为扩展字段
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
     * Get 单元格左上角的列索引 
     * @return ColTl 单元格左上角的列索引
     */
    public Long getColTl() {
        return this.ColTl;
    }

    /**
     * Set 单元格左上角的列索引
     * @param ColTl 单元格左上角的列索引
     */
    public void setColTl(Long ColTl) {
        this.ColTl = ColTl;
    }

    /**
     * Get 单元格左上角的行索引 
     * @return RowTl 单元格左上角的行索引
     */
    public Long getRowTl() {
        return this.RowTl;
    }

    /**
     * Set 单元格左上角的行索引
     * @param RowTl 单元格左上角的行索引
     */
    public void setRowTl(Long RowTl) {
        this.RowTl = RowTl;
    }

    /**
     * Get 单元格右下角的列索引 
     * @return ColBr 单元格右下角的列索引
     */
    public Long getColBr() {
        return this.ColBr;
    }

    /**
     * Set 单元格右下角的列索引
     * @param ColBr 单元格右下角的列索引
     */
    public void setColBr(Long ColBr) {
        this.ColBr = ColBr;
    }

    /**
     * Get 单元格右下角的行索引 
     * @return RowBr 单元格右下角的行索引
     */
    public Long getRowBr() {
        return this.RowBr;
    }

    /**
     * Set 单元格右下角的行索引
     * @param RowBr 单元格右下角的行索引
     */
    public void setRowBr(Long RowBr) {
        this.RowBr = RowBr;
    }

    /**
     * Get 单元格文字 
     * @return Text 单元格文字
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 单元格文字
     * @param Text 单元格文字
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种 
     * @return Type 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
     * @param Type 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 置信度 0 ~100 
     * @return Confidence 置信度 0 ~100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度 0 ~100
     * @param Confidence 置信度 0 ~100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 文本行坐标，以四个顶点坐标表示 
     * @return Polygon 文本行坐标，以四个顶点坐标表示
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 文本行坐标，以四个顶点坐标表示
     * @param Polygon 文本行坐标，以四个顶点坐标表示
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 此字段为扩展字段 
     * @return AdvancedInfo 此字段为扩展字段
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 此字段为扩展字段
     * @param AdvancedInfo 此字段为扩展字段
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    public TextTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTable(TextTable source) {
        if (source.ColTl != null) {
            this.ColTl = new Long(source.ColTl);
        }
        if (source.RowTl != null) {
            this.RowTl = new Long(source.RowTl);
        }
        if (source.ColBr != null) {
            this.ColBr = new Long(source.ColBr);
        }
        if (source.RowBr != null) {
            this.RowBr = new Long(source.RowBr);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Polygon != null) {
            this.Polygon = new Coord[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Coord(source.Polygon[i]);
            }
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColTl", this.ColTl);
        this.setParamSimple(map, prefix + "RowTl", this.RowTl);
        this.setParamSimple(map, prefix + "ColBr", this.ColBr);
        this.setParamSimple(map, prefix + "RowBr", this.RowBr);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);

    }
}

