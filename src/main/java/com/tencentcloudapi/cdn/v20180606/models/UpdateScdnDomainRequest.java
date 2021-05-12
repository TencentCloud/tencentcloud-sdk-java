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

public class UpdateScdnDomainRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Web 攻击防护（WAF）配置
    */
    @SerializedName("Waf")
    @Expose
    private ScdnWafConfig Waf;

    /**
    * 自定义防护策略配置
    */
    @SerializedName("Acl")
    @Expose
    private ScdnAclConfig Acl;

    /**
    * CC 防护配置，目前 CC 防护默认开启
    */
    @SerializedName("CC")
    @Expose
    private ScdnConfig CC;

    /**
    * DDOS 防护配置，目前 DDoS 防护默认开启
    */
    @SerializedName("Ddos")
    @Expose
    private ScdnDdosConfig Ddos;

    /**
    * BOT 防护配置
    */
    @SerializedName("Bot")
    @Expose
    private ScdnBotConfig Bot;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Web 攻击防护（WAF）配置 
     * @return Waf Web 攻击防护（WAF）配置
     */
    public ScdnWafConfig getWaf() {
        return this.Waf;
    }

    /**
     * Set Web 攻击防护（WAF）配置
     * @param Waf Web 攻击防护（WAF）配置
     */
    public void setWaf(ScdnWafConfig Waf) {
        this.Waf = Waf;
    }

    /**
     * Get 自定义防护策略配置 
     * @return Acl 自定义防护策略配置
     */
    public ScdnAclConfig getAcl() {
        return this.Acl;
    }

    /**
     * Set 自定义防护策略配置
     * @param Acl 自定义防护策略配置
     */
    public void setAcl(ScdnAclConfig Acl) {
        this.Acl = Acl;
    }

    /**
     * Get CC 防护配置，目前 CC 防护默认开启 
     * @return CC CC 防护配置，目前 CC 防护默认开启
     */
    public ScdnConfig getCC() {
        return this.CC;
    }

    /**
     * Set CC 防护配置，目前 CC 防护默认开启
     * @param CC CC 防护配置，目前 CC 防护默认开启
     */
    public void setCC(ScdnConfig CC) {
        this.CC = CC;
    }

    /**
     * Get DDOS 防护配置，目前 DDoS 防护默认开启 
     * @return Ddos DDOS 防护配置，目前 DDoS 防护默认开启
     */
    public ScdnDdosConfig getDdos() {
        return this.Ddos;
    }

    /**
     * Set DDOS 防护配置，目前 DDoS 防护默认开启
     * @param Ddos DDOS 防护配置，目前 DDoS 防护默认开启
     */
    public void setDdos(ScdnDdosConfig Ddos) {
        this.Ddos = Ddos;
    }

    /**
     * Get BOT 防护配置 
     * @return Bot BOT 防护配置
     */
    public ScdnBotConfig getBot() {
        return this.Bot;
    }

    /**
     * Set BOT 防护配置
     * @param Bot BOT 防护配置
     */
    public void setBot(ScdnBotConfig Bot) {
        this.Bot = Bot;
    }

    public UpdateScdnDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateScdnDomainRequest(UpdateScdnDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Waf != null) {
            this.Waf = new ScdnWafConfig(source.Waf);
        }
        if (source.Acl != null) {
            this.Acl = new ScdnAclConfig(source.Acl);
        }
        if (source.CC != null) {
            this.CC = new ScdnConfig(source.CC);
        }
        if (source.Ddos != null) {
            this.Ddos = new ScdnDdosConfig(source.Ddos);
        }
        if (source.Bot != null) {
            this.Bot = new ScdnBotConfig(source.Bot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "Waf.", this.Waf);
        this.setParamObj(map, prefix + "Acl.", this.Acl);
        this.setParamObj(map, prefix + "CC.", this.CC);
        this.setParamObj(map, prefix + "Ddos.", this.Ddos);
        this.setParamObj(map, prefix + "Bot.", this.Bot);

    }
}

