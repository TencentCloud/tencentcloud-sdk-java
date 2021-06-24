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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL7RuleCertsRequest extends AbstractModel{

    /**
    * SSL证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * L7域名转发规则列表
    */
    @SerializedName("L7Rules")
    @Expose
    private InsL7Rules [] L7Rules;

    /**
     * Get SSL证书ID 
     * @return CertId SSL证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set SSL证书ID
     * @param CertId SSL证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get L7域名转发规则列表 
     * @return L7Rules L7域名转发规则列表
     */
    public InsL7Rules [] getL7Rules() {
        return this.L7Rules;
    }

    /**
     * Set L7域名转发规则列表
     * @param L7Rules L7域名转发规则列表
     */
    public void setL7Rules(InsL7Rules [] L7Rules) {
        this.L7Rules = L7Rules;
    }

    public CreateL7RuleCertsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateL7RuleCertsRequest(CreateL7RuleCertsRequest source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.L7Rules != null) {
            this.L7Rules = new InsL7Rules[source.L7Rules.length];
            for (int i = 0; i < source.L7Rules.length; i++) {
                this.L7Rules[i] = new InsL7Rules(source.L7Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArrayObj(map, prefix + "L7Rules.", this.L7Rules);

    }
}

