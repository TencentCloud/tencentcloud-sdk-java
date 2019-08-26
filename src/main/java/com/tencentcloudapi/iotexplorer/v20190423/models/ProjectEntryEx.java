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

public class ProjectEntryEx  extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目描述
    */
    @SerializedName("ProjectDesc")
    @Expose
    private String ProjectDesc;

    /**
    * 项目创建时间，unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 项目更新时间，unix时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 产品数量
    */
    @SerializedName("ProductCount")
    @Expose
    private Long ProductCount;

    /**
    * NativeApp数量
    */
    @SerializedName("NativeAppCount")
    @Expose
    private Long NativeAppCount;

    /**
    * WebApp数量
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

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
     * 获取项目名称
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * 设置项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * 获取项目描述
     * @return ProjectDesc 项目描述
     */
    public String getProjectDesc() {
        return this.ProjectDesc;
    }

    /**
     * 设置项目描述
     * @param ProjectDesc 项目描述
     */
    public void setProjectDesc(String ProjectDesc) {
        this.ProjectDesc = ProjectDesc;
    }

    /**
     * 获取项目创建时间，unix时间戳
     * @return CreateTime 项目创建时间，unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置项目创建时间，unix时间戳
     * @param CreateTime 项目创建时间，unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取项目更新时间，unix时间戳
     * @return UpdateTime 项目更新时间，unix时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置项目更新时间，unix时间戳
     * @param UpdateTime 项目更新时间，unix时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取产品数量
     * @return ProductCount 产品数量
     */
    public Long getProductCount() {
        return this.ProductCount;
    }

    /**
     * 设置产品数量
     * @param ProductCount 产品数量
     */
    public void setProductCount(Long ProductCount) {
        this.ProductCount = ProductCount;
    }

    /**
     * 获取NativeApp数量
     * @return NativeAppCount NativeApp数量
     */
    public Long getNativeAppCount() {
        return this.NativeAppCount;
    }

    /**
     * 设置NativeApp数量
     * @param NativeAppCount NativeApp数量
     */
    public void setNativeAppCount(Long NativeAppCount) {
        this.NativeAppCount = NativeAppCount;
    }

    /**
     * 获取WebApp数量
     * @return WebAppCount WebApp数量
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * 设置WebApp数量
     * @param WebAppCount WebApp数量
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDesc", this.ProjectDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ProductCount", this.ProductCount);
        this.setParamSimple(map, prefix + "NativeAppCount", this.NativeAppCount);
        this.setParamSimple(map, prefix + "WebAppCount", this.WebAppCount);

    }
}

