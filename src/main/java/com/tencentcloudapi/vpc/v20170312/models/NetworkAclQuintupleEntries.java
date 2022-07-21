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

public class NetworkAclQuintupleEntries extends AbstractModel{

    /**
    * 网络ACL五元组入站规则。
    */
    @SerializedName("Ingress")
    @Expose
    private NetworkAclQuintupleEntry [] Ingress;

    /**
    * 网络ACL五元组出站规则
    */
    @SerializedName("Egress")
    @Expose
    private NetworkAclQuintupleEntry [] Egress;

    /**
     * Get 网络ACL五元组入站规则。 
     * @return Ingress 网络ACL五元组入站规则。
     */
    public NetworkAclQuintupleEntry [] getIngress() {
        return this.Ingress;
    }

    /**
     * Set 网络ACL五元组入站规则。
     * @param Ingress 网络ACL五元组入站规则。
     */
    public void setIngress(NetworkAclQuintupleEntry [] Ingress) {
        this.Ingress = Ingress;
    }

    /**
     * Get 网络ACL五元组出站规则 
     * @return Egress 网络ACL五元组出站规则
     */
    public NetworkAclQuintupleEntry [] getEgress() {
        return this.Egress;
    }

    /**
     * Set 网络ACL五元组出站规则
     * @param Egress 网络ACL五元组出站规则
     */
    public void setEgress(NetworkAclQuintupleEntry [] Egress) {
        this.Egress = Egress;
    }

    public NetworkAclQuintupleEntries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAclQuintupleEntries(NetworkAclQuintupleEntries source) {
        if (source.Ingress != null) {
            this.Ingress = new NetworkAclQuintupleEntry[source.Ingress.length];
            for (int i = 0; i < source.Ingress.length; i++) {
                this.Ingress[i] = new NetworkAclQuintupleEntry(source.Ingress[i]);
            }
        }
        if (source.Egress != null) {
            this.Egress = new NetworkAclQuintupleEntry[source.Egress.length];
            for (int i = 0; i < source.Egress.length; i++) {
                this.Egress[i] = new NetworkAclQuintupleEntry(source.Egress[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Ingress.", this.Ingress);
        this.setParamArrayObj(map, prefix + "Egress.", this.Egress);

    }
}

