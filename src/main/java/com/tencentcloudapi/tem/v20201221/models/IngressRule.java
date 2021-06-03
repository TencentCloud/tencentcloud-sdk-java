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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressRule extends AbstractModel{

    /**
    * ingress rule value
    */
    @SerializedName("Http")
    @Expose
    private IngressRuleValue Http;

    /**
    * host 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 协议，选项为 http， https，默认为 http
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get ingress rule value 
     * @return Http ingress rule value
     */
    public IngressRuleValue getHttp() {
        return this.Http;
    }

    /**
     * Set ingress rule value
     * @param Http ingress rule value
     */
    public void setHttp(IngressRuleValue Http) {
        this.Http = Http;
    }

    /**
     * Get host 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host host 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set host 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host host 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 协议，选项为 http， https，默认为 http 
     * @return Protocol 协议，选项为 http， https，默认为 http
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，选项为 http， https，默认为 http
     * @param Protocol 协议，选项为 http， https，默认为 http
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public IngressRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressRule(IngressRule source) {
        if (source.Http != null) {
            this.Http = new IngressRuleValue(source.Http);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Http.", this.Http);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

