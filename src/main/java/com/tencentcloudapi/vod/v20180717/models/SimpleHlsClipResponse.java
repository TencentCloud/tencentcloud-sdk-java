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

public class SimpleHlsClipResponse extends AbstractModel{

    /**
    * 裁剪后的视频地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 裁剪后的视频元信息。目前`Size`，`Rotate`，`VideoDuration`，`AudioDuration` 几个字段暂时缺省，没有真实数据。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 剪辑固化后的视频的媒体文件的唯一标识。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 裁剪后的视频地址。 
     * @return Url 裁剪后的视频地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 裁剪后的视频地址。
     * @param Url 裁剪后的视频地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 裁剪后的视频元信息。目前`Size`，`Rotate`，`VideoDuration`，`AudioDuration` 几个字段暂时缺省，没有真实数据。 
     * @return MetaData 裁剪后的视频元信息。目前`Size`，`Rotate`，`VideoDuration`，`AudioDuration` 几个字段暂时缺省，没有真实数据。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 裁剪后的视频元信息。目前`Size`，`Rotate`，`VideoDuration`，`AudioDuration` 几个字段暂时缺省，没有真实数据。
     * @param MetaData 裁剪后的视频元信息。目前`Size`，`Rotate`，`VideoDuration`，`AudioDuration` 几个字段暂时缺省，没有真实数据。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get 剪辑固化后的视频的媒体文件的唯一标识。 
     * @return FileId 剪辑固化后的视频的媒体文件的唯一标识。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 剪辑固化后的视频的媒体文件的唯一标识。
     * @param FileId 剪辑固化后的视频的媒体文件的唯一标识。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SimpleHlsClipResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleHlsClipResponse(SimpleHlsClipResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

