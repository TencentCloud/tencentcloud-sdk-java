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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCCLevelRequest  extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * CC防护等级，取值[default(正常), loose(宽松), strict(严格)];
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 可选字段，代表CC防护类型，取值[http（http协议的CC防护），https（https协议的CC防护）]；当不填时，默认为http协议的CC防护；当填写https时还需要填写RuleId字段；
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 可选字段，表示https协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）；
当Protocol=https时必须填写；
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * 获取大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取资源ID
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取CC防护等级，取值[default(正常), loose(宽松), strict(严格)];
     * @return Level CC防护等级，取值[default(正常), loose(宽松), strict(严格)];
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * 设置CC防护等级，取值[default(正常), loose(宽松), strict(严格)];
     * @param Level CC防护等级，取值[default(正常), loose(宽松), strict(严格)];
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * 获取可选字段，代表CC防护类型，取值[http（http协议的CC防护），https（https协议的CC防护）]；当不填时，默认为http协议的CC防护；当填写https时还需要填写RuleId字段；
     * @return Protocol 可选字段，代表CC防护类型，取值[http（http协议的CC防护），https（https协议的CC防护）]；当不填时，默认为http协议的CC防护；当填写https时还需要填写RuleId字段；
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置可选字段，代表CC防护类型，取值[http（http协议的CC防护），https（https协议的CC防护）]；当不填时，默认为http协议的CC防护；当填写https时还需要填写RuleId字段；
     * @param Protocol 可选字段，代表CC防护类型，取值[http（http协议的CC防护），https（https协议的CC防护）]；当不填时，默认为http协议的CC防护；当填写https时还需要填写RuleId字段；
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取可选字段，表示https协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）；
当Protocol=https时必须填写；
     * @return RuleId 可选字段，表示https协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）；
当Protocol=https时必须填写；
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置可选字段，表示https协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）；
当Protocol=https时必须填写；
     * @param RuleId 可选字段，表示https协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）；
当Protocol=https时必须填写；
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

