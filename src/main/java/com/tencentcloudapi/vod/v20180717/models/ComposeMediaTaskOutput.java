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

public class ComposeMediaTaskOutput  extends AbstractModel{

    /**
    * 文件类型，例如 mp4、mp3 等。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 媒体文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 媒体文件播放地址。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
     * 获取文件类型，例如 mp4、mp3 等。
     * @return FileType 文件类型，例如 mp4、mp3 等。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * 设置文件类型，例如 mp4、mp3 等。
     * @param FileType 文件类型，例如 mp4、mp3 等。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * 获取媒体文件 ID。
     * @return FileId 媒体文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置媒体文件 ID。
     * @param FileId 媒体文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取媒体文件播放地址。
     * @return FileUrl 媒体文件播放地址。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置媒体文件播放地址。
     * @param FileUrl 媒体文件播放地址。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);

    }
}

