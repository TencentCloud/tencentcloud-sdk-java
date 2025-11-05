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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditResultDetailExternal extends AbstractModel {

    /**
    * 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 房间 ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * UserID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 恶意分数
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 音频 Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 文件Id
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * ASR结果
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get 任务 ID 
     * @return TaskId 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID
     * @param TaskId 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 房间 ID 
     * @return RoomId 房间 ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间 ID
     * @param RoomId 房间 ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get UserID 
     * @return OpenId UserID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set UserID
     * @param OpenId UserID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 标签 
     * @return Label 标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
     * @param Label 标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 恶意分数 
     * @return Rate 恶意分数
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set 恶意分数
     * @param Rate 恶意分数
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 音频 Url 
     * @return Url 音频 Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 音频 Url
     * @param Url 音频 Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 文件Id 
     * @return FileId 文件Id
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件Id
     * @param FileId 文件Id
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get ASR结果 
     * @return Info ASR结果
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set ASR结果
     * @param Info ASR结果
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    public AuditResultDetailExternal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditResultDetailExternal(AuditResultDetailExternal source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

