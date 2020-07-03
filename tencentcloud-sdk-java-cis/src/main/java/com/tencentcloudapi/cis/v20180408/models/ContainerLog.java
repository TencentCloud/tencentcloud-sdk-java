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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerLog extends AbstractModel{

    /**
    * 容器名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 日志
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 日志记录时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get 容器名称 
     * @return Name 容器名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 容器名称
     * @param Name 容器名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 日志 
     * @return Log 日志
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 日志
     * @param Log 日志
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 日志记录时间 
     * @return Time 日志记录时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日志记录时间
     * @param Time 日志记录时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

