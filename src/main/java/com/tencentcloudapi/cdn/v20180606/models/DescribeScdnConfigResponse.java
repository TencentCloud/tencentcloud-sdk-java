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

public class DescribeScdnConfigResponse extends AbstractModel{

    /**
    * 自定义防护策略配置
    */
    @SerializedName("Acl")
    @Expose
    private ScdnAclConfig Acl;

    /**
    * Web 攻击防护（WAF）配置
    */
    @SerializedName("Waf")
    @Expose
    private ScdnWafConfig Waf;

    /**
    * CC 防护配置
    */
    @SerializedName("CC")
    @Expose
    private ScdnConfig CC;

    /**
    * DDOS 防护配置
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
    * 当前状态，取值online | offline
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get CC 防护配置 
     * @return CC CC 防护配置
     */
    public ScdnConfig getCC() {
        return this.CC;
    }

    /**
     * Set CC 防护配置
     * @param CC CC 防护配置
     */
    public void setCC(ScdnConfig CC) {
        this.CC = CC;
    }

    /**
     * Get DDOS 防护配置 
     * @return Ddos DDOS 防护配置
     */
    public ScdnDdosConfig getDdos() {
        return this.Ddos;
    }

    /**
     * Set DDOS 防护配置
     * @param Ddos DDOS 防护配置
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

    /**
     * Get 当前状态，取值online | offline
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前状态，取值online | offline
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态，取值online | offline
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前状态，取值online | offline
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScdnConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScdnConfigResponse(DescribeScdnConfigResponse source) {
        if (source.Acl != null) {
            this.Acl = new ScdnAclConfig(source.Acl);
        }
        if (source.Waf != null) {
            this.Waf = new ScdnWafConfig(source.Waf);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Acl.", this.Acl);
        this.setParamObj(map, prefix + "Waf.", this.Waf);
        this.setParamObj(map, prefix + "CC.", this.CC);
        this.setParamObj(map, prefix + "Ddos.", this.Ddos);
        this.setParamObj(map, prefix + "Bot.", this.Bot);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

