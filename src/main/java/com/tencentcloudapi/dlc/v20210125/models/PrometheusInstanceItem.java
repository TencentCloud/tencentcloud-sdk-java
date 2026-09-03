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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstanceItem extends AbstractModel {

    /**
    * <p>Prometheus 实例 ID，例如 prom-xxxxxxxx</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>所属 VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>所属子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例状态：1=创建中, 2=运行中, 3=异常, 4=重启中, 5=销毁中, 6=已停机, 7=已删除, 8=欠费停服中, 9=欠费已停服</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * <p>是否与 TKE 集群同 VPC；true 会被前置排序</p>
    */
    @SerializedName("SameVpcWithTke")
    @Expose
    private Boolean SameVpcWithTke;

    /**
     * Get <p>Prometheus 实例 ID，例如 prom-xxxxxxxx</p> 
     * @return InstanceId <p>Prometheus 实例 ID，例如 prom-xxxxxxxx</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Prometheus 实例 ID，例如 prom-xxxxxxxx</p>
     * @param InstanceId <p>Prometheus 实例 ID，例如 prom-xxxxxxxx</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>所属 VPC ID</p> 
     * @return VpcId <p>所属 VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>所属 VPC ID</p>
     * @param VpcId <p>所属 VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>所属子网 ID</p> 
     * @return SubnetId <p>所属子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>所属子网 ID</p>
     * @param SubnetId <p>所属子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例状态：1=创建中, 2=运行中, 3=异常, 4=重启中, 5=销毁中, 6=已停机, 7=已删除, 8=欠费停服中, 9=欠费已停服</p> 
     * @return InstanceStatus <p>实例状态：1=创建中, 2=运行中, 3=异常, 4=重启中, 5=销毁中, 6=已停机, 7=已删除, 8=欠费停服中, 9=欠费已停服</p>
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态：1=创建中, 2=运行中, 3=异常, 4=重启中, 5=销毁中, 6=已停机, 7=已删除, 8=欠费停服中, 9=欠费已停服</p>
     * @param InstanceStatus <p>实例状态：1=创建中, 2=运行中, 3=异常, 4=重启中, 5=销毁中, 6=已停机, 7=已删除, 8=欠费停服中, 9=欠费已停服</p>
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>是否与 TKE 集群同 VPC；true 会被前置排序</p> 
     * @return SameVpcWithTke <p>是否与 TKE 集群同 VPC；true 会被前置排序</p>
     */
    public Boolean getSameVpcWithTke() {
        return this.SameVpcWithTke;
    }

    /**
     * Set <p>是否与 TKE 集群同 VPC；true 会被前置排序</p>
     * @param SameVpcWithTke <p>是否与 TKE 集群同 VPC；true 会被前置排序</p>
     */
    public void setSameVpcWithTke(Boolean SameVpcWithTke) {
        this.SameVpcWithTke = SameVpcWithTke;
    }

    public PrometheusInstanceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceItem(PrometheusInstanceItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.SameVpcWithTke != null) {
            this.SameVpcWithTke = new Boolean(source.SameVpcWithTke);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SameVpcWithTke", this.SameVpcWithTke);

    }
}

