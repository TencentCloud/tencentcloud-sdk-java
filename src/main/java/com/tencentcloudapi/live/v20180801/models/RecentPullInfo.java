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

public class RecentPullInfo extends AbstractModel{

    /**
    * 当前正在拉的文件地址。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 当前正在拉的文件偏移，单位：秒。
    */
    @SerializedName("OffsetTime")
    @Expose
    private Long OffsetTime;

    /**
    * 最新上报偏移信息时间。UTC格式。
如：2020-07-23T03:20:39Z。
注意：与北京时间相差八小时。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 已经轮播的次数。
    */
    @SerializedName("LoopedTimes")
    @Expose
    private Long LoopedTimes;

    /**
     * Get 当前正在拉的文件地址。 
     * @return FileUrl 当前正在拉的文件地址。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 当前正在拉的文件地址。
     * @param FileUrl 当前正在拉的文件地址。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 当前正在拉的文件偏移，单位：秒。 
     * @return OffsetTime 当前正在拉的文件偏移，单位：秒。
     */
    public Long getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set 当前正在拉的文件偏移，单位：秒。
     * @param OffsetTime 当前正在拉的文件偏移，单位：秒。
     */
    public void setOffsetTime(Long OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get 最新上报偏移信息时间。UTC格式。
如：2020-07-23T03:20:39Z。
注意：与北京时间相差八小时。 
     * @return ReportTime 最新上报偏移信息时间。UTC格式。
如：2020-07-23T03:20:39Z。
注意：与北京时间相差八小时。
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 最新上报偏移信息时间。UTC格式。
如：2020-07-23T03:20:39Z。
注意：与北京时间相差八小时。
     * @param ReportTime 最新上报偏移信息时间。UTC格式。
如：2020-07-23T03:20:39Z。
注意：与北京时间相差八小时。
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get 已经轮播的次数。 
     * @return LoopedTimes 已经轮播的次数。
     */
    public Long getLoopedTimes() {
        return this.LoopedTimes;
    }

    /**
     * Set 已经轮播的次数。
     * @param LoopedTimes 已经轮播的次数。
     */
    public void setLoopedTimes(Long LoopedTimes) {
        this.LoopedTimes = LoopedTimes;
    }

    public RecentPullInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecentPullInfo(RecentPullInfo source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.OffsetTime != null) {
            this.OffsetTime = new Long(source.OffsetTime);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.LoopedTimes != null) {
            this.LoopedTimes = new Long(source.LoopedTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "LoopedTimes", this.LoopedTimes);

    }
}

