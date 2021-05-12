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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目 Id 列表，N 从 0 开始取值，最大 19。
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 画布宽高比集合。
    */
    @SerializedName("AspectRatioSet")
    @Expose
    private String [] AspectRatioSet;

    /**
    * 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
    */
    @SerializedName("CategorySet")
    @Expose
    private String [] CategorySet;

    /**
    * 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
    */
    @SerializedName("Modes")
    @Expose
    private String [] Modes;

    /**
    * 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 项目归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 分页返回的起始偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验项目访问权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 项目 Id 列表，N 从 0 开始取值，最大 19。 
     * @return ProjectIds 项目 Id 列表，N 从 0 开始取值，最大 19。
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目 Id 列表，N 从 0 开始取值，最大 19。
     * @param ProjectIds 项目 Id 列表，N 从 0 开始取值，最大 19。
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 画布宽高比集合。 
     * @return AspectRatioSet 画布宽高比集合。
     */
    public String [] getAspectRatioSet() {
        return this.AspectRatioSet;
    }

    /**
     * Set 画布宽高比集合。
     * @param AspectRatioSet 画布宽高比集合。
     */
    public void setAspectRatioSet(String [] AspectRatioSet) {
        this.AspectRatioSet = AspectRatioSet;
    }

    /**
     * Get 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li> 
     * @return CategorySet 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     */
    public String [] getCategorySet() {
        return this.CategorySet;
    }

    /**
     * Set 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     * @param CategorySet 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     */
    public void setCategorySet(String [] CategorySet) {
        this.CategorySet = CategorySet;
    }

    /**
     * Get 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li> 
     * @return Modes 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
     */
    public String [] getModes() {
        return this.Modes;
    }

    /**
     * Set 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
     * @param Modes 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
     */
    public void setModes(String [] Modes) {
        this.Modes = Modes;
    }

    /**
     * Get 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li> 
     * @return Sort 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
     * @param Sort 列表排序，支持下列排序字段：
<li>CreateTime：创建时间；</li>
<li>UpdateTime：更新时间。</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 项目归属者。 
     * @return Owner 项目归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 项目归属者。
     * @param Owner 项目归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。 
     * @return Offset 分页返回的起始偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。
     * @param Offset 分页返回的起始偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：10。 
     * @return Limit 分页返回的记录条数，默认值：10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：10。
     * @param Limit 分页返回的记录条数，默认值：10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验项目访问权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验项目访问权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验项目访问权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验项目访问权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.AspectRatioSet != null) {
            this.AspectRatioSet = new String[source.AspectRatioSet.length];
            for (int i = 0; i < source.AspectRatioSet.length; i++) {
                this.AspectRatioSet[i] = new String(source.AspectRatioSet[i]);
            }
        }
        if (source.CategorySet != null) {
            this.CategorySet = new String[source.CategorySet.length];
            for (int i = 0; i < source.CategorySet.length; i++) {
                this.CategorySet[i] = new String(source.CategorySet[i]);
            }
        }
        if (source.Modes != null) {
            this.Modes = new String[source.Modes.length];
            for (int i = 0; i < source.Modes.length; i++) {
                this.Modes[i] = new String(source.Modes[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "AspectRatioSet.", this.AspectRatioSet);
        this.setParamArraySimple(map, prefix + "CategorySet.", this.CategorySet);
        this.setParamArraySimple(map, prefix + "Modes.", this.Modes);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

