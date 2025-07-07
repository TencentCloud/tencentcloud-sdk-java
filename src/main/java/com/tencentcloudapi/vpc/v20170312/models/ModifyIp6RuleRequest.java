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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIp6RuleRequest extends AbstractModel {

    /**
    * IPV6转换实例唯一ID，形如ip6-xxxxxxxx
    */
    @SerializedName("Ip6TranslatorId")
    @Expose
    private String Ip6TranslatorId;

    /**
    * IPV6转换规则唯一ID，形如rule6-xxxxxxxx
    */
    @SerializedName("Ip6RuleId")
    @Expose
    private String Ip6RuleId;

    /**
    * IPV6转换规则修改后的名称
    */
    @SerializedName("Ip6RuleName")
    @Expose
    private String Ip6RuleName;

    /**
    * IPV6转换规则修改后的IPV4地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * IPV6转换规则修改后的IPV4端口号
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get IPV6转换实例唯一ID，形如ip6-xxxxxxxx 
     * @return Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public String getIp6TranslatorId() {
        return this.Ip6TranslatorId;
    }

    /**
     * Set IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     * @param Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public void setIp6TranslatorId(String Ip6TranslatorId) {
        this.Ip6TranslatorId = Ip6TranslatorId;
    }

    /**
     * Get IPV6转换规则唯一ID，形如rule6-xxxxxxxx 
     * @return Ip6RuleId IPV6转换规则唯一ID，形如rule6-xxxxxxxx
     */
    public String getIp6RuleId() {
        return this.Ip6RuleId;
    }

    /**
     * Set IPV6转换规则唯一ID，形如rule6-xxxxxxxx
     * @param Ip6RuleId IPV6转换规则唯一ID，形如rule6-xxxxxxxx
     */
    public void setIp6RuleId(String Ip6RuleId) {
        this.Ip6RuleId = Ip6RuleId;
    }

    /**
     * Get IPV6转换规则修改后的名称 
     * @return Ip6RuleName IPV6转换规则修改后的名称
     */
    public String getIp6RuleName() {
        return this.Ip6RuleName;
    }

    /**
     * Set IPV6转换规则修改后的名称
     * @param Ip6RuleName IPV6转换规则修改后的名称
     */
    public void setIp6RuleName(String Ip6RuleName) {
        this.Ip6RuleName = Ip6RuleName;
    }

    /**
     * Get IPV6转换规则修改后的IPV4地址 
     * @return Vip IPV6转换规则修改后的IPV4地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IPV6转换规则修改后的IPV4地址
     * @param Vip IPV6转换规则修改后的IPV4地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get IPV6转换规则修改后的IPV4端口号 
     * @return Vport IPV6转换规则修改后的IPV4端口号
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set IPV6转换规则修改后的IPV4端口号
     * @param Vport IPV6转换规则修改后的IPV4端口号
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public ModifyIp6RuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIp6RuleRequest(ModifyIp6RuleRequest source) {
        if (source.Ip6TranslatorId != null) {
            this.Ip6TranslatorId = new String(source.Ip6TranslatorId);
        }
        if (source.Ip6RuleId != null) {
            this.Ip6RuleId = new String(source.Ip6RuleId);
        }
        if (source.Ip6RuleName != null) {
            this.Ip6RuleName = new String(source.Ip6RuleName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6TranslatorId", this.Ip6TranslatorId);
        this.setParamSimple(map, prefix + "Ip6RuleId", this.Ip6RuleId);
        this.setParamSimple(map, prefix + "Ip6RuleName", this.Ip6RuleName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

