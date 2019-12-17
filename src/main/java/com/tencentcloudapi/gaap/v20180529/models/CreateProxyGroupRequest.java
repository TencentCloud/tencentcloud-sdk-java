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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyGroupRequest extends AbstractModel{

    /**
    * 通道组所属项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 通道组别名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * 标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * Get 通道组所属项目ID 
     * @return ProjectId 通道组所属项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 通道组所属项目ID
     * @param ProjectId 通道组所属项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 通道组别名 
     * @return GroupName 通道组别名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 通道组别名
     * @param GroupName 通道组别名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId 
     * @return RealServerRegion 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
     * @param RealServerRegion 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get 标签列表 
     * @return TagSet 标签列表
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表
     * @param TagSet 标签列表
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

