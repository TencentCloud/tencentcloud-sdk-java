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

public class HttpStatusData extends AbstractModel{

    /**
    * 数据时间点，
格式：yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 播放状态码详细信息。
    */
    @SerializedName("HttpStatusInfoList")
    @Expose
    private HttpStatusInfo [] HttpStatusInfoList;

    /**
     * Get 数据时间点，
格式：yyyy-mm-dd HH:MM:SS。 
     * @return Time 数据时间点，
格式：yyyy-mm-dd HH:MM:SS。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据时间点，
格式：yyyy-mm-dd HH:MM:SS。
     * @param Time 数据时间点，
格式：yyyy-mm-dd HH:MM:SS。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 播放状态码详细信息。 
     * @return HttpStatusInfoList 播放状态码详细信息。
     */
    public HttpStatusInfo [] getHttpStatusInfoList() {
        return this.HttpStatusInfoList;
    }

    /**
     * Set 播放状态码详细信息。
     * @param HttpStatusInfoList 播放状态码详细信息。
     */
    public void setHttpStatusInfoList(HttpStatusInfo [] HttpStatusInfoList) {
        this.HttpStatusInfoList = HttpStatusInfoList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArrayObj(map, prefix + "HttpStatusInfoList.", this.HttpStatusInfoList);

    }
}

