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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductQuota extends AbstractModel{

    /**
    * 产品配额ID
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * 产品配额名称
    */
    @SerializedName("QuotaName")
    @Expose
    private String QuotaName;

    /**
    * 产品当前配额
    */
    @SerializedName("QuotaCurrent")
    @Expose
    private Long QuotaCurrent;

    /**
    * 产品配额上限
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * 产品配额是否有地域属性
    */
    @SerializedName("QuotaRegion")
    @Expose
    private Boolean QuotaRegion;

    /**
     * Get 产品配额ID 
     * @return QuotaId 产品配额ID
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set 产品配额ID
     * @param QuotaId 产品配额ID
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get 产品配额名称 
     * @return QuotaName 产品配额名称
     */
    public String getQuotaName() {
        return this.QuotaName;
    }

    /**
     * Set 产品配额名称
     * @param QuotaName 产品配额名称
     */
    public void setQuotaName(String QuotaName) {
        this.QuotaName = QuotaName;
    }

    /**
     * Get 产品当前配额 
     * @return QuotaCurrent 产品当前配额
     */
    public Long getQuotaCurrent() {
        return this.QuotaCurrent;
    }

    /**
     * Set 产品当前配额
     * @param QuotaCurrent 产品当前配额
     */
    public void setQuotaCurrent(Long QuotaCurrent) {
        this.QuotaCurrent = QuotaCurrent;
    }

    /**
     * Get 产品配额上限 
     * @return QuotaLimit 产品配额上限
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set 产品配额上限
     * @param QuotaLimit 产品配额上限
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get 产品配额是否有地域属性 
     * @return QuotaRegion 产品配额是否有地域属性
     */
    public Boolean getQuotaRegion() {
        return this.QuotaRegion;
    }

    /**
     * Set 产品配额是否有地域属性
     * @param QuotaRegion 产品配额是否有地域属性
     */
    public void setQuotaRegion(Boolean QuotaRegion) {
        this.QuotaRegion = QuotaRegion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaName", this.QuotaName);
        this.setParamSimple(map, prefix + "QuotaCurrent", this.QuotaCurrent);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "QuotaRegion", this.QuotaRegion);

    }
}

