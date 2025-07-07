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
    * 版本 ID。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 版本号。
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * 配置组 ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 配置组类型。取值有：
<li>l7_acceleration ：七层加速配置组。</li>
<li>edge_functions ：边缘函数配置组。</li>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 版本描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 版本状态，取值有：
<li>creating：创建中；</li>
<li>inactive：未生效；</li>
<li>active：已生效。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 版本 ID。 
     * @return VersionId 版本 ID。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本 ID。
     * @param VersionId 版本 ID。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 版本号。 
     * @return VersionNumber 版本号。
     */
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set 版本号。
     * @param VersionNumber 版本号。
     */
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get 配置组 ID。 
     * @return GroupId 配置组 ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 配置组 ID。
     * @param GroupId 配置组 ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 配置组类型。取值有：
<li>l7_acceleration ：七层加速配置组。</li>
<li>edge_functions ：边缘函数配置组。</li> 
     * @return GroupType 配置组类型。取值有：
<li>l7_acceleration ：七层加速配置组。</li>
<li>edge_functions ：边缘函数配置组。</li>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 配置组类型。取值有：
<li>l7_acceleration ：七层加速配置组。</li>
<li>edge_functions ：边缘函数配置组。</li>
     * @param GroupType 配置组类型。取值有：
<li>l7_acceleration ：七层加速配置组。</li>
<li>edge_functions ：边缘函数配置组。</li>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 版本描述。 
     * @return Description 版本描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述。
     * @param Description 版本描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 版本状态，取值有：
<li>creating：创建中；</li>
<li>inactive：未生效；</li>
<li>active：已生效。</li> 
     * @return Status 版本状态，取值有：
<li>creating：创建中；</li>
<li>inactive：未生效；</li>
<li>active：已生效。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态，取值有：
<li>creating：创建中；</li>
<li>inactive：未生效；</li>
<li>active：已生效。</li>
     * @param Status 版本状态，取值有：
<li>creating：创建中；</li>
<li>inactive：未生效；</li>
<li>active：已生效。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return CreateTime 版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param CreateTime 版本创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
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
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

