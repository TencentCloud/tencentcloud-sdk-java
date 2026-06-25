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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWConsumerGroupBrief extends AbstractModel {

    /**
    * <p>消费者组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>消费者组Id</p>
    */
    @SerializedName("ConsumerGroupId")
    @Expose
    private String ConsumerGroupId;

    /**
     * Get <p>消费者组名称</p> 
     * @return Name <p>消费者组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>消费者组名称</p>
     * @param Name <p>消费者组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>消费者组Id</p> 
     * @return ConsumerGroupId <p>消费者组Id</p>
     */
    public String getConsumerGroupId() {
        return this.ConsumerGroupId;
    }

    /**
     * Set <p>消费者组Id</p>
     * @param ConsumerGroupId <p>消费者组Id</p>
     */
    public void setConsumerGroupId(String ConsumerGroupId) {
        this.ConsumerGroupId = ConsumerGroupId;
    }

    public AIGWConsumerGroupBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWConsumerGroupBrief(AIGWConsumerGroupBrief source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ConsumerGroupId != null) {
            this.ConsumerGroupId = new String(source.ConsumerGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ConsumerGroupId", this.ConsumerGroupId);

    }
}

