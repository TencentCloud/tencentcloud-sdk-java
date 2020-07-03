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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallbackStatusStatisticsRequest extends AbstractModel{

    /**
    * 开始时间，yyyymmddhh 需要拉取的起始时间，精确到小时。
    */
    @SerializedName("StartDateTime")
    @Expose
    private Long StartDateTime;

    /**
    * 结束时间，yyyymmddhh 需要拉取的截止时间，精确到小时。
注：EndDataTime 必须大于 StartDateTime。
    */
    @SerializedName("EndDataTime")
    @Expose
    private Long EndDataTime;

    /**
    * 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，示例如1400006666。
    */
    @SerializedName("SmsSdkAppid")
    @Expose
    private String SmsSdkAppid;

    /**
    * 最大上限。
注：目前固定设置为0。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量。
注：目前固定设置为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 开始时间，yyyymmddhh 需要拉取的起始时间，精确到小时。 
     * @return StartDateTime 开始时间，yyyymmddhh 需要拉取的起始时间，精确到小时。
     */
    public Long getStartDateTime() {
        return this.StartDateTime;
    }

    /**
     * Set 开始时间，yyyymmddhh 需要拉取的起始时间，精确到小时。
     * @param StartDateTime 开始时间，yyyymmddhh 需要拉取的起始时间，精确到小时。
     */
    public void setStartDateTime(Long StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    /**
     * Get 结束时间，yyyymmddhh 需要拉取的截止时间，精确到小时。
注：EndDataTime 必须大于 StartDateTime。 
     * @return EndDataTime 结束时间，yyyymmddhh 需要拉取的截止时间，精确到小时。
注：EndDataTime 必须大于 StartDateTime。
     */
    public Long getEndDataTime() {
        return this.EndDataTime;
    }

    /**
     * Set 结束时间，yyyymmddhh 需要拉取的截止时间，精确到小时。
注：EndDataTime 必须大于 StartDateTime。
     * @param EndDataTime 结束时间，yyyymmddhh 需要拉取的截止时间，精确到小时。
注：EndDataTime 必须大于 StartDateTime。
     */
    public void setEndDataTime(Long EndDataTime) {
        this.EndDataTime = EndDataTime;
    }

    /**
     * Get 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，示例如1400006666。 
     * @return SmsSdkAppid 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，示例如1400006666。
     */
    public String getSmsSdkAppid() {
        return this.SmsSdkAppid;
    }

    /**
     * Set 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，示例如1400006666。
     * @param SmsSdkAppid 短信SdkAppid在 [短信控制台](https://console.cloud.tencent.com/smsv2) 添加应用后生成的实际SdkAppid，示例如1400006666。
     */
    public void setSmsSdkAppid(String SmsSdkAppid) {
        this.SmsSdkAppid = SmsSdkAppid;
    }

    /**
     * Get 最大上限。
注：目前固定设置为0。 
     * @return Limit 最大上限。
注：目前固定设置为0。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大上限。
注：目前固定设置为0。
     * @param Limit 最大上限。
注：目前固定设置为0。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量。
注：目前固定设置为0。 
     * @return Offset 偏移量。
注：目前固定设置为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
注：目前固定设置为0。
     * @param Offset 偏移量。
注：目前固定设置为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDateTime", this.StartDateTime);
        this.setParamSimple(map, prefix + "EndDataTime", this.EndDataTime);
        this.setParamSimple(map, prefix + "SmsSdkAppid", this.SmsSdkAppid);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

