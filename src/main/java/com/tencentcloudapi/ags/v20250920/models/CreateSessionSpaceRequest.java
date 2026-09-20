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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSessionSpaceRequest extends AbstractModel {

    /**
    * <p>会话空间名称，用于标识会话空间的业务用途。</p><p>入参限制：必填；去除首尾空白后不能为空；最大长度为 128 个字符。</p><p>建议名称包含业务和环境信息，便于识别和管理。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>会话空间描述，用于补充说明会话空间的业务用途。</p><p>入参限制：选填；最大长度为 512 个字符。</p><p>未传入时创建为空描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建 SessionSpace 时为资源绑定标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>会话空间名称，用于标识会话空间的业务用途。</p><p>入参限制：必填；去除首尾空白后不能为空；最大长度为 128 个字符。</p><p>建议名称包含业务和环境信息，便于识别和管理。</p> 
     * @return Name <p>会话空间名称，用于标识会话空间的业务用途。</p><p>入参限制：必填；去除首尾空白后不能为空；最大长度为 128 个字符。</p><p>建议名称包含业务和环境信息，便于识别和管理。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>会话空间名称，用于标识会话空间的业务用途。</p><p>入参限制：必填；去除首尾空白后不能为空；最大长度为 128 个字符。</p><p>建议名称包含业务和环境信息，便于识别和管理。</p>
     * @param Name <p>会话空间名称，用于标识会话空间的业务用途。</p><p>入参限制：必填；去除首尾空白后不能为空；最大长度为 128 个字符。</p><p>建议名称包含业务和环境信息，便于识别和管理。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>会话空间描述，用于补充说明会话空间的业务用途。</p><p>入参限制：选填；最大长度为 512 个字符。</p><p>未传入时创建为空描述。</p> 
     * @return Description <p>会话空间描述，用于补充说明会话空间的业务用途。</p><p>入参限制：选填；最大长度为 512 个字符。</p><p>未传入时创建为空描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>会话空间描述，用于补充说明会话空间的业务用途。</p><p>入参限制：选填；最大长度为 512 个字符。</p><p>未传入时创建为空描述。</p>
     * @param Description <p>会话空间描述，用于补充说明会话空间的业务用途。</p><p>入参限制：选填；最大长度为 512 个字符。</p><p>未传入时创建为空描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建 SessionSpace 时为资源绑定标签。</p> 
     * @return Tags <p>创建 SessionSpace 时为资源绑定标签。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>创建 SessionSpace 时为资源绑定标签。</p>
     * @param Tags <p>创建 SessionSpace 时为资源绑定标签。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSessionSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSessionSpaceRequest(CreateSessionSpaceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

