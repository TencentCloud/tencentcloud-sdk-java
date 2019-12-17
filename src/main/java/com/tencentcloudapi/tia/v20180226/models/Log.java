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
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Log extends AbstractModel{

    /**
    * 容器名
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 日志内容
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 空间名
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Pod Id
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * Pod名
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 日志日期，格式为“2018-07-02T09:10:04.916553368Z”
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get 容器名 
     * @return ContainerName 容器名
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名
     * @param ContainerName 容器名
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 日志内容 
     * @return Log 日志内容
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 日志内容
     * @param Log 日志内容
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 空间名 
     * @return Namespace 空间名
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 空间名
     * @param Namespace 空间名
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Pod Id 
     * @return PodId Pod Id
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set Pod Id
     * @param PodId Pod Id
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get Pod名 
     * @return PodName Pod名
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名
     * @param PodName Pod名
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 日志日期，格式为“2018-07-02T09:10:04.916553368Z” 
     * @return Time 日志日期，格式为“2018-07-02T09:10:04.916553368Z”
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日志日期，格式为“2018-07-02T09:10:04.916553368Z”
     * @param Time 日志日期，格式为“2018-07-02T09:10:04.916553368Z”
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

