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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResultFile extends AbstractModel{

    /**
    * 文件链接。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 文件大小，部分任务支持，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 媒体信息，对于媒体文件，部分任务支持返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaInfo")
    @Expose
    private MediaResultInfo MediaInfo;

    /**
     * Get 文件链接。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 文件链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件链接。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 文件链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 文件大小，部分任务支持，单位：字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小，部分任务支持，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，部分任务支持，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小，部分任务支持，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 媒体信息，对于媒体文件，部分任务支持返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaInfo 媒体信息，对于媒体文件，部分任务支持返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaResultInfo getMediaInfo() {
        return this.MediaInfo;
    }

    /**
     * Set 媒体信息，对于媒体文件，部分任务支持返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaInfo 媒体信息，对于媒体文件，部分任务支持返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaInfo(MediaResultInfo MediaInfo) {
        this.MediaInfo = MediaInfo;
    }

    public TaskResultFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResultFile(TaskResultFile source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.MediaInfo != null) {
            this.MediaInfo = new MediaResultInfo(source.MediaInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamObj(map, prefix + "MediaInfo.", this.MediaInfo);

    }
}

