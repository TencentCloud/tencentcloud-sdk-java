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
    * <p>配置项 Key<br>MinNum 最小副本数<br>MaxNum 最大副本数<br>PolicyDetails 扩缩容策略<br>AccessTypes 访问类型<br>TimerScale 定时扩缩容<br>InternalAccess 内网访问<br>OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale<br>SessionAffinity 会话亲和性 open | close<br>CpuSpecs cpu 规格<br>MemSpecs mem规格<br>EnvParam 环境变量<br>LogPath 日志采集路径<br>Port 端口<br>Dockerfile dockerfile 文件名<br>BuildDir 目标目录<br>Tag 服务标签<br>LogType 日志类型 none | default | custom<br>LogSetId 日志集Id<br>LogTopicId 日志主题ID<br>LogParseType 日志解析类型 json ｜ line<br>EntryPoint entrypoint 命令<br>Cmd cmd命令<br>VpcConf 网络信息</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>字符串类型配置项值<br>InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>int 类型配置项值<br>MinNum、MaxNum、Port</p>
    */
    @SerializedName("IntValue")
    @Expose
    private Long IntValue;

    /**
    * <p>bool 类型配置项值</p>
    */
    @SerializedName("BoolValue")
    @Expose
    private Boolean BoolValue;

    /**
    * <p>浮点型配置项值<br>CpuSpecs、MemSpecs</p>
    */
    @SerializedName("FloatValue")
    @Expose
    private Float FloatValue;

    /**
    * <p>字符串数组配置项值<br>AccessTypes，EntryPoint，Cmd</p>
    */
    @SerializedName("ArrayValue")
    @Expose
    private String [] ArrayValue;

    /**
    * <p>扩缩容策略配置项值</p>
    */
    @SerializedName("PolicyDetails")
    @Expose
    private HpaPolicy [] PolicyDetails;

    /**
    * <p>定时扩缩容配置项值</p>
    */
    @SerializedName("TimerScale")
    @Expose
    private TimerScale [] TimerScale;

    /**
    * <p>配置内网访问时网络信息</p>
    */
    @SerializedName("VpcConf")
    @Expose
    private VpcConf VpcConf;

    /**
    * <p>存储配置信息</p>
    */
    @SerializedName("VolumesConf")
    @Expose
    private VolumeConf [] VolumesConf;

    /**
    * <p>公网访问配置</p>
    */
    @SerializedName("PublicNetConf")
    @Expose
    private PublicNetConf PublicNetConf;

    /**
     * Get <p>配置项 Key<br>MinNum 最小副本数<br>MaxNum 最大副本数<br>PolicyDetails 扩缩容策略<br>AccessTypes 访问类型<br>TimerScale 定时扩缩容<br>InternalAccess 内网访问<br>OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale<br>SessionAffinity 会话亲和性 open | close<br>CpuSpecs cpu 规格<br>MemSpecs mem规格<br>EnvParam 环境变量<br>LogPath 日志采集路径<br>Port 端口<br>Dockerfile dockerfile 文件名<br>BuildDir 目标目录<br>Tag 服务标签<br>LogType 日志类型 none | default | custom<br>LogSetId 日志集Id<br>LogTopicId 日志主题ID<br>LogParseType 日志解析类型 json ｜ line<br>EntryPoint entrypoint 命令<br>Cmd cmd命令<br>VpcConf 网络信息</p> 
     * @return Key <p>配置项 Key<br>MinNum 最小副本数<br>MaxNum 最大副本数<br>PolicyDetails 扩缩容策略<br>AccessTypes 访问类型<br>TimerScale 定时扩缩容<br>InternalAccess 内网访问<br>OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale<br>SessionAffinity 会话亲和性 open | close<br>CpuSpecs cpu 规格<br>MemSpecs mem规格<br>EnvParam 环境变量<br>LogPath 日志采集路径<br>Port 端口<br>Dockerfile dockerfile 文件名<br>BuildDir 目标目录<br>Tag 服务标签<br>LogType 日志类型 none | default | custom<br>LogSetId 日志集Id<br>LogTopicId 日志主题ID<br>LogParseType 日志解析类型 json ｜ line<br>EntryPoint entrypoint 命令<br>Cmd cmd命令<br>VpcConf 网络信息</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>配置项 Key<br>MinNum 最小副本数<br>MaxNum 最大副本数<br>PolicyDetails 扩缩容策略<br>AccessTypes 访问类型<br>TimerScale 定时扩缩容<br>InternalAccess 内网访问<br>OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale<br>SessionAffinity 会话亲和性 open | close<br>CpuSpecs cpu 规格<br>MemSpecs mem规格<br>EnvParam 环境变量<br>LogPath 日志采集路径<br>Port 端口<br>Dockerfile dockerfile 文件名<br>BuildDir 目标目录<br>Tag 服务标签<br>LogType 日志类型 none | default | custom<br>LogSetId 日志集Id<br>LogTopicId 日志主题ID<br>LogParseType 日志解析类型 json ｜ line<br>EntryPoint entrypoint 命令<br>Cmd cmd命令<br>VpcConf 网络信息</p>
     * @param Key <p>配置项 Key<br>MinNum 最小副本数<br>MaxNum 最大副本数<br>PolicyDetails 扩缩容策略<br>AccessTypes 访问类型<br>TimerScale 定时扩缩容<br>InternalAccess 内网访问<br>OperationMode 运行模式 noScale | condScale | alwaysScale | custom ｜ manualScale<br>SessionAffinity 会话亲和性 open | close<br>CpuSpecs cpu 规格<br>MemSpecs mem规格<br>EnvParam 环境变量<br>LogPath 日志采集路径<br>Port 端口<br>Dockerfile dockerfile 文件名<br>BuildDir 目标目录<br>Tag 服务标签<br>LogType 日志类型 none | default | custom<br>LogSetId 日志集Id<br>LogTopicId 日志主题ID<br>LogParseType 日志解析类型 json ｜ line<br>EntryPoint entrypoint 命令<br>Cmd cmd命令<br>VpcConf 网络信息</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>字符串类型配置项值<br>InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType</p> 
     * @return Value <p>字符串类型配置项值<br>InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>字符串类型配置项值<br>InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType</p>
     * @param Value <p>字符串类型配置项值<br>InternalAccess、OperationMode、SessionAffinity、EnvParam、LogPath、Dockerfile、BuildDir、Tag、LogType、LogSetId、LogTopicId、LogParseType</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>int 类型配置项值<br>MinNum、MaxNum、Port</p> 
     * @return IntValue <p>int 类型配置项值<br>MinNum、MaxNum、Port</p>
     */
    public Long getIntValue() {
        return this.IntValue;
    }

    /**
     * Set <p>int 类型配置项值<br>MinNum、MaxNum、Port</p>
     * @param IntValue <p>int 类型配置项值<br>MinNum、MaxNum、Port</p>
     */
    public void setIntValue(Long IntValue) {
        this.IntValue = IntValue;
    }

    /**
     * Get <p>bool 类型配置项值</p> 
     * @return BoolValue <p>bool 类型配置项值</p>
     */
    public Boolean getBoolValue() {
        return this.BoolValue;
    }

    /**
     * Set <p>bool 类型配置项值</p>
     * @param BoolValue <p>bool 类型配置项值</p>
     */
    public void setBoolValue(Boolean BoolValue) {
        this.BoolValue = BoolValue;
    }

    /**
     * Get <p>浮点型配置项值<br>CpuSpecs、MemSpecs</p> 
     * @return FloatValue <p>浮点型配置项值<br>CpuSpecs、MemSpecs</p>
     */
    public Float getFloatValue() {
        return this.FloatValue;
    }

    /**
     * Set <p>浮点型配置项值<br>CpuSpecs、MemSpecs</p>
     * @param FloatValue <p>浮点型配置项值<br>CpuSpecs、MemSpecs</p>
     */
    public void setFloatValue(Float FloatValue) {
        this.FloatValue = FloatValue;
    }

    /**
     * Get <p>字符串数组配置项值<br>AccessTypes，EntryPoint，Cmd</p> 
     * @return ArrayValue <p>字符串数组配置项值<br>AccessTypes，EntryPoint，Cmd</p>
     */
    public String [] getArrayValue() {
        return this.ArrayValue;
    }

    /**
     * Set <p>字符串数组配置项值<br>AccessTypes，EntryPoint，Cmd</p>
     * @param ArrayValue <p>字符串数组配置项值<br>AccessTypes，EntryPoint，Cmd</p>
     */
    public void setArrayValue(String [] ArrayValue) {
        this.ArrayValue = ArrayValue;
    }

    /**
     * Get <p>扩缩容策略配置项值</p> 
     * @return PolicyDetails <p>扩缩容策略配置项值</p>
     */
    public HpaPolicy [] getPolicyDetails() {
        return this.PolicyDetails;
    }

    /**
     * Set <p>扩缩容策略配置项值</p>
     * @param PolicyDetails <p>扩缩容策略配置项值</p>
     */
    public void setPolicyDetails(HpaPolicy [] PolicyDetails) {
        this.PolicyDetails = PolicyDetails;
    }

    /**
     * Get <p>定时扩缩容配置项值</p> 
     * @return TimerScale <p>定时扩缩容配置项值</p>
     */
    public TimerScale [] getTimerScale() {
        return this.TimerScale;
    }

    /**
     * Set <p>定时扩缩容配置项值</p>
     * @param TimerScale <p>定时扩缩容配置项值</p>
     */
    public void setTimerScale(TimerScale [] TimerScale) {
        this.TimerScale = TimerScale;
    }

    /**
     * Get <p>配置内网访问时网络信息</p> 
     * @return VpcConf <p>配置内网访问时网络信息</p>
     */
    public VpcConf getVpcConf() {
        return this.VpcConf;
    }

    /**
     * Set <p>配置内网访问时网络信息</p>
     * @param VpcConf <p>配置内网访问时网络信息</p>
     */
    public void setVpcConf(VpcConf VpcConf) {
        this.VpcConf = VpcConf;
    }

    /**
     * Get <p>存储配置信息</p> 
     * @return VolumesConf <p>存储配置信息</p>
     */
    public VolumeConf [] getVolumesConf() {
        return this.VolumesConf;
    }

    /**
     * Set <p>存储配置信息</p>
     * @param VolumesConf <p>存储配置信息</p>
     */
    public void setVolumesConf(VolumeConf [] VolumesConf) {
        this.VolumesConf = VolumesConf;
    }

    /**
     * Get <p>公网访问配置</p> 
     * @return PublicNetConf <p>公网访问配置</p>
     */
    public PublicNetConf getPublicNetConf() {
        return this.PublicNetConf;
    }

    /**
     * Set <p>公网访问配置</p>
     * @param PublicNetConf <p>公网访问配置</p>
     */
    public void setPublicNetConf(PublicNetConf PublicNetConf) {
        this.PublicNetConf = PublicNetConf;
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
        if (source.VolumesConf != null) {
            this.VolumesConf = new VolumeConf[source.VolumesConf.length];
            for (int i = 0; i < source.VolumesConf.length; i++) {
                this.VolumesConf[i] = new VolumeConf(source.VolumesConf[i]);
            }
        }
        if (source.PublicNetConf != null) {
            this.PublicNetConf = new PublicNetConf(source.PublicNetConf);
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
        this.setParamArrayObj(map, prefix + "VolumesConf.", this.VolumesConf);
        this.setParamObj(map, prefix + "PublicNetConf.", this.PublicNetConf);

    }
}

