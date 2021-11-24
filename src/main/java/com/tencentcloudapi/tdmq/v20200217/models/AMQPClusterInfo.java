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

public class AMQPClusterInfo extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 创建时间，毫秒为单位
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicEndPoint")
    @Expose
    private String PublicEndPoint;

    /**
    * VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcEndPoint")
    @Expose
    private String VpcEndPoint;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 地域信息 
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 创建时间，毫秒为单位 
     * @return CreateTime 创建时间，毫秒为单位
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒为单位
     * @param CreateTime 创建时间，毫秒为单位
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 集群说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 公网接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicEndPoint 公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicEndPoint() {
        return this.PublicEndPoint;
    }

    /**
     * Set 公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicEndPoint 公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicEndPoint(String PublicEndPoint) {
        this.PublicEndPoint = PublicEndPoint;
    }

    /**
     * Get VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcEndPoint VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcEndPoint() {
        return this.VpcEndPoint;
    }

    /**
     * Set VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcEndPoint VPC接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcEndPoint(String VpcEndPoint) {
        this.VpcEndPoint = VpcEndPoint;
    }

    public AMQPClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMQPClusterInfo(AMQPClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicEndPoint != null) {
            this.PublicEndPoint = new String(source.PublicEndPoint);
        }
        if (source.VpcEndPoint != null) {
            this.VpcEndPoint = new String(source.VpcEndPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicEndPoint", this.PublicEndPoint);
        this.setParamSimple(map, prefix + "VpcEndPoint", this.VpcEndPoint);

    }
}

