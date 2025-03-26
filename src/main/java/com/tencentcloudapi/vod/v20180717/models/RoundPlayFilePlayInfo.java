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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoundPlayFilePlayInfo extends AbstractModel {

    /**
    * 播单节目的 ID，由系统分配。
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 媒体文件标识。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("StartPlayTime")
    @Expose
    private String StartPlayTime;

    /**
    * 播放时长，单位为秒。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 播放进度，单位为秒。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
     * Get 播单节目的 ID，由系统分配。 
     * @return ItemId 播单节目的 ID，由系统分配。
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 播单节目的 ID，由系统分配。
     * @param ItemId 播单节目的 ID，由系统分配。
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 媒体文件标识。 
     * @return FileId 媒体文件标识。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件标识。
     * @param FileId 媒体文件标识。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return StartPlayTime 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getStartPlayTime() {
        return this.StartPlayTime;
    }

    /**
     * Set 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param StartPlayTime 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setStartPlayTime(String StartPlayTime) {
        this.StartPlayTime = StartPlayTime;
    }

    /**
     * Get 播放时长，单位为秒。 
     * @return Duration 播放时长，单位为秒。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 播放时长，单位为秒。
     * @param Duration 播放时长，单位为秒。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 播放进度，单位为秒。 
     * @return Progress 播放进度，单位为秒。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 播放进度，单位为秒。
     * @param Progress 播放进度，单位为秒。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    public RoundPlayFilePlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayFilePlayInfo(RoundPlayFilePlayInfo source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StartPlayTime != null) {
            this.StartPlayTime = new String(source.StartPlayTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "StartPlayTime", this.StartPlayTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

