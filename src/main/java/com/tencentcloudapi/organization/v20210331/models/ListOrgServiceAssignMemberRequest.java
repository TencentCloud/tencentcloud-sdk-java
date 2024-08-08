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

public class ListOrgServiceAssignMemberRequest extends AbstractModel {

    /**
    * 偏移量。取值是limit的整数倍，默认值 : 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目。取值范围：1~50，默认值：10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 集团服务ID。可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
     * Get 偏移量。取值是limit的整数倍，默认值 : 0 
     * @return Offset 偏移量。取值是limit的整数倍，默认值 : 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。取值是limit的整数倍，默认值 : 0
     * @param Offset 偏移量。取值是limit的整数倍，默认值 : 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目。取值范围：1~50，默认值：10 
     * @return Limit 限制数目。取值范围：1~50，默认值：10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目。取值范围：1~50，默认值：10
     * @param Limit 限制数目。取值范围：1~50，默认值：10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

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

    public ListOrgServiceAssignMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrgServiceAssignMemberRequest(ListOrgServiceAssignMemberRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

