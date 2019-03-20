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

public class WechatPublishTask  extends AbstractModel{

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 发布视频文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 微信发布模板 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 发布视频所对应的转码模板 ID，为 0 代表原始视频。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceDefinition")
    @Expose
    private Long SourceDefinition;

    /**
    * 微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatStatus")
    @Expose
    private String WechatStatus;

    /**
    * 微信 Vid。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatVid")
    @Expose
    private String WechatVid;

    /**
    * 微信地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatUrl")
    @Expose
    private String WechatUrl;

    /**
     * 获取任务 ID。
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
     * @return Status 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
     * @param Status 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取发布视频文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 发布视频文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置发布视频文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 发布视频文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取微信发布模板 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Definition 微信发布模板 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置微信发布模板 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Definition 微信发布模板 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取发布视频所对应的转码模板 ID，为 0 代表原始视频。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SourceDefinition 发布视频所对应的转码模板 ID，为 0 代表原始视频。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceDefinition() {
        return this.SourceDefinition;
    }

    /**
     * 设置发布视频所对应的转码模板 ID，为 0 代表原始视频。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceDefinition 发布视频所对应的转码模板 ID，为 0 代表原始视频。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceDefinition(Long SourceDefinition) {
        this.SourceDefinition = SourceDefinition;
    }

    /**
     * 获取微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return WechatStatus 微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatStatus() {
        return this.WechatStatus;
    }

    /**
     * 设置微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatStatus 微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatStatus(String WechatStatus) {
        this.WechatStatus = WechatStatus;
    }

    /**
     * 获取微信 Vid。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WechatVid 微信 Vid。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatVid() {
        return this.WechatVid;
    }

    /**
     * 设置微信 Vid。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatVid 微信 Vid。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatVid(String WechatVid) {
        this.WechatVid = WechatVid;
    }

    /**
     * 获取微信地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WechatUrl 微信地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWechatUrl() {
        return this.WechatUrl;
    }

    /**
     * 设置微信地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatUrl 微信地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatUrl(String WechatUrl) {
        this.WechatUrl = WechatUrl;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SourceDefinition", this.SourceDefinition);
        this.setParamSimple(map, prefix + "WechatStatus", this.WechatStatus);
        this.setParamSimple(map, prefix + "WechatVid", this.WechatVid);
        this.setParamSimple(map, prefix + "WechatUrl", this.WechatUrl);

    }
}

