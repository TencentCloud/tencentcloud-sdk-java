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

public class ModifyCloudTranscriptionRequest extends AbstractModel {

    /**
    * <p>TRTC的SdkAppId，和转录的房间所对应的SdkAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>转录任务的唯一Id，在启动转录成功后会返回。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
    */
    @SerializedName("SequenceNumber")
    @Expose
    private Long SequenceNumber;

    /**
    * <p>转录订阅用户信息，包括白名单和黑名单。</p>
    */
    @SerializedName("SubscribeUserInfo")
    @Expose
    private TranscriptionSubscribeParam SubscribeUserInfo;

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
     * Get <p>TRTC的SdkAppId，和转录的房间所对应的SdkAppId相同。</p> 
     * @return SdkAppId <p>TRTC的SdkAppId，和转录的房间所对应的SdkAppId相同。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的SdkAppId，和转录的房间所对应的SdkAppId相同。</p>
     * @param SdkAppId <p>TRTC的SdkAppId，和转录的房间所对应的SdkAppId相同。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>转录任务的唯一Id，在启动转录成功后会返回。</p> 
     * @return TaskId <p>转录任务的唯一Id，在启动转录成功后会返回。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>转录任务的唯一Id，在启动转录成功后会返回。</p>
     * @param TaskId <p>转录任务的唯一Id，在启动转录成功后会返回。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p> 
     * @return SequenceNumber <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     */
    public Long getSequenceNumber() {
        return this.SequenceNumber;
    }

    /**
     * Set <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     * @param SequenceNumber <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     */
    public void setSequenceNumber(Long SequenceNumber) {
        this.SequenceNumber = SequenceNumber;
    }

    /**
     * Get <p>转录订阅用户信息，包括白名单和黑名单。</p> 
     * @return SubscribeUserInfo <p>转录订阅用户信息，包括白名单和黑名单。</p>
     */
    public TranscriptionSubscribeParam getSubscribeUserInfo() {
        return this.SubscribeUserInfo;
    }

    /**
     * Set <p>转录订阅用户信息，包括白名单和黑名单。</p>
     * @param SubscribeUserInfo <p>转录订阅用户信息，包括白名单和黑名单。</p>
     */
    public void setSubscribeUserInfo(TranscriptionSubscribeParam SubscribeUserInfo) {
        this.SubscribeUserInfo = SubscribeUserInfo;
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

    public ModifyCloudTranscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudTranscriptionRequest(ModifyCloudTranscriptionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SequenceNumber != null) {
            this.SequenceNumber = new Long(source.SequenceNumber);
        }
        if (source.SubscribeUserInfo != null) {
            this.SubscribeUserInfo = new TranscriptionSubscribeParam(source.SubscribeUserInfo);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SequenceNumber", this.SequenceNumber);
        this.setParamObj(map, prefix + "SubscribeUserInfo.", this.SubscribeUserInfo);
        this.setParamObj(map, prefix + "TranslationParam.", this.TranslationParam);
        this.setParamArrayObj(map, prefix + "TTSParam.", this.TTSParam);

    }
}

