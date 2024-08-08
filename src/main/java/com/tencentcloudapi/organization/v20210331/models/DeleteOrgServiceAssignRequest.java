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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOrgServiceAssignRequest extends AbstractModel {

    /**
    * 集团服务ID。可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * 委派管理员Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
     * Get 集团服务ID。可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取 
     * @return ServiceId 集团服务ID。可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 集团服务ID。可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     * @param ServiceId 集团服务ID。可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 委派管理员Uin。 
     * @return MemberUin 委派管理员Uin。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 委派管理员Uin。
     * @param MemberUin 委派管理员Uin。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    public DeleteOrgServiceAssignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrgServiceAssignRequest(DeleteOrgServiceAssignRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);

    }
}

