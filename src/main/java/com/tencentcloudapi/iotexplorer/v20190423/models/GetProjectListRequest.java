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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetProjectListRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 个数限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 按项目ID搜索
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 按产品ID搜索
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 加载 ProductCount、DeviceCount、ApplicationCount，可选值：ProductCount、DeviceCount、ApplicationCount，可多选
    */
    @SerializedName("Includes")
    @Expose
    private String [] Includes;

    /**
    * 按项目名称搜索
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 个数限制 
     * @return Limit 个数限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 个数限制
     * @param Limit 个数限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 按项目ID搜索 
     * @return ProjectId 按项目ID搜索
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 按项目ID搜索
     * @param ProjectId 按项目ID搜索
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 按产品ID搜索 
     * @return ProductId 按产品ID搜索
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 按产品ID搜索
     * @param ProductId 按产品ID搜索
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 加载 ProductCount、DeviceCount、ApplicationCount，可选值：ProductCount、DeviceCount、ApplicationCount，可多选 
     * @return Includes 加载 ProductCount、DeviceCount、ApplicationCount，可选值：ProductCount、DeviceCount、ApplicationCount，可多选
     */
    public String [] getIncludes() {
        return this.Includes;
    }

    /**
     * Set 加载 ProductCount、DeviceCount、ApplicationCount，可选值：ProductCount、DeviceCount、ApplicationCount，可多选
     * @param Includes 加载 ProductCount、DeviceCount、ApplicationCount，可选值：ProductCount、DeviceCount、ApplicationCount，可多选
     */
    public void setIncludes(String [] Includes) {
        this.Includes = Includes;
    }

    /**
     * Get 按项目名称搜索 
     * @return ProjectName 按项目名称搜索
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 按项目名称搜索
     * @param ProjectName 按项目名称搜索
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public GetProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetProjectListRequest(GetProjectListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Includes != null) {
            this.Includes = new String[source.Includes.length];
            for (int i = 0; i < source.Includes.length; i++) {
                this.Includes[i] = new String(source.Includes[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "Includes.", this.Includes);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

