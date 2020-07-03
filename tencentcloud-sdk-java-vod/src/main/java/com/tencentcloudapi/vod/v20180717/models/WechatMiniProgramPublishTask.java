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

public class WechatMiniProgramPublishTask extends AbstractModel{

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
    * 发布视频所对应的转码模板 ID，为 0 代表原始视频。
    */
    @SerializedName("SourceDefinition")
    @Expose
    private Long SourceDefinition;

    /**
    * 微信小程序视频发布状态，取值：
<li>Pass：发布成功；</li>
<li>Failed：发布失败；</li>
<li>Rejected：审核未通过。</li>
    */
    @SerializedName("PublishResult")
    @Expose
    private String PublishResult;

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
     * Get 微信小程序视频发布状态，取值：
<li>Pass：发布成功；</li>
<li>Failed：发布失败；</li>
<li>Rejected：审核未通过。</li> 
     * @return PublishResult 微信小程序视频发布状态，取值：
<li>Pass：发布成功；</li>
<li>Failed：发布失败；</li>
<li>Rejected：审核未通过。</li>
     */
    public String getPublishResult() {
        return this.PublishResult;
    }

    /**
     * Set 微信小程序视频发布状态，取值：
<li>Pass：发布成功；</li>
<li>Failed：发布失败；</li>
<li>Rejected：审核未通过。</li>
     * @param PublishResult 微信小程序视频发布状态，取值：
<li>Pass：发布成功；</li>
<li>Failed：发布失败；</li>
<li>Rejected：审核未通过。</li>
     */
    public void setPublishResult(String PublishResult) {
        this.PublishResult = PublishResult;
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
        this.setParamSimple(map, prefix + "SourceDefinition", this.SourceDefinition);
        this.setParamSimple(map, prefix + "PublishResult", this.PublishResult);

    }
}

