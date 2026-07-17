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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTokenPlanTeamOrderAndBuyRequest extends AbstractModel {

    /**
    * <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>购买时长。单位：月。必须大于 0，支持1个月～12个月。</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。</p>
    */
    @SerializedName("CreditOrToken")
    @Expose
    private Long CreditOrToken;

    /**
    * <p>是否开启自动续费。默认不开启。</p>
    */
    @SerializedName("EnableAutoRenew")
    @Expose
    private Boolean EnableAutoRenew;

    /**
    * <p>已有套餐 ID（非空时走过期续费，空时走新购）</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
     * Get <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p> 
     * @return ProductType <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
     * @param ProductType <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符</p> 
     * @return TeamName <p>套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符</p>
     * @param TeamName <p>套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>购买时长。单位：月。必须大于 0，支持1个月～12个月。</p> 
     * @return TimeSpan <p>购买时长。单位：月。必须大于 0，支持1个月～12个月。</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买时长。单位：月。必须大于 0，支持1个月～12个月。</p>
     * @param TimeSpan <p>购买时长。单位：月。必须大于 0，支持1个月～12个月。</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。</p> 
     * @return CreditOrToken <p>购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。</p>
     */
    public Long getCreditOrToken() {
        return this.CreditOrToken;
    }

    /**
     * Set <p>购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。</p>
     * @param CreditOrToken <p>购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。</p>
     */
    public void setCreditOrToken(Long CreditOrToken) {
        this.CreditOrToken = CreditOrToken;
    }

    /**
     * Get <p>是否开启自动续费。默认不开启。</p> 
     * @return EnableAutoRenew <p>是否开启自动续费。默认不开启。</p>
     */
    public Boolean getEnableAutoRenew() {
        return this.EnableAutoRenew;
    }

    /**
     * Set <p>是否开启自动续费。默认不开启。</p>
     * @param EnableAutoRenew <p>是否开启自动续费。默认不开启。</p>
     */
    public void setEnableAutoRenew(Boolean EnableAutoRenew) {
        this.EnableAutoRenew = EnableAutoRenew;
    }

    /**
     * Get <p>已有套餐 ID（非空时走过期续费，空时走新购）</p> 
     * @return TeamId <p>已有套餐 ID（非空时走过期续费，空时走新购）</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>已有套餐 ID（非空时走过期续费，空时走新购）</p>
     * @param TeamId <p>已有套餐 ID（非空时走过期续费，空时走新购）</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    public CreateTokenPlanTeamOrderAndBuyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTokenPlanTeamOrderAndBuyRequest(CreateTokenPlanTeamOrderAndBuyRequest source) {
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.CreditOrToken != null) {
            this.CreditOrToken = new Long(source.CreditOrToken);
        }
        if (source.EnableAutoRenew != null) {
            this.EnableAutoRenew = new Boolean(source.EnableAutoRenew);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "CreditOrToken", this.CreditOrToken);
        this.setParamSimple(map, prefix + "EnableAutoRenew", this.EnableAutoRenew);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);

    }
}

