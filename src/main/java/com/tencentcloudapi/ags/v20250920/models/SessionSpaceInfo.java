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

public class SessionSpaceInfo extends AbstractModel {

    /**
    * <p>会话空间唯一标识，由服务端生成，最大长度为 128 个字符。调用方不应自行构造或解析。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>会话空间名称，用于标识会话空间的业务用途，最大长度为 128 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>会话空间描述，用于说明业务用途和使用范围，最大长度为 512 个字符。为空时该字段可能不返回</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>会话空间当前状态。</p><p>枚举值：</p><ul><li>Active： 正常可用</li><li>Deleting： 正在删除</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否为系统默认会话空间。true 表示默认会话空间，false 表示普通会话空间。默认会话空间不允许删除。</p>
    */
    @SerializedName("Default")
    @Expose
    private Boolean Default;

    /**
    * <p>会话空间创建时间，采用 ISO 8601/RFC 3339 格式。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>会话空间最后更新时间，采用 ISO 8601/RFC 3339 格式。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>会话空间唯一标识，由服务端生成，最大长度为 128 个字符。调用方不应自行构造或解析。</p> 
     * @return SpaceId <p>会话空间唯一标识，由服务端生成，最大长度为 128 个字符。调用方不应自行构造或解析。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>会话空间唯一标识，由服务端生成，最大长度为 128 个字符。调用方不应自行构造或解析。</p>
     * @param SpaceId <p>会话空间唯一标识，由服务端生成，最大长度为 128 个字符。调用方不应自行构造或解析。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>会话空间名称，用于标识会话空间的业务用途，最大长度为 128 个字符。</p> 
     * @return Name <p>会话空间名称，用于标识会话空间的业务用途，最大长度为 128 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>会话空间名称，用于标识会话空间的业务用途，最大长度为 128 个字符。</p>
     * @param Name <p>会话空间名称，用于标识会话空间的业务用途，最大长度为 128 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>会话空间描述，用于说明业务用途和使用范围，最大长度为 512 个字符。为空时该字段可能不返回</p> 
     * @return Description <p>会话空间描述，用于说明业务用途和使用范围，最大长度为 512 个字符。为空时该字段可能不返回</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>会话空间描述，用于说明业务用途和使用范围，最大长度为 512 个字符。为空时该字段可能不返回</p>
     * @param Description <p>会话空间描述，用于说明业务用途和使用范围，最大长度为 512 个字符。为空时该字段可能不返回</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>会话空间当前状态。</p><p>枚举值：</p><ul><li>Active： 正常可用</li><li>Deleting： 正在删除</li></ul> 
     * @return Status <p>会话空间当前状态。</p><p>枚举值：</p><ul><li>Active： 正常可用</li><li>Deleting： 正在删除</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>会话空间当前状态。</p><p>枚举值：</p><ul><li>Active： 正常可用</li><li>Deleting： 正在删除</li></ul>
     * @param Status <p>会话空间当前状态。</p><p>枚举值：</p><ul><li>Active： 正常可用</li><li>Deleting： 正在删除</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否为系统默认会话空间。true 表示默认会话空间，false 表示普通会话空间。默认会话空间不允许删除。</p> 
     * @return Default <p>是否为系统默认会话空间。true 表示默认会话空间，false 表示普通会话空间。默认会话空间不允许删除。</p>
     */
    public Boolean getDefault() {
        return this.Default;
    }

    /**
     * Set <p>是否为系统默认会话空间。true 表示默认会话空间，false 表示普通会话空间。默认会话空间不允许删除。</p>
     * @param Default <p>是否为系统默认会话空间。true 表示默认会话空间，false 表示普通会话空间。默认会话空间不允许删除。</p>
     */
    public void setDefault(Boolean Default) {
        this.Default = Default;
    }

    /**
     * Get <p>会话空间创建时间，采用 ISO 8601/RFC 3339 格式。</p> 
     * @return CreateTime <p>会话空间创建时间，采用 ISO 8601/RFC 3339 格式。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>会话空间创建时间，采用 ISO 8601/RFC 3339 格式。</p>
     * @param CreateTime <p>会话空间创建时间，采用 ISO 8601/RFC 3339 格式。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>会话空间最后更新时间，采用 ISO 8601/RFC 3339 格式。</p> 
     * @return UpdateTime <p>会话空间最后更新时间，采用 ISO 8601/RFC 3339 格式。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>会话空间最后更新时间，采用 ISO 8601/RFC 3339 格式。</p>
     * @param UpdateTime <p>会话空间最后更新时间，采用 ISO 8601/RFC 3339 格式。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SessionSpaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionSpaceInfo(SessionSpaceInfo source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Default != null) {
            this.Default = new Boolean(source.Default);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

