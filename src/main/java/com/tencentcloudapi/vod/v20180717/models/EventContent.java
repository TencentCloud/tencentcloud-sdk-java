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

public class EventContent extends AbstractModel {

    /**
    * 事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。
    */
    @SerializedName("EventHandle")
    @Expose
    private String EventHandle;

    /**
    * <b>支持事件类型：</b>
<li>NewFileUpload：视频上传完成；</li>
<li>ProcedureStateChanged：任务流状态变更；</li>
<li>FileDeleted：视频删除完成；</li>
<li>RestoreMediaComplete：视频取回完成；</li>
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>SplitMediaComplete：视频拆分完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
<li>RemoveWatermark：智能去除水印完成。</li>
<li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li>
<li>ReviewAudioVideoComplete：音视频审核完成；</li>
<li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li>
<li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li>
<li>DescribeFileAttributesComplete：获取文件属性完成；</li>
<li>QualityInspectComplete：音画质检测完成；</li>
<li>QualityEnhanceComplete：音画质重生任务完成；</li>
<li>PersistenceComplete：剪辑固化完成；</li>
<li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li>
<b>兼容 2017 版的事件类型：</b>
<li>TranscodeComplete：视频转码完成；</li>
<li>ConcatComplete：视频拼接完成；</li>
<li>ClipComplete：视频剪辑完成；</li>
<li>CreateImageSpriteComplete：视频截取雪碧图完成；</li>
<li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 视频上传完成事件，当事件类型为 NewFileUpload 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUploadEvent")
    @Expose
    private FileUploadTask FileUploadEvent;

    /**
    * 任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureStateChangeEvent")
    @Expose
    private ProcedureTask ProcedureStateChangeEvent;

    /**
    * 文件删除事件，当事件类型为 FileDeleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileDeleteEvent")
    @Expose
    private FileDeleteTask FileDeleteEvent;

    /**
    * 视频转拉完成事件，当事件类型为 PullComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullCompleteEvent")
    @Expose
    private PullUploadTask PullCompleteEvent;

    /**
    * 视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditMediaCompleteEvent")
    @Expose
    private EditMediaTask EditMediaCompleteEvent;

    /**
    * 视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitMediaCompleteEvent")
    @Expose
    private SplitMediaTask SplitMediaCompleteEvent;

    /**
    * 制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * 视频剪辑完成事件，当事件类型为 ClipComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * 视频转码完成事件，当事件类型为 TranscodeComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * 视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * 视频拼接完成事件，当事件类型为 ConcatComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * 视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * 微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * 微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

    /**
    * 智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveWatermarkCompleteEvent")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkCompleteEvent;

    /**
    * 视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestoreMediaCompleteEvent")
    @Expose
    private RestoreMediaTask RestoreMediaCompleteEvent;

    /**
    * 音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RebuildMediaCompleteEvent")
    @Expose
    private RebuildMediaTask RebuildMediaCompleteEvent;

    /**
    * 溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractTraceWatermarkCompleteEvent")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent;

    /**
    * 版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractCopyRightWatermarkCompleteEvent")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent;

    /**
    * 音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewAudioVideoCompleteEvent")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoCompleteEvent;

    /**
    * 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReduceMediaBitrateCompleteEvent")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent;

    /**
    * 获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescribeFileAttributesCompleteEvent")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesCompleteEvent;

    /**
    * 音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityInspectCompleteEvent")
    @Expose
    private QualityInspectTask QualityInspectCompleteEvent;

    /**
    * 音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEnhanceCompleteEvent")
    @Expose
    private QualityEnhanceTask QualityEnhanceCompleteEvent;

    /**
    * 媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaCastStatusChangedEvent")
    @Expose
    private MediaCastEvent MediaCastStatusChangedEvent;

    /**
    * 剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersistenceCompleteEvent")
    @Expose
    private PersistenceCompleteTask PersistenceCompleteEvent;

    /**
    * 自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingCompleteEvent")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent;

    /**
     * Get 事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。 
     * @return EventHandle 事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。
     */
    public String getEventHandle() {
        return this.EventHandle;
    }

    /**
     * Set 事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。
     * @param EventHandle 事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。
     */
    public void setEventHandle(String EventHandle) {
        this.EventHandle = EventHandle;
    }

