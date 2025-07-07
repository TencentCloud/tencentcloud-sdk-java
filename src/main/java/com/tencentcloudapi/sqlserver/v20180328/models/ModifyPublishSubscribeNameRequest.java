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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPublishSubscribeNameRequest extends AbstractModel {

    /**
    * 发布订阅ID
    */
    @SerializedName("PublishSubscribeId")
    @Expose
    private Long PublishSubscribeId;

    /**
    * 待修改的发布订阅名称
    */
    @SerializedName("PublishSubscribeName")
    @Expose
    private String PublishSubscribeName;

    /**
     * Get 发布订阅ID 
     * @return PublishSubscribeId 发布订阅ID
     */
    public Long getPublishSubscribeId() {
        return this.PublishSubscribeId;
    }

    /**
     * Set 发布订阅ID
     * @param PublishSubscribeId 发布订阅ID
     */
    public void setPublishSubscribeId(Long PublishSubscribeId) {
        this.PublishSubscribeId = PublishSubscribeId;
    }

    /**
     * Get 待修改的发布订阅名称 
     * @return PublishSubscribeName 待修改的发布订阅名称
     */
    public String getPublishSubscribeName() {
        return this.PublishSubscribeName;
    }

    /**
     * Set 待修改的发布订阅名称
     * @param PublishSubscribeName 待修改的发布订阅名称
     */
    public void setPublishSubscribeName(String PublishSubscribeName) {
        this.PublishSubscribeName = PublishSubscribeName;
    }

    public ModifyPublishSubscribeNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPublishSubscribeNameRequest(ModifyPublishSubscribeNameRequest source) {
        if (source.PublishSubscribeId != null) {
            this.PublishSubscribeId = new Long(source.PublishSubscribeId);
        }
        if (source.PublishSubscribeName != null) {
            this.PublishSubscribeName = new String(source.PublishSubscribeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishSubscribeId", this.PublishSubscribeId);
        this.setParamSimple(map, prefix + "PublishSubscribeName", this.PublishSubscribeName);

    }
}

