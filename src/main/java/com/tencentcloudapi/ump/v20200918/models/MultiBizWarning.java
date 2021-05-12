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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiBizWarning extends AbstractModel{

    /**
    * 编号
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 监控区域
    */
    @SerializedName("MonitoringArea")
    @Expose
    private Point [] MonitoringArea;

    /**
    * 告警列表
    */
    @SerializedName("WarningInfos")
    @Expose
    private MultiBizWarningInfo [] WarningInfos;

    /**
     * Get 编号 
     * @return Id 编号
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 编号
     * @param Id 编号
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 监控区域 
     * @return MonitoringArea 监控区域
     */
    public Point [] getMonitoringArea() {
        return this.MonitoringArea;
    }

    /**
     * Set 监控区域
     * @param MonitoringArea 监控区域
     */
    public void setMonitoringArea(Point [] MonitoringArea) {
        this.MonitoringArea = MonitoringArea;
    }

    /**
     * Get 告警列表 
     * @return WarningInfos 告警列表
     */
    public MultiBizWarningInfo [] getWarningInfos() {
        return this.WarningInfos;
    }

    /**
     * Set 告警列表
     * @param WarningInfos 告警列表
     */
    public void setWarningInfos(MultiBizWarningInfo [] WarningInfos) {
        this.WarningInfos = WarningInfos;
    }

    public MultiBizWarning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiBizWarning(MultiBizWarning source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MonitoringArea != null) {
            this.MonitoringArea = new Point[source.MonitoringArea.length];
            for (int i = 0; i < source.MonitoringArea.length; i++) {
                this.MonitoringArea[i] = new Point(source.MonitoringArea[i]);
            }
        }
        if (source.WarningInfos != null) {
            this.WarningInfos = new MultiBizWarningInfo[source.WarningInfos.length];
            for (int i = 0; i < source.WarningInfos.length; i++) {
                this.WarningInfos[i] = new MultiBizWarningInfo(source.WarningInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "MonitoringArea.", this.MonitoringArea);
        this.setParamArrayObj(map, prefix + "WarningInfos.", this.WarningInfos);

    }
}

