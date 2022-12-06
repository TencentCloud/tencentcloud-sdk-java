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
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
    */
    @SerializedName("SubscribeAudioList")
    @Expose
    private McuUserInfoParams [] SubscribeAudioList;

    /**
    * 音频用户黑名单，为空或不填表示无黑名单，填具体值表示不混指定主播音频。update时，不填表示不更新，为空表示更新为清空黑名单，填具体值表示更新为不混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
    */
    @SerializedName("UnSubscribeAudioList")
    @Expose
    private McuUserInfoParams [] UnSubscribeAudioList;

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
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。 
     * @return SubscribeAudioList 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
     */
    public McuUserInfoParams [] getSubscribeAudioList() {
        return this.SubscribeAudioList;
    }

    /**
     * Set 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
     * @param SubscribeAudioList 音频用户白名单，start时，为空或不填表示混所有主播音频，填具体值表示混指定主播音频；update时，不填表示不更新，为空表示更新为混所有主播音频，填具体值表示更新为混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
     */
    public void setSubscribeAudioList(McuUserInfoParams [] SubscribeAudioList) {
        this.SubscribeAudioList = SubscribeAudioList;
    }

    /**
     * Get 音频用户黑名单，为空或不填表示无黑名单，填具体值表示不混指定主播音频。update时，不填表示不更新，为空表示更新为清空黑名单，填具体值表示更新为不混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。 
     * @return UnSubscribeAudioList 音频用户黑名单，为空或不填表示无黑名单，填具体值表示不混指定主播音频。update时，不填表示不更新，为空表示更新为清空黑名单，填具体值表示更新为不混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
     */
    public McuUserInfoParams [] getUnSubscribeAudioList() {
        return this.UnSubscribeAudioList;
    }

    /**
     * Set 音频用户黑名单，为空或不填表示无黑名单，填具体值表示不混指定主播音频。update时，不填表示不更新，为空表示更新为清空黑名单，填具体值表示更新为不混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
     * @param UnSubscribeAudioList 音频用户黑名单，为空或不填表示无黑名单，填具体值表示不混指定主播音频。update时，不填表示不更新，为空表示更新为清空黑名单，填具体值表示更新为不混指定主播音频。
使用黑白名单时，黑白名单必须同时填写。都不填写时表示不更新。同一个用户同时在黑白名单时，以黑名单为主。
     */
    public void setUnSubscribeAudioList(McuUserInfoParams [] UnSubscribeAudioList) {
        this.UnSubscribeAudioList = UnSubscribeAudioList;
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
        if (source.UnSubscribeAudioList != null) {
            this.UnSubscribeAudioList = new McuUserInfoParams[source.UnSubscribeAudioList.length];
            for (int i = 0; i < source.UnSubscribeAudioList.length; i++) {
                this.UnSubscribeAudioList[i] = new McuUserInfoParams(source.UnSubscribeAudioList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AudioEncode.", this.AudioEncode);
        this.setParamArrayObj(map, prefix + "SubscribeAudioList.", this.SubscribeAudioList);
        this.setParamArrayObj(map, prefix + "UnSubscribeAudioList.", this.UnSubscribeAudioList);

    }
}

