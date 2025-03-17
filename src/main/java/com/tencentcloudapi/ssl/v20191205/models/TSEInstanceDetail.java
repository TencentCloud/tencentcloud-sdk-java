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

public class TSEInstanceDetail extends AbstractModel {

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关名称
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 网关证书列表
    */
    @SerializedName("CertificateList")
    @Expose
    private GatewayCertificate [] CertificateList;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关名称 
     * @return GatewayName 网关名称
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 网关名称
     * @param GatewayName 网关名称
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 网关证书列表 
     * @return CertificateList 网关证书列表
     */
    public GatewayCertificate [] getCertificateList() {
        return this.CertificateList;
    }

    /**
     * Set 网关证书列表
     * @param CertificateList 网关证书列表
     */
    public void setCertificateList(GatewayCertificate [] CertificateList) {
        this.CertificateList = CertificateList;
    }

    public TSEInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TSEInstanceDetail(TSEInstanceDetail source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.CertificateList != null) {
            this.CertificateList = new GatewayCertificate[source.CertificateList.length];
            for (int i = 0; i < source.CertificateList.length; i++) {
                this.CertificateList[i] = new GatewayCertificate(source.CertificateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamArrayObj(map, prefix + "CertificateList.", this.CertificateList);

    }
}

