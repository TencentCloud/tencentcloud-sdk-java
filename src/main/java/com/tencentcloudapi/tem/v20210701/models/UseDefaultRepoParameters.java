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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UseDefaultRepoParameters extends AbstractModel {

    /**
    * 企业版实例名
    */
    @SerializedName("EnterpriseInstanceName")
    @Expose
    private String EnterpriseInstanceName;

    /**
    * 企业版收费类型  0 按量收费   1 包年包月
    */
    @SerializedName("EnterpriseInstanceChargeType")
    @Expose
    private Long EnterpriseInstanceChargeType;

    /**
    * 企业版规格：basic-基础班 ，standard-标准版，premium-高级版
    */
    @SerializedName("EnterpriseInstanceType")
    @Expose
    private String EnterpriseInstanceType;

    /**
     * Get 企业版实例名 
     * @return EnterpriseInstanceName 企业版实例名
     */
    public String getEnterpriseInstanceName() {
        return this.EnterpriseInstanceName;
    }

    /**
     * Set 企业版实例名
     * @param EnterpriseInstanceName 企业版实例名
     */
    public void setEnterpriseInstanceName(String EnterpriseInstanceName) {
        this.EnterpriseInstanceName = EnterpriseInstanceName;
    }

    /**
     * Get 企业版收费类型  0 按量收费   1 包年包月 
     * @return EnterpriseInstanceChargeType 企业版收费类型  0 按量收费   1 包年包月
     */
    public Long getEnterpriseInstanceChargeType() {
        return this.EnterpriseInstanceChargeType;
    }

    /**
     * Set 企业版收费类型  0 按量收费   1 包年包月
     * @param EnterpriseInstanceChargeType 企业版收费类型  0 按量收费   1 包年包月
     */
    public void setEnterpriseInstanceChargeType(Long EnterpriseInstanceChargeType) {
        this.EnterpriseInstanceChargeType = EnterpriseInstanceChargeType;
    }

    /**
     * Get 企业版规格：basic-基础班 ，standard-标准版，premium-高级版 
     * @return EnterpriseInstanceType 企业版规格：basic-基础班 ，standard-标准版，premium-高级版
     */
    public String getEnterpriseInstanceType() {
        return this.EnterpriseInstanceType;
    }

    /**
     * Set 企业版规格：basic-基础班 ，standard-标准版，premium-高级版
     * @param EnterpriseInstanceType 企业版规格：basic-基础班 ，standard-标准版，premium-高级版
     */
    public void setEnterpriseInstanceType(String EnterpriseInstanceType) {
        this.EnterpriseInstanceType = EnterpriseInstanceType;
    }

    public UseDefaultRepoParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UseDefaultRepoParameters(UseDefaultRepoParameters source) {
        if (source.EnterpriseInstanceName != null) {
            this.EnterpriseInstanceName = new String(source.EnterpriseInstanceName);
        }
        if (source.EnterpriseInstanceChargeType != null) {
            this.EnterpriseInstanceChargeType = new Long(source.EnterpriseInstanceChargeType);
        }
        if (source.EnterpriseInstanceType != null) {
            this.EnterpriseInstanceType = new String(source.EnterpriseInstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnterpriseInstanceName", this.EnterpriseInstanceName);
        this.setParamSimple(map, prefix + "EnterpriseInstanceChargeType", this.EnterpriseInstanceChargeType);
        this.setParamSimple(map, prefix + "EnterpriseInstanceType", this.EnterpriseInstanceType);

    }
}

