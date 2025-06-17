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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateCertificateInstanceRequest extends AbstractModel {

    /**
    * 一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * 需要部署的资源类型，参数值可选（小写）：clb
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * 公钥证书
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * 私钥证书
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * 云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
     * Get 一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新 
     * @return OldCertificateId 一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新
     * @param OldCertificateId 一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get 需要部署的资源类型，参数值可选（小写）：clb 
     * @return ResourceTypes 需要部署的资源类型，参数值可选（小写）：clb
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set 需要部署的资源类型，参数值可选（小写）：clb
     * @param ResourceTypes 需要部署的资源类型，参数值可选（小写）：clb
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get 公钥证书 
     * @return CertificatePublicKey 公钥证书
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set 公钥证书
     * @param CertificatePublicKey 公钥证书
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get 私钥证书 
     * @return CertificatePrivateKey 私钥证书
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set 私钥证书
     * @param CertificatePrivateKey 私钥证书
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get 云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb 
     * @return ResourceTypesRegions 云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set 云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb
     * @param ResourceTypesRegions 云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    public UploadUpdateCertificateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateCertificateInstanceRequest(UploadUpdateCertificateInstanceRequest source) {
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
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
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamArrayObj(map, prefix + "ResourceTypesRegions.", this.ResourceTypesRegions);

    }
}

