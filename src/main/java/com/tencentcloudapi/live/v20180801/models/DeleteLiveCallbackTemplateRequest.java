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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveCallbackTemplateRequest extends AbstractModel{

    /**
    * 模板 ID。
1. 在创建回调模板接口 [CreateLiveCallbackTemplate](/document/product/267/32637) 调用的返回值中获取模板 ID。
2. 可以从接口 [DescribeLiveCallbackTemplates](/document/product/267/32632) 查询已经创建的过的模板列表。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get 模板 ID。
1. 在创建回调模板接口 [CreateLiveCallbackTemplate](/document/product/267/32637) 调用的返回值中获取模板 ID。
2. 可以从接口 [DescribeLiveCallbackTemplates](/document/product/267/32632) 查询已经创建的过的模板列表。 
     * @return TemplateId 模板 ID。
1. 在创建回调模板接口 [CreateLiveCallbackTemplate](/document/product/267/32637) 调用的返回值中获取模板 ID。
2. 可以从接口 [DescribeLiveCallbackTemplates](/document/product/267/32632) 查询已经创建的过的模板列表。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID。
1. 在创建回调模板接口 [CreateLiveCallbackTemplate](/document/product/267/32637) 调用的返回值中获取模板 ID。
2. 可以从接口 [DescribeLiveCallbackTemplates](/document/product/267/32632) 查询已经创建的过的模板列表。
     * @param TemplateId 模板 ID。
1. 在创建回调模板接口 [CreateLiveCallbackTemplate](/document/product/267/32637) 调用的返回值中获取模板 ID。
2. 可以从接口 [DescribeLiveCallbackTemplates](/document/product/267/32632) 查询已经创建的过的模板列表。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

