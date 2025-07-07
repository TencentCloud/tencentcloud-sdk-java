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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartPublishStreamWithURLRequest extends AbstractModel {

    /**
    * 唯一用户身份标识，由业务方自定义，平台不予理解。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 推流地址，仅支持rtmp协议。
    */
    @SerializedName("PublishStreamURL")
    @Expose
    private String PublishStreamURL;

    /**
     * Get 唯一用户身份标识，由业务方自定义，平台不予理解。 
     * @return UserId 唯一用户身份标识，由业务方自定义，平台不予理解。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 唯一用户身份标识，由业务方自定义，平台不予理解。
     * @param UserId 唯一用户身份标识，由业务方自定义，平台不予理解。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 推流地址，仅支持rtmp协议。 
     * @return PublishStreamURL 推流地址，仅支持rtmp协议。
     */
    public String getPublishStreamURL() {
        return this.PublishStreamURL;
    }

    /**
     * Set 推流地址，仅支持rtmp协议。
     * @param PublishStreamURL 推流地址，仅支持rtmp协议。
     */
    public void setPublishStreamURL(String PublishStreamURL) {
        this.PublishStreamURL = PublishStreamURL;
    }

    public StartPublishStreamWithURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartPublishStreamWithURLRequest(StartPublishStreamWithURLRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PublishStreamURL != null) {
            this.PublishStreamURL = new String(source.PublishStreamURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PublishStreamURL", this.PublishStreamURL);

    }
}

