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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagKeysRequest extends AbstractModel {

    /**
    * <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页大小，默认为 15，最大1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否展现项目标签。1:展示 0:不展示。本功能仅供历史客户使用，需提交工单加白主账号后，入参方可有效。</p>
    */
    @SerializedName("ShowProject")
    @Expose
    private Long ShowProject;

    /**
    * <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p> 
     * @return CreateUin <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
     * @param CreateUin <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p> 
     * @return Offset <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
     * @param Offset <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页大小，默认为 15，最大1000</p> 
     * @return Limit <p>每页大小，默认为 15，最大1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页大小，默认为 15，最大1000</p>
     * @param Limit <p>每页大小，默认为 15，最大1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否展现项目标签。1:展示 0:不展示。本功能仅供历史客户使用，需提交工单加白主账号后，入参方可有效。</p> 
     * @return ShowProject <p>是否展现项目标签。1:展示 0:不展示。本功能仅供历史客户使用，需提交工单加白主账号后，入参方可有效。</p>
     */
    public Long getShowProject() {
        return this.ShowProject;
    }

    /**
     * Set <p>是否展现项目标签。1:展示 0:不展示。本功能仅供历史客户使用，需提交工单加白主账号后，入参方可有效。</p>
     * @param ShowProject <p>是否展现项目标签。1:展示 0:不展示。本功能仅供历史客户使用，需提交工单加白主账号后，入参方可有效。</p>
     */
    public void setShowProject(Long ShowProject) {
        this.ShowProject = ShowProject;
    }

    /**
     * Get <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p> 
     * @return Category <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
     * @param Category <p>标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public DescribeTagKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagKeysRequest(DescribeTagKeysRequest source) {
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ShowProject != null) {
            this.ShowProject = new Long(source.ShowProject);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ShowProject", this.ShowProject);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

