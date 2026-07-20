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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConfigGroupVersionRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>待新建版本的配置组 ID。您可以通过查询环境信息接口（DescribeEnvironments）获取完整的环境信息，环境信息中包含了每个配置组类型的配置组 ID。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101862">DescribeEnvironments</a> 返回值 <code>EnvInfos</code></p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例和 <a href="https://cloud.tencent.com/document/product/1552/125342">配置组语法说明</a>。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>新版本所基于的来源版本 ID。新版本将在该来源版本的配置基础上派生创建。该字段可选，未传入时默认采用当前生产环境正在生效的版本作为来源版本。</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>待新建版本的配置组 ID。您可以通过查询环境信息接口（DescribeEnvironments）获取完整的环境信息，环境信息中包含了每个配置组类型的配置组 ID。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101862">DescribeEnvironments</a> 返回值 <code>EnvInfos</code></p> 
     * @return GroupId <p>待新建版本的配置组 ID。您可以通过查询环境信息接口（DescribeEnvironments）获取完整的环境信息，环境信息中包含了每个配置组类型的配置组 ID。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101862">DescribeEnvironments</a> 返回值 <code>EnvInfos</code></p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>待新建版本的配置组 ID。您可以通过查询环境信息接口（DescribeEnvironments）获取完整的环境信息，环境信息中包含了每个配置组类型的配置组 ID。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101862">DescribeEnvironments</a> 返回值 <code>EnvInfos</code></p>
     * @param GroupId <p>待新建版本的配置组 ID。您可以通过查询环境信息接口（DescribeEnvironments）获取完整的环境信息，环境信息中包含了每个配置组类型的配置组 ID。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101862">DescribeEnvironments</a> 返回值 <code>EnvInfos</code></p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例和 <a href="https://cloud.tencent.com/document/product/1552/125342">配置组语法说明</a>。</p> 
     * @return Content <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例和 <a href="https://cloud.tencent.com/document/product/1552/125342">配置组语法说明</a>。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例和 <a href="https://cloud.tencent.com/document/product/1552/125342">配置组语法说明</a>。</p>
     * @param Content <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例和 <a href="https://cloud.tencent.com/document/product/1552/125342">配置组语法说明</a>。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。</p> 
     * @return Description <p>版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。</p>
     * @param Description <p>版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>新版本所基于的来源版本 ID。新版本将在该来源版本的配置基础上派生创建。该字段可选，未传入时默认采用当前生产环境正在生效的版本作为来源版本。</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul> 
     * @return SourceVersion <p>新版本所基于的来源版本 ID。新版本将在该来源版本的配置基础上派生创建。该字段可选，未传入时默认采用当前生产环境正在生效的版本作为来源版本。</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set <p>新版本所基于的来源版本 ID。新版本将在该来源版本的配置基础上派生创建。该字段可选，未传入时默认采用当前生产环境正在生效的版本作为来源版本。</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     * @param SourceVersion <p>新版本所基于的来源版本 ID。新版本将在该来源版本的配置基础上派生创建。该字段可选，未传入时默认采用当前生产环境正在生效的版本作为来源版本。</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    public CreateConfigGroupVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigGroupVersionRequest(CreateConfigGroupVersionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceVersion != null) {
            this.SourceVersion = new String(source.SourceVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceVersion", this.SourceVersion);

    }
}

