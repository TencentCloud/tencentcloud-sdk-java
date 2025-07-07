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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayLoadBalancer extends AbstractModel {

    /**
    * 网关负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 网关负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 网关负载均衡所属私有网络。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网关负载均衡所属子网。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 网关负载均衡提供服务的虚拟IP。
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * 网关负载均衡实例状态。
0：创建中，1：正常运行，3：删除中。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 关联的目标组唯一ID。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 是否开启删除保护功能。
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * 负载均衡实例的标签信息。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 网关负载均衡实例的计费类型，POSTPAID_BY_HOUR：按量计费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 0：表示未被隔离，1：表示被隔离。
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * 网关负载均衡实例被隔离的时间
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 是否开启配置修改保护功能。
    */
    @SerializedName("OperateProtect")
    @Expose
    private Boolean OperateProtect;

    /**
     * Get 网关负载均衡实例 ID。 
     * @return LoadBalancerId 网关负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 网关负载均衡实例 ID。
     * @param LoadBalancerId 网关负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 网关负载均衡实例的名称。 
     * @return LoadBalancerName 网关负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 网关负载均衡实例的名称。
     * @param LoadBalancerName 网关负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 网关负载均衡所属私有网络。 
     * @return VpcId 网关负载均衡所属私有网络。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 网关负载均衡所属私有网络。
     * @param VpcId 网关负载均衡所属私有网络。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网关负载均衡所属子网。 
     * @return SubnetId 网关负载均衡所属子网。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 网关负载均衡所属子网。
     * @param SubnetId 网关负载均衡所属子网。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 网关负载均衡提供服务的虚拟IP。 
     * @return Vips 网关负载均衡提供服务的虚拟IP。
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set 网关负载均衡提供服务的虚拟IP。
     * @param Vips 网关负载均衡提供服务的虚拟IP。
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get 网关负载均衡实例状态。
0：创建中，1：正常运行，3：删除中。 
     * @return Status 网关负载均衡实例状态。
0：创建中，1：正常运行，3：删除中。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 网关负载均衡实例状态。
0：创建中，1：正常运行，3：删除中。
     * @param Status 网关负载均衡实例状态。
0：创建中，1：正常运行，3：删除中。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 关联的目标组唯一ID。 
     * @return TargetGroupId 关联的目标组唯一ID。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 关联的目标组唯一ID。
     * @param TargetGroupId 关联的目标组唯一ID。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 是否开启删除保护功能。 
     * @return DeleteProtect 是否开启删除保护功能。
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set 是否开启删除保护功能。
     * @param DeleteProtect 是否开启删除保护功能。
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get 负载均衡实例的标签信息。 
     * @return Tags 负载均衡实例的标签信息。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 负载均衡实例的标签信息。
     * @param Tags 负载均衡实例的标签信息。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 网关负载均衡实例的计费类型，POSTPAID_BY_HOUR：按量计费 
     * @return ChargeType 网关负载均衡实例的计费类型，POSTPAID_BY_HOUR：按量计费
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 网关负载均衡实例的计费类型，POSTPAID_BY_HOUR：按量计费
     * @param ChargeType 网关负载均衡实例的计费类型，POSTPAID_BY_HOUR：按量计费
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 0：表示未被隔离，1：表示被隔离。 
     * @return Isolation 0：表示未被隔离，1：表示被隔离。
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0：表示未被隔离，1：表示被隔离。
     * @param Isolation 0：表示未被隔离，1：表示被隔离。
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get 网关负载均衡实例被隔离的时间 
     * @return IsolatedTime 网关负载均衡实例被隔离的时间
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 网关负载均衡实例被隔离的时间
     * @param IsolatedTime 网关负载均衡实例被隔离的时间
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 是否开启配置修改保护功能。 
     * @return OperateProtect 是否开启配置修改保护功能。
     */
    public Boolean getOperateProtect() {
        return this.OperateProtect;
    }

    /**
     * Set 是否开启配置修改保护功能。
     * @param OperateProtect 是否开启配置修改保护功能。
     */
    public void setOperateProtect(Boolean OperateProtect) {
        this.OperateProtect = OperateProtect;
    }

    public GatewayLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayLoadBalancer(GatewayLoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Isolation != null) {
            this.Isolation = new Long(source.Isolation);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.OperateProtect != null) {
            this.OperateProtect = new Boolean(source.OperateProtect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Isolation", this.Isolation);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "OperateProtect", this.OperateProtect);

    }
}

