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
    * 用户组id集合
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * asc正序,desc倒序
    */
    @SerializedName("CreatedOnOrder")
    @Expose
    private String CreatedOnOrder;

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
     * Get asc正序,desc倒序 
     * @return CreatedOnOrder asc正序,desc倒序
     */
    public String getCreatedOnOrder() {
        return this.CreatedOnOrder;
    }

    /**
     * Set asc正序,desc倒序
     * @param CreatedOnOrder asc正序,desc倒序
     */
    public void setCreatedOnOrder(String CreatedOnOrder) {
        this.CreatedOnOrder = CreatedOnOrder;
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

