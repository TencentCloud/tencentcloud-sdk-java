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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPolicyOverview extends AbstractModel {

    /**
    * 自动备份策略总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 已绑定资源的策略数
    */
    @SerializedName("BoundCount")
    @Expose
    private Long BoundCount;

    /**
    * 未绑定任何资源的策略数
    */
    @SerializedName("UnboundCount")
    @Expose
    private Long UnboundCount;

    /**
     * Get 自动备份策略总数 
     * @return TotalCount 自动备份策略总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 自动备份策略总数
     * @param TotalCount 自动备份策略总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 已绑定资源的策略数 
     * @return BoundCount 已绑定资源的策略数
     */
    public Long getBoundCount() {
        return this.BoundCount;
    }

    /**
     * Set 已绑定资源的策略数
     * @param BoundCount 已绑定资源的策略数
     */
    public void setBoundCount(Long BoundCount) {
        this.BoundCount = BoundCount;
    }

    /**
     * Get 未绑定任何资源的策略数 
     * @return UnboundCount 未绑定任何资源的策略数
     */
    public Long getUnboundCount() {
        return this.UnboundCount;
    }

    /**
     * Set 未绑定任何资源的策略数
     * @param UnboundCount 未绑定任何资源的策略数
     */
    public void setUnboundCount(Long UnboundCount) {
        this.UnboundCount = UnboundCount;
    }

    public BackupPolicyOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPolicyOverview(BackupPolicyOverview source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BoundCount != null) {
            this.BoundCount = new Long(source.BoundCount);
        }
        if (source.UnboundCount != null) {
            this.UnboundCount = new Long(source.UnboundCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "BoundCount", this.BoundCount);
        this.setParamSimple(map, prefix + "UnboundCount", this.UnboundCount);

    }
}

