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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTestXMagicRequest extends AbstractModel {

    /**
    * 将腾讯特效创建到哪个应用下
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 营业执照
    */
    @SerializedName("CompanyPermit")
    @Expose
    private String CompanyPermit;

    /**
    * 公司类型
    */
    @SerializedName("CompanyType")
    @Expose
    private String CompanyType;

    /**
    * 公司名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 测试套餐名称
    */
    @SerializedName("PlanList")
    @Expose
    private String [] PlanList;

    /**
     * Get 将腾讯特效创建到哪个应用下 
     * @return ApplicationId 将腾讯特效创建到哪个应用下
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 将腾讯特效创建到哪个应用下
     * @param ApplicationId 将腾讯特效创建到哪个应用下
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 营业执照 
     * @return CompanyPermit 营业执照
     */
    public String getCompanyPermit() {
        return this.CompanyPermit;
    }

    /**
     * Set 营业执照
     * @param CompanyPermit 营业执照
     */
    public void setCompanyPermit(String CompanyPermit) {
        this.CompanyPermit = CompanyPermit;
    }

    /**
     * Get 公司类型 
     * @return CompanyType 公司类型
     */
    public String getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set 公司类型
     * @param CompanyType 公司类型
     */
    public void setCompanyType(String CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get 公司名称 
     * @return CompanyName 公司名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
     * @param CompanyName 公司名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 测试套餐名称 
     * @return PlanList 测试套餐名称
     */
    public String [] getPlanList() {
        return this.PlanList;
    }

    /**
     * Set 测试套餐名称
     * @param PlanList 测试套餐名称
     */
    public void setPlanList(String [] PlanList) {
        this.PlanList = PlanList;
    }

    public CreateTestXMagicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTestXMagicRequest(CreateTestXMagicRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.CompanyPermit != null) {
            this.CompanyPermit = new String(source.CompanyPermit);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new String(source.CompanyType);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.PlanList != null) {
            this.PlanList = new String[source.PlanList.length];
            for (int i = 0; i < source.PlanList.length; i++) {
                this.PlanList[i] = new String(source.PlanList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "CompanyPermit", this.CompanyPermit);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamArraySimple(map, prefix + "PlanList.", this.PlanList);

    }
}

