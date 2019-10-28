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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcedureTemplate  extends AbstractModel{

    /**
    * 任务流名字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * AI 智能内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * AI 内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTaskInput MiniProgramPublishTask;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取任务流名字。
     * @return Name 任务流名字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置任务流名字。
     * @param Name 任务流名字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
     * @return Type 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
     * @param Type 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MediaProcessTask 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * 设置视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaProcessTask 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * 获取AI 智能内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiContentReviewTask AI 智能内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * 设置AI 智能内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiContentReviewTask AI 智能内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * 获取AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiAnalysisTask AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * 设置AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAnalysisTask AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * 获取AI 内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiRecognitionTask AI 内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * 设置AI 内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRecognitionTask AI 内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * 获取微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MiniProgramPublishTask 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatMiniProgramPublishTaskInput getMiniProgramPublishTask() {
        return this.MiniProgramPublishTask;
    }

    /**
     * 设置微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniProgramPublishTask 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniProgramPublishTask(WechatMiniProgramPublishTaskInput MiniProgramPublishTask) {
        this.MiniProgramPublishTask = MiniProgramPublishTask;
    }

    /**
     * 获取模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "MiniProgramPublishTask.", this.MiniProgramPublishTask);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

