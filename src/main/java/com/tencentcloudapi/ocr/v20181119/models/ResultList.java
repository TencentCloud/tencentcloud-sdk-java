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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultList extends AbstractModel {

    /**
    * 题干
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Question")
    @Expose
    private Element [] Question;

    /**
    * 选项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Option")
    @Expose
    private Element [] Option;

    /**
    * 插图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Figure")
    @Expose
    private Element [] Figure;

    /**
    * 表格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private Element [] Table;

    /**
    * 答案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Answer")
    @Expose
    private Element [] Answer;

    /**
    * 解析
    */
    @SerializedName("Parse")
    @Expose
    private Element [] Parse;

    /**
    * 整题的坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coord")
    @Expose
    private Polygon [] Coord;

    /**
     * Get 题干
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Question 题干
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getQuestion() {
        return this.Question;
    }

    /**
     * Set 题干
注意：此字段可能返回 null，表示取不到有效值。
     * @param Question 题干
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestion(Element [] Question) {
        this.Question = Question;
    }

    /**
     * Get 选项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Option 选项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getOption() {
        return this.Option;
    }

    /**
     * Set 选项
注意：此字段可能返回 null，表示取不到有效值。
     * @param Option 选项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOption(Element [] Option) {
        this.Option = Option;
    }

    /**
     * Get 插图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Figure 插图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getFigure() {
        return this.Figure;
    }

    /**
     * Set 插图
注意：此字段可能返回 null，表示取不到有效值。
     * @param Figure 插图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFigure(Element [] Figure) {
        this.Figure = Figure;
    }

    /**
     * Get 表格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table 表格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getTable() {
        return this.Table;
    }

    /**
     * Set 表格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table 表格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(Element [] Table) {
        this.Table = Table;
    }

    /**
     * Get 答案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Answer 答案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Element [] getAnswer() {
        return this.Answer;
    }

    /**
     * Set 答案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Answer 答案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnswer(Element [] Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 解析 
     * @return Parse 解析
     */
    public Element [] getParse() {
        return this.Parse;
    }

    /**
     * Set 解析
     * @param Parse 解析
     */
    public void setParse(Element [] Parse) {
        this.Parse = Parse;
    }

    /**
     * Get 整题的坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coord 整题的坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Polygon [] getCoord() {
        return this.Coord;
    }

    /**
     * Set 整题的坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coord 整题的坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoord(Polygon [] Coord) {
        this.Coord = Coord;
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

    }
}

