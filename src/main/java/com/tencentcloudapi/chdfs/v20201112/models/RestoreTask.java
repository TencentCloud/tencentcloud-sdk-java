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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreTask extends AbstractModel{

    /**
    * 回热任务ID
    */
    @SerializedName("RestoreTaskId")
    @Expose
    private Long RestoreTaskId;

    /**
    * 回热任务文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 回热任务类型（1：标准；2：极速；3：批量，暂时仅支持极速）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 指定恢复出的临时副本的有效时长（单位天）
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * 回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 回热任务ID 
     * @return RestoreTaskId 回热任务ID
     */
    public Long getRestoreTaskId() {
        return this.RestoreTaskId;
    }

    /**
     * Set 回热任务ID
     * @param RestoreTaskId 回热任务ID
     */
    public void setRestoreTaskId(Long RestoreTaskId) {
        this.RestoreTaskId = RestoreTaskId;
    }

    /**
     * Get 回热任务文件路径 
     * @return FilePath 回热任务文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 回热任务文件路径
     * @param FilePath 回热任务文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 回热任务类型（1：标准；2：极速；3：批量，暂时仅支持极速） 
     * @return Type 回热任务类型（1：标准；2：极速；3：批量，暂时仅支持极速）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 回热任务类型（1：标准；2：极速；3：批量，暂时仅支持极速）
     * @param Type 回热任务类型（1：标准；2：极速；3：批量，暂时仅支持极速）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 指定恢复出的临时副本的有效时长（单位天） 
     * @return Days 指定恢复出的临时副本的有效时长（单位天）
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set 指定恢复出的临时副本的有效时长（单位天）
     * @param Days 指定恢复出的临时副本的有效时长（单位天）
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get 回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成） 
     * @return Status 回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）
     * @param Status 回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public RestoreTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreTask(RestoreTask source) {
        if (source.RestoreTaskId != null) {
            this.RestoreTaskId = new Long(source.RestoreTaskId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Days != null) {
            this.Days = new Long(source.Days);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RestoreTaskId", this.RestoreTaskId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

