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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationMemberAuthIdentityRequest extends AbstractModel{

    /**
    * 成员uin列表。最多10个
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * 身份Id列表。最多5个
    */
    @SerializedName("IdentityIds")
    @Expose
    private Long [] IdentityIds;

    /**
     * Get 成员uin列表。最多10个 
     * @return MemberUins 成员uin列表。最多10个
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set 成员uin列表。最多10个
     * @param MemberUins 成员uin列表。最多10个
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get 身份Id列表。最多5个 
     * @return IdentityIds 身份Id列表。最多5个
     */
    public Long [] getIdentityIds() {
        return this.IdentityIds;
    }

    /**
     * Set 身份Id列表。最多5个
     * @param IdentityIds 身份Id列表。最多5个
     */
    public void setIdentityIds(Long [] IdentityIds) {
        this.IdentityIds = IdentityIds;
    }

    public CreateOrganizationMemberAuthIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationMemberAuthIdentityRequest(CreateOrganizationMemberAuthIdentityRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.IdentityIds != null) {
            this.IdentityIds = new Long[source.IdentityIds.length];
            for (int i = 0; i < source.IdentityIds.length; i++) {
                this.IdentityIds[i] = new Long(source.IdentityIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamArraySimple(map, prefix + "IdentityIds.", this.IdentityIds);

    }
}

