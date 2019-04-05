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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo  extends AbstractModel{

    /**
    * 日志名称。
    */
    @SerializedName("LogName")
    @Expose
    private String LogName;

    /**
    * 日志Url。
    */
    @SerializedName("LogUrl")
    @Expose
    private String LogUrl;

    /**
    * 日志生成时间
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
     * 获取日志名称。
     * @return LogName 日志名称。
     */
    public String getLogName() {
        return this.LogName;
    }

    /**
     * 设置日志名称。
     * @param LogName 日志名称。
     */
    public void setLogName(String LogName) {
        this.LogName = LogName;
    }

    /**
     * 获取日志Url。
     * @return LogUrl 日志Url。
     */
    public String getLogUrl() {
        return this.LogUrl;
    }

    /**
     * 设置日志Url。
     * @param LogUrl 日志Url。
     */
    public void setLogUrl(String LogUrl) {
        this.LogUrl = LogUrl;
    }

    /**
     * 获取日志生成时间
     * @return LogTime 日志生成时间
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * 设置日志生成时间
     * @param LogTime 日志生成时间
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogName", this.LogName);
        this.setParamSimple(map, prefix + "LogUrl", this.LogUrl);
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);

    }
}

