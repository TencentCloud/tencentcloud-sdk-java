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
    * 视频 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 元信息。包括大小、时长、视频流信息、音频流信息等。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get 视频 ID。 
     * @return FileId 视频 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 视频 ID。
     * @param FileId 视频 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

