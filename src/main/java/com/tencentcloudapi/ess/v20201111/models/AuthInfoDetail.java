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

public class AuthInfoDetail extends AbstractModel {

    /**
    * <p>扩展服务类型，和入参一致</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>扩展服务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>授权员工列表</p>
    */
    @SerializedName("HasAuthUserList")
    @Expose
    private HasAuthUser [] HasAuthUserList;

    /**
    * <p>授权企业列表（企业自动签时，该字段有值）</p>
    */
    @SerializedName("HasAuthOrganizationList")
    @Expose
    private HasAuthOrganization [] HasAuthOrganizationList;

    /**
    * <p>授权员工列表总数</p>
    */
    @SerializedName("AuthUserTotal")
    @Expose
    private Long AuthUserTotal;

    /**
    * <p>授权企业列表总数</p>
    */
    @SerializedName("AuthOrganizationTotal")
    @Expose
    private Long AuthOrganizationTotal;

    /**
     * Get <p>扩展服务类型，和入参一致</p> 
     * @return Type <p>扩展服务类型，和入参一致</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>扩展服务类型，和入参一致</p>
     * @param Type <p>扩展服务类型，和入参一致</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>扩展服务名称</p> 
     * @return Name <p>扩展服务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>扩展服务名称</p>
     * @param Name <p>扩展服务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>授权员工列表</p> 
     * @return HasAuthUserList <p>授权员工列表</p>
     */
    public HasAuthUser [] getHasAuthUserList() {
        return this.HasAuthUserList;
    }

    /**
     * Set <p>授权员工列表</p>
     * @param HasAuthUserList <p>授权员工列表</p>
     */
    public void setHasAuthUserList(HasAuthUser [] HasAuthUserList) {
        this.HasAuthUserList = HasAuthUserList;
    }

    /**
     * Get <p>授权企业列表（企业自动签时，该字段有值）</p> 
     * @return HasAuthOrganizationList <p>授权企业列表（企业自动签时，该字段有值）</p>
     */
    public HasAuthOrganization [] getHasAuthOrganizationList() {
        return this.HasAuthOrganizationList;
    }

    /**
     * Set <p>授权企业列表（企业自动签时，该字段有值）</p>
     * @param HasAuthOrganizationList <p>授权企业列表（企业自动签时，该字段有值）</p>
     */
    public void setHasAuthOrganizationList(HasAuthOrganization [] HasAuthOrganizationList) {
        this.HasAuthOrganizationList = HasAuthOrganizationList;
    }

    /**
     * Get <p>授权员工列表总数</p> 
     * @return AuthUserTotal <p>授权员工列表总数</p>
     */
    public Long getAuthUserTotal() {
        return this.AuthUserTotal;
    }

    /**
     * Set <p>授权员工列表总数</p>
     * @param AuthUserTotal <p>授权员工列表总数</p>
     */
    public void setAuthUserTotal(Long AuthUserTotal) {
        this.AuthUserTotal = AuthUserTotal;
    }

    /**
     * Get <p>授权企业列表总数</p> 
     * @return AuthOrganizationTotal <p>授权企业列表总数</p>
     */
    public Long getAuthOrganizationTotal() {
        return this.AuthOrganizationTotal;
    }

    /**
     * Set <p>授权企业列表总数</p>
     * @param AuthOrganizationTotal <p>授权企业列表总数</p>
     */
    public void setAuthOrganizationTotal(Long AuthOrganizationTotal) {
        this.AuthOrganizationTotal = AuthOrganizationTotal;
    }

    public AuthInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthInfoDetail(AuthInfoDetail source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.HasAuthUserList != null) {
            this.HasAuthUserList = new HasAuthUser[source.HasAuthUserList.length];
            for (int i = 0; i < source.HasAuthUserList.length; i++) {
                this.HasAuthUserList[i] = new HasAuthUser(source.HasAuthUserList[i]);
            }
        }
        if (source.HasAuthOrganizationList != null) {
            this.HasAuthOrganizationList = new HasAuthOrganization[source.HasAuthOrganizationList.length];
            for (int i = 0; i < source.HasAuthOrganizationList.length; i++) {
                this.HasAuthOrganizationList[i] = new HasAuthOrganization(source.HasAuthOrganizationList[i]);
            }
        }
        if (source.AuthUserTotal != null) {
            this.AuthUserTotal = new Long(source.AuthUserTotal);
        }
        if (source.AuthOrganizationTotal != null) {
            this.AuthOrganizationTotal = new Long(source.AuthOrganizationTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "HasAuthUserList.", this.HasAuthUserList);
        this.setParamArrayObj(map, prefix + "HasAuthOrganizationList.", this.HasAuthOrganizationList);
        this.setParamSimple(map, prefix + "AuthUserTotal", this.AuthUserTotal);
        this.setParamSimple(map, prefix + "AuthOrganizationTotal", this.AuthOrganizationTotal);

    }
}

