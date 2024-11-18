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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSyncModeResponse extends AbstractModel {

    /**
    * 同步模式：0 异步，1 强同步， 2 强同步可退化
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
    * 是否有修改流程在执行中：1 是， 0 否。
    */
    @SerializedName("IsModifying")
    @Expose
    private Long IsModifying;

    /**
    * 当前复制方式，0 异步，1 同步
    */
    @SerializedName("CurrentSyncMode")
    @Expose
    private Long CurrentSyncMode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 同步模式：0 异步，1 强同步， 2 强同步可退化 
     * @return SyncMode 同步模式：0 异步，1 强同步， 2 强同步可退化
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set 同步模式：0 异步，1 强同步， 2 强同步可退化
     * @param SyncMode 同步模式：0 异步，1 强同步， 2 强同步可退化
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get 是否有修改流程在执行中：1 是， 0 否。 
     * @return IsModifying 是否有修改流程在执行中：1 是， 0 否。
     */
    public Long getIsModifying() {
        return this.IsModifying;
    }

    /**
     * Set 是否有修改流程在执行中：1 是， 0 否。
     * @param IsModifying 是否有修改流程在执行中：1 是， 0 否。
     */
    public void setIsModifying(Long IsModifying) {
        this.IsModifying = IsModifying;
    }

    /**
     * Get 当前复制方式，0 异步，1 同步 
     * @return CurrentSyncMode 当前复制方式，0 异步，1 同步
     */
    public Long getCurrentSyncMode() {
        return this.CurrentSyncMode;
    }

    /**
     * Set 当前复制方式，0 异步，1 同步
     * @param CurrentSyncMode 当前复制方式，0 异步，1 同步
     */
    public void setCurrentSyncMode(Long CurrentSyncMode) {
        this.CurrentSyncMode = CurrentSyncMode;
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

    public DescribeDBSyncModeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSyncModeResponse(DescribeDBSyncModeResponse source) {
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
        if (source.IsModifying != null) {
            this.IsModifying = new Long(source.IsModifying);
        }
        if (source.CurrentSyncMode != null) {
            this.CurrentSyncMode = new Long(source.CurrentSyncMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "IsModifying", this.IsModifying);
        this.setParamSimple(map, prefix + "CurrentSyncMode", this.CurrentSyncMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

