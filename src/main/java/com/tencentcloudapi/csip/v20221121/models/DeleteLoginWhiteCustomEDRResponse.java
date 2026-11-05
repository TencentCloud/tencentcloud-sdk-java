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

public class DeleteLoginWhiteCustomEDRResponse extends AbstractModel {

    /**
    * <p>删除的规则条数</p>
    */
    @SerializedName("DeletedCount")
    @Expose
    private Long DeletedCount;

    /**
    * <p>删除失败的账号 AppId 列表；仅当全部失败时才返回错误</p>
    */
    @SerializedName("FailedAppIds")
    @Expose
    private Long [] FailedAppIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>删除的规则条数</p> 
     * @return DeletedCount <p>删除的规则条数</p>
     */
    public Long getDeletedCount() {
        return this.DeletedCount;
    }

    /**
     * Set <p>删除的规则条数</p>
     * @param DeletedCount <p>删除的规则条数</p>
     */
    public void setDeletedCount(Long DeletedCount) {
        this.DeletedCount = DeletedCount;
    }

    /**
     * Get <p>删除失败的账号 AppId 列表；仅当全部失败时才返回错误</p> 
     * @return FailedAppIds <p>删除失败的账号 AppId 列表；仅当全部失败时才返回错误</p>
     */
    public Long [] getFailedAppIds() {
        return this.FailedAppIds;
    }

    /**
     * Set <p>删除失败的账号 AppId 列表；仅当全部失败时才返回错误</p>
     * @param FailedAppIds <p>删除失败的账号 AppId 列表；仅当全部失败时才返回错误</p>
     */
    public void setFailedAppIds(Long [] FailedAppIds) {
        this.FailedAppIds = FailedAppIds;
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

    public DeleteLoginWhiteCustomEDRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoginWhiteCustomEDRResponse(DeleteLoginWhiteCustomEDRResponse source) {
        if (source.DeletedCount != null) {
            this.DeletedCount = new Long(source.DeletedCount);
        }
        if (source.FailedAppIds != null) {
            this.FailedAppIds = new Long[source.FailedAppIds.length];
            for (int i = 0; i < source.FailedAppIds.length; i++) {
                this.FailedAppIds[i] = new Long(source.FailedAppIds[i]);
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
        this.setParamSimple(map, prefix + "DeletedCount", this.DeletedCount);
        this.setParamArraySimple(map, prefix + "FailedAppIds.", this.FailedAppIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

