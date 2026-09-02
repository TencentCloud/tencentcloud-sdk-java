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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendStatusStatisticsRequest extends AbstractModel {

    /**
    * <p>起始时间，格式为yyyymmddhh，精确到小时，例如2024050113，表示2024年5月1号13时。注：统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>结束时间，格式为yyyymmddhh，精确到小时，例如2024050118，表示2024年5月1号18时。注：EndTime 必须大于等于 BeginTime，统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId，示例如1400006666。</p>
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * <p>最大上限。<br>注：目前固定设置为0。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量。<br>注：目前固定设置为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>起始时间，格式为yyyymmddhh，精确到小时，例如2024050113，表示2024年5月1号13时。注：统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p> 
     * @return BeginTime <p>起始时间，格式为yyyymmddhh，精确到小时，例如2024050113，表示2024年5月1号13时。注：统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>起始时间，格式为yyyymmddhh，精确到小时，例如2024050113，表示2024年5月1号13时。注：统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
     * @param BeginTime <p>起始时间，格式为yyyymmddhh，精确到小时，例如2024050113，表示2024年5月1号13时。注：统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间，格式为yyyymmddhh，精确到小时，例如2024050118，表示2024年5月1号18时。注：EndTime 必须大于等于 BeginTime，统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p> 
     * @return EndTime <p>结束时间，格式为yyyymmddhh，精确到小时，例如2024050118，表示2024年5月1号18时。注：EndTime 必须大于等于 BeginTime，统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，格式为yyyymmddhh，精确到小时，例如2024050118，表示2024年5月1号18时。注：EndTime 必须大于等于 BeginTime，统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
     * @param EndTime <p>结束时间，格式为yyyymmddhh，精确到小时，例如2024050118，表示2024年5月1号18时。注：EndTime 必须大于等于 BeginTime，统计范围包含当前小时。</p><p>参数格式：yyyymmddhh</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId，示例如1400006666。</p> 
     * @return SmsSdkAppId <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId，示例如1400006666。</p>
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId，示例如1400006666。</p>
     * @param SmsSdkAppId <p>短信 SdkAppId 在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId，示例如1400006666。</p>
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get <p>最大上限。<br>注：目前固定设置为0。</p> 
     * @return Limit <p>最大上限。<br>注：目前固定设置为0。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最大上限。<br>注：目前固定设置为0。</p>
     * @param Limit <p>最大上限。<br>注：目前固定设置为0。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量。<br>注：目前固定设置为0。</p> 
     * @return Offset <p>偏移量。<br>注：目前固定设置为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量。<br>注：目前固定设置为0。</p>
     * @param Offset <p>偏移量。<br>注：目前固定设置为0。</p>
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

