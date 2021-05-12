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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubGroupsRequest extends AbstractModel{

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称，根据名称模糊匹配子分组时为必填
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数，默认200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否统计子分组下的设备数，0：统计，1：不统计
    */
    @SerializedName("OnlyGroup")
    @Expose
    private Long OnlyGroup;

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组名称，根据名称模糊匹配子分组时为必填 
     * @return GroupName 分组名称，根据名称模糊匹配子分组时为必填
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称，根据名称模糊匹配子分组时为必填
     * @param GroupName 分组名称，根据名称模糊匹配子分组时为必填
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数，默认200 
     * @return Limit 限制数，默认200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数，默认200
     * @param Limit 限制数，默认200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否统计子分组下的设备数，0：统计，1：不统计 
     * @return OnlyGroup 是否统计子分组下的设备数，0：统计，1：不统计
     */
    public Long getOnlyGroup() {
        return this.OnlyGroup;
    }

    /**
     * Set 是否统计子分组下的设备数，0：统计，1：不统计
     * @param OnlyGroup 是否统计子分组下的设备数，0：统计，1：不统计
     */
    public void setOnlyGroup(Long OnlyGroup) {
        this.OnlyGroup = OnlyGroup;
    }

    public DescribeSubGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubGroupsRequest(DescribeSubGroupsRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OnlyGroup != null) {
            this.OnlyGroup = new Long(source.OnlyGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OnlyGroup", this.OnlyGroup);

    }
}

