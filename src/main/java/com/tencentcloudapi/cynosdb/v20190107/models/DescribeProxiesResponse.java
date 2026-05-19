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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesResponse extends AbstractModel {

    /**
    * <p>数据库代理组数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>数据库代理组列表</p>
    */
    @SerializedName("ProxyGroupInfos")
    @Expose
    private ProxyGroupInfo [] ProxyGroupInfos;

    /**
    * <p>数据库代理节点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNodeInfos")
    @Expose
    private ProxyNodeInfo [] ProxyNodeInfos;

    /**
    * <p>sql自动转发</p>
    */
    @SerializedName("ColumnStoreProxyForward")
    @Expose
    private String ColumnStoreProxyForward;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>数据库代理组数</p> 
     * @return TotalCount <p>数据库代理组数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>数据库代理组数</p>
     * @param TotalCount <p>数据库代理组数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>数据库代理组列表</p> 
     * @return ProxyGroupInfos <p>数据库代理组列表</p>
     */
    public ProxyGroupInfo [] getProxyGroupInfos() {
        return this.ProxyGroupInfos;
    }

    /**
     * Set <p>数据库代理组列表</p>
     * @param ProxyGroupInfos <p>数据库代理组列表</p>
     */
    public void setProxyGroupInfos(ProxyGroupInfo [] ProxyGroupInfos) {
        this.ProxyGroupInfos = ProxyGroupInfos;
    }

    /**
     * Get <p>数据库代理节点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNodeInfos <p>数据库代理节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyNodeInfo [] getProxyNodeInfos() {
        return this.ProxyNodeInfos;
    }

    /**
     * Set <p>数据库代理节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNodeInfos <p>数据库代理节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNodeInfos(ProxyNodeInfo [] ProxyNodeInfos) {
        this.ProxyNodeInfos = ProxyNodeInfos;
    }

    /**
     * Get <p>sql自动转发</p> 
     * @return ColumnStoreProxyForward <p>sql自动转发</p>
     */
    public String getColumnStoreProxyForward() {
        return this.ColumnStoreProxyForward;
    }

    /**
     * Set <p>sql自动转发</p>
     * @param ColumnStoreProxyForward <p>sql自动转发</p>
     */
    public void setColumnStoreProxyForward(String ColumnStoreProxyForward) {
        this.ColumnStoreProxyForward = ColumnStoreProxyForward;
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

    public DescribeProxiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxiesResponse(DescribeProxiesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ProxyGroupInfos != null) {
            this.ProxyGroupInfos = new ProxyGroupInfo[source.ProxyGroupInfos.length];
            for (int i = 0; i < source.ProxyGroupInfos.length; i++) {
                this.ProxyGroupInfos[i] = new ProxyGroupInfo(source.ProxyGroupInfos[i]);
            }
        }
        if (source.ProxyNodeInfos != null) {
            this.ProxyNodeInfos = new ProxyNodeInfo[source.ProxyNodeInfos.length];
            for (int i = 0; i < source.ProxyNodeInfos.length; i++) {
                this.ProxyNodeInfos[i] = new ProxyNodeInfo(source.ProxyNodeInfos[i]);
            }
        }
        if (source.ColumnStoreProxyForward != null) {
            this.ColumnStoreProxyForward = new String(source.ColumnStoreProxyForward);
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
        this.setParamArrayObj(map, prefix + "ProxyGroupInfos.", this.ProxyGroupInfos);
        this.setParamArrayObj(map, prefix + "ProxyNodeInfos.", this.ProxyNodeInfos);
        this.setParamSimple(map, prefix + "ColumnStoreProxyForward", this.ColumnStoreProxyForward);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

