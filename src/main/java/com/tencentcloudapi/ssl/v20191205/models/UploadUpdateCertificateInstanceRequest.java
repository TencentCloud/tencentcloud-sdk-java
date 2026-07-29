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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateCertificateInstanceRequest extends AbstractModel {

    /**
    * <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * <p>需要部署的资源类型，参数值可选（小写）：clb</p>
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * <p>公钥证书</p>
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * <p>私钥证书</p>
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb</p>
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
    * <p>证书ID</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
     * Get <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p> 
     * @return OldCertificateId <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
     * @param OldCertificateId <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get <p>需要部署的资源类型，参数值可选（小写）：clb</p> 
     * @return ResourceTypes <p>需要部署的资源类型，参数值可选（小写）：clb</p>
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set <p>需要部署的资源类型，参数值可选（小写）：clb</p>
     * @param ResourceTypes <p>需要部署的资源类型，参数值可选（小写）：clb</p>
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get <p>公钥证书</p> 
     * @return CertificatePublicKey <p>公钥证书</p>
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set <p>公钥证书</p>
     * @param CertificatePublicKey <p>公钥证书</p>
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get <p>私钥证书</p> 
     * @return CertificatePrivateKey <p>私钥证书</p>
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set <p>私钥证书</p>
     * @param CertificatePrivateKey <p>私钥证书</p>
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb</p> 
     * @return ResourceTypesRegions <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb</p>
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb</p>
     * @param ResourceTypesRegions <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb</p>
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    /**
     * Get <p>证书ID</p> 
     * @return CertificateId <p>证书ID</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>证书ID</p>
     * @param CertificateId <p>证书ID</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
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
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
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
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);

    }
}

