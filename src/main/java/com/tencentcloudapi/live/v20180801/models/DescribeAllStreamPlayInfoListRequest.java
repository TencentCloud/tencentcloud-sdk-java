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

public class DescribeAllStreamPlayInfoListRequest extends AbstractModel{

    /**
    * 查询时间点，精确到分钟粒度，支持最近1个月的数据查询，数据延迟为5分钟左右，如果要查询实时的数据，建议传递5分钟前的时间点，格式为yyyy-mm-dd HH:MM:00。（只精确至分钟，秒数填00）。
    */
    @SerializedName("QueryTime")
    @Expose
    private String QueryTime;

    /**
    * 播放域名列表，若不填，表示总体数据。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
     * Get 查询时间点，精确到分钟粒度，支持最近1个月的数据查询，数据延迟为5分钟左右，如果要查询实时的数据，建议传递5分钟前的时间点，格式为yyyy-mm-dd HH:MM:00。（只精确至分钟，秒数填00）。 
     * @return QueryTime 查询时间点，精确到分钟粒度，支持最近1个月的数据查询，数据延迟为5分钟左右，如果要查询实时的数据，建议传递5分钟前的时间点，格式为yyyy-mm-dd HH:MM:00。（只精确至分钟，秒数填00）。
     */
    public String getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set 查询时间点，精确到分钟粒度，支持最近1个月的数据查询，数据延迟为5分钟左右，如果要查询实时的数据，建议传递5分钟前的时间点，格式为yyyy-mm-dd HH:MM:00。（只精确至分钟，秒数填00）。
     * @param QueryTime 查询时间点，精确到分钟粒度，支持最近1个月的数据查询，数据延迟为5分钟左右，如果要查询实时的数据，建议传递5分钟前的时间点，格式为yyyy-mm-dd HH:MM:00。（只精确至分钟，秒数填00）。
     */
    public void setQueryTime(String QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get 播放域名列表，若不填，表示总体数据。 
     * @return PlayDomains 播放域名列表，若不填，表示总体数据。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set 播放域名列表，若不填，表示总体数据。
     * @param PlayDomains 播放域名列表，若不填，表示总体数据。
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    public DescribeAllStreamPlayInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllStreamPlayInfoListRequest(DescribeAllStreamPlayInfoListRequest source) {
        if (source.QueryTime != null) {
            this.QueryTime = new String(source.QueryTime);
        }
        if (source.PlayDomains != null) {
            this.PlayDomains = new String[source.PlayDomains.length];
            for (int i = 0; i < source.PlayDomains.length; i++) {
                this.PlayDomains[i] = new String(source.PlayDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);

    }
}

