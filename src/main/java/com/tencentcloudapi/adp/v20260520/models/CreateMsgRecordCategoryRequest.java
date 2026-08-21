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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMsgRecordCategoryRequest extends AbstractModel {

    /**
    * <p>分类名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>父分类业务 ID，0 表示一级分类（未分类）</p>
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
     * Get <p>分类名称</p> 
     * @return Name <p>分类名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分类名称</p>
     * @param Name <p>分类名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>父分类业务 ID，0 表示一级分类（未分类）</p> 
     * @return ParentId <p>父分类业务 ID，0 表示一级分类（未分类）</p>
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>父分类业务 ID，0 表示一级分类（未分类）</p>
     * @param ParentId <p>父分类业务 ID，0 表示一级分类（未分类）</p>
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    public CreateMsgRecordCategoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMsgRecordCategoryRequest(CreateMsgRecordCategoryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

