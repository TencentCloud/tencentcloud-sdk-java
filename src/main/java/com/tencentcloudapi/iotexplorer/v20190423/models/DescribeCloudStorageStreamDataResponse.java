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

public class DescribeCloudStorageStreamDataResponse extends AbstractModel {

    /**
    * 图片流视频地址
    */
    @SerializedName("VideoStream")
    @Expose
    private String VideoStream;

    /**
    * 图片流音频地址
    */
    @SerializedName("AudioStream")
    @Expose
    private String AudioStream;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图片流视频地址 
     * @return VideoStream 图片流视频地址
     */
    public String getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set 图片流视频地址
     * @param VideoStream 图片流视频地址
     */
    public void setVideoStream(String VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get 图片流音频地址 
     * @return AudioStream 图片流音频地址
     */
    public String getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set 图片流音频地址
     * @param AudioStream 图片流音频地址
     */
    public void setAudioStream(String AudioStream) {
        this.AudioStream = AudioStream;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloudStorageStreamDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageStreamDataResponse(DescribeCloudStorageStreamDataResponse source) {
        if (source.VideoStream != null) {
            this.VideoStream = new String(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new String(source.AudioStream);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoStream", this.VideoStream);
        this.setParamSimple(map, prefix + "AudioStream", this.AudioStream);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

