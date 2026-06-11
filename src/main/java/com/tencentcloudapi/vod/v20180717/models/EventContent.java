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

public class EventContent extends AbstractModel {

    /**
    * <p>事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。</p>
    */
    @SerializedName("EventHandle")
    @Expose
    private String EventHandle;

    /**
    * <p><b>支持事件类型：</b></p><li>NewFileUpload：视频上传完成；</li><li>ProcedureStateChanged：任务流状态变更；</li><li>FileDeleted：视频删除完成；</li><li>RestoreMediaComplete：视频取回完成；</li><li>PullComplete：视频转拉完成；</li><li>EditMediaComplete：视频编辑完成；</li><li>SplitMediaComplete：视频拆分完成；</li><li>ComposeMediaComplete：制作媒体文件完成；</li><li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li><li>RemoveWatermark：智能去除水印完成。</li><li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li><li>ReviewAudioVideoComplete：音视频审核完成；</li><li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li><li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li><li>DescribeFileAttributesComplete：获取文件属性完成；</li><li>QualityInspectComplete：音画质检测完成；</li><li>QualityEnhanceComplete：音画质重生任务完成；</li><li>PersistenceComplete：剪辑固化完成；</li><li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li><li>ProcessMediaByMPSComplete：MPS视频处理完成。</li><li>AigcImageTaskComplete：AIGC 生图任务完成。</li><li>AigcVideoTaskComplete：AIGC 生视频任务完成。</li><li>DescribeAigcFaceInfoAsyncComplete：异步获取 AIGC 人脸信息任务完成。</li><b>兼容 2017 版的事件类型：</b><li>TranscodeComplete：视频转码完成；</li><li>ConcatComplete：视频拼接完成；</li><li>ClipComplete：视频剪辑完成；</li><li>CreateImageSpriteComplete：视频截取雪碧图完成；</li><li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>视频上传完成事件，当事件类型为 NewFileUpload 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUploadEvent")
    @Expose
    private FileUploadTask FileUploadEvent;

    /**
    * <p>任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcedureStateChangeEvent")
    @Expose
    private ProcedureTask ProcedureStateChangeEvent;

    /**
    * <p>文件删除事件，当事件类型为 FileDeleted 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileDeleteEvent")
    @Expose
    private FileDeleteTask FileDeleteEvent;

    /**
    * <p>视频转拉完成事件，当事件类型为 PullComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullCompleteEvent")
    @Expose
    private PullUploadTask PullCompleteEvent;

    /**
    * <p>视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditMediaCompleteEvent")
    @Expose
    private EditMediaTask EditMediaCompleteEvent;

    /**
    * <p>视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitMediaCompleteEvent")
    @Expose
    private SplitMediaTask SplitMediaCompleteEvent;

    /**
    * <p>制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * <p>视频剪辑完成事件，当事件类型为 ClipComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * <p>视频转码完成事件，当事件类型为 TranscodeComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * <p>视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * <p>视频拼接完成事件，当事件类型为 ConcatComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * <p>视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * <p>微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * <p>微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

    /**
    * <p>智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveWatermarkCompleteEvent")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkCompleteEvent;

    /**
    * <p>视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestoreMediaCompleteEvent")
    @Expose
    private RestoreMediaTask RestoreMediaCompleteEvent;

    /**
    * <p>音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RebuildMediaCompleteEvent")
    @Expose
    private RebuildMediaTask RebuildMediaCompleteEvent;

    /**
    * <p>溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractTraceWatermarkCompleteEvent")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent;

    /**
    * <p>版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractCopyRightWatermarkCompleteEvent")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent;

    /**
    * <p>音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewAudioVideoCompleteEvent")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoCompleteEvent;

    /**
    * <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReduceMediaBitrateCompleteEvent")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent;

    /**
    * <p>获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescribeFileAttributesCompleteEvent")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesCompleteEvent;

    /**
    * <p>音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityInspectCompleteEvent")
    @Expose
    private QualityInspectTask QualityInspectCompleteEvent;

    /**
    * <p>音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEnhanceCompleteEvent")
    @Expose
    private QualityEnhanceTask QualityEnhanceCompleteEvent;

    /**
    * <p>媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaCastStatusChangedEvent")
    @Expose
    private MediaCastEvent MediaCastStatusChangedEvent;

    /**
    * <p>剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersistenceCompleteEvent")
    @Expose
    private PersistenceCompleteTask PersistenceCompleteEvent;

    /**
    * <p>自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingCompleteEvent")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent;

    /**
    * <p>MPS 视频处理任务信息，仅当 EventType 为 ProcessMediaByMPSComplete 时有效。</p>
    */
    @SerializedName("ProcessMediaByMPSCompleteEvent")
    @Expose
    private ProcessMediaByMPS ProcessMediaByMPSCompleteEvent;

    /**
    * <p>AIGC 生图任务信息，仅当 EventType 为 AigcImageTaskComplete 时有效。</p>
    */
    @SerializedName("AigcImageCompleteEvent")
    @Expose
    private AigcImageTask AigcImageCompleteEvent;

