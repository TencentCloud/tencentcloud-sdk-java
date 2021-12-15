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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveChannelRequest extends AbstractModel{

    /**
    * 直播频道名称
    */
    @SerializedName("LiveChannelName")
    @Expose
    private String LiveChannelName;

    /**
    * 直播频道类型 1：固定直播；2：移动直播
    */
    @SerializedName("LiveChannelType")
    @Expose
    private Long LiveChannelType;

    /**
     * Get 直播频道名称 
     * @return LiveChannelName 直播频道名称
     */
    public String getLiveChannelName() {
        return this.LiveChannelName;
    }

    /**
     * Set 直播频道名称
     * @param LiveChannelName 直播频道名称
     */
    public void setLiveChannelName(String LiveChannelName) {
        this.LiveChannelName = LiveChannelName;
    }

    /**
     * Get 直播频道类型 1：固定直播；2：移动直播 
     * @return LiveChannelType 直播频道类型 1：固定直播；2：移动直播
     */
    public Long getLiveChannelType() {
        return this.LiveChannelType;
    }

    /**
     * Set 直播频道类型 1：固定直播；2：移动直播
     * @param LiveChannelType 直播频道类型 1：固定直播；2：移动直播
     */
    public void setLiveChannelType(Long LiveChannelType) {
        this.LiveChannelType = LiveChannelType;
    }

    public CreateLiveChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveChannelRequest(CreateLiveChannelRequest source) {
        if (source.LiveChannelName != null) {
            this.LiveChannelName = new String(source.LiveChannelName);
        }
        if (source.LiveChannelType != null) {
            this.LiveChannelType = new Long(source.LiveChannelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveChannelName", this.LiveChannelName);
        this.setParamSimple(map, prefix + "LiveChannelType", this.LiveChannelType);

    }
}

