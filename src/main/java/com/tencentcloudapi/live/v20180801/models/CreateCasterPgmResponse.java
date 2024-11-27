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

public class CreateCasterPgmResponse extends AbstractModel {

    /**
    * 主监任务的rtmp协议预览地址。
注：该地址仅供预览，不可分发。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PgmPlayUrl")
    @Expose
    private String PgmPlayUrl;

    /**
    * 注：该字段已废弃，请结合腾讯云直播播放地址生成策略生成cdn播放地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdnPlayUrl")
    @Expose
    private String CdnPlayUrl;

    /**
    * 主监任务在腾讯云直播侧的流ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdnStreamId")
    @Expose
    private String CdnStreamId;

    /**
    * 主监任务的webrtc协议播放地址。
注：
1. 该预览地址仅作为预览，不可分发。
2. webrtc播放地址需配合腾讯云快直播播放sdk使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PgmWebRTCPlayUrl")
    @Expose
    private String PgmWebRTCPlayUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主监任务的rtmp协议预览地址。
注：该地址仅供预览，不可分发。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PgmPlayUrl 主监任务的rtmp协议预览地址。
注：该地址仅供预览，不可分发。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPgmPlayUrl() {
        return this.PgmPlayUrl;
    }

    /**
     * Set 主监任务的rtmp协议预览地址。
注：该地址仅供预览，不可分发。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PgmPlayUrl 主监任务的rtmp协议预览地址。
注：该地址仅供预览，不可分发。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPgmPlayUrl(String PgmPlayUrl) {
        this.PgmPlayUrl = PgmPlayUrl;
    }

    /**
     * Get 注：该字段已废弃，请结合腾讯云直播播放地址生成策略生成cdn播放地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdnPlayUrl 注：该字段已废弃，请结合腾讯云直播播放地址生成策略生成cdn播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdnPlayUrl() {
        return this.CdnPlayUrl;
    }

    /**
     * Set 注：该字段已废弃，请结合腾讯云直播播放地址生成策略生成cdn播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdnPlayUrl 注：该字段已废弃，请结合腾讯云直播播放地址生成策略生成cdn播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdnPlayUrl(String CdnPlayUrl) {
        this.CdnPlayUrl = CdnPlayUrl;
    }

    /**
     * Get 主监任务在腾讯云直播侧的流ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdnStreamId 主监任务在腾讯云直播侧的流ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdnStreamId() {
        return this.CdnStreamId;
    }

    /**
     * Set 主监任务在腾讯云直播侧的流ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdnStreamId 主监任务在腾讯云直播侧的流ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdnStreamId(String CdnStreamId) {
        this.CdnStreamId = CdnStreamId;
    }

    /**
     * Get 主监任务的webrtc协议播放地址。
注：
1. 该预览地址仅作为预览，不可分发。
2. webrtc播放地址需配合腾讯云快直播播放sdk使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PgmWebRTCPlayUrl 主监任务的webrtc协议播放地址。
注：
1. 该预览地址仅作为预览，不可分发。
2. webrtc播放地址需配合腾讯云快直播播放sdk使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPgmWebRTCPlayUrl() {
        return this.PgmWebRTCPlayUrl;
    }

    /**
     * Set 主监任务的webrtc协议播放地址。
注：
1. 该预览地址仅作为预览，不可分发。
2. webrtc播放地址需配合腾讯云快直播播放sdk使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PgmWebRTCPlayUrl 主监任务的webrtc协议播放地址。
注：
1. 该预览地址仅作为预览，不可分发。
2. webrtc播放地址需配合腾讯云快直播播放sdk使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPgmWebRTCPlayUrl(String PgmWebRTCPlayUrl) {
        this.PgmWebRTCPlayUrl = PgmWebRTCPlayUrl;
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

    public CreateCasterPgmResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCasterPgmResponse(CreateCasterPgmResponse source) {
        if (source.PgmPlayUrl != null) {
            this.PgmPlayUrl = new String(source.PgmPlayUrl);
        }
        if (source.CdnPlayUrl != null) {
            this.CdnPlayUrl = new String(source.CdnPlayUrl);
        }
        if (source.CdnStreamId != null) {
            this.CdnStreamId = new String(source.CdnStreamId);
        }
        if (source.PgmWebRTCPlayUrl != null) {
            this.PgmWebRTCPlayUrl = new String(source.PgmWebRTCPlayUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PgmPlayUrl", this.PgmPlayUrl);
        this.setParamSimple(map, prefix + "CdnPlayUrl", this.CdnPlayUrl);
        this.setParamSimple(map, prefix + "CdnStreamId", this.CdnStreamId);
        this.setParamSimple(map, prefix + "PgmWebRTCPlayUrl", this.PgmWebRTCPlayUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

