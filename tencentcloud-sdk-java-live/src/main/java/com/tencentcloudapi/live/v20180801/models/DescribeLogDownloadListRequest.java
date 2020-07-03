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

public class DescribeLogDownloadListRequest extends AbstractModel{

    /**
    * 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 域名列表。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
     * Get 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。 
     * @return StartTime 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
     * @param StartTime 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。 
     * @return EndTime 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
     * @param EndTime 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 域名列表。 
     * @return PlayDomains 域名列表。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set 域名列表。
     * @param PlayDomains 域名列表。
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

