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

public class DescribeL7RulesBySSLCertIdRequest extends AbstractModel{

    /**
    * 域名状态，可取bindable, binded, opened, closed, all，all表示全部状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 证书ID列表
    */
    @SerializedName("CertIds")
    @Expose
    private String [] CertIds;

    /**
     * Get 域名状态，可取bindable, binded, opened, closed, all，all表示全部状态 
     * @return Status 域名状态，可取bindable, binded, opened, closed, all，all表示全部状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态，可取bindable, binded, opened, closed, all，all表示全部状态
     * @param Status 域名状态，可取bindable, binded, opened, closed, all，all表示全部状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 证书ID列表 
     * @return CertIds 证书ID列表
     */
    public String [] getCertIds() {
        return this.CertIds;
    }

    /**
     * Set 证书ID列表
     * @param CertIds 证书ID列表
     */
    public void setCertIds(String [] CertIds) {
        this.CertIds = CertIds;
    }

    public DescribeL7RulesBySSLCertIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL7RulesBySSLCertIdRequest(DescribeL7RulesBySSLCertIdRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CertIds != null) {
            this.CertIds = new String[source.CertIds.length];
            for (int i = 0; i < source.CertIds.length; i++) {
                this.CertIds[i] = new String(source.CertIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "CertIds.", this.CertIds);

    }
}

