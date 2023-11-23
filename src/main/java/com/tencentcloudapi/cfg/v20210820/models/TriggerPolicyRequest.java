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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerPolicyRequest extends AbstractModel {

    /**
    * 混沌演练ID

    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 触发内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 触发类型，0--触发；1--恢复
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get 混沌演练ID
 
     * @return TaskId 混沌演练ID

     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 混沌演练ID

     * @param TaskId 混沌演练ID

     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 触发内容 
     * @return Content 触发内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 触发内容
     * @param Content 触发内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 触发类型，0--触发；1--恢复 
     * @return TriggerType 触发类型，0--触发；1--恢复
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型，0--触发；1--恢复
     * @param TriggerType 触发类型，0--触发；1--恢复
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    public TriggerPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerPolicyRequest(TriggerPolicyRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

