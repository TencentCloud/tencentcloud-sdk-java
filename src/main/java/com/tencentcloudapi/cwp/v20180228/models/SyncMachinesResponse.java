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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncMachinesResponse extends AbstractModel {

    /**
    * 枚举值有(大写)：NOTASK（没有同步任务），SYNCING（同步中），FINISHED（同步完成）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 最新开始同步时间
    */
    @SerializedName("LatestStartTime")
    @Expose
    private String LatestStartTime;

    /**
    * 最新同步结束时间
    */
    @SerializedName("LatestEndTime")
    @Expose
    private String LatestEndTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 枚举值有(大写)：NOTASK（没有同步任务），SYNCING（同步中），FINISHED（同步完成） 
     * @return State 枚举值有(大写)：NOTASK（没有同步任务），SYNCING（同步中），FINISHED（同步完成）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 枚举值有(大写)：NOTASK（没有同步任务），SYNCING（同步中），FINISHED（同步完成）
     * @param State 枚举值有(大写)：NOTASK（没有同步任务），SYNCING（同步中），FINISHED（同步完成）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 最新开始同步时间 
     * @return LatestStartTime 最新开始同步时间
     */
    public String getLatestStartTime() {
        return this.LatestStartTime;
    }

    /**
     * Set 最新开始同步时间
     * @param LatestStartTime 最新开始同步时间
     */
    public void setLatestStartTime(String LatestStartTime) {
        this.LatestStartTime = LatestStartTime;
    }

    /**
     * Get 最新同步结束时间 
     * @return LatestEndTime 最新同步结束时间
     */
    public String getLatestEndTime() {
        return this.LatestEndTime;
    }

    /**
     * Set 最新同步结束时间
     * @param LatestEndTime 最新同步结束时间
     */
    public void setLatestEndTime(String LatestEndTime) {
        this.LatestEndTime = LatestEndTime;
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

    public SyncMachinesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncMachinesResponse(SyncMachinesResponse source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.LatestStartTime != null) {
            this.LatestStartTime = new String(source.LatestStartTime);
        }
        if (source.LatestEndTime != null) {
            this.LatestEndTime = new String(source.LatestEndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "LatestStartTime", this.LatestStartTime);
        this.setParamSimple(map, prefix + "LatestEndTime", this.LatestEndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

