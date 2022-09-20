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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchLogTopicTaskRequest extends AbstractModel{

    /**
    * 推送任务的主题ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 是否开启推送，可选的动作有：
<li>true：开启推送任务；</li>
<li>false：关闭推送任务。</li>
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
     * Get 推送任务的主题ID。 
     * @return TopicId 推送任务的主题ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 推送任务的主题ID。
     * @param TopicId 推送任务的主题ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 是否开启推送，可选的动作有：
<li>true：开启推送任务；</li>
<li>false：关闭推送任务。</li> 
     * @return IsOpen 是否开启推送，可选的动作有：
<li>true：开启推送任务；</li>
<li>false：关闭推送任务。</li>
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 是否开启推送，可选的动作有：
<li>true：开启推送任务；</li>
<li>false：关闭推送任务。</li>
     * @param IsOpen 是否开启推送，可选的动作有：
<li>true：开启推送任务；</li>
<li>false：关闭推送任务。</li>
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    public SwitchLogTopicTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchLogTopicTaskRequest(SwitchLogTopicTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);

    }
}

