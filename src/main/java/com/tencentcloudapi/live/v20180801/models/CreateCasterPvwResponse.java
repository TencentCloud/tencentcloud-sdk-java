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

public class CreateCasterPvwResponse extends AbstractModel {

    /**
    * 预监任务的画面rtmp协议预览地址。
注：该预览地址仅供画面预览，不可分发。
    */
    @SerializedName("PvwPlayUrl")
    @Expose
    private String PvwPlayUrl;

    /**
    * 预监任务的webrtc协议预览画面。
注：
1. 该预览地址仅供预览，不可分发。
2. webrtc播放地址，需配合腾讯云快直播播放sdk使用

    */
    @SerializedName("PvwWebRTCPlayUrl")
    @Expose
    private String PvwWebRTCPlayUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 预监任务的画面rtmp协议预览地址。
注：该预览地址仅供画面预览，不可分发。 
     * @return PvwPlayUrl 预监任务的画面rtmp协议预览地址。
注：该预览地址仅供画面预览，不可分发。
     */
    public String getPvwPlayUrl() {
        return this.PvwPlayUrl;
    }

    /**
     * Set 预监任务的画面rtmp协议预览地址。
注：该预览地址仅供画面预览，不可分发。
     * @param PvwPlayUrl 预监任务的画面rtmp协议预览地址。
注：该预览地址仅供画面预览，不可分发。
     */
    public void setPvwPlayUrl(String PvwPlayUrl) {
        this.PvwPlayUrl = PvwPlayUrl;
    }

    /**
     * Get 预监任务的webrtc协议预览画面。
注：
1. 该预览地址仅供预览，不可分发。
2. webrtc播放地址，需配合腾讯云快直播播放sdk使用
 
     * @return PvwWebRTCPlayUrl 预监任务的webrtc协议预览画面。
注：
1. 该预览地址仅供预览，不可分发。
2. webrtc播放地址，需配合腾讯云快直播播放sdk使用

     */
    public String getPvwWebRTCPlayUrl() {
        return this.PvwWebRTCPlayUrl;
    }

    /**
     * Set 预监任务的webrtc协议预览画面。
注：
1. 该预览地址仅供预览，不可分发。
2. webrtc播放地址，需配合腾讯云快直播播放sdk使用

     * @param PvwWebRTCPlayUrl 预监任务的webrtc协议预览画面。
注：
1. 该预览地址仅供预览，不可分发。
2. webrtc播放地址，需配合腾讯云快直播播放sdk使用

     */
    public void setPvwWebRTCPlayUrl(String PvwWebRTCPlayUrl) {
        this.PvwWebRTCPlayUrl = PvwWebRTCPlayUrl;
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

    public CreateCasterPvwResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCasterPvwResponse(CreateCasterPvwResponse source) {
        if (source.PvwPlayUrl != null) {
            this.PvwPlayUrl = new String(source.PvwPlayUrl);
        }
        if (source.PvwWebRTCPlayUrl != null) {
            this.PvwWebRTCPlayUrl = new String(source.PvwWebRTCPlayUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PvwPlayUrl", this.PvwPlayUrl);
        this.setParamSimple(map, prefix + "PvwWebRTCPlayUrl", this.PvwWebRTCPlayUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

