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

public class DeleteAppRequest extends AbstractModel {

    /**
    * 应用ID，获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 应用类型；`"knowledge_qa"` 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
     * Get 应用ID，获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。 
     * @return AppBizId 应用ID，获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID，获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
     * @param AppBizId 应用ID，获取方法参看如何获取   [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)。
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 应用类型；`"knowledge_qa"` 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式） 
     * @return AppType 应用类型；`"knowledge_qa"` 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型；`"knowledge_qa"` 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
     * @param AppType 应用类型；`"knowledge_qa"` 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    public DeleteAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAppRequest(DeleteAppRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);

    }
}

