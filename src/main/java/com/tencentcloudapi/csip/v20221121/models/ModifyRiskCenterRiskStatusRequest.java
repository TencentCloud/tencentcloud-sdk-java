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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRiskCenterRiskStatusRequest extends AbstractModel {

    /**
    * 风险资产相关数据
    */
    @SerializedName("RiskStatusKeys")
    @Expose
    private RiskCenterStatusKey [] RiskStatusKeys;

    /**
    * 处置状态，1为已处置、2为已忽略，3为取消已处置，4为取消已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 风险类型，0-端口风险， 1-漏洞风险，2-弱口令风险， 3-网站内容风险，4-配置风险，5-风险服务暴露
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get 风险资产相关数据 
     * @return RiskStatusKeys 风险资产相关数据
     */
    public RiskCenterStatusKey [] getRiskStatusKeys() {
        return this.RiskStatusKeys;
    }

    /**
     * Set 风险资产相关数据
     * @param RiskStatusKeys 风险资产相关数据
     */
    public void setRiskStatusKeys(RiskCenterStatusKey [] RiskStatusKeys) {
        this.RiskStatusKeys = RiskStatusKeys;
    }

    /**
     * Get 处置状态，1为已处置、2为已忽略，3为取消已处置，4为取消已忽略 
     * @return Status 处置状态，1为已处置、2为已忽略，3为取消已处置，4为取消已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处置状态，1为已处置、2为已忽略，3为取消已处置，4为取消已忽略
     * @param Status 处置状态，1为已处置、2为已忽略，3为取消已处置，4为取消已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 风险类型，0-端口风险， 1-漏洞风险，2-弱口令风险， 3-网站内容风险，4-配置风险，5-风险服务暴露 
     * @return Type 风险类型，0-端口风险， 1-漏洞风险，2-弱口令风险， 3-网站内容风险，4-配置风险，5-风险服务暴露
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 风险类型，0-端口风险， 1-漏洞风险，2-弱口令风险， 3-网站内容风险，4-配置风险，5-风险服务暴露
     * @param Type 风险类型，0-端口风险， 1-漏洞风险，2-弱口令风险， 3-网站内容风险，4-配置风险，5-风险服务暴露
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyRiskCenterRiskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskCenterRiskStatusRequest(ModifyRiskCenterRiskStatusRequest source) {
        if (source.RiskStatusKeys != null) {
            this.RiskStatusKeys = new RiskCenterStatusKey[source.RiskStatusKeys.length];
            for (int i = 0; i < source.RiskStatusKeys.length; i++) {
                this.RiskStatusKeys[i] = new RiskCenterStatusKey(source.RiskStatusKeys[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RiskStatusKeys.", this.RiskStatusKeys);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

