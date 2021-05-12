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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePodInstancesRequest extends AbstractModel{

    /**
    * 实例所属groupId
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 偏移量，取值从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数，默认为20， 取值应为1~50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤字段
    */
    @SerializedName("PodNameList")
    @Expose
    private String [] PodNameList;

    /**
     * Get 实例所属groupId 
     * @return GroupId 实例所属groupId
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 实例所属groupId
     * @param GroupId 实例所属groupId
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 偏移量，取值从0开始 
     * @return Offset 偏移量，取值从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取值从0开始
     * @param Offset 偏移量，取值从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数，默认为20， 取值应为1~50 
     * @return Limit 分页个数，默认为20， 取值应为1~50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数，默认为20， 取值应为1~50
     * @param Limit 分页个数，默认为20， 取值应为1~50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤字段 
     * @return PodNameList 过滤字段
     */
    public String [] getPodNameList() {
        return this.PodNameList;
    }

    /**
     * Set 过滤字段
     * @param PodNameList 过滤字段
     */
    public void setPodNameList(String [] PodNameList) {
        this.PodNameList = PodNameList;
    }

    public DescribePodInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePodInstancesRequest(DescribePodInstancesRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PodNameList != null) {
            this.PodNameList = new String[source.PodNameList.length];
            for (int i = 0; i < source.PodNameList.length; i++) {
                this.PodNameList[i] = new String(source.PodNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "PodNameList.", this.PodNameList);

    }
}

