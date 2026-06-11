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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HasAuthOrganization extends AbstractModel {

    /**
    * <p>授权企业id</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>授权企业名称</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>被授权企业id</p>
    */
    @SerializedName("AuthorizedOrganizationId")
    @Expose
    private String AuthorizedOrganizationId;

    /**
    * <p>被授权企业名称</p>
    */
    @SerializedName("AuthorizedOrganizationName")
    @Expose
    private String AuthorizedOrganizationName;

    /**
    * <p>授权模板id（仅当授权方式为模板授权时有值）</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>授权模板名称（仅当授权方式为模板授权时有值）</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>授权时间，格式为时间戳，单位s</p>
    */
    @SerializedName("AuthorizeTime")
    @Expose
    private Long AuthorizeTime;

    /**
     * Get <p>授权企业id</p> 
     * @return OrganizationId <p>授权企业id</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>授权企业id</p>
     * @param OrganizationId <p>授权企业id</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>授权企业名称</p> 
     * @return OrganizationName <p>授权企业名称</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>授权企业名称</p>
     * @param OrganizationName <p>授权企业名称</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>被授权企业id</p> 
     * @return AuthorizedOrganizationId <p>被授权企业id</p>
     */
    public String getAuthorizedOrganizationId() {
        return this.AuthorizedOrganizationId;
    }

    /**
     * Set <p>被授权企业id</p>
     * @param AuthorizedOrganizationId <p>被授权企业id</p>
     */
    public void setAuthorizedOrganizationId(String AuthorizedOrganizationId) {
        this.AuthorizedOrganizationId = AuthorizedOrganizationId;
    }

    /**
     * Get <p>被授权企业名称</p> 
     * @return AuthorizedOrganizationName <p>被授权企业名称</p>
     */
    public String getAuthorizedOrganizationName() {
        return this.AuthorizedOrganizationName;
    }

    /**
     * Set <p>被授权企业名称</p>
     * @param AuthorizedOrganizationName <p>被授权企业名称</p>
     */
    public void setAuthorizedOrganizationName(String AuthorizedOrganizationName) {
        this.AuthorizedOrganizationName = AuthorizedOrganizationName;
    }

    /**
     * Get <p>授权模板id（仅当授权方式为模板授权时有值）</p> 
     * @return TemplateId <p>授权模板id（仅当授权方式为模板授权时有值）</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>授权模板id（仅当授权方式为模板授权时有值）</p>
     * @param TemplateId <p>授权模板id（仅当授权方式为模板授权时有值）</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>授权模板名称（仅当授权方式为模板授权时有值）</p> 
     * @return TemplateName <p>授权模板名称（仅当授权方式为模板授权时有值）</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>授权模板名称（仅当授权方式为模板授权时有值）</p>
     * @param TemplateName <p>授权模板名称（仅当授权方式为模板授权时有值）</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>授权时间，格式为时间戳，单位s</p> 
     * @return AuthorizeTime <p>授权时间，格式为时间戳，单位s</p>
     */
    public Long getAuthorizeTime() {
        return this.AuthorizeTime;
    }

    /**
     * Set <p>授权时间，格式为时间戳，单位s</p>
     * @param AuthorizeTime <p>授权时间，格式为时间戳，单位s</p>
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

