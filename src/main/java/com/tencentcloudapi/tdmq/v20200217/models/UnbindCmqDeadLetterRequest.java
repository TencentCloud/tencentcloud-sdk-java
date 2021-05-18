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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindCmqDeadLetterRequest extends AbstractModel{

    /**
    * 死信策略源队列名称，调用本接口会清空该队列的死信队列策略。
    */
    @SerializedName("SourceQueueName")
    @Expose
    private String SourceQueueName;

    /**
     * Get 死信策略源队列名称，调用本接口会清空该队列的死信队列策略。 
     * @return SourceQueueName 死信策略源队列名称，调用本接口会清空该队列的死信队列策略。
     */
    public String getSourceQueueName() {
        return this.SourceQueueName;
    }

    /**
     * Set 死信策略源队列名称，调用本接口会清空该队列的死信队列策略。
     * @param SourceQueueName 死信策略源队列名称，调用本接口会清空该队列的死信队列策略。
     */
    public void setSourceQueueName(String SourceQueueName) {
        this.SourceQueueName = SourceQueueName;
    }

    public UnbindCmqDeadLetterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindCmqDeadLetterRequest(UnbindCmqDeadLetterRequest source) {
        if (source.SourceQueueName != null) {
            this.SourceQueueName = new String(source.SourceQueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceQueueName", this.SourceQueueName);

    }
}

