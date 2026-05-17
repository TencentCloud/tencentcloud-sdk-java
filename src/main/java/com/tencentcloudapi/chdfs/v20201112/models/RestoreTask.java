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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreTask extends AbstractModel {

    /**
    * <p>回热任务ID</p>
    */
    @SerializedName("RestoreTaskId")
    @Expose
    private Long RestoreTaskId;

    /**
    * <p>回热任务文件路径，不支持目录和通配符</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>回热任务类型（1：标准；2：极速；3：批量，暂时仅支持标准）</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>指定恢复出的临时副本的有效时长（单位天）</p>
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * <p>回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>回热任务ID</p> 
     * @return RestoreTaskId <p>回热任务ID</p>
     */
    public Long getRestoreTaskId() {
        return this.RestoreTaskId;
    }

    /**
     * Set <p>回热任务ID</p>
     * @param RestoreTaskId <p>回热任务ID</p>
     */
    public void setRestoreTaskId(Long RestoreTaskId) {
        this.RestoreTaskId = RestoreTaskId;
    }

    /**
     * Get <p>回热任务文件路径，不支持目录和通配符</p> 
     * @return FilePath <p>回热任务文件路径，不支持目录和通配符</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>回热任务文件路径，不支持目录和通配符</p>
     * @param FilePath <p>回热任务文件路径，不支持目录和通配符</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>回热任务类型（1：标准；2：极速；3：批量，暂时仅支持标准）</p> 
     * @return Type <p>回热任务类型（1：标准；2：极速；3：批量，暂时仅支持标准）</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>回热任务类型（1：标准；2：极速；3：批量，暂时仅支持标准）</p>
     * @param Type <p>回热任务类型（1：标准；2：极速；3：批量，暂时仅支持标准）</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>指定恢复出的临时副本的有效时长（单位天）</p> 
     * @return Days <p>指定恢复出的临时副本的有效时长（单位天）</p>
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set <p>指定恢复出的临时副本的有效时长（单位天）</p>
     * @param Days <p>指定恢复出的临时副本的有效时长（单位天）</p>
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get <p>回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）</p> 
     * @return Status <p>回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）</p>
     * @param Status <p>回热任务状态（1：绑定文件中；2：绑定文件完成；3：文件回热中；4：文件回热完成）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
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

