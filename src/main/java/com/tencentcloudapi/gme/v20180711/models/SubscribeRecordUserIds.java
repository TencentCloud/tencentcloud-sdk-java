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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeRecordUserIds extends AbstractModel{

    /**
    * 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数
    */
    @SerializedName("UnSubscribeUserIds")
    @Expose
    private String [] UnSubscribeUserIds;

    /**
    * 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数。
    */
    @SerializedName("SubscribeUserIds")
    @Expose
    private String [] SubscribeUserIds;

    /**
     * Get 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数 
     * @return UnSubscribeUserIds 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数
     */
    public String [] getUnSubscribeUserIds() {
        return this.UnSubscribeUserIds;
    }

    /**
     * Set 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数
     * @param UnSubscribeUserIds 订阅音频流黑名单，指定不订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表不订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数
     */
    public void setUnSubscribeUserIds(String [] UnSubscribeUserIds) {
        this.UnSubscribeUserIds = UnSubscribeUserIds;
    }

    /**
     * Get 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数。 
     * @return SubscribeUserIds 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数。
     */
    public String [] getSubscribeUserIds() {
        return this.SubscribeUserIds;
    }

    /**
     * Set 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数。
     * @param SubscribeUserIds 订阅音频流白名单，指定订阅哪几个UserId的音频流，例如["1", "2", "3"], 代表订阅UserId 1，2，3的音频流。默认不填订阅房间内所有音频流，订阅列表用户数不超过20。
注意：只能同时设置UnSubscribeAudioUserIds、SubscribeAudioUserIds 其中1个参数。
     */
    public void setSubscribeUserIds(String [] SubscribeUserIds) {
        this.SubscribeUserIds = SubscribeUserIds;
    }

    public SubscribeRecordUserIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeRecordUserIds(SubscribeRecordUserIds source) {
        if (source.UnSubscribeUserIds != null) {
            this.UnSubscribeUserIds = new String[source.UnSubscribeUserIds.length];
            for (int i = 0; i < source.UnSubscribeUserIds.length; i++) {
                this.UnSubscribeUserIds[i] = new String(source.UnSubscribeUserIds[i]);
            }
        }
        if (source.SubscribeUserIds != null) {
            this.SubscribeUserIds = new String[source.SubscribeUserIds.length];
            for (int i = 0; i < source.SubscribeUserIds.length; i++) {
                this.SubscribeUserIds[i] = new String(source.SubscribeUserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UnSubscribeUserIds.", this.UnSubscribeUserIds);
        this.setParamArraySimple(map, prefix + "SubscribeUserIds.", this.SubscribeUserIds);

    }
}

