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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupMonitorResponse extends AbstractModel {

    /**
    * 备份趋势图时间轴
    */
    @SerializedName("TimeStamp")
    @Expose
    private String [] TimeStamp;

    /**
    * 免费备份空间
    */
    @SerializedName("FreeSpace")
    @Expose
    private Float [] FreeSpace;

    /**
    * 实际总备份空间
    */
    @SerializedName("ActualUsedSpace")
    @Expose
    private Float [] ActualUsedSpace;

    /**
    * 日志备份空间
    */
    @SerializedName("LogBackupSpace")
    @Expose
    private Float [] LogBackupSpace;

    /**
    * 数据备份空间
    */
    @SerializedName("DataBackupSpace")
    @Expose
    private Float [] DataBackupSpace;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份趋势图时间轴 
     * @return TimeStamp 备份趋势图时间轴
     */
    public String [] getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 备份趋势图时间轴
     * @param TimeStamp 备份趋势图时间轴
     */
    public void setTimeStamp(String [] TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    /**
     * Get 免费备份空间 
     * @return FreeSpace 免费备份空间
     */
    public Float [] getFreeSpace() {
        return this.FreeSpace;
    }

    /**
     * Set 免费备份空间
     * @param FreeSpace 免费备份空间
     */
    public void setFreeSpace(Float [] FreeSpace) {
        this.FreeSpace = FreeSpace;
    }

    /**
     * Get 实际总备份空间 
     * @return ActualUsedSpace 实际总备份空间
     */
    public Float [] getActualUsedSpace() {
        return this.ActualUsedSpace;
    }

    /**
     * Set 实际总备份空间
     * @param ActualUsedSpace 实际总备份空间
     */
    public void setActualUsedSpace(Float [] ActualUsedSpace) {
        this.ActualUsedSpace = ActualUsedSpace;
    }

    /**
     * Get 日志备份空间 
     * @return LogBackupSpace 日志备份空间
     */
    public Float [] getLogBackupSpace() {
        return this.LogBackupSpace;
    }

    /**
     * Set 日志备份空间
     * @param LogBackupSpace 日志备份空间
     */
    public void setLogBackupSpace(Float [] LogBackupSpace) {
        this.LogBackupSpace = LogBackupSpace;
    }

    /**
     * Get 数据备份空间 
     * @return DataBackupSpace 数据备份空间
     */
    public Float [] getDataBackupSpace() {
        return this.DataBackupSpace;
    }

    /**
     * Set 数据备份空间
     * @param DataBackupSpace 数据备份空间
     */
    public void setDataBackupSpace(Float [] DataBackupSpace) {
        this.DataBackupSpace = DataBackupSpace;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupMonitorResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupMonitorResponse(DescribeBackupMonitorResponse source) {
        if (source.TimeStamp != null) {
            this.TimeStamp = new String[source.TimeStamp.length];
            for (int i = 0; i < source.TimeStamp.length; i++) {
                this.TimeStamp[i] = new String(source.TimeStamp[i]);
            }
        }
        if (source.FreeSpace != null) {
            this.FreeSpace = new Float[source.FreeSpace.length];
            for (int i = 0; i < source.FreeSpace.length; i++) {
                this.FreeSpace[i] = new Float(source.FreeSpace[i]);
            }
        }
        if (source.ActualUsedSpace != null) {
            this.ActualUsedSpace = new Float[source.ActualUsedSpace.length];
            for (int i = 0; i < source.ActualUsedSpace.length; i++) {
                this.ActualUsedSpace[i] = new Float(source.ActualUsedSpace[i]);
            }
        }
        if (source.LogBackupSpace != null) {
            this.LogBackupSpace = new Float[source.LogBackupSpace.length];
            for (int i = 0; i < source.LogBackupSpace.length; i++) {
                this.LogBackupSpace[i] = new Float(source.LogBackupSpace[i]);
            }
        }
        if (source.DataBackupSpace != null) {
            this.DataBackupSpace = new Float[source.DataBackupSpace.length];
            for (int i = 0; i < source.DataBackupSpace.length; i++) {
                this.DataBackupSpace[i] = new Float(source.DataBackupSpace[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TimeStamp.", this.TimeStamp);
        this.setParamArraySimple(map, prefix + "FreeSpace.", this.FreeSpace);
        this.setParamArraySimple(map, prefix + "ActualUsedSpace.", this.ActualUsedSpace);
        this.setParamArraySimple(map, prefix + "LogBackupSpace.", this.LogBackupSpace);
        this.setParamArraySimple(map, prefix + "DataBackupSpace.", this.DataBackupSpace);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

