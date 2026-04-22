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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBatchCustomWhiteRuleStatusRequest extends AbstractModel {

    /**
    * 要更新的规则ID列表
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 开关，1：开启、0：关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 要更新的规则ID列表 
     * @return Ids 要更新的规则ID列表
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 要更新的规则ID列表
     * @param Ids 要更新的规则ID列表
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 开关，1：开启、0：关闭 
     * @return Status 开关，1：开启、0：关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关，1：开启、0：关闭
     * @param Status 开关，1：开启、0：关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyBatchCustomWhiteRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBatchCustomWhiteRuleStatusRequest(ModifyBatchCustomWhiteRuleStatusRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

