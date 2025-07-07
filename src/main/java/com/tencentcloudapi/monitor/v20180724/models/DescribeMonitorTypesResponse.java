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

public class DescribeMonitorTypesResponse extends AbstractModel {

    /**
    * 监控类型，云产品监控为 MT_QCE
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * 监控类型详情
    */
    @SerializedName("MonitorTypeInfos")
    @Expose
    private MonitorTypeInfo [] MonitorTypeInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监控类型，云产品监控为 MT_QCE 
     * @return MonitorTypes 监控类型，云产品监控为 MT_QCE
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set 监控类型，云产品监控为 MT_QCE
     * @param MonitorTypes 监控类型，云产品监控为 MT_QCE
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get 监控类型详情 
     * @return MonitorTypeInfos 监控类型详情
     */
    public MonitorTypeInfo [] getMonitorTypeInfos() {
        return this.MonitorTypeInfos;
    }

    /**
     * Set 监控类型详情
     * @param MonitorTypeInfos 监控类型详情
     */
    public void setMonitorTypeInfos(MonitorTypeInfo [] MonitorTypeInfos) {
        this.MonitorTypeInfos = MonitorTypeInfos;
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

    public DescribeMonitorTypesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonitorTypesResponse(DescribeMonitorTypesResponse source) {
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.MonitorTypeInfos != null) {
            this.MonitorTypeInfos = new MonitorTypeInfo[source.MonitorTypeInfos.length];
            for (int i = 0; i < source.MonitorTypeInfos.length; i++) {
                this.MonitorTypeInfos[i] = new MonitorTypeInfo(source.MonitorTypeInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamArrayObj(map, prefix + "MonitorTypeInfos.", this.MonitorTypeInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

