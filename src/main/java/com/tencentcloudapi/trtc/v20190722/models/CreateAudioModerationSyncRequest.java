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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAudioModerationSyncRequest extends AbstractModel {

    /**
    * <p>sdkappid app账号</p>
    */
    @SerializedName("Sdkappid")
    @Expose
    private Long Sdkappid;

    /**
    * <p>BizType为策略的具体的编号, GME业务 2_2_3_sdkappid</p>
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>音频格式，当FileUrl为空时，必填。音频文件资源格式，当前支持格式：wav、mp3、m4a，请按照实际文件格式填入。 示例值：mp3</p>
    */
    @SerializedName("FileFormat")
    @Expose
    private String FileFormat;

    /**
    * <p>文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 示例值：file_name</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>数据Base64编码，短音频同步接口仅传入可音频内容； 支持范围：文件大小不能超过5M，时长不可超过60s； 支持格式：wav (PCM编码)、mp3、m4a (采样率：16kHz~48kHz，位深：16bit 小端，声道数：单声道/双声道，建议格式：16kHz/16bit/单声道)。 示例值：1</p>
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * <p>音频资源访问链接，与FileContent参数必须二选一输入； 支持范围及格式：同FileContent；</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
     * Get <p>sdkappid app账号</p> 
     * @return Sdkappid <p>sdkappid app账号</p>
     */
    public Long getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set <p>sdkappid app账号</p>
     * @param Sdkappid <p>sdkappid app账号</p>
     */
    public void setSdkappid(Long Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Get <p>BizType为策略的具体的编号, GME业务 2_2_3_sdkappid</p> 
     * @return BizType <p>BizType为策略的具体的编号, GME业务 2_2_3_sdkappid</p>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>BizType为策略的具体的编号, GME业务 2_2_3_sdkappid</p>
     * @param BizType <p>BizType为策略的具体的编号, GME业务 2_2_3_sdkappid</p>
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符</p> 
     * @return DataId <p>据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符</p>
     * @param DataId <p>据标识，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>音频格式，当FileUrl为空时，必填。音频文件资源格式，当前支持格式：wav、mp3、m4a，请按照实际文件格式填入。 示例值：mp3</p> 
     * @return FileFormat <p>音频格式，当FileUrl为空时，必填。音频文件资源格式，当前支持格式：wav、mp3、m4a，请按照实际文件格式填入。 示例值：mp3</p>
     */
    public String getFileFormat() {
        return this.FileFormat;
    }

    /**
     * Set <p>音频格式，当FileUrl为空时，必填。音频文件资源格式，当前支持格式：wav、mp3、m4a，请按照实际文件格式填入。 示例值：mp3</p>
     * @param FileFormat <p>音频格式，当FileUrl为空时，必填。音频文件资源格式，当前支持格式：wav、mp3、m4a，请按照实际文件格式填入。 示例值：mp3</p>
     */
    public void setFileFormat(String FileFormat) {
        this.FileFormat = FileFormat;
    }

    /**
     * Get <p>文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 示例值：file_name</p> 
     * @return FileName <p>文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 示例值：file_name</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 示例值：file_name</p>
     * @param FileName <p>文件名称，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 示例值：file_name</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>数据Base64编码，短音频同步接口仅传入可音频内容； 支持范围：文件大小不能超过5M，时长不可超过60s； 支持格式：wav (PCM编码)、mp3、m4a (采样率：16kHz~48kHz，位深：16bit 小端，声道数：单声道/双声道，建议格式：16kHz/16bit/单声道)。 示例值：1</p> 
     * @return FileContent <p>数据Base64编码，短音频同步接口仅传入可音频内容； 支持范围：文件大小不能超过5M，时长不可超过60s； 支持格式：wav (PCM编码)、mp3、m4a (采样率：16kHz~48kHz，位深：16bit 小端，声道数：单声道/双声道，建议格式：16kHz/16bit/单声道)。 示例值：1</p>
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set <p>数据Base64编码，短音频同步接口仅传入可音频内容； 支持范围：文件大小不能超过5M，时长不可超过60s； 支持格式：wav (PCM编码)、mp3、m4a (采样率：16kHz~48kHz，位深：16bit 小端，声道数：单声道/双声道，建议格式：16kHz/16bit/单声道)。 示例值：1</p>
     * @param FileContent <p>数据Base64编码，短音频同步接口仅传入可音频内容； 支持范围：文件大小不能超过5M，时长不可超过60s； 支持格式：wav (PCM编码)、mp3、m4a (采样率：16kHz~48kHz，位深：16bit 小端，声道数：单声道/双声道，建议格式：16kHz/16bit/单声道)。 示例值：1</p>
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get <p>音频资源访问链接，与FileContent参数必须二选一输入； 支持范围及格式：同FileContent；</p> 
     * @return FileUrl <p>音频资源访问链接，与FileContent参数必须二选一输入； 支持范围及格式：同FileContent；</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>音频资源访问链接，与FileContent参数必须二选一输入； 支持范围及格式：同FileContent；</p>
     * @param FileUrl <p>音频资源访问链接，与FileContent参数必须二选一输入； 支持范围及格式：同FileContent；</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    public CreateAudioModerationSyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAudioModerationSyncRequest(CreateAudioModerationSyncRequest source) {
        if (source.Sdkappid != null) {
            this.Sdkappid = new Long(source.Sdkappid);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.FileFormat != null) {
            this.FileFormat = new String(source.FileFormat);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
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
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "FileFormat", this.FileFormat);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);

    }
}

