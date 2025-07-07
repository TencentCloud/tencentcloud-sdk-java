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

public class HasAuthUser extends AbstractModel {

    /**
    * 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 当前员工的归属情况，可能值是：
MainOrg：在集团企业的场景下，返回此值代表是归属主企业
CurrentOrg：在普通企业场景下返回此值；或者在集团企业的场景下，返回此值代表归属子企业
    */
    @SerializedName("BelongTo")
    @Expose
    private String BelongTo;

    /**
    * 集团主企业id，当前企业为集团子企业时，该字段有值
    */
    @SerializedName("MainOrganizationId")
    @Expose
    private String MainOrganizationId;

    /**
     * Get 员工在腾讯电子签平台的唯一身份标识，为32位字符串。 
     * @return UserId 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
     * @param UserId 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 当前员工的归属情况，可能值是：
MainOrg：在集团企业的场景下，返回此值代表是归属主企业
CurrentOrg：在普通企业场景下返回此值；或者在集团企业的场景下，返回此值代表归属子企业 
     * @return BelongTo 当前员工的归属情况，可能值是：
MainOrg：在集团企业的场景下，返回此值代表是归属主企业
CurrentOrg：在普通企业场景下返回此值；或者在集团企业的场景下，返回此值代表归属子企业
     */
    public String getBelongTo() {
        return this.BelongTo;
    }

    /**
     * Set 当前员工的归属情况，可能值是：
MainOrg：在集团企业的场景下，返回此值代表是归属主企业
CurrentOrg：在普通企业场景下返回此值；或者在集团企业的场景下，返回此值代表归属子企业
     * @param BelongTo 当前员工的归属情况，可能值是：
MainOrg：在集团企业的场景下，返回此值代表是归属主企业
CurrentOrg：在普通企业场景下返回此值；或者在集团企业的场景下，返回此值代表归属子企业
     */
    public void setBelongTo(String BelongTo) {
        this.BelongTo = BelongTo;
    }

    /**
     * Get 集团主企业id，当前企业为集团子企业时，该字段有值 
     * @return MainOrganizationId 集团主企业id，当前企业为集团子企业时，该字段有值
     */
    public String getMainOrganizationId() {
        return this.MainOrganizationId;
    }

    /**
     * Set 集团主企业id，当前企业为集团子企业时，该字段有值
     * @param MainOrganizationId 集团主企业id，当前企业为集团子企业时，该字段有值
     */
    public void setMainOrganizationId(String MainOrganizationId) {
        this.MainOrganizationId = MainOrganizationId;
    }

    public HasAuthUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HasAuthUser(HasAuthUser source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.BelongTo != null) {
            this.BelongTo = new String(source.BelongTo);
        }
        if (source.MainOrganizationId != null) {
            this.MainOrganizationId = new String(source.MainOrganizationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "BelongTo", this.BelongTo);
        this.setParamSimple(map, prefix + "MainOrganizationId", this.MainOrganizationId);

    }
}

