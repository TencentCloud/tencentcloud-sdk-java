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
注：此字段为北京时间（UTC+8时区）。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
注：此字段为北京时间（UTC+8时区）。
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
    * 快直播还是标准直播，0：标准直播，1：快直播。默认为0。
    */
    @SerializedName("IsFastLive")
    @Expose
    private Long IsFastLive;

    /**
     * Get 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注：此字段为北京时间（UTC+8时区）。 
     * @return StartTime 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注：此字段为北京时间（UTC+8时区）。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注：此字段为北京时间（UTC+8时区）。
     * @param StartTime 开始时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注：此字段为北京时间（UTC+8时区）。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
注：此字段为北京时间（UTC+8时区）。 
     * @return EndTime 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
注：此字段为北京时间（UTC+8时区）。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
注：此字段为北京时间（UTC+8时区）。
     * @param EndTime 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
注意：结束时间 - 开始时间 <=7天。
注：此字段为北京时间（UTC+8时区）。
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
     * Get 快直播还是标准直播，0：标准直播，1：快直播。默认为0。 
     * @return IsFastLive 快直播还是标准直播，0：标准直播，1：快直播。默认为0。
     */
    public Long getIsFastLive() {
        return this.IsFastLive;
    }

    /**
     * Set 快直播还是标准直播，0：标准直播，1：快直播。默认为0。
     * @param IsFastLive 快直播还是标准直播，0：标准直播，1：快直播。默认为0。
     */
    public void setIsFastLive(Long IsFastLive) {
        this.IsFastLive = IsFastLive;
    }

    public DescribeLogDownloadListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogDownloadListRequest(DescribeLogDownloadListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PlayDomains != null) {
            this.PlayDomains = new String[source.PlayDomains.length];
            for (int i = 0; i < source.PlayDomains.length; i++) {
                this.PlayDomains[i] = new String(source.PlayDomains[i]);
            }
        }
        if (source.IsFastLive != null) {
            this.IsFastLive = new Long(source.IsFastLive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "IsFastLive", this.IsFastLive);

    }
}