    /**
     * Get <b>支持事件类型：</b>
<li>NewFileUpload：视频上传完成；</li>
<li>ProcedureStateChanged：任务流状态变更；</li>
<li>FileDeleted：视频删除完成；</li>
<li>RestoreMediaComplete：视频取回完成；</li>
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>SplitMediaComplete：视频拆分完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
<li>RemoveWatermark：智能去除水印完成。</li>
<li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li>
<li>ReviewAudioVideoComplete：音视频审核完成；</li>
<li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li>
<li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li>
<li>DescribeFileAttributesComplete：获取文件属性完成；</li>
<li>QualityInspectComplete：音画质检测完成；</li>
<li>QualityEnhanceComplete：音画质重生任务完成；</li>
<li>PersistenceComplete：剪辑固化完成；</li>
<li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li>
<b>兼容 2017 版的事件类型：</b>
<li>TranscodeComplete：视频转码完成；</li>
<li>ConcatComplete：视频拼接完成；</li>
<li>ClipComplete：视频剪辑完成；</li>
<li>CreateImageSpriteComplete：视频截取雪碧图完成；</li>
<li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li> 
     * @return EventType <b>支持事件类型：</b>
<li>NewFileUpload：视频上传完成；</li>
<li>ProcedureStateChanged：任务流状态变更；</li>
<li>FileDeleted：视频删除完成；</li>
<li>RestoreMediaComplete：视频取回完成；</li>
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>SplitMediaComplete：视频拆分完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
<li>RemoveWatermark：智能去除水印完成。</li>
<li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li>
<li>ReviewAudioVideoComplete：音视频审核完成；</li>
<li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li>
<li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li>
<li>DescribeFileAttributesComplete：获取文件属性完成；</li>
<li>QualityInspectComplete：音画质检测完成；</li>
<li>QualityEnhanceComplete：音画质重生任务完成；</li>
<li>PersistenceComplete：剪辑固化完成；</li>
<li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li>
<b>兼容 2017 版的事件类型：</b>
<li>TranscodeComplete：视频转码完成；</li>
<li>ConcatComplete：视频拼接完成；</li>
<li>ClipComplete：视频剪辑完成；</li>
<li>CreateImageSpriteComplete：视频截取雪碧图完成；</li>
<li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <b>支持事件类型：</b>
<li>NewFileUpload：视频上传完成；</li>
<li>ProcedureStateChanged：任务流状态变更；</li>
<li>FileDeleted：视频删除完成；</li>
<li>RestoreMediaComplete：视频取回完成；</li>
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>SplitMediaComplete：视频拆分完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
<li>RemoveWatermark：智能去除水印完成。</li>
<li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li>
<li>ReviewAudioVideoComplete：音视频审核完成；</li>
<li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li>
<li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li>
<li>DescribeFileAttributesComplete：获取文件属性完成；</li>
<li>QualityInspectComplete：音画质检测完成；</li>
<li>QualityEnhanceComplete：音画质重生任务完成；</li>
<li>PersistenceComplete：剪辑固化完成；</li>
<li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li>
<b>兼容 2017 版的事件类型：</b>
<li>TranscodeComplete：视频转码完成；</li>
<li>ConcatComplete：视频拼接完成；</li>
<li>ClipComplete：视频剪辑完成；</li>
<li>CreateImageSpriteComplete：视频截取雪碧图完成；</li>
<li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
     * @param EventType <b>支持事件类型：</b>
<li>NewFileUpload：视频上传完成；</li>
<li>ProcedureStateChanged：任务流状态变更；</li>
<li>FileDeleted：视频删除完成；</li>
<li>RestoreMediaComplete：视频取回完成；</li>
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>SplitMediaComplete：视频拆分完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
<li>RemoveWatermark：智能去除水印完成。</li>
<li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li>
<li>ReviewAudioVideoComplete：音视频审核完成；</li>
<li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li>
<li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li>
<li>DescribeFileAttributesComplete：获取文件属性完成；</li>
<li>QualityInspectComplete：音画质检测完成；</li>
<li>QualityEnhanceComplete：音画质重生任务完成；</li>
<li>PersistenceComplete：剪辑固化完成；</li>
<li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li>
<b>兼容 2017 版的事件类型：</b>
<li>TranscodeComplete：视频转码完成；</li>
<li>ConcatComplete：视频拼接完成；</li>
<li>ClipComplete：视频剪辑完成；</li>
<li>CreateImageSpriteComplete：视频截取雪碧图完成；</li>
<li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 视频上传完成事件，当事件类型为 NewFileUpload 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileUploadEvent 视频上传完成事件，当事件类型为 NewFileUpload 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileUploadTask getFileUploadEvent() {
        return this.FileUploadEvent;
    }

    /**
     * Set 视频上传完成事件，当事件类型为 NewFileUpload 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUploadEvent 视频上传完成事件，当事件类型为 NewFileUpload 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUploadEvent(FileUploadTask FileUploadEvent) {
        this.FileUploadEvent = FileUploadEvent;
    }

    /**
     * Get 任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcedureStateChangeEvent 任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcedureTask getProcedureStateChangeEvent() {
        return this.ProcedureStateChangeEvent;
    }

    /**
     * Set 任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureStateChangeEvent 任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureStateChangeEvent(ProcedureTask ProcedureStateChangeEvent) {
        this.ProcedureStateChangeEvent = ProcedureStateChangeEvent;
    }

    /**
     * Get 文件删除事件，当事件类型为 FileDeleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileDeleteEvent 文件删除事件，当事件类型为 FileDeleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileDeleteTask getFileDeleteEvent() {
        return this.FileDeleteEvent;
    }

    /**
     * Set 文件删除事件，当事件类型为 FileDeleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileDeleteEvent 文件删除事件，当事件类型为 FileDeleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileDeleteEvent(FileDeleteTask FileDeleteEvent) {
        this.FileDeleteEvent = FileDeleteEvent;
    }

    /**
     * Get 视频转拉完成事件，当事件类型为 PullComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullCompleteEvent 视频转拉完成事件，当事件类型为 PullComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PullUploadTask getPullCompleteEvent() {
        return this.PullCompleteEvent;
    }

    /**
     * Set 视频转拉完成事件，当事件类型为 PullComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullCompleteEvent 视频转拉完成事件，当事件类型为 PullComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullCompleteEvent(PullUploadTask PullCompleteEvent) {
        this.PullCompleteEvent = PullCompleteEvent;
    }

    /**
     * Get 视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditMediaCompleteEvent 视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EditMediaTask getEditMediaCompleteEvent() {
        return this.EditMediaCompleteEvent;
    }

    /**
     * Set 视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditMediaCompleteEvent 视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditMediaCompleteEvent(EditMediaTask EditMediaCompleteEvent) {
        this.EditMediaCompleteEvent = EditMediaCompleteEvent;
    }

    /**
     * Get 视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitMediaCompleteEvent 视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SplitMediaTask getSplitMediaCompleteEvent() {
        return this.SplitMediaCompleteEvent;
    }

    /**
     * Set 视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitMediaCompleteEvent 视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSplitMediaCompleteEvent(SplitMediaTask SplitMediaCompleteEvent) {
        this.SplitMediaCompleteEvent = SplitMediaCompleteEvent;
    }

    /**
     * Get 制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComposeMediaCompleteEvent 制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComposeMediaTask getComposeMediaCompleteEvent() {
        return this.ComposeMediaCompleteEvent;
    }

    /**
     * Set 制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComposeMediaCompleteEvent 制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComposeMediaCompleteEvent(ComposeMediaTask ComposeMediaCompleteEvent) {
        this.ComposeMediaCompleteEvent = ComposeMediaCompleteEvent;
    }

    /**
     * Get 视频剪辑完成事件，当事件类型为 ClipComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClipCompleteEvent 视频剪辑完成事件，当事件类型为 ClipComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClipTask2017 getClipCompleteEvent() {
        return this.ClipCompleteEvent;
    }

    /**
     * Set 视频剪辑完成事件，当事件类型为 ClipComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClipCompleteEvent 视频剪辑完成事件，当事件类型为 ClipComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClipCompleteEvent(ClipTask2017 ClipCompleteEvent) {
        this.ClipCompleteEvent = ClipCompleteEvent;
    }

    /**
     * Get 视频转码完成事件，当事件类型为 TranscodeComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeCompleteEvent 视频转码完成事件，当事件类型为 TranscodeComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodeTask2017 getTranscodeCompleteEvent() {
        return this.TranscodeCompleteEvent;
    }

    /**
     * Set 视频转码完成事件，当事件类型为 TranscodeComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeCompleteEvent 视频转码完成事件，当事件类型为 TranscodeComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeCompleteEvent(TranscodeTask2017 TranscodeCompleteEvent) {
        this.TranscodeCompleteEvent = TranscodeCompleteEvent;
    }

    /**
     * Get 视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateImageSpriteCompleteEvent 视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteCompleteEvent() {
        return this.CreateImageSpriteCompleteEvent;
    }

    /**
     * Set 视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateImageSpriteCompleteEvent 视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateImageSpriteCompleteEvent(CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent) {
        this.CreateImageSpriteCompleteEvent = CreateImageSpriteCompleteEvent;
    }

    /**
     * Get 视频拼接完成事件，当事件类型为 ConcatComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcatCompleteEvent 视频拼接完成事件，当事件类型为 ConcatComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConcatTask2017 getConcatCompleteEvent() {
        return this.ConcatCompleteEvent;
    }

    /**
     * Set 视频拼接完成事件，当事件类型为 ConcatComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcatCompleteEvent 视频拼接完成事件，当事件类型为 ConcatComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcatCompleteEvent(ConcatTask2017 ConcatCompleteEvent) {
        this.ConcatCompleteEvent = ConcatCompleteEvent;
    }

    /**
     * Get 视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetCompleteEvent 视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetCompleteEvent() {
        return this.SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Set 视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetCompleteEvent 视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetCompleteEvent(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent) {
        this.SnapshotByTimeOffsetCompleteEvent = SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Get 微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatPublishCompleteEvent 微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatPublishTask getWechatPublishCompleteEvent() {
        return this.WechatPublishCompleteEvent;
    }

    /**
     * Set 微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatPublishCompleteEvent 微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatPublishCompleteEvent(WechatPublishTask WechatPublishCompleteEvent) {
        this.WechatPublishCompleteEvent = WechatPublishCompleteEvent;
    }

    /**
     * Get 微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatMiniProgramPublishCompleteEvent 微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishCompleteEvent() {
        return this.WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Set 微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatMiniProgramPublishCompleteEvent 微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatMiniProgramPublishCompleteEvent(WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent) {
        this.WechatMiniProgramPublishCompleteEvent = WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Get 智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveWatermarkCompleteEvent 智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoveWatermarkTask getRemoveWatermarkCompleteEvent() {
        return this.RemoveWatermarkCompleteEvent;
    }

    /**
     * Set 智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveWatermarkCompleteEvent 智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveWatermarkCompleteEvent(RemoveWatermarkTask RemoveWatermarkCompleteEvent) {
        this.RemoveWatermarkCompleteEvent = RemoveWatermarkCompleteEvent;
    }

    /**
     * Get 视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestoreMediaCompleteEvent 视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RestoreMediaTask getRestoreMediaCompleteEvent() {
        return this.RestoreMediaCompleteEvent;
    }

    /**
     * Set 视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestoreMediaCompleteEvent 视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestoreMediaCompleteEvent(RestoreMediaTask RestoreMediaCompleteEvent) {
        this.RestoreMediaCompleteEvent = RestoreMediaCompleteEvent;
    }

    /**
     * Get 音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RebuildMediaCompleteEvent 音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildMediaTask getRebuildMediaCompleteEvent() {
        return this.RebuildMediaCompleteEvent;
    }

    /**
     * Set 音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RebuildMediaCompleteEvent 音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRebuildMediaCompleteEvent(RebuildMediaTask RebuildMediaCompleteEvent) {
        this.RebuildMediaCompleteEvent = RebuildMediaCompleteEvent;
    }

    /**
     * Get 溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractTraceWatermarkCompleteEvent 溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkCompleteEvent() {
        return this.ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Set 溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractTraceWatermarkCompleteEvent 溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractTraceWatermarkCompleteEvent(ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent) {
        this.ExtractTraceWatermarkCompleteEvent = ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Get 版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractCopyRightWatermarkCompleteEvent 版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkCompleteEvent() {
        return this.ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Set 版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractCopyRightWatermarkCompleteEvent 版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractCopyRightWatermarkCompleteEvent(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent) {
        this.ExtractCopyRightWatermarkCompleteEvent = ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Get 音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewAudioVideoCompleteEvent 音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReviewAudioVideoTask getReviewAudioVideoCompleteEvent() {
        return this.ReviewAudioVideoCompleteEvent;
    }

    /**
     * Set 音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewAudioVideoCompleteEvent 音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewAudioVideoCompleteEvent(ReviewAudioVideoTask ReviewAudioVideoCompleteEvent) {
        this.ReviewAudioVideoCompleteEvent = ReviewAudioVideoCompleteEvent;
    }

    /**
     * Get 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReduceMediaBitrateCompleteEvent 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateCompleteEvent() {
        return this.ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Set 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReduceMediaBitrateCompleteEvent 该字段已无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReduceMediaBitrateCompleteEvent(ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent) {
        this.ReduceMediaBitrateCompleteEvent = ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Get 获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescribeFileAttributesCompleteEvent 获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeFileAttributesTask getDescribeFileAttributesCompleteEvent() {
        return this.DescribeFileAttributesCompleteEvent;
    }

    /**
     * Set 获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescribeFileAttributesCompleteEvent 获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribeFileAttributesCompleteEvent(DescribeFileAttributesTask DescribeFileAttributesCompleteEvent) {
        this.DescribeFileAttributesCompleteEvent = DescribeFileAttributesCompleteEvent;
    }

    /**
     * Get 音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityInspectCompleteEvent 音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityInspectTask getQualityInspectCompleteEvent() {
        return this.QualityInspectCompleteEvent;
    }

    /**
     * Set 音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityInspectCompleteEvent 音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityInspectCompleteEvent(QualityInspectTask QualityInspectCompleteEvent) {
        this.QualityInspectCompleteEvent = QualityInspectCompleteEvent;
    }

    /**
     * Get 音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEnhanceCompleteEvent 音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityEnhanceTask getQualityEnhanceCompleteEvent() {
        return this.QualityEnhanceCompleteEvent;
    }

    /**
     * Set 音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEnhanceCompleteEvent 音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEnhanceCompleteEvent(QualityEnhanceTask QualityEnhanceCompleteEvent) {
        this.QualityEnhanceCompleteEvent = QualityEnhanceCompleteEvent;
    }

    /**
     * Get 媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaCastStatusChangedEvent 媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaCastEvent getMediaCastStatusChangedEvent() {
        return this.MediaCastStatusChangedEvent;
    }

    /**
     * Set 媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaCastStatusChangedEvent 媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaCastStatusChangedEvent(MediaCastEvent MediaCastStatusChangedEvent) {
        this.MediaCastStatusChangedEvent = MediaCastStatusChangedEvent;
    }

    /**
     * Get 剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersistenceCompleteEvent 剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersistenceCompleteTask getPersistenceCompleteEvent() {
        return this.PersistenceCompleteEvent;
    }

    /**
     * Set 剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersistenceCompleteEvent 剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersistenceCompleteEvent(PersistenceCompleteTask PersistenceCompleteEvent) {
        this.PersistenceCompleteEvent = PersistenceCompleteEvent;
    }

    /**
     * Get 自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplexAdaptiveDynamicStreamingCompleteEvent 自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingCompleteEvent() {
        return this.ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Set 自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplexAdaptiveDynamicStreamingCompleteEvent 自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplexAdaptiveDynamicStreamingCompleteEvent(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent) {
        this.ComplexAdaptiveDynamicStreamingCompleteEvent = ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    public EventContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventContent(EventContent source) {
        if (source.EventHandle != null) {
            this.EventHandle = new String(source.EventHandle);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.FileUploadEvent != null) {
            this.FileUploadEvent = new FileUploadTask(source.FileUploadEvent);
        }
        if (source.ProcedureStateChangeEvent != null) {
            this.ProcedureStateChangeEvent = new ProcedureTask(source.ProcedureStateChangeEvent);
        }
        if (source.FileDeleteEvent != null) {
            this.FileDeleteEvent = new FileDeleteTask(source.FileDeleteEvent);
        }
        if (source.PullCompleteEvent != null) {
            this.PullCompleteEvent = new PullUploadTask(source.PullCompleteEvent);
        }
        if (source.EditMediaCompleteEvent != null) {
            this.EditMediaCompleteEvent = new EditMediaTask(source.EditMediaCompleteEvent);
        }
        if (source.SplitMediaCompleteEvent != null) {
            this.SplitMediaCompleteEvent = new SplitMediaTask(source.SplitMediaCompleteEvent);
        }
        if (source.ComposeMediaCompleteEvent != null) {
            this.ComposeMediaCompleteEvent = new ComposeMediaTask(source.ComposeMediaCompleteEvent);
        }
        if (source.ClipCompleteEvent != null) {
            this.ClipCompleteEvent = new ClipTask2017(source.ClipCompleteEvent);
        }
        if (source.TranscodeCompleteEvent != null) {
            this.TranscodeCompleteEvent = new TranscodeTask2017(source.TranscodeCompleteEvent);
        }
        if (source.CreateImageSpriteCompleteEvent != null) {
            this.CreateImageSpriteCompleteEvent = new CreateImageSpriteTask2017(source.CreateImageSpriteCompleteEvent);
        }
        if (source.ConcatCompleteEvent != null) {
            this.ConcatCompleteEvent = new ConcatTask2017(source.ConcatCompleteEvent);
        }
        if (source.SnapshotByTimeOffsetCompleteEvent != null) {
            this.SnapshotByTimeOffsetCompleteEvent = new SnapshotByTimeOffsetTask2017(source.SnapshotByTimeOffsetCompleteEvent);
        }
        if (source.WechatPublishCompleteEvent != null) {
            this.WechatPublishCompleteEvent = new WechatPublishTask(source.WechatPublishCompleteEvent);
        }
        if (source.WechatMiniProgramPublishCompleteEvent != null) {
            this.WechatMiniProgramPublishCompleteEvent = new WechatMiniProgramPublishTask(source.WechatMiniProgramPublishCompleteEvent);
        }
        if (source.RemoveWatermarkCompleteEvent != null) {
            this.RemoveWatermarkCompleteEvent = new RemoveWatermarkTask(source.RemoveWatermarkCompleteEvent);
        }
        if (source.RestoreMediaCompleteEvent != null) {
            this.RestoreMediaCompleteEvent = new RestoreMediaTask(source.RestoreMediaCompleteEvent);
        }
        if (source.RebuildMediaCompleteEvent != null) {
            this.RebuildMediaCompleteEvent = new RebuildMediaTask(source.RebuildMediaCompleteEvent);
        }
        if (source.ExtractTraceWatermarkCompleteEvent != null) {
            this.ExtractTraceWatermarkCompleteEvent = new ExtractTraceWatermarkTask(source.ExtractTraceWatermarkCompleteEvent);
        }
        if (source.ExtractCopyRightWatermarkCompleteEvent != null) {
            this.ExtractCopyRightWatermarkCompleteEvent = new ExtractCopyRightWatermarkTask(source.ExtractCopyRightWatermarkCompleteEvent);
        }
        if (source.ReviewAudioVideoCompleteEvent != null) {
            this.ReviewAudioVideoCompleteEvent = new ReviewAudioVideoTask(source.ReviewAudioVideoCompleteEvent);
        }
        if (source.ReduceMediaBitrateCompleteEvent != null) {
            this.ReduceMediaBitrateCompleteEvent = new ReduceMediaBitrateTask(source.ReduceMediaBitrateCompleteEvent);
        }
        if (source.DescribeFileAttributesCompleteEvent != null) {
            this.DescribeFileAttributesCompleteEvent = new DescribeFileAttributesTask(source.DescribeFileAttributesCompleteEvent);
        }
        if (source.QualityInspectCompleteEvent != null) {
            this.QualityInspectCompleteEvent = new QualityInspectTask(source.QualityInspectCompleteEvent);
        }
        if (source.QualityEnhanceCompleteEvent != null) {
            this.QualityEnhanceCompleteEvent = new QualityEnhanceTask(source.QualityEnhanceCompleteEvent);
        }
        if (source.MediaCastStatusChangedEvent != null) {
            this.MediaCastStatusChangedEvent = new MediaCastEvent(source.MediaCastStatusChangedEvent);
        }
        if (source.PersistenceCompleteEvent != null) {
            this.PersistenceCompleteEvent = new PersistenceCompleteTask(source.PersistenceCompleteEvent);
        }
        if (source.ComplexAdaptiveDynamicStreamingCompleteEvent != null) {
            this.ComplexAdaptiveDynamicStreamingCompleteEvent = new ComplexAdaptiveDynamicStreamingTask(source.ComplexAdaptiveDynamicStreamingCompleteEvent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventHandle", this.EventHandle);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "FileUploadEvent.", this.FileUploadEvent);
        this.setParamObj(map, prefix + "ProcedureStateChangeEvent.", this.ProcedureStateChangeEvent);
        this.setParamObj(map, prefix + "FileDeleteEvent.", this.FileDeleteEvent);
        this.setParamObj(map, prefix + "PullCompleteEvent.", this.PullCompleteEvent);
        this.setParamObj(map, prefix + "EditMediaCompleteEvent.", this.EditMediaCompleteEvent);
        this.setParamObj(map, prefix + "SplitMediaCompleteEvent.", this.SplitMediaCompleteEvent);
        this.setParamObj(map, prefix + "ComposeMediaCompleteEvent.", this.ComposeMediaCompleteEvent);
        this.setParamObj(map, prefix + "ClipCompleteEvent.", this.ClipCompleteEvent);
        this.setParamObj(map, prefix + "TranscodeCompleteEvent.", this.TranscodeCompleteEvent);
        this.setParamObj(map, prefix + "CreateImageSpriteCompleteEvent.", this.CreateImageSpriteCompleteEvent);
        this.setParamObj(map, prefix + "ConcatCompleteEvent.", this.ConcatCompleteEvent);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetCompleteEvent.", this.SnapshotByTimeOffsetCompleteEvent);
        this.setParamObj(map, prefix + "WechatPublishCompleteEvent.", this.WechatPublishCompleteEvent);
        this.setParamObj(map, prefix + "WechatMiniProgramPublishCompleteEvent.", this.WechatMiniProgramPublishCompleteEvent);
        this.setParamObj(map, prefix + "RemoveWatermarkCompleteEvent.", this.RemoveWatermarkCompleteEvent);
        this.setParamObj(map, prefix + "RestoreMediaCompleteEvent.", this.RestoreMediaCompleteEvent);
        this.setParamObj(map, prefix + "RebuildMediaCompleteEvent.", this.RebuildMediaCompleteEvent);
        this.setParamObj(map, prefix + "ExtractTraceWatermarkCompleteEvent.", this.ExtractTraceWatermarkCompleteEvent);
        this.setParamObj(map, prefix + "ExtractCopyRightWatermarkCompleteEvent.", this.ExtractCopyRightWatermarkCompleteEvent);
        this.setParamObj(map, prefix + "ReviewAudioVideoCompleteEvent.", this.ReviewAudioVideoCompleteEvent);
        this.setParamObj(map, prefix + "ReduceMediaBitrateCompleteEvent.", this.ReduceMediaBitrateCompleteEvent);
        this.setParamObj(map, prefix + "DescribeFileAttributesCompleteEvent.", this.DescribeFileAttributesCompleteEvent);
        this.setParamObj(map, prefix + "QualityInspectCompleteEvent.", this.QualityInspectCompleteEvent);
        this.setParamObj(map, prefix + "QualityEnhanceCompleteEvent.", this.QualityEnhanceCompleteEvent);
        this.setParamObj(map, prefix + "MediaCastStatusChangedEvent.", this.MediaCastStatusChangedEvent);
        this.setParamObj(map, prefix + "PersistenceCompleteEvent.", this.PersistenceCompleteEvent);
        this.setParamObj(map, prefix + "ComplexAdaptiveDynamicStreamingCompleteEvent.", this.ComplexAdaptiveDynamicStreamingCompleteEvent);

    }
}

