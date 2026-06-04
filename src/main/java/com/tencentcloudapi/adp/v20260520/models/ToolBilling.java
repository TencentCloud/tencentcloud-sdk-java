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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolBilling extends AbstractModel {

    /**
    * 计费类型
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 免费 |
| 1 | 限时免费 |
| 2 | 官方收费 |
| 3 | 官方收费(存量老用户限时免费) |
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
     * Get 计费类型
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 免费 |
| 1 | 限时免费 |
| 2 | 官方收费 |
| 3 | 官方收费(存量老用户限时免费) | 
     * @return BillingType 计费类型
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 免费 |
| 1 | 限时免费 |
| 2 | 官方收费 |
| 3 | 官方收费(存量老用户限时免费) |
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 计费类型
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 免费 |
| 1 | 限时免费 |
| 2 | 官方收费 |
| 3 | 官方收费(存量老用户限时免费) |
     * @param BillingType 计费类型
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 免费 |
| 1 | 限时免费 |
| 2 | 官方收费 |
| 3 | 官方收费(存量老用户限时免费) |
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    public ToolBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolBilling(ToolBilling source) {
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);

    }
}

