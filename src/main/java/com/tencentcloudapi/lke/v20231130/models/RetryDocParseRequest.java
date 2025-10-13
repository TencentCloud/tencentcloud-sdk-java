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

public class RetryDocParseRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 废弃
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 集合最大上限50个，DocBizIds有值使用DocBizIds，为空时则使用DocBizId(兼容废弃字段)
    */
    @SerializedName("DocBizIds")
    @Expose
    private String [] DocBizIds;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 废弃 
     * @return DocBizId 废弃
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 废弃
     * @param DocBizId 废弃
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 集合最大上限50个，DocBizIds有值使用DocBizIds，为空时则使用DocBizId(兼容废弃字段) 
     * @return DocBizIds 集合最大上限50个，DocBizIds有值使用DocBizIds，为空时则使用DocBizId(兼容废弃字段)
     */
    public String [] getDocBizIds() {
        return this.DocBizIds;
    }

    /**
     * Set 集合最大上限50个，DocBizIds有值使用DocBizIds，为空时则使用DocBizId(兼容废弃字段)
     * @param DocBizIds 集合最大上限50个，DocBizIds有值使用DocBizIds，为空时则使用DocBizId(兼容废弃字段)
     */
    public void setDocBizIds(String [] DocBizIds) {
        this.DocBizIds = DocBizIds;
    }

    public RetryDocParseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryDocParseRequest(RetryDocParseRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.DocBizIds != null) {
            this.DocBizIds = new String[source.DocBizIds.length];
            for (int i = 0; i < source.DocBizIds.length; i++) {
                this.DocBizIds[i] = new String(source.DocBizIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamArraySimple(map, prefix + "DocBizIds.", this.DocBizIds);

    }
}

