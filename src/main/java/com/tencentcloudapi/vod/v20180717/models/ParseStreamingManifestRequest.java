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

public class ParseStreamingManifestRequest extends AbstractModel{

    /**
    * 待解析的索引文件内容。
    */
    @SerializedName("MediaManifestContent")
    @Expose
    private String MediaManifestContent;

    /**
    * 视频索引文件格式。默认 m3u8 格式。
<li>m3u8</li>
<li>mpd</li>
    */
    @SerializedName("ManifestType")
    @Expose
    private String ManifestType;

    /**
     * Get 待解析的索引文件内容。 
     * @return MediaManifestContent 待解析的索引文件内容。
     */
    public String getMediaManifestContent() {
        return this.MediaManifestContent;
    }

    /**
     * Set 待解析的索引文件内容。
     * @param MediaManifestContent 待解析的索引文件内容。
     */
    public void setMediaManifestContent(String MediaManifestContent) {
        this.MediaManifestContent = MediaManifestContent;
    }

    /**
     * Get 视频索引文件格式。默认 m3u8 格式。
<li>m3u8</li>
<li>mpd</li> 
     * @return ManifestType 视频索引文件格式。默认 m3u8 格式。
<li>m3u8</li>
<li>mpd</li>
     */
    public String getManifestType() {
        return this.ManifestType;
    }

    /**
     * Set 视频索引文件格式。默认 m3u8 格式。
<li>m3u8</li>
<li>mpd</li>
     * @param ManifestType 视频索引文件格式。默认 m3u8 格式。
<li>m3u8</li>
<li>mpd</li>
     */
    public void setManifestType(String ManifestType) {
        this.ManifestType = ManifestType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaManifestContent", this.MediaManifestContent);
        this.setParamSimple(map, prefix + "ManifestType", this.ManifestType);

    }
}

