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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpsertIpAccessControlResponse extends AbstractModel {

    /**
    * 添加或修改失败的条目
    */
    @SerializedName("FailedItems")
    @Expose
    private String FailedItems;

    /**
    * 添加或修改失败的数目
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 添加或修改的IP数据Id列表
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 添加或修改失败的条目 
     * @return FailedItems 添加或修改失败的条目
     */
    public String getFailedItems() {
        return this.FailedItems;
    }

    /**
     * Set 添加或修改失败的条目
     * @param FailedItems 添加或修改失败的条目
     */
    public void setFailedItems(String FailedItems) {
        this.FailedItems = FailedItems;
    }

    /**
     * Get 添加或修改失败的数目 
     * @return FailedCount 添加或修改失败的数目
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 添加或修改失败的数目
     * @param FailedCount 添加或修改失败的数目
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 添加或修改的IP数据Id列表 
     * @return Ids 添加或修改的IP数据Id列表
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set 添加或修改的IP数据Id列表
     * @param Ids 添加或修改的IP数据Id列表
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
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

    public UpsertIpAccessControlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpsertIpAccessControlResponse(UpsertIpAccessControlResponse source) {
        if (source.FailedItems != null) {
            this.FailedItems = new String(source.FailedItems);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
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
        this.setParamSimple(map, prefix + "FailedItems", this.FailedItems);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

