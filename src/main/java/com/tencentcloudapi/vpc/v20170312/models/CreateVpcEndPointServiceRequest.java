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

public class CreateVpcEndPointServiceRequest extends AbstractModel{

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 终端节点服务名称。
    */
    @SerializedName("EndPointServiceName")
    @Expose
    private String EndPointServiceName;

    /**
    * 是否自动接受。
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * 后端服务ID，比如lb-xxx。
    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * 是否是PassService类型。
    */
    @SerializedName("IsPassService")
    @Expose
    private Boolean IsPassService;

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 终端节点服务名称。 
     * @return EndPointServiceName 终端节点服务名称。
     */
    public String getEndPointServiceName() {
        return this.EndPointServiceName;
    }

    /**
     * Set 终端节点服务名称。
     * @param EndPointServiceName 终端节点服务名称。
     */
    public void setEndPointServiceName(String EndPointServiceName) {
        this.EndPointServiceName = EndPointServiceName;
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
     * Get 后端服务ID，比如lb-xxx。 
     * @return ServiceInstanceId 后端服务ID，比如lb-xxx。
     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set 后端服务ID，比如lb-xxx。
     * @param ServiceInstanceId 后端服务ID，比如lb-xxx。
     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get 是否是PassService类型。 
     * @return IsPassService 是否是PassService类型。
     */
    public Boolean getIsPassService() {
        return this.IsPassService;
    }

    /**
     * Set 是否是PassService类型。
     * @param IsPassService 是否是PassService类型。
     */
    public void setIsPassService(Boolean IsPassService) {
        this.IsPassService = IsPassService;
    }

    public CreateVpcEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcEndPointServiceRequest(CreateVpcEndPointServiceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.EndPointServiceName != null) {
            this.EndPointServiceName = new String(source.EndPointServiceName);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.IsPassService != null) {
            this.IsPassService = new Boolean(source.IsPassService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "EndPointServiceName", this.EndPointServiceName);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "IsPassService", this.IsPassService);

    }
}

