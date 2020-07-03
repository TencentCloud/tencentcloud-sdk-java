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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateLimit extends AbstractModel{

    /**
    * 参数模板IP地址成员配额。
    */
    @SerializedName("AddressTemplateMemberLimit")
    @Expose
    private Long AddressTemplateMemberLimit;

    /**
    * 参数模板IP地址组成员配额。
    */
    @SerializedName("AddressTemplateGroupMemberLimit")
    @Expose
    private Long AddressTemplateGroupMemberLimit;

    /**
    * 参数模板I协议端口成员配额。
    */
    @SerializedName("ServiceTemplateMemberLimit")
    @Expose
    private Long ServiceTemplateMemberLimit;

    /**
    * 参数模板协议端口组成员配额。
    */
    @SerializedName("ServiceTemplateGroupMemberLimit")
    @Expose
    private Long ServiceTemplateGroupMemberLimit;

    /**
     * Get 参数模板IP地址成员配额。 
     * @return AddressTemplateMemberLimit 参数模板IP地址成员配额。
     */
    public Long getAddressTemplateMemberLimit() {
        return this.AddressTemplateMemberLimit;
    }

    /**
     * Set 参数模板IP地址成员配额。
     * @param AddressTemplateMemberLimit 参数模板IP地址成员配额。
     */
    public void setAddressTemplateMemberLimit(Long AddressTemplateMemberLimit) {
        this.AddressTemplateMemberLimit = AddressTemplateMemberLimit;
    }

    /**
     * Get 参数模板IP地址组成员配额。 
     * @return AddressTemplateGroupMemberLimit 参数模板IP地址组成员配额。
     */
    public Long getAddressTemplateGroupMemberLimit() {
        return this.AddressTemplateGroupMemberLimit;
    }

    /**
     * Set 参数模板IP地址组成员配额。
     * @param AddressTemplateGroupMemberLimit 参数模板IP地址组成员配额。
     */
    public void setAddressTemplateGroupMemberLimit(Long AddressTemplateGroupMemberLimit) {
        this.AddressTemplateGroupMemberLimit = AddressTemplateGroupMemberLimit;
    }

    /**
     * Get 参数模板I协议端口成员配额。 
     * @return ServiceTemplateMemberLimit 参数模板I协议端口成员配额。
     */
    public Long getServiceTemplateMemberLimit() {
        return this.ServiceTemplateMemberLimit;
    }

    /**
     * Set 参数模板I协议端口成员配额。
     * @param ServiceTemplateMemberLimit 参数模板I协议端口成员配额。
     */
    public void setServiceTemplateMemberLimit(Long ServiceTemplateMemberLimit) {
        this.ServiceTemplateMemberLimit = ServiceTemplateMemberLimit;
    }

    /**
     * Get 参数模板协议端口组成员配额。 
     * @return ServiceTemplateGroupMemberLimit 参数模板协议端口组成员配额。
     */
    public Long getServiceTemplateGroupMemberLimit() {
        return this.ServiceTemplateGroupMemberLimit;
    }

    /**
     * Set 参数模板协议端口组成员配额。
     * @param ServiceTemplateGroupMemberLimit 参数模板协议端口组成员配额。
     */
    public void setServiceTemplateGroupMemberLimit(Long ServiceTemplateGroupMemberLimit) {
        this.ServiceTemplateGroupMemberLimit = ServiceTemplateGroupMemberLimit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateMemberLimit", this.AddressTemplateMemberLimit);
        this.setParamSimple(map, prefix + "AddressTemplateGroupMemberLimit", this.AddressTemplateGroupMemberLimit);
        this.setParamSimple(map, prefix + "ServiceTemplateMemberLimit", this.ServiceTemplateMemberLimit);
        this.setParamSimple(map, prefix + "ServiceTemplateGroupMemberLimit", this.ServiceTemplateGroupMemberLimit);

    }
}

