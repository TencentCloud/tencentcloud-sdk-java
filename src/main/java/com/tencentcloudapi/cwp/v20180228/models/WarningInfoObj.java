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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WarningInfoObj extends AbstractModel{

    /**
    * 事件告警类型；1：离线，2：木马，3：异常登录，4：爆破，5：漏洞（已拆分为9-12四种类型）6：高危命令，7：反弹sell，8：本地提权，9：应用漏洞，10：web-cms漏洞，11：应急漏洞，12：安全基线 ,13: 防篡改，14：恶意请求，15: 网络攻击，16：Windows系统漏洞，17：Linux软件漏洞，18：核心文件监控告警，19：客户端卸载告警。20：客户端离线告警
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 1: 关闭告警 0: 开启告警
    */
    @SerializedName("DisablePhoneWarning")
    @Expose
    private Long DisablePhoneWarning;

    /**
    * 开始时间，格式: HH:mm
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间，格式: HH:mm
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 时区信息
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 漏洞等级控制位（对应DB的十进制存储）
    */
    @SerializedName("ControlBit")
    @Expose
    private Long ControlBit;

    /**
    * 漏洞等级控制位二进制，每一位对应页面漏洞等级的开启关闭：低中高（0:关闭；1：开启），例如：101 → 同时勾选低+高
    */
    @SerializedName("ControlBits")
    @Expose
    private String ControlBits;

    /**
     * Get 事件告警类型；1：离线，2：木马，3：异常登录，4：爆破，5：漏洞（已拆分为9-12四种类型）6：高危命令，7：反弹sell，8：本地提权，9：应用漏洞，10：web-cms漏洞，11：应急漏洞，12：安全基线 ,13: 防篡改，14：恶意请求，15: 网络攻击，16：Windows系统漏洞，17：Linux软件漏洞，18：核心文件监控告警，19：客户端卸载告警。20：客户端离线告警 
     * @return Type 事件告警类型；1：离线，2：木马，3：异常登录，4：爆破，5：漏洞（已拆分为9-12四种类型）6：高危命令，7：反弹sell，8：本地提权，9：应用漏洞，10：web-cms漏洞，11：应急漏洞，12：安全基线 ,13: 防篡改，14：恶意请求，15: 网络攻击，16：Windows系统漏洞，17：Linux软件漏洞，18：核心文件监控告警，19：客户端卸载告警。20：客户端离线告警
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 事件告警类型；1：离线，2：木马，3：异常登录，4：爆破，5：漏洞（已拆分为9-12四种类型）6：高危命令，7：反弹sell，8：本地提权，9：应用漏洞，10：web-cms漏洞，11：应急漏洞，12：安全基线 ,13: 防篡改，14：恶意请求，15: 网络攻击，16：Windows系统漏洞，17：Linux软件漏洞，18：核心文件监控告警，19：客户端卸载告警。20：客户端离线告警
     * @param Type 事件告警类型；1：离线，2：木马，3：异常登录，4：爆破，5：漏洞（已拆分为9-12四种类型）6：高危命令，7：反弹sell，8：本地提权，9：应用漏洞，10：web-cms漏洞，11：应急漏洞，12：安全基线 ,13: 防篡改，14：恶意请求，15: 网络攻击，16：Windows系统漏洞，17：Linux软件漏洞，18：核心文件监控告警，19：客户端卸载告警。20：客户端离线告警
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 1: 关闭告警 0: 开启告警 
     * @return DisablePhoneWarning 1: 关闭告警 0: 开启告警
     */
    public Long getDisablePhoneWarning() {
        return this.DisablePhoneWarning;
    }

    /**
     * Set 1: 关闭告警 0: 开启告警
     * @param DisablePhoneWarning 1: 关闭告警 0: 开启告警
     */
    public void setDisablePhoneWarning(Long DisablePhoneWarning) {
        this.DisablePhoneWarning = DisablePhoneWarning;
    }

    /**
     * Get 开始时间，格式: HH:mm 
     * @return BeginTime 开始时间，格式: HH:mm
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间，格式: HH:mm
     * @param BeginTime 开始时间，格式: HH:mm
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间，格式: HH:mm 
     * @return EndTime 结束时间，格式: HH:mm
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式: HH:mm
     * @param EndTime 结束时间，格式: HH:mm
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 时区信息 
     * @return TimeZone 时区信息
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区信息
     * @param TimeZone 时区信息
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 漏洞等级控制位（对应DB的十进制存储） 
     * @return ControlBit 漏洞等级控制位（对应DB的十进制存储）
     */
    public Long getControlBit() {
        return this.ControlBit;
    }

    /**
     * Set 漏洞等级控制位（对应DB的十进制存储）
     * @param ControlBit 漏洞等级控制位（对应DB的十进制存储）
     */
    public void setControlBit(Long ControlBit) {
        this.ControlBit = ControlBit;
    }

    /**
     * Get 漏洞等级控制位二进制，每一位对应页面漏洞等级的开启关闭：低中高（0:关闭；1：开启），例如：101 → 同时勾选低+高 
     * @return ControlBits 漏洞等级控制位二进制，每一位对应页面漏洞等级的开启关闭：低中高（0:关闭；1：开启），例如：101 → 同时勾选低+高
     */
    public String getControlBits() {
        return this.ControlBits;
    }

    /**
     * Set 漏洞等级控制位二进制，每一位对应页面漏洞等级的开启关闭：低中高（0:关闭；1：开启），例如：101 → 同时勾选低+高
     * @param ControlBits 漏洞等级控制位二进制，每一位对应页面漏洞等级的开启关闭：低中高（0:关闭；1：开启），例如：101 → 同时勾选低+高
     */
    public void setControlBits(String ControlBits) {
        this.ControlBits = ControlBits;
    }

    public WarningInfoObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarningInfoObj(WarningInfoObj source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DisablePhoneWarning != null) {
            this.DisablePhoneWarning = new Long(source.DisablePhoneWarning);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.ControlBit != null) {
            this.ControlBit = new Long(source.ControlBit);
        }
        if (source.ControlBits != null) {
            this.ControlBits = new String(source.ControlBits);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DisablePhoneWarning", this.DisablePhoneWarning);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "ControlBit", this.ControlBit);
        this.setParamSimple(map, prefix + "ControlBits", this.ControlBits);

    }
}

