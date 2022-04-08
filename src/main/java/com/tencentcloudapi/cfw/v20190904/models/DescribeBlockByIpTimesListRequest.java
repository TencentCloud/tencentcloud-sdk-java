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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockByIpTimesListRequest extends AbstractModel{

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * ip查询条件
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 地域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 方向
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * vpc间防火墙开关边id
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 日志来源 move：vpc间防火墙
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get ip查询条件 
     * @return Ip ip查询条件
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip查询条件
     * @param Ip ip查询条件
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 地域 
     * @return Zone 地域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地域
     * @param Zone 地域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 方向 
     * @return Direction 方向
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向
     * @param Direction 方向
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get vpc间防火墙开关边id 
     * @return EdgeId vpc间防火墙开关边id
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set vpc间防火墙开关边id
     * @param EdgeId vpc间防火墙开关边id
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 日志来源 move：vpc间防火墙 
     * @return LogSource 日志来源 move：vpc间防火墙
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set 日志来源 move：vpc间防火墙
     * @param LogSource 日志来源 move：vpc间防火墙
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    public DescribeBlockByIpTimesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockByIpTimesListRequest(DescribeBlockByIpTimesListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);

    }
}

