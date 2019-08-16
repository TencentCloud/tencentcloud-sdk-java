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

public class SearchStudioProductRequest  extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 列表Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 列表Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 产品Status
    */
    @SerializedName("DevStatus")
    @Expose
    private String DevStatus;

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取产品名称
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * 设置产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * 获取列表Limit
     * @return Limit 列表Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置列表Limit
     * @param Limit 列表Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取列表Offset
     * @return Offset 列表Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置列表Offset
     * @param Offset 列表Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取产品Status
     * @return DevStatus 产品Status
     */
    public String getDevStatus() {
        return this.DevStatus;
    }

    /**
     * 设置产品Status
     * @param DevStatus 产品Status
     */
    public void setDevStatus(String DevStatus) {
        this.DevStatus = DevStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DevStatus", this.DevStatus);

    }
}

