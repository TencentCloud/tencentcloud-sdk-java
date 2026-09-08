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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgeHTTPServiceCacheResponse extends AbstractModel {

    /**
    * <p>需要刷新的缓存类型：TCBCDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul>
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * <p>刷新任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>需要刷新的缓存类型：TCBCDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul> 
     * @return CacheType <p>需要刷新的缓存类型：TCBCDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul>
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set <p>需要刷新的缓存类型：TCBCDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul>
     * @param CacheType <p>需要刷新的缓存类型：TCBCDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul>
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get <p>刷新任务ID</p> 
     * @return TaskId <p>刷新任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>刷新任务ID</p>
     * @param TaskId <p>刷新任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public PurgeHTTPServiceCacheResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurgeHTTPServiceCacheResponse(PurgeHTTPServiceCacheResponse source) {
        if (source.CacheType != null) {
            this.CacheType = new String(source.CacheType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

