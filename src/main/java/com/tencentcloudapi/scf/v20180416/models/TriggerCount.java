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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerCount extends AbstractModel{

    /**
    * Cos触发器数量
    */
    @SerializedName("Cos")
    @Expose
    private Long Cos;

    /**
    * Timer触发器数量
    */
    @SerializedName("Timer")
    @Expose
    private Long Timer;

    /**
    * Cmq触发器数量
    */
    @SerializedName("Cmq")
    @Expose
    private Long Cmq;

    /**
    * 触发器总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Ckafka触发器数量
    */
    @SerializedName("Ckafka")
    @Expose
    private Long Ckafka;

    /**
    * Apigw触发器数量
    */
    @SerializedName("Apigw")
    @Expose
    private Long Apigw;

    /**
    * Cls触发器数量
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * Clb触发器数量
    */
    @SerializedName("Clb")
    @Expose
    private Long Clb;

    /**
    * Mps触发器数量
    */
    @SerializedName("Mps")
    @Expose
    private Long Mps;

    /**
    * Cm触发器数量
    */
    @SerializedName("Cm")
    @Expose
    private Long Cm;

    /**
    * Vod触发器数量
    */
    @SerializedName("Vod")
    @Expose
    private Long Vod;

    /**
     * Get Cos触发器数量 
     * @return Cos Cos触发器数量
     */
    public Long getCos() {
        return this.Cos;
    }

    /**
     * Set Cos触发器数量
     * @param Cos Cos触发器数量
     */
    public void setCos(Long Cos) {
        this.Cos = Cos;
    }

    /**
     * Get Timer触发器数量 
     * @return Timer Timer触发器数量
     */
    public Long getTimer() {
        return this.Timer;
    }

    /**
     * Set Timer触发器数量
     * @param Timer Timer触发器数量
     */
    public void setTimer(Long Timer) {
        this.Timer = Timer;
    }

    /**
     * Get Cmq触发器数量 
     * @return Cmq Cmq触发器数量
     */
    public Long getCmq() {
        return this.Cmq;
    }

    /**
     * Set Cmq触发器数量
     * @param Cmq Cmq触发器数量
     */
    public void setCmq(Long Cmq) {
        this.Cmq = Cmq;
    }

    /**
     * Get 触发器总数 
     * @return Total 触发器总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 触发器总数
     * @param Total 触发器总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Ckafka触发器数量 
     * @return Ckafka Ckafka触发器数量
     */
    public Long getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set Ckafka触发器数量
     * @param Ckafka Ckafka触发器数量
     */
    public void setCkafka(Long Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get Apigw触发器数量 
     * @return Apigw Apigw触发器数量
     */
    public Long getApigw() {
        return this.Apigw;
    }

    /**
     * Set Apigw触发器数量
     * @param Apigw Apigw触发器数量
     */
    public void setApigw(Long Apigw) {
        this.Apigw = Apigw;
    }

    /**
     * Get Cls触发器数量 
     * @return Cls Cls触发器数量
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set Cls触发器数量
     * @param Cls Cls触发器数量
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get Clb触发器数量 
     * @return Clb Clb触发器数量
     */
    public Long getClb() {
        return this.Clb;
    }

    /**
     * Set Clb触发器数量
     * @param Clb Clb触发器数量
     */
    public void setClb(Long Clb) {
        this.Clb = Clb;
    }

    /**
     * Get Mps触发器数量 
     * @return Mps Mps触发器数量
     */
    public Long getMps() {
        return this.Mps;
    }

    /**
     * Set Mps触发器数量
     * @param Mps Mps触发器数量
     */
    public void setMps(Long Mps) {
        this.Mps = Mps;
    }

    /**
     * Get Cm触发器数量 
     * @return Cm Cm触发器数量
     */
    public Long getCm() {
        return this.Cm;
    }

    /**
     * Set Cm触发器数量
     * @param Cm Cm触发器数量
     */
    public void setCm(Long Cm) {
        this.Cm = Cm;
    }

    /**
     * Get Vod触发器数量 
     * @return Vod Vod触发器数量
     */
    public Long getVod() {
        return this.Vod;
    }

    /**
     * Set Vod触发器数量
     * @param Vod Vod触发器数量
     */
    public void setVod(Long Vod) {
        this.Vod = Vod;
    }

    public TriggerCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerCount(TriggerCount source) {
        if (source.Cos != null) {
            this.Cos = new Long(source.Cos);
        }
        if (source.Timer != null) {
            this.Timer = new Long(source.Timer);
        }
        if (source.Cmq != null) {
            this.Cmq = new Long(source.Cmq);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Long(source.Ckafka);
        }
        if (source.Apigw != null) {
            this.Apigw = new Long(source.Apigw);
        }
        if (source.Cls != null) {
            this.Cls = new Long(source.Cls);
        }
        if (source.Clb != null) {
            this.Clb = new Long(source.Clb);
        }
        if (source.Mps != null) {
            this.Mps = new Long(source.Mps);
        }
        if (source.Cm != null) {
            this.Cm = new Long(source.Cm);
        }
        if (source.Vod != null) {
            this.Vod = new Long(source.Vod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cos", this.Cos);
        this.setParamSimple(map, prefix + "Timer", this.Timer);
        this.setParamSimple(map, prefix + "Cmq", this.Cmq);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Ckafka", this.Ckafka);
        this.setParamSimple(map, prefix + "Apigw", this.Apigw);
        this.setParamSimple(map, prefix + "Cls", this.Cls);
        this.setParamSimple(map, prefix + "Clb", this.Clb);
        this.setParamSimple(map, prefix + "Mps", this.Mps);
        this.setParamSimple(map, prefix + "Cm", this.Cm);
        this.setParamSimple(map, prefix + "Vod", this.Vod);

    }
}

