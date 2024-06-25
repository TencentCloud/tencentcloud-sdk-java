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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountGroupsRequest extends AbstractModel {

    /**
    * 搜索范围,0-仅搜直接子组,1-深层搜索(只支持32位)
    */
    @SerializedName("Deepin")
    @Expose
    private Long Deepin;

    /**
    * 滤条件、分页参数
<li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按账号分组过滤。</li>
排序条件
<li>Itime - string - 是否必填：否 - 排序支持：是 - 按账号分组创建时间排序。</li>
<li>Utime - string - 是否必填：否 - 排序支持：是 - 按账号分组更新时间排序。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 父分组id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
     * Get 搜索范围,0-仅搜直接子组,1-深层搜索(只支持32位) 
     * @return Deepin 搜索范围,0-仅搜直接子组,1-深层搜索(只支持32位)
     */
    public Long getDeepin() {
        return this.Deepin;
    }

    /**
     * Set 搜索范围,0-仅搜直接子组,1-深层搜索(只支持32位)
     * @param Deepin 搜索范围,0-仅搜直接子组,1-深层搜索(只支持32位)
     */
    public void setDeepin(Long Deepin) {
        this.Deepin = Deepin;
    }

    /**
     * Get 滤条件、分页参数
<li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按账号分组过滤。</li>
排序条件
<li>Itime - string - 是否必填：否 - 排序支持：是 - 按账号分组创建时间排序。</li>
<li>Utime - string - 是否必填：否 - 排序支持：是 - 按账号分组更新时间排序。</li> 
     * @return Condition 滤条件、分页参数
<li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按账号分组过滤。</li>
排序条件
<li>Itime - string - 是否必填：否 - 排序支持：是 - 按账号分组创建时间排序。</li>
<li>Utime - string - 是否必填：否 - 排序支持：是 - 按账号分组更新时间排序。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 滤条件、分页参数
<li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按账号分组过滤。</li>
排序条件
<li>Itime - string - 是否必填：否 - 排序支持：是 - 按账号分组创建时间排序。</li>
<li>Utime - string - 是否必填：否 - 排序支持：是 - 按账号分组更新时间排序。</li>
     * @param Condition 滤条件、分页参数
<li>Name - String - 是否必填：否 - 操作符: like  - 排序支持：否- 按账号分组过滤。</li>
排序条件
<li>Itime - string - 是否必填：否 - 排序支持：是 - 按账号分组创建时间排序。</li>
<li>Utime - string - 是否必填：否 - 排序支持：是 - 按账号分组更新时间排序。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 父分组id 
     * @return ParentId 父分组id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父分组id
     * @param ParentId 父分组id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    public DescribeAccountGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountGroupsRequest(DescribeAccountGroupsRequest source) {
        if (source.Deepin != null) {
            this.Deepin = new Long(source.Deepin);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Deepin", this.Deepin);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

