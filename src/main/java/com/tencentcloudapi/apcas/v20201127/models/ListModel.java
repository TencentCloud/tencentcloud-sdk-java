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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListModel extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务起始时间（13位数字的UNIX 时间戳，单位毫秒 ）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 画像覆盖人数
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * 任务失败描述信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 任务ID 
     * @return ID 任务ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 任务ID
     * @param ID 任务ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务起始时间（13位数字的UNIX 时间戳，单位毫秒 ） 
     * @return StartTime 任务起始时间（13位数字的UNIX 时间戳，单位毫秒 ）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务起始时间（13位数字的UNIX 时间戳，单位毫秒 ）
     * @param StartTime 任务起始时间（13位数字的UNIX 时间戳，单位毫秒 ）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败 
     * @return Status 任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
     * @param Status 任务状态 0:默认状态 1:任务正在运行 2:任务运行成功 3:任务运行失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 画像覆盖人数 
     * @return Available 画像覆盖人数
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 画像覆盖人数
     * @param Available 画像覆盖人数
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get 任务失败描述信息 
     * @return ErrMsg 任务失败描述信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 任务失败描述信息
     * @param ErrMsg 任务失败描述信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public ListModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListModel(ListModel source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

