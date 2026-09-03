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

public class ResultList extends AbstractModel {

    /**
    * <p>题干</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Question")
    @Expose
    private Element [] Question;

    /**
    * <p>选项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Option")
    @Expose
    private Element [] Option;

    /**
    * <p>插图</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Figure")
    @Expose
    private Element [] Figure;

    /**
    * <p>表格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private Element [] Table;

    /**
    * <p>答案</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Answer")
    @Expose
    private Element [] Answer;

    /**
    * <p>解析</p>
    */
    @SerializedName("Parse")
    @Expose
    private Element [] Parse;

    /**
    * <p>整题的坐标，多页单题跨页/单页单题跨栏场景下，存在一道题有多个坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coord")
    @Expose
    private Polygon [] Coord;

    /**
    * <p>多坐标返回，显示坐标所在页</p><p>默认值：[]</p>
    */
    @SerializedName("CoordPageIndex")
    @Expose
    private Long [] CoordPageIndex;

    /**
     * Get <p>题干</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Question <p>题干</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>题干</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Question <p>题干</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestion(Element [] Question) {
        this.Question = Question;
    }

    /**
     * Get <p>选项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Option <p>选项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getOption() {
        return this.Option;
    }

    /**
     * Set <p>选项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Option <p>选项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOption(Element [] Option) {
        this.Option = Option;
    }

    /**
     * Get <p>插图</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Figure <p>插图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getFigure() {
        return this.Figure;
    }

    /**
     * Set <p>插图</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Figure <p>插图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFigure(Element [] Figure) {
        this.Figure = Figure;
    }

    /**
     * Get <p>表格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table <p>表格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getTable() {
        return this.Table;
    }

    /**
     * Set <p>表格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table <p>表格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(Element [] Table) {
        this.Table = Table;
    }

    /**
     * Get <p>答案</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Answer <p>答案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>答案</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Answer <p>答案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnswer(Element [] Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>解析</p> 
     * @return Parse <p>解析</p>
     */
    public Element [] getParse() {
        return this.Parse;
    }

    /**
     * Set <p>解析</p>
     * @param Parse <p>解析</p>
     */
    public void setParse(Element [] Parse) {
        this.Parse = Parse;
    }

    /**
     * Get <p>整题的坐标，多页单题跨页/单页单题跨栏场景下，存在一道题有多个坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coord <p>整题的坐标，多页单题跨页/单页单题跨栏场景下，存在一道题有多个坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Polygon [] getCoord() {
        return this.Coord;
    }

    /**
     * Set <p>整题的坐标，多页单题跨页/单页单题跨栏场景下，存在一道题有多个坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coord <p>整题的坐标，多页单题跨页/单页单题跨栏场景下，存在一道题有多个坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoord(Polygon [] Coord) {
        this.Coord = Coord;
    }

    /**
     * Get <p>多坐标返回，显示坐标所在页</p><p>默认值：[]</p> 
     * @return CoordPageIndex <p>多坐标返回，显示坐标所在页</p><p>默认值：[]</p>
     */
    public Long [] getCoordPageIndex() {
        return this.CoordPageIndex;
    }

    /**
     * Set <p>多坐标返回，显示坐标所在页</p><p>默认值：[]</p>
     * @param CoordPageIndex <p>多坐标返回，显示坐标所在页</p><p>默认值：[]</p>
     */
    public void setCoordPageIndex(Long [] CoordPageIndex) {
        this.CoordPageIndex = CoordPageIndex;
    }

    public ResultList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultList(ResultList source) {
        if (source.Question != null) {
            this.Question = new Element[source.Question.length];
            for (int i = 0; i < source.Question.length; i++) {
                this.Question[i] = new Element(source.Question[i]);
            }
        }
        if (source.Option != null) {
            this.Option = new Element[source.Option.length];
            for (int i = 0; i < source.Option.length; i++) {
                this.Option[i] = new Element(source.Option[i]);
            }
        }
        if (source.Figure != null) {
            this.Figure = new Element[source.Figure.length];
            for (int i = 0; i < source.Figure.length; i++) {
                this.Figure[i] = new Element(source.Figure[i]);
            }
        }
        if (source.Table != null) {
            this.Table = new Element[source.Table.length];
            for (int i = 0; i < source.Table.length; i++) {
                this.Table[i] = new Element(source.Table[i]);
            }
        }
        if (source.Answer != null) {
            this.Answer = new Element[source.Answer.length];
            for (int i = 0; i < source.Answer.length; i++) {
                this.Answer[i] = new Element(source.Answer[i]);
            }
        }
        if (source.Parse != null) {
            this.Parse = new Element[source.Parse.length];
            for (int i = 0; i < source.Parse.length; i++) {
                this.Parse[i] = new Element(source.Parse[i]);
            }
        }
        if (source.Coord != null) {
            this.Coord = new Polygon[source.Coord.length];
            for (int i = 0; i < source.Coord.length; i++) {
                this.Coord[i] = new Polygon(source.Coord[i]);
            }
        }
        if (source.CoordPageIndex != null) {
            this.CoordPageIndex = new Long[source.CoordPageIndex.length];
            for (int i = 0; i < source.CoordPageIndex.length; i++) {
                this.CoordPageIndex[i] = new Long(source.CoordPageIndex[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Question.", this.Question);
        this.setParamArrayObj(map, prefix + "Option.", this.Option);
        this.setParamArrayObj(map, prefix + "Figure.", this.Figure);
        this.setParamArrayObj(map, prefix + "Table.", this.Table);
        this.setParamArrayObj(map, prefix + "Answer.", this.Answer);
        this.setParamArrayObj(map, prefix + "Parse.", this.Parse);
        this.setParamArrayObj(map, prefix + "Coord.", this.Coord);
        this.setParamArraySimple(map, prefix + "CoordPageIndex.", this.CoordPageIndex);

    }
}

