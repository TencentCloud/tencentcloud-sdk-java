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

public class DescribeCasterPlayUrlResponse extends AbstractModel {

    /**
    * 播放url。
当导播台不存在预监或主监时，若请求预监或主监的播放地址，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayUrl")
    @Expose
    private String PlayUrl;

    /**
    * webrtc协议播放地址。
当导播台不存在预监或主监时，若请求预监或主监的webrtc播放地址，该字段为空。
注：webrtc协议播放地址需配合腾讯云快直播播放sdk方可使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebRTCPlayUrl")
    @Expose
    private String WebRTCPlayUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 播放url。
当导播台不存在预监或主监时，若请求预监或主监的播放地址，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayUrl 播放url。
当导播台不存在预监或主监时，若请求预监或主监的播放地址，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlayUrl() {
        return this.PlayUrl;
    }

    /**
     * Set 播放url。
当导播台不存在预监或主监时，若请求预监或主监的播放地址，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayUrl 播放url。
当导播台不存在预监或主监时，若请求预监或主监的播放地址，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayUrl(String PlayUrl) {
        this.PlayUrl = PlayUrl;
    }

    /**
     * Get webrtc协议播放地址。
当导播台不存在预监或主监时，若请求预监或主监的webrtc播放地址，该字段为空。
注：webrtc协议播放地址需配合腾讯云快直播播放sdk方可使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebRTCPlayUrl webrtc协议播放地址。
当导播台不存在预监或主监时，若请求预监或主监的webrtc播放地址，该字段为空。
注：webrtc协议播放地址需配合腾讯云快直播播放sdk方可使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebRTCPlayUrl() {
        return this.WebRTCPlayUrl;
    }

    /**
     * Set webrtc协议播放地址。
当导播台不存在预监或主监时，若请求预监或主监的webrtc播放地址，该字段为空。
注：webrtc协议播放地址需配合腾讯云快直播播放sdk方可使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebRTCPlayUrl webrtc协议播放地址。
当导播台不存在预监或主监时，若请求预监或主监的webrtc播放地址，该字段为空。
注：webrtc协议播放地址需配合腾讯云快直播播放sdk方可使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebRTCPlayUrl(String WebRTCPlayUrl) {
        this.WebRTCPlayUrl = WebRTCPlayUrl;
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

    public DescribeCasterPlayUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCasterPlayUrlResponse(DescribeCasterPlayUrlResponse source) {
        if (source.PlayUrl != null) {
            this.PlayUrl = new String(source.PlayUrl);
        }
        if (source.WebRTCPlayUrl != null) {
            this.WebRTCPlayUrl = new String(source.WebRTCPlayUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayUrl", this.PlayUrl);
        this.setParamSimple(map, prefix + "WebRTCPlayUrl", this.WebRTCPlayUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

