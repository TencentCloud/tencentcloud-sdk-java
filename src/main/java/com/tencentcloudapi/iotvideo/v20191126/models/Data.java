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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Data extends AbstractModel{

    /**
    * 直播协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 流媒体播放地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URI")
    @Expose
    private String URI;

    /**
    * 流媒体地址过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 视频编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoCodec")
    @Expose
    private String VideoCodec;

    /**
    * 音频编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioCodec")
    @Expose
    private String AudioCodec;

    /**
     * Get 直播协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 直播协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 直播协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 直播协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 流媒体播放地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URI 流媒体播放地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getURI() {
        return this.URI;
    }

    /**
     * Set 流媒体播放地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param URI 流媒体播放地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURI(String URI) {
        this.URI = URI;
    }

    /**
     * Get 流媒体地址过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 流媒体地址过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 流媒体地址过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 流媒体地址过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 视频编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoCodec 视频编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoCodec() {
        return this.VideoCodec;
    }

    /**
     * Set 视频编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoCodec 视频编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoCodec(String VideoCodec) {
        this.VideoCodec = VideoCodec;
    }

    /**
     * Get 音频编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioCodec 音频编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioCodec() {
        return this.AudioCodec;
    }

    /**
     * Set 音频编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioCodec 音频编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioCodec(String AudioCodec) {
        this.AudioCodec = AudioCodec;
    }

    public Data() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Data(Data source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.URI != null) {
            this.URI = new String(source.URI);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.VideoCodec != null) {
            this.VideoCodec = new String(source.VideoCodec);
        }
        if (source.AudioCodec != null) {
            this.AudioCodec = new String(source.AudioCodec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "URI", this.URI);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "VideoCodec", this.VideoCodec);
        this.setParamSimple(map, prefix + "AudioCodec", this.AudioCodec);

    }
}

