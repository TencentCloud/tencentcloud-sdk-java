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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceLinkedRoleRequest extends AbstractModel {

    /**
    * 填写此角色的腾讯云服务载体，具体可查询文档（角色载体）字段
https://cloud.tencent.com/document/product/598/85165
    */
    @SerializedName("QCSServiceName")
    @Expose
    private String [] QCSServiceName;

    /**
    * 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
    */
    @SerializedName("CustomSuffix")
    @Expose
    private String CustomSuffix;

    /**
    * 角色说明。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 角色绑定标签。
    */
    @SerializedName("Tags")
    @Expose
    private RoleTags [] Tags;

    /**
     * Get 填写此角色的腾讯云服务载体，具体可查询文档（角色载体）字段
https://cloud.tencent.com/document/product/598/85165 
     * @return QCSServiceName 填写此角色的腾讯云服务载体，具体可查询文档（角色载体）字段
https://cloud.tencent.com/document/product/598/85165
     */
    public String [] getQCSServiceName() {
        return this.QCSServiceName;
    }

    /**
     * Set 填写此角色的腾讯云服务载体，具体可查询文档（角色载体）字段
https://cloud.tencent.com/document/product/598/85165
     * @param QCSServiceName 填写此角色的腾讯云服务载体，具体可查询文档（角色载体）字段
https://cloud.tencent.com/document/product/598/85165
     */
    public void setQCSServiceName(String [] QCSServiceName) {
        this.QCSServiceName = QCSServiceName;
    }

    /**
     * Get 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。 
     * @return CustomSuffix 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
     */
    public String getCustomSuffix() {
        return this.CustomSuffix;
    }

    /**
     * Set 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
     * @param CustomSuffix 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
     */
    public void setCustomSuffix(String CustomSuffix) {
        this.CustomSuffix = CustomSuffix;
    }

    /**
     * Get 角色说明。 
     * @return Description 角色说明。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 角色说明。
     * @param Description 角色说明。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 角色绑定标签。 
     * @return Tags 角色绑定标签。
     */
    public RoleTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 角色绑定标签。
     * @param Tags 角色绑定标签。
     */
    public void setTags(RoleTags [] Tags) {
        this.Tags = Tags;
    }

    public CreateServiceLinkedRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceLinkedRoleRequest(CreateServiceLinkedRoleRequest source) {
        if (source.QCSServiceName != null) {
            this.QCSServiceName = new String[source.QCSServiceName.length];
            for (int i = 0; i < source.QCSServiceName.length; i++) {
                this.QCSServiceName[i] = new String(source.QCSServiceName[i]);
            }
        }
        if (source.CustomSuffix != null) {
            this.CustomSuffix = new String(source.CustomSuffix);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new RoleTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RoleTags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "QCSServiceName.", this.QCSServiceName);
        this.setParamSimple(map, prefix + "CustomSuffix", this.CustomSuffix);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

