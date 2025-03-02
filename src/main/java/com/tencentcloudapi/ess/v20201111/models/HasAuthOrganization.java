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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HasAuthOrganization extends AbstractModel {

    /**
    * 授权企业id
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 授权企业名称
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 被授权企业id
    */
    @SerializedName("AuthorizedOrganizationId")
    @Expose
    private String AuthorizedOrganizationId;

    /**
    * 被授权企业名称
    */
    @SerializedName("AuthorizedOrganizationName")
    @Expose
    private String AuthorizedOrganizationName;

    /**
    * 授权模板id（仅当授权方式为模板授权时有值）
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 授权模板名称（仅当授权方式为模板授权时有值）
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 授权时间，格式为时间戳，单位s
    */
    @SerializedName("AuthorizeTime")
    @Expose
    private Long AuthorizeTime;

    /**
     * Get 授权企业id 
     * @return OrganizationId 授权企业id
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 授权企业id
     * @param OrganizationId 授权企业id
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 授权企业名称 
     * @return OrganizationName 授权企业名称
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 授权企业名称
     * @param OrganizationName 授权企业名称
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 被授权企业id 
     * @return AuthorizedOrganizationId 被授权企业id
     */
    public String getAuthorizedOrganizationId() {
        return this.AuthorizedOrganizationId;
    }

    /**
     * Set 被授权企业id
     * @param AuthorizedOrganizationId 被授权企业id
     */
    public void setAuthorizedOrganizationId(String AuthorizedOrganizationId) {
        this.AuthorizedOrganizationId = AuthorizedOrganizationId;
    }

    /**
     * Get 被授权企业名称 
     * @return AuthorizedOrganizationName 被授权企业名称
     */
    public String getAuthorizedOrganizationName() {
        return this.AuthorizedOrganizationName;
    }

    /**
     * Set 被授权企业名称
     * @param AuthorizedOrganizationName 被授权企业名称
     */
    public void setAuthorizedOrganizationName(String AuthorizedOrganizationName) {
        this.AuthorizedOrganizationName = AuthorizedOrganizationName;
    }

    /**
     * Get 授权模板id（仅当授权方式为模板授权时有值） 
     * @return TemplateId 授权模板id（仅当授权方式为模板授权时有值）
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 授权模板id（仅当授权方式为模板授权时有值）
     * @param TemplateId 授权模板id（仅当授权方式为模板授权时有值）
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 授权模板名称（仅当授权方式为模板授权时有值） 
     * @return TemplateName 授权模板名称（仅当授权方式为模板授权时有值）
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 授权模板名称（仅当授权方式为模板授权时有值）
     * @param TemplateName 授权模板名称（仅当授权方式为模板授权时有值）
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 授权时间，格式为时间戳，单位s 
     * @return AuthorizeTime 授权时间，格式为时间戳，单位s
     */
    public Long getAuthorizeTime() {
        return this.AuthorizeTime;
    }

    /**
     * Set 授权时间，格式为时间戳，单位s
     * @param AuthorizeTime 授权时间，格式为时间戳，单位s
     */
    public void setAuthorizeTime(Long AuthorizeTime) {
        this.AuthorizeTime = AuthorizeTime;
    }

    public HasAuthOrganization() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HasAuthOrganization(HasAuthOrganization source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.AuthorizedOrganizationId != null) {
            this.AuthorizedOrganizationId = new String(source.AuthorizedOrganizationId);
        }
        if (source.AuthorizedOrganizationName != null) {
            this.AuthorizedOrganizationName = new String(source.AuthorizedOrganizationName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.AuthorizeTime != null) {
            this.AuthorizeTime = new Long(source.AuthorizeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationId", this.AuthorizedOrganizationId);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationName", this.AuthorizedOrganizationName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "AuthorizeTime", this.AuthorizeTime);

    }
}

