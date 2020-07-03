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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientConnectionsResponse extends AbstractModel{

    /**
    * 客户端连接信息，包括客户端IP和对应IP的连接数量。
    */
    @SerializedName("Clients")
    @Expose
    private ClientConnection [] Clients;

    /**
    * 满足条件的记录总条数，可用于分页查询。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 客户端连接信息，包括客户端IP和对应IP的连接数量。 
     * @return Clients 客户端连接信息，包括客户端IP和对应IP的连接数量。
     */
    public ClientConnection [] getClients() {
        return this.Clients;
    }

    /**
     * Set 客户端连接信息，包括客户端IP和对应IP的连接数量。
     * @param Clients 客户端连接信息，包括客户端IP和对应IP的连接数量。
     */
    public void setClients(ClientConnection [] Clients) {
        this.Clients = Clients;
    }

    /**
     * Get 满足条件的记录总条数，可用于分页查询。 
     * @return TotalCount 满足条件的记录总条数，可用于分页查询。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足条件的记录总条数，可用于分页查询。
     * @param TotalCount 满足条件的记录总条数，可用于分页查询。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Clients.", this.Clients);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

