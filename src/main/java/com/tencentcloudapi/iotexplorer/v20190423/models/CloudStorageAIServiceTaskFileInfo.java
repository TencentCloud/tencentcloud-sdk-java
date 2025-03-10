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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorageAIServiceTaskFileInfo extends AbstractModel {

    /**
    * 文件名称（含扩展名）
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小（单位：bytes）
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件下载 URL
    */
    @SerializedName("DownloadURL")
    @Expose
    private String DownloadURL;

    /**
    * 文件的 MIME Type
    */
    @SerializedName("MimeType")
    @Expose
    private String MimeType;

    /**
    * 视频文件元数据（仅当文件为视频类型时包含该字段）
    */
    @SerializedName("VideoMetaInfo")
    @Expose
    private CloudStorageAIServiceTaskVideoMetaInfo VideoMetaInfo;

    /**
     * Get 文件名称（含扩展名） 
     * @return FileName 文件名称（含扩展名）
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称（含扩展名）
     * @param FileName 文件名称（含扩展名）
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小（单位：bytes） 
     * @return FileSize 文件大小（单位：bytes）
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小（单位：bytes）
     * @param FileSize 文件大小（单位：bytes）
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件下载 URL 
     * @return DownloadURL 文件下载 URL
     */
    public String getDownloadURL() {
        return this.DownloadURL;
    }

    /**
     * Set 文件下载 URL
     * @param DownloadURL 文件下载 URL
     */
    public void setDownloadURL(String DownloadURL) {
        this.DownloadURL = DownloadURL;
    }

    /**
     * Get 文件的 MIME Type 
     * @return MimeType 文件的 MIME Type
     */
    public String getMimeType() {
        return this.MimeType;
    }

    /**
     * Set 文件的 MIME Type
     * @param MimeType 文件的 MIME Type
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * Get 视频文件元数据（仅当文件为视频类型时包含该字段） 
     * @return VideoMetaInfo 视频文件元数据（仅当文件为视频类型时包含该字段）
     */
    public CloudStorageAIServiceTaskVideoMetaInfo getVideoMetaInfo() {
        return this.VideoMetaInfo;
    }

    /**
     * Set 视频文件元数据（仅当文件为视频类型时包含该字段）
     * @param VideoMetaInfo 视频文件元数据（仅当文件为视频类型时包含该字段）
     */
    public void setVideoMetaInfo(CloudStorageAIServiceTaskVideoMetaInfo VideoMetaInfo) {
        this.VideoMetaInfo = VideoMetaInfo;
    }

    public CloudStorageAIServiceTaskFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStorageAIServiceTaskFileInfo(CloudStorageAIServiceTaskFileInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.DownloadURL != null) {
            this.DownloadURL = new String(source.DownloadURL);
        }
        if (source.MimeType != null) {
            this.MimeType = new String(source.MimeType);
        }
        if (source.VideoMetaInfo != null) {
            this.VideoMetaInfo = new CloudStorageAIServiceTaskVideoMetaInfo(source.VideoMetaInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "DownloadURL", this.DownloadURL);
        this.setParamSimple(map, prefix + "MimeType", this.MimeType);
        this.setParamObj(map, prefix + "VideoMetaInfo.", this.VideoMetaInfo);

    }
}

