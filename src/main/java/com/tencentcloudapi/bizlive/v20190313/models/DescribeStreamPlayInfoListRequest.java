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
package com.tencentcloudapi.bizlive.v20190313.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPlayInfoListRequest extends AbstractModel{

    /**
    * 结束时间，北京时间，格式：2019-04-28 10:36:00
结束时间 和 开始时间  必须在同一天内。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 播放域名。
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * 开始时间，北京时间，格式：2019-04-28 10:36:00
当前时间 和 开始时间 间隔不超过30天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 流名称，精确匹配。
若不填，则为查询总体播放数据。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get 结束时间，北京时间，格式：2019-04-28 10:36:00
结束时间 和 开始时间  必须在同一天内。 
     * @return EndTime 结束时间，北京时间，格式：2019-04-28 10:36:00
结束时间 和 开始时间  必须在同一天内。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，北京时间，格式：2019-04-28 10:36:00
结束时间 和 开始时间  必须在同一天内。
     * @param EndTime 结束时间，北京时间，格式：2019-04-28 10:36:00
结束时间 和 开始时间  必须在同一天内。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 播放域名。 
     * @return PlayDomain 播放域名。
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set 播放域名。
     * @param PlayDomain 播放域名。
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get 开始时间，北京时间，格式：2019-04-28 10:36:00
当前时间 和 开始时间 间隔不超过30天。 
     * @return StartTime 开始时间，北京时间，格式：2019-04-28 10:36:00
当前时间 和 开始时间 间隔不超过30天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，北京时间，格式：2019-04-28 10:36:00
当前时间 和 开始时间 间隔不超过30天。
     * @param StartTime 开始时间，北京时间，格式：2019-04-28 10:36:00
当前时间 和 开始时间 间隔不超过30天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 流名称，精确匹配。
若不填，则为查询总体播放数据。 
     * @return StreamName 流名称，精确匹配。
若不填，则为查询总体播放数据。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称，精确匹配。
若不填，则为查询总体播放数据。
     * @param StreamName 流名称，精确匹配。
若不填，则为查询总体播放数据。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

