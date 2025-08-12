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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDashboardSubscribeRequest extends AbstractModel {

    /**
    * 仪表盘订阅名称。
输入限制：
- 不能为空
- 长度不能超过128字节
- 不能包含字符'|'
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 仪表盘Id。
- 通过[获取仪表盘](https://cloud.tencent.com/document/product/614/95636)获取仪表盘Id。
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。
- {秒数} 取值范围： 0 ~ 59 
- {分钟} 取值范围： 0 ~ 59 
- {小时} 取值范围： 0 ~ 23 
- {日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) 
- {月份} 取值范围： 1 ~ 12 
- {星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
    * 仪表盘订阅数据。
    */
    @SerializedName("SubscribeData")
    @Expose
    private DashboardSubscribeData SubscribeData;

    /**
     * Get 仪表盘订阅名称。
输入限制：
- 不能为空
- 长度不能超过128字节
- 不能包含字符'|' 
     * @return Name 仪表盘订阅名称。
输入限制：
- 不能为空
- 长度不能超过128字节
- 不能包含字符'|'
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仪表盘订阅名称。
输入限制：
- 不能为空
- 长度不能超过128字节
- 不能包含字符'|'
     * @param Name 仪表盘订阅名称。
输入限制：
- 不能为空
- 长度不能超过128字节
- 不能包含字符'|'
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 仪表盘Id。
- 通过[获取仪表盘](https://cloud.tencent.com/document/product/614/95636)获取仪表盘Id。 
     * @return DashboardId 仪表盘Id。
- 通过[获取仪表盘](https://cloud.tencent.com/document/product/614/95636)获取仪表盘Id。
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set 仪表盘Id。
- 通过[获取仪表盘](https://cloud.tencent.com/document/product/614/95636)获取仪表盘Id。
     * @param DashboardId 仪表盘Id。
- 通过[获取仪表盘](https://cloud.tencent.com/document/product/614/95636)获取仪表盘Id。
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。
- {秒数} 取值范围： 0 ~ 59 
- {分钟} 取值范围： 0 ~ 59 
- {小时} 取值范围： 0 ~ 23 
- {日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) 
- {月份} 取值范围： 1 ~ 12 
- {星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】 
     * @return Cron 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。
- {秒数} 取值范围： 0 ~ 59 
- {分钟} 取值范围： 0 ~ 59 
- {小时} 取值范围： 0 ~ 23 
- {日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) 
- {月份} 取值范围： 1 ~ 12 
- {星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。
- {秒数} 取值范围： 0 ~ 59 
- {分钟} 取值范围： 0 ~ 59 
- {小时} 取值范围： 0 ~ 23 
- {日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) 
- {月份} 取值范围： 1 ~ 12 
- {星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
     * @param Cron 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。
- {秒数} 取值范围： 0 ~ 59 
- {分钟} 取值范围： 0 ~ 59 
- {小时} 取值范围： 0 ~ 23 
- {日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) 
- {月份} 取值范围： 1 ~ 12 
- {星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
     */
    public void setCron(String Cron) {
        this.Cron = Cron;
    }

    /**
     * Get 仪表盘订阅数据。 
     * @return SubscribeData 仪表盘订阅数据。
     */
    public DashboardSubscribeData getSubscribeData() {
        return this.SubscribeData;
    }

    /**
     * Set 仪表盘订阅数据。
     * @param SubscribeData 仪表盘订阅数据。
     */
    public void setSubscribeData(DashboardSubscribeData SubscribeData) {
        this.SubscribeData = SubscribeData;
    }

    public CreateDashboardSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDashboardSubscribeRequest(CreateDashboardSubscribeRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
        if (source.Cron != null) {
            this.Cron = new String(source.Cron);
        }
        if (source.SubscribeData != null) {
            this.SubscribeData = new DashboardSubscribeData(source.SubscribeData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamObj(map, prefix + "SubscribeData.", this.SubscribeData);

    }
}

