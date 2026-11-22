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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLLMIPRestrictionResult extends AbstractModel {

    /**
    * <p>是否开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>限制类型</p><p>枚举值：</p><ul><li>whiteList： 白名单</li><li>blackList： 黑名单</li></ul>
    */
    @SerializedName("RestrictionType")
    @Expose
    private String RestrictionType;

    /**
    * <p>IP 或 CIDR 列表，每项须为合法 IP/CIDR（支持 IPv4/IPv6）</p>
    */
    @SerializedName("AddressList")
    @Expose
    private String [] AddressList;

    /**
     * Get <p>是否开启</p> 
     * @return Enable <p>是否开启</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启</p>
     * @param Enable <p>是否开启</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>限制类型</p><p>枚举值：</p><ul><li>whiteList： 白名单</li><li>blackList： 黑名单</li></ul> 
     * @return RestrictionType <p>限制类型</p><p>枚举值：</p><ul><li>whiteList： 白名单</li><li>blackList： 黑名单</li></ul>
     */
    public String getRestrictionType() {
        return this.RestrictionType;
    }

    /**
     * Set <p>限制类型</p><p>枚举值：</p><ul><li>whiteList： 白名单</li><li>blackList： 黑名单</li></ul>
     * @param RestrictionType <p>限制类型</p><p>枚举值：</p><ul><li>whiteList： 白名单</li><li>blackList： 黑名单</li></ul>
     */
    public void setRestrictionType(String RestrictionType) {
        this.RestrictionType = RestrictionType;
    }

    /**
     * Get <p>IP 或 CIDR 列表，每项须为合法 IP/CIDR（支持 IPv4/IPv6）</p> 
     * @return AddressList <p>IP 或 CIDR 列表，每项须为合法 IP/CIDR（支持 IPv4/IPv6）</p>
     */
    public String [] getAddressList() {
        return this.AddressList;
    }

    /**
     * Set <p>IP 或 CIDR 列表，每项须为合法 IP/CIDR（支持 IPv4/IPv6）</p>
     * @param AddressList <p>IP 或 CIDR 列表，每项须为合法 IP/CIDR（支持 IPv4/IPv6）</p>
     */
    public void setAddressList(String [] AddressList) {
        this.AddressList = AddressList;
    }

    public AIGWLLMIPRestrictionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMIPRestrictionResult(AIGWLLMIPRestrictionResult source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.RestrictionType != null) {
            this.RestrictionType = new String(source.RestrictionType);
        }
        if (source.AddressList != null) {
            this.AddressList = new String[source.AddressList.length];
            for (int i = 0; i < source.AddressList.length; i++) {
                this.AddressList[i] = new String(source.AddressList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RestrictionType", this.RestrictionType);
        this.setParamArraySimple(map, prefix + "AddressList.", this.AddressList);

    }
}

