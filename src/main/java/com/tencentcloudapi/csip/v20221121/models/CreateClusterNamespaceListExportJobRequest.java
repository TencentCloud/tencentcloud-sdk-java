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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterNamespaceListExportJobRequest extends AbstractModel {

    /**
    * <p>集群CA证书MD5</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件列表。支持的过滤字段：<br>Name：命名空间名称，模糊匹配。<br>Label：标签，模糊匹配（对标签的 key 或 value 做匹配，任一命中即匹配）。</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>Name：命名空间名称<br>Labels：标签（格式：key1=value1;key2=value2）<br>CreateTime：创建时间</p>
    */
    @SerializedName("ExportFields")
    @Expose
    private String [] ExportFields;

    /**
     * Get <p>集群CA证书MD5</p> 
     * @return ClusterCaMD5 <p>集群CA证书MD5</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>集群CA证书MD5</p>
     * @param ClusterCaMD5 <p>集群CA证书MD5</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>通用过滤条件列表。支持的过滤字段：<br>Name：命名空间名称，模糊匹配。<br>Label：标签，模糊匹配（对标签的 key 或 value 做匹配，任一命中即匹配）。</p> 
     * @return Filter <p>通用过滤条件列表。支持的过滤字段：<br>Name：命名空间名称，模糊匹配。<br>Label：标签，模糊匹配（对标签的 key 或 value 做匹配，任一命中即匹配）。</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>通用过滤条件列表。支持的过滤字段：<br>Name：命名空间名称，模糊匹配。<br>Label：标签，模糊匹配（对标签的 key 或 value 做匹配，任一命中即匹配）。</p>
     * @param Filter <p>通用过滤条件列表。支持的过滤字段：<br>Name：命名空间名称，模糊匹配。<br>Label：标签，模糊匹配（对标签的 key 或 value 做匹配，任一命中即匹配）。</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>Name：命名空间名称<br>Labels：标签（格式：key1=value1;key2=value2）<br>CreateTime：创建时间</p> 
     * @return ExportFields <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>Name：命名空间名称<br>Labels：标签（格式：key1=value1;key2=value2）<br>CreateTime：创建时间</p>
     */
    public String [] getExportFields() {
        return this.ExportFields;
    }

    /**
     * Set <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>Name：命名空间名称<br>Labels：标签（格式：key1=value1;key2=value2）<br>CreateTime：创建时间</p>
     * @param ExportFields <p>导出字段列表（不传则导出全部字段）<br>枚举值：<br>Name：命名空间名称<br>Labels：标签（格式：key1=value1;key2=value2）<br>CreateTime：创建时间</p>
     */
    public void setExportFields(String [] ExportFields) {
        this.ExportFields = ExportFields;
    }

    public CreateClusterNamespaceListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterNamespaceListExportJobRequest(CreateClusterNamespaceListExportJobRequest source) {
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ExportFields != null) {
            this.ExportFields = new String[source.ExportFields.length];
            for (int i = 0; i < source.ExportFields.length; i++) {
                this.ExportFields[i] = new String(source.ExportFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "ExportFields.", this.ExportFields);

    }
}

