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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheck  extends AbstractModel{

    /**
    * 是否开启健康检查：1（开启）、0（关闭）。默认值 1，表示打开。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Integer HealthSwitch;

    /**
    * 健康检查的响应超时时间，可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
    */
    @SerializedName("TimeOut")
    @Expose
    private Integer TimeOut;

    /**
    * 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Integer IntervalTime;

    /**
    * 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
    */
    @SerializedName("HealthNum")
    @Expose
    private Integer HealthNum;

    /**
    * 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Integer UnHealthNum;

    /**
    * 健康检查状态码（仅适用于HTTP/HTTPS转发规则）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 表示健康，2 表示返回 2xx 表示健康，4 表示返回 3xx 表示健康，8 表示返回 4xx 表示健康，16 表示返回 5xx 表示健康。若希望多种码都表示健康，则将相应的值相加。
    */
    @SerializedName("HttpCode")
    @Expose
    private Integer HttpCode;

    /**
    * 健康检查路径（仅适用于HTTP/HTTPS转发规则）。
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 健康检查域名（仅适用于HTTP/HTTPS转发规则）。
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * 健康检查方法（仅适用于HTTP/HTTPS转发规则），取值为HEAD或GET。
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
     * 获取是否开启健康检查：1（开启）、0（关闭）。默认值 1，表示打开。
     * @return HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。默认值 1，表示打开。
     */
    public Integer getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * 设置是否开启健康检查：1（开启）、0（关闭）。默认值 1，表示打开。
     * @param HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。默认值 1，表示打开。
     */
    public void setHealthSwitch(Integer HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * 获取健康检查的响应超时时间，可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
     * @return TimeOut 健康检查的响应超时时间，可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
     */
    public Integer getTimeOut() {
        return this.TimeOut;
    }

    /**
     * 设置健康检查的响应超时时间，可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
     * @param TimeOut 健康检查的响应超时时间，可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
     */
    public void setTimeOut(Integer TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * 获取健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
     * @return IntervalTime 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
     */
    public Integer getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * 设置健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
     * @param IntervalTime 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
     */
    public void setIntervalTime(Integer IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * 获取健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
     * @return HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
     */
    public Integer getHealthNum() {
        return this.HealthNum;
    }

    /**
     * 设置健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
     * @param HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
     */
    public void setHealthNum(Integer HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * 获取不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
     * @return UnHealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
     */
    public Integer getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * 设置不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
     * @param UnHealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
     */
    public void setUnHealthNum(Integer UnHealthNum) {
        this.UnHealthNum = UnHealthNum;
    }

    /**
     * 获取健康检查状态码（仅适用于HTTP/HTTPS转发规则）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 表示健康，2 表示返回 2xx 表示健康，4 表示返回 3xx 表示健康，8 表示返回 4xx 表示健康，16 表示返回 5xx 表示健康。若希望多种码都表示健康，则将相应的值相加。
     * @return HttpCode 健康检查状态码（仅适用于HTTP/HTTPS转发规则）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 表示健康，2 表示返回 2xx 表示健康，4 表示返回 3xx 表示健康，8 表示返回 4xx 表示健康，16 表示返回 5xx 表示健康。若希望多种码都表示健康，则将相应的值相加。
     */
    public Integer getHttpCode() {
        return this.HttpCode;
    }

    /**
     * 设置健康检查状态码（仅适用于HTTP/HTTPS转发规则）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 表示健康，2 表示返回 2xx 表示健康，4 表示返回 3xx 表示健康，8 表示返回 4xx 表示健康，16 表示返回 5xx 表示健康。若希望多种码都表示健康，则将相应的值相加。
     * @param HttpCode 健康检查状态码（仅适用于HTTP/HTTPS转发规则）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 表示健康，2 表示返回 2xx 表示健康，4 表示返回 3xx 表示健康，8 表示返回 4xx 表示健康，16 表示返回 5xx 表示健康。若希望多种码都表示健康，则将相应的值相加。
     */
    public void setHttpCode(Integer HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * 获取健康检查路径（仅适用于HTTP/HTTPS转发规则）。
     * @return HttpCheckPath 健康检查路径（仅适用于HTTP/HTTPS转发规则）。
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * 设置健康检查路径（仅适用于HTTP/HTTPS转发规则）。
     * @param HttpCheckPath 健康检查路径（仅适用于HTTP/HTTPS转发规则）。
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * 获取健康检查域名（仅适用于HTTP/HTTPS转发规则）。
     * @return HttpCheckDomain 健康检查域名（仅适用于HTTP/HTTPS转发规则）。
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * 设置健康检查域名（仅适用于HTTP/HTTPS转发规则）。
     * @param HttpCheckDomain 健康检查域名（仅适用于HTTP/HTTPS转发规则）。
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * 获取健康检查方法（仅适用于HTTP/HTTPS转发规则），取值为HEAD或GET。
     * @return HttpCheckMethod 健康检查方法（仅适用于HTTP/HTTPS转发规则），取值为HEAD或GET。
     */
    public String getHttpCheckMethod() {
        return this.HttpCheckMethod;
    }

    /**
     * 设置健康检查方法（仅适用于HTTP/HTTPS转发规则），取值为HEAD或GET。
     * @param HttpCheckMethod 健康检查方法（仅适用于HTTP/HTTPS转发规则），取值为HEAD或GET。
     */
    public void setHttpCheckMethod(String HttpCheckMethod) {
        this.HttpCheckMethod = HttpCheckMethod;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnHealthNum", this.UnHealthNum);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "HttpCheckMethod", this.HttpCheckMethod);

    }
}

