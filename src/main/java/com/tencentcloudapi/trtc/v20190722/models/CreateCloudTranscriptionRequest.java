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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudTranscriptionRequest extends AbstractModel {

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转录的房间所对应的SdkAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * <p>转录服务加入TRTC房间的参数。</p>
    */
    @SerializedName("TranscriptionParam")
    @Expose
    private TranscriptionParam TranscriptionParam;

    /**
    * <p>转录服务ASR使用的参数。</p>
    */
    @SerializedName("AsrParam")
    @Expose
    private AsrParam AsrParam;

    /**
    * <p>转录服务翻译使用的参数。</p>
    */
    @SerializedName("TranslationParam")
    @Expose
    private TranslationParam TranslationParam;

    /**
    * <p>转录服务TTS使用的参数。</p>
    */
    @SerializedName("TTSParam")
    @Expose
    private TTSParam [] TTSParam;

    /**
     * Get <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转录的房间所对应的SdkAppId相同。</p> 
     * @return SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转录的房间所对应的SdkAppId相同。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转录的房间所对应的SdkAppId相同。</p>
     * @param SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转录的房间所对应的SdkAppId相同。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p> 
     * @return RoomId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
     * @param RoomId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#roomid">RoomId</a>，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p> 
     * @return RoomIdType <p>房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set <p>房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
     * @param RoomIdType <p>房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get <p>转录服务加入TRTC房间的参数。</p> 
     * @return TranscriptionParam <p>转录服务加入TRTC房间的参数。</p>
     */
    public TranscriptionParam getTranscriptionParam() {
        return this.TranscriptionParam;
    }

    /**
     * Set <p>转录服务加入TRTC房间的参数。</p>
     * @param TranscriptionParam <p>转录服务加入TRTC房间的参数。</p>
     */
    public void setTranscriptionParam(TranscriptionParam TranscriptionParam) {
        this.TranscriptionParam = TranscriptionParam;
    }

    /**
     * Get <p>转录服务ASR使用的参数。</p> 
     * @return AsrParam <p>转录服务ASR使用的参数。</p>
     */
    public AsrParam getAsrParam() {
        return this.AsrParam;
    }

    /**
     * Set <p>转录服务ASR使用的参数。</p>
     * @param AsrParam <p>转录服务ASR使用的参数。</p>
     */
    public void setAsrParam(AsrParam AsrParam) {
        this.AsrParam = AsrParam;
    }

    /**
     * Get <p>转录服务翻译使用的参数。</p> 
     * @return TranslationParam <p>转录服务翻译使用的参数。</p>
     */
    public TranslationParam getTranslationParam() {
        return this.TranslationParam;
    }

    /**
     * Set <p>转录服务翻译使用的参数。</p>
     * @param TranslationParam <p>转录服务翻译使用的参数。</p>
     */
    public void setTranslationParam(TranslationParam TranslationParam) {
        this.TranslationParam = TranslationParam;
    }

    /**
     * Get <p>转录服务TTS使用的参数。</p> 
     * @return TTSParam <p>转录服务TTS使用的参数。</p>
     */
    public TTSParam [] getTTSParam() {
        return this.TTSParam;
    }

    /**
     * Set <p>转录服务TTS使用的参数。</p>
     * @param TTSParam <p>转录服务TTS使用的参数。</p>
     */
    public void setTTSParam(TTSParam [] TTSParam) {
        this.TTSParam = TTSParam;
    }

    public CreateCloudTranscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudTranscriptionRequest(CreateCloudTranscriptionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.TranscriptionParam != null) {
            this.TranscriptionParam = new TranscriptionParam(source.TranscriptionParam);
        }
        if (source.AsrParam != null) {
            this.AsrParam = new AsrParam(source.AsrParam);
        }
        if (source.TranslationParam != null) {
            this.TranslationParam = new TranslationParam(source.TranslationParam);
        }
        if (source.TTSParam != null) {
            this.TTSParam = new TTSParam[source.TTSParam.length];
            for (int i = 0; i < source.TTSParam.length; i++) {
                this.TTSParam[i] = new TTSParam(source.TTSParam[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "TranscriptionParam.", this.TranscriptionParam);
        this.setParamObj(map, prefix + "AsrParam.", this.AsrParam);
        this.setParamObj(map, prefix + "TranslationParam.", this.TranslationParam);
        this.setParamArrayObj(map, prefix + "TTSParam.", this.TTSParam);

    }
}

