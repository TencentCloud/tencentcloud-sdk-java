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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIdsWhiteRuleRequest extends AbstractModel {

    /**
    * 入侵防御规则ID
    */
    @SerializedName("IdsRuleId")
    @Expose
    private String IdsRuleId;

    /**
    * 白名单类型：
src 针对源放通
dst 针对目的放通
srcdst 针对源和目的放通
    */
    @SerializedName("WhiteRuleType")
    @Expose
    private String WhiteRuleType;

    /**
    * 白名单生效防火墙范围：
1 边界防火墙
2 nat防火墙
4 vpc防火墙
7 = 1+2+4  所有防火墙
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

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
     * Get 入侵防御规则ID 
     * @return IdsRuleId 入侵防御规则ID
     */
    public String getIdsRuleId() {
        return this.IdsRuleId;
    }

    /**
     * Set 入侵防御规则ID
     * @param IdsRuleId 入侵防御规则ID
     */
    public void setIdsRuleId(String IdsRuleId) {
        this.IdsRuleId = IdsRuleId;
    }

    /**
     * Get 白名单类型：
src 针对源放通
dst 针对目的放通
srcdst 针对源和目的放通 
     * @return WhiteRuleType 白名单类型：
src 针对源放通
dst 针对目的放通
srcdst 针对源和目的放通
     */
    public String getWhiteRuleType() {
        return this.WhiteRuleType;
    }

    /**
     * Set 白名单类型：
src 针对源放通
dst 针对目的放通
srcdst 针对源和目的放通
     * @param WhiteRuleType 白名单类型：
src 针对源放通
dst 针对目的放通
srcdst 针对源和目的放通
     */
    public void setWhiteRuleType(String WhiteRuleType) {
        this.WhiteRuleType = WhiteRuleType;
    }

    /**
     * Get 白名单生效防火墙范围：
1 边界防火墙
2 nat防火墙
4 vpc防火墙
7 = 1+2+4  所有防火墙 
     * @return FwType 白名单生效防火墙范围：
1 边界防火墙
2 nat防火墙
4 vpc防火墙
7 = 1+2+4  所有防火墙
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set 白名单生效防火墙范围：
1 边界防火墙
2 nat防火墙
4 vpc防火墙
7 = 1+2+4  所有防火墙
     * @param FwType 白名单生效防火墙范围：
1 边界防火墙
2 nat防火墙
4 vpc防火墙
7 = 1+2+4  所有防火墙
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
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

    public CreateIdsWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIdsWhiteRuleRequest(CreateIdsWhiteRuleRequest source) {
        if (source.IdsRuleId != null) {
            this.IdsRuleId = new String(source.IdsRuleId);
        }
        if (source.WhiteRuleType != null) {
            this.WhiteRuleType = new String(source.WhiteRuleType);
        }
        if (source.FwType != null) {
            this.FwType = new Long(source.FwType);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdsRuleId", this.IdsRuleId);
        this.setParamSimple(map, prefix + "WhiteRuleType", this.WhiteRuleType);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);

    }
}

