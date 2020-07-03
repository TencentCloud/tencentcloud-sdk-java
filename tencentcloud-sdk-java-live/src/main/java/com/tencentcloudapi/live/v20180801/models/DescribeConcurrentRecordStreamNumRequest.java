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

public class DescribeConcurrentRecordStreamNumRequest extends AbstractModel{

    /**
    * 直播类型，SlowLive：慢直播。
NormalLive：普通直播。
    */
    @SerializedName("LiveType")
    @Expose
    private String LiveType;

    /**
    * 起始时间，格式：yyyy-mm-dd HH:MM:SS。
可以查询最近180天的数据。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，格式：yyyy-mm-dd HH:MM:SS。
时间跨度最大支持31天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * 推流域名列表，不填表示总体数据。
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
     * Get 直播类型，SlowLive：慢直播。
NormalLive：普通直播。 
     * @return LiveType 直播类型，SlowLive：慢直播。
NormalLive：普通直播。
     */
    public String getLiveType() {
        return this.LiveType;
    }

    /**
     * Set 直播类型，SlowLive：慢直播。
NormalLive：普通直播。
     * @param LiveType 直播类型，SlowLive：慢直播。
NormalLive：普通直播。
     */
    public void setLiveType(String LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get 起始时间，格式：yyyy-mm-dd HH:MM:SS。
可以查询最近180天的数据。 
     * @return StartTime 起始时间，格式：yyyy-mm-dd HH:MM:SS。
可以查询最近180天的数据。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，格式：yyyy-mm-dd HH:MM:SS。
可以查询最近180天的数据。
     * @param StartTime 起始时间，格式：yyyy-mm-dd HH:MM:SS。
可以查询最近180天的数据。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，格式：yyyy-mm-dd HH:MM:SS。
时间跨度最大支持31天。 
     * @return EndTime 结束时间，格式：yyyy-mm-dd HH:MM:SS。
时间跨度最大支持31天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式：yyyy-mm-dd HH:MM:SS。
时间跨度最大支持31天。
     * @param EndTime 结束时间，格式：yyyy-mm-dd HH:MM:SS。
时间跨度最大支持31天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。 
     * @return MainlandOrOversea 如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
     * @param MainlandOrOversea 如果为空，查询所有地区数据；如果为“Mainland”，查询国内数据；如果为“Oversea”，则查询国外数据。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get 推流域名列表，不填表示总体数据。 
     * @return PushDomains 推流域名列表，不填表示总体数据。
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set 推流域名列表，不填表示总体数据。
     * @param PushDomains 推流域名列表，不填表示总体数据。
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveType", this.LiveType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);

    }
}

