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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7RuleHealth extends AbstractModel{

    /**
    * 配置状态，0： 正常，1：配置中，2：配置失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * =1表示开启；=0表示关闭
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 检查目录的URL，默认为/
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 检测间隔时间，单位秒
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 健康阈值，单位次
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * 不健康阈值，单位次
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

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
    * 是否同时下发http和https规则健康检查配置
    */
    @SerializedName("ProtocolFlag")
    @Expose
    private Long ProtocolFlag;

    /**
    * 被动探测开关，=1表示开启；=0表示关闭
    */
    @SerializedName("PassiveEnable")
    @Expose
    private Long PassiveEnable;

    /**
    * 被动探测不健康屏蔽时间
    */
    @SerializedName("BlockInter")
    @Expose
    private Long BlockInter;

    /**
    * 被动探测不健康统计间隔
    */
    @SerializedName("FailedCountInter")
    @Expose
    private Long FailedCountInter;

    /**
    * 被动探测不健康阈值
    */
    @SerializedName("FailedThreshold")
    @Expose
    private Long FailedThreshold;

    /**
    * 被动探测判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
    */
    @SerializedName("PassiveStatusCode")
    @Expose
    private Long PassiveStatusCode;

    /**
     * Get 配置状态，0： 正常，1：配置中，2：配置失败 
     * @return Status 配置状态，0： 正常，1：配置中，2：配置失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 配置状态，0： 正常，1：配置中，2：配置失败
     * @param Status 配置状态，0： 正常，1：配置中，2：配置失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get =1表示开启；=0表示关闭 
     * @return Enable =1表示开启；=0表示关闭
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set =1表示开启；=0表示关闭
     * @param Enable =1表示开启；=0表示关闭
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 检查目录的URL，默认为/ 
     * @return Url 检查目录的URL，默认为/
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 检查目录的URL，默认为/
     * @param Url 检查目录的URL，默认为/
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 检测间隔时间，单位秒 
     * @return Interval 检测间隔时间，单位秒
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 检测间隔时间，单位秒
     * @param Interval 检测间隔时间，单位秒
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 健康阈值，单位次 
     * @return AliveNum 健康阈值，单位次
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * Set 健康阈值，单位次
     * @param AliveNum 健康阈值，单位次
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * Get 不健康阈值，单位次 
     * @return KickNum 不健康阈值，单位次
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set 不健康阈值，单位次
     * @param KickNum 不健康阈值，单位次
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * Get HTTP请求方式，取值[HEAD,GET] 
     * @return Method HTTP请求方式，取值[HEAD,GET]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set HTTP请求方式，取值[HEAD,GET]
     * @param Method HTTP请求方式，取值[HEAD,GET]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和 
     * @return StatusCode 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     * @param StatusCode 健康检查判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 是否同时下发http和https规则健康检查配置 
     * @return ProtocolFlag 是否同时下发http和https规则健康检查配置
     */
    public Long getProtocolFlag() {
        return this.ProtocolFlag;
    }

    /**
     * Set 是否同时下发http和https规则健康检查配置
     * @param ProtocolFlag 是否同时下发http和https规则健康检查配置
     */
    public void setProtocolFlag(Long ProtocolFlag) {
        this.ProtocolFlag = ProtocolFlag;
    }

    /**
     * Get 被动探测开关，=1表示开启；=0表示关闭 
     * @return PassiveEnable 被动探测开关，=1表示开启；=0表示关闭
     */
    public Long getPassiveEnable() {
        return this.PassiveEnable;
    }

    /**
     * Set 被动探测开关，=1表示开启；=0表示关闭
     * @param PassiveEnable 被动探测开关，=1表示开启；=0表示关闭
     */
    public void setPassiveEnable(Long PassiveEnable) {
        this.PassiveEnable = PassiveEnable;
    }

    /**
     * Get 被动探测不健康屏蔽时间 
     * @return BlockInter 被动探测不健康屏蔽时间
     */
    public Long getBlockInter() {
        return this.BlockInter;
    }

    /**
     * Set 被动探测不健康屏蔽时间
     * @param BlockInter 被动探测不健康屏蔽时间
     */
    public void setBlockInter(Long BlockInter) {
        this.BlockInter = BlockInter;
    }

    /**
     * Get 被动探测不健康统计间隔 
     * @return FailedCountInter 被动探测不健康统计间隔
     */
    public Long getFailedCountInter() {
        return this.FailedCountInter;
    }

    /**
     * Set 被动探测不健康统计间隔
     * @param FailedCountInter 被动探测不健康统计间隔
     */
    public void setFailedCountInter(Long FailedCountInter) {
        this.FailedCountInter = FailedCountInter;
    }

    /**
     * Get 被动探测不健康阈值 
     * @return FailedThreshold 被动探测不健康阈值
     */
    public Long getFailedThreshold() {
        return this.FailedThreshold;
    }

    /**
     * Set 被动探测不健康阈值
     * @param FailedThreshold 被动探测不健康阈值
     */
    public void setFailedThreshold(Long FailedThreshold) {
        this.FailedThreshold = FailedThreshold;
    }

    /**
     * Get 被动探测判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和 
     * @return PassiveStatusCode 被动探测判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public Long getPassiveStatusCode() {
        return this.PassiveStatusCode;
    }

    /**
     * Set 被动探测判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     * @param PassiveStatusCode 被动探测判定正常状态码，1xx =1, 2xx=2, 3xx=4, 4xx=8,5xx=16，多个状态码值加和
     */
    public void setPassiveStatusCode(Long PassiveStatusCode) {
        this.PassiveStatusCode = PassiveStatusCode;
    }

    public L7RuleHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7RuleHealth(L7RuleHealth source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.AliveNum != null) {
            this.AliveNum = new Long(source.AliveNum);
        }
        if (source.KickNum != null) {
            this.KickNum = new Long(source.KickNum);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ProtocolFlag != null) {
            this.ProtocolFlag = new Long(source.ProtocolFlag);
        }
        if (source.PassiveEnable != null) {
            this.PassiveEnable = new Long(source.PassiveEnable);
        }
        if (source.BlockInter != null) {
            this.BlockInter = new Long(source.BlockInter);
        }
        if (source.FailedCountInter != null) {
            this.FailedCountInter = new Long(source.FailedCountInter);
        }
        if (source.FailedThreshold != null) {
            this.FailedThreshold = new Long(source.FailedThreshold);
        }
        if (source.PassiveStatusCode != null) {
            this.PassiveStatusCode = new Long(source.PassiveStatusCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ProtocolFlag", this.ProtocolFlag);
        this.setParamSimple(map, prefix + "PassiveEnable", this.PassiveEnable);
        this.setParamSimple(map, prefix + "BlockInter", this.BlockInter);
        this.setParamSimple(map, prefix + "FailedCountInter", this.FailedCountInter);
        this.setParamSimple(map, prefix + "FailedThreshold", this.FailedThreshold);
        this.setParamSimple(map, prefix + "PassiveStatusCode", this.PassiveStatusCode);

    }
}

