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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomRulesRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 分页参数
    */
    @SerializedName("Paging")
    @Expose
    private DescribeCustomRulesPagingInfo Paging;

    /**
    * clb-waf或者sparta-waf
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 过滤参数：动作类型：0放行，1阻断，2人机识别，3观察，4重定向
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 过滤参数：规则名称过滤条件
    */
    @SerializedName("Search")
    @Expose
    private String Search;

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
     * Get 分页参数 
     * @return Paging 分页参数
     */
    public DescribeCustomRulesPagingInfo getPaging() {
        return this.Paging;
    }

    /**
     * Set 分页参数
     * @param Paging 分页参数
     */
    public void setPaging(DescribeCustomRulesPagingInfo Paging) {
        this.Paging = Paging;
    }

    /**
     * Get clb-waf或者sparta-waf 
     * @return Edition clb-waf或者sparta-waf
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set clb-waf或者sparta-waf
     * @param Edition clb-waf或者sparta-waf
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 过滤参数：动作类型：0放行，1阻断，2人机识别，3观察，4重定向 
     * @return ActionType 过滤参数：动作类型：0放行，1阻断，2人机识别，3观察，4重定向
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 过滤参数：动作类型：0放行，1阻断，2人机识别，3观察，4重定向
     * @param ActionType 过滤参数：动作类型：0放行，1阻断，2人机识别，3观察，4重定向
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 过滤参数：规则名称过滤条件 
     * @return Search 过滤参数：规则名称过滤条件
     */
    public String getSearch() {
        return this.Search;
    }

    /**
     * Set 过滤参数：规则名称过滤条件
     * @param Search 过滤参数：规则名称过滤条件
     */
    public void setSearch(String Search) {
        this.Search = Search;
    }

    public DescribeCustomRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomRulesRequest(DescribeCustomRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Paging != null) {
            this.Paging = new DescribeCustomRulesPagingInfo(source.Paging);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Search != null) {
            this.Search = new String(source.Search);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "Paging.", this.Paging);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Search", this.Search);

    }
}

