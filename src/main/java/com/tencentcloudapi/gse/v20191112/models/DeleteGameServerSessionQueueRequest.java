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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGameServerSessionQueueRequest extends AbstractModel {

    /**
    * 游戏服务器会话队列名字，长度1~128
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 游戏服务器会话队列名字，长度1~128 
     * @return Name 游戏服务器会话队列名字，长度1~128
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 游戏服务器会话队列名字，长度1~128
     * @param Name 游戏服务器会话队列名字，长度1~128
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DeleteGameServerSessionQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGameServerSessionQueueRequest(DeleteGameServerSessionQueueRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

