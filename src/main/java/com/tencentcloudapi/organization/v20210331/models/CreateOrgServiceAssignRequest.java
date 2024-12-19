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

public class CreateOrgServiceAssignRequest extends AbstractModel {

    /**
    * 委派管理员Uin列表。 最大长度20个
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * 集团服务ID。和集团服务产品标识二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * 集团服务产品标识。和集团服务ID二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 委派管理员管理范围。 取值：1-全部成员 2-部分成员，默认值1
    */
    @SerializedName("ManagementScope")
    @Expose
    private Long ManagementScope;

    /**
    * 管理的成员Uin列表。ManagementScope为2时该参数有效
    */
    @SerializedName("ManagementScopeUins")
    @Expose
    private Long [] ManagementScopeUins;

    /**
    * 管理的部门ID列表。ManagementScope为2时该参数有效
    */
    @SerializedName("ManagementScopeNodeIds")
    @Expose
    private Long [] ManagementScopeNodeIds;

    /**
     * Get 委派管理员Uin列表。 最大长度20个 
     * @return MemberUins 委派管理员Uin列表。 最大长度20个
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set 委派管理员Uin列表。 最大长度20个
     * @param MemberUins 委派管理员Uin列表。 最大长度20个
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get 集团服务ID。和集团服务产品标识二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取 
     * @return ServiceId 集团服务ID。和集团服务产品标识二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 集团服务ID。和集团服务产品标识二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     * @param ServiceId 集团服务ID。和集团服务产品标识二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 集团服务产品标识。和集团服务ID二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取 
     * @return Product 集团服务产品标识。和集团服务ID二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 集团服务产品标识。和集团服务ID二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     * @param Product 集团服务产品标识。和集团服务ID二选一必填，可以通过[ListOrganizationService](https://cloud.tencent.com/document/product/850/109561)获取
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 委派管理员管理范围。 取值：1-全部成员 2-部分成员，默认值1 
     * @return ManagementScope 委派管理员管理范围。 取值：1-全部成员 2-部分成员，默认值1
     */
    public Long getManagementScope() {
        return this.ManagementScope;
    }

    /**
     * Set 委派管理员管理范围。 取值：1-全部成员 2-部分成员，默认值1
     * @param ManagementScope 委派管理员管理范围。 取值：1-全部成员 2-部分成员，默认值1
     */
    public void setManagementScope(Long ManagementScope) {
        this.ManagementScope = ManagementScope;
    }

    /**
     * Get 管理的成员Uin列表。ManagementScope为2时该参数有效 
     * @return ManagementScopeUins 管理的成员Uin列表。ManagementScope为2时该参数有效
     */
    public Long [] getManagementScopeUins() {
        return this.ManagementScopeUins;
    }

    /**
     * Set 管理的成员Uin列表。ManagementScope为2时该参数有效
     * @param ManagementScopeUins 管理的成员Uin列表。ManagementScope为2时该参数有效
     */
    public void setManagementScopeUins(Long [] ManagementScopeUins) {
        this.ManagementScopeUins = ManagementScopeUins;
    }

    /**
     * Get 管理的部门ID列表。ManagementScope为2时该参数有效 
     * @return ManagementScopeNodeIds 管理的部门ID列表。ManagementScope为2时该参数有效
     */
    public Long [] getManagementScopeNodeIds() {
        return this.ManagementScopeNodeIds;
    }

    /**
     * Set 管理的部门ID列表。ManagementScope为2时该参数有效
     * @param ManagementScopeNodeIds 管理的部门ID列表。ManagementScope为2时该参数有效
     */
    public void setManagementScopeNodeIds(Long [] ManagementScopeNodeIds) {
        this.ManagementScopeNodeIds = ManagementScopeNodeIds;
    }

    public CreateOrgServiceAssignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrgServiceAssignRequest(CreateOrgServiceAssignRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ManagementScope != null) {
            this.ManagementScope = new Long(source.ManagementScope);
        }
        if (source.ManagementScopeUins != null) {
            this.ManagementScopeUins = new Long[source.ManagementScopeUins.length];
            for (int i = 0; i < source.ManagementScopeUins.length; i++) {
                this.ManagementScopeUins[i] = new Long(source.ManagementScopeUins[i]);
            }
        }
        if (source.ManagementScopeNodeIds != null) {
            this.ManagementScopeNodeIds = new Long[source.ManagementScopeNodeIds.length];
            for (int i = 0; i < source.ManagementScopeNodeIds.length; i++) {
                this.ManagementScopeNodeIds[i] = new Long(source.ManagementScopeNodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ManagementScope", this.ManagementScope);
        this.setParamArraySimple(map, prefix + "ManagementScopeUins.", this.ManagementScopeUins);
        this.setParamArraySimple(map, prefix + "ManagementScopeNodeIds.", this.ManagementScopeNodeIds);

    }
}

