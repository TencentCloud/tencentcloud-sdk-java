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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEipAclsRequest  extends AbstractModel{

    /**
    * ACL 名称，支持模糊查找
    */
    @SerializedName("AclName")
    @Expose
    private String AclName;

    /**
    * ACL 实例 ID 列表，数组下标从 0 开始
    */
    @SerializedName("AclIds")
    @Expose
    private String [] AclIds;

    /**
    * 分页参数。偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 分页参数。每一页的 EIPACL 列表数目
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取ACL 名称，支持模糊查找
     * @return AclName ACL 名称，支持模糊查找
     */
    public String getAclName() {
        return this.AclName;
    }

    /**
     * 设置ACL 名称，支持模糊查找
     * @param AclName ACL 名称，支持模糊查找
     */
    public void setAclName(String AclName) {
        this.AclName = AclName;
    }

    /**
     * 获取ACL 实例 ID 列表，数组下标从 0 开始
     * @return AclIds ACL 实例 ID 列表，数组下标从 0 开始
     */
    public String [] getAclIds() {
        return this.AclIds;
    }

    /**
     * 设置ACL 实例 ID 列表，数组下标从 0 开始
     * @param AclIds ACL 实例 ID 列表，数组下标从 0 开始
     */
    public void setAclIds(String [] AclIds) {
        this.AclIds = AclIds;
    }

    /**
     * 获取分页参数。偏移量，默认为 0
     * @return Offset 分页参数。偏移量，默认为 0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页参数。偏移量，默认为 0
     * @param Offset 分页参数。偏移量，默认为 0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页参数。每一页的 EIPACL 列表数目
     * @return Limit 分页参数。每一页的 EIPACL 列表数目
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页参数。每一页的 EIPACL 列表数目
     * @param Limit 分页参数。每一页的 EIPACL 列表数目
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AclName", this.AclName);
        this.setParamArraySimple(map, prefix + "AclIds.", this.AclIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

