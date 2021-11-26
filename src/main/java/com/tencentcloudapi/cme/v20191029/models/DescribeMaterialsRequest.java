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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMaterialsRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 媒体 ID 列表，一次最多可拉取20个媒体的信息。
    */
    @SerializedName("MaterialIds")
    @Expose
    private String [] MaterialIds;

    /**
    * 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以获取任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 媒体 ID 列表，一次最多可拉取20个媒体的信息。 
     * @return MaterialIds 媒体 ID 列表，一次最多可拉取20个媒体的信息。
     */
    public String [] getMaterialIds() {
        return this.MaterialIds;
    }

    /**
     * Set 媒体 ID 列表，一次最多可拉取20个媒体的信息。
     * @param MaterialIds 媒体 ID 列表，一次最多可拉取20个媒体的信息。
     */
    public void setMaterialIds(String [] MaterialIds) {
        this.MaterialIds = MaterialIds;
    }

    /**
     * Get 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li> 
     * @return Sort 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
     * @param Sort 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以获取任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以获取任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以获取任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以获取任意媒体的信息。如果指定操作者，则操作者必须对媒体有读权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DescribeMaterialsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMaterialsRequest(DescribeMaterialsRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.MaterialIds != null) {
            this.MaterialIds = new String[source.MaterialIds.length];
            for (int i = 0; i < source.MaterialIds.length; i++) {
                this.MaterialIds[i] = new String(source.MaterialIds[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamArraySimple(map, prefix + "MaterialIds.", this.MaterialIds);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

