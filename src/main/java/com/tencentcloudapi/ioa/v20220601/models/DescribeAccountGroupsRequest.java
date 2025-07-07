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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountGroupsRequest extends AbstractModel {

    /**
    * 搜索范围：0-仅当前分组的直接子组，1-当前分组的所有子组。默认为0。
    */
    @SerializedName("Deepin")
    @Expose
    private Long Deepin;

    /**
    * 查询条件

过滤参数
1、Name，string类型，按分组名过滤
是否必填：否
操作符: like

排序条件
1、Itime，string类型，按分组创建时间排序
是否必填：否
2、Utime，string类型，按分组更新时间排序
是否必填：否
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 父分组ID，获取该分组下的子组信息。默认查询全网根分组下子组信息。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
     * Get 搜索范围：0-仅当前分组的直接子组，1-当前分组的所有子组。默认为0。 
     * @return Deepin 搜索范围：0-仅当前分组的直接子组，1-当前分组的所有子组。默认为0。
     */
    public Long getDeepin() {
        return this.Deepin;
    }

    /**
     * Set 搜索范围：0-仅当前分组的直接子组，1-当前分组的所有子组。默认为0。
     * @param Deepin 搜索范围：0-仅当前分组的直接子组，1-当前分组的所有子组。默认为0。
     */
    public void setDeepin(Long Deepin) {
        this.Deepin = Deepin;
    }

    /**
     * Get 查询条件

过滤参数
1、Name，string类型，按分组名过滤
是否必填：否
操作符: like

排序条件
1、Itime，string类型，按分组创建时间排序
是否必填：否
2、Utime，string类型，按分组更新时间排序
是否必填：否 
     * @return Condition 查询条件

过滤参数
1、Name，string类型，按分组名过滤
是否必填：否
操作符: like

排序条件
1、Itime，string类型，按分组创建时间排序
是否必填：否
2、Utime，string类型，按分组更新时间排序
是否必填：否
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 查询条件

过滤参数
1、Name，string类型，按分组名过滤
是否必填：否
操作符: like

排序条件
1、Itime，string类型，按分组创建时间排序
是否必填：否
2、Utime，string类型，按分组更新时间排序
是否必填：否
     * @param Condition 查询条件

过滤参数
1、Name，string类型，按分组名过滤
是否必填：否
操作符: like

排序条件
1、Itime，string类型，按分组创建时间排序
是否必填：否
2、Utime，string类型，按分组更新时间排序
是否必填：否
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 父分组ID，获取该分组下的子组信息。默认查询全网根分组下子组信息。 
     * @return ParentId 父分组ID，获取该分组下的子组信息。默认查询全网根分组下子组信息。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父分组ID，获取该分组下的子组信息。默认查询全网根分组下子组信息。
     * @param ParentId 父分组ID，获取该分组下的子组信息。默认查询全网根分组下子组信息。
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

