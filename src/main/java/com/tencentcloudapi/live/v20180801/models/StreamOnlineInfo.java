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

public class StreamOnlineInfo extends AbstractModel {

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 推流时间列表
    */
    @SerializedName("PublishTimeList")
    @Expose
    private PublishTime [] PublishTimeList;

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 流是否推送到延播。
0 - 无延播，
1 - 有延播。
    */
    @SerializedName("PushToDelay")
    @Expose
    private Long PushToDelay;

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 推流时间列表 
     * @return PublishTimeList 推流时间列表
     */
    public PublishTime [] getPublishTimeList() {
        return this.PublishTimeList;
    }

    /**
     * Set 推流时间列表
     * @param PublishTimeList 推流时间列表
     */
    public void setPublishTimeList(PublishTime [] PublishTimeList) {
        this.PublishTimeList = PublishTimeList;
    }

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 推流域名。 
     * @return DomainName 推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
     * @param DomainName 推流域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 流是否推送到延播。
0 - 无延播，
1 - 有延播。 
     * @return PushToDelay 流是否推送到延播。
0 - 无延播，
1 - 有延播。
     */
    public Long getPushToDelay() {
        return this.PushToDelay;
    }

    /**
     * Set 流是否推送到延播。
0 - 无延播，
1 - 有延播。
     * @param PushToDelay 流是否推送到延播。
0 - 无延播，
1 - 有延播。
     */
    public void setPushToDelay(Long PushToDelay) {
        this.PushToDelay = PushToDelay;
    }

    public StreamOnlineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamOnlineInfo(StreamOnlineInfo source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.PublishTimeList != null) {
            this.PublishTimeList = new PublishTime[source.PublishTimeList.length];
            for (int i = 0; i < source.PublishTimeList.length; i++) {
                this.PublishTimeList[i] = new PublishTime(source.PublishTimeList[i]);
            }
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.PushToDelay != null) {
            this.PushToDelay = new Long(source.PushToDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamArrayObj(map, prefix + "PublishTimeList.", this.PublishTimeList);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "PushToDelay", this.PushToDelay);

    }
}

