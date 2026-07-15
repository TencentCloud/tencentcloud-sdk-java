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

public class AgentTopicInfo extends AbstractModel {

    /**
    * <p>日志主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>主题对应的标识</p><p>Langfuse类型对应一个trace标识的日志主题</p>
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
     * Get <p>日志主题id</p> 
     * @return TopicId <p>日志主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p>
     * @param TopicId <p>日志主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>主题对应的标识</p><p>Langfuse类型对应一个trace标识的日志主题</p> 
     * @return Flag <p>主题对应的标识</p><p>Langfuse类型对应一个trace标识的日志主题</p>
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>主题对应的标识</p><p>Langfuse类型对应一个trace标识的日志主题</p>
     * @param Flag <p>主题对应的标识</p><p>Langfuse类型对应一个trace标识的日志主题</p>
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    public AgentTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentTopicInfo(AgentTopicInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);

    }
}

