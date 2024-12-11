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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNativeGatewayServiceSourceRequest extends AbstractModel {

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayID")
    @Expose
    private String GatewayID;

    /**
    * 服务来源类型，参考值：
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 服务来源实例ID，当SourceType的值不为PrivateDNS或Customer-DNS时，必填
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
    * 服务来源实例名称，当SourceType的值不为PrivateDNS时，必填
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 服务来源实例额外信息
    */
    @SerializedName("SourceInfo")
    @Expose
    private SourceInfo SourceInfo;

    /**
     * Get 网关实例ID 
     * @return GatewayID 网关实例ID
     */
    public String getGatewayID() {
        return this.GatewayID;
    }

    /**
     * Set 网关实例ID
     * @param GatewayID 网关实例ID
     */
    public void setGatewayID(String GatewayID) {
        this.GatewayID = GatewayID;
    }

    /**
     * Get 服务来源类型，参考值：
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS 
     * @return SourceType 服务来源类型，参考值：
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 服务来源类型，参考值：
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
     * @param SourceType 服务来源类型，参考值：
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 服务来源实例ID，当SourceType的值不为PrivateDNS或Customer-DNS时，必填 
     * @return SourceID 服务来源实例ID，当SourceType的值不为PrivateDNS或Customer-DNS时，必填
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set 服务来源实例ID，当SourceType的值不为PrivateDNS或Customer-DNS时，必填
     * @param SourceID 服务来源实例ID，当SourceType的值不为PrivateDNS或Customer-DNS时，必填
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    /**
     * Get 服务来源实例名称，当SourceType的值不为PrivateDNS时，必填 
     * @return SourceName 服务来源实例名称，当SourceType的值不为PrivateDNS时，必填
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 服务来源实例名称，当SourceType的值不为PrivateDNS时，必填
     * @param SourceName 服务来源实例名称，当SourceType的值不为PrivateDNS时，必填
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 服务来源实例额外信息 
     * @return SourceInfo 服务来源实例额外信息
     */
    public SourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 服务来源实例额外信息
     * @param SourceInfo 服务来源实例额外信息
     */
    public void setSourceInfo(SourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public CreateNativeGatewayServiceSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNativeGatewayServiceSourceRequest(CreateNativeGatewayServiceSourceRequest source) {
        if (source.GatewayID != null) {
            this.GatewayID = new String(source.GatewayID);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new SourceInfo(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayID", this.GatewayID);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

