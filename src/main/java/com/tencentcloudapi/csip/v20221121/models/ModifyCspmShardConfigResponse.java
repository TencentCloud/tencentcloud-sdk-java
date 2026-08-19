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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCspmShardConfigResponse extends AbstractModel {

    /**
    * <p>共享AppID</p>
    */
    @SerializedName("ShardFromAppID")
    @Expose
    private Long ShardFromAppID;

    /**
    * <p>共享开关:1:开启;2:关闭</p>
    */
    @SerializedName("AutoShardStatus")
    @Expose
    private Long AutoShardStatus;

    /**
    * <p>被共享AppID集合</p>
    */
    @SerializedName("ShardAppIDs")
    @Expose
    private Long [] ShardAppIDs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>共享AppID</p> 
     * @return ShardFromAppID <p>共享AppID</p>
     */
    public Long getShardFromAppID() {
        return this.ShardFromAppID;
    }

    /**
     * Set <p>共享AppID</p>
     * @param ShardFromAppID <p>共享AppID</p>
     */
    public void setShardFromAppID(Long ShardFromAppID) {
        this.ShardFromAppID = ShardFromAppID;
    }

    /**
     * Get <p>共享开关:1:开启;2:关闭</p> 
     * @return AutoShardStatus <p>共享开关:1:开启;2:关闭</p>
     */
    public Long getAutoShardStatus() {
        return this.AutoShardStatus;
    }

    /**
     * Set <p>共享开关:1:开启;2:关闭</p>
     * @param AutoShardStatus <p>共享开关:1:开启;2:关闭</p>
     */
    public void setAutoShardStatus(Long AutoShardStatus) {
        this.AutoShardStatus = AutoShardStatus;
    }

    /**
     * Get <p>被共享AppID集合</p> 
     * @return ShardAppIDs <p>被共享AppID集合</p>
     */
    public Long [] getShardAppIDs() {
        return this.ShardAppIDs;
    }

    /**
     * Set <p>被共享AppID集合</p>
     * @param ShardAppIDs <p>被共享AppID集合</p>
     */
    public void setShardAppIDs(Long [] ShardAppIDs) {
        this.ShardAppIDs = ShardAppIDs;
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

    public ModifyCspmShardConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCspmShardConfigResponse(ModifyCspmShardConfigResponse source) {
        if (source.ShardFromAppID != null) {
            this.ShardFromAppID = new Long(source.ShardFromAppID);
        }
        if (source.AutoShardStatus != null) {
            this.AutoShardStatus = new Long(source.AutoShardStatus);
        }
        if (source.ShardAppIDs != null) {
            this.ShardAppIDs = new Long[source.ShardAppIDs.length];
            for (int i = 0; i < source.ShardAppIDs.length; i++) {
                this.ShardAppIDs[i] = new Long(source.ShardAppIDs[i]);
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
        this.setParamSimple(map, prefix + "ShardFromAppID", this.ShardFromAppID);
        this.setParamSimple(map, prefix + "AutoShardStatus", this.AutoShardStatus);
        this.setParamArraySimple(map, prefix + "ShardAppIDs.", this.ShardAppIDs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

