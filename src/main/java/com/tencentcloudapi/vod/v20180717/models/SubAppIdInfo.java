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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAppIdInfo extends AbstractModel {

    /**
    * 子应用 ID。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 子应用名称。
    */
    @SerializedName("SubAppIdName")
    @Expose
    private String SubAppIdName;

    /**
    * 子应用简介。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
<li>Destroying：销毁中。</li>
<li>Destroyed：销毁完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 子应用名称（该字段已不推荐使用，建议使用新的子应用名称字段 SubAppIdName）。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 子应用 ID。 
     * @return SubAppId 子应用 ID。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 子应用 ID。
     * @param SubAppId 子应用 ID。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 子应用名称。 
     * @return SubAppIdName 子应用名称。
     */
    public String getSubAppIdName() {
        return this.SubAppIdName;
    }

    /**
     * Set 子应用名称。
     * @param SubAppIdName 子应用名称。
     */
    public void setSubAppIdName(String SubAppIdName) {
        this.SubAppIdName = SubAppIdName;
    }

    /**
     * Get 子应用简介。 
     * @return Description 子应用简介。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 子应用简介。
     * @param Description 子应用简介。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
<li>Destroying：销毁中。</li>
<li>Destroyed：销毁完成。</li> 
     * @return Status 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
<li>Destroying：销毁中。</li>
<li>Destroyed：销毁完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
<li>Destroying：销毁中。</li>
<li>Destroyed：销毁完成。</li>
     * @param Status 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
<li>Destroying：销毁中。</li>
<li>Destroyed：销毁完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 子应用名称（该字段已不推荐使用，建议使用新的子应用名称字段 SubAppIdName）。 
     * @return Name 子应用名称（该字段已不推荐使用，建议使用新的子应用名称字段 SubAppIdName）。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子应用名称（该字段已不推荐使用，建议使用新的子应用名称字段 SubAppIdName）。
     * @param Name 子应用名称（该字段已不推荐使用，建议使用新的子应用名称字段 SubAppIdName）。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public SubAppIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubAppIdInfo(SubAppIdInfo source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SubAppIdName != null) {
            this.SubAppIdName = new String(source.SubAppIdName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SubAppIdName", this.SubAppIdName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

