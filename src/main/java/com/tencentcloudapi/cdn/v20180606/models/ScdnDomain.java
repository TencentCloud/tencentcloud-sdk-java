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

public class ScdnDomain extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 当前状态，取值online | offline | process
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Waf 状态默认为‘/’，取值 close | intercept | observe
    */
    @SerializedName("Waf")
    @Expose
    private String Waf;

    /**
    * Acl 状态默认为‘/’，取值 close | open
    */
    @SerializedName("Acl")
    @Expose
    private String Acl;

    /**
    * CC 状态默认为‘/’，取值 close | open
    */
    @SerializedName("CC")
    @Expose
    private String CC;

    /**
    * Ddos 状态默认为‘/’，取值 close | open
    */
    @SerializedName("Ddos")
    @Expose
    private String Ddos;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Acl 规则数
    */
    @SerializedName("AclRuleNumbers")
    @Expose
    private Long AclRuleNumbers;

    /**
    * Bot 状态默认为‘/’，取值 close | open
    */
    @SerializedName("Bot")
    @Expose
    private String Bot;

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
     * Get 当前状态，取值online | offline | process 
     * @return Status 当前状态，取值online | offline | process
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态，取值online | offline | process
     * @param Status 当前状态，取值online | offline | process
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Waf 状态默认为‘/’，取值 close | intercept | observe 
     * @return Waf Waf 状态默认为‘/’，取值 close | intercept | observe
     */
    public String getWaf() {
        return this.Waf;
    }

    /**
     * Set Waf 状态默认为‘/’，取值 close | intercept | observe
     * @param Waf Waf 状态默认为‘/’，取值 close | intercept | observe
     */
    public void setWaf(String Waf) {
        this.Waf = Waf;
    }

    /**
     * Get Acl 状态默认为‘/’，取值 close | open 
     * @return Acl Acl 状态默认为‘/’，取值 close | open
     */
    public String getAcl() {
        return this.Acl;
    }

    /**
     * Set Acl 状态默认为‘/’，取值 close | open
     * @param Acl Acl 状态默认为‘/’，取值 close | open
     */
    public void setAcl(String Acl) {
        this.Acl = Acl;
    }

    /**
     * Get CC 状态默认为‘/’，取值 close | open 
     * @return CC CC 状态默认为‘/’，取值 close | open
     */
    public String getCC() {
        return this.CC;
    }

    /**
     * Set CC 状态默认为‘/’，取值 close | open
     * @param CC CC 状态默认为‘/’，取值 close | open
     */
    public void setCC(String CC) {
        this.CC = CC;
    }

    /**
     * Get Ddos 状态默认为‘/’，取值 close | open 
     * @return Ddos Ddos 状态默认为‘/’，取值 close | open
     */
    public String getDdos() {
        return this.Ddos;
    }

    /**
     * Set Ddos 状态默认为‘/’，取值 close | open
     * @param Ddos Ddos 状态默认为‘/’，取值 close | open
     */
    public void setDdos(String Ddos) {
        this.Ddos = Ddos;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Acl 规则数 
     * @return AclRuleNumbers Acl 规则数
     */
    public Long getAclRuleNumbers() {
        return this.AclRuleNumbers;
    }

    /**
     * Set Acl 规则数
     * @param AclRuleNumbers Acl 规则数
     */
    public void setAclRuleNumbers(Long AclRuleNumbers) {
        this.AclRuleNumbers = AclRuleNumbers;
    }

    /**
     * Get Bot 状态默认为‘/’，取值 close | open 
     * @return Bot Bot 状态默认为‘/’，取值 close | open
     */
    public String getBot() {
        return this.Bot;
    }

    /**
     * Set Bot 状态默认为‘/’，取值 close | open
     * @param Bot Bot 状态默认为‘/’，取值 close | open
     */
    public void setBot(String Bot) {
        this.Bot = Bot;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Waf", this.Waf);
        this.setParamSimple(map, prefix + "Acl", this.Acl);
        this.setParamSimple(map, prefix + "CC", this.CC);
        this.setParamSimple(map, prefix + "Ddos", this.Ddos);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AclRuleNumbers", this.AclRuleNumbers);
        this.setParamSimple(map, prefix + "Bot", this.Bot);

    }
}

