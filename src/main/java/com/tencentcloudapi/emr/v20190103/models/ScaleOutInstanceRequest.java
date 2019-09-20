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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceRequest  extends AbstractModel{

    /**
    * 时间单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 时间长度
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 扩容实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 付费类型
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * Token
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 预执行脚本设置
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * 扩容Task节点数量
    */
    @SerializedName("TaskCount")
    @Expose
    private Integer TaskCount;

    /**
    * 扩容Core节点数量
    */
    @SerializedName("CoreCount")
    @Expose
    private Integer CoreCount;

    /**
    * 扩容时不需要安装的进程
    */
    @SerializedName("UnNecessaryNodeList")
    @Expose
    private Integer [] UnNecessaryNodeList;

    /**
     * 获取时间单位
     * @return TimeUnit 时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置时间单位
     * @param TimeUnit 时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取时间长度
     * @return TimeSpan 时间长度
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置时间长度
     * @param TimeSpan 时间长度
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取扩容实例ID
     * @return InstanceId 扩容实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置扩容实例ID
     * @param InstanceId 扩容实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取付费类型
     * @return PayMode 付费类型
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置付费类型
     * @param PayMode 付费类型
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取Token
     * @return ClientToken Token
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * 设置Token
     * @param ClientToken Token
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * 获取预执行脚本设置
     * @return PreExecutedFileSettings 预执行脚本设置
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * 设置预执行脚本设置
     * @param PreExecutedFileSettings 预执行脚本设置
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * 获取扩容Task节点数量
     * @return TaskCount 扩容Task节点数量
     */
    public Integer getTaskCount() {
        return this.TaskCount;
    }

    /**
     * 设置扩容Task节点数量
     * @param TaskCount 扩容Task节点数量
     */
    public void setTaskCount(Integer TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * 获取扩容Core节点数量
     * @return CoreCount 扩容Core节点数量
     */
    public Integer getCoreCount() {
        return this.CoreCount;
    }

    /**
     * 设置扩容Core节点数量
     * @param CoreCount 扩容Core节点数量
     */
    public void setCoreCount(Integer CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * 获取扩容时不需要安装的进程
     * @return UnNecessaryNodeList 扩容时不需要安装的进程
     */
    public Integer [] getUnNecessaryNodeList() {
        return this.UnNecessaryNodeList;
    }

    /**
     * 设置扩容时不需要安装的进程
     * @param UnNecessaryNodeList 扩容时不需要安装的进程
     */
    public void setUnNecessaryNodeList(Integer [] UnNecessaryNodeList) {
        this.UnNecessaryNodeList = UnNecessaryNodeList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamArraySimple(map, prefix + "UnNecessaryNodeList.", this.UnNecessaryNodeList);

    }
}

