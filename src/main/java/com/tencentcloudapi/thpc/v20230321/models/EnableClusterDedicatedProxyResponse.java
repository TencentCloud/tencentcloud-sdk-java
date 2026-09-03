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

public class EnableClusterDedicatedProxyResponse extends AbstractModel {

    /**
    * <p>终端节点ID。</p>
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * <p>终端节点VIP地址。</p>
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * <p>终端节点是否就绪。true表示已就绪，false表示未就绪。</p>
    */
    @SerializedName("EndPointReady")
    @Expose
    private Boolean EndPointReady;

    /**
    * <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li></p>
    */
    @SerializedName("EndPointStatus")
    @Expose
    private String EndPointStatus;

    /**
    * <p>私有网络ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>终端节点ID。</p> 
     * @return EndPointId <p>终端节点ID。</p>
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set <p>终端节点ID。</p>
     * @param EndPointId <p>终端节点ID。</p>
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get <p>终端节点VIP地址。</p> 
     * @return EndPointVip <p>终端节点VIP地址。</p>
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set <p>终端节点VIP地址。</p>
     * @param EndPointVip <p>终端节点VIP地址。</p>
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get <p>终端节点是否就绪。true表示已就绪，false表示未就绪。</p> 
     * @return EndPointReady <p>终端节点是否就绪。true表示已就绪，false表示未就绪。</p>
     */
    public Boolean getEndPointReady() {
        return this.EndPointReady;
    }

    /**
     * Set <p>终端节点是否就绪。true表示已就绪，false表示未就绪。</p>
     * @param EndPointReady <p>终端节点是否就绪。true表示已就绪，false表示未就绪。</p>
     */
    public void setEndPointReady(Boolean EndPointReady) {
        this.EndPointReady = EndPointReady;
    }

    /**
     * Get <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li></p> 
     * @return EndPointStatus <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li></p>
     */
    public String getEndPointStatus() {
        return this.EndPointStatus;
    }

    /**
     * Set <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li></p>
     * @param EndPointStatus <p>终端节点状态。取值范围：<li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li></p>
     */
    public void setEndPointStatus(String EndPointStatus) {
        this.EndPointStatus = EndPointStatus;
    }

    /**
     * Get <p>私有网络ID。</p> 
     * @return VpcId <p>私有网络ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID。</p>
     * @param VpcId <p>私有网络ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID。</p> 
     * @return SubnetId <p>子网ID。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID。</p>
     * @param SubnetId <p>子网ID。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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

    public EnableClusterDedicatedProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableClusterDedicatedProxyResponse(EnableClusterDedicatedProxyResponse source) {
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
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "EndPointReady", this.EndPointReady);
        this.setParamSimple(map, prefix + "EndPointStatus", this.EndPointStatus);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

