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

public class DescribeDownloadCertificateUrlRequest extends AbstractModel {

    /**
    * 证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 必填选项，下载的服务类型: nginx tomcat apache iis jks other root
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
     * Get 证书ID 
     * @return CertificateId 证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书ID
     * @param CertificateId 证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 必填选项，下载的服务类型: nginx tomcat apache iis jks other root 
     * @return ServiceType 必填选项，下载的服务类型: nginx tomcat apache iis jks other root
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 必填选项，下载的服务类型: nginx tomcat apache iis jks other root
     * @param ServiceType 必填选项，下载的服务类型: nginx tomcat apache iis jks other root
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public DescribeDownloadCertificateUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDownloadCertificateUrlRequest(DescribeDownloadCertificateUrlRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

