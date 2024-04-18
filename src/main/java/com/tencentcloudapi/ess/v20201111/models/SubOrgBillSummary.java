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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubOrgBillSummary extends AbstractModel {

    /**
    * 子企业名称
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    *  
    */
    @SerializedName("Usage")
    @Expose
    private SubOrgBillUsage [] Usage;

    /**
     * Get 子企业名称 
     * @return OrganizationName 子企业名称
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 子企业名称
     * @param OrganizationName 子企业名称
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get   
     * @return Usage  
     */
    public SubOrgBillUsage [] getUsage() {
        return this.Usage;
    }

    /**
     * Set  
     * @param Usage  
     */
    public void setUsage(SubOrgBillUsage [] Usage) {
        this.Usage = Usage;
    }

    public SubOrgBillSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubOrgBillSummary(SubOrgBillSummary source) {
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.Usage != null) {
            this.Usage = new SubOrgBillUsage[source.Usage.length];
            for (int i = 0; i < source.Usage.length; i++) {
                this.Usage[i] = new SubOrgBillUsage(source.Usage[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamArrayObj(map, prefix + "Usage.", this.Usage);

    }
}

