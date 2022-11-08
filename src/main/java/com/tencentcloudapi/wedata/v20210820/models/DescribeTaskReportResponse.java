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

public class DescribeTaskReportResponse extends AbstractModel{

    /**
    * 总读取条数
    */
    @SerializedName("TotalReadRecords")
    @Expose
    private Long TotalReadRecords;

    /**
    * 总读取字节数，单位为Byte
    */
    @SerializedName("TotalReadBytes")
    @Expose
    private Long TotalReadBytes;

    /**
    * 总写入条数
    */
    @SerializedName("TotalWriteRecords")
    @Expose
    private Long TotalWriteRecords;

    /**
    * 总写入字节数，单位为Byte
    */
    @SerializedName("TotalWriteBytes")
    @Expose
    private Long TotalWriteBytes;

    /**
    * 总脏数据条数
    */
    @SerializedName("TotalErrorRecords")
    @Expose
    private Long TotalErrorRecords;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总读取条数 
     * @return TotalReadRecords 总读取条数
     */
    public Long getTotalReadRecords() {
        return this.TotalReadRecords;
    }

    /**
     * Set 总读取条数
     * @param TotalReadRecords 总读取条数
     */
    public void setTotalReadRecords(Long TotalReadRecords) {
        this.TotalReadRecords = TotalReadRecords;
    }

    /**
     * Get 总读取字节数，单位为Byte 
     * @return TotalReadBytes 总读取字节数，单位为Byte
     */
    public Long getTotalReadBytes() {
        return this.TotalReadBytes;
    }

    /**
     * Set 总读取字节数，单位为Byte
     * @param TotalReadBytes 总读取字节数，单位为Byte
     */
    public void setTotalReadBytes(Long TotalReadBytes) {
        this.TotalReadBytes = TotalReadBytes;
    }

    /**
     * Get 总写入条数 
     * @return TotalWriteRecords 总写入条数
     */
    public Long getTotalWriteRecords() {
        return this.TotalWriteRecords;
    }

    /**
     * Set 总写入条数
     * @param TotalWriteRecords 总写入条数
     */
    public void setTotalWriteRecords(Long TotalWriteRecords) {
        this.TotalWriteRecords = TotalWriteRecords;
    }

    /**
     * Get 总写入字节数，单位为Byte 
     * @return TotalWriteBytes 总写入字节数，单位为Byte
     */
    public Long getTotalWriteBytes() {
        return this.TotalWriteBytes;
    }

    /**
     * Set 总写入字节数，单位为Byte
     * @param TotalWriteBytes 总写入字节数，单位为Byte
     */
    public void setTotalWriteBytes(Long TotalWriteBytes) {
        this.TotalWriteBytes = TotalWriteBytes;
    }

    /**
     * Get 总脏数据条数 
     * @return TotalErrorRecords 总脏数据条数
     */
    public Long getTotalErrorRecords() {
        return this.TotalErrorRecords;
    }

    /**
     * Set 总脏数据条数
     * @param TotalErrorRecords 总脏数据条数
     */
    public void setTotalErrorRecords(Long TotalErrorRecords) {
        this.TotalErrorRecords = TotalErrorRecords;
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

    public DescribeTaskReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskReportResponse(DescribeTaskReportResponse source) {
        if (source.TotalReadRecords != null) {
            this.TotalReadRecords = new Long(source.TotalReadRecords);
        }
        if (source.TotalReadBytes != null) {
            this.TotalReadBytes = new Long(source.TotalReadBytes);
        }
        if (source.TotalWriteRecords != null) {
            this.TotalWriteRecords = new Long(source.TotalWriteRecords);
        }
        if (source.TotalWriteBytes != null) {
            this.TotalWriteBytes = new Long(source.TotalWriteBytes);
        }
        if (source.TotalErrorRecords != null) {
            this.TotalErrorRecords = new Long(source.TotalErrorRecords);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalReadRecords", this.TotalReadRecords);
        this.setParamSimple(map, prefix + "TotalReadBytes", this.TotalReadBytes);
        this.setParamSimple(map, prefix + "TotalWriteRecords", this.TotalWriteRecords);
        this.setParamSimple(map, prefix + "TotalWriteBytes", this.TotalWriteBytes);
        this.setParamSimple(map, prefix + "TotalErrorRecords", this.TotalErrorRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

