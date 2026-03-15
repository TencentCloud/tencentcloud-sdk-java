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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * <p>任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务；</li><li>ProcessMediaByMPS：MPS 视频处理任务；</li><li>AigcImageTask：AIGC 生图任务；</li><li>SceneAigcImageTask：场景化 AIGC 生图任务；</li><li>AigcVideoTask：AIGC 生视频任务；</li><li>ImportMediaKnowledge：导入媒体知识任务。</li><li>SceneAigcVideoTask：场景化 AIGC 生视频任务；</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> CreateAigcAdvancedCustomElementTask：创建自定义主体任务</li><li>CreateAigcCustomVoiceTask：创建自定义音色任务</li><li>CreateAigcSubjectTask：创建主体任务</li></p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成；</li><li>ABORTED：已终止。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureTask")
    @Expose
    private ProcedureTask ProcedureTask;

    /**
    * <p>视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

    /**
    * <p>微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatPublishTask")
    @Expose
    private WechatPublishTask WechatPublishTask;

    /**
    * <p>制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComposeMediaTask")
    @Expose
    private ComposeMediaTask ComposeMediaTask;

    /**
    * <p>视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitMediaTask")
    @Expose
    private SplitMediaTask SplitMediaTask;

    /**
    * <p>微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatMiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishTask;

    /**
    * <p>拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullUploadTask")
    @Expose
    private PullUploadTask PullUploadTask;

    /**
    * <p>视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTask2017 TranscodeTask;

    /**
    * <p>视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcatTask")
    @Expose
    private ConcatTask2017 ConcatTask;

    /**
    * <p>视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClipTask")
    @Expose
    private ClipTask2017 ClipTask;

    /**
    * <p>截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateImageSpriteTask")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteTask;

    /**
    * <p>视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask;

    /**
    * <p>智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveWatermarkTask")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkTask;

    /**
    * <p>音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RebuildMediaTask")
    @Expose
    private RebuildMediaTask RebuildMediaTask;

    /**
    * <p>提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractTraceWatermarkTask")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkTask;

    /**
    * <p>提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractCopyRightWatermarkTask")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask;

    /**
    * <p>音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoTask;

    /**
    * <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReduceMediaBitrateTask")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateTask;

    /**
    * <p>获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescribeFileAttributesTask")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesTask;

    /**
    * <p>音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityInspectTask")
    @Expose
    private QualityInspectTask QualityInspectTask;

    /**
    * <p>音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEnhanceTask")
    @Expose
    private QualityEnhanceTask QualityEnhanceTask;

    /**
    * <p>复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingTask")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask;

    /**
    * <p>MPS 视频处理任务信息，仅当 TaskType 为 ProcessMediaByMPS，该字段有值。</p>
    */
    @SerializedName("ProcessMediaByMPSTask")
    @Expose
    private ProcessMediaByMPS ProcessMediaByMPSTask;

    /**
    * <p>AIGC 生图任务信息，仅当 TaskType 为 AigcImageTask，该字段有值。</p>
    */
    @SerializedName("AigcImageTask")
    @Expose
    private AigcImageTask AigcImageTask;

    /**
    * <p>AIGC 生视频任务信息，仅当 TaskType 为 AigcVideoTask，该字段有值。</p>
    */
    @SerializedName("AigcVideoTask")
    @Expose
    private AigcVideoTask AigcVideoTask;

    /**
    * <p>媒体导入知识库任务信息，仅当 TaskType 为 ImportMediaKnowledge，该字段有值。</p>
    */
    @SerializedName("ImportMediaKnowledge")
    @Expose
    private ImportMediaKnowledgeTask ImportMediaKnowledge;

    /**
    * <p>场景化 AIGC 生图任务信息，仅当 TaskType 为 SceneAigcImageTask，该字段有值。</p>
    */
    @SerializedName("SceneAigcImageTask")
    @Expose
    private SceneAigcImageTask SceneAigcImageTask;

    /**
    * <p>场景化 AIGC 生视频任务信息，仅当 TaskType 为 SceneAigcVideoTask，该字段有值。</p>
    */
    @SerializedName("SceneAigcVideoTask")
    @Expose
    private SceneAigcVideoTask SceneAigcVideoTask;

    /**
    * <p>图像异步处理任务信息，仅当 TaskType 为 ProcessImageAsync，该字段有值。</p>
    */
    @SerializedName("ProcessImageAsyncTask")
    @Expose
    private ProcessImageAsync ProcessImageAsyncTask;

    /**
    * <p>提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。</p>
    */
    @SerializedName("ExtractBlindWatermarkTask")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkTask;

    /**
    * <p>创建自定义主体信息，仅当 TaskType 为 CreateAigcAdvancedCustomElement，该字段有值。</p>
    */
    @SerializedName("CreateAigcAdvancedCustomElementTask")
    @Expose
    private CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementTask;

    /**
    * <p>创建自定义音色信息，仅当 TaskType 为 CreateAigcCustomVoice，该字段有值。</p>
    */
    @SerializedName("CreateAigcCustomVoiceTask")
    @Expose
    private CreateAigcCustomVoiceTask CreateAigcCustomVoiceTask;

    /**
    * <p>创建主体信息，仅当 TaskType 为 CreateAigcSubject，该字段有值。</p>
    */
    @SerializedName("CreateAigcSubjectTask")
    @Expose
    private CreateAigcSubjectTask CreateAigcSubjectTask;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务；</li><li>ProcessMediaByMPS：MPS 视频处理任务；</li><li>AigcImageTask：AIGC 生图任务；</li><li>SceneAigcImageTask：场景化 AIGC 生图任务；</li><li>AigcVideoTask：AIGC 生视频任务；</li><li>ImportMediaKnowledge：导入媒体知识任务。</li><li>SceneAigcVideoTask：场景化 AIGC 生视频任务；</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> CreateAigcAdvancedCustomElementTask：创建自定义主体任务</li><li>CreateAigcCustomVoiceTask：创建自定义音色任务</li><li>CreateAigcSubjectTask：创建主体任务</li></p> 
     * @return TaskType <p>任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务；</li><li>ProcessMediaByMPS：MPS 视频处理任务；</li><li>AigcImageTask：AIGC 生图任务；</li><li>SceneAigcImageTask：场景化 AIGC 生图任务；</li><li>AigcVideoTask：AIGC 生视频任务；</li><li>ImportMediaKnowledge：导入媒体知识任务。</li><li>SceneAigcVideoTask：场景化 AIGC 生视频任务；</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> CreateAigcAdvancedCustomElementTask：创建自定义主体任务</li><li>CreateAigcCustomVoiceTask：创建自定义音色任务</li><li>CreateAigcSubjectTask：创建主体任务</li></p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务；</li><li>ProcessMediaByMPS：MPS 视频处理任务；</li><li>AigcImageTask：AIGC 生图任务；</li><li>SceneAigcImageTask：场景化 AIGC 生图任务；</li><li>AigcVideoTask：AIGC 生视频任务；</li><li>ImportMediaKnowledge：导入媒体知识任务。</li><li>SceneAigcVideoTask：场景化 AIGC 生视频任务；</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> CreateAigcAdvancedCustomElementTask：创建自定义主体任务</li><li>CreateAigcCustomVoiceTask：创建自定义音色任务</li><li>CreateAigcSubjectTask：创建主体任务</li></p>
     * @param TaskType <p>任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务；</li><li>ProcessMediaByMPS：MPS 视频处理任务；</li><li>AigcImageTask：AIGC 生图任务；</li><li>SceneAigcImageTask：场景化 AIGC 生图任务；</li><li>AigcVideoTask：AIGC 生视频任务；</li><li>ImportMediaKnowledge：导入媒体知识任务。</li><li>SceneAigcVideoTask：场景化 AIGC 生视频任务；</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> ExtractBlindWatermark：提取数字水印任务。</li><li> CreateAigcAdvancedCustomElementTask：创建自定义主体任务</li><li>CreateAigcCustomVoiceTask：创建自定义音色任务</li><li>CreateAigcSubjectTask：创建主体任务</li></p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成；</li><li>ABORTED：已终止。</li> 
     * @return Status <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成；</li><li>ABORTED：已终止。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成；</li><li>ABORTED：已终止。</li>
     * @param Status <p>任务状态，取值：</p><li>WAITING：等待中；</li><li>PROCESSING：处理中；</li><li>FINISH：已完成；</li><li>ABORTED：已终止。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return CreateTime <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param CreateTime <p>任务的创建时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return BeginProcessTime <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param BeginProcessTime <p>任务开始执行的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return FinishTime <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param FinishTime <p>任务执行完毕的时间，采用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcedureTask <p>视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcedureTask getProcedureTask() {
        return this.ProcedureTask;
    }

    /**
     * Set <p>视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureTask <p>视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureTask(ProcedureTask ProcedureTask) {
        this.ProcedureTask = ProcedureTask;
    }

    /**
     * Get <p>视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditMediaTask <p>视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set <p>视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditMediaTask <p>视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get <p>微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatPublishTask <p>微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatPublishTask getWechatPublishTask() {
        return this.WechatPublishTask;
    }

    /**
     * Set <p>微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatPublishTask <p>微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatPublishTask(WechatPublishTask WechatPublishTask) {
        this.WechatPublishTask = WechatPublishTask;
    }

    /**
     * Get <p>制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComposeMediaTask <p>制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComposeMediaTask getComposeMediaTask() {
        return this.ComposeMediaTask;
    }

    /**
     * Set <p>制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComposeMediaTask <p>制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComposeMediaTask(ComposeMediaTask ComposeMediaTask) {
        this.ComposeMediaTask = ComposeMediaTask;
    }

    /**
     * Get <p>视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitMediaTask <p>视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SplitMediaTask getSplitMediaTask() {
        return this.SplitMediaTask;
    }

    /**
     * Set <p>视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitMediaTask <p>视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSplitMediaTask(SplitMediaTask SplitMediaTask) {
        this.SplitMediaTask = SplitMediaTask;
    }

    /**
     * Get <p>微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatMiniProgramPublishTask <p>微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishTask() {
        return this.WechatMiniProgramPublishTask;
    }

    /**
     * Set <p>微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatMiniProgramPublishTask <p>微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatMiniProgramPublishTask(WechatMiniProgramPublishTask WechatMiniProgramPublishTask) {
        this.WechatMiniProgramPublishTask = WechatMiniProgramPublishTask;
    }

    /**
     * Get <p>拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullUploadTask <p>拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PullUploadTask getPullUploadTask() {
        return this.PullUploadTask;
    }

    /**
     * Set <p>拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullUploadTask <p>拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullUploadTask(PullUploadTask PullUploadTask) {
        this.PullUploadTask = PullUploadTask;
    }

    /**
     * Get <p>视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeTask <p>视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodeTask2017 getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set <p>视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTask <p>视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTask(TranscodeTask2017 TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get <p>视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcatTask <p>视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConcatTask2017 getConcatTask() {
        return this.ConcatTask;
    }

    /**
     * Set <p>视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcatTask <p>视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcatTask(ConcatTask2017 ConcatTask) {
        this.ConcatTask = ConcatTask;
    }

    /**
     * Get <p>视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClipTask <p>视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClipTask2017 getClipTask() {
        return this.ClipTask;
    }

    /**
     * Set <p>视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClipTask <p>视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClipTask(ClipTask2017 ClipTask) {
        this.ClipTask = ClipTask;
    }

    /**
     * Get <p>截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateImageSpriteTask <p>截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteTask() {
        return this.CreateImageSpriteTask;
    }

    /**
     * Set <p>截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateImageSpriteTask <p>截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateImageSpriteTask(CreateImageSpriteTask2017 CreateImageSpriteTask) {
        this.CreateImageSpriteTask = CreateImageSpriteTask;
    }

    /**
     * Get <p>视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetTask <p>视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set <p>视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTask <p>视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get <p>智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveWatermarkTask <p>智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoveWatermarkTask getRemoveWatermarkTask() {
        return this.RemoveWatermarkTask;
    }

    /**
     * Set <p>智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveWatermarkTask <p>智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveWatermarkTask(RemoveWatermarkTask RemoveWatermarkTask) {
        this.RemoveWatermarkTask = RemoveWatermarkTask;
    }

    /**
     * Get <p>音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RebuildMediaTask <p>音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildMediaTask getRebuildMediaTask() {
        return this.RebuildMediaTask;
    }

    /**
     * Set <p>音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RebuildMediaTask <p>音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRebuildMediaTask(RebuildMediaTask RebuildMediaTask) {
        this.RebuildMediaTask = RebuildMediaTask;
    }

    /**
     * Get <p>提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractTraceWatermarkTask <p>提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkTask() {
        return this.ExtractTraceWatermarkTask;
    }

    /**
     * Set <p>提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractTraceWatermarkTask <p>提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractTraceWatermarkTask(ExtractTraceWatermarkTask ExtractTraceWatermarkTask) {
        this.ExtractTraceWatermarkTask = ExtractTraceWatermarkTask;
    }

    /**
     * Get <p>提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractCopyRightWatermarkTask <p>提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkTask() {
        return this.ExtractCopyRightWatermarkTask;
    }

    /**
     * Set <p>提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractCopyRightWatermarkTask <p>提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractCopyRightWatermarkTask(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask) {
        this.ExtractCopyRightWatermarkTask = ExtractCopyRightWatermarkTask;
    }

    /**
     * Get <p>音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewAudioVideoTask <p>音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReviewAudioVideoTask getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set <p>音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewAudioVideoTask <p>音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewAudioVideoTask(ReviewAudioVideoTask ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReduceMediaBitrateTask <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateTask() {
        return this.ReduceMediaBitrateTask;
    }

    /**
     * Set <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReduceMediaBitrateTask <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReduceMediaBitrateTask(ReduceMediaBitrateTask ReduceMediaBitrateTask) {
        this.ReduceMediaBitrateTask = ReduceMediaBitrateTask;
    }

    /**
     * Get <p>获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescribeFileAttributesTask <p>获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeFileAttributesTask getDescribeFileAttributesTask() {
        return this.DescribeFileAttributesTask;
    }

    /**
     * Set <p>获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescribeFileAttributesTask <p>获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribeFileAttributesTask(DescribeFileAttributesTask DescribeFileAttributesTask) {
        this.DescribeFileAttributesTask = DescribeFileAttributesTask;
    }

    /**
     * Get <p>音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityInspectTask <p>音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityInspectTask getQualityInspectTask() {
        return this.QualityInspectTask;
    }

    /**
     * Set <p>音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityInspectTask <p>音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityInspectTask(QualityInspectTask QualityInspectTask) {
        this.QualityInspectTask = QualityInspectTask;
    }

    /**
     * Get <p>音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEnhanceTask <p>音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityEnhanceTask getQualityEnhanceTask() {
        return this.QualityEnhanceTask;
    }

    /**
     * Set <p>音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEnhanceTask <p>音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEnhanceTask(QualityEnhanceTask QualityEnhanceTask) {
        this.QualityEnhanceTask = QualityEnhanceTask;
    }

    /**
     * Get <p>复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplexAdaptiveDynamicStreamingTask <p>复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingTask() {
        return this.ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Set <p>复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplexAdaptiveDynamicStreamingTask <p>复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplexAdaptiveDynamicStreamingTask(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask) {
        this.ComplexAdaptiveDynamicStreamingTask = ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Get <p>MPS 视频处理任务信息，仅当 TaskType 为 ProcessMediaByMPS，该字段有值。</p> 
     * @return ProcessMediaByMPSTask <p>MPS 视频处理任务信息，仅当 TaskType 为 ProcessMediaByMPS，该字段有值。</p>
     */
    public ProcessMediaByMPS getProcessMediaByMPSTask() {
        return this.ProcessMediaByMPSTask;
    }

    /**
     * Set <p>MPS 视频处理任务信息，仅当 TaskType 为 ProcessMediaByMPS，该字段有值。</p>
     * @param ProcessMediaByMPSTask <p>MPS 视频处理任务信息，仅当 TaskType 为 ProcessMediaByMPS，该字段有值。</p>
     */
    public void setProcessMediaByMPSTask(ProcessMediaByMPS ProcessMediaByMPSTask) {
        this.ProcessMediaByMPSTask = ProcessMediaByMPSTask;
    }

    /**
     * Get <p>AIGC 生图任务信息，仅当 TaskType 为 AigcImageTask，该字段有值。</p> 
     * @return AigcImageTask <p>AIGC 生图任务信息，仅当 TaskType 为 AigcImageTask，该字段有值。</p>
     */
    public AigcImageTask getAigcImageTask() {
        return this.AigcImageTask;
    }

    /**
     * Set <p>AIGC 生图任务信息，仅当 TaskType 为 AigcImageTask，该字段有值。</p>
     * @param AigcImageTask <p>AIGC 生图任务信息，仅当 TaskType 为 AigcImageTask，该字段有值。</p>
     */
    public void setAigcImageTask(AigcImageTask AigcImageTask) {
        this.AigcImageTask = AigcImageTask;
    }

    /**
     * Get <p>AIGC 生视频任务信息，仅当 TaskType 为 AigcVideoTask，该字段有值。</p> 
     * @return AigcVideoTask <p>AIGC 生视频任务信息，仅当 TaskType 为 AigcVideoTask，该字段有值。</p>
     */
    public AigcVideoTask getAigcVideoTask() {
        return this.AigcVideoTask;
    }

    /**
     * Set <p>AIGC 生视频任务信息，仅当 TaskType 为 AigcVideoTask，该字段有值。</p>
     * @param AigcVideoTask <p>AIGC 生视频任务信息，仅当 TaskType 为 AigcVideoTask，该字段有值。</p>
     */
    public void setAigcVideoTask(AigcVideoTask AigcVideoTask) {
        this.AigcVideoTask = AigcVideoTask;
    }

    /**
     * Get <p>媒体导入知识库任务信息，仅当 TaskType 为 ImportMediaKnowledge，该字段有值。</p> 
     * @return ImportMediaKnowledge <p>媒体导入知识库任务信息，仅当 TaskType 为 ImportMediaKnowledge，该字段有值。</p>
     */
    public ImportMediaKnowledgeTask getImportMediaKnowledge() {
        return this.ImportMediaKnowledge;
    }

    /**
     * Set <p>媒体导入知识库任务信息，仅当 TaskType 为 ImportMediaKnowledge，该字段有值。</p>
     * @param ImportMediaKnowledge <p>媒体导入知识库任务信息，仅当 TaskType 为 ImportMediaKnowledge，该字段有值。</p>
     */
    public void setImportMediaKnowledge(ImportMediaKnowledgeTask ImportMediaKnowledge) {
        this.ImportMediaKnowledge = ImportMediaKnowledge;
    }

    /**
     * Get <p>场景化 AIGC 生图任务信息，仅当 TaskType 为 SceneAigcImageTask，该字段有值。</p> 
     * @return SceneAigcImageTask <p>场景化 AIGC 生图任务信息，仅当 TaskType 为 SceneAigcImageTask，该字段有值。</p>
     */
    public SceneAigcImageTask getSceneAigcImageTask() {
        return this.SceneAigcImageTask;
    }

    /**
     * Set <p>场景化 AIGC 生图任务信息，仅当 TaskType 为 SceneAigcImageTask，该字段有值。</p>
     * @param SceneAigcImageTask <p>场景化 AIGC 生图任务信息，仅当 TaskType 为 SceneAigcImageTask，该字段有值。</p>
     */
    public void setSceneAigcImageTask(SceneAigcImageTask SceneAigcImageTask) {
        this.SceneAigcImageTask = SceneAigcImageTask;
    }

    /**
     * Get <p>场景化 AIGC 生视频任务信息，仅当 TaskType 为 SceneAigcVideoTask，该字段有值。</p> 
     * @return SceneAigcVideoTask <p>场景化 AIGC 生视频任务信息，仅当 TaskType 为 SceneAigcVideoTask，该字段有值。</p>
     */
    public SceneAigcVideoTask getSceneAigcVideoTask() {
        return this.SceneAigcVideoTask;
    }

    /**
     * Set <p>场景化 AIGC 生视频任务信息，仅当 TaskType 为 SceneAigcVideoTask，该字段有值。</p>
     * @param SceneAigcVideoTask <p>场景化 AIGC 生视频任务信息，仅当 TaskType 为 SceneAigcVideoTask，该字段有值。</p>
     */
    public void setSceneAigcVideoTask(SceneAigcVideoTask SceneAigcVideoTask) {
        this.SceneAigcVideoTask = SceneAigcVideoTask;
    }

    /**
     * Get <p>图像异步处理任务信息，仅当 TaskType 为 ProcessImageAsync，该字段有值。</p> 
     * @return ProcessImageAsyncTask <p>图像异步处理任务信息，仅当 TaskType 为 ProcessImageAsync，该字段有值。</p>
     */
    public ProcessImageAsync getProcessImageAsyncTask() {
        return this.ProcessImageAsyncTask;
    }

    /**
     * Set <p>图像异步处理任务信息，仅当 TaskType 为 ProcessImageAsync，该字段有值。</p>
     * @param ProcessImageAsyncTask <p>图像异步处理任务信息，仅当 TaskType 为 ProcessImageAsync，该字段有值。</p>
     */
    public void setProcessImageAsyncTask(ProcessImageAsync ProcessImageAsyncTask) {
        this.ProcessImageAsyncTask = ProcessImageAsyncTask;
    }

    /**
     * Get <p>提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。</p> 
     * @return ExtractBlindWatermarkTask <p>提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。</p>
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkTask() {
        return this.ExtractBlindWatermarkTask;
    }

    /**
     * Set <p>提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。</p>
     * @param ExtractBlindWatermarkTask <p>提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。</p>
     */
    public void setExtractBlindWatermarkTask(ExtractBlindWatermarkTask ExtractBlindWatermarkTask) {
        this.ExtractBlindWatermarkTask = ExtractBlindWatermarkTask;
    }

    /**
     * Get <p>创建自定义主体信息，仅当 TaskType 为 CreateAigcAdvancedCustomElement，该字段有值。</p> 
     * @return CreateAigcAdvancedCustomElementTask <p>创建自定义主体信息，仅当 TaskType 为 CreateAigcAdvancedCustomElement，该字段有值。</p>
     */
    public CreateAigcAdvancedCustomElementTask getCreateAigcAdvancedCustomElementTask() {
        return this.CreateAigcAdvancedCustomElementTask;
    }

    /**
     * Set <p>创建自定义主体信息，仅当 TaskType 为 CreateAigcAdvancedCustomElement，该字段有值。</p>
     * @param CreateAigcAdvancedCustomElementTask <p>创建自定义主体信息，仅当 TaskType 为 CreateAigcAdvancedCustomElement，该字段有值。</p>
     */
    public void setCreateAigcAdvancedCustomElementTask(CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementTask) {
        this.CreateAigcAdvancedCustomElementTask = CreateAigcAdvancedCustomElementTask;
    }

    /**
     * Get <p>创建自定义音色信息，仅当 TaskType 为 CreateAigcCustomVoice，该字段有值。</p> 
     * @return CreateAigcCustomVoiceTask <p>创建自定义音色信息，仅当 TaskType 为 CreateAigcCustomVoice，该字段有值。</p>
     */
    public CreateAigcCustomVoiceTask getCreateAigcCustomVoiceTask() {
        return this.CreateAigcCustomVoiceTask;
    }

    /**
     * Set <p>创建自定义音色信息，仅当 TaskType 为 CreateAigcCustomVoice，该字段有值。</p>
     * @param CreateAigcCustomVoiceTask <p>创建自定义音色信息，仅当 TaskType 为 CreateAigcCustomVoice，该字段有值。</p>
     */
    public void setCreateAigcCustomVoiceTask(CreateAigcCustomVoiceTask CreateAigcCustomVoiceTask) {
        this.CreateAigcCustomVoiceTask = CreateAigcCustomVoiceTask;
    }

    /**
     * Get <p>创建主体信息，仅当 TaskType 为 CreateAigcSubject，该字段有值。</p> 
     * @return CreateAigcSubjectTask <p>创建主体信息，仅当 TaskType 为 CreateAigcSubject，该字段有值。</p>
     */
    public CreateAigcSubjectTask getCreateAigcSubjectTask() {
        return this.CreateAigcSubjectTask;
    }

    /**
     * Set <p>创建主体信息，仅当 TaskType 为 CreateAigcSubject，该字段有值。</p>
     * @param CreateAigcSubjectTask <p>创建主体信息，仅当 TaskType 为 CreateAigcSubject，该字段有值。</p>
     */
    public void setCreateAigcSubjectTask(CreateAigcSubjectTask CreateAigcSubjectTask) {
        this.CreateAigcSubjectTask = CreateAigcSubjectTask;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailResponse(DescribeTaskDetailResponse source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.ProcedureTask != null) {
            this.ProcedureTask = new ProcedureTask(source.ProcedureTask);
        }
        if (source.EditMediaTask != null) {
            this.EditMediaTask = new EditMediaTask(source.EditMediaTask);
        }
        if (source.WechatPublishTask != null) {
            this.WechatPublishTask = new WechatPublishTask(source.WechatPublishTask);
        }
        if (source.ComposeMediaTask != null) {
            this.ComposeMediaTask = new ComposeMediaTask(source.ComposeMediaTask);
        }
        if (source.SplitMediaTask != null) {
            this.SplitMediaTask = new SplitMediaTask(source.SplitMediaTask);
        }
        if (source.WechatMiniProgramPublishTask != null) {
            this.WechatMiniProgramPublishTask = new WechatMiniProgramPublishTask(source.WechatMiniProgramPublishTask);
        }
        if (source.PullUploadTask != null) {
            this.PullUploadTask = new PullUploadTask(source.PullUploadTask);
        }
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new TranscodeTask2017(source.TranscodeTask);
        }
        if (source.ConcatTask != null) {
            this.ConcatTask = new ConcatTask2017(source.ConcatTask);
        }
        if (source.ClipTask != null) {
            this.ClipTask = new ClipTask2017(source.ClipTask);
        }
        if (source.CreateImageSpriteTask != null) {
            this.CreateImageSpriteTask = new CreateImageSpriteTask2017(source.CreateImageSpriteTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new SnapshotByTimeOffsetTask2017(source.SnapshotByTimeOffsetTask);
        }
        if (source.RemoveWatermarkTask != null) {
            this.RemoveWatermarkTask = new RemoveWatermarkTask(source.RemoveWatermarkTask);
        }
        if (source.RebuildMediaTask != null) {
            this.RebuildMediaTask = new RebuildMediaTask(source.RebuildMediaTask);
        }
        if (source.ExtractTraceWatermarkTask != null) {
            this.ExtractTraceWatermarkTask = new ExtractTraceWatermarkTask(source.ExtractTraceWatermarkTask);
        }
        if (source.ExtractCopyRightWatermarkTask != null) {
            this.ExtractCopyRightWatermarkTask = new ExtractCopyRightWatermarkTask(source.ExtractCopyRightWatermarkTask);
        }
        if (source.ReviewAudioVideoTask != null) {
            this.ReviewAudioVideoTask = new ReviewAudioVideoTask(source.ReviewAudioVideoTask);
        }
        if (source.ReduceMediaBitrateTask != null) {
            this.ReduceMediaBitrateTask = new ReduceMediaBitrateTask(source.ReduceMediaBitrateTask);
        }
        if (source.DescribeFileAttributesTask != null) {
            this.DescribeFileAttributesTask = new DescribeFileAttributesTask(source.DescribeFileAttributesTask);
        }
        if (source.QualityInspectTask != null) {
            this.QualityInspectTask = new QualityInspectTask(source.QualityInspectTask);
        }
        if (source.QualityEnhanceTask != null) {
            this.QualityEnhanceTask = new QualityEnhanceTask(source.QualityEnhanceTask);
        }
        if (source.ComplexAdaptiveDynamicStreamingTask != null) {
            this.ComplexAdaptiveDynamicStreamingTask = new ComplexAdaptiveDynamicStreamingTask(source.ComplexAdaptiveDynamicStreamingTask);
        }
        if (source.ProcessMediaByMPSTask != null) {
            this.ProcessMediaByMPSTask = new ProcessMediaByMPS(source.ProcessMediaByMPSTask);
        }
        if (source.AigcImageTask != null) {
            this.AigcImageTask = new AigcImageTask(source.AigcImageTask);
        }
        if (source.AigcVideoTask != null) {
            this.AigcVideoTask = new AigcVideoTask(source.AigcVideoTask);
        }
        if (source.ImportMediaKnowledge != null) {
            this.ImportMediaKnowledge = new ImportMediaKnowledgeTask(source.ImportMediaKnowledge);
        }
        if (source.SceneAigcImageTask != null) {
            this.SceneAigcImageTask = new SceneAigcImageTask(source.SceneAigcImageTask);
        }
        if (source.SceneAigcVideoTask != null) {
            this.SceneAigcVideoTask = new SceneAigcVideoTask(source.SceneAigcVideoTask);
        }
        if (source.ProcessImageAsyncTask != null) {
            this.ProcessImageAsyncTask = new ProcessImageAsync(source.ProcessImageAsyncTask);
        }
        if (source.ExtractBlindWatermarkTask != null) {
            this.ExtractBlindWatermarkTask = new ExtractBlindWatermarkTask(source.ExtractBlindWatermarkTask);
        }
        if (source.CreateAigcAdvancedCustomElementTask != null) {
            this.CreateAigcAdvancedCustomElementTask = new CreateAigcAdvancedCustomElementTask(source.CreateAigcAdvancedCustomElementTask);
        }
        if (source.CreateAigcCustomVoiceTask != null) {
            this.CreateAigcCustomVoiceTask = new CreateAigcCustomVoiceTask(source.CreateAigcCustomVoiceTask);
        }
        if (source.CreateAigcSubjectTask != null) {
            this.CreateAigcSubjectTask = new CreateAigcSubjectTask(source.CreateAigcSubjectTask);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamObj(map, prefix + "ProcedureTask.", this.ProcedureTask);
        this.setParamObj(map, prefix + "EditMediaTask.", this.EditMediaTask);
        this.setParamObj(map, prefix + "WechatPublishTask.", this.WechatPublishTask);
        this.setParamObj(map, prefix + "ComposeMediaTask.", this.ComposeMediaTask);
        this.setParamObj(map, prefix + "SplitMediaTask.", this.SplitMediaTask);
        this.setParamObj(map, prefix + "WechatMiniProgramPublishTask.", this.WechatMiniProgramPublishTask);
        this.setParamObj(map, prefix + "PullUploadTask.", this.PullUploadTask);
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "ConcatTask.", this.ConcatTask);
        this.setParamObj(map, prefix + "ClipTask.", this.ClipTask);
        this.setParamObj(map, prefix + "CreateImageSpriteTask.", this.CreateImageSpriteTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "RemoveWatermarkTask.", this.RemoveWatermarkTask);
        this.setParamObj(map, prefix + "RebuildMediaTask.", this.RebuildMediaTask);
        this.setParamObj(map, prefix + "ExtractTraceWatermarkTask.", this.ExtractTraceWatermarkTask);
        this.setParamObj(map, prefix + "ExtractCopyRightWatermarkTask.", this.ExtractCopyRightWatermarkTask);
        this.setParamObj(map, prefix + "ReviewAudioVideoTask.", this.ReviewAudioVideoTask);
        this.setParamObj(map, prefix + "ReduceMediaBitrateTask.", this.ReduceMediaBitrateTask);
        this.setParamObj(map, prefix + "DescribeFileAttributesTask.", this.DescribeFileAttributesTask);
        this.setParamObj(map, prefix + "QualityInspectTask.", this.QualityInspectTask);
        this.setParamObj(map, prefix + "QualityEnhanceTask.", this.QualityEnhanceTask);
        this.setParamObj(map, prefix + "ComplexAdaptiveDynamicStreamingTask.", this.ComplexAdaptiveDynamicStreamingTask);
        this.setParamObj(map, prefix + "ProcessMediaByMPSTask.", this.ProcessMediaByMPSTask);
        this.setParamObj(map, prefix + "AigcImageTask.", this.AigcImageTask);
        this.setParamObj(map, prefix + "AigcVideoTask.", this.AigcVideoTask);
        this.setParamObj(map, prefix + "ImportMediaKnowledge.", this.ImportMediaKnowledge);
        this.setParamObj(map, prefix + "SceneAigcImageTask.", this.SceneAigcImageTask);
        this.setParamObj(map, prefix + "SceneAigcVideoTask.", this.SceneAigcVideoTask);
        this.setParamObj(map, prefix + "ProcessImageAsyncTask.", this.ProcessImageAsyncTask);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkTask.", this.ExtractBlindWatermarkTask);
        this.setParamObj(map, prefix + "CreateAigcAdvancedCustomElementTask.", this.CreateAigcAdvancedCustomElementTask);
        this.setParamObj(map, prefix + "CreateAigcCustomVoiceTask.", this.CreateAigcCustomVoiceTask);
        this.setParamObj(map, prefix + "CreateAigcSubjectTask.", this.CreateAigcSubjectTask);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

