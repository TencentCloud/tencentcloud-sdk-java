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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDashboardSubscribeRequest extends AbstractModel {

    /**
    * 仪表盘订阅名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 仪表盘id。
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。<br><li/>{秒数} 取值范围： 0 ~ 59 <br><li/>{分钟} 取值范围： 0 ~ 59  <br><li/>{小时} 取值范围： 0 ~ 23  <br><li/>{日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) <br><li/>{月份} 取值范围： 1 ~ 12 <br><li/>{星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
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
     * @return Name 仪表盘订阅名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仪表盘订阅名称。
     * @param Name 仪表盘订阅名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 仪表盘id。 
     * @return DashboardId 仪表盘id。
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set 仪表盘id。
     * @param DashboardId 仪表盘id。
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。<br><li/>{秒数} 取值范围： 0 ~ 59 <br><li/>{分钟} 取值范围： 0 ~ 59  <br><li/>{小时} 取值范围： 0 ~ 23  <br><li/>{日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) <br><li/>{月份} 取值范围： 1 ~ 12 <br><li/>{星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】 
     * @return Cron 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。<br><li/>{秒数} 取值范围： 0 ~ 59 <br><li/>{分钟} 取值范围： 0 ~ 59  <br><li/>{小时} 取值范围： 0 ~ 23  <br><li/>{日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) <br><li/>{月份} 取值范围： 1 ~ 12 <br><li/>{星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。<br><li/>{秒数} 取值范围： 0 ~ 59 <br><li/>{分钟} 取值范围： 0 ~ 59  <br><li/>{小时} 取值范围： 0 ~ 23  <br><li/>{日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) <br><li/>{月份} 取值范围： 1 ~ 12 <br><li/>{星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
     * @param Cron 订阅时间cron表达式，格式为：{秒数} {分钟} {小时} {日期} {月份} {星期}；（有效数据为：{分钟} {小时} {日期} {月份} {星期}）。<br><li/>{秒数} 取值范围： 0 ~ 59 <br><li/>{分钟} 取值范围： 0 ~ 59  <br><li/>{小时} 取值范围： 0 ~ 23  <br><li/>{日期} 取值范围： 1 ~ 31 AND (dayOfMonth最后一天： L) <br><li/>{月份} 取值范围： 1 ~ 12 <br><li/>{星期} 取值范围： 0 ~ 6 【0:星期日， 6星期六】
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

