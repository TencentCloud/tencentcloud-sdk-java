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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostsRequest  extends AbstractModel{

    /**
    * 过滤条件。
<li> zone - String - 是否必填：否 - （过滤条件）按照可用区过滤。</li>
<li> project-id - Integer - 是否必填：否 - （过滤条件）按照项目ID过滤。可通过调用 DescribeProject 查询已创建的项目列表或登录控制台进行查看；也可以调用 AddProject 创建新的项目。</li>
<li> host-id - String - 是否必填：否 - （过滤条件）按照CDH ID过滤。CDH ID形如：host-11112222。</li>
<li> host-name - String - 是否必填：否 - （过滤条件）按照CDH实例名称过滤。</li>
<li> host-state - String - 是否必填：否 - （过滤条件）按照CDH实例状态进行过滤。（PENDING：创建中|LAUNCH_FAILURE：创建失败|RUNNING：运行中|EXPIRED：已过期）</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取过滤条件。
<li> zone - String - 是否必填：否 - （过滤条件）按照可用区过滤。</li>
<li> project-id - Integer - 是否必填：否 - （过滤条件）按照项目ID过滤。可通过调用 DescribeProject 查询已创建的项目列表或登录控制台进行查看；也可以调用 AddProject 创建新的项目。</li>
<li> host-id - String - 是否必填：否 - （过滤条件）按照CDH ID过滤。CDH ID形如：host-11112222。</li>
<li> host-name - String - 是否必填：否 - （过滤条件）按照CDH实例名称过滤。</li>
<li> host-state - String - 是否必填：否 - （过滤条件）按照CDH实例状态进行过滤。（PENDING：创建中|LAUNCH_FAILURE：创建失败|RUNNING：运行中|EXPIRED：已过期）</li>
     * @return Filters 过滤条件。
<li> zone - String - 是否必填：否 - （过滤条件）按照可用区过滤。</li>
<li> project-id - Integer - 是否必填：否 - （过滤条件）按照项目ID过滤。可通过调用 DescribeProject 查询已创建的项目列表或登录控制台进行查看；也可以调用 AddProject 创建新的项目。</li>
<li> host-id - String - 是否必填：否 - （过滤条件）按照CDH ID过滤。CDH ID形如：host-11112222。</li>
<li> host-name - String - 是否必填：否 - （过滤条件）按照CDH实例名称过滤。</li>
<li> host-state - String - 是否必填：否 - （过滤条件）按照CDH实例状态进行过滤。（PENDING：创建中|LAUNCH_FAILURE：创建失败|RUNNING：运行中|EXPIRED：已过期）</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件。
<li> zone - String - 是否必填：否 - （过滤条件）按照可用区过滤。</li>
<li> project-id - Integer - 是否必填：否 - （过滤条件）按照项目ID过滤。可通过调用 DescribeProject 查询已创建的项目列表或登录控制台进行查看；也可以调用 AddProject 创建新的项目。</li>
<li> host-id - String - 是否必填：否 - （过滤条件）按照CDH ID过滤。CDH ID形如：host-11112222。</li>
<li> host-name - String - 是否必填：否 - （过滤条件）按照CDH实例名称过滤。</li>
<li> host-state - String - 是否必填：否 - （过滤条件）按照CDH实例状态进行过滤。（PENDING：创建中|LAUNCH_FAILURE：创建失败|RUNNING：运行中|EXPIRED：已过期）</li>
     * @param Filters 过滤条件。
<li> zone - String - 是否必填：否 - （过滤条件）按照可用区过滤。</li>
<li> project-id - Integer - 是否必填：否 - （过滤条件）按照项目ID过滤。可通过调用 DescribeProject 查询已创建的项目列表或登录控制台进行查看；也可以调用 AddProject 创建新的项目。</li>
<li> host-id - String - 是否必填：否 - （过滤条件）按照CDH ID过滤。CDH ID形如：host-11112222。</li>
<li> host-name - String - 是否必填：否 - （过滤条件）按照CDH实例名称过滤。</li>
<li> host-state - String - 是否必填：否 - （过滤条件）按照CDH实例状态进行过滤。（PENDING：创建中|LAUNCH_FAILURE：创建失败|RUNNING：运行中|EXPIRED：已过期）</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量，默认为0。
     * @return Offset 偏移量，默认为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为20，最大值为100。
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

