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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCasterInputInfoResponse extends AbstractModel {

    /**
    * rtmp协议输入源播放地址。
注：仅可作为预览使用，不可分发。
    */
    @SerializedName("InputPlayUrl")
    @Expose
    private String InputPlayUrl;

    /**
    * webrtc协议播放地址。
注：
1. 需配合使用腾讯云快直播播放SDK使用才可正常播放。
2. 仅作为预览使用，不可分发。
    */
    @SerializedName("InputWebRTCPlayUrl")
    @Expose
    private String InputWebRTCPlayUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get rtmp协议输入源播放地址。
注：仅可作为预览使用，不可分发。 
     * @return InputPlayUrl rtmp协议输入源播放地址。
注：仅可作为预览使用，不可分发。
     */
    public String getInputPlayUrl() {
        return this.InputPlayUrl;
    }

    /**
     * Set rtmp协议输入源播放地址。
注：仅可作为预览使用，不可分发。
     * @param InputPlayUrl rtmp协议输入源播放地址。
注：仅可作为预览使用，不可分发。
     */
    public void setInputPlayUrl(String InputPlayUrl) {
        this.InputPlayUrl = InputPlayUrl;
    }

    /**
     * Get webrtc协议播放地址。
注：
1. 需配合使用腾讯云快直播播放SDK使用才可正常播放。
2. 仅作为预览使用，不可分发。 
     * @return InputWebRTCPlayUrl webrtc协议播放地址。
注：
1. 需配合使用腾讯云快直播播放SDK使用才可正常播放。
2. 仅作为预览使用，不可分发。
     */
    public String getInputWebRTCPlayUrl() {
        return this.InputWebRTCPlayUrl;
    }

    /**
     * Set webrtc协议播放地址。
注：
1. 需配合使用腾讯云快直播播放SDK使用才可正常播放。
2. 仅作为预览使用，不可分发。
     * @param InputWebRTCPlayUrl webrtc协议播放地址。
注：
1. 需配合使用腾讯云快直播播放SDK使用才可正常播放。
2. 仅作为预览使用，不可分发。
     */
    public void setInputWebRTCPlayUrl(String InputWebRTCPlayUrl) {
        this.InputWebRTCPlayUrl = InputWebRTCPlayUrl;
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

    public AddCasterInputInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCasterInputInfoResponse(AddCasterInputInfoResponse source) {
        if (source.InputPlayUrl != null) {
            this.InputPlayUrl = new String(source.InputPlayUrl);
        }
        if (source.InputWebRTCPlayUrl != null) {
            this.InputWebRTCPlayUrl = new String(source.InputWebRTCPlayUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputPlayUrl", this.InputPlayUrl);
        this.setParamSimple(map, prefix + "InputWebRTCPlayUrl", this.InputWebRTCPlayUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

