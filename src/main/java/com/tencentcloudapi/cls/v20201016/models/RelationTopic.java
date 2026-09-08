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

public class RelationTopic extends AbstractModel {

    /**
    * <p>日志主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志主题名称</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>日志主题类型</p><p>枚举值：</p><ul><li>entity： 实体主题</li><li>relation： 关系主题</li><li>ebpf： ebpf采集主题</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
     * Get <p>日志主题名称</p> 
     * @return TopicName <p>日志主题名称</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>日志主题名称</p>
     * @param TopicName <p>日志主题名称</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>日志主题类型</p><p>枚举值：</p><ul><li>entity： 实体主题</li><li>relation： 关系主题</li><li>ebpf： ebpf采集主题</li></ul> 
     * @return Type <p>日志主题类型</p><p>枚举值：</p><ul><li>entity： 实体主题</li><li>relation： 关系主题</li><li>ebpf： ebpf采集主题</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>日志主题类型</p><p>枚举值：</p><ul><li>entity： 实体主题</li><li>relation： 关系主题</li><li>ebpf： ebpf采集主题</li></ul>
     * @param Type <p>日志主题类型</p><p>枚举值：</p><ul><li>entity： 实体主题</li><li>relation： 关系主题</li><li>ebpf： ebpf采集主题</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public RelationTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelationTopic(RelationTopic source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