    /**
    * <p>AIGC 生视频任务信息，仅当 EventType 为 AigcVideoTaskComplete 时有效。</p>
    */
    @SerializedName("AigcVideoCompleteEvent")
    @Expose
    private AigcVideoTask AigcVideoCompleteEvent;

    /**
    * <p>提取数字水印信息，仅当 EventType 为 ExtractBlindWatermarkComplete 时有效。</p>
    */
    @SerializedName("ExtractBlindWatermarkComplete")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkComplete;

    /**
    * <p>AIGC 场景化生图任务信息，仅当 EventType 为 SceneAigcImageCompleteEvent 时有效。</p>
    */
    @SerializedName("SceneAigcImageCompleteEvent")
    @Expose
    private SceneAigcImageTask SceneAigcImageCompleteEvent;

    /**
    * <p>图片异步处理任务信息，仅当 EventType 为 ProcessImageAsyncCompleteEvent 时有效。</p>
    */
    @SerializedName("ProcessImageAsyncCompleteEvent")
    @Expose
    private ProcessImageAsyncTask ProcessImageAsyncCompleteEvent;

    /**
    * <p>AIGC 自定义主体信息，仅当 EventType 为 CreateAigcAdvancedCustomElementCompleteEvent，该字段有值。</p>
    */
    @SerializedName("CreateAigcAdvancedCustomElementCompleteEvent")
    @Expose
    private CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementCompleteEvent;

    /**
    * <p>AIGC 自定义音色信息，仅当 EventType 为 CreateAigcCustomVoiceCompleteEvent，该字段有值。</p>
    */
    @SerializedName("CreateAigcCustomVoiceCompleteEvent")
    @Expose
    private CreateAigcCustomVoiceTask CreateAigcCustomVoiceCompleteEvent;

    /**
    * <p>异步获取 AIGC 人脸信息，仅当 EventType 为 DescribeAigcFaceInfoAsyncComplete，该字段有值。</p>
    */
    @SerializedName("DescribeAigcFaceInfoAsyncCompleteEvent")
    @Expose
    private DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncCompleteEvent;

    /**
     * Get <p>事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。</p> 
     * @return EventHandle <p>事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。</p>
     */
    public String getEventHandle() {
        return this.EventHandle;
    }

    /**
     * Set <p>事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。</p>
     * @param EventHandle <p>事件句柄，调用方必须调用 ConfirmEvents 来确认消息已经收到，确认有效时间 30 秒。失效后，事件可重新被获取。</p>
     */
    public void setEventHandle(String EventHandle) {
        this.EventHandle = EventHandle;
    }

