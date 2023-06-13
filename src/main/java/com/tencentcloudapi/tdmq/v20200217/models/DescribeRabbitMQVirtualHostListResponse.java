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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQVirtualHostListResponse extends AbstractModel{

    /**
    * 集群列表数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 集群列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualHostList")
    @Expose
    private RabbitMQPrivateVirtualHost [] VirtualHostList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群列表数量 
     * @return TotalCount 集群列表数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 集群列表数量
     * @param TotalCount 集群列表数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 集群列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualHostList 集群列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RabbitMQPrivateVirtualHost [] getVirtualHostList() {
        return this.VirtualHostList;
    }

    /**
     * Set 集群列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualHostList 集群列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualHostList(RabbitMQPrivateVirtualHost [] VirtualHostList) {
        this.VirtualHostList = VirtualHostList;
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

    public DescribeRabbitMQVirtualHostListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQVirtualHostListResponse(DescribeRabbitMQVirtualHostListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VirtualHostList != null) {
            this.VirtualHostList = new RabbitMQPrivateVirtualHost[source.VirtualHostList.length];
            for (int i = 0; i < source.VirtualHostList.length; i++) {
                this.VirtualHostList[i] = new RabbitMQPrivateVirtualHost(source.VirtualHostList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VirtualHostList.", this.VirtualHostList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

