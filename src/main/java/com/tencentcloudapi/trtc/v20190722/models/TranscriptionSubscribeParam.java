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

public class TranscriptionSubscribeParam extends AbstractModel {

    /**
    * <p>转录用户白名单，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。 使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
    */
    @SerializedName("SubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] SubscribeList;

    /**
    * <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。 同一个用户同时在黑白名单时，以黑名单为主。</p>
    */
    @SerializedName("UnSubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] UnSubscribeList;

    /**
     * Get <p>转录用户白名单，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。 使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p> 
     * @return SubscribeList <p>转录用户白名单，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。 使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public TranscriptionUserInfoParams [] getSubscribeList() {
        return this.SubscribeList;
    }

    /**
     * Set <p>转录用户白名单，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。 使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
     * @param SubscribeList <p>转录用户白名单，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。 使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public void setSubscribeList(TranscriptionUserInfoParams [] SubscribeList) {
        this.SubscribeList = SubscribeList;
    }

    /**
     * Get <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。 同一个用户同时在黑白名单时，以黑名单为主。</p> 
     * @return UnSubscribeList <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。 同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public TranscriptionUserInfoParams [] getUnSubscribeList() {
        return this.UnSubscribeList;
    }

    /**
     * Set <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。 同一个用户同时在黑白名单时，以黑名单为主。</p>
     * @param UnSubscribeList <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。 同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public void setUnSubscribeList(TranscriptionUserInfoParams [] UnSubscribeList) {
        this.UnSubscribeList = UnSubscribeList;
    }

    public TranscriptionSubscribeParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscriptionSubscribeParam(TranscriptionSubscribeParam source) {
        if (source.SubscribeList != null) {
            this.SubscribeList = new TranscriptionUserInfoParams[source.SubscribeList.length];
            for (int i = 0; i < source.SubscribeList.length; i++) {
                this.SubscribeList[i] = new TranscriptionUserInfoParams(source.SubscribeList[i]);
            }
        }
        if (source.UnSubscribeList != null) {
            this.UnSubscribeList = new TranscriptionUserInfoParams[source.UnSubscribeList.length];
            for (int i = 0; i < source.UnSubscribeList.length; i++) {
                this.UnSubscribeList[i] = new TranscriptionUserInfoParams(source.UnSubscribeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubscribeList.", this.SubscribeList);
        this.setParamArrayObj(map, prefix + "UnSubscribeList.", this.UnSubscribeList);

    }
}

