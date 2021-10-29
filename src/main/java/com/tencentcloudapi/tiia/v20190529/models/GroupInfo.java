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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel{

    /**
    * 图库Id。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 图库名称。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 图库简介。
    */
    @SerializedName("Brief")
    @Expose
    private String Brief;

    /**
    * 图库容量。
    */
    @SerializedName("MaxCapacity")
    @Expose
    private Long MaxCapacity;

    /**
    * 该库的访问限频 。
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
    * 图库类型： 
1: 通用图库，以用户输入图提取特征。
2: 灰度图库，输入图和搜索图均转为灰度图提取特征。
    */
    @SerializedName("GroupType")
    @Expose
    private Long GroupType;

    /**
    * 图库图片数量。
    */
    @SerializedName("PicCount")
    @Expose
    private Long PicCount;

    /**
    * 图库创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 图库更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 图库Id。 
     * @return GroupId 图库Id。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 图库Id。
     * @param GroupId 图库Id。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 图库名称。 
     * @return GroupName 图库名称。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 图库名称。
     * @param GroupName 图库名称。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 图库简介。 
     * @return Brief 图库简介。
     */
    public String getBrief() {
        return this.Brief;
    }

    /**
     * Set 图库简介。
     * @param Brief 图库简介。
     */
    public void setBrief(String Brief) {
        this.Brief = Brief;
    }

    /**
     * Get 图库容量。 
     * @return MaxCapacity 图库容量。
     */
    public Long getMaxCapacity() {
        return this.MaxCapacity;
    }

    /**
     * Set 图库容量。
     * @param MaxCapacity 图库容量。
     */
    public void setMaxCapacity(Long MaxCapacity) {
        this.MaxCapacity = MaxCapacity;
    }

    /**
     * Get 该库的访问限频 。 
     * @return MaxQps 该库的访问限频 。
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set 该库的访问限频 。
     * @param MaxQps 该库的访问限频 。
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    /**
     * Get 图库类型： 
1: 通用图库，以用户输入图提取特征。
2: 灰度图库，输入图和搜索图均转为灰度图提取特征。 
     * @return GroupType 图库类型： 
1: 通用图库，以用户输入图提取特征。
2: 灰度图库，输入图和搜索图均转为灰度图提取特征。
     */
    public Long getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 图库类型： 
1: 通用图库，以用户输入图提取特征。
2: 灰度图库，输入图和搜索图均转为灰度图提取特征。
     * @param GroupType 图库类型： 
1: 通用图库，以用户输入图提取特征。
2: 灰度图库，输入图和搜索图均转为灰度图提取特征。
     */
    public void setGroupType(Long GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 图库图片数量。 
     * @return PicCount 图库图片数量。
     */
    public Long getPicCount() {
        return this.PicCount;
    }

    /**
     * Set 图库图片数量。
     * @param PicCount 图库图片数量。
     */
    public void setPicCount(Long PicCount) {
        this.PicCount = PicCount;
    }

    /**
     * Get 图库创建时间。 
     * @return CreateTime 图库创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 图库创建时间。
     * @param CreateTime 图库创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 图库更新时间。 
     * @return UpdateTime 图库更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 图库更新时间。
     * @param UpdateTime 图库更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Brief != null) {
            this.Brief = new String(source.Brief);
        }
        if (source.MaxCapacity != null) {
            this.MaxCapacity = new Long(source.MaxCapacity);
        }
        if (source.MaxQps != null) {
            this.MaxQps = new Long(source.MaxQps);
        }
        if (source.GroupType != null) {
            this.GroupType = new Long(source.GroupType);
        }
        if (source.PicCount != null) {
            this.PicCount = new Long(source.PicCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Brief", this.Brief);
        this.setParamSimple(map, prefix + "MaxCapacity", this.MaxCapacity);
        this.setParamSimple(map, prefix + "MaxQps", this.MaxQps);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "PicCount", this.PicCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

