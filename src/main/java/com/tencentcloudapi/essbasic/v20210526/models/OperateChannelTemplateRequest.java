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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateChannelTemplateRequest extends AbstractModel{

    /**
    * 应用信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 渠道方模板库模板唯一标识
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 操作类型，查询:"SELECT"，删除:"DELETE"，更新:"UPDATE"
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 模板可见性, 全部可见-"all", 部分可见-"part"
    */
    @SerializedName("AuthTag")
    @Expose
    private String AuthTag;

    /**
    * 合作企业方第三方机构唯一标识数据，支持多个， 用","进行分隔
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String ProxyOrganizationOpenIds;

    /**
     * Get 应用信息 
     * @return Agent 应用信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用信息
     * @param Agent 应用信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 渠道方模板库模板唯一标识 
     * @return TemplateId 渠道方模板库模板唯一标识
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 渠道方模板库模板唯一标识
     * @param TemplateId 渠道方模板库模板唯一标识
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 操作类型，查询:"SELECT"，删除:"DELETE"，更新:"UPDATE" 
     * @return OperateType 操作类型，查询:"SELECT"，删除:"DELETE"，更新:"UPDATE"
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型，查询:"SELECT"，删除:"DELETE"，更新:"UPDATE"
     * @param OperateType 操作类型，查询:"SELECT"，删除:"DELETE"，更新:"UPDATE"
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 模板可见性, 全部可见-"all", 部分可见-"part" 
     * @return AuthTag 模板可见性, 全部可见-"all", 部分可见-"part"
     */
    public String getAuthTag() {
        return this.AuthTag;
    }

    /**
     * Set 模板可见性, 全部可见-"all", 部分可见-"part"
     * @param AuthTag 模板可见性, 全部可见-"all", 部分可见-"part"
     */
    public void setAuthTag(String AuthTag) {
        this.AuthTag = AuthTag;
    }

    /**
     * Get 合作企业方第三方机构唯一标识数据，支持多个， 用","进行分隔 
     * @return ProxyOrganizationOpenIds 合作企业方第三方机构唯一标识数据，支持多个， 用","进行分隔
     */
    public String getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set 合作企业方第三方机构唯一标识数据，支持多个， 用","进行分隔
     * @param ProxyOrganizationOpenIds 合作企业方第三方机构唯一标识数据，支持多个， 用","进行分隔
     */
    public void setProxyOrganizationOpenIds(String ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    public OperateChannelTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateChannelTemplateRequest(OperateChannelTemplateRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AuthTag != null) {
            this.AuthTag = new String(source.AuthTag);
        }
        if (source.ProxyOrganizationOpenIds != null) {
            this.ProxyOrganizationOpenIds = new String(source.ProxyOrganizationOpenIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "AuthTag", this.AuthTag);
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenIds", this.ProxyOrganizationOpenIds);

    }
}

