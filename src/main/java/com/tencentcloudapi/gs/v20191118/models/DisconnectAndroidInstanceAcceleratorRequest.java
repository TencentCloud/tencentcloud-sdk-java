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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisconnectAndroidInstanceAcceleratorRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 用户 ID。用户 ID 为空，将断开该实例的所有用户连接；用户 ID 不为空，只断开该用户的连接。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 实例ID 
     * @return AndroidInstanceId 实例ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 实例ID
     * @param AndroidInstanceId 实例ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 用户 ID。用户 ID 为空，将断开该实例的所有用户连接；用户 ID 不为空，只断开该用户的连接。 
     * @return UserId 用户 ID。用户 ID 为空，将断开该实例的所有用户连接；用户 ID 不为空，只断开该用户的连接。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID。用户 ID 为空，将断开该实例的所有用户连接；用户 ID 不为空，只断开该用户的连接。
     * @param UserId 用户 ID。用户 ID 为空，将断开该实例的所有用户连接；用户 ID 不为空，只断开该用户的连接。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DisconnectAndroidInstanceAcceleratorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisconnectAndroidInstanceAcceleratorRequest(DisconnectAndroidInstanceAcceleratorRequest source) {
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

