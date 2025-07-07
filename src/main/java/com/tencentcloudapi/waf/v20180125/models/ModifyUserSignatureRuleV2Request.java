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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserSignatureRuleV2Request extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 主类id
    */
    @SerializedName("MainClassID")
    @Expose
    private String MainClassID;

    /**
    * 主类开关0=关闭，1=开启，2=只告警
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 下发修改的规则列表
    */
    @SerializedName("RuleID")
    @Expose
    private ReqUserRule [] RuleID;

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
     * Get 主类id 
     * @return MainClassID 主类id
     */
    public String getMainClassID() {
        return this.MainClassID;
    }

    /**
     * Set 主类id
     * @param MainClassID 主类id
     */
    public void setMainClassID(String MainClassID) {
        this.MainClassID = MainClassID;
    }

    /**
     * Get 主类开关0=关闭，1=开启，2=只告警 
     * @return Status 主类开关0=关闭，1=开启，2=只告警
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 主类开关0=关闭，1=开启，2=只告警
     * @param Status 主类开关0=关闭，1=开启，2=只告警
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 下发修改的规则列表 
     * @return RuleID 下发修改的规则列表
     */
    public ReqUserRule [] getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 下发修改的规则列表
     * @param RuleID 下发修改的规则列表
     */
    public void setRuleID(ReqUserRule [] RuleID) {
        this.RuleID = RuleID;
    }

    public ModifyUserSignatureRuleV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserSignatureRuleV2Request(ModifyUserSignatureRuleV2Request source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.MainClassID != null) {
            this.MainClassID = new String(source.MainClassID);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleID != null) {
            this.RuleID = new ReqUserRule[source.RuleID.length];
            for (int i = 0; i < source.RuleID.length; i++) {
                this.RuleID[i] = new ReqUserRule(source.RuleID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "MainClassID", this.MainClassID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "RuleID.", this.RuleID);

    }
}

