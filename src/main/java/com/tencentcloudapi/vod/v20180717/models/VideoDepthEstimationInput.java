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

public class VideoDepthEstimationInput extends AbstractModel {

    /**
    * <p>输入视频的 URL，支持以下三种形式：</p><li>以 <code>http://</code> 或 <code>https://</code> 开头的网络地址；</li><li><code>vod://</code> 开头的点播媒体文件 ID，例如 <code>vod://5285890815916760123</code>；</li><li><code>data:video/&lt;ext&gt;;base64,</code> 开头的 base64 编码视频数据。</li>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>输入视频的媒体文件 ID，仅当 Url 以 <code>vod://</code> 开头时有值。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>输入视频的 URL，支持以下三种形式：</p><li>以 <code>http://</code> 或 <code>https://</code> 开头的网络地址；</li><li><code>vod://</code> 开头的点播媒体文件 ID，例如 <code>vod://5285890815916760123</code>；</li><li><code>data:video/&lt;ext&gt;;base64,</code> 开头的 base64 编码视频数据。</li> 
     * @return Url <p>输入视频的 URL，支持以下三种形式：</p><li>以 <code>http://</code> 或 <code>https://</code> 开头的网络地址；</li><li><code>vod://</code> 开头的点播媒体文件 ID，例如 <code>vod://5285890815916760123</code>；</li><li><code>data:video/&lt;ext&gt;;base64,</code> 开头的 base64 编码视频数据。</li>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>输入视频的 URL，支持以下三种形式：</p><li>以 <code>http://</code> 或 <code>https://</code> 开头的网络地址；</li><li><code>vod://</code> 开头的点播媒体文件 ID，例如 <code>vod://5285890815916760123</code>；</li><li><code>data:video/&lt;ext&gt;;base64,</code> 开头的 base64 编码视频数据。</li>
     * @param Url <p>输入视频的 URL，支持以下三种形式：</p><li>以 <code>http://</code> 或 <code>https://</code> 开头的网络地址；</li><li><code>vod://</code> 开头的点播媒体文件 ID，例如 <code>vod://5285890815916760123</code>；</li><li><code>data:video/&lt;ext&gt;;base64,</code> 开头的 base64 编码视频数据。</li>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>输入视频的媒体文件 ID，仅当 Url 以 <code>vod://</code> 开头时有值。</p> 
     * @return FileId <p>输入视频的媒体文件 ID，仅当 Url 以 <code>vod://</code> 开头时有值。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>输入视频的媒体文件 ID，仅当 Url 以 <code>vod://</code> 开头时有值。</p>
     * @param FileId <p>输入视频的媒体文件 ID，仅当 Url 以 <code>vod://</code> 开头时有值。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public VideoDepthEstimationInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDepthEstimationInput(VideoDepthEstimationInput source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

