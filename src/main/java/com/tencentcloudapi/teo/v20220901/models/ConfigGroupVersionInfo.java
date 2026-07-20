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

public class ConfigGroupVersionInfo extends AbstractModel {

    /**
    * <p>配置组版本 ID，创建配置组版本时 EdgeOne 分配的唯一资源 ID。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>配置组版本号。该参数仅作展示使用，配置组每创建一次新版本，该版本号自增加一，初始版本的版本号为 &quot;0&quot;。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * <p>配置组版本所基于的来源版本 ID，在创建配置组版本时进行指定来源版本 ID，新版本将在该来源版本的配置基础上派生创建。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
    * <p>版本归属的配置组类型。</p><p>枚举值：</p><ul><li>l7_acceleration： 七层加速配置组</li><li>edge_functions： 边缘函数配置组</li><li>web_security： Web 防护配置组</li></ul>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>版本归属的配置组 ID。</p><p>参数格式：cg-2kplomhisdcb</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>版本描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>版本生效状态。</p><p>枚举值：</p><ul><li>creating： 版本创建中</li><li>inactive： 版本未生效</li><li>active： 版本已生效</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>配置组版本 ID，创建配置组版本时 EdgeOne 分配的唯一资源 ID。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul> 
     * @return VersionId <p>配置组版本 ID，创建配置组版本时 EdgeOne 分配的唯一资源 ID。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>配置组版本 ID，创建配置组版本时 EdgeOne 分配的唯一资源 ID。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     * @param VersionId <p>配置组版本 ID，创建配置组版本时 EdgeOne 分配的唯一资源 ID。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>配置组版本号。该参数仅作展示使用，配置组每创建一次新版本，该版本号自增加一，初始版本的版本号为 &quot;0&quot;。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></p> 
     * @return VersionNumber <p>配置组版本号。该参数仅作展示使用，配置组每创建一次新版本，该版本号自增加一，初始版本的版本号为 &quot;0&quot;。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></p>
     */
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>配置组版本号。该参数仅作展示使用，配置组每创建一次新版本，该版本号自增加一，初始版本的版本号为 &quot;0&quot;。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></p>
     * @param VersionNumber <p>配置组版本号。该参数仅作展示使用，配置组每创建一次新版本，该版本号自增加一，初始版本的版本号为 &quot;0&quot;。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></p>
     */
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>配置组版本所基于的来源版本 ID，在创建配置组版本时进行指定来源版本 ID，新版本将在该来源版本的配置基础上派生创建。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul> 
     * @return SourceVersion <p>配置组版本所基于的来源版本 ID，在创建配置组版本时进行指定来源版本 ID，新版本将在该来源版本的配置基础上派生创建。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set <p>配置组版本所基于的来源版本 ID，在创建配置组版本时进行指定来源版本 ID，新版本将在该来源版本的配置基础上派生创建。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     * @param SourceVersion <p>配置组版本所基于的来源版本 ID，在创建配置组版本时进行指定来源版本 ID，新版本将在该来源版本的配置基础上派生创建。</p><p>参数格式：ver-2kplomhisdcb</p><p>取值参考：</p><ul><li><a href="https://cloud.tencent.com/document/api/1552/101867">CreateConfigGroupVersion</a> 返回值 <code>VersionId</code></li><li><a href="https://cloud.tencent.com/document/api/1552/101864">DescribeConfigGroupVersions</a> 返回值 <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    /**
     * Get <p>版本归属的配置组类型。</p><p>枚举值：</p><ul><li>l7_acceleration： 七层加速配置组</li><li>edge_functions： 边缘函数配置组</li><li>web_security： Web 防护配置组</li></ul> 
     * @return GroupType <p>版本归属的配置组类型。</p><p>枚举值：</p><ul><li>l7_acceleration： 七层加速配置组</li><li>edge_functions： 边缘函数配置组</li><li>web_security： Web 防护配置组</li></ul>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>版本归属的配置组类型。</p><p>枚举值：</p><ul><li>l7_acceleration： 七层加速配置组</li><li>edge_functions： 边缘函数配置组</li><li>web_security： Web 防护配置组</li></ul>
     * @param GroupType <p>版本归属的配置组类型。</p><p>枚举值：</p><ul><li>l7_acceleration： 七层加速配置组</li><li>edge_functions： 边缘函数配置组</li><li>web_security： Web 防护配置组</li></ul>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>版本归属的配置组 ID。</p><p>参数格式：cg-2kplomhisdcb</p> 
     * @return GroupId <p>版本归属的配置组 ID。</p><p>参数格式：cg-2kplomhisdcb</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>版本归属的配置组 ID。</p><p>参数格式：cg-2kplomhisdcb</p>
     * @param GroupId <p>版本归属的配置组 ID。</p><p>参数格式：cg-2kplomhisdcb</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>版本描述。</p> 
     * @return Description <p>版本描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>版本描述。</p>
     * @param Description <p>版本描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>版本生效状态。</p><p>枚举值：</p><ul><li>creating： 版本创建中</li><li>inactive： 版本未生效</li><li>active： 版本已生效</li></ul> 
     * @return Status <p>版本生效状态。</p><p>枚举值：</p><ul><li>creating： 版本创建中</li><li>inactive： 版本未生效</li><li>active： 版本已生效</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>版本生效状态。</p><p>枚举值：</p><ul><li>creating： 版本创建中</li><li>inactive： 版本未生效</li><li>active： 版本已生效</li></ul>
     * @param Status <p>版本生效状态。</p><p>枚举值：</p><ul><li>creating： 版本创建中</li><li>inactive： 版本未生效</li><li>active： 版本已生效</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p> 
     * @return CreateTime <p>版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     * @param CreateTime <p>版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ConfigGroupVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupVersionInfo(ConfigGroupVersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.SourceVersion != null) {
            this.SourceVersion = new String(source.SourceVersion);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "SourceVersion", this.SourceVersion);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

