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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CorrectData extends AbstractModel{

    /**
    * 总得分
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 各项得分详情
    */
    @SerializedName("ScoreCat")
    @Expose
    private ScoreCategory ScoreCat;

    /**
    * 综合评价
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 句子点评
    */
    @SerializedName("SentenceComments")
    @Expose
    private SentenceCom [] SentenceComments;

    /**
     * Get 总得分 
     * @return Score 总得分
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 总得分
     * @param Score 总得分
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 各项得分详情 
     * @return ScoreCat 各项得分详情
     */
    public ScoreCategory getScoreCat() {
        return this.ScoreCat;
    }

    /**
     * Set 各项得分详情
     * @param ScoreCat 各项得分详情
     */
    public void setScoreCat(ScoreCategory ScoreCat) {
        this.ScoreCat = ScoreCat;
    }

    /**
     * Get 综合评价 
     * @return Comment 综合评价
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 综合评价
     * @param Comment 综合评价
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 句子点评 
     * @return SentenceComments 句子点评
     */
    public SentenceCom [] getSentenceComments() {
        return this.SentenceComments;
    }

    /**
     * Set 句子点评
     * @param SentenceComments 句子点评
     */
    public void setSentenceComments(SentenceCom [] SentenceComments) {
        this.SentenceComments = SentenceComments;
    }

    public CorrectData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CorrectData(CorrectData source) {
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.ScoreCat != null) {
            this.ScoreCat = new ScoreCategory(source.ScoreCat);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.SentenceComments != null) {
            this.SentenceComments = new SentenceCom[source.SentenceComments.length];
            for (int i = 0; i < source.SentenceComments.length; i++) {
                this.SentenceComments[i] = new SentenceCom(source.SentenceComments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "ScoreCat.", this.ScoreCat);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "SentenceComments.", this.SentenceComments);

    }
}

