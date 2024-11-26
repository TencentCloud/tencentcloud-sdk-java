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

public class CreateCasterInputPushUrlRequest extends AbstractModel {

    /**
    * 导播台ID
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * 请求生成推流地址的输入Index。
允许范围[1,20]。
    */
    @SerializedName("InputIndex")
    @Expose
    private Long InputIndex;

    /**
    * 生成推流地址协议。
范围[rtmp,webrtc]。
注：获取webrtc推流地址时，需配合腾讯云快直播推流sdk才可成功推流。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 导播台ID 
     * @return CasterId 导播台ID
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set 导播台ID
     * @param CasterId 导播台ID
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get 请求生成推流地址的输入Index。
允许范围[1,20]。 
     * @return InputIndex 请求生成推流地址的输入Index。
允许范围[1,20]。
     */
    public Long getInputIndex() {
        return this.InputIndex;
    }

    /**
     * Set 请求生成推流地址的输入Index。
允许范围[1,20]。
     * @param InputIndex 请求生成推流地址的输入Index。
允许范围[1,20]。
     */
    public void setInputIndex(Long InputIndex) {
        this.InputIndex = InputIndex;
    }

    /**
     * Get 生成推流地址协议。
范围[rtmp,webrtc]。
注：获取webrtc推流地址时，需配合腾讯云快直播推流sdk才可成功推流。 
     * @return Protocol 生成推流地址协议。
范围[rtmp,webrtc]。
注：获取webrtc推流地址时，需配合腾讯云快直播推流sdk才可成功推流。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 生成推流地址协议。
范围[rtmp,webrtc]。
注：获取webrtc推流地址时，需配合腾讯云快直播推流sdk才可成功推流。
     * @param Protocol 生成推流地址协议。
范围[rtmp,webrtc]。
注：获取webrtc推流地址时，需配合腾讯云快直播推流sdk才可成功推流。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public CreateCasterInputPushUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCasterInputPushUrlRequest(CreateCasterInputPushUrlRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.InputIndex != null) {
            this.InputIndex = new Long(source.InputIndex);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "InputIndex", this.InputIndex);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

