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

public class EventContent extends AbstractModel{

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
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>WechatPublishComplete：微信发布完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
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
    * 微信发布完成事件，当事件类型为 WechatPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * 视频转码完成事件，当事件类型为 TranscodeComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * 视频拼接完成事件，当事件类型为 ConcatComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * 视频剪辑完成事件，当事件类型为 ClipComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * 视频截取雪碧图完成事件，当事件类型为 CreateImageSpriteComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * 视频按时间点截图完成事件，当事件类型为 CreateSnapshotByTimeOffsetComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * 制作媒体文件任务完成事件，当事件类型为 ComposeMediaComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * 微信小程序发布任务完成事件，当事件类型为 WechatMiniProgramPublishComplete 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

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
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>WechatPublishComplete：微信发布完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
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
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>WechatPublishComplete：微信发布完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
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
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>WechatPublishComplete：微信发布完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
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
<li>PullComplete：视频转拉完成；</li>
<li>EditMediaComplete：视频编辑完成；</li>
<li>WechatPublishComplete：微信发布完成；</li>
<li>ComposeMediaComplete：制作媒体文件完成；</li>
<li>WechatMiniProgramPublishComplete：微信小程序发布完成。</li>
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
        this.setParamObj(map, prefix + "WechatPublishCompleteEvent.", this.WechatPublishCompleteEvent);
        this.setParamObj(map, prefix + "TranscodeCompleteEvent.", this.TranscodeCompleteEvent);
        this.setParamObj(map, prefix + "ConcatCompleteEvent.", this.ConcatCompleteEvent);
        this.setParamObj(map, prefix + "ClipCompleteEvent.", this.ClipCompleteEvent);
        this.setParamObj(map, prefix + "CreateImageSpriteCompleteEvent.", this.CreateImageSpriteCompleteEvent);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetCompleteEvent.", this.SnapshotByTimeOffsetCompleteEvent);
        this.setParamObj(map, prefix + "ComposeMediaCompleteEvent.", this.ComposeMediaCompleteEvent);
        this.setParamObj(map, prefix + "WechatMiniProgramPublishCompleteEvent.", this.WechatMiniProgramPublishCompleteEvent);

    }
}

