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

public class TableCell extends AbstractModel{

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
    * 单元格内识别出的字符串文本，若文本存在多行，以换行符"\n"隔开
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 单元格类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 单元格置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 单元格在图像中的四点坐标
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * 此字段为扩展字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 单元格文本属性
    */
    @SerializedName("Contents")
    @Expose
    private CellContent [] Contents;

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
     * Get 单元格内识别出的字符串文本，若文本存在多行，以换行符"\n"隔开 
     * @return Text 单元格内识别出的字符串文本，若文本存在多行，以换行符"\n"隔开
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 单元格内识别出的字符串文本，若文本存在多行，以换行符"\n"隔开
     * @param Text 单元格内识别出的字符串文本，若文本存在多行，以换行符"\n"隔开
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 单元格类型 
     * @return Type 单元格类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 单元格类型
     * @param Type 单元格类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 单元格置信度 
     * @return Confidence 单元格置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 单元格置信度
     * @param Confidence 单元格置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 单元格在图像中的四点坐标 
     * @return Polygon 单元格在图像中的四点坐标
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 单元格在图像中的四点坐标
     * @param Polygon 单元格在图像中的四点坐标
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 此字段为扩展字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedInfo 此字段为扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 此字段为扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedInfo 此字段为扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 单元格文本属性 
     * @return Contents 单元格文本属性
     */
    public CellContent [] getContents() {
        return this.Contents;
    }

    /**
     * Set 单元格文本属性
     * @param Contents 单元格文本属性
     */
    public void setContents(CellContent [] Contents) {
        this.Contents = Contents;
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
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);

    }
}

