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

public class Caller extends AbstractModel {

    /**
    * 应用号
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 主机构ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 经办人的用户ID，同UserId
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
    * 下属机构ID
    */
    @SerializedName("SubOrganizationId")
    @Expose
    private String SubOrganizationId;

    /**
     * Get 应用号 
     * @return ApplicationId 应用号
     * @deprecated
     */
    @Deprecated
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用号
     * @param ApplicationId 应用号
     * @deprecated
     */
    @Deprecated
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 主机构ID 
     * @return OrganizationId 主机构ID
     * @deprecated
     */
    @Deprecated
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 主机构ID
     * @param OrganizationId 主机构ID
     * @deprecated
     */
    @Deprecated
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 经办人的用户ID，同UserId 
     * @return OperatorId 经办人的用户ID，同UserId
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 经办人的用户ID，同UserId
     * @param OperatorId 经办人的用户ID，同UserId
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 下属机构ID 
     * @return SubOrganizationId 下属机构ID
     * @deprecated
     */
    @Deprecated
    public String getSubOrganizationId() {
        return this.SubOrganizationId;
    }

    /**
     * Set 下属机构ID
     * @param SubOrganizationId 下属机构ID
     * @deprecated
     */
    @Deprecated
    public void setSubOrganizationId(String SubOrganizationId) {
        this.SubOrganizationId = SubOrganizationId;
    }

    public Caller() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Caller(Caller source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new String(source.OperatorId);
        }
        if (source.SubOrganizationId != null) {
            this.SubOrganizationId = new String(source.SubOrganizationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "SubOrganizationId", this.SubOrganizationId);

    }
}

