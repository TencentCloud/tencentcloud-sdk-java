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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvPlansRequest extends AbstractModel {

    /**
    * <p>套餐英文标识，不指定则返回所有可售卖套餐</p><p>枚举值：</p><ul><li>baas_integration： 集成版</li><li>baas_personal： 个人版</li><li>baas_pf_standard： 标准版</li><li>baas_pf_enterprise： 企业版</li><li>baas_pf_enterprise_senior： 企业高级版</li></ul>
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
     * Get <p>套餐英文标识，不指定则返回所有可售卖套餐</p><p>枚举值：</p><ul><li>baas_integration： 集成版</li><li>baas_personal： 个人版</li><li>baas_pf_standard： 标准版</li><li>baas_pf_enterprise： 企业版</li><li>baas_pf_enterprise_senior： 企业高级版</li></ul> 
     * @return PackageId <p>套餐英文标识，不指定则返回所有可售卖套餐</p><p>枚举值：</p><ul><li>baas_integration： 集成版</li><li>baas_personal： 个人版</li><li>baas_pf_standard： 标准版</li><li>baas_pf_enterprise： 企业版</li><li>baas_pf_enterprise_senior： 企业高级版</li></ul>
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>套餐英文标识，不指定则返回所有可售卖套餐</p><p>枚举值：</p><ul><li>baas_integration： 集成版</li><li>baas_personal： 个人版</li><li>baas_pf_standard： 标准版</li><li>baas_pf_enterprise： 企业版</li><li>baas_pf_enterprise_senior： 企业高级版</li></ul>
     * @param PackageId <p>套餐英文标识，不指定则返回所有可售卖套餐</p><p>枚举值：</p><ul><li>baas_integration： 集成版</li><li>baas_personal： 个人版</li><li>baas_pf_standard： 标准版</li><li>baas_pf_enterprise： 企业版</li><li>baas_pf_enterprise_senior： 企业高级版</li></ul>
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    public DescribeEnvPlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvPlansRequest(DescribeEnvPlansRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);

    }
}

