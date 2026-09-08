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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGraphProductIngestTaskListRequest extends AbstractModel {

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

    /**
    * <p>过滤条件</p><ul><li>taskId 按照【接入任务id】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>product 按照【接入产品】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>name 按照【接入任务名称】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>status 按照【接入任务状态】进行过滤。类型：int。必选：否 ；0：初始化中；1：已接入；2：接入失败；3：删除中；5：删除失败<br>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>分页偏移量，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页单页数量，默认 20，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>资源图谱id</p> 
     * @return ResourceGraphId <p>资源图谱id</p>
     */
    public String getResourceGraphId() {
        return this.ResourceGraphId;
    }

    /**
     * Set <p>资源图谱id</p>
     * @param ResourceGraphId <p>资源图谱id</p>
     */
    public void setResourceGraphId(String ResourceGraphId) {
        this.ResourceGraphId = ResourceGraphId;
    }

    /**
     * Get <p>过滤条件</p><ul><li>taskId 按照【接入任务id】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>product 按照【接入产品】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>name 按照【接入任务名称】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>status 按照【接入任务状态】进行过滤。类型：int。必选：否 ；0：初始化中；1：已接入；2：接入失败；3：删除中；5：删除失败<br>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。</li></ul> 
     * @return Filters <p>过滤条件</p><ul><li>taskId 按照【接入任务id】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>product 按照【接入产品】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>name 按照【接入任务名称】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>status 按照【接入任务状态】进行过滤。类型：int。必选：否 ；0：初始化中；1：已接入；2：接入失败；3：删除中；5：删除失败<br>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。</li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p><ul><li>taskId 按照【接入任务id】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>product 按照【接入产品】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>name 按照【接入任务名称】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>status 按照【接入任务状态】进行过滤。类型：int。必选：否 ；0：初始化中；1：已接入；2：接入失败；3：删除中；5：删除失败<br>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。</li></ul>
     * @param Filters <p>过滤条件</p><ul><li>taskId 按照【接入任务id】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>product 按照【接入产品】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>name 按照【接入任务名称】进行过滤，默认为模糊匹配。类型：String。必选：否 </li><li>status 按照【接入任务状态】进行过滤。类型：int。必选：否 ；0：初始化中；1：已接入；2：接入失败；3：删除中；5：删除失败<br>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。</li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页偏移量，默认 0</p> 
     * @return Offset <p>分页偏移量，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认 0</p>
     * @param Offset <p>分页偏移量，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页单页数量，默认 20，最大 100</p> 
     * @return Limit <p>分页单页数量，默认 20，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页单页数量，默认 20，最大 100</p>
     * @param Limit <p>分页单页数量，默认 20，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeResourceGraphProductIngestTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphProductIngestTaskListRequest(DescribeResourceGraphProductIngestTaskListRequest source) {
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGraphId", this.ResourceGraphId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

