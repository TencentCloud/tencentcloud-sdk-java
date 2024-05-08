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

public class DeleteIpAccessControlV2Request extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则ID列表，支持批量删除
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * 是否删除对应的域名下的所有黑/白IP名单，true表示全部删除，false表示只删除指定ip名单
    */
    @SerializedName("DeleteAll")
    @Expose
    private Boolean DeleteAll;

    /**
    * batch表示为批量防护的IP黑白名单
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * IP黑白名单类型，40为IP白名单，42为IP黑名单
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

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
     * Get 规则ID列表，支持批量删除 
     * @return RuleIds 规则ID列表，支持批量删除
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 规则ID列表，支持批量删除
     * @param RuleIds 规则ID列表，支持批量删除
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 是否删除对应的域名下的所有黑/白IP名单，true表示全部删除，false表示只删除指定ip名单 
     * @return DeleteAll 是否删除对应的域名下的所有黑/白IP名单，true表示全部删除，false表示只删除指定ip名单
     */
    public Boolean getDeleteAll() {
        return this.DeleteAll;
    }

    /**
     * Set 是否删除对应的域名下的所有黑/白IP名单，true表示全部删除，false表示只删除指定ip名单
     * @param DeleteAll 是否删除对应的域名下的所有黑/白IP名单，true表示全部删除，false表示只删除指定ip名单
     */
    public void setDeleteAll(Boolean DeleteAll) {
        this.DeleteAll = DeleteAll;
    }

    /**
     * Get batch表示为批量防护的IP黑白名单 
     * @return SourceType batch表示为批量防护的IP黑白名单
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set batch表示为批量防护的IP黑白名单
     * @param SourceType batch表示为批量防护的IP黑白名单
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get IP黑白名单类型，40为IP白名单，42为IP黑名单 
     * @return ActionType IP黑白名单类型，40为IP白名单，42为IP黑名单
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set IP黑白名单类型，40为IP白名单，42为IP黑名单
     * @param ActionType IP黑白名单类型，40为IP白名单，42为IP黑名单
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    public DeleteIpAccessControlV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIpAccessControlV2Request(DeleteIpAccessControlV2Request source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.DeleteAll != null) {
            this.DeleteAll = new Boolean(source.DeleteAll);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "DeleteAll", this.DeleteAll);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

