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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStatisticDetailsRequest extends AbstractModel{

    /**
    * 开始日期，格式【YYYY-MM-DD】
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期，格式【YYYY-MM-DD】
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 统计项。取值范围：
1.录制设备数：RecordingDevice
2.非录制设备数：NonRecordingDevice
3.观看流量总数：WatchFlux
4.已用存储容量总数：StorageUsage
5. X-P2P分享流量: P2PFluxTotal
6. X-P2P峰值带宽: P2PPeakValue
7. RTMP推流路数(直播推流): LivePushTotal
    */
    @SerializedName("StatisticField")
    @Expose
    private String StatisticField;

    /**
     * Get 开始日期，格式【YYYY-MM-DD】 
     * @return StartDate 开始日期，格式【YYYY-MM-DD】
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期，格式【YYYY-MM-DD】
     * @param StartDate 开始日期，格式【YYYY-MM-DD】
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期，格式【YYYY-MM-DD】 
     * @return EndDate 结束日期，格式【YYYY-MM-DD】
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期，格式【YYYY-MM-DD】
     * @param EndDate 结束日期，格式【YYYY-MM-DD】
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 统计项。取值范围：
1.录制设备数：RecordingDevice
2.非录制设备数：NonRecordingDevice
3.观看流量总数：WatchFlux
4.已用存储容量总数：StorageUsage
5. X-P2P分享流量: P2PFluxTotal
6. X-P2P峰值带宽: P2PPeakValue
7. RTMP推流路数(直播推流): LivePushTotal 
     * @return StatisticField 统计项。取值范围：
1.录制设备数：RecordingDevice
2.非录制设备数：NonRecordingDevice
3.观看流量总数：WatchFlux
4.已用存储容量总数：StorageUsage
5. X-P2P分享流量: P2PFluxTotal
6. X-P2P峰值带宽: P2PPeakValue
7. RTMP推流路数(直播推流): LivePushTotal
     */
    public String getStatisticField() {
        return this.StatisticField;
    }

    /**
     * Set 统计项。取值范围：
1.录制设备数：RecordingDevice
2.非录制设备数：NonRecordingDevice
3.观看流量总数：WatchFlux
4.已用存储容量总数：StorageUsage
5. X-P2P分享流量: P2PFluxTotal
6. X-P2P峰值带宽: P2PPeakValue
7. RTMP推流路数(直播推流): LivePushTotal
     * @param StatisticField 统计项。取值范围：
1.录制设备数：RecordingDevice
2.非录制设备数：NonRecordingDevice
3.观看流量总数：WatchFlux
4.已用存储容量总数：StorageUsage
5. X-P2P分享流量: P2PFluxTotal
6. X-P2P峰值带宽: P2PPeakValue
7. RTMP推流路数(直播推流): LivePushTotal
     */
    public void setStatisticField(String StatisticField) {
        this.StatisticField = StatisticField;
    }

    public DescribeStatisticDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticDetailsRequest(DescribeStatisticDetailsRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.StatisticField != null) {
            this.StatisticField = new String(source.StatisticField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "StatisticField", this.StatisticField);

    }
}

