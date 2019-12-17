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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardAudioResult extends AbstractModel{

    /**
    * 返回的当前音频的统计信息。当进度为100时返回。
    */
    @SerializedName("AsrStat")
    @Expose
    private ASRStat AsrStat;

    /**
    * 返回当前音频流的详细信息，如果是流模式，返回的是对应流的详细信息，如果是 URL模式，返回的是查询的那一段seq对应的音频的详细信息。
    */
    @SerializedName("Texts")
    @Expose
    private WholeTextItem [] Texts;

    /**
    * 返回词汇库中的单词出现的详细时间信息。
    */
    @SerializedName("VocabAnalysisDetailInfo")
    @Expose
    private VocabDetailInfomation [] VocabAnalysisDetailInfo;

    /**
    * 返回词汇库中的单词出现的次数信息。
    */
    @SerializedName("VocabAnalysisStatInfo")
    @Expose
    private VocabStatInfomation [] VocabAnalysisStatInfo;

    /**
    * 状态描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 结果数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 返回的当前音频的统计信息。当进度为100时返回。 
     * @return AsrStat 返回的当前音频的统计信息。当进度为100时返回。
     */
    public ASRStat getAsrStat() {
        return this.AsrStat;
    }

    /**
     * Set 返回的当前音频的统计信息。当进度为100时返回。
     * @param AsrStat 返回的当前音频的统计信息。当进度为100时返回。
     */
    public void setAsrStat(ASRStat AsrStat) {
        this.AsrStat = AsrStat;
    }

    /**
     * Get 返回当前音频流的详细信息，如果是流模式，返回的是对应流的详细信息，如果是 URL模式，返回的是查询的那一段seq对应的音频的详细信息。 
     * @return Texts 返回当前音频流的详细信息，如果是流模式，返回的是对应流的详细信息，如果是 URL模式，返回的是查询的那一段seq对应的音频的详细信息。
     */
    public WholeTextItem [] getTexts() {
        return this.Texts;
    }

    /**
     * Set 返回当前音频流的详细信息，如果是流模式，返回的是对应流的详细信息，如果是 URL模式，返回的是查询的那一段seq对应的音频的详细信息。
     * @param Texts 返回当前音频流的详细信息，如果是流模式，返回的是对应流的详细信息，如果是 URL模式，返回的是查询的那一段seq对应的音频的详细信息。
     */
    public void setTexts(WholeTextItem [] Texts) {
        this.Texts = Texts;
    }

    /**
     * Get 返回词汇库中的单词出现的详细时间信息。 
     * @return VocabAnalysisDetailInfo 返回词汇库中的单词出现的详细时间信息。
     */
    public VocabDetailInfomation [] getVocabAnalysisDetailInfo() {
        return this.VocabAnalysisDetailInfo;
    }

    /**
     * Set 返回词汇库中的单词出现的详细时间信息。
     * @param VocabAnalysisDetailInfo 返回词汇库中的单词出现的详细时间信息。
     */
    public void setVocabAnalysisDetailInfo(VocabDetailInfomation [] VocabAnalysisDetailInfo) {
        this.VocabAnalysisDetailInfo = VocabAnalysisDetailInfo;
    }

    /**
     * Get 返回词汇库中的单词出现的次数信息。 
     * @return VocabAnalysisStatInfo 返回词汇库中的单词出现的次数信息。
     */
    public VocabStatInfomation [] getVocabAnalysisStatInfo() {
        return this.VocabAnalysisStatInfo;
    }

    /**
     * Set 返回词汇库中的单词出现的次数信息。
     * @param VocabAnalysisStatInfo 返回词汇库中的单词出现的次数信息。
     */
    public void setVocabAnalysisStatInfo(VocabStatInfomation [] VocabAnalysisStatInfo) {
        this.VocabAnalysisStatInfo = VocabAnalysisStatInfo;
    }

    /**
     * Get 状态描述 
     * @return Message 状态描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 状态描述
     * @param Message 状态描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 结果数量 
     * @return TotalCount 结果数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 结果数量
     * @param TotalCount 结果数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AsrStat.", this.AsrStat);
        this.setParamArrayObj(map, prefix + "Texts.", this.Texts);
        this.setParamArrayObj(map, prefix + "VocabAnalysisDetailInfo.", this.VocabAnalysisDetailInfo);
        this.setParamArrayObj(map, prefix + "VocabAnalysisStatInfo.", this.VocabAnalysisStatInfo);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

