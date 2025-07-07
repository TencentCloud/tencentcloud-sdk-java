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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicePresetRequest extends AbstractModel {

    /**
    * 通道ID（从通道查询接口DescribeDeviceChannel中获取）
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
     * Get 通道ID（从通道查询接口DescribeDeviceChannel中获取） 
     * @return ChannelId 通道ID（从通道查询接口DescribeDeviceChannel中获取）
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID（从通道查询接口DescribeDeviceChannel中获取）
     * @param ChannelId 通道ID（从通道查询接口DescribeDeviceChannel中获取）
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DescribeDevicePresetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDevicePresetRequest(DescribeDevicePresetRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

