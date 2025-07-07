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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeNameRequest extends AbstractModel {

    /**
    * 数据订阅实例的ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 修改后的数据订阅实例的名称，长度限制为[1,60]
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
     * Get 数据订阅实例的ID 
     * @return SubscribeId 数据订阅实例的ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅实例的ID
     * @param SubscribeId 数据订阅实例的ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 修改后的数据订阅实例的名称，长度限制为[1,60] 
     * @return SubscribeName 修改后的数据订阅实例的名称，长度限制为[1,60]
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set 修改后的数据订阅实例的名称，长度限制为[1,60]
     * @param SubscribeName 修改后的数据订阅实例的名称，长度限制为[1,60]
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    public ModifySubscribeNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubscribeNameRequest(ModifySubscribeNameRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);

    }
}

