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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNamespacesRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 指定命名空间，不填写默认查询所有命名空间
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 每页个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 指定命名空间，不填写默认查询所有命名空间 
     * @return NamespaceName 指定命名空间，不填写默认查询所有命名空间
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 指定命名空间，不填写默认查询所有命名空间
     * @param NamespaceName 指定命名空间，不填写默认查询所有命名空间
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 每页个数 
     * @return Limit 每页个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页个数
     * @param Limit 每页个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页偏移 
     * @return Offset 页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移
     * @param Offset 页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