    /**
     * Get <p><b>支持事件类型：</b></p><li>NewFileUpload：视频上传完成；</li><li>ProcedureStateChanged：任务流状态变更；</li><li>FileDeleted：视频删除完成；</li><li>RestoreMediaComplete：视频取回完成；</li><li>PullComplete：视频转拉完成；</li><li>EditMediaComplete：视频编辑完成；</li><li>SplitMediaComplete：视频拆分完成；</li><li>ComposeMediaComplete：制作媒体文件完成；</li><li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li><li>RemoveWatermark：智能去除水印完成。</li><li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li><li>ReviewAudioVideoComplete：音视频审核完成；</li><li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li><li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li><li>DescribeFileAttributesComplete：获取文件属性完成；</li><li>QualityInspectComplete：音画质检测完成；</li><li>QualityEnhanceComplete：音画质重生任务完成；</li><li>PersistenceComplete：剪辑固化完成；</li><li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li><li>ProcessMediaByMPSComplete：MPS视频处理完成。</li><li>AigcImageTaskComplete：AIGC 生图任务完成。</li><li>AigcVideoTaskComplete：AIGC 生视频任务完成。</li><li>DescribeAigcFaceInfoAsyncComplete：异步获取 AIGC 人脸信息任务完成。</li><b>兼容 2017 版的事件类型：</b><li>TranscodeComplete：视频转码完成；</li><li>ConcatComplete：视频拼接完成；</li><li>ClipComplete：视频剪辑完成；</li><li>CreateImageSpriteComplete：视频截取雪碧图完成；</li><li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li> 
     * @return EventType <p><b>支持事件类型：</b></p><li>NewFileUpload：视频上传完成；</li><li>ProcedureStateChanged：任务流状态变更；</li><li>FileDeleted：视频删除完成；</li><li>RestoreMediaComplete：视频取回完成；</li><li>PullComplete：视频转拉完成；</li><li>EditMediaComplete：视频编辑完成；</li><li>SplitMediaComplete：视频拆分完成；</li><li>ComposeMediaComplete：制作媒体文件完成；</li><li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li><li>RemoveWatermark：智能去除水印完成。</li><li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li><li>ReviewAudioVideoComplete：音视频审核完成；</li><li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li><li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li><li>DescribeFileAttributesComplete：获取文件属性完成；</li><li>QualityInspectComplete：音画质检测完成；</li><li>QualityEnhanceComplete：音画质重生任务完成；</li><li>PersistenceComplete：剪辑固化完成；</li><li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li><li>ProcessMediaByMPSComplete：MPS视频处理完成。</li><li>AigcImageTaskComplete：AIGC 生图任务完成。</li><li>AigcVideoTaskComplete：AIGC 生视频任务完成。</li><li>DescribeAigcFaceInfoAsyncComplete：异步获取 AIGC 人脸信息任务完成。</li><b>兼容 2017 版的事件类型：</b><li>TranscodeComplete：视频转码完成；</li><li>ConcatComplete：视频拼接完成；</li><li>ClipComplete：视频剪辑完成；</li><li>CreateImageSpriteComplete：视频截取雪碧图完成；</li><li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p><b>支持事件类型：</b></p><li>NewFileUpload：视频上传完成；</li><li>ProcedureStateChanged：任务流状态变更；</li><li>FileDeleted：视频删除完成；</li><li>RestoreMediaComplete：视频取回完成；</li><li>PullComplete：视频转拉完成；</li><li>EditMediaComplete：视频编辑完成；</li><li>SplitMediaComplete：视频拆分完成；</li><li>ComposeMediaComplete：制作媒体文件完成；</li><li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li><li>RemoveWatermark：智能去除水印完成。</li><li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li><li>ReviewAudioVideoComplete：音视频审核完成；</li><li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li><li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li><li>DescribeFileAttributesComplete：获取文件属性完成；</li><li>QualityInspectComplete：音画质检测完成；</li><li>QualityEnhanceComplete：音画质重生任务完成；</li><li>PersistenceComplete：剪辑固化完成；</li><li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li><li>ProcessMediaByMPSComplete：MPS视频处理完成。</li><li>AigcImageTaskComplete：AIGC 生图任务完成。</li><li>AigcVideoTaskComplete：AIGC 生视频任务完成。</li><li>DescribeAigcFaceInfoAsyncComplete：异步获取 AIGC 人脸信息任务完成。</li><b>兼容 2017 版的事件类型：</b><li>TranscodeComplete：视频转码完成；</li><li>ConcatComplete：视频拼接完成；</li><li>ClipComplete：视频剪辑完成；</li><li>CreateImageSpriteComplete：视频截取雪碧图完成；</li><li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
     * @param EventType <p><b>支持事件类型：</b></p><li>NewFileUpload：视频上传完成；</li><li>ProcedureStateChanged：任务流状态变更；</li><li>FileDeleted：视频删除完成；</li><li>RestoreMediaComplete：视频取回完成；</li><li>PullComplete：视频转拉完成；</li><li>EditMediaComplete：视频编辑完成；</li><li>SplitMediaComplete：视频拆分完成；</li><li>ComposeMediaComplete：制作媒体文件完成；</li><li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li><li>RemoveWatermark：智能去除水印完成。</li><li>RebuildMediaComplete：音画质重生完成事件（不推荐使用）。</li><li>ReviewAudioVideoComplete：音视频审核完成；</li><li>ExtractTraceWatermarkComplete：提取溯源水印完成；</li><li>ExtractCopyRightWatermarkComplete：提取版权水印完成；</li><li>DescribeFileAttributesComplete：获取文件属性完成；</li><li>QualityInspectComplete：音画质检测完成；</li><li>QualityEnhanceComplete：音画质重生任务完成；</li><li>PersistenceComplete：剪辑固化完成；</li><li>ComplexAdaptiveDynamicStreamingComplete：复杂自适应码流任务完成。</li><li>ProcessMediaByMPSComplete：MPS视频处理完成。</li><li>AigcImageTaskComplete：AIGC 生图任务完成。</li><li>AigcVideoTaskComplete：AIGC 生视频任务完成。</li><li>DescribeAigcFaceInfoAsyncComplete：异步获取 AIGC 人脸信息任务完成。</li><b>兼容 2017 版的事件类型：</b><li>TranscodeComplete：视频转码完成；</li><li>ConcatComplete：视频拼接完成；</li><li>ClipComplete：视频剪辑完成；</li><li>CreateImageSpriteComplete：视频截取雪碧图完成；</li><li>CreateSnapshotByTimeOffsetComplete：视频按时间点截图完成。</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>视频上传完成事件，当事件类型为 NewFileUpload 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileUploadEvent <p>视频上传完成事件，当事件类型为 NewFileUpload 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileUploadTask getFileUploadEvent() {
        return this.FileUploadEvent;
    }

    /**
     * Set <p>视频上传完成事件，当事件类型为 NewFileUpload 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUploadEvent <p>视频上传完成事件，当事件类型为 NewFileUpload 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUploadEvent(FileUploadTask FileUploadEvent) {
        this.FileUploadEvent = FileUploadEvent;
    }

    /**
     * Get <p>任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcedureStateChangeEvent <p>任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcedureTask getProcedureStateChangeEvent() {
        return this.ProcedureStateChangeEvent;
    }

    /**
     * Set <p>任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcedureStateChangeEvent <p>任务流状态变更事件，当事件类型为 ProcedureStateChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedureStateChangeEvent(ProcedureTask ProcedureStateChangeEvent) {
        this.ProcedureStateChangeEvent = ProcedureStateChangeEvent;
    }

    /**
     * Get <p>文件删除事件，当事件类型为 FileDeleted 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileDeleteEvent <p>文件删除事件，当事件类型为 FileDeleted 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileDeleteTask getFileDeleteEvent() {
        return this.FileDeleteEvent;
    }

    /**
     * Set <p>文件删除事件，当事件类型为 FileDeleted 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileDeleteEvent <p>文件删除事件，当事件类型为 FileDeleted 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileDeleteEvent(FileDeleteTask FileDeleteEvent) {
        this.FileDeleteEvent = FileDeleteEvent;
    }

    /**
     * Get <p>视频转拉完成事件，当事件类型为 PullComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullCompleteEvent <p>视频转拉完成事件，当事件类型为 PullComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PullUploadTask getPullCompleteEvent() {
        return this.PullCompleteEvent;
    }

    /**
     * Set <p>视频转拉完成事件，当事件类型为 PullComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullCompleteEvent <p>视频转拉完成事件，当事件类型为 PullComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullCompleteEvent(PullUploadTask PullCompleteEvent) {
        this.PullCompleteEvent = PullCompleteEvent;
    }

    /**
     * Get <p>视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditMediaCompleteEvent <p>视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EditMediaTask getEditMediaCompleteEvent() {
        return this.EditMediaCompleteEvent;
    }

    /**
     * Set <p>视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditMediaCompleteEvent <p>视频编辑完成事件，当事件类型为 EditMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditMediaCompleteEvent(EditMediaTask EditMediaCompleteEvent) {
        this.EditMediaCompleteEvent = EditMediaCompleteEvent;
    }

    /**
     * Get <p>视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitMediaCompleteEvent <p>视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SplitMediaTask getSplitMediaCompleteEvent() {
        return this.SplitMediaCompleteEvent;
    }

    /**
     * Set <p>视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitMediaCompleteEvent <p>视频拆分完成事件，当事件类型为 SplitMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSplitMediaCompleteEvent(SplitMediaTask SplitMediaCompleteEvent) {
        this.SplitMediaCompleteEvent = SplitMediaCompleteEvent;
    }

    /**
     * Get <p>制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComposeMediaCompleteEvent <p>制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComposeMediaTask getComposeMediaCompleteEvent() {
        return this.ComposeMediaCompleteEvent;
    }

    /**
     * Set <p>制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComposeMediaCompleteEvent <p>制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComposeMediaCompleteEvent(ComposeMediaTask ComposeMediaCompleteEvent) {
        this.ComposeMediaCompleteEvent = ComposeMediaCompleteEvent;
    }

    /**
     * Get <p>视频剪辑完成事件，当事件类型为 ClipComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClipCompleteEvent <p>视频剪辑完成事件，当事件类型为 ClipComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClipTask2017 getClipCompleteEvent() {
        return this.ClipCompleteEvent;
    }

    /**
     * Set <p>视频剪辑完成事件，当事件类型为 ClipComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClipCompleteEvent <p>视频剪辑完成事件，当事件类型为 ClipComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClipCompleteEvent(ClipTask2017 ClipCompleteEvent) {
        this.ClipCompleteEvent = ClipCompleteEvent;
    }

    /**
     * Get <p>视频转码完成事件，当事件类型为 TranscodeComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeCompleteEvent <p>视频转码完成事件，当事件类型为 TranscodeComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodeTask2017 getTranscodeCompleteEvent() {
        return this.TranscodeCompleteEvent;
    }

    /**
     * Set <p>视频转码完成事件，当事件类型为 TranscodeComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeCompleteEvent <p>视频转码完成事件，当事件类型为 TranscodeComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeCompleteEvent(TranscodeTask2017 TranscodeCompleteEvent) {
        this.TranscodeCompleteEvent = TranscodeCompleteEvent;
    }

    /**
     * Get <p>视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateImageSpriteCompleteEvent <p>视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteCompleteEvent() {
        return this.CreateImageSpriteCompleteEvent;
    }

    /**
     * Set <p>视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateImageSpriteCompleteEvent <p>视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateImageSpriteCompleteEvent(CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent) {
        this.CreateImageSpriteCompleteEvent = CreateImageSpriteCompleteEvent;
    }

    /**
     * Get <p>视频拼接完成事件，当事件类型为 ConcatComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcatCompleteEvent <p>视频拼接完成事件，当事件类型为 ConcatComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConcatTask2017 getConcatCompleteEvent() {
        return this.ConcatCompleteEvent;
    }

    /**
     * Set <p>视频拼接完成事件，当事件类型为 ConcatComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcatCompleteEvent <p>视频拼接完成事件，当事件类型为 ConcatComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcatCompleteEvent(ConcatTask2017 ConcatCompleteEvent) {
        this.ConcatCompleteEvent = ConcatCompleteEvent;
    }

    /**
     * Get <p>视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetCompleteEvent <p>视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetCompleteEvent() {
        return this.SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Set <p>视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetCompleteEvent <p>视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetCompleteEvent(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent) {
        this.SnapshotByTimeOffsetCompleteEvent = SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Get <p>微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatPublishCompleteEvent <p>微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatPublishTask getWechatPublishCompleteEvent() {
        return this.WechatPublishCompleteEvent;
    }

    /**
     * Set <p>微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatPublishCompleteEvent <p>微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatPublishCompleteEvent(WechatPublishTask WechatPublishCompleteEvent) {
        this.WechatPublishCompleteEvent = WechatPublishCompleteEvent;
    }

    /**
     * Get <p>微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatMiniProgramPublishCompleteEvent <p>微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishCompleteEvent() {
        return this.WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Set <p>微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatMiniProgramPublishCompleteEvent <p>微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatMiniProgramPublishCompleteEvent(WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent) {
        this.WechatMiniProgramPublishCompleteEvent = WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Get <p>智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveWatermarkCompleteEvent <p>智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoveWatermarkTask getRemoveWatermarkCompleteEvent() {
        return this.RemoveWatermarkCompleteEvent;
    }

    /**
     * Set <p>智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveWatermarkCompleteEvent <p>智能去除水印完成事件，当事件类型为 RemoveWatermark 有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveWatermarkCompleteEvent(RemoveWatermarkTask RemoveWatermarkCompleteEvent) {
        this.RemoveWatermarkCompleteEvent = RemoveWatermarkCompleteEvent;
    }

    /**
     * Get <p>视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestoreMediaCompleteEvent <p>视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RestoreMediaTask getRestoreMediaCompleteEvent() {
        return this.RestoreMediaCompleteEvent;
    }

    /**
     * Set <p>视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestoreMediaCompleteEvent <p>视频取回完成事件，当事件类型为 RestoreMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestoreMediaCompleteEvent(RestoreMediaTask RestoreMediaCompleteEvent) {
        this.RestoreMediaCompleteEvent = RestoreMediaCompleteEvent;
    }

    /**
     * Get <p>音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RebuildMediaCompleteEvent <p>音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildMediaTask getRebuildMediaCompleteEvent() {
        return this.RebuildMediaCompleteEvent;
    }

    /**
     * Set <p>音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RebuildMediaCompleteEvent <p>音画质重生完成事件，当事件类型为 RebuildMediaComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRebuildMediaCompleteEvent(RebuildMediaTask RebuildMediaCompleteEvent) {
        this.RebuildMediaCompleteEvent = RebuildMediaCompleteEvent;
    }

    /**
     * Get <p>溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractTraceWatermarkCompleteEvent <p>溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkCompleteEvent() {
        return this.ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Set <p>溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractTraceWatermarkCompleteEvent <p>溯源水印提取完成事件，当事件类型为 ExtractTraceWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractTraceWatermarkCompleteEvent(ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent) {
        this.ExtractTraceWatermarkCompleteEvent = ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Get <p>版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractCopyRightWatermarkCompleteEvent <p>版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkCompleteEvent() {
        return this.ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Set <p>版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractCopyRightWatermarkCompleteEvent <p>版权水印提取完成事件，当事件类型为 ExtractCopyRightWatermarkComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractCopyRightWatermarkCompleteEvent(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent) {
        this.ExtractCopyRightWatermarkCompleteEvent = ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Get <p>音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewAudioVideoCompleteEvent <p>音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReviewAudioVideoTask getReviewAudioVideoCompleteEvent() {
        return this.ReviewAudioVideoCompleteEvent;
    }

    /**
     * Set <p>音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewAudioVideoCompleteEvent <p>音视频审核完成事件，当事件类型为 ReviewAudioVideoComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewAudioVideoCompleteEvent(ReviewAudioVideoTask ReviewAudioVideoCompleteEvent) {
        this.ReviewAudioVideoCompleteEvent = ReviewAudioVideoCompleteEvent;
    }

    /**
     * Get <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReduceMediaBitrateCompleteEvent <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateCompleteEvent() {
        return this.ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Set <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReduceMediaBitrateCompleteEvent <p>该字段已无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReduceMediaBitrateCompleteEvent(ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent) {
        this.ReduceMediaBitrateCompleteEvent = ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Get <p>获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescribeFileAttributesCompleteEvent <p>获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeFileAttributesTask getDescribeFileAttributesCompleteEvent() {
        return this.DescribeFileAttributesCompleteEvent;
    }

    /**
     * Set <p>获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescribeFileAttributesCompleteEvent <p>获取文件属性完成事件，当事件类型为 DescribeFileAttributesComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribeFileAttributesCompleteEvent(DescribeFileAttributesTask DescribeFileAttributesCompleteEvent) {
        this.DescribeFileAttributesCompleteEvent = DescribeFileAttributesCompleteEvent;
    }

    /**
     * Get <p>音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityInspectCompleteEvent <p>音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityInspectTask getQualityInspectCompleteEvent() {
        return this.QualityInspectCompleteEvent;
    }

    /**
     * Set <p>音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityInspectCompleteEvent <p>音画质检测完成事件，当事件类型为 QualityInspectComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityInspectCompleteEvent(QualityInspectTask QualityInspectCompleteEvent) {
        this.QualityInspectCompleteEvent = QualityInspectCompleteEvent;
    }

    /**
     * Get <p>音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEnhanceCompleteEvent <p>音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityEnhanceTask getQualityEnhanceCompleteEvent() {
        return this.QualityEnhanceCompleteEvent;
    }

    /**
     * Set <p>音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEnhanceCompleteEvent <p>音画质重生完成事件，当事件类型为 QualityEnhanceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEnhanceCompleteEvent(QualityEnhanceTask QualityEnhanceCompleteEvent) {
        this.QualityEnhanceCompleteEvent = QualityEnhanceCompleteEvent;
    }

    /**
     * Get <p>媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaCastStatusChangedEvent <p>媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaCastEvent getMediaCastStatusChangedEvent() {
        return this.MediaCastStatusChangedEvent;
    }

    /**
     * Set <p>媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaCastStatusChangedEvent <p>媒体转推状态变化事件，当事件类型为 MediaCastStatusChanged 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaCastStatusChangedEvent(MediaCastEvent MediaCastStatusChangedEvent) {
        this.MediaCastStatusChangedEvent = MediaCastStatusChangedEvent;
    }

    /**
     * Get <p>剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersistenceCompleteEvent <p>剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersistenceCompleteTask getPersistenceCompleteEvent() {
        return this.PersistenceCompleteEvent;
    }

    /**
     * Set <p>剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersistenceCompleteEvent <p>剪辑固化完成事件，当事件类型为 PersistenceComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersistenceCompleteEvent(PersistenceCompleteTask PersistenceCompleteEvent) {
        this.PersistenceCompleteEvent = PersistenceCompleteEvent;
    }

    /**
     * Get <p>自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplexAdaptiveDynamicStreamingCompleteEvent <p>自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingCompleteEvent() {
        return this.ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Set <p>自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplexAdaptiveDynamicStreamingCompleteEvent <p>自适应码流任务信息，仅当 EventType 为ComplexAdaptiveDynamicStreamingComplete 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplexAdaptiveDynamicStreamingCompleteEvent(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent) {
        this.ComplexAdaptiveDynamicStreamingCompleteEvent = ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Get <p>MPS 视频处理任务信息，仅当 EventType 为 ProcessMediaByMPSComplete 时有效。</p> 
     * @return ProcessMediaByMPSCompleteEvent <p>MPS 视频处理任务信息，仅当 EventType 为 ProcessMediaByMPSComplete 时有效。</p>
     */
    public ProcessMediaByMPS getProcessMediaByMPSCompleteEvent() {
        return this.ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Set <p>MPS 视频处理任务信息，仅当 EventType 为 ProcessMediaByMPSComplete 时有效。</p>
     * @param ProcessMediaByMPSCompleteEvent <p>MPS 视频处理任务信息，仅当 EventType 为 ProcessMediaByMPSComplete 时有效。</p>
     */
    public void setProcessMediaByMPSCompleteEvent(ProcessMediaByMPS ProcessMediaByMPSCompleteEvent) {
        this.ProcessMediaByMPSCompleteEvent = ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Get <p>AIGC 生图任务信息，仅当 EventType 为 AigcImageTaskComplete 时有效。</p> 
     * @return AigcImageCompleteEvent <p>AIGC 生图任务信息，仅当 EventType 为 AigcImageTaskComplete 时有效。</p>
     */
    public AigcImageTask getAigcImageCompleteEvent() {
        return this.AigcImageCompleteEvent;
    }

    /**
     * Set <p>AIGC 生图任务信息，仅当 EventType 为 AigcImageTaskComplete 时有效。</p>
     * @param AigcImageCompleteEvent <p>AIGC 生图任务信息，仅当 EventType 为 AigcImageTaskComplete 时有效。</p>
     */
    public void setAigcImageCompleteEvent(AigcImageTask AigcImageCompleteEvent) {
        this.AigcImageCompleteEvent = AigcImageCompleteEvent;
    }

    /**
     * Get <p>AIGC 生视频任务信息，仅当 EventType 为 AigcVideoTaskComplete 时有效。</p> 
     * @return AigcVideoCompleteEvent <p>AIGC 生视频任务信息，仅当 EventType 为 AigcVideoTaskComplete 时有效。</p>
     */
    public AigcVideoTask getAigcVideoCompleteEvent() {
        return this.AigcVideoCompleteEvent;
    }

    /**
     * Set <p>AIGC 生视频任务信息，仅当 EventType 为 AigcVideoTaskComplete 时有效。</p>
     * @param AigcVideoCompleteEvent <p>AIGC 生视频任务信息，仅当 EventType 为 AigcVideoTaskComplete 时有效。</p>
     */
    public void setAigcVideoCompleteEvent(AigcVideoTask AigcVideoCompleteEvent) {
        this.AigcVideoCompleteEvent = AigcVideoCompleteEvent;
    }

    /**
     * Get <p>提取数字水印信息，仅当 EventType 为 ExtractBlindWatermarkComplete 时有效。</p> 
     * @return ExtractBlindWatermarkComplete <p>提取数字水印信息，仅当 EventType 为 ExtractBlindWatermarkComplete 时有效。</p>
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkComplete() {
        return this.ExtractBlindWatermarkComplete;
    }

    /**
     * Set <p>提取数字水印信息，仅当 EventType 为 ExtractBlindWatermarkComplete 时有效。</p>
     * @param ExtractBlindWatermarkComplete <p>提取数字水印信息，仅当 EventType 为 ExtractBlindWatermarkComplete 时有效。</p>
     */
    public void setExtractBlindWatermarkComplete(ExtractBlindWatermarkTask ExtractBlindWatermarkComplete) {
        this.ExtractBlindWatermarkComplete = ExtractBlindWatermarkComplete;
    }

    /**
     * Get <p>AIGC 场景化生图任务信息，仅当 EventType 为 SceneAigcImageCompleteEvent 时有效。</p> 
     * @return SceneAigcImageCompleteEvent <p>AIGC 场景化生图任务信息，仅当 EventType 为 SceneAigcImageCompleteEvent 时有效。</p>
     */
    public SceneAigcImageTask getSceneAigcImageCompleteEvent() {
        return this.SceneAigcImageCompleteEvent;
    }

    /**
     * Set <p>AIGC 场景化生图任务信息，仅当 EventType 为 SceneAigcImageCompleteEvent 时有效。</p>
     * @param SceneAigcImageCompleteEvent <p>AIGC 场景化生图任务信息，仅当 EventType 为 SceneAigcImageCompleteEvent 时有效。</p>
     */
    public void setSceneAigcImageCompleteEvent(SceneAigcImageTask SceneAigcImageCompleteEvent) {
        this.SceneAigcImageCompleteEvent = SceneAigcImageCompleteEvent;
    }

    /**
     * Get <p>图片异步处理任务信息，仅当 EventType 为 ProcessImageAsyncCompleteEvent 时有效。</p> 
     * @return ProcessImageAsyncCompleteEvent <p>图片异步处理任务信息，仅当 EventType 为 ProcessImageAsyncCompleteEvent 时有效。</p>
     */
    public ProcessImageAsyncTask getProcessImageAsyncCompleteEvent() {
        return this.ProcessImageAsyncCompleteEvent;
    }

    /**
     * Set <p>图片异步处理任务信息，仅当 EventType 为 ProcessImageAsyncCompleteEvent 时有效。</p>
     * @param ProcessImageAsyncCompleteEvent <p>图片异步处理任务信息，仅当 EventType 为 ProcessImageAsyncCompleteEvent 时有效。</p>
     */
    public void setProcessImageAsyncCompleteEvent(ProcessImageAsyncTask ProcessImageAsyncCompleteEvent) {
        this.ProcessImageAsyncCompleteEvent = ProcessImageAsyncCompleteEvent;
    }

    /**
     * Get <p>AIGC 自定义主体信息，仅当 EventType 为 CreateAigcAdvancedCustomElementCompleteEvent，该字段有值。</p> 
     * @return CreateAigcAdvancedCustomElementCompleteEvent <p>AIGC 自定义主体信息，仅当 EventType 为 CreateAigcAdvancedCustomElementCompleteEvent，该字段有值。</p>
     */
    public CreateAigcAdvancedCustomElementTask getCreateAigcAdvancedCustomElementCompleteEvent() {
        return this.CreateAigcAdvancedCustomElementCompleteEvent;
    }

    /**
     * Set <p>AIGC 自定义主体信息，仅当 EventType 为 CreateAigcAdvancedCustomElementCompleteEvent，该字段有值。</p>
     * @param CreateAigcAdvancedCustomElementCompleteEvent <p>AIGC 自定义主体信息，仅当 EventType 为 CreateAigcAdvancedCustomElementCompleteEvent，该字段有值。</p>
     */
    public void setCreateAigcAdvancedCustomElementCompleteEvent(CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementCompleteEvent) {
        this.CreateAigcAdvancedCustomElementCompleteEvent = CreateAigcAdvancedCustomElementCompleteEvent;
    }

    /**
     * Get <p>AIGC 自定义音色信息，仅当 EventType 为 CreateAigcCustomVoiceCompleteEvent，该字段有值。</p> 
     * @return CreateAigcCustomVoiceCompleteEvent <p>AIGC 自定义音色信息，仅当 EventType 为 CreateAigcCustomVoiceCompleteEvent，该字段有值。</p>
     */
    public CreateAigcCustomVoiceTask getCreateAigcCustomVoiceCompleteEvent() {
        return this.CreateAigcCustomVoiceCompleteEvent;
    }

    /**
     * Set <p>AIGC 自定义音色信息，仅当 EventType 为 CreateAigcCustomVoiceCompleteEvent，该字段有值。</p>
     * @param CreateAigcCustomVoiceCompleteEvent <p>AIGC 自定义音色信息，仅当 EventType 为 CreateAigcCustomVoiceCompleteEvent，该字段有值。</p>
     */
    public void setCreateAigcCustomVoiceCompleteEvent(CreateAigcCustomVoiceTask CreateAigcCustomVoiceCompleteEvent) {
        this.CreateAigcCustomVoiceCompleteEvent = CreateAigcCustomVoiceCompleteEvent;
    }

    /**
     * Get <p>异步获取 AIGC 人脸信息，仅当 EventType 为 DescribeAigcFaceInfoAsyncComplete，该字段有值。</p> 
     * @return DescribeAigcFaceInfoAsyncCompleteEvent <p>异步获取 AIGC 人脸信息，仅当 EventType 为 DescribeAigcFaceInfoAsyncComplete，该字段有值。</p>
     */
    public DescribeAigcFaceInfoAsyncTask getDescribeAigcFaceInfoAsyncCompleteEvent() {
        return this.DescribeAigcFaceInfoAsyncCompleteEvent;
    }

    /**
     * Set <p>异步获取 AIGC 人脸信息，仅当 EventType 为 DescribeAigcFaceInfoAsyncComplete，该字段有值。</p>
     * @param DescribeAigcFaceInfoAsyncCompleteEvent <p>异步获取 AIGC 人脸信息，仅当 EventType 为 DescribeAigcFaceInfoAsyncComplete，该字段有值。</p>
     */
    public void setDescribeAigcFaceInfoAsyncCompleteEvent(DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncCompleteEvent) {
        this.DescribeAigcFaceInfoAsyncCompleteEvent = DescribeAigcFaceInfoAsyncCompleteEvent;
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
        if (source.ProcessMediaByMPSCompleteEvent != null) {
            this.ProcessMediaByMPSCompleteEvent = new ProcessMediaByMPS(source.ProcessMediaByMPSCompleteEvent);
        }
        if (source.AigcImageCompleteEvent != null) {
            this.AigcImageCompleteEvent = new AigcImageTask(source.AigcImageCompleteEvent);
        }
        if (source.AigcVideoCompleteEvent != null) {
            this.AigcVideoCompleteEvent = new AigcVideoTask(source.AigcVideoCompleteEvent);
        }
        if (source.ExtractBlindWatermarkComplete != null) {
            this.ExtractBlindWatermarkComplete = new ExtractBlindWatermarkTask(source.ExtractBlindWatermarkComplete);
        }
        if (source.SceneAigcImageCompleteEvent != null) {
            this.SceneAigcImageCompleteEvent = new SceneAigcImageTask(source.SceneAigcImageCompleteEvent);
        }
        if (source.ProcessImageAsyncCompleteEvent != null) {
            this.ProcessImageAsyncCompleteEvent = new ProcessImageAsyncTask(source.ProcessImageAsyncCompleteEvent);
        }
        if (source.CreateAigcAdvancedCustomElementCompleteEvent != null) {
            this.CreateAigcAdvancedCustomElementCompleteEvent = new CreateAigcAdvancedCustomElementTask(source.CreateAigcAdvancedCustomElementCompleteEvent);
        }
        if (source.CreateAigcCustomVoiceCompleteEvent != null) {
            this.CreateAigcCustomVoiceCompleteEvent = new CreateAigcCustomVoiceTask(source.CreateAigcCustomVoiceCompleteEvent);
        }
        if (source.DescribeAigcFaceInfoAsyncCompleteEvent != null) {
            this.DescribeAigcFaceInfoAsyncCompleteEvent = new DescribeAigcFaceInfoAsyncTask(source.DescribeAigcFaceInfoAsyncCompleteEvent);
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
        this.setParamObj(map, prefix + "ProcessMediaByMPSCompleteEvent.", this.ProcessMediaByMPSCompleteEvent);
        this.setParamObj(map, prefix + "AigcImageCompleteEvent.", this.AigcImageCompleteEvent);
        this.setParamObj(map, prefix + "AigcVideoCompleteEvent.", this.AigcVideoCompleteEvent);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkComplete.", this.ExtractBlindWatermarkComplete);
        this.setParamObj(map, prefix + "SceneAigcImageCompleteEvent.", this.SceneAigcImageCompleteEvent);
        this.setParamObj(map, prefix + "ProcessImageAsyncCompleteEvent.", this.ProcessImageAsyncCompleteEvent);
        this.setParamObj(map, prefix + "CreateAigcAdvancedCustomElementCompleteEvent.", this.CreateAigcAdvancedCustomElementCompleteEvent);
        this.setParamObj(map, prefix + "CreateAigcCustomVoiceCompleteEvent.", this.CreateAigcCustomVoiceCompleteEvent);
        this.setParamObj(map, prefix + "DescribeAigcFaceInfoAsyncCompleteEvent.", this.DescribeAigcFaceInfoAsyncCompleteEvent);

    }
}

