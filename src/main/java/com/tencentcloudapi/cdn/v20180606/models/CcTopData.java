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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcTopData extends AbstractModel{

    /**
    * 客户端Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 访问URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 客户端UserAgent
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 客户端Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 客户端Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 客户端Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 客户端Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 访问URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 访问URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 访问URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 访问URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 客户端UserAgent
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAgent 客户端UserAgent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 客户端UserAgent
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAgent 客户端UserAgent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public CcTopData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcTopData(CcTopData source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

