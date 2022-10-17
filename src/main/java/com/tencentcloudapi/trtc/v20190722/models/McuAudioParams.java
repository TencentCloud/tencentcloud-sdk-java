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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuAudioParams extends AbstractModel{

    /**
    * 音频编码参数。
    */
    @SerializedName("AudioEncode")
    @Expose
    private AudioEncode AudioEncode;

    /**
    * 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。
    */
    @SerializedName("SubscribeAudioList")
    @Expose
    private McuUserInfoParams [] SubscribeAudioList;

    /**
     * Get 音频编码参数。 
     * @return AudioEncode 音频编码参数。
     */
    public AudioEncode getAudioEncode() {
        return this.AudioEncode;
    }

    /**
     * Set 音频编码参数。
     * @param AudioEncode 音频编码参数。
     */
    public void setAudioEncode(AudioEncode AudioEncode) {
        this.AudioEncode = AudioEncode;
    }

    /**
     * Get 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。 
     * @return SubscribeAudioList 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。
     */
    public McuUserInfoParams [] getSubscribeAudioList() {
        return this.SubscribeAudioList;
    }

    /**
     * Set 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。
     * @param SubscribeAudioList 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。
     */
    public void setSubscribeAudioList(McuUserInfoParams [] SubscribeAudioList) {
        this.SubscribeAudioList = SubscribeAudioList;
    }

    public McuAudioParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuAudioParams(McuAudioParams source) {
        if (source.AudioEncode != null) {
            this.AudioEncode = new AudioEncode(source.AudioEncode);
        }
        if (source.SubscribeAudioList != null) {
            this.SubscribeAudioList = new McuUserInfoParams[source.SubscribeAudioList.length];
            for (int i = 0; i < source.SubscribeAudioList.length; i++) {
                this.SubscribeAudioList[i] = new McuUserInfoParams(source.SubscribeAudioList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AudioEncode.", this.AudioEncode);
        this.setParamArrayObj(map, prefix + "SubscribeAudioList.", this.SubscribeAudioList);

    }
}

