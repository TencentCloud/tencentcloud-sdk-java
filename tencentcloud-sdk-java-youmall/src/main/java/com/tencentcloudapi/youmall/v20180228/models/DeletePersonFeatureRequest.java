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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePersonFeatureRequest extends AbstractModel{

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 门店ID
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 顾客ID
    */
    @SerializedName("PersonId")
    @Expose
    private Long PersonId;

    /**
     * Get 公司ID 
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 门店ID 
     * @return ShopId 门店ID
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 门店ID
     * @param ShopId 门店ID
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 顾客ID 
     * @return PersonId 顾客ID
     */
    public Long getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 顾客ID
     * @param PersonId 顾客ID
     */
    public void setPersonId(Long PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);

    }
}

