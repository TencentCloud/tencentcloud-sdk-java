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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirmwareTaskDistributionResponse extends AbstractModel{

    /**
    * 固件升级任务状态分布信息
    */
    @SerializedName("StatusInfos")
    @Expose
    private StatusStatistic [] StatusInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 固件升级任务状态分布信息 
     * @return StatusInfos 固件升级任务状态分布信息
     */
    public StatusStatistic [] getStatusInfos() {
        return this.StatusInfos;
    }

    /**
     * Set 固件升级任务状态分布信息
     * @param StatusInfos 固件升级任务状态分布信息
     */
    public void setStatusInfos(StatusStatistic [] StatusInfos) {
        this.StatusInfos = StatusInfos;
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

    public DescribeFirmwareTaskDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirmwareTaskDistributionResponse(DescribeFirmwareTaskDistributionResponse source) {
        if (source.StatusInfos != null) {
            this.StatusInfos = new StatusStatistic[source.StatusInfos.length];
            for (int i = 0; i < source.StatusInfos.length; i++) {
                this.StatusInfos[i] = new StatusStatistic(source.StatusInfos[i]);
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
        this.setParamArrayObj(map, prefix + "StatusInfos.", this.StatusInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

