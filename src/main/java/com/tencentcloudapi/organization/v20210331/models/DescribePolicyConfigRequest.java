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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConfigRequest extends AbstractModel {

    /**
    * 企业组织Id。可以调用[DescribeOrganization](https://cloud.tencent.com/document/product/850/67059)获取
    */
    @SerializedName("OrganizationId")
    @Expose
    private Long OrganizationId;

    /**
    * 策略类型。默认值0，取值范围：0-服务控制策略、1-标签策略
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 企业组织Id。可以调用[DescribeOrganization](https://cloud.tencent.com/document/product/850/67059)获取 
     * @return OrganizationId 企业组织Id。可以调用[DescribeOrganization](https://cloud.tencent.com/document/product/850/67059)获取
     */
    public Long getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 企业组织Id。可以调用[DescribeOrganization](https://cloud.tencent.com/document/product/850/67059)获取
     * @param OrganizationId 企业组织Id。可以调用[DescribeOrganization](https://cloud.tencent.com/document/product/850/67059)获取
     */
    public void setOrganizationId(Long OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 策略类型。默认值0，取值范围：0-服务控制策略、1-标签策略 
     * @return Type 策略类型。默认值0，取值范围：0-服务控制策略、1-标签策略
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 策略类型。默认值0，取值范围：0-服务控制策略、1-标签策略
     * @param Type 策略类型。默认值0，取值范围：0-服务控制策略、1-标签策略
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribePolicyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConfigRequest(DescribePolicyConfigRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new Long(source.OrganizationId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

