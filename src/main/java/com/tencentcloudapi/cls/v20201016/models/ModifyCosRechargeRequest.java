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

public class ModifyCosRechargeRequest extends AbstractModel{

    /**
    * COS导入配置ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 日志主题Id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * COS导入任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否启用:   0： 未启用  ， 1：启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get COS导入配置ID 
     * @return Id COS导入配置ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS导入配置ID
     * @param Id COS导入配置ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 日志主题Id 
     * @return TopicId 日志主题Id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题Id
     * @param TopicId 日志主题Id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get COS导入任务名称 
     * @return Name COS导入任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS导入任务名称
     * @param Name COS导入任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
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

    public ModifyCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosRechargeRequest(ModifyCosRechargeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

