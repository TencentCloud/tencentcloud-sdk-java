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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientBaseElem extends AbstractModel{

    /**
    * 代客关联的代理商UIN
    */
    @SerializedName("AgentUin")
    @Expose
    private String AgentUin;

    /**
    * 代客UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 代客关联类型 0:代理 1:转售
    */
    @SerializedName("ClientRelateType")
    @Expose
    private Long ClientRelateType;

    /**
    * 代理商合作模式 0:代理 1:转售
    */
    @SerializedName("AgentCooperationMode")
    @Expose
    private Long AgentCooperationMode;

    /**
    * 代理商国家编码 China:中国  其他:海外，如US等
    */
    @SerializedName("AgentCountry")
    @Expose
    private String AgentCountry;

    /**
     * Get 代客关联的代理商UIN 
     * @return AgentUin 代客关联的代理商UIN
     */
    public String getAgentUin() {
        return this.AgentUin;
    }

    /**
     * Set 代客关联的代理商UIN
     * @param AgentUin 代客关联的代理商UIN
     */
    public void setAgentUin(String AgentUin) {
        this.AgentUin = AgentUin;
    }

    /**
     * Get 代客UIN 
     * @return ClientUin 代客UIN
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 代客UIN
     * @param ClientUin 代客UIN
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 代客关联类型 0:代理 1:转售 
     * @return ClientRelateType 代客关联类型 0:代理 1:转售
     */
    public Long getClientRelateType() {
        return this.ClientRelateType;
    }

    /**
     * Set 代客关联类型 0:代理 1:转售
     * @param ClientRelateType 代客关联类型 0:代理 1:转售
     */
    public void setClientRelateType(Long ClientRelateType) {
        this.ClientRelateType = ClientRelateType;
    }

    /**
     * Get 代理商合作模式 0:代理 1:转售 
     * @return AgentCooperationMode 代理商合作模式 0:代理 1:转售
     */
    public Long getAgentCooperationMode() {
        return this.AgentCooperationMode;
    }

    /**
     * Set 代理商合作模式 0:代理 1:转售
     * @param AgentCooperationMode 代理商合作模式 0:代理 1:转售
     */
    public void setAgentCooperationMode(Long AgentCooperationMode) {
        this.AgentCooperationMode = AgentCooperationMode;
    }

    /**
     * Get 代理商国家编码 China:中国  其他:海外，如US等 
     * @return AgentCountry 代理商国家编码 China:中国  其他:海外，如US等
     */
    public String getAgentCountry() {
        return this.AgentCountry;
    }

    /**
     * Set 代理商国家编码 China:中国  其他:海外，如US等
     * @param AgentCountry 代理商国家编码 China:中国  其他:海外，如US等
     */
    public void setAgentCountry(String AgentCountry) {
        this.AgentCountry = AgentCountry;
    }

    public ClientBaseElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientBaseElem(ClientBaseElem source) {
        if (source.AgentUin != null) {
            this.AgentUin = new String(source.AgentUin);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new String(source.ClientUin);
        }
        if (source.ClientRelateType != null) {
            this.ClientRelateType = new Long(source.ClientRelateType);
        }
        if (source.AgentCooperationMode != null) {
            this.AgentCooperationMode = new Long(source.AgentCooperationMode);
        }
        if (source.AgentCountry != null) {
            this.AgentCountry = new String(source.AgentCountry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentUin", this.AgentUin);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ClientRelateType", this.ClientRelateType);
        this.setParamSimple(map, prefix + "AgentCooperationMode", this.AgentCooperationMode);
        this.setParamSimple(map, prefix + "AgentCountry", this.AgentCountry);

    }
}

