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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertIdRelatedWithLoadBalancers extends AbstractModel{

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 与证书关联的负载均衡实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancers")
    @Expose
    private LoadBalancer [] LoadBalancers;

    /**
     * Get 证书ID 
     * @return CertId 证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
     * @param CertId 证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 与证书关联的负载均衡实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancers 与证书关联的负载均衡实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadBalancer [] getLoadBalancers() {
        return this.LoadBalancers;
    }

    /**
     * Set 与证书关联的负载均衡实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancers 与证书关联的负载均衡实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancers(LoadBalancer [] LoadBalancers) {
        this.LoadBalancers = LoadBalancers;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArrayObj(map, prefix + "LoadBalancers.", this.LoadBalancers);

    }
}

