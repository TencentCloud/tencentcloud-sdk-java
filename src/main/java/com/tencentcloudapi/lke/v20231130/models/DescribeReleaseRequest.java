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

public class DescribeReleaseRequest extends AbstractModel {

    /**
    * 应用ID。获取方法参看如何获取 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)  
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 发布ID
    */
    @SerializedName("ReleaseBizId")
    @Expose
    private String ReleaseBizId;

    /**
     * Get 应用ID。获取方法参看如何获取 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)   
     * @return BotBizId 应用ID。获取方法参看如何获取 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)  
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID。获取方法参看如何获取 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)  
     * @param BotBizId 应用ID。获取方法参看如何获取 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)  
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 发布ID 
     * @return ReleaseBizId 发布ID
     */
    public String getReleaseBizId() {
        return this.ReleaseBizId;
    }

    /**
     * Set 发布ID
     * @param ReleaseBizId 发布ID
     */
    public void setReleaseBizId(String ReleaseBizId) {
        this.ReleaseBizId = ReleaseBizId;
    }

    public DescribeReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseRequest(DescribeReleaseRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.ReleaseBizId != null) {
            this.ReleaseBizId = new String(source.ReleaseBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "ReleaseBizId", this.ReleaseBizId);

    }
}

