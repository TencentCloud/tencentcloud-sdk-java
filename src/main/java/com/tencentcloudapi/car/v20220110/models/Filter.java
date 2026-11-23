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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 过滤字段名（ApplicationId 应用Id、ApplicationName 应用名称、ApplicationRunStatus 运行状态、ApplicationUpdateStatus 更新状态）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤值集合（当过滤 Name 为 ApplicationRunStatus 时，Values 取值为 [ApplicationDeleting 应用删除中、ApplicationCreateFail 应用创建失败、ApplicationCreating 应用创建中、ApplicationRunning 正常运行、ApplicationNoConfigured 主执行程序路径未配置 ]。当过滤 Name 为 ApplicationUpdateStatus 时，Values 取值 [ApplicationUpdateCreating 版本创建中、ApplicationUpdateCreateFail 版本创建失败、ApplicationUpdateNoReleased 版本待发布、ApplicationUpdateReleased 版本发布完成、ApplicationUpdateNormal 无]）
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 过滤字段名（ApplicationId 应用Id、ApplicationName 应用名称、ApplicationRunStatus 运行状态、ApplicationUpdateStatus 更新状态） 
     * @return Name 过滤字段名（ApplicationId 应用Id、ApplicationName 应用名称、ApplicationRunStatus 运行状态、ApplicationUpdateStatus 更新状态）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤字段名（ApplicationId 应用Id、ApplicationName 应用名称、ApplicationRunStatus 运行状态、ApplicationUpdateStatus 更新状态）
     * @param Name 过滤字段名（ApplicationId 应用Id、ApplicationName 应用名称、ApplicationRunStatus 运行状态、ApplicationUpdateStatus 更新状态）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤值集合（当过滤 Name 为 ApplicationRunStatus 时，Values 取值为 [ApplicationDeleting 应用删除中、ApplicationCreateFail 应用创建失败、ApplicationCreating 应用创建中、ApplicationRunning 正常运行、ApplicationNoConfigured 主执行程序路径未配置 ]。当过滤 Name 为 ApplicationUpdateStatus 时，Values 取值 [ApplicationUpdateCreating 版本创建中、ApplicationUpdateCreateFail 版本创建失败、ApplicationUpdateNoReleased 版本待发布、ApplicationUpdateReleased 版本发布完成、ApplicationUpdateNormal 无]） 
     * @return Values 过滤值集合（当过滤 Name 为 ApplicationRunStatus 时，Values 取值为 [ApplicationDeleting 应用删除中、ApplicationCreateFail 应用创建失败、ApplicationCreating 应用创建中、ApplicationRunning 正常运行、ApplicationNoConfigured 主执行程序路径未配置 ]。当过滤 Name 为 ApplicationUpdateStatus 时，Values 取值 [ApplicationUpdateCreating 版本创建中、ApplicationUpdateCreateFail 版本创建失败、ApplicationUpdateNoReleased 版本待发布、ApplicationUpdateReleased 版本发布完成、ApplicationUpdateNormal 无]）
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤值集合（当过滤 Name 为 ApplicationRunStatus 时，Values 取值为 [ApplicationDeleting 应用删除中、ApplicationCreateFail 应用创建失败、ApplicationCreating 应用创建中、ApplicationRunning 正常运行、ApplicationNoConfigured 主执行程序路径未配置 ]。当过滤 Name 为 ApplicationUpdateStatus 时，Values 取值 [ApplicationUpdateCreating 版本创建中、ApplicationUpdateCreateFail 版本创建失败、ApplicationUpdateNoReleased 版本待发布、ApplicationUpdateReleased 版本发布完成、ApplicationUpdateNormal 无]）
     * @param Values 过滤值集合（当过滤 Name 为 ApplicationRunStatus 时，Values 取值为 [ApplicationDeleting 应用删除中、ApplicationCreateFail 应用创建失败、ApplicationCreating 应用创建中、ApplicationRunning 正常运行、ApplicationNoConfigured 主执行程序路径未配置 ]。当过滤 Name 为 ApplicationUpdateStatus 时，Values 取值 [ApplicationUpdateCreating 版本创建中、ApplicationUpdateCreateFail 版本创建失败、ApplicationUpdateNoReleased 版本待发布、ApplicationUpdateReleased 版本发布完成、ApplicationUpdateNormal 无]）
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

