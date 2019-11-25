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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7RuleHealth  extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * =1表示开启；=0表示关闭
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 检测间隔时间，单位秒
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 不健康阈值，单位次
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * 健康阈值，单位次
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * HTTP请求方式，取值[HEAD,GET]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 检查目录的URL，默认为/
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 配置状态，0： 正常，1：配置中，2：配置失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * 获取规则ID
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取=1表示开启；=0表示关闭
     * @return Enable =1表示开启；=0表示关闭
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * 设置=1表示开启；=0表示关闭
     * @param Enable =1表示开启；=0表示关闭
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * 获取检测间隔时间，单位秒
     * @return Interval 检测间隔时间，单位秒
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * 设置检测间隔时间，单位秒
     * @param Interval 检测间隔时间，单位秒
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * 获取不健康阈值，单位次
     * @return KickNum 不健康阈值，单位次
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * 设置不健康阈值，单位次
     * @param KickNum 不健康阈值，单位次
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * 获取健康阈值，单位次
     * @return AliveNum 健康阈值，单位次
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * 设置健康阈值，单位次
     * @param AliveNum 健康阈值，单位次
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * 获取HTTP请求方式，取值[HEAD,GET]
     * @return Method HTTP请求方式，取值[HEAD,GET]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * 设置HTTP请求方式，取值[HEAD,GET]
     * @param Method HTTP请求方式，取值[HEAD,GET]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * 获取健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     * @return StatusCode 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * 设置健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     * @param StatusCode 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * 获取检查目录的URL，默认为/
     * @return Url 检查目录的URL，默认为/
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置检查目录的URL，默认为/
     * @param Url 检查目录的URL，默认为/
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取配置状态，0： 正常，1：配置中，2：配置失败
     * @return Status 配置状态，0： 正常，1：配置中，2：配置失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * 设置配置状态，0： 正常，1：配置中，2：配置失败
     * @param Status 配置状态，0： 正常，1：配置中，2：配置失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

