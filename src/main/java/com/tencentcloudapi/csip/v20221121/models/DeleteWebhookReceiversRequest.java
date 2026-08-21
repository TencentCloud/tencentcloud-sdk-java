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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWebhookReceiversRequest extends AbstractModel {

    /**
    * 机器人 ID 列表
入参限制：单次最多 50 个
    */
    @SerializedName("IDList")
    @Expose
    private Long [] IDList;

    /**
     * Get 机器人 ID 列表
入参限制：单次最多 50 个 
     * @return IDList 机器人 ID 列表
入参限制：单次最多 50 个
     */
    public Long [] getIDList() {
        return this.IDList;
    }

    /**
     * Set 机器人 ID 列表
入参限制：单次最多 50 个
     * @param IDList 机器人 ID 列表
入参限制：单次最多 50 个
     */
    public void setIDList(Long [] IDList) {
        this.IDList = IDList;
    }

    public DeleteWebhookReceiversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWebhookReceiversRequest(DeleteWebhookReceiversRequest source) {
        if (source.IDList != null) {
            this.IDList = new Long[source.IDList.length];
            for (int i = 0; i < source.IDList.length; i++) {
                this.IDList[i] = new Long(source.IDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IDList.", this.IDList);

    }
}

