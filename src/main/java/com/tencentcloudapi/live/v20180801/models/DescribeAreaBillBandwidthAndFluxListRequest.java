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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAreaBillBandwidthAndFluxListRequest extends AbstractModel{

    /**
    * 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 直播播放域名，若不填，表示总体数据。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
     * Get 起始时间点，格式为yyyy-mm-dd HH:MM:SS。 
     * @return StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     * @param StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。 
     * @return EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
     * @param EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 直播播放域名，若不填，表示总体数据。 
     * @return PlayDomains 直播播放域名，若不填，表示总体数据。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set 直播播放域名，若不填，表示总体数据。
     * @param PlayDomains 直播播放域名，若不填，表示总体数据。
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);

    }
}

