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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMonitorResourceInfoResponse extends AbstractModel {

    /**
    * 电话告警数量
    */
    @SerializedName("PhoneAlarmNumber")
    @Expose
    private Long PhoneAlarmNumber;

    /**
    * 高级指标数量
    */
    @SerializedName("AdvancedMetricNumber")
    @Expose
    private Long AdvancedMetricNumber;

    /**
    * API调用量
    */
    @SerializedName("APIUsageNumber")
    @Expose
    private Long APIUsageNumber;

    /**
    * 告警短信数量
    */
    @SerializedName("AlarmSMSNumber")
    @Expose
    private Long AlarmSMSNumber;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 电话告警数量 
     * @return PhoneAlarmNumber 电话告警数量
     */
    public Long getPhoneAlarmNumber() {
        return this.PhoneAlarmNumber;
    }

    /**
     * Set 电话告警数量
     * @param PhoneAlarmNumber 电话告警数量
     */
    public void setPhoneAlarmNumber(Long PhoneAlarmNumber) {
        this.PhoneAlarmNumber = PhoneAlarmNumber;
    }

    /**
     * Get 高级指标数量 
     * @return AdvancedMetricNumber 高级指标数量
     */
    public Long getAdvancedMetricNumber() {
        return this.AdvancedMetricNumber;
    }

    /**
     * Set 高级指标数量
     * @param AdvancedMetricNumber 高级指标数量
     */
    public void setAdvancedMetricNumber(Long AdvancedMetricNumber) {
        this.AdvancedMetricNumber = AdvancedMetricNumber;
    }

    /**
     * Get API调用量 
     * @return APIUsageNumber API调用量
     */
    public Long getAPIUsageNumber() {
        return this.APIUsageNumber;
    }

    /**
     * Set API调用量
     * @param APIUsageNumber API调用量
     */
    public void setAPIUsageNumber(Long APIUsageNumber) {
        this.APIUsageNumber = APIUsageNumber;
    }

    /**
     * Get 告警短信数量 
     * @return AlarmSMSNumber 告警短信数量
     */
    public Long getAlarmSMSNumber() {
        return this.AlarmSMSNumber;
    }

    /**
     * Set 告警短信数量
     * @param AlarmSMSNumber 告警短信数量
     */
    public void setAlarmSMSNumber(Long AlarmSMSNumber) {
        this.AlarmSMSNumber = AlarmSMSNumber;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMonitorResourceInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonitorResourceInfoResponse(DescribeMonitorResourceInfoResponse source) {
        if (source.PhoneAlarmNumber != null) {
            this.PhoneAlarmNumber = new Long(source.PhoneAlarmNumber);
        }
        if (source.AdvancedMetricNumber != null) {
            this.AdvancedMetricNumber = new Long(source.AdvancedMetricNumber);
        }
        if (source.APIUsageNumber != null) {
            this.APIUsageNumber = new Long(source.APIUsageNumber);
        }
        if (source.AlarmSMSNumber != null) {
            this.AlarmSMSNumber = new Long(source.AlarmSMSNumber);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneAlarmNumber", this.PhoneAlarmNumber);
        this.setParamSimple(map, prefix + "AdvancedMetricNumber", this.AdvancedMetricNumber);
        this.setParamSimple(map, prefix + "APIUsageNumber", this.APIUsageNumber);
        this.setParamSimple(map, prefix + "AlarmSMSNumber", this.AlarmSMSNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

