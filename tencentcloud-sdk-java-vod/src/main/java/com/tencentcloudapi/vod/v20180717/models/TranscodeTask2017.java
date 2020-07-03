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

public class TranscodeTask2017 extends AbstractModel{

    /**
    * 转码任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

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
    * 被转码文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 被转码文件名称。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 视频时长，单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 封面地址。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 视频转码后生成的播放信息。
    */
    @SerializedName("PlayInfoSet")
    @Expose
    private TranscodePlayInfo2017 [] PlayInfoSet;

    /**
     * Get 转码任务 ID。 
     * @return TaskId 转码任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 转码任务 ID。
     * @param TaskId 转码任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get 被转码文件 ID。 
     * @return FileId 被转码文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 被转码文件 ID。
     * @param FileId 被转码文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 被转码文件名称。 
     * @return FileName 被转码文件名称。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 被转码文件名称。
     * @param FileName 被转码文件名称。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 视频时长，单位：秒。 
     * @return Duration 视频时长，单位：秒。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 视频时长，单位：秒。
     * @param Duration 视频时长，单位：秒。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 封面地址。 
     * @return CoverUrl 封面地址。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 封面地址。
     * @param CoverUrl 封面地址。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 视频转码后生成的播放信息。 
     * @return PlayInfoSet 视频转码后生成的播放信息。
     */
    public TranscodePlayInfo2017 [] getPlayInfoSet() {
        return this.PlayInfoSet;
    }

    /**
     * Set 视频转码后生成的播放信息。
     * @param PlayInfoSet 视频转码后生成的播放信息。
     */
    public void setPlayInfoSet(TranscodePlayInfo2017 [] PlayInfoSet) {
        this.PlayInfoSet = PlayInfoSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamArrayObj(map, prefix + "PlayInfoSet.", this.PlayInfoSet);

    }
}

