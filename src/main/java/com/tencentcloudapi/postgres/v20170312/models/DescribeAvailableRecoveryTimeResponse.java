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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAvailableRecoveryTimeResponse extends AbstractModel{

    /**
    * 可恢复的最早时间，时区为东八区（UTC+8）。
    */
    @SerializedName("RecoveryBeginTime")
    @Expose
    private String RecoveryBeginTime;

    /**
    * 可恢复的最晚时间，时区为东八区（UTC+8）。
    */
    @SerializedName("RecoveryEndTime")
    @Expose
    private String RecoveryEndTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可恢复的最早时间，时区为东八区（UTC+8）。 
     * @return RecoveryBeginTime 可恢复的最早时间，时区为东八区（UTC+8）。
     */
    public String getRecoveryBeginTime() {
        return this.RecoveryBeginTime;
    }

    /**
     * Set 可恢复的最早时间，时区为东八区（UTC+8）。
     * @param RecoveryBeginTime 可恢复的最早时间，时区为东八区（UTC+8）。
     */
    public void setRecoveryBeginTime(String RecoveryBeginTime) {
        this.RecoveryBeginTime = RecoveryBeginTime;
    }

    /**
     * Get 可恢复的最晚时间，时区为东八区（UTC+8）。 
     * @return RecoveryEndTime 可恢复的最晚时间，时区为东八区（UTC+8）。
     */
    public String getRecoveryEndTime() {
        return this.RecoveryEndTime;
    }

    /**
     * Set 可恢复的最晚时间，时区为东八区（UTC+8）。
     * @param RecoveryEndTime 可恢复的最晚时间，时区为东八区（UTC+8）。
     */
    public void setRecoveryEndTime(String RecoveryEndTime) {
        this.RecoveryEndTime = RecoveryEndTime;
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

    public DescribeAvailableRecoveryTimeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableRecoveryTimeResponse(DescribeAvailableRecoveryTimeResponse source) {
        if (source.RecoveryBeginTime != null) {
            this.RecoveryBeginTime = new String(source.RecoveryBeginTime);
        }
        if (source.RecoveryEndTime != null) {
            this.RecoveryEndTime = new String(source.RecoveryEndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecoveryBeginTime", this.RecoveryBeginTime);
        this.setParamSimple(map, prefix + "RecoveryEndTime", this.RecoveryEndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

