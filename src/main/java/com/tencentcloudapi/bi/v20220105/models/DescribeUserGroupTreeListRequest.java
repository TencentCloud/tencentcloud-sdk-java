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

public class DescribeUserGroupTreeListRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 是否分页
    */
    @SerializedName("AllPage")
    @Expose
    private Long AllPage;

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 每页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 标签过滤条件
    */
    @SerializedName("TagValueList")
    @Expose
    private ResourceTagValue [] TagValueList;

    /**
    * 节点集合
    */
    @SerializedName("Nodes")
    @Expose
    private UserGroupTreeNodeDTO [] Nodes;

    /**
    * 用户组id集合
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * 查询下一个code
    */
    @SerializedName("QueryNextNode")
    @Expose
    private Boolean QueryNextNode;

    /**
    * 父id集合
    */
    @SerializedName("ParentIds")
    @Expose
    private Long [] ParentIds;

    /**
    * 是否查询所有节点
    */
    @SerializedName("QueryAllNode")
    @Expose
    private Boolean QueryAllNode;

    /**
    * 过滤组id集合
    */
    @SerializedName("FilterGroupIds")
    @Expose
    private Long [] FilterGroupIds;

    /**
    * 模糊搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否分页 
     * @return AllPage 是否分页
     */
    public Long getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 是否分页
     * @param AllPage 是否分页
     */
    public void setAllPage(Long AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 每页条数 
     * @return PageSize 每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
     * @param PageSize 每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 标签过滤条件 
     * @return TagValueList 标签过滤条件
     */
    public ResourceTagValue [] getTagValueList() {
        return this.TagValueList;
    }

    /**
     * Set 标签过滤条件
     * @param TagValueList 标签过滤条件
     */
    public void setTagValueList(ResourceTagValue [] TagValueList) {
        this.TagValueList = TagValueList;
    }

    /**
     * Get 节点集合 
     * @return Nodes 节点集合
     */
    public UserGroupTreeNodeDTO [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 节点集合
     * @param Nodes 节点集合
     */
    public void setNodes(UserGroupTreeNodeDTO [] Nodes) {
        this.Nodes = Nodes;
    }

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
     * Get 查询下一个code 
     * @return QueryNextNode 查询下一个code
     */
    public Boolean getQueryNextNode() {
        return this.QueryNextNode;
    }

    /**
     * Set 查询下一个code
     * @param QueryNextNode 查询下一个code
     */
    public void setQueryNextNode(Boolean QueryNextNode) {
        this.QueryNextNode = QueryNextNode;
    }

    /**
     * Get 父id集合 
     * @return ParentIds 父id集合
     */
    public Long [] getParentIds() {
        return this.ParentIds;
    }

    /**
     * Set 父id集合
     * @param ParentIds 父id集合
     */
    public void setParentIds(Long [] ParentIds) {
        this.ParentIds = ParentIds;
    }

    /**
     * Get 是否查询所有节点 
     * @return QueryAllNode 是否查询所有节点
     */
    public Boolean getQueryAllNode() {
        return this.QueryAllNode;
    }

    /**
     * Set 是否查询所有节点
     * @param QueryAllNode 是否查询所有节点
     */
    public void setQueryAllNode(Boolean QueryAllNode) {
        this.QueryAllNode = QueryAllNode;
    }

    /**
     * Get 过滤组id集合 
     * @return FilterGroupIds 过滤组id集合
     */
    public Long [] getFilterGroupIds() {
        return this.FilterGroupIds;
    }

    /**
     * Set 过滤组id集合
     * @param FilterGroupIds 过滤组id集合
     */
    public void setFilterGroupIds(Long [] FilterGroupIds) {
        this.FilterGroupIds = FilterGroupIds;
    }

    /**
     * Get 模糊搜索关键字 
     * @return Keyword 模糊搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 模糊搜索关键字
     * @param Keyword 模糊搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeUserGroupTreeListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserGroupTreeListRequest(DescribeUserGroupTreeListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AllPage != null) {
            this.AllPage = new Long(source.AllPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TagValueList != null) {
            this.TagValueList = new ResourceTagValue[source.TagValueList.length];
            for (int i = 0; i < source.TagValueList.length; i++) {
                this.TagValueList[i] = new ResourceTagValue(source.TagValueList[i]);
            }
        }
        if (source.Nodes != null) {
            this.Nodes = new UserGroupTreeNodeDTO[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new UserGroupTreeNodeDTO(source.Nodes[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.QueryNextNode != null) {
            this.QueryNextNode = new Boolean(source.QueryNextNode);
        }
        if (source.ParentIds != null) {
            this.ParentIds = new Long[source.ParentIds.length];
            for (int i = 0; i < source.ParentIds.length; i++) {
                this.ParentIds[i] = new Long(source.ParentIds[i]);
            }
        }
        if (source.QueryAllNode != null) {
            this.QueryAllNode = new Boolean(source.QueryAllNode);
        }
        if (source.FilterGroupIds != null) {
            this.FilterGroupIds = new Long[source.FilterGroupIds.length];
            for (int i = 0; i < source.FilterGroupIds.length; i++) {
                this.FilterGroupIds[i] = new Long(source.FilterGroupIds[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "TagValueList.", this.TagValueList);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "QueryNextNode", this.QueryNextNode);
        this.setParamArraySimple(map, prefix + "ParentIds.", this.ParentIds);
        this.setParamSimple(map, prefix + "QueryAllNode", this.QueryAllNode);
        this.setParamArraySimple(map, prefix + "FilterGroupIds.", this.FilterGroupIds);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

