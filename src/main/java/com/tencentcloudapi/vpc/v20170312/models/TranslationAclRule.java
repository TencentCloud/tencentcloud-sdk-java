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

public class TranslationAclRule extends AbstractModel {

    /**
    * ACL协议类型，可选值:"ALL","TCP","UDP"
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 源端口。
    */
    @SerializedName("SourcePort")
    @Expose
    private String SourcePort;

    /**
    * 目的端口。
    */
    @SerializedName("DestinationPort")
    @Expose
    private String DestinationPort;

    /**
    * 目的地址。
    */
    @SerializedName("DestinationCidr")
    @Expose
    private String DestinationCidr;

    /**
    * 源地址。支持`ip`或`cidr`格式"xxx.xxx.xxx.000/xx"
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * ACL规则`ID`。
    */
    @SerializedName("AclRuleId")
    @Expose
    private Long AclRuleId;

    /**
    * 是否匹配。
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * ACL规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get ACL协议类型，可选值:"ALL","TCP","UDP" 
     * @return Protocol ACL协议类型，可选值:"ALL","TCP","UDP"
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set ACL协议类型，可选值:"ALL","TCP","UDP"
     * @param Protocol ACL协议类型，可选值:"ALL","TCP","UDP"
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 源端口。 
     * @return SourcePort 源端口。
     */
    public String getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set 源端口。
     * @param SourcePort 源端口。
     */
    public void setSourcePort(String SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get 目的端口。 
     * @return DestinationPort 目的端口。
     */
    public String getDestinationPort() {
        return this.DestinationPort;
    }

    /**
     * Set 目的端口。
     * @param DestinationPort 目的端口。
     */
    public void setDestinationPort(String DestinationPort) {
        this.DestinationPort = DestinationPort;
    }

    /**
     * Get 目的地址。 
     * @return DestinationCidr 目的地址。
     */
    public String getDestinationCidr() {
        return this.DestinationCidr;
    }

    /**
     * Set 目的地址。
     * @param DestinationCidr 目的地址。
     */
    public void setDestinationCidr(String DestinationCidr) {
        this.DestinationCidr = DestinationCidr;
    }

    /**
     * Get 源地址。支持`ip`或`cidr`格式"xxx.xxx.xxx.000/xx" 
     * @return SourceCidr 源地址。支持`ip`或`cidr`格式"xxx.xxx.xxx.000/xx"
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set 源地址。支持`ip`或`cidr`格式"xxx.xxx.xxx.000/xx"
     * @param SourceCidr 源地址。支持`ip`或`cidr`格式"xxx.xxx.xxx.000/xx"
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get ACL规则`ID`。 
     * @return AclRuleId ACL规则`ID`。
     */
    public Long getAclRuleId() {
        return this.AclRuleId;
    }

    /**
     * Set ACL规则`ID`。
     * @param AclRuleId ACL规则`ID`。
     */
    public void setAclRuleId(Long AclRuleId) {
        this.AclRuleId = AclRuleId;
    }

    /**
     * Get 是否匹配。 
     * @return Action 是否匹配。
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 是否匹配。
     * @param Action 是否匹配。
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get ACL规则描述 
     * @return Description ACL规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set ACL规则描述
     * @param Description ACL规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public TranslationAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationAclRule(TranslationAclRule source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new String(source.SourcePort);
        }
        if (source.DestinationPort != null) {
            this.DestinationPort = new String(source.DestinationPort);
        }
        if (source.DestinationCidr != null) {
            this.DestinationCidr = new String(source.DestinationCidr);
        }
        if (source.SourceCidr != null) {
            this.SourceCidr = new String(source.SourceCidr);
        }
        if (source.AclRuleId != null) {
            this.AclRuleId = new Long(source.AclRuleId);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SourcePort", this.SourcePort);
        this.setParamSimple(map, prefix + "DestinationPort", this.DestinationPort);
        this.setParamSimple(map, prefix + "DestinationCidr", this.DestinationCidr);
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "AclRuleId", this.AclRuleId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

