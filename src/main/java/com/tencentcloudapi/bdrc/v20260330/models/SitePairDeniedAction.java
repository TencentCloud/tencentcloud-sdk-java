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

public class SitePairDeniedAction extends AbstractModel {

    /**
    * 容灾策略ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 该容灾策略当前被禁止执行的操作列表
    */
    @SerializedName("DeniedActions")
    @Expose
    private DeniedAction [] DeniedActions;

    /**
     * Get 容灾策略ID 
     * @return SitePairId 容灾策略ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 容灾策略ID
     * @param SitePairId 容灾策略ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 该容灾策略当前被禁止执行的操作列表 
     * @return DeniedActions 该容灾策略当前被禁止执行的操作列表
     */
    public DeniedAction [] getDeniedActions() {
        return this.DeniedActions;
    }

    /**
     * Set 该容灾策略当前被禁止执行的操作列表
     * @param DeniedActions 该容灾策略当前被禁止执行的操作列表
     */
    public void setDeniedActions(DeniedAction [] DeniedActions) {
        this.DeniedActions = DeniedActions;
    }

    public SitePairDeniedAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SitePairDeniedAction(SitePairDeniedAction source) {
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.DeniedActions != null) {
            this.DeniedActions = new DeniedAction[source.DeniedActions.length];
            for (int i = 0; i < source.DeniedActions.length; i++) {
                this.DeniedActions[i] = new DeniedAction(source.DeniedActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamArrayObj(map, prefix + "DeniedActions.", this.DeniedActions);

    }
}

