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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CycleScanConf extends AbstractModel {

    /**
    * <p>周期扫描开关。0 关闭，1 开启。</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>周期扫描的间隔类型。取值：</p><ul><li>DAY：每若干天，IntervalValueList 取间隔天数（如 ["1"] 表示每天）</li><li>WEEK：每周指定星期几，IntervalValueList 取 1~7（周一~周日）</li><li>MONTH：每月指定日期，IntervalValueList 取 1~31</li></ul>
    */
    @SerializedName("IntervalType")
    @Expose
    private String IntervalType;

    /**
    * <p>周期取值列表，含义随 IntervalType 变化：</p><ul><li>IntervalType=DAY：每隔多少天，例如 ["1"] 表示每天</li><li>IntervalType=WEEK：每周的星期几，取值 1~7（周一 ~ 周日）</li><li>IntervalType=MONTH：每月的几号，取值 1~31</li></ul>
    */
    @SerializedName("IntervalValueList")
    @Expose
    private String [] IntervalValueList;

    /**
    * <p>扫描时段起始时间，格式 HH:mm，例如 02:00。</p>
    */
    @SerializedName("ScanStart")
    @Expose
    private String ScanStart;

    /**
    * <p>扫描时段结束时间，格式 HH:mm，例如 06:00。</p>
    */
    @SerializedName("ScanEnd")
    @Expose
    private String ScanEnd;

    /**
     * Get <p>周期扫描开关。0 关闭，1 开启。</p> 
     * @return Enable <p>周期扫描开关。0 关闭，1 开启。</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>周期扫描开关。0 关闭，1 开启。</p>
     * @param Enable <p>周期扫描开关。0 关闭，1 开启。</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>周期扫描的间隔类型。取值：</p><ul><li>DAY：每若干天，IntervalValueList 取间隔天数（如 ["1"] 表示每天）</li><li>WEEK：每周指定星期几，IntervalValueList 取 1~7（周一~周日）</li><li>MONTH：每月指定日期，IntervalValueList 取 1~31</li></ul> 
     * @return IntervalType <p>周期扫描的间隔类型。取值：</p><ul><li>DAY：每若干天，IntervalValueList 取间隔天数（如 ["1"] 表示每天）</li><li>WEEK：每周指定星期几，IntervalValueList 取 1~7（周一~周日）</li><li>MONTH：每月指定日期，IntervalValueList 取 1~31</li></ul>
     */
    public String getIntervalType() {
        return this.IntervalType;
    }

    /**
     * Set <p>周期扫描的间隔类型。取值：</p><ul><li>DAY：每若干天，IntervalValueList 取间隔天数（如 ["1"] 表示每天）</li><li>WEEK：每周指定星期几，IntervalValueList 取 1~7（周一~周日）</li><li>MONTH：每月指定日期，IntervalValueList 取 1~31</li></ul>
     * @param IntervalType <p>周期扫描的间隔类型。取值：</p><ul><li>DAY：每若干天，IntervalValueList 取间隔天数（如 ["1"] 表示每天）</li><li>WEEK：每周指定星期几，IntervalValueList 取 1~7（周一~周日）</li><li>MONTH：每月指定日期，IntervalValueList 取 1~31</li></ul>
     */
    public void setIntervalType(String IntervalType) {
        this.IntervalType = IntervalType;
    }

    /**
     * Get <p>周期取值列表，含义随 IntervalType 变化：</p><ul><li>IntervalType=DAY：每隔多少天，例如 ["1"] 表示每天</li><li>IntervalType=WEEK：每周的星期几，取值 1~7（周一 ~ 周日）</li><li>IntervalType=MONTH：每月的几号，取值 1~31</li></ul> 
     * @return IntervalValueList <p>周期取值列表，含义随 IntervalType 变化：</p><ul><li>IntervalType=DAY：每隔多少天，例如 ["1"] 表示每天</li><li>IntervalType=WEEK：每周的星期几，取值 1~7（周一 ~ 周日）</li><li>IntervalType=MONTH：每月的几号，取值 1~31</li></ul>
     */
    public String [] getIntervalValueList() {
        return this.IntervalValueList;
    }

    /**
     * Set <p>周期取值列表，含义随 IntervalType 变化：</p><ul><li>IntervalType=DAY：每隔多少天，例如 ["1"] 表示每天</li><li>IntervalType=WEEK：每周的星期几，取值 1~7（周一 ~ 周日）</li><li>IntervalType=MONTH：每月的几号，取值 1~31</li></ul>
     * @param IntervalValueList <p>周期取值列表，含义随 IntervalType 变化：</p><ul><li>IntervalType=DAY：每隔多少天，例如 ["1"] 表示每天</li><li>IntervalType=WEEK：每周的星期几，取值 1~7（周一 ~ 周日）</li><li>IntervalType=MONTH：每月的几号，取值 1~31</li></ul>
     */
    public void setIntervalValueList(String [] IntervalValueList) {
        this.IntervalValueList = IntervalValueList;
    }

    /**
     * Get <p>扫描时段起始时间，格式 HH:mm，例如 02:00。</p> 
     * @return ScanStart <p>扫描时段起始时间，格式 HH:mm，例如 02:00。</p>
     */
    public String getScanStart() {
        return this.ScanStart;
    }

    /**
     * Set <p>扫描时段起始时间，格式 HH:mm，例如 02:00。</p>
     * @param ScanStart <p>扫描时段起始时间，格式 HH:mm，例如 02:00。</p>
     */
    public void setScanStart(String ScanStart) {
        this.ScanStart = ScanStart;
    }

    /**
     * Get <p>扫描时段结束时间，格式 HH:mm，例如 06:00。</p> 
     * @return ScanEnd <p>扫描时段结束时间，格式 HH:mm，例如 06:00。</p>
     */
    public String getScanEnd() {
        return this.ScanEnd;
    }

    /**
     * Set <p>扫描时段结束时间，格式 HH:mm，例如 06:00。</p>
     * @param ScanEnd <p>扫描时段结束时间，格式 HH:mm，例如 06:00。</p>
     */
    public void setScanEnd(String ScanEnd) {
        this.ScanEnd = ScanEnd;
    }

    public CycleScanConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CycleScanConf(CycleScanConf source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.IntervalType != null) {
            this.IntervalType = new String(source.IntervalType);
        }
        if (source.IntervalValueList != null) {
            this.IntervalValueList = new String[source.IntervalValueList.length];
            for (int i = 0; i < source.IntervalValueList.length; i++) {
                this.IntervalValueList[i] = new String(source.IntervalValueList[i]);
            }
        }
        if (source.ScanStart != null) {
            this.ScanStart = new String(source.ScanStart);
        }
        if (source.ScanEnd != null) {
            this.ScanEnd = new String(source.ScanEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "IntervalType", this.IntervalType);
        this.setParamArraySimple(map, prefix + "IntervalValueList.", this.IntervalValueList);
        this.setParamSimple(map, prefix + "ScanStart", this.ScanStart);
        this.setParamSimple(map, prefix + "ScanEnd", this.ScanEnd);

    }
}

