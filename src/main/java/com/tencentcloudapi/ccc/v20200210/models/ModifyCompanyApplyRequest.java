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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCompanyApplyRequest extends AbstractModel {

    /**
    * 申请单ID(只能修改状态为“驳回”或者“待审核”的申请单)
    */
    @SerializedName("ApplyId")
    @Expose
    private Long ApplyId;

    /**
    * 企业资质信息
    */
    @SerializedName("CompanyInfo")
    @Expose
    private CompanyApplyInfo CompanyInfo;

    /**
     * Get 申请单ID(只能修改状态为“驳回”或者“待审核”的申请单) 
     * @return ApplyId 申请单ID(只能修改状态为“驳回”或者“待审核”的申请单)
     */
    public Long getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set 申请单ID(只能修改状态为“驳回”或者“待审核”的申请单)
     * @param ApplyId 申请单ID(只能修改状态为“驳回”或者“待审核”的申请单)
     */
    public void setApplyId(Long ApplyId) {
        this.ApplyId = ApplyId;
    }

    /**
     * Get 企业资质信息 
     * @return CompanyInfo 企业资质信息
     */
    public CompanyApplyInfo getCompanyInfo() {
        return this.CompanyInfo;
    }

    /**
     * Set 企业资质信息
     * @param CompanyInfo 企业资质信息
     */
    public void setCompanyInfo(CompanyApplyInfo CompanyInfo) {
        this.CompanyInfo = CompanyInfo;
    }

    public ModifyCompanyApplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCompanyApplyRequest(ModifyCompanyApplyRequest source) {
        if (source.ApplyId != null) {
            this.ApplyId = new Long(source.ApplyId);
        }
        if (source.CompanyInfo != null) {
            this.CompanyInfo = new CompanyApplyInfo(source.CompanyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);
        this.setParamObj(map, prefix + "CompanyInfo.", this.CompanyInfo);

    }
}

