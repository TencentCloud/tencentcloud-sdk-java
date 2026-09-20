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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountQuotaOverview extends AbstractModel {

    /**
    * <p>主账号各资源维度的配额上限</p>
    */
    @SerializedName("Quota")
    @Expose
    private QuotaResourceInfo Quota;

    /**
    * <p>主账号各资源维度的当前用量</p>
    */
    @SerializedName("Usage")
    @Expose
    private QuotaResourceInfo Usage;

    /**
     * Get <p>主账号各资源维度的配额上限</p> 
     * @return Quota <p>主账号各资源维度的配额上限</p>
     */
    public QuotaResourceInfo getQuota() {
        return this.Quota;
    }

    /**
     * Set <p>主账号各资源维度的配额上限</p>
     * @param Quota <p>主账号各资源维度的配额上限</p>
     */
    public void setQuota(QuotaResourceInfo Quota) {
        this.Quota = Quota;
    }

    /**
     * Get <p>主账号各资源维度的当前用量</p> 
     * @return Usage <p>主账号各资源维度的当前用量</p>
     */
    public QuotaResourceInfo getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>主账号各资源维度的当前用量</p>
     * @param Usage <p>主账号各资源维度的当前用量</p>
     */
    public void setUsage(QuotaResourceInfo Usage) {
        this.Usage = Usage;
    }

    public AccountQuotaOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountQuotaOverview(AccountQuotaOverview source) {
        if (source.Quota != null) {
            this.Quota = new QuotaResourceInfo(source.Quota);
        }
        if (source.Usage != null) {
            this.Usage = new QuotaResourceInfo(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Quota.", this.Quota);
        this.setParamObj(map, prefix + "Usage.", this.Usage);

    }
}

