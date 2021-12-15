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

public class ModifyLiveChannelRequest extends AbstractModel{

    /**
    * 直播频道ID
    */
    @SerializedName("LiveChannelId")
    @Expose
    private String LiveChannelId;

    /**
    * 直播频道名
    */
    @SerializedName("LiveChannelName")
    @Expose
    private String LiveChannelName;

    /**
     * Get 直播频道ID 
     * @return LiveChannelId 直播频道ID
     */
    public String getLiveChannelId() {
        return this.LiveChannelId;
    }

    /**
     * Set 直播频道ID
     * @param LiveChannelId 直播频道ID
     */
    public void setLiveChannelId(String LiveChannelId) {
        this.LiveChannelId = LiveChannelId;
    }

    /**
     * Get 直播频道名 
     * @return LiveChannelName 直播频道名
     */
    public String getLiveChannelName() {
        return this.LiveChannelName;
    }

    /**
     * Set 直播频道名
     * @param LiveChannelName 直播频道名
     */
    public void setLiveChannelName(String LiveChannelName) {
        this.LiveChannelName = LiveChannelName;
    }

    public ModifyLiveChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveChannelRequest(ModifyLiveChannelRequest source) {
        if (source.LiveChannelId != null) {
            this.LiveChannelId = new String(source.LiveChannelId);
        }
        if (source.LiveChannelName != null) {
            this.LiveChannelName = new String(source.LiveChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveChannelId", this.LiveChannelId);
        this.setParamSimple(map, prefix + "LiveChannelName", this.LiveChannelName);

    }
}

