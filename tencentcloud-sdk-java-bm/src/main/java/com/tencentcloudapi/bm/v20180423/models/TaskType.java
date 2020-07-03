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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskType extends AbstractModel{

    /**
    * 故障类ID
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 故障类中文名
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 故障类型父类
    */
    @SerializedName("TaskSubType")
    @Expose
    private String TaskSubType;

    /**
     * Get 故障类ID 
     * @return TypeId 故障类ID
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 故障类ID
     * @param TypeId 故障类ID
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 故障类中文名 
     * @return TypeName 故障类中文名
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 故障类中文名
     * @param TypeName 故障类中文名
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 故障类型父类 
     * @return TaskSubType 故障类型父类
     */
    public String getTaskSubType() {
        return this.TaskSubType;
    }

    /**
     * Set 故障类型父类
     * @param TaskSubType 故障类型父类
     */
    public void setTaskSubType(String TaskSubType) {
        this.TaskSubType = TaskSubType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "TaskSubType", this.TaskSubType);

    }
}

