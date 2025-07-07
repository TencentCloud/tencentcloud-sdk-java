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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoDownloadTaskRequest extends AbstractModel {

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 默认1倍速，支持（1,2,4,8）倍速
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 转码后的mp4文件过期时间（支持7,15,30,60,90,180,365）
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * 下载文件格式，当前仅支持（1：mp4）
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * 完成策略（0：拉流失败但是录像不完整则认为任务失败，不生成 MP4；1：拉流失败但是录像不完整则认为任务成功，生成 mp4）
    */
    @SerializedName("CompletionPolicy")
    @Expose
    private Long CompletionPolicy;

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 默认1倍速，支持（1,2,4,8）倍速 
     * @return Scale 默认1倍速，支持（1,2,4,8）倍速
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 默认1倍速，支持（1,2,4,8）倍速
     * @param Scale 默认1倍速，支持（1,2,4,8）倍速
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 转码后的mp4文件过期时间（支持7,15,30,60,90,180,365） 
     * @return Expire 转码后的mp4文件过期时间（支持7,15,30,60,90,180,365）
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 转码后的mp4文件过期时间（支持7,15,30,60,90,180,365）
     * @param Expire 转码后的mp4文件过期时间（支持7,15,30,60,90,180,365）
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get 下载文件格式，当前仅支持（1：mp4） 
     * @return FileType 下载文件格式，当前仅支持（1：mp4）
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set 下载文件格式，当前仅支持（1：mp4）
     * @param FileType 下载文件格式，当前仅支持（1：mp4）
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 完成策略（0：拉流失败但是录像不完整则认为任务失败，不生成 MP4；1：拉流失败但是录像不完整则认为任务成功，生成 mp4） 
     * @return CompletionPolicy 完成策略（0：拉流失败但是录像不完整则认为任务失败，不生成 MP4；1：拉流失败但是录像不完整则认为任务成功，生成 mp4）
     */
    public Long getCompletionPolicy() {
        return this.CompletionPolicy;
    }

    /**
     * Set 完成策略（0：拉流失败但是录像不完整则认为任务失败，不生成 MP4；1：拉流失败但是录像不完整则认为任务成功，生成 mp4）
     * @param CompletionPolicy 完成策略（0：拉流失败但是录像不完整则认为任务失败，不生成 MP4；1：拉流失败但是录像不完整则认为任务成功，生成 mp4）
     */
    public void setCompletionPolicy(Long CompletionPolicy) {
        this.CompletionPolicy = CompletionPolicy;
    }

    public CreateVideoDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoDownloadTaskRequest(CreateVideoDownloadTaskRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.CompletionPolicy != null) {
            this.CompletionPolicy = new Long(source.CompletionPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CompletionPolicy", this.CompletionPolicy);

    }
}

