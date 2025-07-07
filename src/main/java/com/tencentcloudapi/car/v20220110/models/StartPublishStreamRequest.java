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

public class StartPublishStreamRequest extends AbstractModel {

    /**
    * 唯一用户身份标识，由业务方自定义，平台不予理解。（UserId将作为StreamId进行推流，比如绑定推流域名为abc.livepush.myqcloud.com，那么推流地址为rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx）
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 推流参数，推流时携带自定义参数。
    */
    @SerializedName("PublishStreamArgs")
    @Expose
    private String PublishStreamArgs;

    /**
     * Get 唯一用户身份标识，由业务方自定义，平台不予理解。（UserId将作为StreamId进行推流，比如绑定推流域名为abc.livepush.myqcloud.com，那么推流地址为rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx） 
     * @return UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（UserId将作为StreamId进行推流，比如绑定推流域名为abc.livepush.myqcloud.com，那么推流地址为rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx）
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 唯一用户身份标识，由业务方自定义，平台不予理解。（UserId将作为StreamId进行推流，比如绑定推流域名为abc.livepush.myqcloud.com，那么推流地址为rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx）
     * @param UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（UserId将作为StreamId进行推流，比如绑定推流域名为abc.livepush.myqcloud.com，那么推流地址为rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx）
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 推流参数，推流时携带自定义参数。 
     * @return PublishStreamArgs 推流参数，推流时携带自定义参数。
     */
    public String getPublishStreamArgs() {
        return this.PublishStreamArgs;
    }

    /**
     * Set 推流参数，推流时携带自定义参数。
     * @param PublishStreamArgs 推流参数，推流时携带自定义参数。
     */
    public void setPublishStreamArgs(String PublishStreamArgs) {
        this.PublishStreamArgs = PublishStreamArgs;
    }

    public StartPublishStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartPublishStreamRequest(StartPublishStreamRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PublishStreamArgs != null) {
            this.PublishStreamArgs = new String(source.PublishStreamArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PublishStreamArgs", this.PublishStreamArgs);

    }
}

