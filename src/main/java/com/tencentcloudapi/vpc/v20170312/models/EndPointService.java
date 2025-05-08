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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndPointService extends AbstractModel {

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
    * 后端服务的ID，比如lb-lip4e6bp。
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
    */
    @SerializedName("EndPointCount")
    @Expose
    private Long EndPointCount;

    /**
    * 终端节点对象数组。
    */
    @SerializedName("EndPointSet")
    @Expose
    private EndPoint [] EndPointSet;

    /**
    * 创建时间。格式为YYYY-MM-DD HH:MM:SS字符串。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * CDC 集群唯一 ID
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 终端节点服务Uin。
    */
    @SerializedName("ServiceUin")
    @Expose
    private String ServiceUin;

    /**
    * 服务IP类型
    */
    @SerializedName("BusinessIpType")
    @Expose
    private Long BusinessIpType;

    /**
    * 标签键值对。	
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

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
     * Get 后端服务的ID，比如lb-lip4e6bp。 
     * @return ServiceInstanceId 后端服务的ID，比如lb-lip4e6bp。
     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set 后端服务的ID，比如lb-lip4e6bp。
     * @param ServiceInstanceId 后端服务的ID，比如lb-lip4e6bp。
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
     * @return EndPointCount 关联的终端节点个数。
     */
    public Long getEndPointCount() {
        return this.EndPointCount;
    }

    /**
     * Set 关联的终端节点个数。
     * @param EndPointCount 关联的终端节点个数。
     */
    public void setEndPointCount(Long EndPointCount) {
        this.EndPointCount = EndPointCount;
    }

    /**
     * Get 终端节点对象数组。 
     * @return EndPointSet 终端节点对象数组。
     */
    public EndPoint [] getEndPointSet() {
        return this.EndPointSet;
    }

    /**
     * Set 终端节点对象数组。
     * @param EndPointSet 终端节点对象数组。
     */
    public void setEndPointSet(EndPoint [] EndPointSet) {
        this.EndPointSet = EndPointSet;
    }

    /**
     * Get 创建时间。格式为YYYY-MM-DD HH:MM:SS字符串。 
     * @return CreateTime 创建时间。格式为YYYY-MM-DD HH:MM:SS字符串。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。格式为YYYY-MM-DD HH:MM:SS字符串。
     * @param CreateTime 创建时间。格式为YYYY-MM-DD HH:MM:SS字符串。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。 
     * @return ServiceType 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。
     * @param ServiceType 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get CDC 集群唯一 ID 
     * @return CdcId CDC 集群唯一 ID
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC 集群唯一 ID
     * @param CdcId CDC 集群唯一 ID
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 终端节点服务Uin。 
     * @return ServiceUin 终端节点服务Uin。
     */
    public String getServiceUin() {
        return this.ServiceUin;
    }

    /**
     * Set 终端节点服务Uin。
     * @param ServiceUin 终端节点服务Uin。
     */
    public void setServiceUin(String ServiceUin) {
        this.ServiceUin = ServiceUin;
    }

    /**
     * Get 服务IP类型 
     * @return BusinessIpType 服务IP类型
     */
    public Long getBusinessIpType() {
        return this.BusinessIpType;
    }

    /**
     * Set 服务IP类型
     * @param BusinessIpType 服务IP类型
     */
    public void setBusinessIpType(Long BusinessIpType) {
        this.BusinessIpType = BusinessIpType;
    }

    /**
     * Get 标签键值对。	 
     * @return TagSet 标签键值对。	
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。	
     * @param TagSet 标签键值对。	
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
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
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.ServiceUin != null) {
            this.ServiceUin = new String(source.ServiceUin);
        }
        if (source.BusinessIpType != null) {
            this.BusinessIpType = new Long(source.BusinessIpType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
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
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "ServiceUin", this.ServiceUin);
        this.setParamSimple(map, prefix + "BusinessIpType", this.BusinessIpType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

