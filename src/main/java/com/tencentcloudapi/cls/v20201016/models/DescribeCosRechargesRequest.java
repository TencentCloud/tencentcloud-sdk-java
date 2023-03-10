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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosRechargesRequest extends AbstractModel{

    /**
    * 日志主题 ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否启用:   0： 未启用  ， 1：启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 日志主题 ID 
     * @return TopicId 日志主题 ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题 ID
     * @param TopicId 日志主题 ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。 
     * @return Status 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
     * @param Status 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否启用:   0： 未启用  ， 1：启用 
     * @return Enable 是否启用:   0： 未启用  ， 1：启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用:   0： 未启用  ， 1：启用
     * @param Enable 是否启用:   0： 未启用  ， 1：启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public DescribeCosRechargesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosRechargesRequest(DescribeCosRechargesRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

