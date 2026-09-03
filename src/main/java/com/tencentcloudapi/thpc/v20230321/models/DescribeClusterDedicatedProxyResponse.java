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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDedicatedProxyResponse extends AbstractModel {

    /**
    * <p>代理是否已开通。true表示已开通，false表示从未开通。</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>终端节点ID。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * <p>终端节点VIP地址。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * <p>终端节点是否就绪。true表示已就绪可用，false表示未就绪或未开通。</p>
    */
    @SerializedName("EndPointReady")
    @Expose
    private Boolean EndPointReady;

    /**
    * <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><li>ABNORMAL：异常</li><li>UNKNOWN：未知</li><li>ASSUME_ROLE_FAILED：授权失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPointStatus")
    @Expose
    private String EndPointStatus;

    /**
    * <p>上次同步的终端节点状态（DB记录值）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastKnownStatus")
    @Expose
    private String LastKnownStatus;

    /**
    * <p>终端节点服务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * <p>私有网络ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>代理创建时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>上次状态同步时间。cron未同步过时为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSyncTime")
    @Expose
    private String LastSyncTime;

    /**
    * <p>本次实时查询时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealtimeQueryTime")
    @Expose
    private String RealtimeQueryTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>代理是否已开通。true表示已开通，false表示从未开通。</p> 
     * @return Enabled <p>代理是否已开通。true表示已开通，false表示从未开通。</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>代理是否已开通。true表示已开通，false表示从未开通。</p>
     * @param Enabled <p>代理是否已开通。true表示已开通，false表示从未开通。</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>终端节点ID。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPointId <p>终端节点ID。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set <p>终端节点ID。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPointId <p>终端节点ID。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get <p>终端节点VIP地址。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPointVip <p>终端节点VIP地址。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set <p>终端节点VIP地址。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPointVip <p>终端节点VIP地址。未开通代理时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get <p>终端节点是否就绪。true表示已就绪可用，false表示未就绪或未开通。</p> 
     * @return EndPointReady <p>终端节点是否就绪。true表示已就绪可用，false表示未就绪或未开通。</p>
     */
    public Boolean getEndPointReady() {
        return this.EndPointReady;
    }

    /**
     * Set <p>终端节点是否就绪。true表示已就绪可用，false表示未就绪或未开通。</p>
     * @param EndPointReady <p>终端节点是否就绪。true表示已就绪可用，false表示未就绪或未开通。</p>
     */
    public void setEndPointReady(Boolean EndPointReady) {
        this.EndPointReady = EndPointReady;
    }

    /**
     * Get <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><li>ABNORMAL：异常</li><li>UNKNOWN：未知</li><li>ASSUME_ROLE_FAILED：授权失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPointStatus <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><li>ABNORMAL：异常</li><li>UNKNOWN：未知</li><li>ASSUME_ROLE_FAILED：授权失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndPointStatus() {
        return this.EndPointStatus;
    }

    /**
     * Set <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><li>ABNORMAL：异常</li><li>UNKNOWN：未知</li><li>ASSUME_ROLE_FAILED：授权失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPointStatus <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><li>ABNORMAL：异常</li><li>UNKNOWN：未知</li><li>ASSUME_ROLE_FAILED：授权失败</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPointStatus(String EndPointStatus) {
        this.EndPointStatus = EndPointStatus;
    }

    /**
     * Get <p>上次同步的终端节点状态（DB记录值）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastKnownStatus <p>上次同步的终端节点状态（DB记录值）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastKnownStatus() {
        return this.LastKnownStatus;
    }

    /**
     * Set <p>上次同步的终端节点状态（DB记录值）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastKnownStatus <p>上次同步的终端节点状态（DB记录值）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastKnownStatus(String LastKnownStatus) {
        this.LastKnownStatus = LastKnownStatus;
    }

    /**
     * Get <p>终端节点服务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPointServiceId <p>终端节点服务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set <p>终端节点服务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPointServiceId <p>终端节点服务ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get <p>私有网络ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>私有网络ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>私有网络ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId <p>子网ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId <p>子网ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>代理创建时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>代理创建时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>代理创建时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>代理创建时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>上次状态同步时间。cron未同步过时为null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSyncTime <p>上次状态同步时间。cron未同步过时为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSyncTime() {
        return this.LastSyncTime;
    }

    /**
     * Set <p>上次状态同步时间。cron未同步过时为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSyncTime <p>上次状态同步时间。cron未同步过时为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSyncTime(String LastSyncTime) {
        this.LastSyncTime = LastSyncTime;
    }

    /**
     * Get <p>本次实时查询时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealtimeQueryTime <p>本次实时查询时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealtimeQueryTime() {
        return this.RealtimeQueryTime;
    }

    /**
     * Set <p>本次实时查询时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealtimeQueryTime <p>本次实时查询时间。未开通时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealtimeQueryTime(String RealtimeQueryTime) {
        this.RealtimeQueryTime = RealtimeQueryTime;
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

    public DescribeClusterDedicatedProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDedicatedProxyResponse(DescribeClusterDedicatedProxyResponse source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.EndPointVip != null) {
            this.EndPointVip = new String(source.EndPointVip);
        }
        if (source.EndPointReady != null) {
            this.EndPointReady = new Boolean(source.EndPointReady);
        }
        if (source.EndPointStatus != null) {
            this.EndPointStatus = new String(source.EndPointStatus);
        }
        if (source.LastKnownStatus != null) {
            this.LastKnownStatus = new String(source.LastKnownStatus);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastSyncTime != null) {
            this.LastSyncTime = new String(source.LastSyncTime);
        }
        if (source.RealtimeQueryTime != null) {
            this.RealtimeQueryTime = new String(source.RealtimeQueryTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "EndPointReady", this.EndPointReady);
        this.setParamSimple(map, prefix + "EndPointStatus", this.EndPointStatus);
        this.setParamSimple(map, prefix + "LastKnownStatus", this.LastKnownStatus);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastSyncTime", this.LastSyncTime);
        this.setParamSimple(map, prefix + "RealtimeQueryTime", this.RealtimeQueryTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

