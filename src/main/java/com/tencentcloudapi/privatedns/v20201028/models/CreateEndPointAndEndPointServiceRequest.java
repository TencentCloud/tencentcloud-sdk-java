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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEndPointAndEndPointServiceRequest extends AbstractModel {

    /**
    * VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 是否自动接受
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * 后端服务ID
    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * 终端节点名称
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 终端节点地域，必须要和终端节点服务所属地域一致
    */
    @SerializedName("EndPointRegion")
    @Expose
    private String EndPointRegion;

    /**
    * 终端节点服务名称
    */
    @SerializedName("EndPointServiceName")
    @Expose
    private String EndPointServiceName;

    /**
    * 挂载的PAAS服务类型，CLB,CDB,CRS
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 终端节点ip数量
    */
    @SerializedName("IpNum")
    @Expose
    private Long IpNum;

    /**
     * Get VPC实例ID 
     * @return VpcId VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID
     * @param VpcId VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 是否自动接受 
     * @return AutoAcceptFlag 是否自动接受
     */
    public Boolean getAutoAcceptFlag() {
        return this.AutoAcceptFlag;
    }

    /**
     * Set 是否自动接受
     * @param AutoAcceptFlag 是否自动接受
     */
    public void setAutoAcceptFlag(Boolean AutoAcceptFlag) {
        this.AutoAcceptFlag = AutoAcceptFlag;
    }

    /**
     * Get 后端服务ID 
     * @return ServiceInstanceId 后端服务ID
     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set 后端服务ID
     * @param ServiceInstanceId 后端服务ID
     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get 终端节点名称 
     * @return EndPointName 终端节点名称
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名称
     * @param EndPointName 终端节点名称
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 终端节点地域，必须要和终端节点服务所属地域一致 
     * @return EndPointRegion 终端节点地域，必须要和终端节点服务所属地域一致
     */
    public String getEndPointRegion() {
        return this.EndPointRegion;
    }

    /**
     * Set 终端节点地域，必须要和终端节点服务所属地域一致
     * @param EndPointRegion 终端节点地域，必须要和终端节点服务所属地域一致
     */
    public void setEndPointRegion(String EndPointRegion) {
        this.EndPointRegion = EndPointRegion;
    }

    /**
     * Get 终端节点服务名称 
     * @return EndPointServiceName 终端节点服务名称
     */
    public String getEndPointServiceName() {
        return this.EndPointServiceName;
    }

    /**
     * Set 终端节点服务名称
     * @param EndPointServiceName 终端节点服务名称
     */
    public void setEndPointServiceName(String EndPointServiceName) {
        this.EndPointServiceName = EndPointServiceName;
    }

    /**
     * Get 挂载的PAAS服务类型，CLB,CDB,CRS 
     * @return ServiceType 挂载的PAAS服务类型，CLB,CDB,CRS
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 挂载的PAAS服务类型，CLB,CDB,CRS
     * @param ServiceType 挂载的PAAS服务类型，CLB,CDB,CRS
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 终端节点ip数量 
     * @return IpNum 终端节点ip数量
     */
    public Long getIpNum() {
        return this.IpNum;
    }

    /**
     * Set 终端节点ip数量
     * @param IpNum 终端节点ip数量
     */
    public void setIpNum(Long IpNum) {
        this.IpNum = IpNum;
    }

    public CreateEndPointAndEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEndPointAndEndPointServiceRequest(CreateEndPointAndEndPointServiceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointRegion != null) {
            this.EndPointRegion = new String(source.EndPointRegion);
        }
        if (source.EndPointServiceName != null) {
            this.EndPointServiceName = new String(source.EndPointServiceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.IpNum != null) {
            this.IpNum = new Long(source.IpNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointRegion", this.EndPointRegion);
        this.setParamSimple(map, prefix + "EndPointServiceName", this.EndPointServiceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "IpNum", this.IpNum);

    }
}

