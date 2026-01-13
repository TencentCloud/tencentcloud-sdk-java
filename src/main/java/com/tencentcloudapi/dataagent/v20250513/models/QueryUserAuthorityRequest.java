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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryUserAuthorityRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分为知识库knowledge、数据源datasource、自定义场景scene
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 对象id,分为知识库id、数据源id、场景id
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

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
     * Get 分为知识库knowledge、数据源datasource、自定义场景scene 
     * @return Module 分为知识库knowledge、数据源datasource、自定义场景scene
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 分为知识库knowledge、数据源datasource、自定义场景scene
     * @param Module 分为知识库knowledge、数据源datasource、自定义场景scene
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 对象id,分为知识库id、数据源id、场景id 
     * @return ObjectId 对象id,分为知识库id、数据源id、场景id
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 对象id,分为知识库id、数据源id、场景id
     * @param ObjectId 对象id,分为知识库id、数据源id、场景id
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    public QueryUserAuthorityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryUserAuthorityRequest(QueryUserAuthorityRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);

    }
}

