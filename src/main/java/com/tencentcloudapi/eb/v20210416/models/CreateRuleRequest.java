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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuleRequest extends AbstractModel{

    /**
    * 参考：[事件模式](https://cloud.tencent.com/document/product/1359/56084)
    */
    @SerializedName("EventPattern")
    @Expose
    private String EventPattern;

    /**
    * 事件集ID。
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 使能开关。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 事件集描述，不限字符类型，200字符描述以内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 参考：[事件模式](https://cloud.tencent.com/document/product/1359/56084) 
     * @return EventPattern 参考：[事件模式](https://cloud.tencent.com/document/product/1359/56084)
     */
    public String getEventPattern() {
        return this.EventPattern;
    }

    /**
     * Set 参考：[事件模式](https://cloud.tencent.com/document/product/1359/56084)
     * @param EventPattern 参考：[事件模式](https://cloud.tencent.com/document/product/1359/56084)
     */
    public void setEventPattern(String EventPattern) {
        this.EventPattern = EventPattern;
    }

    /**
     * Get 事件集ID。 
     * @return EventBusId 事件集ID。
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID。
     * @param EventBusId 事件集ID。
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符 
     * @return RuleName 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     * @param RuleName 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 使能开关。 
     * @return Enable 使能开关。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 使能开关。
     * @param Enable 使能开关。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 事件集描述，不限字符类型，200字符描述以内 
     * @return Description 事件集描述，不限字符类型，200字符描述以内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件集描述，不限字符类型，200字符描述以内
     * @param Description 事件集描述，不限字符类型，200字符描述以内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleRequest(CreateRuleRequest source) {
        if (source.EventPattern != null) {
            this.EventPattern = new String(source.EventPattern);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventPattern", this.EventPattern);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

