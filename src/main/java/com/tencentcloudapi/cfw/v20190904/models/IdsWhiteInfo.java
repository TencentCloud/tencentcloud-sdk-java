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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdsWhiteInfo extends AbstractModel {

    /**
    * 白名单唯一ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 源IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 目的IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 规则类型
    */
    @SerializedName("WhiteRuleType")
    @Expose
    private String WhiteRuleType;

    /**
    * 白名单生效防火墙范围： 1 边界防火墙 2 nat防火墙 4 vpc防火墙 7 = 1+2+4 所有防火墙
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

    /**
    * 入侵防御规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 白名单唯一ID 
     * @return Id 白名单唯一ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 白名单唯一ID
     * @param Id 白名单唯一ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 源IP 
     * @return SrcIp 源IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 源IP
     * @param SrcIp 源IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 目的IP 
     * @return DstIp 目的IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目的IP
     * @param DstIp 目的IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 规则类型 
     * @return WhiteRuleType 规则类型
     */
    public String getWhiteRuleType() {
        return this.WhiteRuleType;
    }

    /**
     * Set 规则类型
     * @param WhiteRuleType 规则类型
     */
    public void setWhiteRuleType(String WhiteRuleType) {
        this.WhiteRuleType = WhiteRuleType;
    }

    /**
     * Get 白名单生效防火墙范围： 1 边界防火墙 2 nat防火墙 4 vpc防火墙 7 = 1+2+4 所有防火墙 
     * @return FwType 白名单生效防火墙范围： 1 边界防火墙 2 nat防火墙 4 vpc防火墙 7 = 1+2+4 所有防火墙
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set 白名单生效防火墙范围： 1 边界防火墙 2 nat防火墙 4 vpc防火墙 7 = 1+2+4 所有防火墙
     * @param FwType 白名单生效防火墙范围： 1 边界防火墙 2 nat防火墙 4 vpc防火墙 7 = 1+2+4 所有防火墙
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 入侵防御规则ID 
     * @return RuleId 入侵防御规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 入侵防御规则ID
     * @param RuleId 入侵防御规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public IdsWhiteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdsWhiteInfo(IdsWhiteInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.WhiteRuleType != null) {
            this.WhiteRuleType = new String(source.WhiteRuleType);
        }
        if (source.FwType != null) {
            this.FwType = new Long(source.FwType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "WhiteRuleType", this.WhiteRuleType);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

