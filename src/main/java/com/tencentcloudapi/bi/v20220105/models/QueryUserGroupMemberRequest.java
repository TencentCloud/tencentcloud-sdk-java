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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryUserGroupMemberRequest extends AbstractModel {

    /**
    * 用户组id集合
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * 搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 是否需要分页
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * 用户组节点信息
    */
    @SerializedName("Nodes")
    @Expose
    private UserGroupTreeNodeDTO [] Nodes;

    /**
    * 标签值
    */
    @SerializedName("TagValueList")
    @Expose
    private ResourceTagValue [] TagValueList;

    /**
    * 需要过滤的用户组
    */
    @SerializedName("FilterGroupIds")
    @Expose
    private Long [] FilterGroupIds;

    /**
     * Get 用户组id集合 
     * @return GroupIds 用户组id集合
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 用户组id集合
     * @param GroupIds 用户组id集合
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 搜索关键字 
     * @return Keyword 搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键字
     * @param Keyword 搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码 
     * @return PageNo 分页页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 分页页码
     * @param PageNo 分页页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 是否需要分页 
     * @return AllPage 是否需要分页
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 是否需要分页
     * @param AllPage 是否需要分页
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 用户组节点信息 
     * @return Nodes 用户组节点信息
     */
    public UserGroupTreeNodeDTO [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 用户组节点信息
     * @param Nodes 用户组节点信息
     */
    public void setNodes(UserGroupTreeNodeDTO [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 标签值 
     * @return TagValueList 标签值
     */
    public ResourceTagValue [] getTagValueList() {
        return this.TagValueList;
    }

    /**
     * Set 标签值
     * @param TagValueList 标签值
     */
    public void setTagValueList(ResourceTagValue [] TagValueList) {
        this.TagValueList = TagValueList;
    }

    /**
     * Get 需要过滤的用户组 
     * @return FilterGroupIds 需要过滤的用户组
     */
    public Long [] getFilterGroupIds() {
        return this.FilterGroupIds;
    }

    /**
     * Set 需要过滤的用户组
     * @param FilterGroupIds 需要过滤的用户组
     */
    public void setFilterGroupIds(Long [] FilterGroupIds) {
        this.FilterGroupIds = FilterGroupIds;
    }

    public QueryUserGroupMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryUserGroupMemberRequest(QueryUserGroupMemberRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.Nodes != null) {
            this.Nodes = new UserGroupTreeNodeDTO[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new UserGroupTreeNodeDTO(source.Nodes[i]);
            }
        }
        if (source.TagValueList != null) {
            this.TagValueList = new ResourceTagValue[source.TagValueList.length];
            for (int i = 0; i < source.TagValueList.length; i++) {
                this.TagValueList[i] = new ResourceTagValue(source.TagValueList[i]);
            }
        }
        if (source.FilterGroupIds != null) {
            this.FilterGroupIds = new Long[source.FilterGroupIds.length];
            for (int i = 0; i < source.FilterGroupIds.length; i++) {
                this.FilterGroupIds[i] = new Long(source.FilterGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "TagValueList.", this.TagValueList);
        this.setParamArraySimple(map, prefix + "FilterGroupIds.", this.FilterGroupIds);

    }
}

