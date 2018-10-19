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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DebugLogEntry  extends AbstractModel{

    /**
    * 日志id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 行为（事件）
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * shadow/action/mqtt, 分别表示：影子/规则引擎/上下线日志
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Integer Timestamp;

    /**
    * success/fail
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 日志详细内容
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 数据来源topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * 获取日志id
     * @return Id 日志id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置日志id
     * @param Id 日志id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取行为（事件）
     * @return Event 行为（事件）
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * 设置行为（事件）
     * @param Event 行为（事件）
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * 获取shadow/action/mqtt, 分别表示：影子/规则引擎/上下线日志
     * @return LogType shadow/action/mqtt, 分别表示：影子/规则引擎/上下线日志
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * 设置shadow/action/mqtt, 分别表示：影子/规则引擎/上下线日志
     * @param LogType shadow/action/mqtt, 分别表示：影子/规则引擎/上下线日志
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * 获取时间戳
     * @return Timestamp 时间戳
     */
    public Integer getTimestamp() {
        return this.Timestamp;
    }

    /**
     * 设置时间戳
     * @param Timestamp 时间戳
     */
    public void setTimestamp(Integer Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * 获取success/fail
     * @return Result success/fail
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * 设置success/fail
     * @param Result success/fail
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * 获取日志详细内容
     * @return Data 日志详细内容
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置日志详细内容
     * @param Data 日志详细内容
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * 获取数据来源topic
     * @return Topic 数据来源topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * 设置数据来源topic
     * @param Topic 数据来源topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * 获取设备名称
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

