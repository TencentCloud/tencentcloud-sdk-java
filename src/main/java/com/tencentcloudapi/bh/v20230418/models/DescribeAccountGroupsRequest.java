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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountGroupsRequest extends AbstractModel {

    /**
    * 是否递归查询，0为不递归，1为递归
    */
    @SerializedName("DeepIn")
    @Expose
    private Long DeepIn;

    /**
    * 父账号组ID, 默认0,查询根账号组下所有分组 
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 账号组名称，模糊查询
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分页查询，每页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 获取第几页的数据
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
     * Get 是否递归查询，0为不递归，1为递归 
     * @return DeepIn 是否递归查询，0为不递归，1为递归
     */
    public Long getDeepIn() {
        return this.DeepIn;
    }

    /**
     * Set 是否递归查询，0为不递归，1为递归
     * @param DeepIn 是否递归查询，0为不递归，1为递归
     */
    public void setDeepIn(Long DeepIn) {
        this.DeepIn = DeepIn;
    }

    /**
     * Get 父账号组ID, 默认0,查询根账号组下所有分组  
     * @return ParentId 父账号组ID, 默认0,查询根账号组下所有分组 
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父账号组ID, 默认0,查询根账号组下所有分组 
     * @param ParentId 父账号组ID, 默认0,查询根账号组下所有分组 
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 账号组名称，模糊查询 
     * @return GroupName 账号组名称，模糊查询
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 账号组名称，模糊查询
     * @param GroupName 账号组名称，模糊查询
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 分页查询，每页条数 
     * @return PageSize 分页查询，每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页查询，每页条数
     * @param PageSize 分页查询，每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 获取第几页的数据 
     * @return PageNum 获取第几页的数据
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 获取第几页的数据
     * @param PageNum 获取第几页的数据
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    public DescribeAccountGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountGroupsRequest(DescribeAccountGroupsRequest source) {
        if (source.DeepIn != null) {
            this.DeepIn = new Long(source.DeepIn);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeepIn", this.DeepIn);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);

    }
}

