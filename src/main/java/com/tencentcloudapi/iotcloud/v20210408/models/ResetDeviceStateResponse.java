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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetDeviceStateResponse extends AbstractModel{

    /**
    * 批量重置设备成功数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 批量重置设备结果
    */
    @SerializedName("ResetDeviceResults")
    @Expose
    private ResetDeviceResult [] ResetDeviceResults;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量重置设备成功数 
     * @return SuccessCount 批量重置设备成功数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 批量重置设备成功数
     * @param SuccessCount 批量重置设备成功数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 批量重置设备结果 
     * @return ResetDeviceResults 批量重置设备结果
     */
    public ResetDeviceResult [] getResetDeviceResults() {
        return this.ResetDeviceResults;
    }

    /**
     * Set 批量重置设备结果
     * @param ResetDeviceResults 批量重置设备结果
     */
    public void setResetDeviceResults(ResetDeviceResult [] ResetDeviceResults) {
        this.ResetDeviceResults = ResetDeviceResults;
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

    public ResetDeviceStateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetDeviceStateResponse(ResetDeviceStateResponse source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.ResetDeviceResults != null) {
            this.ResetDeviceResults = new ResetDeviceResult[source.ResetDeviceResults.length];
            for (int i = 0; i < source.ResetDeviceResults.length; i++) {
                this.ResetDeviceResults[i] = new ResetDeviceResult(source.ResetDeviceResults[i]);
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
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamArrayObj(map, prefix + "ResetDeviceResults.", this.ResetDeviceResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

