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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogUserHostStatsResponse extends AbstractModel {

    /**
    * 来源地址数目。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 各来源地址的慢日志占比详情列表。
    */
    @SerializedName("Items")
    @Expose
    private SlowLogHost [] Items;

    /**
    * 各来源用户名的慢日志占比详情列表。
    */
    @SerializedName("UserNameItems")
    @Expose
    private SlowLogUser [] UserNameItems;

    /**
    * 来源用户数目。
    */
    @SerializedName("UserTotalCount")
    @Expose
    private Long UserTotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 来源地址数目。 
     * @return TotalCount 来源地址数目。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 来源地址数目。
     * @param TotalCount 来源地址数目。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 各来源地址的慢日志占比详情列表。 
     * @return Items 各来源地址的慢日志占比详情列表。
     */
    public SlowLogHost [] getItems() {
        return this.Items;
    }

    /**
     * Set 各来源地址的慢日志占比详情列表。
     * @param Items 各来源地址的慢日志占比详情列表。
     */
    public void setItems(SlowLogHost [] Items) {
        this.Items = Items;
    }

    /**
     * Get 各来源用户名的慢日志占比详情列表。 
     * @return UserNameItems 各来源用户名的慢日志占比详情列表。
     */
    public SlowLogUser [] getUserNameItems() {
        return this.UserNameItems;
    }

    /**
     * Set 各来源用户名的慢日志占比详情列表。
     * @param UserNameItems 各来源用户名的慢日志占比详情列表。
     */
    public void setUserNameItems(SlowLogUser [] UserNameItems) {
        this.UserNameItems = UserNameItems;
    }

    /**
     * Get 来源用户数目。 
     * @return UserTotalCount 来源用户数目。
     */
    public Long getUserTotalCount() {
        return this.UserTotalCount;
    }

    /**
     * Set 来源用户数目。
     * @param UserTotalCount 来源用户数目。
     */
    public void setUserTotalCount(Long UserTotalCount) {
        this.UserTotalCount = UserTotalCount;
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

    public DescribeSlowLogUserHostStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogUserHostStatsResponse(DescribeSlowLogUserHostStatsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new SlowLogHost[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SlowLogHost(source.Items[i]);
            }
        }
        if (source.UserNameItems != null) {
            this.UserNameItems = new SlowLogUser[source.UserNameItems.length];
            for (int i = 0; i < source.UserNameItems.length; i++) {
                this.UserNameItems[i] = new SlowLogUser(source.UserNameItems[i]);
            }
        }
        if (source.UserTotalCount != null) {
            this.UserTotalCount = new Long(source.UserTotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "UserNameItems.", this.UserNameItems);
        this.setParamSimple(map, prefix + "UserTotalCount", this.UserTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

