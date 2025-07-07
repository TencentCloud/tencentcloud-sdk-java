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

public class MaxVideoUser extends AbstractModel {

    /**
    * 用户媒体流参数。
    */
    @SerializedName("UserMediaStream")
    @Expose
    private UserMediaStream UserMediaStream;

    /**
     * Get 用户媒体流参数。 
     * @return UserMediaStream 用户媒体流参数。
     */
    public UserMediaStream getUserMediaStream() {
        return this.UserMediaStream;
    }

    /**
     * Set 用户媒体流参数。
     * @param UserMediaStream 用户媒体流参数。
     */
    public void setUserMediaStream(UserMediaStream UserMediaStream) {
        this.UserMediaStream = UserMediaStream;
    }

    public MaxVideoUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxVideoUser(MaxVideoUser source) {
        if (source.UserMediaStream != null) {
            this.UserMediaStream = new UserMediaStream(source.UserMediaStream);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserMediaStream.", this.UserMediaStream);

    }
}

