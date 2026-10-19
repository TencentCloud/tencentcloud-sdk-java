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

public class IngestStatisticsDataInfo extends AbstractModel {

    /**
    * <p>输入用量</p>
    */
    @SerializedName("Ingest")
    @Expose
    private Long Ingest;

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
    * <p>频道类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>输入用量</p> 
     * @return Ingest <p>输入用量</p>
     */
    public Long getIngest() {
        return this.Ingest;
    }

    /**
     * Set <p>输入用量</p>
     * @param Ingest <p>输入用量</p>
     */
    public void setIngest(Long Ingest) {
        this.Ingest = Ingest;
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

    /**
     * Get <p>频道类型</p> 
     * @return Type <p>频道类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>频道类型</p>
     * @param Type <p>频道类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public IngestStatisticsDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngestStatisticsDataInfo(IngestStatisticsDataInfo source) {
        if (source.Ingest != null) {
            this.Ingest = new Long(source.Ingest);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ingest", this.Ingest);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

