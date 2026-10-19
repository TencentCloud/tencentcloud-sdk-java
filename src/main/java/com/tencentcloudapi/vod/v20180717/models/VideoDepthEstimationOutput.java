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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoDepthEstimationOutput extends AbstractModel {

    /**
    * <p>输出文件的存储模式，取值：</p><li>Temporary：临时存储，文件默认 7 天后删除；</li><li>Permanent：永久存储，保存到点播媒资库。</li>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>输出文件的媒体名称，仅 StorageMode 为 Permanent 时有值。</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。<br><font color="red">注意：</font>StorageMode 为 Temporary 时，该字段为文件生成时间加 7 天。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>输出文件的类型，取值 mp4。</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>输出文件的媒体文件 ID，仅 StorageMode 为 Permanent 时有值。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>输出文件的播放地址。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>输出视频的元信息。</p>
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get <p>输出文件的存储模式，取值：</p><li>Temporary：临时存储，文件默认 7 天后删除；</li><li>Permanent：永久存储，保存到点播媒资库。</li> 
     * @return StorageMode <p>输出文件的存储模式，取值：</p><li>Temporary：临时存储，文件默认 7 天后删除；</li><li>Permanent：永久存储，保存到点播媒资库。</li>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>输出文件的存储模式，取值：</p><li>Temporary：临时存储，文件默认 7 天后删除；</li><li>Permanent：永久存储，保存到点播媒资库。</li>
     * @param StorageMode <p>输出文件的存储模式，取值：</p><li>Temporary：临时存储，文件默认 7 天后删除；</li><li>Permanent：永久存储，保存到点播媒资库。</li>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>输出文件的媒体名称，仅 StorageMode 为 Permanent 时有值。</p> 
     * @return MediaName <p>输出文件的媒体名称，仅 StorageMode 为 Permanent 时有值。</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>输出文件的媒体名称，仅 StorageMode 为 Permanent 时有值。</p>
     * @param MediaName <p>输出文件的媒体名称，仅 StorageMode 为 Permanent 时有值。</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。<br><font color="red">注意：</font>StorageMode 为 Temporary 时，该字段为文件生成时间加 7 天。</p> 
     * @return ExpireTime <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。<br><font color="red">注意：</font>StorageMode 为 Temporary 时，该字段为文件生成时间加 7 天。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。<br><font color="red">注意：</font>StorageMode 为 Temporary 时，该字段为文件生成时间加 7 天。</p>
     * @param ExpireTime <p>输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601 标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。<br><font color="red">注意：</font>StorageMode 为 Temporary 时，该字段为文件生成时间加 7 天。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>输出文件的类型，取值 mp4。</p> 
     * @return FileType <p>输出文件的类型，取值 mp4。</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>输出文件的类型，取值 mp4。</p>
     * @param FileType <p>输出文件的类型，取值 mp4。</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>输出文件的媒体文件 ID，仅 StorageMode 为 Permanent 时有值。</p> 
     * @return FileId <p>输出文件的媒体文件 ID，仅 StorageMode 为 Permanent 时有值。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>输出文件的媒体文件 ID，仅 StorageMode 为 Permanent 时有值。</p>
     * @param FileId <p>输出文件的媒体文件 ID，仅 StorageMode 为 Permanent 时有值。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>输出文件的播放地址。</p> 
     * @return FileUrl <p>输出文件的播放地址。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>输出文件的播放地址。</p>
     * @param FileUrl <p>输出文件的播放地址。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>输出视频的元信息。</p> 
     * @return MetaData <p>输出视频的元信息。</p>
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>输出视频的元信息。</p>
     * @param MetaData <p>输出视频的元信息。</p>
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public VideoDepthEstimationOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDepthEstimationOutput(VideoDepthEstimationOutput source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

