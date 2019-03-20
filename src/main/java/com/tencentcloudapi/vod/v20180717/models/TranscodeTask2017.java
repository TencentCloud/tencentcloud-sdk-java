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

public class TranscodeTask2017  extends AbstractModel{

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
    * 被转码文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 被转码文件名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 封面地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 视频转码后生成的播放信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayInfoSet")
    @Expose
    private TranscodePlayInfo2017 [] PlayInfoSet;

    /**
     * 获取转码任务 ID。
     * @return TaskId 转码任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置转码任务 ID。
     * @param TaskId 转码任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * 获取被转码文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 被转码文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置被转码文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 被转码文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取被转码文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileName 被转码文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置被转码文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 被转码文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Duration 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * 设置视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取封面地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CoverUrl 封面地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * 设置封面地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverUrl 封面地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * 获取视频转码后生成的播放信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return PlayInfoSet 视频转码后生成的播放信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodePlayInfo2017 [] getPlayInfoSet() {
        return this.PlayInfoSet;
    }

    /**
     * 设置视频转码后生成的播放信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayInfoSet 视频转码后生成的播放信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayInfoSet(TranscodePlayInfo2017 [] PlayInfoSet) {
        this.PlayInfoSet = PlayInfoSet;
    }

    /**
     * 内部实现，用户禁止调用
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

