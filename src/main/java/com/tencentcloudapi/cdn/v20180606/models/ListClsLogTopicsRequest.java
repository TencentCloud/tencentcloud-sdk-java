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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListClsLogTopicsRequest extends AbstractModel{

    /**
    * 接入渠道，默认值为cdn
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get 接入渠道，默认值为cdn 
     * @return Channel 接入渠道，默认值为cdn
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 接入渠道，默认值为cdn
     * @param Channel 接入渠道，默认值为cdn
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

