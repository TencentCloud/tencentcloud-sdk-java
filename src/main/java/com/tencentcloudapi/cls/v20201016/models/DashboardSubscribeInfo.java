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

public class DashboardSubscribeInfo extends AbstractModel {

    /**
    * 仪表盘订阅id。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    * 仪表盘订阅时间。
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
    * 仪表盘订阅记录创建时间。格式：`YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 仪表盘订阅记录更新时间。格式：`YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 仪表盘订阅记录最后一次发送成功时间。格式：`YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 腾讯云主账号Id。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 腾讯云主账号下的子账号Id。
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * 仪表盘订阅记录最后一次发送的状态。success：全部发送成功，fail：未发送， partialSuccess：部分发送成功。
    */
    @SerializedName("LastStatus")
    @Expose
    private String LastStatus;

    /**
     * Get 仪表盘订阅id。 
     * @return Id 仪表盘订阅id。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 仪表盘订阅id。
     * @param Id 仪表盘订阅id。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get 仪表盘订阅时间。 
     * @return Cron 仪表盘订阅时间。
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set 仪表盘订阅时间。
     * @param Cron 仪表盘订阅时间。
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

    /**
     * Get 仪表盘订阅记录创建时间。格式：`YYYY-MM-DD HH:MM:SS` 
     * @return CreateTime 仪表盘订阅记录创建时间。格式：`YYYY-MM-DD HH:MM:SS`
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 仪表盘订阅记录创建时间。格式：`YYYY-MM-DD HH:MM:SS`
     * @param CreateTime 仪表盘订阅记录创建时间。格式：`YYYY-MM-DD HH:MM:SS`
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 仪表盘订阅记录更新时间。格式：`YYYY-MM-DD HH:MM:SS` 
     * @return UpdateTime 仪表盘订阅记录更新时间。格式：`YYYY-MM-DD HH:MM:SS`
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 仪表盘订阅记录更新时间。格式：`YYYY-MM-DD HH:MM:SS`
     * @param UpdateTime 仪表盘订阅记录更新时间。格式：`YYYY-MM-DD HH:MM:SS`
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 仪表盘订阅记录最后一次发送成功时间。格式：`YYYY-MM-DD HH:MM:SS` 
     * @return LastTime 仪表盘订阅记录最后一次发送成功时间。格式：`YYYY-MM-DD HH:MM:SS`
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 仪表盘订阅记录最后一次发送成功时间。格式：`YYYY-MM-DD HH:MM:SS`
     * @param LastTime 仪表盘订阅记录最后一次发送成功时间。格式：`YYYY-MM-DD HH:MM:SS`
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 腾讯云主账号Id。 
     * @return Uin 腾讯云主账号Id。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云主账号Id。
     * @param Uin 腾讯云主账号Id。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 腾讯云主账号下的子账号Id。 
     * @return SubUin 腾讯云主账号下的子账号Id。
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 腾讯云主账号下的子账号Id。
     * @param SubUin 腾讯云主账号下的子账号Id。
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 仪表盘订阅记录最后一次发送的状态。success：全部发送成功，fail：未发送， partialSuccess：部分发送成功。 
     * @return LastStatus 仪表盘订阅记录最后一次发送的状态。success：全部发送成功，fail：未发送， partialSuccess：部分发送成功。
     */
    public String getLastStatus() {
        return this.LastStatus;
    }

    /**
     * Set 仪表盘订阅记录最后一次发送的状态。success：全部发送成功，fail：未发送， partialSuccess：部分发送成功。
     * @param LastStatus 仪表盘订阅记录最后一次发送的状态。success：全部发送成功，fail：未发送， partialSuccess：部分发送成功。
     */
    public void setLastStatus(String LastStatus) {
        this.LastStatus = LastStatus;
    }

    public DashboardSubscribeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardSubscribeInfo(DashboardSubscribeInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.LastStatus != null) {
            this.LastStatus = new String(source.LastStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamObj(map, prefix + "SubscribeData.", this.SubscribeData);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "LastStatus", this.LastStatus);

    }
}

