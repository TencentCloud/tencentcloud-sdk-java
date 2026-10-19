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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemuxStatisticsDataInfo extends AbstractModel {

    /**
    * <p>转封装用量</p>
    */
    @SerializedName("Remux")
    @Expose
    private Long Remux;

    /**
    * <p>时间</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>频道Id</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
     * Get <p>转封装用量</p> 
     * @return Remux <p>转封装用量</p>
     */
    public Long getRemux() {
        return this.Remux;
    }

    /**
     * Set <p>转封装用量</p>
     * @param Remux <p>转封装用量</p>
     */
    public void setRemux(Long Remux) {
        this.Remux = Remux;
    }

    /**
     * Get <p>时间</p> 
     * @return Time <p>时间</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>时间</p>
     * @param Time <p>时间</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>频道Id</p> 
     * @return ChannelId <p>频道Id</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>频道Id</p>
     * @param ChannelId <p>频道Id</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    public RemuxStatisticsDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemuxStatisticsDataInfo(RemuxStatisticsDataInfo source) {
        if (source.Remux != null) {
            this.Remux = new Long(source.Remux);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Remux", this.Remux);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

