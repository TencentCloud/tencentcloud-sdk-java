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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAudioModerationSyncTaskRequest extends AbstractModel{

    /**
    * Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 数据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 音频文件资源格式，当前为mp3，wav，请按照实际文件格式填入
    */
    @SerializedName("FileFormat")
    @Expose
    private String FileFormat;

    /**
    * 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据Base64编码，短音频同步接口仅传入可音频内容；
支持范围：文件大小不能超过5M，时长不可超过60s，码率范围为8-16Kbps；
支持格式：wav、mp3
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 音频资源访问链接，与FileContent参数必须二选一输入；
支持范围：同FileContent；
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
     * Get Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。 
     * @return BizType Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
     * @param BizType Biztype为策略的具体的编号，用于接口调度，在内容安全控制台中可配置。不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；调用时不传入Biztype代表采用默认的识别策略。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 数据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 
     * @return DataId 数据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 数据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     * @param DataId 数据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 音频文件资源格式，当前为mp3，wav，请按照实际文件格式填入 
     * @return FileFormat 音频文件资源格式，当前为mp3，wav，请按照实际文件格式填入
     */
    public String getFileFormat() {
        return this.FileFormat;
    }

    /**
     * Set 音频文件资源格式，当前为mp3，wav，请按照实际文件格式填入
     * @param FileFormat 音频文件资源格式，当前为mp3，wav，请按照实际文件格式填入
     */
    public void setFileFormat(String FileFormat) {
        this.FileFormat = FileFormat;
    }

    /**
     * Get 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 
     * @return Name 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     * @param Name 文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据Base64编码，短音频同步接口仅传入可音频内容；
支持范围：文件大小不能超过5M，时长不可超过60s，码率范围为8-16Kbps；
支持格式：wav、mp3 
     * @return FileContent 数据Base64编码，短音频同步接口仅传入可音频内容；
支持范围：文件大小不能超过5M，时长不可超过60s，码率范围为8-16Kbps；
支持格式：wav、mp3
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 数据Base64编码，短音频同步接口仅传入可音频内容；
支持范围：文件大小不能超过5M，时长不可超过60s，码率范围为8-16Kbps；
支持格式：wav、mp3
     * @param FileContent 数据Base64编码，短音频同步接口仅传入可音频内容；
支持范围：文件大小不能超过5M，时长不可超过60s，码率范围为8-16Kbps；
支持格式：wav、mp3
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 音频资源访问链接，与FileContent参数必须二选一输入；
支持范围：同FileContent； 
     * @return FileUrl 音频资源访问链接，与FileContent参数必须二选一输入；
支持范围：同FileContent；
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 音频资源访问链接，与FileContent参数必须二选一输入；
支持范围：同FileContent；
     * @param FileUrl 音频资源访问链接，与FileContent参数必须二选一输入；
支持范围：同FileContent；
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    public CreateAudioModerationSyncTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAudioModerationSyncTaskRequest(CreateAudioModerationSyncTaskRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.FileFormat != null) {
            this.FileFormat = new String(source.FileFormat);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "FileFormat", this.FileFormat);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);

    }
}

