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

public class WechatPublishTask extends AbstractModel{

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
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 发布视频文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 微信发布模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 发布视频所对应的转码模板 ID，为 0 代表原始视频。
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
    */
    @SerializedName("WechatStatus")
    @Expose
    private String WechatStatus;

    /**
    * 微信 Vid。
    */
    @SerializedName("WechatVid")
    @Expose
    private String WechatVid;

    /**
    * 微信地址。
    */
    @SerializedName("WechatUrl")
    @Expose
    private String WechatUrl;

    /**
     * Get 任务 ID。 
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态，取值：
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
     * Set 任务状态，取值：
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
     * Get 错误码
<li>0：成功；</li>
<li>其他值：失败。</li> 
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息。 
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 发布视频文件 ID。 
     * @return FileId 发布视频文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 发布视频文件 ID。
     * @param FileId 发布视频文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 微信发布模板 ID。 
     * @return Definition 微信发布模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 微信发布模板 ID。
     * @param Definition 微信发布模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 发布视频所对应的转码模板 ID，为 0 代表原始视频。 
     * @return SourceDefinition 发布视频所对应的转码模板 ID，为 0 代表原始视频。
     */
    public Long getSourceDefinition() {
        return this.SourceDefinition;
    }

    /**
     * Set 发布视频所对应的转码模板 ID，为 0 代表原始视频。
     * @param SourceDefinition 发布视频所对应的转码模板 ID，为 0 代表原始视频。
     */
    public void setSourceDefinition(Long SourceDefinition) {
        this.SourceDefinition = SourceDefinition;
    }

    /**
     * Get 微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li> 
     * @return WechatStatus 微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
     */
    public String getWechatStatus() {
        return this.WechatStatus;
    }

    /**
     * Set 微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
     * @param WechatStatus 微信发布状态，取值：
<li>FAIL：失败；</li>
<li>SUCCESS：成功；</li>
<li>AUDITNOTPASS：审核未通过；</li>
<li>NOTTRIGGERED：尚未发起微信发布。</li>
     */
    public void setWechatStatus(String WechatStatus) {
        this.WechatStatus = WechatStatus;
    }

    /**
     * Get 微信 Vid。 
     * @return WechatVid 微信 Vid。
     */
    public String getWechatVid() {
        return this.WechatVid;
    }

    /**
     * Set 微信 Vid。
     * @param WechatVid 微信 Vid。
     */
    public void setWechatVid(String WechatVid) {
        this.WechatVid = WechatVid;
    }

    /**
     * Get 微信地址。 
     * @return WechatUrl 微信地址。
     */
    public String getWechatUrl() {
        return this.WechatUrl;
    }

    /**
     * Set 微信地址。
     * @param WechatUrl 微信地址。
     */
    public void setWechatUrl(String WechatUrl) {
        this.WechatUrl = WechatUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
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

