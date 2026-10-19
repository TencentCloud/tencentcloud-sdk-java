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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagValueInfo extends AbstractModel {

    /**
    * <p>标签值ID。ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中必填，可通过 ListTags 接口出参 Items[].TagValues[].TagValueId 获取，也可通过 CreateTagValues 创建后获取；按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中无需传入；查询接口出参中回填。ID 不存在或已删除时接口报错 TagValueNotExist</p>
    */
    @SerializedName("TagValueId")
    @Expose
    private String TagValueId;

    /**
    * <p>标签值内容。按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中必填；ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中无需传入，服务端忽略；查询接口出参中回填</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * <p>标签来源，枚举值：0=未指定 1=用户直绑 2=用户组继承 3=两者都有。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>继承来源的用户组名称列表（标签来源 Source=1 用户直绑时为空）。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
    */
    @SerializedName("GroupNames")
    @Expose
    private String [] GroupNames;

    /**
     * Get <p>标签值ID。ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中必填，可通过 ListTags 接口出参 Items[].TagValues[].TagValueId 获取，也可通过 CreateTagValues 创建后获取；按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中无需传入；查询接口出参中回填。ID 不存在或已删除时接口报错 TagValueNotExist</p> 
     * @return TagValueId <p>标签值ID。ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中必填，可通过 ListTags 接口出参 Items[].TagValues[].TagValueId 获取，也可通过 CreateTagValues 创建后获取；按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中无需传入；查询接口出参中回填。ID 不存在或已删除时接口报错 TagValueNotExist</p>
     */
    public String getTagValueId() {
        return this.TagValueId;
    }

    /**
     * Set <p>标签值ID。ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中必填，可通过 ListTags 接口出参 Items[].TagValues[].TagValueId 获取，也可通过 CreateTagValues 创建后获取；按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中无需传入；查询接口出参中回填。ID 不存在或已删除时接口报错 TagValueNotExist</p>
     * @param TagValueId <p>标签值ID。ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中必填，可通过 ListTags 接口出参 Items[].TagValues[].TagValueId 获取，也可通过 CreateTagValues 创建后获取；按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中无需传入；查询接口出参中回填。ID 不存在或已删除时接口报错 TagValueNotExist</p>
     */
    public void setTagValueId(String TagValueId) {
        this.TagValueId = TagValueId;
    }

    /**
     * Get <p>标签值内容。按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中必填；ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中无需传入，服务端忽略；查询接口出参中回填</p> 
     * @return TagValue <p>标签值内容。按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中必填；ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中无需传入，服务端忽略；查询接口出参中回填</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>标签值内容。按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中必填；ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中无需传入，服务端忽略；查询接口出参中回填</p>
     * @param TagValue <p>标签值内容。按名称模式接口（AttachWorkspaceUserTags / DetachWorkspaceUserTags）中必填；ID 模式写接口（UpdateWorkspaceUsersTags / UpdateWorkspaceGroupsTags）中无需传入，服务端忽略；查询接口出参中回填</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get <p>标签来源，枚举值：0=未指定 1=用户直绑 2=用户组继承 3=两者都有。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p> 
     * @return Source <p>标签来源，枚举值：0=未指定 1=用户直绑 2=用户组继承 3=两者都有。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>标签来源，枚举值：0=未指定 1=用户直绑 2=用户组继承 3=两者都有。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
     * @param Source <p>标签来源，枚举值：0=未指定 1=用户直绑 2=用户组继承 3=两者都有。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>继承来源的用户组名称列表（标签来源 Source=1 用户直绑时为空）。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p> 
     * @return GroupNames <p>继承来源的用户组名称列表（标签来源 Source=1 用户直绑时为空）。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
     */
    public String [] getGroupNames() {
        return this.GroupNames;
    }

    /**
     * Set <p>继承来源的用户组名称列表（标签来源 Source=1 用户直绑时为空）。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
     * @param GroupNames <p>继承来源的用户组名称列表（标签来源 Source=1 用户直绑时为空）。仅查询接口出参中返回；所有写接口均无需传入，服务端忽略</p>
     */
    public void setGroupNames(String [] GroupNames) {
        this.GroupNames = GroupNames;
    }

    public TagValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagValueInfo(TagValueInfo source) {
        if (source.TagValueId != null) {
            this.TagValueId = new String(source.TagValueId);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.GroupNames != null) {
            this.GroupNames = new String[source.GroupNames.length];
            for (int i = 0; i < source.GroupNames.length; i++) {
                this.GroupNames[i] = new String(source.GroupNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagValueId", this.TagValueId);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupNames.", this.GroupNames);

    }
}

