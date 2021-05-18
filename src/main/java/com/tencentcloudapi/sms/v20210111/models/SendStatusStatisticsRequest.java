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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendStatusStatisticsRequest extends AbstractModel{

    /**
    * 起始时间，格式为yyyymmddhh，精确到小时，例如2021050113，表示2021年5月1号13时。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间，格式为yyyymmddhh，精确到小时，例如2021050118，表示2021年5月1号18时。
注：EndTime 必须大于 BeginTime。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 短信 SdkAppId 在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

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
     * Get 起始时间，格式为yyyymmddhh，精确到小时，例如2021050113，表示2021年5月1号13时。 
     * @return BeginTime 起始时间，格式为yyyymmddhh，精确到小时，例如2021050113，表示2021年5月1号13时。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 起始时间，格式为yyyymmddhh，精确到小时，例如2021050113，表示2021年5月1号13时。
     * @param BeginTime 起始时间，格式为yyyymmddhh，精确到小时，例如2021050113，表示2021年5月1号13时。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间，格式为yyyymmddhh，精确到小时，例如2021050118，表示2021年5月1号18时。
注：EndTime 必须大于 BeginTime。 
     * @return EndTime 结束时间，格式为yyyymmddhh，精确到小时，例如2021050118，表示2021年5月1号18时。
注：EndTime 必须大于 BeginTime。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式为yyyymmddhh，精确到小时，例如2021050118，表示2021年5月1号18时。
注：EndTime 必须大于 BeginTime。
     * @param EndTime 结束时间，格式为yyyymmddhh，精确到小时，例如2021050118，表示2021年5月1号18时。
注：EndTime 必须大于 BeginTime。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 短信 SdkAppId 在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。 
     * @return SmsSdkAppId 短信 SdkAppId 在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set 短信 SdkAppId 在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
     * @param SmsSdkAppId 短信 SdkAppId 在 [短信控制台](https://console.cloud.tencent.com/smsv2/app-manage)  添加应用后生成的实际 SdkAppId，示例如1400006666。
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
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

    public SendStatusStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendStatusStatisticsRequest(SendStatusStatisticsRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

