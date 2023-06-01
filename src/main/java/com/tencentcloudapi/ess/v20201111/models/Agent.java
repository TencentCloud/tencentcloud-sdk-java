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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Agent extends AbstractModel{

    /**
    * 代理机构的应用编号,32位字符串，一般不用传
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 被代理机构的应用号，一般不用传
    */
    @SerializedName("ProxyAppId")
    @Expose
    private String ProxyAppId;

    /**
    * 被代理机构在电子签平台的机构编号，集团代理下场景必传
    */
    @SerializedName("ProxyOrganizationId")
    @Expose
    private String ProxyOrganizationId;

    /**
    * 被代理机构的经办人，一般不用传
    */
    @SerializedName("ProxyOperator")
    @Expose
    private String ProxyOperator;

    /**
     * Get 代理机构的应用编号,32位字符串，一般不用传 
     * @return AppId 代理机构的应用编号,32位字符串，一般不用传
     * @deprecated
     */
    @Deprecated
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 代理机构的应用编号,32位字符串，一般不用传
     * @param AppId 代理机构的应用编号,32位字符串，一般不用传
     * @deprecated
     */
    @Deprecated
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 被代理机构的应用号，一般不用传 
     * @return ProxyAppId 被代理机构的应用号，一般不用传
     * @deprecated
     */
    @Deprecated
    public String getProxyAppId() {
        return this.ProxyAppId;
    }

    /**
     * Set 被代理机构的应用号，一般不用传
     * @param ProxyAppId 被代理机构的应用号，一般不用传
     * @deprecated
     */
    @Deprecated
    public void setProxyAppId(String ProxyAppId) {
        this.ProxyAppId = ProxyAppId;
    }

    /**
     * Get 被代理机构在电子签平台的机构编号，集团代理下场景必传 
     * @return ProxyOrganizationId 被代理机构在电子签平台的机构编号，集团代理下场景必传
     */
    public String getProxyOrganizationId() {
        return this.ProxyOrganizationId;
    }

    /**
     * Set 被代理机构在电子签平台的机构编号，集团代理下场景必传
     * @param ProxyOrganizationId 被代理机构在电子签平台的机构编号，集团代理下场景必传
     */
    public void setProxyOrganizationId(String ProxyOrganizationId) {
        this.ProxyOrganizationId = ProxyOrganizationId;
    }

    /**
     * Get 被代理机构的经办人，一般不用传 
     * @return ProxyOperator 被代理机构的经办人，一般不用传
     * @deprecated
     */
    @Deprecated
    public String getProxyOperator() {
        return this.ProxyOperator;
    }

    /**
     * Set 被代理机构的经办人，一般不用传
     * @param ProxyOperator 被代理机构的经办人，一般不用传
     * @deprecated
     */
    @Deprecated
    public void setProxyOperator(String ProxyOperator) {
        this.ProxyOperator = ProxyOperator;
    }

    public Agent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Agent(Agent source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProxyAppId != null) {
            this.ProxyAppId = new String(source.ProxyAppId);
        }
        if (source.ProxyOrganizationId != null) {
            this.ProxyOrganizationId = new String(source.ProxyOrganizationId);
        }
        if (source.ProxyOperator != null) {
            this.ProxyOperator = new String(source.ProxyOperator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProxyAppId", this.ProxyAppId);
        this.setParamSimple(map, prefix + "ProxyOrganizationId", this.ProxyOrganizationId);
        this.setParamSimple(map, prefix + "ProxyOperator", this.ProxyOperator);

    }
}

