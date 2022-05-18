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

public class SubscribeStreamUserIds extends AbstractModel{

    /**
    * 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流；["1.*$"], 代表订阅UserId前缀为1的音频流。默认不填订阅房间内所有的音频流，订阅列表用户数不超过32。
    */
    @SerializedName("SubscribeAudioUserIds")
    @Expose
    private String [] SubscribeAudioUserIds;

    /**
    * 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流；["1.*$"], 代表不订阅UserId前缀为1的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过32。
    */
    @SerializedName("UnSubscribeAudioUserIds")
    @Expose
    private String [] UnSubscribeAudioUserIds;

    /**
    * 订阅视频流白名单，指定订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表订阅UserId  1，2，3的视频流；["1.*$"], 代表订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
    */
    @SerializedName("SubscribeVideoUserIds")
    @Expose
    private String [] SubscribeVideoUserIds;

    /**
    * 订阅视频流黑名单，指定不订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表不订阅UserId  1，2，3的视频流；["1.*$"], 代表不订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
    */
    @SerializedName("UnSubscribeVideoUserIds")
    @Expose
    private String [] UnSubscribeVideoUserIds;

    /**
     * Get 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流；["1.*$"], 代表订阅UserId前缀为1的音频流。默认不填订阅房间内所有的音频流，订阅列表用户数不超过32。 
     * @return SubscribeAudioUserIds 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流；["1.*$"], 代表订阅UserId前缀为1的音频流。默认不填订阅房间内所有的音频流，订阅列表用户数不超过32。
     */
    public String [] getSubscribeAudioUserIds() {
        return this.SubscribeAudioUserIds;
    }

    /**
     * Set 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流；["1.*$"], 代表订阅UserId前缀为1的音频流。默认不填订阅房间内所有的音频流，订阅列表用户数不超过32。
     * @param SubscribeAudioUserIds 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流；["1.*$"], 代表订阅UserId前缀为1的音频流。默认不填订阅房间内所有的音频流，订阅列表用户数不超过32。
     */
    public void setSubscribeAudioUserIds(String [] SubscribeAudioUserIds) {
        this.SubscribeAudioUserIds = SubscribeAudioUserIds;
    }

    /**
     * Get 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流；["1.*$"], 代表不订阅UserId前缀为1的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过32。 
     * @return UnSubscribeAudioUserIds 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流；["1.*$"], 代表不订阅UserId前缀为1的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过32。
     */
    public String [] getUnSubscribeAudioUserIds() {
        return this.UnSubscribeAudioUserIds;
    }

    /**
     * Set 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流；["1.*$"], 代表不订阅UserId前缀为1的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过32。
     * @param UnSubscribeAudioUserIds 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流；["1.*$"], 代表不订阅UserId前缀为1的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过32。
     */
    public void setUnSubscribeAudioUserIds(String [] UnSubscribeAudioUserIds) {
        this.UnSubscribeAudioUserIds = UnSubscribeAudioUserIds;
    }

    /**
     * Get 订阅视频流白名单，指定订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表订阅UserId  1，2，3的视频流；["1.*$"], 代表订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。 
     * @return SubscribeVideoUserIds 订阅视频流白名单，指定订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表订阅UserId  1，2，3的视频流；["1.*$"], 代表订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
     */
    public String [] getSubscribeVideoUserIds() {
        return this.SubscribeVideoUserIds;
    }

    /**
     * Set 订阅视频流白名单，指定订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表订阅UserId  1，2，3的视频流；["1.*$"], 代表订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
     * @param SubscribeVideoUserIds 订阅视频流白名单，指定订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表订阅UserId  1，2，3的视频流；["1.*$"], 代表订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
     */
    public void setSubscribeVideoUserIds(String [] SubscribeVideoUserIds) {
        this.SubscribeVideoUserIds = SubscribeVideoUserIds;
    }

    /**
     * Get 订阅视频流黑名单，指定不订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表不订阅UserId  1，2，3的视频流；["1.*$"], 代表不订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。 
     * @return UnSubscribeVideoUserIds 订阅视频流黑名单，指定不订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表不订阅UserId  1，2，3的视频流；["1.*$"], 代表不订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
     */
    public String [] getUnSubscribeVideoUserIds() {
        return this.UnSubscribeVideoUserIds;
    }

    /**
     * Set 订阅视频流黑名单，指定不订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表不订阅UserId  1，2，3的视频流；["1.*$"], 代表不订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
     * @param UnSubscribeVideoUserIds 订阅视频流黑名单，指定不订阅哪几个UserId的视频流，例如["1", "2", "3"], 代表不订阅UserId  1，2，3的视频流；["1.*$"], 代表不订阅UserId前缀为1的视频流。默认不填订阅房间内所有视频流，订阅列表用户数不超过32。
     */
    public void setUnSubscribeVideoUserIds(String [] UnSubscribeVideoUserIds) {
        this.UnSubscribeVideoUserIds = UnSubscribeVideoUserIds;
    }

    public SubscribeStreamUserIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeStreamUserIds(SubscribeStreamUserIds source) {
        if (source.SubscribeAudioUserIds != null) {
            this.SubscribeAudioUserIds = new String[source.SubscribeAudioUserIds.length];
            for (int i = 0; i < source.SubscribeAudioUserIds.length; i++) {
                this.SubscribeAudioUserIds[i] = new String(source.SubscribeAudioUserIds[i]);
            }
        }
        if (source.UnSubscribeAudioUserIds != null) {
            this.UnSubscribeAudioUserIds = new String[source.UnSubscribeAudioUserIds.length];
            for (int i = 0; i < source.UnSubscribeAudioUserIds.length; i++) {
                this.UnSubscribeAudioUserIds[i] = new String(source.UnSubscribeAudioUserIds[i]);
            }
        }
        if (source.SubscribeVideoUserIds != null) {
            this.SubscribeVideoUserIds = new String[source.SubscribeVideoUserIds.length];
            for (int i = 0; i < source.SubscribeVideoUserIds.length; i++) {
                this.SubscribeVideoUserIds[i] = new String(source.SubscribeVideoUserIds[i]);
            }
        }
        if (source.UnSubscribeVideoUserIds != null) {
            this.UnSubscribeVideoUserIds = new String[source.UnSubscribeVideoUserIds.length];
            for (int i = 0; i < source.UnSubscribeVideoUserIds.length; i++) {
                this.UnSubscribeVideoUserIds[i] = new String(source.UnSubscribeVideoUserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubscribeAudioUserIds.", this.SubscribeAudioUserIds);
        this.setParamArraySimple(map, prefix + "UnSubscribeAudioUserIds.", this.UnSubscribeAudioUserIds);
        this.setParamArraySimple(map, prefix + "SubscribeVideoUserIds.", this.SubscribeVideoUserIds);
        this.setParamArraySimple(map, prefix + "UnSubscribeVideoUserIds.", this.UnSubscribeVideoUserIds);

    }
}

