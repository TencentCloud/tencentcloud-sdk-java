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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealTimeTaskMetricOverviewResponse extends AbstractModel{

    /**
    * 总读取记录数
    */
    @SerializedName("TotalRecordNumOfRead")
    @Expose
    private Long TotalRecordNumOfRead;

    /**
    * 总读取字节数
    */
    @SerializedName("TotalRecordByteNumOfRead")
    @Expose
    private Long TotalRecordByteNumOfRead;

    /**
    * 总写入记录数
    */
    @SerializedName("TotalRecordNumOfWrite")
    @Expose
    private Long TotalRecordNumOfWrite;

    /**
    * 总写入字节数 单位字节
    */
    @SerializedName("TotalRecordByteNumOfWrite")
    @Expose
    private Long TotalRecordByteNumOfWrite;

    /**
    * 总的脏记录数据
    */
    @SerializedName("TotalDirtyRecordNum")
    @Expose
    private Long TotalDirtyRecordNum;

    /**
    * 总的脏字节数 单位字节
    */
    @SerializedName("TotalDirtyRecordByte")
    @Expose
    private Long TotalDirtyRecordByte;

    /**
    * 运行时长 单位s
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * 开始运行时间
    */
    @SerializedName("BeginRunTime")
    @Expose
    private String BeginRunTime;

    /**
    * 目前运行到的时间
    */
    @SerializedName("EndRunTime")
    @Expose
    private String EndRunTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总读取记录数 
     * @return TotalRecordNumOfRead 总读取记录数
     */
    public Long getTotalRecordNumOfRead() {
        return this.TotalRecordNumOfRead;
    }

    /**
     * Set 总读取记录数
     * @param TotalRecordNumOfRead 总读取记录数
     */
    public void setTotalRecordNumOfRead(Long TotalRecordNumOfRead) {
        this.TotalRecordNumOfRead = TotalRecordNumOfRead;
    }

    /**
     * Get 总读取字节数 
     * @return TotalRecordByteNumOfRead 总读取字节数
     */
    public Long getTotalRecordByteNumOfRead() {
        return this.TotalRecordByteNumOfRead;
    }

    /**
     * Set 总读取字节数
     * @param TotalRecordByteNumOfRead 总读取字节数
     */
    public void setTotalRecordByteNumOfRead(Long TotalRecordByteNumOfRead) {
        this.TotalRecordByteNumOfRead = TotalRecordByteNumOfRead;
    }

    /**
     * Get 总写入记录数 
     * @return TotalRecordNumOfWrite 总写入记录数
     */
    public Long getTotalRecordNumOfWrite() {
        return this.TotalRecordNumOfWrite;
    }

    /**
     * Set 总写入记录数
     * @param TotalRecordNumOfWrite 总写入记录数
     */
    public void setTotalRecordNumOfWrite(Long TotalRecordNumOfWrite) {
        this.TotalRecordNumOfWrite = TotalRecordNumOfWrite;
    }

    /**
     * Get 总写入字节数 单位字节 
     * @return TotalRecordByteNumOfWrite 总写入字节数 单位字节
     */
    public Long getTotalRecordByteNumOfWrite() {
        return this.TotalRecordByteNumOfWrite;
    }

    /**
     * Set 总写入字节数 单位字节
     * @param TotalRecordByteNumOfWrite 总写入字节数 单位字节
     */
    public void setTotalRecordByteNumOfWrite(Long TotalRecordByteNumOfWrite) {
        this.TotalRecordByteNumOfWrite = TotalRecordByteNumOfWrite;
    }

    /**
     * Get 总的脏记录数据 
     * @return TotalDirtyRecordNum 总的脏记录数据
     */
    public Long getTotalDirtyRecordNum() {
        return this.TotalDirtyRecordNum;
    }

    /**
     * Set 总的脏记录数据
     * @param TotalDirtyRecordNum 总的脏记录数据
     */
    public void setTotalDirtyRecordNum(Long TotalDirtyRecordNum) {
        this.TotalDirtyRecordNum = TotalDirtyRecordNum;
    }

    /**
     * Get 总的脏字节数 单位字节 
     * @return TotalDirtyRecordByte 总的脏字节数 单位字节
     */
    public Long getTotalDirtyRecordByte() {
        return this.TotalDirtyRecordByte;
    }

    /**
     * Set 总的脏字节数 单位字节
     * @param TotalDirtyRecordByte 总的脏字节数 单位字节
     */
    public void setTotalDirtyRecordByte(Long TotalDirtyRecordByte) {
        this.TotalDirtyRecordByte = TotalDirtyRecordByte;
    }

    /**
     * Get 运行时长 单位s 
     * @return TotalDuration 运行时长 单位s
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set 运行时长 单位s
     * @param TotalDuration 运行时长 单位s
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get 开始运行时间 
     * @return BeginRunTime 开始运行时间
     */
    public String getBeginRunTime() {
        return this.BeginRunTime;
    }

    /**
     * Set 开始运行时间
     * @param BeginRunTime 开始运行时间
     */
    public void setBeginRunTime(String BeginRunTime) {
        this.BeginRunTime = BeginRunTime;
    }

    /**
     * Get 目前运行到的时间 
     * @return EndRunTime 目前运行到的时间
     */
    public String getEndRunTime() {
        return this.EndRunTime;
    }

    /**
     * Set 目前运行到的时间
     * @param EndRunTime 目前运行到的时间
     */
    public void setEndRunTime(String EndRunTime) {
        this.EndRunTime = EndRunTime;
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

    public DescribeRealTimeTaskMetricOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealTimeTaskMetricOverviewResponse(DescribeRealTimeTaskMetricOverviewResponse source) {
        if (source.TotalRecordNumOfRead != null) {
            this.TotalRecordNumOfRead = new Long(source.TotalRecordNumOfRead);
        }
        if (source.TotalRecordByteNumOfRead != null) {
            this.TotalRecordByteNumOfRead = new Long(source.TotalRecordByteNumOfRead);
        }
        if (source.TotalRecordNumOfWrite != null) {
            this.TotalRecordNumOfWrite = new Long(source.TotalRecordNumOfWrite);
        }
        if (source.TotalRecordByteNumOfWrite != null) {
            this.TotalRecordByteNumOfWrite = new Long(source.TotalRecordByteNumOfWrite);
        }
        if (source.TotalDirtyRecordNum != null) {
            this.TotalDirtyRecordNum = new Long(source.TotalDirtyRecordNum);
        }
        if (source.TotalDirtyRecordByte != null) {
            this.TotalDirtyRecordByte = new Long(source.TotalDirtyRecordByte);
        }
        if (source.TotalDuration != null) {
            this.TotalDuration = new Long(source.TotalDuration);
        }
        if (source.BeginRunTime != null) {
            this.BeginRunTime = new String(source.BeginRunTime);
        }
        if (source.EndRunTime != null) {
            this.EndRunTime = new String(source.EndRunTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalRecordNumOfRead", this.TotalRecordNumOfRead);
        this.setParamSimple(map, prefix + "TotalRecordByteNumOfRead", this.TotalRecordByteNumOfRead);
        this.setParamSimple(map, prefix + "TotalRecordNumOfWrite", this.TotalRecordNumOfWrite);
        this.setParamSimple(map, prefix + "TotalRecordByteNumOfWrite", this.TotalRecordByteNumOfWrite);
        this.setParamSimple(map, prefix + "TotalDirtyRecordNum", this.TotalDirtyRecordNum);
        this.setParamSimple(map, prefix + "TotalDirtyRecordByte", this.TotalDirtyRecordByte);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);
        this.setParamSimple(map, prefix + "BeginRunTime", this.BeginRunTime);
        this.setParamSimple(map, prefix + "EndRunTime", this.EndRunTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

