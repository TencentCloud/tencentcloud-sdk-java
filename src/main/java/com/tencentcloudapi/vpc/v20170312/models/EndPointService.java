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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndPointService extends AbstractModel{

    /**
    * 终端节点服务ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * VPCID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * APPID。
    */
    @SerializedName("ServiceOwner")
    @Expose
    private String ServiceOwner;

    /**
    * 终端节点服务名称。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 后端服务的VIP。
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * 后端服务的ID，比如lb-xxx。
    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * 是否自动接受。
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * 关联的终端节点个数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPointCount")
    @Expose
    private Long EndPointCount;

    /**
    * 终端节点对象数组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPointSet")
    @Expose
    private EndPoint [] EndPointSet;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 终端节点服务ID 
     * @return EndPointServiceId 终端节点服务ID
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID
     * @param EndPointServiceId 终端节点服务ID
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get VPCID。 
     * @return VpcId VPCID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPCID。
     * @param VpcId VPCID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get APPID。 
     * @return ServiceOwner APPID。
     */
    public String getServiceOwner() {
        return this.ServiceOwner;
    }

    /**
     * Set APPID。
     * @param ServiceOwner APPID。
     */
    public void setServiceOwner(String ServiceOwner) {
        this.ServiceOwner = ServiceOwner;
    }

    /**
     * Get 终端节点服务名称。 
     * @return ServiceName 终端节点服务名称。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 终端节点服务名称。
     * @param ServiceName 终端节点服务名称。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 后端服务的VIP。 
     * @return ServiceVip 后端服务的VIP。
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set 后端服务的VIP。
     * @param ServiceVip 后端服务的VIP。
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get 后端服务的ID，比如lb-xxx。 
     * @return ServiceInstanceId 后端服务的ID，比如lb-xxx。
     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set 后端服务的ID，比如lb-xxx。
     * @param ServiceInstanceId 后端服务的ID，比如lb-xxx。
     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get 是否自动接受。 
     * @return AutoAcceptFlag 是否自动接受。
     */
    public Boolean getAutoAcceptFlag() {
        return this.AutoAcceptFlag;
    }

    /**
     * Set 是否自动接受。
     * @param AutoAcceptFlag 是否自动接受。
     */
    public void setAutoAcceptFlag(Boolean AutoAcceptFlag) {
        this.AutoAcceptFlag = AutoAcceptFlag;
    }

    /**
     * Get 关联的终端节点个数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPointCount 关联的终端节点个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndPointCount() {
        return this.EndPointCount;
    }

    /**
     * Set 关联的终端节点个数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPointCount 关联的终端节点个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPointCount(Long EndPointCount) {
        this.EndPointCount = EndPointCount;
    }

    /**
     * Get 终端节点对象数组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPointSet 终端节点对象数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EndPoint [] getEndPointSet() {
        return this.EndPointSet;
    }

    /**
     * Set 终端节点对象数组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPointSet 终端节点对象数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPointSet(EndPoint [] EndPointSet) {
        this.EndPointSet = EndPointSet;
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

    public EndPointService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndPointService(EndPointService source) {
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ServiceOwner != null) {
            this.ServiceOwner = new String(source.ServiceOwner);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.EndPointCount != null) {
            this.EndPointCount = new Long(source.EndPointCount);
        }
        if (source.EndPointSet != null) {
            this.EndPointSet = new EndPoint[source.EndPointSet.length];
            for (int i = 0; i < source.EndPointSet.length; i++) {
                this.EndPointSet[i] = new EndPoint(source.EndPointSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ServiceOwner", this.ServiceOwner);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "EndPointCount", this.EndPointCount);
        this.setParamArrayObj(map, prefix + "EndPointSet.", this.EndPointSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

