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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartAITranscriptionRequest extends AbstractModel {

    /**
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，使用该sdkappid开启任务。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，使用该roomid开启任务。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 启动转录机器人和鉴权的参数。
    */
    @SerializedName("TranscriptionParams")
    @Expose
    private TranscriptionParams TranscriptionParams;

    /**
    * TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * 语音识别配置
    */
    @SerializedName("RecognizeConfig")
    @Expose
    private RecognizeConfig RecognizeConfig;

    /**
     * Get TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，使用该sdkappid开启任务。 
     * @return SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，使用该sdkappid开启任务。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，使用该sdkappid开启任务。
     * @param SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，使用该sdkappid开启任务。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，使用该roomid开启任务。 
     * @return RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，使用该roomid开启任务。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，使用该roomid开启任务。
     * @param RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，使用该roomid开启任务。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 启动转录机器人和鉴权的参数。 
     * @return TranscriptionParams 启动转录机器人和鉴权的参数。
     */
    public TranscriptionParams getTranscriptionParams() {
        return this.TranscriptionParams;
    }

    /**
     * Set 启动转录机器人和鉴权的参数。
     * @param TranscriptionParams 启动转录机器人和鉴权的参数。
     */
    public void setTranscriptionParams(TranscriptionParams TranscriptionParams) {
        this.TranscriptionParams = TranscriptionParams;
    }

    /**
     * Get TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。 
     * @return RoomIdType TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
     * @param RoomIdType TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get 语音识别配置 
     * @return RecognizeConfig 语音识别配置
     */
    public RecognizeConfig getRecognizeConfig() {
        return this.RecognizeConfig;
    }

    /**
     * Set 语音识别配置
     * @param RecognizeConfig 语音识别配置
     */
    public void setRecognizeConfig(RecognizeConfig RecognizeConfig) {
        this.RecognizeConfig = RecognizeConfig;
    }

    public StartAITranscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartAITranscriptionRequest(StartAITranscriptionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.TranscriptionParams != null) {
            this.TranscriptionParams = new TranscriptionParams(source.TranscriptionParams);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.RecognizeConfig != null) {
            this.RecognizeConfig = new RecognizeConfig(source.RecognizeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamObj(map, prefix + "TranscriptionParams.", this.TranscriptionParams);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "RecognizeConfig.", this.RecognizeConfig);

    }
}

