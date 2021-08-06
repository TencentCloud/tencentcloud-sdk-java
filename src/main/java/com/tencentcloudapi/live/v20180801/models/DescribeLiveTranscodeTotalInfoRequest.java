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

public class DescribeLiveTranscodeTotalInfoRequest extends AbstractModel{

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
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 推流域名列表，若不填，表示查询所有域名总体数据。
指定域名时返回1小时粒度数据。
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
    * 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
默认：查询全球地区（境内+境外）的数据。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

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
     * @return EndTime 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
     * @param EndTime 结束时间，北京时间。
格式：yyyy-mm-dd HH:MM:SS。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 推流域名列表，若不填，表示查询所有域名总体数据。
指定域名时返回1小时粒度数据。 
     * @return PushDomains 推流域名列表，若不填，表示查询所有域名总体数据。
指定域名时返回1小时粒度数据。
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set 推流域名列表，若不填，表示查询所有域名总体数据。
指定域名时返回1小时粒度数据。
     * @param PushDomains 推流域名列表，若不填，表示查询所有域名总体数据。
指定域名时返回1小时粒度数据。
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Get 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
默认：查询全球地区（境内+境外）的数据。 
     * @return MainlandOrOversea 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
默认：查询全球地区（境内+境外）的数据。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
默认：查询全球地区（境内+境外）的数据。
     * @param MainlandOrOversea 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
默认：查询全球地区（境内+境外）的数据。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    public DescribeLiveTranscodeTotalInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeTotalInfoRequest(DescribeLiveTranscodeTotalInfoRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PushDomains != null) {
            this.PushDomains = new String[source.PushDomains.length];
            for (int i = 0; i < source.PushDomains.length; i++) {
                this.PushDomains[i] = new String(source.PushDomains[i]);
            }
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);

    }
}

