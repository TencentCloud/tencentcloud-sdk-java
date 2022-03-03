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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskRequest extends AbstractModel{

    /**
    * 媒资文件ID，最长32B
    */
    @SerializedName("MediaId")
    @Expose
    private String MediaId;

    /**
    * 媒资素材先验知识，相关限制参考MediaPreknownInfo
    */
    @SerializedName("MediaPreknownInfo")
    @Expose
    private MediaPreknownInfo MediaPreknownInfo;

    /**
    * 任务名称，最长100个中文字符
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 是否上传转码后的视频，仅设置true时上传，默认为false
    */
    @SerializedName("UploadVideo")
    @Expose
    private Boolean UploadVideo;

    /**
    * 自定义标签，可用于查询
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 任务分析完成的回调地址，该设置优先级高于控制台全局的设置；
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
     * Get 媒资文件ID，最长32B 
     * @return MediaId 媒资文件ID，最长32B
     */
    public String getMediaId() {
        return this.MediaId;
    }

    /**
     * Set 媒资文件ID，最长32B
     * @param MediaId 媒资文件ID，最长32B
     */
    public void setMediaId(String MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get 媒资素材先验知识，相关限制参考MediaPreknownInfo 
     * @return MediaPreknownInfo 媒资素材先验知识，相关限制参考MediaPreknownInfo
     */
    public MediaPreknownInfo getMediaPreknownInfo() {
        return this.MediaPreknownInfo;
    }

    /**
     * Set 媒资素材先验知识，相关限制参考MediaPreknownInfo
     * @param MediaPreknownInfo 媒资素材先验知识，相关限制参考MediaPreknownInfo
     */
    public void setMediaPreknownInfo(MediaPreknownInfo MediaPreknownInfo) {
        this.MediaPreknownInfo = MediaPreknownInfo;
    }

    /**
     * Get 任务名称，最长100个中文字符 
     * @return TaskName 任务名称，最长100个中文字符
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称，最长100个中文字符
     * @param TaskName 任务名称，最长100个中文字符
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 是否上传转码后的视频，仅设置true时上传，默认为false 
     * @return UploadVideo 是否上传转码后的视频，仅设置true时上传，默认为false
     */
    public Boolean getUploadVideo() {
        return this.UploadVideo;
    }

    /**
     * Set 是否上传转码后的视频，仅设置true时上传，默认为false
     * @param UploadVideo 是否上传转码后的视频，仅设置true时上传，默认为false
     */
    public void setUploadVideo(Boolean UploadVideo) {
        this.UploadVideo = UploadVideo;
    }

    /**
     * Get 自定义标签，可用于查询 
     * @return Label 自定义标签，可用于查询
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 自定义标签，可用于查询
     * @param Label 自定义标签，可用于查询
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 任务分析完成的回调地址，该设置优先级高于控制台全局的设置； 
     * @return CallbackURL 任务分析完成的回调地址，该设置优先级高于控制台全局的设置；
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set 任务分析完成的回调地址，该设置优先级高于控制台全局的设置；
     * @param CallbackURL 任务分析完成的回调地址，该设置优先级高于控制台全局的设置；
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    public CreateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskRequest(CreateTaskRequest source) {
        if (source.MediaId != null) {
            this.MediaId = new String(source.MediaId);
        }
        if (source.MediaPreknownInfo != null) {
            this.MediaPreknownInfo = new MediaPreknownInfo(source.MediaPreknownInfo);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.UploadVideo != null) {
            this.UploadVideo = new Boolean(source.UploadVideo);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamObj(map, prefix + "MediaPreknownInfo.", this.MediaPreknownInfo);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "UploadVideo", this.UploadVideo);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);

    }
}

