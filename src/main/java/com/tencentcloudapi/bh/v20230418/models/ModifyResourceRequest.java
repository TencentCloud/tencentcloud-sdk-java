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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceRequest extends AbstractModel {

    /**
    * 需要开通服务的资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例版本
    */
    @SerializedName("ResourceEdition")
    @Expose
    private String ResourceEdition;

    /**
    * 资源节点数
    */
    @SerializedName("ResourceNode")
    @Expose
    private Long ResourceNode;

    /**
    * 自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 带宽扩展包个数(4M)
    */
    @SerializedName("PackageBandwidth")
    @Expose
    private Long PackageBandwidth;

    /**
    * 授权点数扩展包个数(50点)
    */
    @SerializedName("PackageNode")
    @Expose
    private Long PackageNode;

    /**
    * 日志投递
    */
    @SerializedName("LogDelivery")
    @Expose
    private Long LogDelivery;

    /**
     * Get 需要开通服务的资源ID 
     * @return ResourceId 需要开通服务的资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 需要开通服务的资源ID
     * @param ResourceId 需要开通服务的资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     * @deprecated
     */
    @Deprecated
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     * @deprecated
     */
    @Deprecated
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例版本 
     * @return ResourceEdition 实例版本
     */
    public String getResourceEdition() {
        return this.ResourceEdition;
    }

    /**
     * Set 实例版本
     * @param ResourceEdition 实例版本
     */
    public void setResourceEdition(String ResourceEdition) {
        this.ResourceEdition = ResourceEdition;
    }

    /**
     * Get 资源节点数 
     * @return ResourceNode 资源节点数
     */
    public Long getResourceNode() {
        return this.ResourceNode;
    }

    /**
     * Set 资源节点数
     * @param ResourceNode 资源节点数
     */
    public void setResourceNode(Long ResourceNode) {
        this.ResourceNode = ResourceNode;
    }

    /**
     * Get 自动续费 
     * @return AutoRenewFlag 自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费
     * @param AutoRenewFlag 自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 带宽扩展包个数(4M) 
     * @return PackageBandwidth 带宽扩展包个数(4M)
     */
    public Long getPackageBandwidth() {
        return this.PackageBandwidth;
    }

    /**
     * Set 带宽扩展包个数(4M)
     * @param PackageBandwidth 带宽扩展包个数(4M)
     */
    public void setPackageBandwidth(Long PackageBandwidth) {
        this.PackageBandwidth = PackageBandwidth;
    }

    /**
     * Get 授权点数扩展包个数(50点) 
     * @return PackageNode 授权点数扩展包个数(50点)
     */
    public Long getPackageNode() {
        return this.PackageNode;
    }

    /**
     * Set 授权点数扩展包个数(50点)
     * @param PackageNode 授权点数扩展包个数(50点)
     */
    public void setPackageNode(Long PackageNode) {
        this.PackageNode = PackageNode;
    }

    /**
     * Get 日志投递 
     * @return LogDelivery 日志投递
     */
    public Long getLogDelivery() {
        return this.LogDelivery;
    }

    /**
     * Set 日志投递
     * @param LogDelivery 日志投递
     */
    public void setLogDelivery(Long LogDelivery) {
        this.LogDelivery = LogDelivery;
    }

    public ModifyResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceRequest(ModifyResourceRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceEdition != null) {
            this.ResourceEdition = new String(source.ResourceEdition);
        }
        if (source.ResourceNode != null) {
            this.ResourceNode = new Long(source.ResourceNode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PackageBandwidth != null) {
            this.PackageBandwidth = new Long(source.PackageBandwidth);
        }
        if (source.PackageNode != null) {
            this.PackageNode = new Long(source.PackageNode);
        }
        if (source.LogDelivery != null) {
            this.LogDelivery = new Long(source.LogDelivery);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceEdition", this.ResourceEdition);
        this.setParamSimple(map, prefix + "ResourceNode", this.ResourceNode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PackageBandwidth", this.PackageBandwidth);
        this.setParamSimple(map, prefix + "PackageNode", this.PackageNode);
        this.setParamSimple(map, prefix + "LogDelivery", this.LogDelivery);

    }
}

