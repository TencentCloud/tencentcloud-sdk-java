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

public class DescribeUserGroupMemberListRequest extends AbstractModel {

    /**
    * <p>用户组id集合</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * <p>asc正序,desc倒序</p>
    */
    @SerializedName("CreatedOnOrder")
    @Expose
    private String CreatedOnOrder;

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
     * Get <p>asc正序,desc倒序</p> 
     * @return CreatedOnOrder <p>asc正序,desc倒序</p>
     */
    public String getCreatedOnOrder() {
        return this.CreatedOnOrder;
    }

    /**
     * Set <p>asc正序,desc倒序</p>
     * @param CreatedOnOrder <p>asc正序,desc倒序</p>
     */
    public void setCreatedOnOrder(String CreatedOnOrder) {
        this.CreatedOnOrder = CreatedOnOrder;
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

    public DescribeUserGroupMemberListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserGroupMemberListRequest(DescribeUserGroupMemberListRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.CreatedOnOrder != null) {
            this.CreatedOnOrder = new String(source.CreatedOnOrder);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "CreatedOnOrder", this.CreatedOnOrder);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);

    }
}

