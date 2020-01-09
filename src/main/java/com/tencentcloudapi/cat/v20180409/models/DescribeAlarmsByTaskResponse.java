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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmsByTaskResponse extends AbstractModel{

    /**
    * 告警信息列表
    */
    @SerializedName("AlarmInfos")
    @Expose
    private AlarmInfo [] AlarmInfos;

    /**
    * 故障率
    */
    @SerializedName("FaultRatio")
    @Expose
    private Float FaultRatio;

    /**
    * 故障总时长
    */
    @SerializedName("FaultTimeSpec")
    @Expose
    private String FaultTimeSpec;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 告警信息列表 
     * @return AlarmInfos 告警信息列表
     */
    public AlarmInfo [] getAlarmInfos() {
        return this.AlarmInfos;
    }

    /**
     * Set 告警信息列表
     * @param AlarmInfos 告警信息列表
     */
    public void setAlarmInfos(AlarmInfo [] AlarmInfos) {
        this.AlarmInfos = AlarmInfos;
    }

    /**
     * Get 故障率 
     * @return FaultRatio 故障率
     */
    public Float getFaultRatio() {
        return this.FaultRatio;
    }

    /**
     * Set 故障率
     * @param FaultRatio 故障率
     */
    public void setFaultRatio(Float FaultRatio) {
        this.FaultRatio = FaultRatio;
    }

    /**
     * Get 故障总时长 
     * @return FaultTimeSpec 故障总时长
     */
    public String getFaultTimeSpec() {
        return this.FaultTimeSpec;
    }

    /**
     * Set 故障总时长
     * @param FaultTimeSpec 故障总时长
     */
    public void setFaultTimeSpec(String FaultTimeSpec) {
        this.FaultTimeSpec = FaultTimeSpec;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlarmInfos.", this.AlarmInfos);
        this.setParamSimple(map, prefix + "FaultRatio", this.FaultRatio);
        this.setParamSimple(map, prefix + "FaultTimeSpec", this.FaultTimeSpec);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

