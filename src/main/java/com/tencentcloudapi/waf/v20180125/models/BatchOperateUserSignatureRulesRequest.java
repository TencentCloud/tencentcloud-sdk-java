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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperateUserSignatureRulesRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 0:关闭，1:开启，2:仅观察
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 如果SelectedAll为true，则表示反选的规则，否则表示手动选择的规则ID
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
    * 仅观察原因
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
    * 是否全选
    */
    @SerializedName("SelectedAll")
    @Expose
    private Boolean SelectedAll;

    /**
    * 过滤
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 0:关闭，1:开启，2:仅观察 
     * @return Status 0:关闭，1:开启，2:仅观察
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 0:关闭，1:开启，2:仅观察
     * @param Status 0:关闭，1:开启，2:仅观察
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 如果SelectedAll为true，则表示反选的规则，否则表示手动选择的规则ID 
     * @return RuleIds 如果SelectedAll为true，则表示反选的规则，否则表示手动选择的规则ID
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 如果SelectedAll为true，则表示反选的规则，否则表示手动选择的规则ID
     * @param RuleIds 如果SelectedAll为true，则表示反选的规则，否则表示手动选择的规则ID
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 仅观察原因 
     * @return Reason 仅观察原因
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set 仅观察原因
     * @param Reason 仅观察原因
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 是否全选 
     * @return SelectedAll 是否全选
     */
    public Boolean getSelectedAll() {
        return this.SelectedAll;
    }

    /**
     * Set 是否全选
     * @param SelectedAll 是否全选
     */
    public void setSelectedAll(Boolean SelectedAll) {
        this.SelectedAll = SelectedAll;
    }

    /**
     * Get 过滤 
     * @return Filters 过滤
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤
     * @param Filters 过滤
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public BatchOperateUserSignatureRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperateUserSignatureRulesRequest(BatchOperateUserSignatureRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
        if (source.SelectedAll != null) {
            this.SelectedAll = new Boolean(source.SelectedAll);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "SelectedAll", this.SelectedAll);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

