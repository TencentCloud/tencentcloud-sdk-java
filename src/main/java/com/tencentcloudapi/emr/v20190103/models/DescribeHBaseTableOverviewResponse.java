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

public class DescribeHBaseTableOverviewResponse extends AbstractModel {

    /**
    * 概览数据数组
    */
    @SerializedName("TableMonitorList")
    @Expose
    private OverviewRow [] TableMonitorList;

    /**
    * 概览数据数组长度
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 表schema信息
    */
    @SerializedName("SchemaList")
    @Expose
    private TableSchemaItem [] SchemaList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 概览数据数组 
     * @return TableMonitorList 概览数据数组
     */
    public OverviewRow [] getTableMonitorList() {
        return this.TableMonitorList;
    }

    /**
     * Set 概览数据数组
     * @param TableMonitorList 概览数据数组
     */
    public void setTableMonitorList(OverviewRow [] TableMonitorList) {
        this.TableMonitorList = TableMonitorList;
    }

    /**
     * Get 概览数据数组长度 
     * @return TotalCount 概览数据数组长度
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 概览数据数组长度
     * @param TotalCount 概览数据数组长度
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 表schema信息 
     * @return SchemaList 表schema信息
     */
    public TableSchemaItem [] getSchemaList() {
        return this.SchemaList;
    }

    /**
     * Set 表schema信息
     * @param SchemaList 表schema信息
     */
    public void setSchemaList(TableSchemaItem [] SchemaList) {
        this.SchemaList = SchemaList;
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

    public DescribeHBaseTableOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHBaseTableOverviewResponse(DescribeHBaseTableOverviewResponse source) {
        if (source.TableMonitorList != null) {
            this.TableMonitorList = new OverviewRow[source.TableMonitorList.length];
            for (int i = 0; i < source.TableMonitorList.length; i++) {
                this.TableMonitorList[i] = new OverviewRow(source.TableMonitorList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SchemaList != null) {
            this.SchemaList = new TableSchemaItem[source.SchemaList.length];
            for (int i = 0; i < source.SchemaList.length; i++) {
                this.SchemaList[i] = new TableSchemaItem(source.SchemaList[i]);
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
        this.setParamArrayObj(map, prefix + "TableMonitorList.", this.TableMonitorList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SchemaList.", this.SchemaList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

