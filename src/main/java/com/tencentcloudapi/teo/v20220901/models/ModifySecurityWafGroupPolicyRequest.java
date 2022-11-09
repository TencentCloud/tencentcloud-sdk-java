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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityWafGroupPolicyRequest extends AbstractModel{

    /**
    * 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 子域名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 总开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>不填默认为上次的配置。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 规则等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>不填默认为上次的配置。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 处置方式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>不填默认为上次的配置。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 托管规则。不填默认为上次的配置。
    */
    @SerializedName("WafRules")
    @Expose
    private WafRule WafRules;

    /**
    * AI引擎模式。不填默认为上次的配置。
    */
    @SerializedName("AiRule")
    @Expose
    private AiRule AiRule;

    /**
    * 托管规则等级组。不填默认为上次的配置。
    */
    @SerializedName("WafGroups")
    @Expose
    private WafGroup [] WafGroups;

    /**
    * 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。 
     * @return ZoneId 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     * @param ZoneId 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子域名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。 
     * @return Entity 子域名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     * @param Entity 子域名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 总开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>不填默认为上次的配置。 
     * @return Switch 总开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>不填默认为上次的配置。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 总开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>不填默认为上次的配置。
     * @param Switch 总开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>不填默认为上次的配置。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 规则等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>不填默认为上次的配置。 
     * @return Level 规则等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>不填默认为上次的配置。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 规则等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>不填默认为上次的配置。
     * @param Level 规则等级，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>不填默认为上次的配置。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 处置方式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>不填默认为上次的配置。 
     * @return Mode 处置方式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>不填默认为上次的配置。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 处置方式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>不填默认为上次的配置。
     * @param Mode 处置方式，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>不填默认为上次的配置。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 托管规则。不填默认为上次的配置。 
     * @return WafRules 托管规则。不填默认为上次的配置。
     */
    public WafRule getWafRules() {
        return this.WafRules;
    }

    /**
     * Set 托管规则。不填默认为上次的配置。
     * @param WafRules 托管规则。不填默认为上次的配置。
     */
    public void setWafRules(WafRule WafRules) {
        this.WafRules = WafRules;
    }

    /**
     * Get AI引擎模式。不填默认为上次的配置。 
     * @return AiRule AI引擎模式。不填默认为上次的配置。
     */
    public AiRule getAiRule() {
        return this.AiRule;
    }

    /**
     * Set AI引擎模式。不填默认为上次的配置。
     * @param AiRule AI引擎模式。不填默认为上次的配置。
     */
    public void setAiRule(AiRule AiRule) {
        this.AiRule = AiRule;
    }

    /**
     * Get 托管规则等级组。不填默认为上次的配置。 
     * @return WafGroups 托管规则等级组。不填默认为上次的配置。
     */
    public WafGroup [] getWafGroups() {
        return this.WafGroups;
    }

    /**
     * Set 托管规则等级组。不填默认为上次的配置。
     * @param WafGroups 托管规则等级组。不填默认为上次的配置。
     */
    public void setWafGroups(WafGroup [] WafGroups) {
        this.WafGroups = WafGroups;
    }

    /**
     * Get 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。 
     * @return TemplateId 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     * @param TemplateId 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ModifySecurityWafGroupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityWafGroupPolicyRequest(ModifySecurityWafGroupPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.WafRules != null) {
            this.WafRules = new WafRule(source.WafRules);
        }
        if (source.AiRule != null) {
            this.AiRule = new AiRule(source.AiRule);
        }
        if (source.WafGroups != null) {
            this.WafGroups = new WafGroup[source.WafGroups.length];
            for (int i = 0; i < source.WafGroups.length; i++) {
                this.WafGroups[i] = new WafGroup(source.WafGroups[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "WafRules.", this.WafRules);
        this.setParamObj(map, prefix + "AiRule.", this.AiRule);
        this.setParamArrayObj(map, prefix + "WafGroups.", this.WafGroups);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

