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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HasAuthOrganization extends AbstractModel {

    /**
    * 授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 被授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizedOrganizationOpenId")
    @Expose
    private String AuthorizedOrganizationOpenId;

    /**
    * 被授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizedOrganizationName")
    @Expose
    private String AuthorizedOrganizationName;

    /**
    * 授权时间，格式为时间戳，单位s	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizeTime")
    @Expose
    private Long AuthorizeTime;

    /**
     * Get 授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationOpenId 授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationOpenId 授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationName 授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationName 授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 被授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizedOrganizationOpenId 被授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthorizedOrganizationOpenId() {
        return this.AuthorizedOrganizationOpenId;
    }

    /**
     * Set 被授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizedOrganizationOpenId 被授权企业openid，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizedOrganizationOpenId(String AuthorizedOrganizationOpenId) {
        this.AuthorizedOrganizationOpenId = AuthorizedOrganizationOpenId;
    }

    /**
     * Get 被授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizedOrganizationName 被授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthorizedOrganizationName() {
        return this.AuthorizedOrganizationName;
    }

    /**
     * Set 被授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizedOrganizationName 被授权企业名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizedOrganizationName(String AuthorizedOrganizationName) {
        this.AuthorizedOrganizationName = AuthorizedOrganizationName;
    }

    /**
     * Get 授权时间，格式为时间戳，单位s	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizeTime 授权时间，格式为时间戳，单位s	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthorizeTime() {
        return this.AuthorizeTime;
    }

    /**
     * Set 授权时间，格式为时间戳，单位s	
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizeTime 授权时间，格式为时间戳，单位s	
注意：此字段可能返回 null，表示取不到有效值。
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
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.AuthorizedOrganizationOpenId != null) {
            this.AuthorizedOrganizationOpenId = new String(source.AuthorizedOrganizationOpenId);
        }
        if (source.AuthorizedOrganizationName != null) {
            this.AuthorizedOrganizationName = new String(source.AuthorizedOrganizationName);
        }
        if (source.AuthorizeTime != null) {
            this.AuthorizeTime = new Long(source.AuthorizeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationOpenId", this.AuthorizedOrganizationOpenId);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationName", this.AuthorizedOrganizationName);
        this.setParamSimple(map, prefix + "AuthorizeTime", this.AuthorizeTime);

    }
}

