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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 分页参数，每页返回的数量，取值1~100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，页偏移量，从0开始计数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 筛选对象的维度信息
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeBindingPolicyObjectListDimension [] Dimensions;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略组id 
     * @return GroupId 策略组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id
     * @param GroupId 策略组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分页参数，每页返回的数量，取值1~100，默认20 
     * @return Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，每页返回的数量，取值1~100，默认20
     * @param Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，页偏移量，从0开始计数，默认0 
     * @return Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，页偏移量，从0开始计数，默认0
     * @param Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 筛选对象的维度信息 
     * @return Dimensions 筛选对象的维度信息
     */
    public DescribeBindingPolicyObjectListDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 筛选对象的维度信息
     * @param Dimensions 筛选对象的维度信息
     */
    public void setDimensions(DescribeBindingPolicyObjectListDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

