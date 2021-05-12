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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayStatFileInfo extends AbstractModel{

    /**
    * 播放统计数据所属日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 播放统计文件的 URL 地址。播放统计文件内容为：
<li> date：播放日期。</li>
<li> file_id：视频文件 ID。</li>
<li> ip_count：去重后的客户端 IP 数。</li>
<li> flux：播放流量，单位：字节。</li>
<li> play_times：总的播放次数。</li>
<li> pc_play_times：PC 端播放次数。</li>
<li> mobile_play_times：移动端播放次数。</li>
<li> iphone_play_times：iPhone 端播放次数。</li>
<li> android_play_times：Android 端播放次数。</li>
<li> host_name	域名。</li>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 播放统计数据所属日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return Date 播放统计数据所属日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 播放统计数据所属日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param Date 播放统计数据所属日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 播放统计文件的 URL 地址。播放统计文件内容为：
<li> date：播放日期。</li>
<li> file_id：视频文件 ID。</li>
<li> ip_count：去重后的客户端 IP 数。</li>
<li> flux：播放流量，单位：字节。</li>
<li> play_times：总的播放次数。</li>
<li> pc_play_times：PC 端播放次数。</li>
<li> mobile_play_times：移动端播放次数。</li>
<li> iphone_play_times：iPhone 端播放次数。</li>
<li> android_play_times：Android 端播放次数。</li>
<li> host_name	域名。</li> 
     * @return Url 播放统计文件的 URL 地址。播放统计文件内容为：
<li> date：播放日期。</li>
<li> file_id：视频文件 ID。</li>
<li> ip_count：去重后的客户端 IP 数。</li>
<li> flux：播放流量，单位：字节。</li>
<li> play_times：总的播放次数。</li>
<li> pc_play_times：PC 端播放次数。</li>
<li> mobile_play_times：移动端播放次数。</li>
<li> iphone_play_times：iPhone 端播放次数。</li>
<li> android_play_times：Android 端播放次数。</li>
<li> host_name	域名。</li>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 播放统计文件的 URL 地址。播放统计文件内容为：
<li> date：播放日期。</li>
<li> file_id：视频文件 ID。</li>
<li> ip_count：去重后的客户端 IP 数。</li>
<li> flux：播放流量，单位：字节。</li>
<li> play_times：总的播放次数。</li>
<li> pc_play_times：PC 端播放次数。</li>
<li> mobile_play_times：移动端播放次数。</li>
<li> iphone_play_times：iPhone 端播放次数。</li>
<li> android_play_times：Android 端播放次数。</li>
<li> host_name	域名。</li>
     * @param Url 播放统计文件的 URL 地址。播放统计文件内容为：
<li> date：播放日期。</li>
<li> file_id：视频文件 ID。</li>
<li> ip_count：去重后的客户端 IP 数。</li>
<li> flux：播放流量，单位：字节。</li>
<li> play_times：总的播放次数。</li>
<li> pc_play_times：PC 端播放次数。</li>
<li> mobile_play_times：移动端播放次数。</li>
<li> iphone_play_times：iPhone 端播放次数。</li>
<li> android_play_times：Android 端播放次数。</li>
<li> host_name	域名。</li>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public PlayStatFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayStatFileInfo(PlayStatFileInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

