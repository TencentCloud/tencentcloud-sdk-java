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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupMemberListRequest extends AbstractModel{

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 低代码平台应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分页值，默认1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数据量，默认20，最大1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 低代码平台应用ID 
     * @return SdkAppId 低代码平台应用ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码平台应用ID
     * @param SdkAppId 低代码平台应用ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分页值，默认1 
     * @return Page 分页值，默认1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页值，默认1
     * @param Page 分页值，默认1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数据量，默认20，最大1000 
     * @return Limit 每页数据量，默认20，最大1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据量，默认20，最大1000
     * @param Limit 每页数据量，默认20，最大1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGroupMemberListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupMemberListRequest(DescribeGroupMemberListRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

