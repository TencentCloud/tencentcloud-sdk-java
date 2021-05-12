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

public class DescribeContainerEventsRequest extends AbstractModel{

    /**
    * event 的资源类型, group 或者 instance
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * event 的资源 id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

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
    * 当类型是 instance 时需要
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get event 的资源类型, group 或者 instance 
     * @return ResourceType event 的资源类型, group 或者 instance
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set event 的资源类型, group 或者 instance
     * @param ResourceType event 的资源类型, group 或者 instance
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get event 的资源 id 
     * @return ResourceId event 的资源 id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set event 的资源 id
     * @param ResourceId event 的资源 id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
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
     * Get 当类型是 instance 时需要 
     * @return GroupId 当类型是 instance 时需要
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 当类型是 instance 时需要
     * @param GroupId 当类型是 instance 时需要
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public DescribeContainerEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerEventsRequest(DescribeContainerEventsRequest source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

