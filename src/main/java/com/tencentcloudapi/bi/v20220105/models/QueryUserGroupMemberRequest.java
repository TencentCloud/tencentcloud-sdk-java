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
    * <p>用户组id集合</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * <p>搜索关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>分页大小</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>分页页码</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>是否需要分页</p>
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * <p>用户组节点信息</p>
    */
    @SerializedName("Nodes")
    @Expose
    private UserGroupTreeNodeDTO [] Nodes;

    /**
    * <p>标签值</p>
    */
    @SerializedName("TagValueList")
    @Expose
    private ResourceTagValue [] TagValueList;

    /**
    * <p>需要过滤的用户组</p>
    */
    @SerializedName("FilterGroupIds")
    @Expose
    private Long [] FilterGroupIds;

    /**
     * Get <p>用户组id集合</p> 
     * @return GroupIds <p>用户组id集合</p>
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>用户组id集合</p>
     * @param GroupIds <p>用户组id集合</p>
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>搜索关键字</p> 
     * @return Keyword <p>搜索关键字</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>搜索关键字</p>
     * @param Keyword <p>搜索关键字</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>分页大小</p> 
     * @return PageSize <p>分页大小</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小</p>
     * @param PageSize <p>分页大小</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>分页页码</p> 
     * @return PageNo <p>分页页码</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>分页页码</p>
     * @param PageNo <p>分页页码</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>是否需要分页</p> 
     * @return AllPage <p>是否需要分页</p>
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set <p>是否需要分页</p>
     * @param AllPage <p>是否需要分页</p>
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get <p>用户组节点信息</p> 
     * @return Nodes <p>用户组节点信息</p>
     */
    public UserGroupTreeNodeDTO [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>用户组节点信息</p>
     * @param Nodes <p>用户组节点信息</p>
     */
    public void setNodes(UserGroupTreeNodeDTO [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>标签值</p> 
     * @return TagValueList <p>标签值</p>
     */
    public ResourceTagValue [] getTagValueList() {
        return this.TagValueList;
    }

    /**
     * Set <p>标签值</p>
     * @param TagValueList <p>标签值</p>
     */
    public void setTagValueList(ResourceTagValue [] TagValueList) {
        this.TagValueList = TagValueList;
    }

    /**
     * Get <p>需要过滤的用户组</p> 
     * @return FilterGroupIds <p>需要过滤的用户组</p>
     */
    public Long [] getFilterGroupIds() {
        return this.FilterGroupIds;
    }

    /**
     * Set <p>需要过滤的用户组</p>
     * @param FilterGroupIds <p>需要过滤的用户组</p>
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

