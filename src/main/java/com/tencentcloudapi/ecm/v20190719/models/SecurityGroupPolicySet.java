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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicySet extends AbstractModel {

    /**
    * 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 出站规则。其中出站规则和入站规则必须选一个。
    */
    @SerializedName("Egress")
    @Expose
    private SecurityGroupPolicy [] Egress;

    /**
    * 入站规则。其中出站规则和入站规则必须选一个。
    */
    @SerializedName("Ingress")
    @Expose
    private SecurityGroupPolicy [] Ingress;

    /**
     * Get 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。 
     * @return Version 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
     * @param Version 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 出站规则。其中出站规则和入站规则必须选一个。 
     * @return Egress 出站规则。其中出站规则和入站规则必须选一个。
     */
    public SecurityGroupPolicy [] getEgress() {
        return this.Egress;
    }

    /**
     * Set 出站规则。其中出站规则和入站规则必须选一个。
     * @param Egress 出站规则。其中出站规则和入站规则必须选一个。
     */
    public void setEgress(SecurityGroupPolicy [] Egress) {
        this.Egress = Egress;
    }

    /**
     * Get 入站规则。其中出站规则和入站规则必须选一个。 
     * @return Ingress 入站规则。其中出站规则和入站规则必须选一个。
     */
    public SecurityGroupPolicy [] getIngress() {
        return this.Ingress;
    }

    /**
     * Set 入站规则。其中出站规则和入站规则必须选一个。
     * @param Ingress 入站规则。其中出站规则和入站规则必须选一个。
     */
    public void setIngress(SecurityGroupPolicy [] Ingress) {
        this.Ingress = Ingress;
    }

    public SecurityGroupPolicySet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicySet(SecurityGroupPolicySet source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Egress != null) {
            this.Egress = new SecurityGroupPolicy[source.Egress.length];
            for (int i = 0; i < source.Egress.length; i++) {
                this.Egress[i] = new SecurityGroupPolicy(source.Egress[i]);
            }
        }
        if (source.Ingress != null) {
            this.Ingress = new SecurityGroupPolicy[source.Ingress.length];
            for (int i = 0; i < source.Ingress.length; i++) {
                this.Ingress[i] = new SecurityGroupPolicy(source.Ingress[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Egress.", this.Egress);
        this.setParamArrayObj(map, prefix + "Ingress.", this.Ingress);

    }
}

