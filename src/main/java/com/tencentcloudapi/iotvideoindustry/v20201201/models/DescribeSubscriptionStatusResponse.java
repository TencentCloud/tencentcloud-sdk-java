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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscriptionStatusResponse extends AbstractModel{

    /**
    * 设备GB28181报警订阅状态 1：未开启订阅；2：已开启订阅
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long AlarmStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 设备GB28181报警订阅状态 1：未开启订阅；2：已开启订阅 
     * @return AlarmStatus 设备GB28181报警订阅状态 1：未开启订阅；2：已开启订阅
     */
    public Long getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 设备GB28181报警订阅状态 1：未开启订阅；2：已开启订阅
     * @param AlarmStatus 设备GB28181报警订阅状态 1：未开启订阅；2：已开启订阅
     */
    public void setAlarmStatus(Long AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
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

    public DescribeSubscriptionStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscriptionStatusResponse(DescribeSubscriptionStatusResponse source) {
        if (source.AlarmStatus != null) {
            this.AlarmStatus = new Long(source.AlarmStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

