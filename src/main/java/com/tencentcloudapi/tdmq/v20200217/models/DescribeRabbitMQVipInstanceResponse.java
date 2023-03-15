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

public class DescribeRabbitMQVipInstanceResponse extends AbstractModel{

    /**
    * 集群信息
    */
    @SerializedName("ClusterInfo")
    @Expose
    private RabbitMQClusterInfo ClusterInfo;

    /**
    * 集群规格信息
    */
    @SerializedName("ClusterSpecInfo")
    @Expose
    private RabbitMQClusterSpecInfo ClusterSpecInfo;

    /**
    * 集群访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterNetInfo")
    @Expose
    private RabbitMQClusterAccessInfo ClusterNetInfo;

    /**
    * 集群白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterWhiteListInfo")
    @Expose
    private RabbitMQClusterWhiteListInfo ClusterWhiteListInfo;

    /**
    * vhost配额信息
    */
    @SerializedName("VirtualHostQuota")
    @Expose
    private VirtualHostQuota VirtualHostQuota;

    /**
    * exchange配额信息
    */
    @SerializedName("ExchangeQuota")
    @Expose
    private ExchangeQuota ExchangeQuota;

    /**
    * queue配额信息
    */
    @SerializedName("QueueQuota")
    @Expose
    private QueueQuota QueueQuota;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群信息 
     * @return ClusterInfo 集群信息
     */
    public RabbitMQClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set 集群信息
     * @param ClusterInfo 集群信息
     */
    public void setClusterInfo(RabbitMQClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get 集群规格信息 
     * @return ClusterSpecInfo 集群规格信息
     */
    public RabbitMQClusterSpecInfo getClusterSpecInfo() {
        return this.ClusterSpecInfo;
    }

    /**
     * Set 集群规格信息
     * @param ClusterSpecInfo 集群规格信息
     */
    public void setClusterSpecInfo(RabbitMQClusterSpecInfo ClusterSpecInfo) {
        this.ClusterSpecInfo = ClusterSpecInfo;
    }

    /**
     * Get 集群访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterNetInfo 集群访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RabbitMQClusterAccessInfo getClusterNetInfo() {
        return this.ClusterNetInfo;
    }

    /**
     * Set 集群访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterNetInfo 集群访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterNetInfo(RabbitMQClusterAccessInfo ClusterNetInfo) {
        this.ClusterNetInfo = ClusterNetInfo;
    }

    /**
     * Get 集群白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterWhiteListInfo 集群白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RabbitMQClusterWhiteListInfo getClusterWhiteListInfo() {
        return this.ClusterWhiteListInfo;
    }

    /**
     * Set 集群白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterWhiteListInfo 集群白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterWhiteListInfo(RabbitMQClusterWhiteListInfo ClusterWhiteListInfo) {
        this.ClusterWhiteListInfo = ClusterWhiteListInfo;
    }

    /**
     * Get vhost配额信息 
     * @return VirtualHostQuota vhost配额信息
     */
    public VirtualHostQuota getVirtualHostQuota() {
        return this.VirtualHostQuota;
    }

    /**
     * Set vhost配额信息
     * @param VirtualHostQuota vhost配额信息
     */
    public void setVirtualHostQuota(VirtualHostQuota VirtualHostQuota) {
        this.VirtualHostQuota = VirtualHostQuota;
    }

    /**
     * Get exchange配额信息 
     * @return ExchangeQuota exchange配额信息
     */
    public ExchangeQuota getExchangeQuota() {
        return this.ExchangeQuota;
    }

    /**
     * Set exchange配额信息
     * @param ExchangeQuota exchange配额信息
     */
    public void setExchangeQuota(ExchangeQuota ExchangeQuota) {
        this.ExchangeQuota = ExchangeQuota;
    }

    /**
     * Get queue配额信息 
     * @return QueueQuota queue配额信息
     */
    public QueueQuota getQueueQuota() {
        return this.QueueQuota;
    }

    /**
     * Set queue配额信息
     * @param QueueQuota queue配额信息
     */
    public void setQueueQuota(QueueQuota QueueQuota) {
        this.QueueQuota = QueueQuota;
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

    public DescribeRabbitMQVipInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQVipInstanceResponse(DescribeRabbitMQVipInstanceResponse source) {
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new RabbitMQClusterInfo(source.ClusterInfo);
        }
        if (source.ClusterSpecInfo != null) {
            this.ClusterSpecInfo = new RabbitMQClusterSpecInfo(source.ClusterSpecInfo);
        }
        if (source.ClusterNetInfo != null) {
            this.ClusterNetInfo = new RabbitMQClusterAccessInfo(source.ClusterNetInfo);
        }
        if (source.ClusterWhiteListInfo != null) {
            this.ClusterWhiteListInfo = new RabbitMQClusterWhiteListInfo(source.ClusterWhiteListInfo);
        }
        if (source.VirtualHostQuota != null) {
            this.VirtualHostQuota = new VirtualHostQuota(source.VirtualHostQuota);
        }
        if (source.ExchangeQuota != null) {
            this.ExchangeQuota = new ExchangeQuota(source.ExchangeQuota);
        }
        if (source.QueueQuota != null) {
            this.QueueQuota = new QueueQuota(source.QueueQuota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamObj(map, prefix + "ClusterSpecInfo.", this.ClusterSpecInfo);
        this.setParamObj(map, prefix + "ClusterNetInfo.", this.ClusterNetInfo);
        this.setParamObj(map, prefix + "ClusterWhiteListInfo.", this.ClusterWhiteListInfo);
        this.setParamObj(map, prefix + "VirtualHostQuota.", this.VirtualHostQuota);
        this.setParamObj(map, prefix + "ExchangeQuota.", this.ExchangeQuota);
        this.setParamObj(map, prefix + "QueueQuota.", this.QueueQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

