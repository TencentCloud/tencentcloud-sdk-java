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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressTemplateGroupRequest extends AbstractModel {

    /**
    * IP地址模板集合名称。
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;

    /**
    * IP地址模板实例ID，例如：ipm-mdunqeb6。
    */
    @SerializedName("AddressTemplateIds")
    @Expose
    private String [] AddressTemplateIds;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get IP地址模板集合名称。 
     * @return AddressTemplateGroupName IP地址模板集合名称。
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * Set IP地址模板集合名称。
     * @param AddressTemplateGroupName IP地址模板集合名称。
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * Get IP地址模板实例ID，例如：ipm-mdunqeb6。 
     * @return AddressTemplateIds IP地址模板实例ID，例如：ipm-mdunqeb6。
     */
    public String [] getAddressTemplateIds() {
        return this.AddressTemplateIds;
    }

    /**
     * Set IP地址模板实例ID，例如：ipm-mdunqeb6。
     * @param AddressTemplateIds IP地址模板实例ID，例如：ipm-mdunqeb6。
     */
    public void setAddressTemplateIds(String [] AddressTemplateIds) {
        this.AddressTemplateIds = AddressTemplateIds;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateAddressTemplateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAddressTemplateGroupRequest(CreateAddressTemplateGroupRequest source) {
        if (source.AddressTemplateGroupName != null) {
            this.AddressTemplateGroupName = new String(source.AddressTemplateGroupName);
        }
        if (source.AddressTemplateIds != null) {
            this.AddressTemplateIds = new String[source.AddressTemplateIds.length];
            for (int i = 0; i < source.AddressTemplateIds.length; i++) {
                this.AddressTemplateIds[i] = new String(source.AddressTemplateIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamArraySimple(map, prefix + "AddressTemplateIds.", this.AddressTemplateIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

