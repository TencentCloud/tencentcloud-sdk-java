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

public class DeviceLogEntry  extends AbstractModel{

    /**
    * 日志id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 日志内容
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Integer Timestamp;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备动作
    */
    @SerializedName("Method")
    @Expose
    private String Method;

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
     * 获取日志内容
     * @return Msg 日志内容
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * 设置日志内容
     * @param Msg 日志内容
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * 获取状态码
     * @return Code 状态码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * 设置状态码
     * @param Code 状态码
     */
    public void setCode(String Code) {
        this.Code = Code;
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
     * 获取设备动作
     * @return Method 设备动作
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * 设置设备动作
     * @param Method 设备动作
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

