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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleGroupSubscriptionRequest extends AbstractModel{

    /**
    * 规则组ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 订阅人信息
    */
    @SerializedName("Receivers")
    @Expose
    private SubscribeReceiver [] Receivers;

    /**
    * 订阅类型
    */
    @SerializedName("SubscribeType")
    @Expose
    private Long [] SubscribeType;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据库Id
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据源Id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据表Id
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 群机器人webhook信息
    */
    @SerializedName("WebHooks")
    @Expose
    private SubscribeWebHook [] WebHooks;

    /**
     * Get 规则组ID 
     * @return RuleGroupId 规则组ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组ID
     * @param RuleGroupId 规则组ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 订阅人信息 
     * @return Receivers 订阅人信息
     */
    public SubscribeReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 订阅人信息
     * @param Receivers 订阅人信息
     */
    public void setReceivers(SubscribeReceiver [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 订阅类型 
     * @return SubscribeType 订阅类型
     */
    public Long [] getSubscribeType() {
        return this.SubscribeType;
    }

    /**
     * Set 订阅类型
     * @param SubscribeType 订阅类型
     */
    public void setSubscribeType(Long [] SubscribeType) {
        this.SubscribeType = SubscribeType;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据库Id 
     * @return DatabaseId 数据库Id
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库Id
     * @param DatabaseId 数据库Id
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 数据源Id 
     * @return DatasourceId 数据源Id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
     * @param DatasourceId 数据源Id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据表Id 
     * @return TableId 数据表Id
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 数据表Id
     * @param TableId 数据表Id
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 群机器人webhook信息 
     * @return WebHooks 群机器人webhook信息
     */
    public SubscribeWebHook [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set 群机器人webhook信息
     * @param WebHooks 群机器人webhook信息
     */
    public void setWebHooks(SubscribeWebHook [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    public ModifyRuleGroupSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleGroupSubscriptionRequest(ModifyRuleGroupSubscriptionRequest source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.Receivers != null) {
            this.Receivers = new SubscribeReceiver[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new SubscribeReceiver(source.Receivers[i]);
            }
        }
        if (source.SubscribeType != null) {
            this.SubscribeType = new Long[source.SubscribeType.length];
            for (int i = 0; i < source.SubscribeType.length; i++) {
                this.SubscribeType[i] = new Long(source.SubscribeType[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.WebHooks != null) {
            this.WebHooks = new SubscribeWebHook[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new SubscribeWebHook(source.WebHooks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamArrayObj(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "SubscribeType.", this.SubscribeType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArrayObj(map, prefix + "WebHooks.", this.WebHooks);

    }
}

