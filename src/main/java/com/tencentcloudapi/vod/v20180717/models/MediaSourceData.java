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

public class MediaSourceData extends AbstractModel{

    /**
    * 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>Unknown：未知来源。</li>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 用户创建文件时透传的字段
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
     * Get 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>Unknown：未知来源。</li> 
     * @return SourceType 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>Unknown：未知来源。</li>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>Unknown：未知来源。</li>
     * @param SourceType 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>Unknown：未知来源。</li>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 用户创建文件时透传的字段 
     * @return SourceContext 用户创建文件时透传的字段
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set 用户创建文件时透传的字段
     * @param SourceContext 用户创建文件时透传的字段
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);

    }
}

