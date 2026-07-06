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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOfflineExportTaskResponse extends AbstractModel {

    /**
    * <p>返回状态码 0 成功 非0不成功</p>
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * <p>返回信息  success 成功 其他 不成功</p>
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * <p>离线导出任务列表</p>
    */
    @SerializedName("Data")
    @Expose
    private OfflineExportTask [] Data;

    /**
    * <p>任务数量</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>剩余导出文件配额，单位B</p>
    */
    @SerializedName("ExportRemainQuota")
    @Expose
    private Long ExportRemainQuota;

    /**
    * <p>导出文件配额，单位B</p>
    */
    @SerializedName("ExportQuota")
    @Expose
    private Long ExportQuota;

    /**
    * <p>导出数据限制</p>
    */
    @SerializedName("ExportLimit")
    @Expose
    private Long ExportLimit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>返回状态码 0 成功 非0不成功</p> 
     * @return ReturnCode <p>返回状态码 0 成功 非0不成功</p>
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set <p>返回状态码 0 成功 非0不成功</p>
     * @param ReturnCode <p>返回状态码 0 成功 非0不成功</p>
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get <p>返回信息  success 成功 其他 不成功</p> 
     * @return ReturnMsg <p>返回信息  success 成功 其他 不成功</p>
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set <p>返回信息  success 成功 其他 不成功</p>
     * @param ReturnMsg <p>返回信息  success 成功 其他 不成功</p>
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get <p>离线导出任务列表</p> 
     * @return Data <p>离线导出任务列表</p>
     */
    public OfflineExportTask [] getData() {
        return this.Data;
    }

    /**
     * Set <p>离线导出任务列表</p>
     * @param Data <p>离线导出任务列表</p>
     */
    public void setData(OfflineExportTask [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>任务数量</p> 
     * @return Total <p>任务数量</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>任务数量</p>
     * @param Total <p>任务数量</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>剩余导出文件配额，单位B</p> 
     * @return ExportRemainQuota <p>剩余导出文件配额，单位B</p>
     */
    public Long getExportRemainQuota() {
        return this.ExportRemainQuota;
    }

    /**
     * Set <p>剩余导出文件配额，单位B</p>
     * @param ExportRemainQuota <p>剩余导出文件配额，单位B</p>
     */
    public void setExportRemainQuota(Long ExportRemainQuota) {
        this.ExportRemainQuota = ExportRemainQuota;
    }

    /**
     * Get <p>导出文件配额，单位B</p> 
     * @return ExportQuota <p>导出文件配额，单位B</p>
     */
    public Long getExportQuota() {
        return this.ExportQuota;
    }

    /**
     * Set <p>导出文件配额，单位B</p>
     * @param ExportQuota <p>导出文件配额，单位B</p>
     */
    public void setExportQuota(Long ExportQuota) {
        this.ExportQuota = ExportQuota;
    }

    /**
     * Get <p>导出数据限制</p> 
     * @return ExportLimit <p>导出数据限制</p>
     */
    public Long getExportLimit() {
        return this.ExportLimit;
    }

    /**
     * Set <p>导出数据限制</p>
     * @param ExportLimit <p>导出数据限制</p>
     */
    public void setExportLimit(Long ExportLimit) {
        this.ExportLimit = ExportLimit;
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

    public DescribeOfflineExportTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOfflineExportTaskResponse(DescribeOfflineExportTaskResponse source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.Data != null) {
            this.Data = new OfflineExportTask[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new OfflineExportTask(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ExportRemainQuota != null) {
            this.ExportRemainQuota = new Long(source.ExportRemainQuota);
        }
        if (source.ExportQuota != null) {
            this.ExportQuota = new Long(source.ExportQuota);
        }
        if (source.ExportLimit != null) {
            this.ExportLimit = new Long(source.ExportLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ExportRemainQuota", this.ExportRemainQuota);
        this.setParamSimple(map, prefix + "ExportQuota", this.ExportQuota);
        this.setParamSimple(map, prefix + "ExportLimit", this.ExportLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

