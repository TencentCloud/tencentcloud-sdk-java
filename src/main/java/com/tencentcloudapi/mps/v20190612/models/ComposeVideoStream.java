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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeVideoStream extends AbstractModel {

    /**
    * 视频流的编码方式，可选值：
<li>H.264：H.264 编码（默认）。</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 视频帧率，取值范围：[0, 60]，单位：Hz。  
默认值：0，表示和第一个视频帧率一致。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 参考码率，单位 kbps，范围：50~35000。
如果设置，编码时会尽量按该码率进行编码。
如果不设置，服务将通过画面复杂度自动采用合适的码率。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get 视频流的编码方式，可选值：
<li>H.264：H.264 编码（默认）。</li> 
     * @return Codec 视频流的编码方式，可选值：
<li>H.264：H.264 编码（默认）。</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 视频流的编码方式，可选值：
<li>H.264：H.264 编码（默认）。</li>
     * @param Codec 视频流的编码方式，可选值：
<li>H.264：H.264 编码（默认）。</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 视频帧率，取值范围：[0, 60]，单位：Hz。  
默认值：0，表示和第一个视频帧率一致。 
     * @return Fps 视频帧率，取值范围：[0, 60]，单位：Hz。  
默认值：0，表示和第一个视频帧率一致。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，取值范围：[0, 60]，单位：Hz。  
默认值：0，表示和第一个视频帧率一致。
     * @param Fps 视频帧率，取值范围：[0, 60]，单位：Hz。  
默认值：0，表示和第一个视频帧率一致。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 参考码率，单位 kbps，范围：50~35000。
如果设置，编码时会尽量按该码率进行编码。
如果不设置，服务将通过画面复杂度自动采用合适的码率。 
     * @return Bitrate 参考码率，单位 kbps，范围：50~35000。
如果设置，编码时会尽量按该码率进行编码。
如果不设置，服务将通过画面复杂度自动采用合适的码率。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 参考码率，单位 kbps，范围：50~35000。
如果设置，编码时会尽量按该码率进行编码。
如果不设置，服务将通过画面复杂度自动采用合适的码率。
     * @param Bitrate 参考码率，单位 kbps，范围：50~35000。
如果设置，编码时会尽量按该码率进行编码。
如果不设置，服务将通过画面复杂度自动采用合适的码率。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    public ComposeVideoStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeVideoStream(ComposeVideoStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);

    }
}

