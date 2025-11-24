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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceOplogResponse extends AbstractModel {

    /**
    * 操作日志数量
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 操作日志列表
    */
    @SerializedName("LogList")
    @Expose
    private OperationLog [] LogList;

    /**
    * 操作对象筛选项数组
    */
    @SerializedName("OperandList")
    @Expose
    private String [] OperandList;

    /**
    * 安全级别筛选数组
    */
    @SerializedName("SecurityLevelList")
    @Expose
    private String [] SecurityLevelList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作日志数量 
     * @return TotalCnt 操作日志数量
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 操作日志数量
     * @param TotalCnt 操作日志数量
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 操作日志列表 
     * @return LogList 操作日志列表
     */
    public OperationLog [] getLogList() {
        return this.LogList;
    }

    /**
     * Set 操作日志列表
     * @param LogList 操作日志列表
     */
    public void setLogList(OperationLog [] LogList) {
        this.LogList = LogList;
    }

    /**
     * Get 操作对象筛选项数组 
     * @return OperandList 操作对象筛选项数组
     */
    public String [] getOperandList() {
        return this.OperandList;
    }

    /**
     * Set 操作对象筛选项数组
     * @param OperandList 操作对象筛选项数组
     */
    public void setOperandList(String [] OperandList) {
        this.OperandList = OperandList;
    }

    /**
     * Get 安全级别筛选数组 
     * @return SecurityLevelList 安全级别筛选数组
     */
    public String [] getSecurityLevelList() {
        return this.SecurityLevelList;
    }

    /**
     * Set 安全级别筛选数组
     * @param SecurityLevelList 安全级别筛选数组
     */
    public void setSecurityLevelList(String [] SecurityLevelList) {
        this.SecurityLevelList = SecurityLevelList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceOplogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceOplogResponse(DescribeInstanceOplogResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.LogList != null) {
            this.LogList = new OperationLog[source.LogList.length];
            for (int i = 0; i < source.LogList.length; i++) {
                this.LogList[i] = new OperationLog(source.LogList[i]);
            }
        }
        if (source.OperandList != null) {
            this.OperandList = new String[source.OperandList.length];
            for (int i = 0; i < source.OperandList.length; i++) {
                this.OperandList[i] = new String(source.OperandList[i]);
            }
        }
        if (source.SecurityLevelList != null) {
            this.SecurityLevelList = new String[source.SecurityLevelList.length];
            for (int i = 0; i < source.SecurityLevelList.length; i++) {
                this.SecurityLevelList[i] = new String(source.SecurityLevelList[i]);
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
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "LogList.", this.LogList);
        this.setParamArraySimple(map, prefix + "OperandList.", this.OperandList);
        this.setParamArraySimple(map, prefix + "SecurityLevelList.", this.SecurityLevelList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

