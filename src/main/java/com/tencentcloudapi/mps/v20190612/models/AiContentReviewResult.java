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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiContentReviewResult extends AbstractModel{

    /**
    * 任务的类型，可以取的值有：
<li>Porn：图片鉴黄</li>
<li>Terrorism：图片鉴恐</li>
<li>Political：图片鉴政</li>
<li>Porn.Asr：Asr 文字鉴黄</li>
<li>Porn.Ocr：Ocr 文字鉴黄</li>
<li>Political.Asr：Asr 文字鉴政</li>
<li>Political.Ocr：Ocr 文字鉴政</li>
<li>Terrorism.Ocr：Ocr 文字鉴恐</li>
<li>Prohibited.Asr：Asr 文字鉴违禁</li>
<li>Prohibited.Ocr：Ocr 文字鉴违禁</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 采样频率，即对视频每秒截取进行审核的帧数。
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * 审核的视频时长，单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 视频内容审核智能画面鉴黄任务的查询结果，当任务类型为 Porn 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PornTask")
    @Expose
    private AiReviewTaskPornResult PornTask;

    /**
    * 视频内容审核智能画面鉴恐任务的查询结果，当任务类型为 Terrorism 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerrorismTask")
    @Expose
    private AiReviewTaskTerrorismResult TerrorismTask;

    /**
    * 视频内容审核智能画面鉴政任务的查询结果，当任务类型为 Political 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoliticalTask")
    @Expose
    private AiReviewTaskPoliticalResult PoliticalTask;

    /**
    * 视频内容审核 Asr 文字鉴黄任务的查询结果，当任务类型为 Porn.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PornAsrTask")
    @Expose
    private AiReviewTaskPornAsrResult PornAsrTask;

    /**
    * 视频内容审核 Ocr 文字鉴黄任务的查询结果，当任务类型为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PornOcrTask")
    @Expose
    private AiReviewTaskPornOcrResult PornOcrTask;

    /**
    * 视频内容审核 Asr 文字鉴政任务的查询结果，当任务类型为 Political.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoliticalAsrTask")
    @Expose
    private AiReviewTaskPoliticalAsrResult PoliticalAsrTask;

    /**
    * 视频内容审核 Ocr 文字鉴政任务的查询结果，当任务类型为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoliticalOcrTask")
    @Expose
    private AiReviewTaskPoliticalOcrResult PoliticalOcrTask;

    /**
    * 视频内容审核 Ocr 文字鉴恐任务的查询结果，当任务类型为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerrorismOcrTask")
    @Expose
    private AiReviewTaskTerrorismOcrResult TerrorismOcrTask;

    /**
    * 视频内容审核 Asr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProhibitedAsrTask")
    @Expose
    private AiReviewTaskProhibitedAsrResult ProhibitedAsrTask;

    /**
    * 视频内容审核 Ocr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProhibitedOcrTask")
    @Expose
    private AiReviewTaskProhibitedOcrResult ProhibitedOcrTask;

    /**
     * Get 任务的类型，可以取的值有：
<li>Porn：图片鉴黄</li>
<li>Terrorism：图片鉴恐</li>
<li>Political：图片鉴政</li>
<li>Porn.Asr：Asr 文字鉴黄</li>
<li>Porn.Ocr：Ocr 文字鉴黄</li>
<li>Political.Asr：Asr 文字鉴政</li>
<li>Political.Ocr：Ocr 文字鉴政</li>
<li>Terrorism.Ocr：Ocr 文字鉴恐</li>
<li>Prohibited.Asr：Asr 文字鉴违禁</li>
<li>Prohibited.Ocr：Ocr 文字鉴违禁</li> 
     * @return Type 任务的类型，可以取的值有：
<li>Porn：图片鉴黄</li>
<li>Terrorism：图片鉴恐</li>
<li>Political：图片鉴政</li>
<li>Porn.Asr：Asr 文字鉴黄</li>
<li>Porn.Ocr：Ocr 文字鉴黄</li>
<li>Political.Asr：Asr 文字鉴政</li>
<li>Political.Ocr：Ocr 文字鉴政</li>
<li>Terrorism.Ocr：Ocr 文字鉴恐</li>
<li>Prohibited.Asr：Asr 文字鉴违禁</li>
<li>Prohibited.Ocr：Ocr 文字鉴违禁</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务的类型，可以取的值有：
<li>Porn：图片鉴黄</li>
<li>Terrorism：图片鉴恐</li>
<li>Political：图片鉴政</li>
<li>Porn.Asr：Asr 文字鉴黄</li>
<li>Porn.Ocr：Ocr 文字鉴黄</li>
<li>Political.Asr：Asr 文字鉴政</li>
<li>Political.Ocr：Ocr 文字鉴政</li>
<li>Terrorism.Ocr：Ocr 文字鉴恐</li>
<li>Prohibited.Asr：Asr 文字鉴违禁</li>
<li>Prohibited.Ocr：Ocr 文字鉴违禁</li>
     * @param Type 任务的类型，可以取的值有：
<li>Porn：图片鉴黄</li>
<li>Terrorism：图片鉴恐</li>
<li>Political：图片鉴政</li>
<li>Porn.Asr：Asr 文字鉴黄</li>
<li>Porn.Ocr：Ocr 文字鉴黄</li>
<li>Political.Asr：Asr 文字鉴政</li>
<li>Political.Ocr：Ocr 文字鉴政</li>
<li>Terrorism.Ocr：Ocr 文字鉴恐</li>
<li>Prohibited.Asr：Asr 文字鉴违禁</li>
<li>Prohibited.Ocr：Ocr 文字鉴违禁</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 采样频率，即对视频每秒截取进行审核的帧数。 
     * @return SampleRate 采样频率，即对视频每秒截取进行审核的帧数。
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 采样频率，即对视频每秒截取进行审核的帧数。
     * @param SampleRate 采样频率，即对视频每秒截取进行审核的帧数。
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 审核的视频时长，单位：秒。 
     * @return Duration 审核的视频时长，单位：秒。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 审核的视频时长，单位：秒。
     * @param Duration 审核的视频时长，单位：秒。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 视频内容审核智能画面鉴黄任务的查询结果，当任务类型为 Porn 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PornTask 视频内容审核智能画面鉴黄任务的查询结果，当任务类型为 Porn 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskPornResult getPornTask() {
        return this.PornTask;
    }

    /**
     * Set 视频内容审核智能画面鉴黄任务的查询结果，当任务类型为 Porn 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PornTask 视频内容审核智能画面鉴黄任务的查询结果，当任务类型为 Porn 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPornTask(AiReviewTaskPornResult PornTask) {
        this.PornTask = PornTask;
    }

    /**
     * Get 视频内容审核智能画面鉴恐任务的查询结果，当任务类型为 Terrorism 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerrorismTask 视频内容审核智能画面鉴恐任务的查询结果，当任务类型为 Terrorism 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskTerrorismResult getTerrorismTask() {
        return this.TerrorismTask;
    }

    /**
     * Set 视频内容审核智能画面鉴恐任务的查询结果，当任务类型为 Terrorism 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerrorismTask 视频内容审核智能画面鉴恐任务的查询结果，当任务类型为 Terrorism 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerrorismTask(AiReviewTaskTerrorismResult TerrorismTask) {
        this.TerrorismTask = TerrorismTask;
    }

    /**
     * Get 视频内容审核智能画面鉴政任务的查询结果，当任务类型为 Political 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoliticalTask 视频内容审核智能画面鉴政任务的查询结果，当任务类型为 Political 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskPoliticalResult getPoliticalTask() {
        return this.PoliticalTask;
    }

    /**
     * Set 视频内容审核智能画面鉴政任务的查询结果，当任务类型为 Political 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoliticalTask 视频内容审核智能画面鉴政任务的查询结果，当任务类型为 Political 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoliticalTask(AiReviewTaskPoliticalResult PoliticalTask) {
        this.PoliticalTask = PoliticalTask;
    }

    /**
     * Get 视频内容审核 Asr 文字鉴黄任务的查询结果，当任务类型为 Porn.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PornAsrTask 视频内容审核 Asr 文字鉴黄任务的查询结果，当任务类型为 Porn.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskPornAsrResult getPornAsrTask() {
        return this.PornAsrTask;
    }

    /**
     * Set 视频内容审核 Asr 文字鉴黄任务的查询结果，当任务类型为 Porn.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PornAsrTask 视频内容审核 Asr 文字鉴黄任务的查询结果，当任务类型为 Porn.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPornAsrTask(AiReviewTaskPornAsrResult PornAsrTask) {
        this.PornAsrTask = PornAsrTask;
    }

    /**
     * Get 视频内容审核 Ocr 文字鉴黄任务的查询结果，当任务类型为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PornOcrTask 视频内容审核 Ocr 文字鉴黄任务的查询结果，当任务类型为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskPornOcrResult getPornOcrTask() {
        return this.PornOcrTask;
    }

    /**
     * Set 视频内容审核 Ocr 文字鉴黄任务的查询结果，当任务类型为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PornOcrTask 视频内容审核 Ocr 文字鉴黄任务的查询结果，当任务类型为 Porn.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPornOcrTask(AiReviewTaskPornOcrResult PornOcrTask) {
        this.PornOcrTask = PornOcrTask;
    }

    /**
     * Get 视频内容审核 Asr 文字鉴政任务的查询结果，当任务类型为 Political.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoliticalAsrTask 视频内容审核 Asr 文字鉴政任务的查询结果，当任务类型为 Political.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskPoliticalAsrResult getPoliticalAsrTask() {
        return this.PoliticalAsrTask;
    }

    /**
     * Set 视频内容审核 Asr 文字鉴政任务的查询结果，当任务类型为 Political.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoliticalAsrTask 视频内容审核 Asr 文字鉴政任务的查询结果，当任务类型为 Political.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoliticalAsrTask(AiReviewTaskPoliticalAsrResult PoliticalAsrTask) {
        this.PoliticalAsrTask = PoliticalAsrTask;
    }

    /**
     * Get 视频内容审核 Ocr 文字鉴政任务的查询结果，当任务类型为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoliticalOcrTask 视频内容审核 Ocr 文字鉴政任务的查询结果，当任务类型为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskPoliticalOcrResult getPoliticalOcrTask() {
        return this.PoliticalOcrTask;
    }

    /**
     * Set 视频内容审核 Ocr 文字鉴政任务的查询结果，当任务类型为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoliticalOcrTask 视频内容审核 Ocr 文字鉴政任务的查询结果，当任务类型为 Political.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoliticalOcrTask(AiReviewTaskPoliticalOcrResult PoliticalOcrTask) {
        this.PoliticalOcrTask = PoliticalOcrTask;
    }

    /**
     * Get 视频内容审核 Ocr 文字鉴恐任务的查询结果，当任务类型为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerrorismOcrTask 视频内容审核 Ocr 文字鉴恐任务的查询结果，当任务类型为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskTerrorismOcrResult getTerrorismOcrTask() {
        return this.TerrorismOcrTask;
    }

    /**
     * Set 视频内容审核 Ocr 文字鉴恐任务的查询结果，当任务类型为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerrorismOcrTask 视频内容审核 Ocr 文字鉴恐任务的查询结果，当任务类型为 Terrorism.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerrorismOcrTask(AiReviewTaskTerrorismOcrResult TerrorismOcrTask) {
        this.TerrorismOcrTask = TerrorismOcrTask;
    }

    /**
     * Get 视频内容审核 Asr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProhibitedAsrTask 视频内容审核 Asr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskProhibitedAsrResult getProhibitedAsrTask() {
        return this.ProhibitedAsrTask;
    }

    /**
     * Set 视频内容审核 Asr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProhibitedAsrTask 视频内容审核 Asr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Asr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProhibitedAsrTask(AiReviewTaskProhibitedAsrResult ProhibitedAsrTask) {
        this.ProhibitedAsrTask = ProhibitedAsrTask;
    }

    /**
     * Get 视频内容审核 Ocr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProhibitedOcrTask 视频内容审核 Ocr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiReviewTaskProhibitedOcrResult getProhibitedOcrTask() {
        return this.ProhibitedOcrTask;
    }

    /**
     * Set 视频内容审核 Ocr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProhibitedOcrTask 视频内容审核 Ocr 文字鉴违禁任务的查询结果，当任务类型为 Prohibited.Ocr 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProhibitedOcrTask(AiReviewTaskProhibitedOcrResult ProhibitedOcrTask) {
        this.ProhibitedOcrTask = ProhibitedOcrTask;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "PornTask.", this.PornTask);
        this.setParamObj(map, prefix + "TerrorismTask.", this.TerrorismTask);
        this.setParamObj(map, prefix + "PoliticalTask.", this.PoliticalTask);
        this.setParamObj(map, prefix + "PornAsrTask.", this.PornAsrTask);
        this.setParamObj(map, prefix + "PornOcrTask.", this.PornOcrTask);
        this.setParamObj(map, prefix + "PoliticalAsrTask.", this.PoliticalAsrTask);
        this.setParamObj(map, prefix + "PoliticalOcrTask.", this.PoliticalOcrTask);
        this.setParamObj(map, prefix + "TerrorismOcrTask.", this.TerrorismOcrTask);
        this.setParamObj(map, prefix + "ProhibitedAsrTask.", this.ProhibitedAsrTask);
        this.setParamObj(map, prefix + "ProhibitedOcrTask.", this.ProhibitedOcrTask);

    }
}

