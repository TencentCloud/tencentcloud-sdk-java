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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkflowRunRequest extends AbstractModel {

    /**
    * 运行环境。0: 测试环境； 1: 正式环境
    */
    @SerializedName("RunEnv")
    @Expose
    private Long RunEnv;

    /**
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 用户输入的内容
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * API参数配置
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
     * Get 运行环境。0: 测试环境； 1: 正式环境 
     * @return RunEnv 运行环境。0: 测试环境； 1: 正式环境
     */
    public Long getRunEnv() {
        return this.RunEnv;
    }

    /**
     * Set 运行环境。0: 测试环境； 1: 正式环境
     * @param RunEnv 运行环境。0: 测试环境； 1: 正式环境
     */
    public void setRunEnv(Long RunEnv) {
        this.RunEnv = RunEnv;
    }

    /**
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 用户输入的内容 
     * @return Query 用户输入的内容
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 用户输入的内容
     * @param Query 用户输入的内容
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get API参数配置 
     * @return CustomVariables API参数配置
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set API参数配置
     * @param CustomVariables API参数配置
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    public CreateWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkflowRunRequest(CreateWorkflowRunRequest source) {
        if (source.RunEnv != null) {
            this.RunEnv = new Long(source.RunEnv);
        }
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunEnv", this.RunEnv);
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);

    }
}

