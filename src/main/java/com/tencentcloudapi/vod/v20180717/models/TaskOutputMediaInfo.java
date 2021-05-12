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

public class TaskOutputMediaInfo extends AbstractModel{

    /**
    * 媒体文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 转拉完成后生成的媒体文件基础信息。
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

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
     * Get 转拉完成后生成的媒体文件基础信息。 
     * @return MediaBasicInfo 转拉完成后生成的媒体文件基础信息。
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * Set 转拉完成后生成的媒体文件基础信息。
     * @param MediaBasicInfo 转拉完成后生成的媒体文件基础信息。
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    public TaskOutputMediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOutputMediaInfo(TaskOutputMediaInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaBasicInfo != null) {
            this.MediaBasicInfo = new MediaBasicInfo(source.MediaBasicInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);

    }
}

