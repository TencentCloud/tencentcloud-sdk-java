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
    * 应用相关信息。 
此接口Agent.AppId必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 操作类型，
查询:"SELECT"，
删除:"DELETE"，
更新:"UPDATE"
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * 第三方应用平台模板库模板唯一标识
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 合作企业方第三方机构唯一标识数据.
支持多个， 用","进行分隔
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String ProxyOrganizationOpenIds;

    /**
    * 模板可见性, 
全部可见-"all",
 部分可见-"part"
    */
    @SerializedName("AuthTag")
    @Expose
    private String AuthTag;

    /**
    * 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
若此字段值为0，则不会修改模板Available，
1为启用模板，
2为停用模板。
启用后模板可以正常领取。停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。如果Available更新失败，会直接返回错误。
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * 暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 应用相关信息。 
此接口Agent.AppId必填。 
     * @return Agent 应用相关信息。 
此接口Agent.AppId必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 
此接口Agent.AppId必填。
     * @param Agent 应用相关信息。 
此接口Agent.AppId必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 操作类型，
查询:"SELECT"，
删除:"DELETE"，
更新:"UPDATE" 
     * @return OperateType 操作类型，
查询:"SELECT"，
删除:"DELETE"，
更新:"UPDATE"
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型，
查询:"SELECT"，
删除:"DELETE"，
更新:"UPDATE"
     * @param OperateType 操作类型，
查询:"SELECT"，
删除:"DELETE"，
更新:"UPDATE"
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get 第三方应用平台模板库模板唯一标识 
     * @return TemplateId 第三方应用平台模板库模板唯一标识
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 第三方应用平台模板库模板唯一标识
     * @param TemplateId 第三方应用平台模板库模板唯一标识
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 合作企业方第三方机构唯一标识数据.
支持多个， 用","进行分隔 
     * @return ProxyOrganizationOpenIds 合作企业方第三方机构唯一标识数据.
支持多个， 用","进行分隔
     */
    public String getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set 合作企业方第三方机构唯一标识数据.
支持多个， 用","进行分隔
     * @param ProxyOrganizationOpenIds 合作企业方第三方机构唯一标识数据.
支持多个， 用","进行分隔
     */
    public void setProxyOrganizationOpenIds(String ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    /**
     * Get 模板可见性, 
全部可见-"all",
 部分可见-"part" 
     * @return AuthTag 模板可见性, 
全部可见-"all",
 部分可见-"part"
     */
    public String getAuthTag() {
        return this.AuthTag;
    }

    /**
     * Set 模板可见性, 
全部可见-"all",
 部分可见-"part"
     * @param AuthTag 模板可见性, 
全部可见-"all",
 部分可见-"part"
     */
    public void setAuthTag(String AuthTag) {
        this.AuthTag = AuthTag;
    }

    /**
     * Get 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
若此字段值为0，则不会修改模板Available，
1为启用模板，
2为停用模板。
启用后模板可以正常领取。停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。如果Available更新失败，会直接返回错误。 
     * @return Available 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
若此字段值为0，则不会修改模板Available，
1为启用模板，
2为停用模板。
启用后模板可以正常领取。停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。如果Available更新失败，会直接返回错误。
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
若此字段值为0，则不会修改模板Available，
1为启用模板，
2为停用模板。
启用后模板可以正常领取。停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。如果Available更新失败，会直接返回错误。
     * @param Available 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
若此字段值为0，则不会修改模板Available，
1为启用模板，
2为停用模板。
启用后模板可以正常领取。停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。如果Available更新失败，会直接返回错误。
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get 暂未开放 
     * @return Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 暂未开放
     * @param Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
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
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ProxyOrganizationOpenIds != null) {
            this.ProxyOrganizationOpenIds = new String(source.ProxyOrganizationOpenIds);
        }
        if (source.AuthTag != null) {
            this.AuthTag = new String(source.AuthTag);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenIds", this.ProxyOrganizationOpenIds);
        this.setParamSimple(map, prefix + "AuthTag", this.AuthTag);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

