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
    * <p>单题跨栏/跨页场景下：配合CoordPageIndex一起使用，支持多坐标显示在不同页，按顺序对齐</p><p>默认值：[]</p>
    */
    @SerializedName("CoordPageIndex")
    @Expose
    private Long [] CoordPageIndex;

    /**
    * <p>【批改 API 专属特性】返回步骤批改场景下的正确答案内容</p>
    */
    @SerializedName("RightAnswer")
    @Expose
    private String RightAnswer;

    /**
    * <p>学科（如语文、数学、英语）</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * <p>返回题目的知识点内容</p>
    */
    @SerializedName("KnowledgePoints")
    @Expose
    private String [] KnowledgePoints;

    /**
    * <p>【批改 API 专属特性】<br>当ModelType= yuanbao_correction_model，通过该字段返回题目维度的答案解析<br>当ModelType= youtu_correction_model，该字段返回空，通过AnswerElement. AnswerAnalysis返回答案维度答案解析</p>
    */
    @SerializedName("AnswerAnalysis")
    @Expose
    private String AnswerAnalysis;

    /**
    * <p>年级：小学/初中/高中</p>
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

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
     * Get <p>单题跨栏/跨页场景下：配合CoordPageIndex一起使用，支持多坐标显示在不同页，按顺序对齐</p><p>默认值：[]</p> 
     * @return CoordPageIndex <p>单题跨栏/跨页场景下：配合CoordPageIndex一起使用，支持多坐标显示在不同页，按顺序对齐</p><p>默认值：[]</p>
     */
    public Long [] getCoordPageIndex() {
        return this.CoordPageIndex;
    }

    /**
     * Set <p>单题跨栏/跨页场景下：配合CoordPageIndex一起使用，支持多坐标显示在不同页，按顺序对齐</p><p>默认值：[]</p>
     * @param CoordPageIndex <p>单题跨栏/跨页场景下：配合CoordPageIndex一起使用，支持多坐标显示在不同页，按顺序对齐</p><p>默认值：[]</p>
     */
    public void setCoordPageIndex(Long [] CoordPageIndex) {
        this.CoordPageIndex = CoordPageIndex;
    }

    /**
     * Get <p>【批改 API 专属特性】返回步骤批改场景下的正确答案内容</p> 
     * @return RightAnswer <p>【批改 API 专属特性】返回步骤批改场景下的正确答案内容</p>
     */
    public String getRightAnswer() {
        return this.RightAnswer;
    }

    /**
     * Set <p>【批改 API 专属特性】返回步骤批改场景下的正确答案内容</p>
     * @param RightAnswer <p>【批改 API 专属特性】返回步骤批改场景下的正确答案内容</p>
     */
    public void setRightAnswer(String RightAnswer) {
        this.RightAnswer = RightAnswer;
    }

    /**
     * Get <p>学科（如语文、数学、英语）</p> 
     * @return Subject <p>学科（如语文、数学、英语）</p>
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set <p>学科（如语文、数学、英语）</p>
     * @param Subject <p>学科（如语文、数学、英语）</p>
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get <p>返回题目的知识点内容</p> 
     * @return KnowledgePoints <p>返回题目的知识点内容</p>
     */
    public String [] getKnowledgePoints() {
        return this.KnowledgePoints;
    }

    /**
     * Set <p>返回题目的知识点内容</p>
     * @param KnowledgePoints <p>返回题目的知识点内容</p>
     */
    public void setKnowledgePoints(String [] KnowledgePoints) {
        this.KnowledgePoints = KnowledgePoints;
    }

    /**
     * Get <p>【批改 API 专属特性】<br>当ModelType= yuanbao_correction_model，通过该字段返回题目维度的答案解析<br>当ModelType= youtu_correction_model，该字段返回空，通过AnswerElement. AnswerAnalysis返回答案维度答案解析</p> 
     * @return AnswerAnalysis <p>【批改 API 专属特性】<br>当ModelType= yuanbao_correction_model，通过该字段返回题目维度的答案解析<br>当ModelType= youtu_correction_model，该字段返回空，通过AnswerElement. AnswerAnalysis返回答案维度答案解析</p>
     */
    public String getAnswerAnalysis() {
        return this.AnswerAnalysis;
    }

    /**
     * Set <p>【批改 API 专属特性】<br>当ModelType= yuanbao_correction_model，通过该字段返回题目维度的答案解析<br>当ModelType= youtu_correction_model，该字段返回空，通过AnswerElement. AnswerAnalysis返回答案维度答案解析</p>
     * @param AnswerAnalysis <p>【批改 API 专属特性】<br>当ModelType= yuanbao_correction_model，通过该字段返回题目维度的答案解析<br>当ModelType= youtu_correction_model，该字段返回空，通过AnswerElement. AnswerAnalysis返回答案维度答案解析</p>
     */
    public void setAnswerAnalysis(String AnswerAnalysis) {
        this.AnswerAnalysis = AnswerAnalysis;
    }

    /**
     * Get <p>年级：小学/初中/高中</p> 
     * @return Grade <p>年级：小学/初中/高中</p>
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set <p>年级：小学/初中/高中</p>
     * @param Grade <p>年级：小学/初中/高中</p>
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
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
        if (source.RightAnswer != null) {
            this.RightAnswer = new String(source.RightAnswer);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.KnowledgePoints != null) {
            this.KnowledgePoints = new String[source.KnowledgePoints.length];
            for (int i = 0; i < source.KnowledgePoints.length; i++) {
                this.KnowledgePoints[i] = new String(source.KnowledgePoints[i]);
            }
        }
        if (source.AnswerAnalysis != null) {
            this.AnswerAnalysis = new String(source.AnswerAnalysis);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
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
        this.setParamSimple(map, prefix + "RightAnswer", this.RightAnswer);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamArraySimple(map, prefix + "KnowledgePoints.", this.KnowledgePoints);
        this.setParamSimple(map, prefix + "AnswerAnalysis", this.AnswerAnalysis);
        this.setParamSimple(map, prefix + "Grade", this.Grade);

    }
}

