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

public class RemoveWaterMarkTaskOutput extends AbstractModel{

    /**
    * 媒体文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件类型，例如 mp4、mp3 等。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 媒体文件播放地址。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件名称，最长 64 个字符。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 元信息。包括大小、时长、视频流信息、音频流信息等。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get 媒体文件 ID。 
     * @return FileId 媒体文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件 ID。
     * @param FileId 媒体文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件类型，例如 mp4、mp3 等。 
     * @return FileType 文件类型，例如 mp4、mp3 等。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，例如 mp4、mp3 等。
     * @param FileType 文件类型，例如 mp4、mp3 等。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 媒体文件播放地址。 
     * @return FileUrl 媒体文件播放地址。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 媒体文件播放地址。
     * @param FileUrl 媒体文件播放地址。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件名称，最长 64 个字符。 
     * @return MediaName 文件名称，最长 64 个字符。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 文件名称，最长 64 个字符。
     * @param MediaName 文件名称，最长 64 个字符。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get 元信息。包括大小、时长、视频流信息、音频流信息等。 
     * @return MetaData 元信息。包括大小、时长、视频流信息、音频流信息等。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 元信息。包括大小、时长、视频流信息、音频流信息等。
     * @param MetaData 元信息。包括大小、时长、视频流信息、音频流信息等。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public RemoveWaterMarkTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveWaterMarkTaskOutput(RemoveWaterMarkTaskOutput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

