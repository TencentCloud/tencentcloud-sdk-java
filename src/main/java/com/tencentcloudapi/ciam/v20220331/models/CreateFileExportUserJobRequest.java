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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileExportUserJobRequest extends AbstractModel{

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 导出的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Key可选值为condition、userGroupId

<li> **condition** </li>	Values = 查询条件，用户ID，用户名称，手机或邮箱
<li> **userGroupId** </li>	Values = 用户组ID
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 导出用户包含的属性和映射名称，为空时包含所有的属性
    */
    @SerializedName("ExportPropertyMaps")
    @Expose
    private ExportPropertyMap [] ExportPropertyMaps;

    /**
     * Get 用户目录ID 
     * @return UserStoreId 用户目录ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户目录ID
     * @param UserStoreId 用户目录ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 导出的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values 
     * @return Format 导出的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 导出的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
     * @param Format 导出的数据类型

<li> **JSON** </li>  JSON
<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Key可选值为condition、userGroupId

<li> **condition** </li>	Values = 查询条件，用户ID，用户名称，手机或邮箱
<li> **userGroupId** </li>	Values = 用户组ID 
     * @return Filters Key可选值为condition、userGroupId

<li> **condition** </li>	Values = 查询条件，用户ID，用户名称，手机或邮箱
<li> **userGroupId** </li>	Values = 用户组ID
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Key可选值为condition、userGroupId

<li> **condition** </li>	Values = 查询条件，用户ID，用户名称，手机或邮箱
<li> **userGroupId** </li>	Values = 用户组ID
     * @param Filters Key可选值为condition、userGroupId

<li> **condition** </li>	Values = 查询条件，用户ID，用户名称，手机或邮箱
<li> **userGroupId** </li>	Values = 用户组ID
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 导出用户包含的属性和映射名称，为空时包含所有的属性 
     * @return ExportPropertyMaps 导出用户包含的属性和映射名称，为空时包含所有的属性
     */
    public ExportPropertyMap [] getExportPropertyMaps() {
        return this.ExportPropertyMaps;
    }

    /**
     * Set 导出用户包含的属性和映射名称，为空时包含所有的属性
     * @param ExportPropertyMaps 导出用户包含的属性和映射名称，为空时包含所有的属性
     */
    public void setExportPropertyMaps(ExportPropertyMap [] ExportPropertyMaps) {
        this.ExportPropertyMaps = ExportPropertyMaps;
    }

    public CreateFileExportUserJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileExportUserJobRequest(CreateFileExportUserJobRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ExportPropertyMaps != null) {
            this.ExportPropertyMaps = new ExportPropertyMap[source.ExportPropertyMaps.length];
            for (int i = 0; i < source.ExportPropertyMaps.length; i++) {
                this.ExportPropertyMaps[i] = new ExportPropertyMap(source.ExportPropertyMaps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "ExportPropertyMaps.", this.ExportPropertyMaps);

    }
}

