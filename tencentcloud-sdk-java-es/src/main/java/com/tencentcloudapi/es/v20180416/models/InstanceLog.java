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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLog extends AbstractModel{

    /**
    * 日志时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 日志级别
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 集群节点ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 日志内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 日志时间 
     * @return Time 日志时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间
     * @param Time 日志时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 日志级别 
     * @return Level 日志级别
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志级别
     * @param Level 日志级别
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 集群节点ip 
     * @return Ip 集群节点ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 集群节点ip
     * @param Ip 集群节点ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 日志内容 
     * @return Message 日志内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 日志内容
     * @param Message 日志内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

