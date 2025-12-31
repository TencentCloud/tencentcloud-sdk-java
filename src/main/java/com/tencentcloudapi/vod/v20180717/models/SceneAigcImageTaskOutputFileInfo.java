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

public class SceneAigcImageTaskOutputFileInfo extends AbstractModel {

    /**
    * 存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li>

    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。当 StorageMode 为 Permanent 时有效。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。当 StorageMode 为 Permanent 时有效。

    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 文件类型，例如 mp4、flv 等。
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
    * 媒体文件 ID。当 StorageMode 为 Permanent 时有效。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 输出视频的元信息。当 StorageMode 为 Permanent 时有效。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get 存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li>
 
     * @return StorageMode 存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li>

     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li>

     * @param StorageMode 存储模式。取值有： <li>Permanent：永久存储；</li> <li>Temporary：临时存储；</li>

     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。当 StorageMode 为 Permanent 时有效。 
     * @return MediaName 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。当 StorageMode 为 Permanent 时有效。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。当 StorageMode 为 Permanent 时有效。
     * @param MediaName 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。当 StorageMode 为 Permanent 时有效。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。当 StorageMode 为 Permanent 时有效。
 
     * @return ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。当 StorageMode 为 Permanent 时有效。

     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。当 StorageMode 为 Permanent 时有效。

     * @param ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。当 StorageMode 为 Permanent 时有效。

     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return ExpireTime 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param ExpireTime 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 文件类型，例如 mp4、flv 等。 
     * @return FileType 文件类型，例如 mp4、flv 等。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，例如 mp4、flv 等。
     * @param FileType 文件类型，例如 mp4、flv 等。
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
     * Get 媒体文件 ID。当 StorageMode 为 Permanent 时有效。 
     * @return FileId 媒体文件 ID。当 StorageMode 为 Permanent 时有效。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件 ID。当 StorageMode 为 Permanent 时有效。
     * @param FileId 媒体文件 ID。当 StorageMode 为 Permanent 时有效。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 输出视频的元信息。当 StorageMode 为 Permanent 时有效。 
     * @return MetaData 输出视频的元信息。当 StorageMode 为 Permanent 时有效。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 输出视频的元信息。当 StorageMode 为 Permanent 时有效。
     * @param MetaData 输出视频的元信息。当 StorageMode 为 Permanent 时有效。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public SceneAigcImageTaskOutputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTaskOutputFileInfo(SceneAigcImageTaskOutputFileInfo source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
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
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

