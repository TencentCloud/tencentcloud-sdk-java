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
    * 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * 套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * 购买时长。单位：月。必须大于 0。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。
    */
    @SerializedName("CreditOrToken")
    @Expose
    private Long CreditOrToken;

    /**
    * 是否开启自动续费。默认不开启。
    */
    @SerializedName("EnableAutoRenew")
    @Expose
    private Boolean EnableAutoRenew;

    /**
     * Get 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。 
     * @return ProductType 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
     * @param ProductType 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符 
     * @return TeamName 套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set 套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符
     * @param TeamName 套餐名称。只能包含中文、字母、数字、下划线、连字符，以中文或者字母开头，以中文或字母或数字结尾，2~50个字符
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get 购买时长。单位：月。必须大于 0。 
     * @return TimeSpan 购买时长。单位：月。必须大于 0。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长。单位：月。必须大于 0。
     * @param TimeSpan 购买时长。单位：月。必须大于 0。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。 
     * @return CreditOrToken 购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。
     */
    public Long getCreditOrToken() {
        return this.CreditOrToken;
    }

    /**
     * Set 购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。
     * @param CreditOrToken 购买的套餐规格。套餐类型为专业套餐（enterprise），单位取值为积分；轻享套餐（enterprise-auto），单位取值为 tokens。
     */
    public void setCreditOrToken(Long CreditOrToken) {
        this.CreditOrToken = CreditOrToken;
    }

    /**
     * Get 是否开启自动续费。默认不开启。 
     * @return EnableAutoRenew 是否开启自动续费。默认不开启。
     */
    public Boolean getEnableAutoRenew() {
        return this.EnableAutoRenew;
    }

    /**
     * Set 是否开启自动续费。默认不开启。
     * @param EnableAutoRenew 是否开启自动续费。默认不开启。
     */
    public void setEnableAutoRenew(Boolean EnableAutoRenew) {
        this.EnableAutoRenew = EnableAutoRenew;
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

    }
}

