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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorageAIServiceTaskVideoMetaInfo extends AbstractModel {

    /**
    * 视频对应的缩略图的文件名称（含扩展名）
    */
    @SerializedName("ThumbnailFileName")
    @Expose
    private String ThumbnailFileName;

    /**
    * 视频时长（单位：毫秒）
    */
    @SerializedName("DurationMilliSeconds")
    @Expose
    private Long DurationMilliSeconds;

    /**
     * Get 视频对应的缩略图的文件名称（含扩展名） 
     * @return ThumbnailFileName 视频对应的缩略图的文件名称（含扩展名）
     */
    public String getThumbnailFileName() {
        return this.ThumbnailFileName;
    }

    /**
     * Set 视频对应的缩略图的文件名称（含扩展名）
     * @param ThumbnailFileName 视频对应的缩略图的文件名称（含扩展名）
     */
    public void setThumbnailFileName(String ThumbnailFileName) {
        this.ThumbnailFileName = ThumbnailFileName;
    }

    /**
     * Get 视频时长（单位：毫秒） 
     * @return DurationMilliSeconds 视频时长（单位：毫秒）
     */
    public Long getDurationMilliSeconds() {
        return this.DurationMilliSeconds;
    }

    /**
     * Set 视频时长（单位：毫秒）
     * @param DurationMilliSeconds 视频时长（单位：毫秒）
     */
    public void setDurationMilliSeconds(Long DurationMilliSeconds) {
        this.DurationMilliSeconds = DurationMilliSeconds;
    }

    public CloudStorageAIServiceTaskVideoMetaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStorageAIServiceTaskVideoMetaInfo(CloudStorageAIServiceTaskVideoMetaInfo source) {
        if (source.ThumbnailFileName != null) {
            this.ThumbnailFileName = new String(source.ThumbnailFileName);
        }
        if (source.DurationMilliSeconds != null) {
            this.DurationMilliSeconds = new Long(source.DurationMilliSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThumbnailFileName", this.ThumbnailFileName);
        this.setParamSimple(map, prefix + "DurationMilliSeconds", this.DurationMilliSeconds);

    }
}

