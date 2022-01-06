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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySceneRequest extends AbstractModel{

    /**
    * 场景ID
    */
    @SerializedName("IntId")
    @Expose
    private Long IntId;

    /**
    * 场景名称
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 触发条件
    */
    @SerializedName("SceneTrigger")
    @Expose
    private String SceneTrigger;

    /**
    * 录制时长(秒)
    */
    @SerializedName("RecordDuration")
    @Expose
    private Long RecordDuration;

    /**
     * Get 场景ID 
     * @return IntId 场景ID
     */
    public Long getIntId() {
        return this.IntId;
    }

    /**
     * Set 场景ID
     * @param IntId 场景ID
     */
    public void setIntId(Long IntId) {
        this.IntId = IntId;
    }

    /**
     * Get 场景名称 
     * @return SceneName 场景名称
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名称
     * @param SceneName 场景名称
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 触发条件 
     * @return SceneTrigger 触发条件
     */
    public String getSceneTrigger() {
        return this.SceneTrigger;
    }

    /**
     * Set 触发条件
     * @param SceneTrigger 触发条件
     */
    public void setSceneTrigger(String SceneTrigger) {
        this.SceneTrigger = SceneTrigger;
    }

    /**
     * Get 录制时长(秒) 
     * @return RecordDuration 录制时长(秒)
     */
    public Long getRecordDuration() {
        return this.RecordDuration;
    }

    /**
     * Set 录制时长(秒)
     * @param RecordDuration 录制时长(秒)
     */
    public void setRecordDuration(Long RecordDuration) {
        this.RecordDuration = RecordDuration;
    }

    public ModifySceneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySceneRequest(ModifySceneRequest source) {
        if (source.IntId != null) {
            this.IntId = new Long(source.IntId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.SceneTrigger != null) {
            this.SceneTrigger = new String(source.SceneTrigger);
        }
        if (source.RecordDuration != null) {
            this.RecordDuration = new Long(source.RecordDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntId", this.IntId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "SceneTrigger", this.SceneTrigger);
        this.setParamSimple(map, prefix + "RecordDuration", this.RecordDuration);

    }
}

