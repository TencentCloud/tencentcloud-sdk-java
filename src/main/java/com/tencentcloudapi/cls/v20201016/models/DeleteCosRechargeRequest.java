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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCosRechargeRequest extends AbstractModel {

    /**
    * COS导入配置Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 日志主题Id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get COS导入配置Id 
     * @return Id COS导入配置Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS导入配置Id
     * @param Id COS导入配置Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 日志主题Id 
     * @return TopicId 日志主题Id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题Id
     * @param TopicId 日志主题Id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public DeleteCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCosRechargeRequest(DeleteCosRechargeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

