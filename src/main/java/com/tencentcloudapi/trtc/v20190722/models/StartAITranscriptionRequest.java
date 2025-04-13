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
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启转录任务的房间号。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 转录机器人的参数。
    */
    @SerializedName("TranscriptionParams")
    @Expose
    private TranscriptionParams TranscriptionParams;

    /**
    * 调用方传入的唯一Id，服务端用来任务去重，重复的任务会发起失败。服务端固定使用SdkAppId+RoomId+RoomIdType+RobotUserId来去重，如果传入了SessionId，也会使用SessionId去重。
注意：
TranscriptionMode为0时，需要保证一个房间内只发起一个任务，如果发起多个任务，则机器人之间会相互订阅，除非主动停止任务，否则只有10小时后任务才会超时退出，这种情况下建议填写SessionId，保证后续重复发起的任务失败。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * TRTC房间号的类型，0代表数字房间号，1代表字符串房间号。不填默认是数字房间号。
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * 语音识别配置。
    */
    @SerializedName("RecognizeConfig")
    @Expose
    private RecognizeConfig RecognizeConfig;

    /**
     * Get TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。 
     * @return SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
     * @param SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和开启转录任务的房间使用的SdkAppId相同。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启转录任务的房间号。 
     * @return RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启转录任务的房间号。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启转录任务的房间号。
     * @param RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，表示开启转录任务的房间号。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 转录机器人的参数。 
     * @return TranscriptionParams 转录机器人的参数。
     */
    public TranscriptionParams getTranscriptionParams() {
        return this.TranscriptionParams;
    }

    /**
     * Set 转录机器人的参数。
     * @param TranscriptionParams 转录机器人的参数。
     */
    public void setTranscriptionParams(TranscriptionParams TranscriptionParams) {
        this.TranscriptionParams = TranscriptionParams;
    }

    /**
     * Get 调用方传入的唯一Id，服务端用来任务去重，重复的任务会发起失败。服务端固定使用SdkAppId+RoomId+RoomIdType+RobotUserId来去重，如果传入了SessionId，也会使用SessionId去重。
注意：
TranscriptionMode为0时，需要保证一个房间内只发起一个任务，如果发起多个任务，则机器人之间会相互订阅，除非主动停止任务，否则只有10小时后任务才会超时退出，这种情况下建议填写SessionId，保证后续重复发起的任务失败。 
     * @return SessionId 调用方传入的唯一Id，服务端用来任务去重，重复的任务会发起失败。服务端固定使用SdkAppId+RoomId+RoomIdType+RobotUserId来去重，如果传入了SessionId，也会使用SessionId去重。
注意：
TranscriptionMode为0时，需要保证一个房间内只发起一个任务，如果发起多个任务，则机器人之间会相互订阅，除非主动停止任务，否则只有10小时后任务才会超时退出，这种情况下建议填写SessionId，保证后续重复发起的任务失败。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 调用方传入的唯一Id，服务端用来任务去重，重复的任务会发起失败。服务端固定使用SdkAppId+RoomId+RoomIdType+RobotUserId来去重，如果传入了SessionId，也会使用SessionId去重。
注意：
TranscriptionMode为0时，需要保证一个房间内只发起一个任务，如果发起多个任务，则机器人之间会相互订阅，除非主动停止任务，否则只有10小时后任务才会超时退出，这种情况下建议填写SessionId，保证后续重复发起的任务失败。
     * @param SessionId 调用方传入的唯一Id，服务端用来任务去重，重复的任务会发起失败。服务端固定使用SdkAppId+RoomId+RoomIdType+RobotUserId来去重，如果传入了SessionId，也会使用SessionId去重。
注意：
TranscriptionMode为0时，需要保证一个房间内只发起一个任务，如果发起多个任务，则机器人之间会相互订阅，除非主动停止任务，否则只有10小时后任务才会超时退出，这种情况下建议填写SessionId，保证后续重复发起的任务失败。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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
     * Get 语音识别配置。 
     * @return RecognizeConfig 语音识别配置。
     */
    public RecognizeConfig getRecognizeConfig() {
        return this.RecognizeConfig;
    }

    /**
     * Set 语音识别配置。
     * @param RecognizeConfig 语音识别配置。
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
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
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
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "RecognizeConfig.", this.RecognizeConfig);

    }
}

