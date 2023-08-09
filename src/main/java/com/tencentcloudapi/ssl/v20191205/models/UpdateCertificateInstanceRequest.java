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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCertificateInstanceRequest extends AbstractModel{

    /**
    * 一键更新新证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 一键更新原证书ID
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * 需要部署的资源类型，参数值可选：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * 需要部署的地域列表（废弃）
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
    * 云资源需要部署的地域列表
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
     * Get 一键更新新证书ID 
     * @return CertificateId 一键更新新证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 一键更新新证书ID
     * @param CertificateId 一键更新新证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 一键更新原证书ID 
     * @return OldCertificateId 一键更新原证书ID
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 一键更新原证书ID
     * @param OldCertificateId 一键更新原证书ID
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get 需要部署的资源类型，参数值可选：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb 
     * @return ResourceTypes 需要部署的资源类型，参数值可选：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set 需要部署的资源类型，参数值可选：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb
     * @param ResourceTypes 需要部署的资源类型，参数值可选：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get 需要部署的地域列表（废弃） 
     * @return Regions 需要部署的地域列表（废弃）
     * @deprecated
     */
    @Deprecated
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 需要部署的地域列表（废弃）
     * @param Regions 需要部署的地域列表（废弃）
     * @deprecated
     */
    @Deprecated
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get 云资源需要部署的地域列表 
     * @return ResourceTypesRegions 云资源需要部署的地域列表
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set 云资源需要部署的地域列表
     * @param ResourceTypesRegions 云资源需要部署的地域列表
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    public UpdateCertificateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCertificateInstanceRequest(UpdateCertificateInstanceRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
        if (source.ResourceTypesRegions != null) {
            this.ResourceTypesRegions = new ResourceTypeRegions[source.ResourceTypesRegions.length];
            for (int i = 0; i < source.ResourceTypesRegions.length; i++) {
                this.ResourceTypesRegions[i] = new ResourceTypeRegions(source.ResourceTypesRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);
        this.setParamArrayObj(map, prefix + "ResourceTypesRegions.", this.ResourceTypesRegions);

    }
}

