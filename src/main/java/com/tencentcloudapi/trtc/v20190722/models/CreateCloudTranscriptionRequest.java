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
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转录的房间所对应的SdkAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * 转录服务加入TRTC房间的参数。
    */
    @SerializedName("TranscriptionParam")
    @Expose
    private TranscriptionParam TranscriptionParam;

    /**
    * 转录服务ASR使用的参数。
    */
    @SerializedName("AsrParam")
    @Expose
    private AsrParam AsrParam;

    /**
    * 转录服务翻译使用的参数。
    */
    @SerializedName("TranslationParam")
    @Expose
    private TranslationParam TranslationParam;

    /**
     * Get TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转录的房间所对应的SdkAppId相同。 
     * @return SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转录的房间所对应的SdkAppId相同。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转录的房间所对应的SdkAppId相同。
     * @param SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转录的房间所对应的SdkAppId相同。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。 
     * @return RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。
     * @param RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，转录的TRTC房间所对应的RoomId。注：房间号类型默认为整型，若房间号类型为字符串，请通过RoomIdType指定。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。 
     * @return RoomIdType 房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set 房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。
     * @param RoomIdType 房间信息RoomType，必须和转录的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get 转录服务加入TRTC房间的参数。 
     * @return TranscriptionParam 转录服务加入TRTC房间的参数。
     */
    public TranscriptionParam getTranscriptionParam() {
        return this.TranscriptionParam;
    }

    /**
     * Set 转录服务加入TRTC房间的参数。
     * @param TranscriptionParam 转录服务加入TRTC房间的参数。
     */
    public void setTranscriptionParam(TranscriptionParam TranscriptionParam) {
        this.TranscriptionParam = TranscriptionParam;
    }

    /**
     * Get 转录服务ASR使用的参数。 
     * @return AsrParam 转录服务ASR使用的参数。
     */
    public AsrParam getAsrParam() {
        return this.AsrParam;
    }

    /**
     * Set 转录服务ASR使用的参数。
     * @param AsrParam 转录服务ASR使用的参数。
     */
    public void setAsrParam(AsrParam AsrParam) {
        this.AsrParam = AsrParam;
    }

    /**
     * Get 转录服务翻译使用的参数。 
     * @return TranslationParam 转录服务翻译使用的参数。
     */
    public TranslationParam getTranslationParam() {
        return this.TranslationParam;
    }

    /**
     * Set 转录服务翻译使用的参数。
     * @param TranslationParam 转录服务翻译使用的参数。
     */
    public void setTranslationParam(TranslationParam TranslationParam) {
        this.TranslationParam = TranslationParam;
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

    }
}

