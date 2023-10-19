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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFileTamperRuleStatusRequest extends AbstractModel {

    /**
    * 0: 启用1: 关闭2：删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 对应事件id
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 是否是系统规则 0=系统规则 1=用户自定义规则，系统规则Status 不支持删除
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
     * Get 0: 启用1: 关闭2：删除 
     * @return Status 0: 启用1: 关闭2：删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: 启用1: 关闭2：删除
     * @param Status 0: 启用1: 关闭2：删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 对应事件id 
     * @return Ids 对应事件id
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 对应事件id
     * @param Ids 对应事件id
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 是否是系统规则 0=系统规则 1=用户自定义规则，系统规则Status 不支持删除 
     * @return RuleCategory 是否是系统规则 0=系统规则 1=用户自定义规则，系统规则Status 不支持删除
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set 是否是系统规则 0=系统规则 1=用户自定义规则，系统规则Status 不支持删除
     * @param RuleCategory 是否是系统规则 0=系统规则 1=用户自定义规则，系统规则Status 不支持删除
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    public ModifyFileTamperRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileTamperRuleStatusRequest(ModifyFileTamperRuleStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);

    }
}

