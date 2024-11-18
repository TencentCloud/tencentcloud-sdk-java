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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * 任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成；</li>
<li>ABORTED：已终止。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureTask")
    @Expose
    private ProcedureTask ProcedureTask;

    /**
    * 视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

    /**
    * 微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatPublishTask")
    @Expose
    private WechatPublishTask WechatPublishTask;

    /**
    * 制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComposeMediaTask")
    @Expose
    private ComposeMediaTask ComposeMediaTask;

    /**
    * 视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitMediaTask")
    @Expose
    private SplitMediaTask SplitMediaTask;

    /**
    * 微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatMiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishTask;

    /**
    * 拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullUploadTask")
    @Expose
    private PullUploadTask PullUploadTask;

    /**
    * 视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTask2017 TranscodeTask;

    /**
    * 视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcatTask")
    @Expose
    private ConcatTask2017 ConcatTask;

    /**
    * 视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClipTask")
    @Expose
    private ClipTask2017 ClipTask;

    /**
    * 截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateImageSpriteTask")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteTask;

    /**
    * 视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask;

    /**
    * 智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveWatermarkTask")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkTask;

    /**
    * 音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RebuildMediaTask")
    @Expose
    private RebuildMediaTask RebuildMediaTask;

    /**
    * 提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractTraceWatermarkTask")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkTask;

    /**
    * 提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractCopyRightWatermarkTask")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask;

    /**
    * 音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoTask;

    /**
    * 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReduceMediaBitrateTask")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateTask;

    /**
    * 获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescribeFileAttributesTask")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesTask;

    /**
    * 音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityInspectTask")
    @Expose
    private QualityInspectTask QualityInspectTask;

    /**
    * 音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEnhanceTask")
    @Expose
    private QualityEnhanceTask QualityEnhanceTask;

    /**
    * 复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingTask")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务。</li> 
     * @return TaskType 任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务。</li>
     * @param TaskType 任务类型，取值：<li>Procedure：视频处理任务；</li><li>EditMedia：视频编辑任务；</li><li>SplitMedia：视频拆条任务；</li><li>ComposeMedia：制作媒体文件任务；</li><li>WechatPublish：微信发布任务；</li><li>WechatMiniProgramPublish：微信小程序视频发布任务；</li><li>PullUpload：拉取上传媒体文件任务；</li><li>FastClipMedia：快速剪辑任务；</li><li>RemoveWatermarkTask：智能去除水印任务；</li><li>DescribeFileAttributesTask：获取文件属性任务；</li><li>RebuildMedia：音画质重生任务（不推荐使用）；</li><li>ReviewAudioVideo：音视频审核任务；</li><li>ExtractTraceWatermark：提取溯源水印任务；</li><li>ExtractCopyRightWatermark：提取版权水印任务；</li><li>QualityInspect：音画质检测任务；</li><li>QualityEnhance：音画质重生任务；</li><li>ComplexAdaptiveDynamicStreaming：复杂自适应码流任务。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成；</li>
<li>ABORTED：已终止。</li> 
     * @return Status 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成；</li>
<li>ABORTED：已终止。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成；</li>
<li>ABORTED：已终止。</li>
     * @param Status 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成；</li>
<li>ABORTED：已终止。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return BeginProcessTime 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param BeginProcessTime 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return FinishTime 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param FinishTime 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcedureTask 视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcedureTask getProcedureTask() {
        return this.ProcedureTask;
    }

    /**
     * Set 视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureTask 视频处理任务信息，仅当 TaskType 为 Procedure，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureTask(ProcedureTask ProcedureTask) {
        this.ProcedureTask = ProcedureTask;
    }

    /**
     * Get 视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditMediaTask 视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set 视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditMediaTask 视频编辑任务信息，仅当 TaskType 为 EditMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get 微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatPublishTask 微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatPublishTask getWechatPublishTask() {
        return this.WechatPublishTask;
    }

    /**
     * Set 微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatPublishTask 微信发布任务信息，仅当 TaskType 为 WechatPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatPublishTask(WechatPublishTask WechatPublishTask) {
        this.WechatPublishTask = WechatPublishTask;
    }

    /**
     * Get 制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComposeMediaTask 制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComposeMediaTask getComposeMediaTask() {
        return this.ComposeMediaTask;
    }

    /**
     * Set 制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComposeMediaTask 制作媒体文件任务信息，仅当 TaskType 为 ComposeMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComposeMediaTask(ComposeMediaTask ComposeMediaTask) {
        this.ComposeMediaTask = ComposeMediaTask;
    }

    /**
     * Get 视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitMediaTask 视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SplitMediaTask getSplitMediaTask() {
        return this.SplitMediaTask;
    }

    /**
     * Set 视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitMediaTask 视频拆条任务信息，仅当 TaskType 为 SplitMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSplitMediaTask(SplitMediaTask SplitMediaTask) {
        this.SplitMediaTask = SplitMediaTask;
    }

    /**
     * Get 微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatMiniProgramPublishTask 微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishTask() {
        return this.WechatMiniProgramPublishTask;
    }

    /**
     * Set 微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatMiniProgramPublishTask 微信小程序发布任务信息，仅当 TaskType 为 WechatMiniProgramPublish，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatMiniProgramPublishTask(WechatMiniProgramPublishTask WechatMiniProgramPublishTask) {
        this.WechatMiniProgramPublishTask = WechatMiniProgramPublishTask;
    }

    /**
     * Get 拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullUploadTask 拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PullUploadTask getPullUploadTask() {
        return this.PullUploadTask;
    }

    /**
     * Set 拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullUploadTask 拉取上传媒体文件任务信息，仅当 TaskType 为 PullUpload，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullUploadTask(PullUploadTask PullUploadTask) {
        this.PullUploadTask = PullUploadTask;
    }

    /**
     * Get 视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeTask 视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodeTask2017 getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTask 视频转码任务信息，仅当 TaskType 为 Transcode，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTask(TranscodeTask2017 TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get 视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcatTask 视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConcatTask2017 getConcatTask() {
        return this.ConcatTask;
    }

    /**
     * Set 视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcatTask 视频拼接任务信息，仅当 TaskType 为 Concat，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcatTask(ConcatTask2017 ConcatTask) {
        this.ConcatTask = ConcatTask;
    }

    /**
     * Get 视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClipTask 视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClipTask2017 getClipTask() {
        return this.ClipTask;
    }

    /**
     * Set 视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClipTask 视频剪辑任务信息，仅当 TaskType 为 Clip，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClipTask(ClipTask2017 ClipTask) {
        this.ClipTask = ClipTask;
    }

    /**
     * Get 截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateImageSpriteTask 截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteTask() {
        return this.CreateImageSpriteTask;
    }

    /**
     * Set 截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateImageSpriteTask 截取雪碧图任务信息，仅当 TaskType 为 ImageSprite，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateImageSpriteTask(CreateImageSpriteTask2017 CreateImageSpriteTask) {
        this.CreateImageSpriteTask = CreateImageSpriteTask;
    }

    /**
     * Get 视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetTask 视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTask 视频指定时间点截图任务信息，仅当 TaskType 为 SnapshotByTimeOffset，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get 智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveWatermarkTask 智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoveWatermarkTask getRemoveWatermarkTask() {
        return this.RemoveWatermarkTask;
    }

    /**
     * Set 智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveWatermarkTask 智能去除水印任务信息，仅当 TaskType 为 RemoveWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveWatermarkTask(RemoveWatermarkTask RemoveWatermarkTask) {
        this.RemoveWatermarkTask = RemoveWatermarkTask;
    }

    /**
     * Get 音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RebuildMediaTask 音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildMediaTask getRebuildMediaTask() {
        return this.RebuildMediaTask;
    }

    /**
     * Set 音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RebuildMediaTask 音画质重生任务信息，仅当 TaskType 为 RebuildMedia，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRebuildMediaTask(RebuildMediaTask RebuildMediaTask) {
        this.RebuildMediaTask = RebuildMediaTask;
    }

    /**
     * Get 提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractTraceWatermarkTask 提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkTask() {
        return this.ExtractTraceWatermarkTask;
    }

    /**
     * Set 提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractTraceWatermarkTask 提取溯源水印任务信息，仅当 TaskType 为 ExtractTraceWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractTraceWatermarkTask(ExtractTraceWatermarkTask ExtractTraceWatermarkTask) {
        this.ExtractTraceWatermarkTask = ExtractTraceWatermarkTask;
    }

    /**
     * Get 提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractCopyRightWatermarkTask 提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkTask() {
        return this.ExtractCopyRightWatermarkTask;
    }

    /**
     * Set 提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractCopyRightWatermarkTask 提取版权水印任务信息，仅当 TaskType 为 ExtractCopyRightWatermark，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractCopyRightWatermarkTask(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask) {
        this.ExtractCopyRightWatermarkTask = ExtractCopyRightWatermarkTask;
    }

    /**
     * Get 音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewAudioVideoTask 音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReviewAudioVideoTask getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set 音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewAudioVideoTask 音视频审核任务信息，仅当 TaskType 为 ReviewAudioVideo，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewAudioVideoTask(ReviewAudioVideoTask ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReduceMediaBitrateTask 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateTask() {
        return this.ReduceMediaBitrateTask;
    }

    /**
     * Set 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReduceMediaBitrateTask 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReduceMediaBitrateTask(ReduceMediaBitrateTask ReduceMediaBitrateTask) {
        this.ReduceMediaBitrateTask = ReduceMediaBitrateTask;
    }

    /**
     * Get 获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescribeFileAttributesTask 获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeFileAttributesTask getDescribeFileAttributesTask() {
        return this.DescribeFileAttributesTask;
    }

    /**
     * Set 获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescribeFileAttributesTask 获取文件属性任务信息，仅当 TaskType 为 DescribeFileAttributes，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribeFileAttributesTask(DescribeFileAttributesTask DescribeFileAttributesTask) {
        this.DescribeFileAttributesTask = DescribeFileAttributesTask;
    }

    /**
     * Get 音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityInspectTask 音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityInspectTask getQualityInspectTask() {
        return this.QualityInspectTask;
    }

    /**
     * Set 音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityInspectTask 音画质检测任务信息，仅当 TaskType 为 QualityInspect 时该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityInspectTask(QualityInspectTask QualityInspectTask) {
        this.QualityInspectTask = QualityInspectTask;
    }

    /**
     * Get 音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEnhanceTask 音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityEnhanceTask getQualityEnhanceTask() {
        return this.QualityEnhanceTask;
    }

    /**
     * Set 音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEnhanceTask 音画质重生任务信息，仅当 TaskType 为 QualityEnhance，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEnhanceTask(QualityEnhanceTask QualityEnhanceTask) {
        this.QualityEnhanceTask = QualityEnhanceTask;
    }

    /**
     * Get 复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplexAdaptiveDynamicStreamingTask 复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingTask() {
        return this.ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Set 复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplexAdaptiveDynamicStreamingTask 复杂自适应码流任务信息，仅当 TaskType 为 ComplexAdaptiveDynamicStreaming，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplexAdaptiveDynamicStreamingTask(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask) {
        this.ComplexAdaptiveDynamicStreamingTask = ComplexAdaptiveDynamicStreamingTask;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

