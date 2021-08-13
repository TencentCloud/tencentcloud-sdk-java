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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGroupRequest extends AbstractModel{

    /**
    * 查询类型 网络结构 vpc，业务识别- resource ，资源标签-tag
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 资产组id  全部传0
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 查询类型 网络结构 vpc，业务识别- resource ，资源标签-tag 
     * @return QueryType 查询类型 网络结构 vpc，业务识别- resource ，资源标签-tag
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型 网络结构 vpc，业务识别- resource ，资源标签-tag
     * @param QueryType 查询类型 网络结构 vpc，业务识别- resource ，资源标签-tag
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 资产组id  全部传0 
     * @return GroupId 资产组id  全部传0
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 资产组id  全部传0
     * @param GroupId 资产组id  全部传0
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public DescribeResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGroupRequest(DescribeResourceGroupRequest source) {
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

