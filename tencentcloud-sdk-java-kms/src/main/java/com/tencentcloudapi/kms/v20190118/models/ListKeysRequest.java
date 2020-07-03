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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListKeysRequest extends AbstractModel{

    /**
    * 含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 含义跟 SQL 查询的 Limit 一致，表示本次获最多获取 Limit 个元素。缺省值为10，最大值为200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
     * Get 含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0 
     * @return Offset 含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0
     * @param Offset 含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 含义跟 SQL 查询的 Limit 一致，表示本次获最多获取 Limit 个元素。缺省值为10，最大值为200 
     * @return Limit 含义跟 SQL 查询的 Limit 一致，表示本次获最多获取 Limit 个元素。缺省值为10，最大值为200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 含义跟 SQL 查询的 Limit 一致，表示本次获最多获取 Limit 个元素。缺省值为10，最大值为200
     * @param Limit 含义跟 SQL 查询的 Limit 一致，表示本次获最多获取 Limit 个元素。缺省值为10，最大值为200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk 
     * @return Role 根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set 根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk
     * @param Role 根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

