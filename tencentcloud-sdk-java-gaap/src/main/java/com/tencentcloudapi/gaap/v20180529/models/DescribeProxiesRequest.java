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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesRequest extends AbstractModel{

    /**
    * （旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件。   
每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 
ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。    
AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。    
RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。
GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * （新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 当该字段为1时，仅拉取非通道组的通道，
当该字段为0时，仅拉取通道组的通道，
不存在该字段时，拉取所有通道，包括独立通道和通道组通道。
    */
    @SerializedName("Independent")
    @Expose
    private Long Independent;

    /**
     * Get （旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。 
     * @return InstanceIds （旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set （旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
     * @param InstanceIds （旧参数，请切换到ProxyIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件。   
每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 
ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。    
AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。    
RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。
GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。 
     * @return Filters 过滤条件。   
每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 
ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。    
AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。    
RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。
GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。   
每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 
ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。    
AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。    
RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。
GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。
     * @param Filters 过滤条件。   
每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定InstanceIds和Filters。 
ProjectId - String - 是否必填：否 -（过滤条件）按照项目ID过滤。    
AccessRegion - String - 是否必填：否 - （过滤条件）按照接入地域过滤。    
RealServerRegion - String - 是否必填：否 - （过滤条件）按照源站地域过滤。
GroupId - String - 是否必填：否 - （过滤条件）按照通道组ID过滤。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get （新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。 
     * @return ProxyIds （新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set （新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
     * @param ProxyIds （新参数，替代InstanceIds）按照一个或者多个实例ID查询。每次请求的实例的上限为100。参数不支持同时指定InstanceIds和Filters。
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。 
     * @return TagSet 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。
     * @param TagSet 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，通道会被拉取出来。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 当该字段为1时，仅拉取非通道组的通道，
当该字段为0时，仅拉取通道组的通道，
不存在该字段时，拉取所有通道，包括独立通道和通道组通道。 
     * @return Independent 当该字段为1时，仅拉取非通道组的通道，
当该字段为0时，仅拉取通道组的通道，
不存在该字段时，拉取所有通道，包括独立通道和通道组通道。
     */
    public Long getIndependent() {
        return this.Independent;
    }

    /**
     * Set 当该字段为1时，仅拉取非通道组的通道，
当该字段为0时，仅拉取通道组的通道，
不存在该字段时，拉取所有通道，包括独立通道和通道组通道。
     * @param Independent 当该字段为1时，仅拉取非通道组的通道，
当该字段为0时，仅拉取通道组的通道，
不存在该字段时，拉取所有通道，包括独立通道和通道组通道。
     */
    public void setIndependent(Long Independent) {
        this.Independent = Independent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Independent", this.Independent);

    }
}

