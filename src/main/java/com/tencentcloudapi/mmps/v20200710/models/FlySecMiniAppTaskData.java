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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlySecMiniAppTaskData extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 小程序appid
    */
    @SerializedName("MiniAppID")
    @Expose
    private String MiniAppID;

    /**
    * 小程序名称
    */
    @SerializedName("MiniAppName")
    @Expose
    private String MiniAppName;

    /**
    * 小程序版本
    */
    @SerializedName("MiniAppVersion")
    @Expose
    private String MiniAppVersion;

    /**
    * 诊断模式 1:基础诊断，2:深度诊断
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 诊断时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 诊断失败错误码
    */
    @SerializedName("Error")
    @Expose
    private Long Error;

    /**
     * Get 任务id 
     * @return TaskID 任务id
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务id
     * @param TaskID 任务id
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 小程序appid 
     * @return MiniAppID 小程序appid
     */
    public String getMiniAppID() {
        return this.MiniAppID;
    }

    /**
     * Set 小程序appid
     * @param MiniAppID 小程序appid
     */
    public void setMiniAppID(String MiniAppID) {
        this.MiniAppID = MiniAppID;
    }

    /**
     * Get 小程序名称 
     * @return MiniAppName 小程序名称
     */
    public String getMiniAppName() {
        return this.MiniAppName;
    }

    /**
     * Set 小程序名称
     * @param MiniAppName 小程序名称
     */
    public void setMiniAppName(String MiniAppName) {
        this.MiniAppName = MiniAppName;
    }

    /**
     * Get 小程序版本 
     * @return MiniAppVersion 小程序版本
     */
    public String getMiniAppVersion() {
        return this.MiniAppVersion;
    }

    /**
     * Set 小程序版本
     * @param MiniAppVersion 小程序版本
     */
    public void setMiniAppVersion(String MiniAppVersion) {
        this.MiniAppVersion = MiniAppVersion;
    }

    /**
     * Get 诊断模式 1:基础诊断，2:深度诊断 
     * @return Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 诊断模式 1:基础诊断，2:深度诊断
     * @param Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 诊断时间 
     * @return CreateTime 诊断时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 诊断时间
     * @param CreateTime 诊断时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中 
     * @return Status 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     * @param Status 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 诊断失败错误码 
     * @return Error 诊断失败错误码
     */
    public Long getError() {
        return this.Error;
    }

    /**
     * Set 诊断失败错误码
     * @param Error 诊断失败错误码
     */
    public void setError(Long Error) {
        this.Error = Error;
    }

    public FlySecMiniAppTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlySecMiniAppTaskData(FlySecMiniAppTaskData source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.MiniAppName != null) {
            this.MiniAppName = new String(source.MiniAppName);
        }
        if (source.MiniAppVersion != null) {
            this.MiniAppVersion = new String(source.MiniAppVersion);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Error != null) {
            this.Error = new Long(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "MiniAppName", this.MiniAppName);
        this.setParamSimple(map, prefix + "MiniAppVersion", this.MiniAppVersion);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

