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

public class DescribeConversationTaskResponse extends AbstractModel{

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
    * 整个音频流的全部文本
    */
    @SerializedName("AllTexts")
    @Expose
    private String AllTexts;

    /**
    * 音频任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 返回的当前处理进度。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 结果总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 整个音频流的全部文本 
     * @return AllTexts 整个音频流的全部文本
     */
    public String getAllTexts() {
        return this.AllTexts;
    }

    /**
     * Set 整个音频流的全部文本
     * @param AllTexts 整个音频流的全部文本
     */
    public void setAllTexts(String AllTexts) {
        this.AllTexts = AllTexts;
    }

    /**
     * Get 音频任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。 
     * @return JobId 音频任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 音频任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
     * @param JobId 音频任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 返回的当前处理进度。 
     * @return Progress 返回的当前处理进度。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 返回的当前处理进度。
     * @param Progress 返回的当前处理进度。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 结果总数 
     * @return TotalCount 结果总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 结果总数
     * @param TotalCount 结果总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AsrStat.", this.AsrStat);
        this.setParamArrayObj(map, prefix + "Texts.", this.Texts);
        this.setParamArrayObj(map, prefix + "VocabAnalysisDetailInfo.", this.VocabAnalysisDetailInfo);
        this.setParamArrayObj(map, prefix + "VocabAnalysisStatInfo.", this.VocabAnalysisStatInfo);
        this.setParamSimple(map, prefix + "AllTexts", this.AllTexts);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

