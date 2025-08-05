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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiffConfigItem extends AbstractModel {

    /**
    * 配置项 Key
MinNum 最小副本数
MaxNum 最大副本数
PolicyDetails 扩缩容策略
AccessTypes 访问类型
TimerScale 定时扩缩容
InternalAccess 内网访问
OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale
SessionAffinity 会话亲和性 open | close
CpuSpecs cpu 规格
MemSpecs mem规格
EnvParam 环境变量
LogPath 日志采集路径
Port 端口
Dockerfile dockerfile 文件名
BuildDir 目标目录
Tag 服务标签
LogType 日志类型 none | default | custom 
LogSetId 日志集Id
LogTopicId 日志主题ID
LogParseType 日志解析类型 json ｜ line
EntryPoint entrypoint 命令
Cmd cmd命令
VpcConf 网络信息
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 字符串类型配置项值
InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * int 类型配置项值
MinNum、MaxNum、Port
    */
    @SerializedName("IntValue")
    @Expose
    private Long IntValue;

    /**
    * bool 类型配置项值
    */
    @SerializedName("BoolValue")
    @Expose
    private Boolean BoolValue;

    /**
    * 浮点型配置项值
CpuSpecs、MemSpecs
    */
    @SerializedName("FloatValue")
    @Expose
    private Float FloatValue;

    /**
    * 字符串数组配置项值
AccessTypes，EntryPoint，Cmd
    */
    @SerializedName("ArrayValue")
    @Expose
    private String [] ArrayValue;

    /**
    * 扩缩容策略配置项值
    */
    @SerializedName("PolicyDetails")
    @Expose
    private HpaPolicy [] PolicyDetails;

    /**
    * 定时扩缩容配置项值
    */
    @SerializedName("TimerScale")
    @Expose
    private TimerScale [] TimerScale;

    /**
    * 配置内网访问时网络信息
    */
    @SerializedName("VpcConf")
    @Expose
    private VpcConf VpcConf;

    /**
     * Get 配置项 Key
MinNum 最小副本数
MaxNum 最大副本数
PolicyDetails 扩缩容策略
AccessTypes 访问类型
TimerScale 定时扩缩容
InternalAccess 内网访问
OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale
SessionAffinity 会话亲和性 open | close
CpuSpecs cpu 规格
MemSpecs mem规格
EnvParam 环境变量
LogPath 日志采集路径
Port 端口
Dockerfile dockerfile 文件名
BuildDir 目标目录
Tag 服务标签
LogType 日志类型 none | default | custom 
LogSetId 日志集Id
LogTopicId 日志主题ID
LogParseType 日志解析类型 json ｜ line
EntryPoint entrypoint 命令
Cmd cmd命令
VpcConf 网络信息 
     * @return Key 配置项 Key
MinNum 最小副本数
MaxNum 最大副本数
PolicyDetails 扩缩容策略
AccessTypes 访问类型
TimerScale 定时扩缩容
InternalAccess 内网访问
OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale
SessionAffinity 会话亲和性 open | close
CpuSpecs cpu 规格
MemSpecs mem规格
EnvParam 环境变量
LogPath 日志采集路径
Port 端口
Dockerfile dockerfile 文件名
BuildDir 目标目录
Tag 服务标签
LogType 日志类型 none | default | custom 
LogSetId 日志集Id
LogTopicId 日志主题ID
LogParseType 日志解析类型 json ｜ line
EntryPoint entrypoint 命令
Cmd cmd命令
VpcConf 网络信息
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 配置项 Key
MinNum 最小副本数
MaxNum 最大副本数
PolicyDetails 扩缩容策略
AccessTypes 访问类型
TimerScale 定时扩缩容
InternalAccess 内网访问
OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale
SessionAffinity 会话亲和性 open | close
CpuSpecs cpu 规格
MemSpecs mem规格
EnvParam 环境变量
LogPath 日志采集路径
Port 端口
Dockerfile dockerfile 文件名
BuildDir 目标目录
Tag 服务标签
LogType 日志类型 none | default | custom 
LogSetId 日志集Id
LogTopicId 日志主题ID
LogParseType 日志解析类型 json ｜ line
EntryPoint entrypoint 命令
Cmd cmd命令
VpcConf 网络信息
     * @param Key 配置项 Key
MinNum 最小副本数
MaxNum 最大副本数
PolicyDetails 扩缩容策略
AccessTypes 访问类型
TimerScale 定时扩缩容
InternalAccess 内网访问
OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale
SessionAffinity 会话亲和性 open | close
CpuSpecs cpu 规格
MemSpecs mem规格
EnvParam 环境变量
LogPath 日志采集路径
Port 端口
Dockerfile dockerfile 文件名
BuildDir 目标目录
Tag 服务标签
LogType 日志类型 none | default | custom 
LogSetId 日志集Id
LogTopicId 日志主题ID
LogParseType 日志解析类型 json ｜ line
EntryPoint entrypoint 命令
Cmd cmd命令
VpcConf 网络信息
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 字符串类型配置项值
InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType 
     * @return Value 字符串类型配置项值
InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 字符串类型配置项值
InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType
     * @param Value 字符串类型配置项值
InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get int 类型配置项值
MinNum、MaxNum、Port 
     * @return IntValue int 类型配置项值
MinNum、MaxNum、Port
     */
    public Long getIntValue() {
        return this.IntValue;
    }

    /**
     * Set int 类型配置项值
MinNum、MaxNum、Port
     * @param IntValue int 类型配置项值
MinNum、MaxNum、Port
     */
    public void setIntValue(Long IntValue) {
        this.IntValue = IntValue;
    }

    /**
     * Get bool 类型配置项值 
     * @return BoolValue bool 类型配置项值
     */
    public Boolean getBoolValue() {
        return this.BoolValue;
    }

    /**
     * Set bool 类型配置项值
     * @param BoolValue bool 类型配置项值
     */
    public void setBoolValue(Boolean BoolValue) {
        this.BoolValue = BoolValue;
    }

    /**
     * Get 浮点型配置项值
CpuSpecs、MemSpecs 
     * @return FloatValue 浮点型配置项值
CpuSpecs、MemSpecs
     */
    public Float getFloatValue() {
        return this.FloatValue;
    }

    /**
     * Set 浮点型配置项值
CpuSpecs、MemSpecs
     * @param FloatValue 浮点型配置项值
CpuSpecs、MemSpecs
     */
    public void setFloatValue(Float FloatValue) {
        this.FloatValue = FloatValue;
    }

    /**
     * Get 字符串数组配置项值
AccessTypes，EntryPoint，Cmd 
     * @return ArrayValue 字符串数组配置项值
AccessTypes，EntryPoint，Cmd
     */
    public String [] getArrayValue() {
        return this.ArrayValue;
    }

    /**
     * Set 字符串数组配置项值
AccessTypes，EntryPoint，Cmd
     * @param ArrayValue 字符串数组配置项值
AccessTypes，EntryPoint，Cmd
     */
    public void setArrayValue(String [] ArrayValue) {
        this.ArrayValue = ArrayValue;
    }

    /**
     * Get 扩缩容策略配置项值 
     * @return PolicyDetails 扩缩容策略配置项值
     */
    public HpaPolicy [] getPolicyDetails() {
        return this.PolicyDetails;
    }

    /**
     * Set 扩缩容策略配置项值
     * @param PolicyDetails 扩缩容策略配置项值
     */
    public void setPolicyDetails(HpaPolicy [] PolicyDetails) {
        this.PolicyDetails = PolicyDetails;
    }

    /**
     * Get 定时扩缩容配置项值 
     * @return TimerScale 定时扩缩容配置项值
     */
    public TimerScale [] getTimerScale() {
        return this.TimerScale;
    }

    /**
     * Set 定时扩缩容配置项值
     * @param TimerScale 定时扩缩容配置项值
     */
    public void setTimerScale(TimerScale [] TimerScale) {
        this.TimerScale = TimerScale;
    }

    /**
     * Get 配置内网访问时网络信息 
     * @return VpcConf 配置内网访问时网络信息
     */
    public VpcConf getVpcConf() {
        return this.VpcConf;
    }

    /**
     * Set 配置内网访问时网络信息
     * @param VpcConf 配置内网访问时网络信息
     */
    public void setVpcConf(VpcConf VpcConf) {
        this.VpcConf = VpcConf;
    }

    public DiffConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffConfigItem(DiffConfigItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.IntValue != null) {
            this.IntValue = new Long(source.IntValue);
        }
        if (source.BoolValue != null) {
            this.BoolValue = new Boolean(source.BoolValue);
        }
        if (source.FloatValue != null) {
            this.FloatValue = new Float(source.FloatValue);
        }
        if (source.ArrayValue != null) {
            this.ArrayValue = new String[source.ArrayValue.length];
            for (int i = 0; i < source.ArrayValue.length; i++) {
                this.ArrayValue[i] = new String(source.ArrayValue[i]);
            }
        }
        if (source.PolicyDetails != null) {
            this.PolicyDetails = new HpaPolicy[source.PolicyDetails.length];
            for (int i = 0; i < source.PolicyDetails.length; i++) {
                this.PolicyDetails[i] = new HpaPolicy(source.PolicyDetails[i]);
            }
        }
        if (source.TimerScale != null) {
            this.TimerScale = new TimerScale[source.TimerScale.length];
            for (int i = 0; i < source.TimerScale.length; i++) {
                this.TimerScale[i] = new TimerScale(source.TimerScale[i]);
            }
        }
        if (source.VpcConf != null) {
            this.VpcConf = new VpcConf(source.VpcConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "IntValue", this.IntValue);
        this.setParamSimple(map, prefix + "BoolValue", this.BoolValue);
        this.setParamSimple(map, prefix + "FloatValue", this.FloatValue);
        this.setParamArraySimple(map, prefix + "ArrayValue.", this.ArrayValue);
        this.setParamArrayObj(map, prefix + "PolicyDetails.", this.PolicyDetails);
        this.setParamArrayObj(map, prefix + "TimerScale.", this.TimerScale);
        this.setParamObj(map, prefix + "VpcConf.", this.VpcConf);

    }
}

