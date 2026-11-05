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

public class DescribeInstanceServerlessQuotaResponse extends AbstractModel {

    /**
    * <p>集群实例Serveless弹性配置</p>
    */
    @SerializedName("QuotaConfigs")
    @Expose
    private ClusterServerlessQuotaConfig [] QuotaConfigs;

    /**
    * <p>集群实例Serverless弹性状态</p>
    */
    @SerializedName("InstanceQuotas")
    @Expose
    private InstanceServerlessQuotaInfo [] InstanceQuotas;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>集群实例Serveless弹性配置</p> 
     * @return QuotaConfigs <p>集群实例Serveless弹性配置</p>
     */
    public ClusterServerlessQuotaConfig [] getQuotaConfigs() {
        return this.QuotaConfigs;
    }

    /**
     * Set <p>集群实例Serveless弹性配置</p>
     * @param QuotaConfigs <p>集群实例Serveless弹性配置</p>
     */
    public void setQuotaConfigs(ClusterServerlessQuotaConfig [] QuotaConfigs) {
        this.QuotaConfigs = QuotaConfigs;
    }

    /**
     * Get <p>集群实例Serverless弹性状态</p> 
     * @return InstanceQuotas <p>集群实例Serverless弹性状态</p>
     */
    public InstanceServerlessQuotaInfo [] getInstanceQuotas() {
        return this.InstanceQuotas;
    }

    /**
     * Set <p>集群实例Serverless弹性状态</p>
     * @param InstanceQuotas <p>集群实例Serverless弹性状态</p>
     */
    public void setInstanceQuotas(InstanceServerlessQuotaInfo [] InstanceQuotas) {
        this.InstanceQuotas = InstanceQuotas;
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

    public DescribeInstanceServerlessQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceServerlessQuotaResponse(DescribeInstanceServerlessQuotaResponse source) {
        if (source.QuotaConfigs != null) {
            this.QuotaConfigs = new ClusterServerlessQuotaConfig[source.QuotaConfigs.length];
            for (int i = 0; i < source.QuotaConfigs.length; i++) {
                this.QuotaConfigs[i] = new ClusterServerlessQuotaConfig(source.QuotaConfigs[i]);
            }
        }
        if (source.InstanceQuotas != null) {
            this.InstanceQuotas = new InstanceServerlessQuotaInfo[source.InstanceQuotas.length];
            for (int i = 0; i < source.InstanceQuotas.length; i++) {
                this.InstanceQuotas[i] = new InstanceServerlessQuotaInfo(source.InstanceQuotas[i]);
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
        this.setParamArrayObj(map, prefix + "QuotaConfigs.", this.QuotaConfigs);
        this.setParamArrayObj(map, prefix + "InstanceQuotas.", this.InstanceQuotas);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

