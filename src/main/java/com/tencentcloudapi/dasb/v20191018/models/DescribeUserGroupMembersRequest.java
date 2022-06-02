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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserGroupMembersRequest extends AbstractModel{

    /**
    * 用户组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * true - 查询已添加到该用户组的用户，false - 查询未添加到该用户组的用户
    */
    @SerializedName("Bound")
    @Expose
    private Boolean Bound;

    /**
    * 用户名或用户姓名，最长64个字符，模糊查询
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分页偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20, 最大500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 用户组ID 
     * @return Id 用户组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户组ID
     * @param Id 用户组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get true - 查询已添加到该用户组的用户，false - 查询未添加到该用户组的用户 
     * @return Bound true - 查询已添加到该用户组的用户，false - 查询未添加到该用户组的用户
     */
    public Boolean getBound() {
        return this.Bound;
    }

    /**
     * Set true - 查询已添加到该用户组的用户，false - 查询未添加到该用户组的用户
     * @param Bound true - 查询已添加到该用户组的用户，false - 查询未添加到该用户组的用户
     */
    public void setBound(Boolean Bound) {
        this.Bound = Bound;
    }

    /**
     * Get 用户名或用户姓名，最长64个字符，模糊查询 
     * @return Name 用户名或用户姓名，最长64个字符，模糊查询
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名或用户姓名，最长64个字符，模糊查询
     * @param Name 用户名或用户姓名，最长64个字符，模糊查询
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分页偏移位置 
     * @return Offset 分页偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置
     * @param Offset 分页偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20, 最大500 
     * @return Limit 每页条目数量，默认20, 最大500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20, 最大500
     * @param Limit 每页条目数量，默认20, 最大500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUserGroupMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserGroupMembersRequest(DescribeUserGroupMembersRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Bound != null) {
            this.Bound = new Boolean(source.Bound);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Bound", this.Bound);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

