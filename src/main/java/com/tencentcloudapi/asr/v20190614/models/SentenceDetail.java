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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceDetail extends AbstractModel{

    /**
    * 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalSentence")
    @Expose
    private String FinalSentence;

    /**
    * 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SliceSentence")
    @Expose
    private String SliceSentence;

    /**
    * 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartMs")
    @Expose
    private Long StartMs;

    /**
    * 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordsNum")
    @Expose
    private Long WordsNum;

    /**
    * 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Words")
    @Expose
    private SentenceWords [] Words;

    /**
     * Get 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalSentence 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinalSentence() {
        return this.FinalSentence;
    }

    /**
     * Set 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalSentence 单句最终识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalSentence(String FinalSentence) {
        this.FinalSentence = FinalSentence;
    }

    /**
     * Get 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SliceSentence 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSliceSentence() {
        return this.SliceSentence;
    }

    /**
     * Set 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
     * @param SliceSentence 单句中间识别结果，使用空格拆分为多个词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSliceSentence(String SliceSentence) {
        this.SliceSentence = SliceSentence;
    }

    /**
     * Get 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartMs 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartMs() {
        return this.StartMs;
    }

    /**
     * Set 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartMs 单句开始时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartMs(Long StartMs) {
        this.StartMs = StartMs;
    }

    /**
     * Get 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndMs 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndMs 单句结束时间（毫秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordsNum 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWordsNum() {
        return this.WordsNum;
    }

    /**
     * Set 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordsNum 单句中词个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordsNum(Long WordsNum) {
        this.WordsNum = WordsNum;
    }

    /**
     * Get 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Words 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentenceWords [] getWords() {
        return this.Words;
    }

    /**
     * Set 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Words 单句中词详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWords(SentenceWords [] Words) {
        this.Words = Words;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinalSentence", this.FinalSentence);
        this.setParamSimple(map, prefix + "SliceSentence", this.SliceSentence);
        this.setParamSimple(map, prefix + "StartMs", this.StartMs);
        this.setParamSimple(map, prefix + "EndMs", this.EndMs);
        this.setParamSimple(map, prefix + "WordsNum", this.WordsNum);
        this.setParamArrayObj(map, prefix + "Words.", this.Words);

    }
}

