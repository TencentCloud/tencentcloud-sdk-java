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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncProxyOrganizationOperatorsRequest extends AbstractModel{

    /**
    * 操作类型，新增:"CREATE"，修改:"UPDATE"，离职:"RESIGN"
    */
    @SerializedName("OperatorType")
    @Expose
    private String OperatorType;

    /**
    * 应用信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 经办人信息列表
    */
    @SerializedName("ProxyOrganizationOperators")
    @Expose
    private ProxyOrganizationOperator [] ProxyOrganizationOperators;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 操作类型，新增:"CREATE"，修改:"UPDATE"，离职:"RESIGN" 
     * @return OperatorType 操作类型，新增:"CREATE"，修改:"UPDATE"，离职:"RESIGN"
     */
    public String getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set 操作类型，新增:"CREATE"，修改:"UPDATE"，离职:"RESIGN"
     * @param OperatorType 操作类型，新增:"CREATE"，修改:"UPDATE"，离职:"RESIGN"
     */
    public void setOperatorType(String OperatorType) {
        this.OperatorType = OperatorType;
    }

    /**
     * Get 应用信息 
     * @return Agent 应用信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用信息
     * @param Agent 应用信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 经办人信息列表 
     * @return ProxyOrganizationOperators 经办人信息列表
     */
    public ProxyOrganizationOperator [] getProxyOrganizationOperators() {
        return this.ProxyOrganizationOperators;
    }

    /**
     * Set 经办人信息列表
     * @param ProxyOrganizationOperators 经办人信息列表
     */
    public void setProxyOrganizationOperators(ProxyOrganizationOperator [] ProxyOrganizationOperators) {
        this.ProxyOrganizationOperators = ProxyOrganizationOperators;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public SyncProxyOrganizationOperatorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncProxyOrganizationOperatorsRequest(SyncProxyOrganizationOperatorsRequest source) {
        if (source.OperatorType != null) {
            this.OperatorType = new String(source.OperatorType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ProxyOrganizationOperators != null) {
            this.ProxyOrganizationOperators = new ProxyOrganizationOperator[source.ProxyOrganizationOperators.length];
            for (int i = 0; i < source.ProxyOrganizationOperators.length; i++) {
                this.ProxyOrganizationOperators[i] = new ProxyOrganizationOperator(source.ProxyOrganizationOperators[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "ProxyOrganizationOperators.", this.ProxyOrganizationOperators);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

