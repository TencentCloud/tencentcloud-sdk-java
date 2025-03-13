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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWhiteBoardSnapshotResponse extends AbstractModel {

    /**
    * 板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式
    */
    @SerializedName("WhiteBoardSnapshotMode")
    @Expose
    private Long WhiteBoardSnapshotMode;

    /**
    * 板书任务状态，0：未开始，1：进行中，2：失败，3：成功，4：已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 板书截图链接
    */
    @SerializedName("Result")
    @Expose
    private String [] Result;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式 
     * @return WhiteBoardSnapshotMode 板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式
     */
    public Long getWhiteBoardSnapshotMode() {
        return this.WhiteBoardSnapshotMode;
    }

    /**
     * Set 板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式
     * @param WhiteBoardSnapshotMode 板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式
     */
    public void setWhiteBoardSnapshotMode(Long WhiteBoardSnapshotMode) {
        this.WhiteBoardSnapshotMode = WhiteBoardSnapshotMode;
    }

    /**
     * Get 板书任务状态，0：未开始，1：进行中，2：失败，3：成功，4：已删除 
     * @return Status 板书任务状态，0：未开始，1：进行中，2：失败，3：成功，4：已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 板书任务状态，0：未开始，1：进行中，2：失败，3：成功，4：已删除
     * @param Status 板书任务状态，0：未开始，1：进行中，2：失败，3：成功，4：已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 板书截图链接 
     * @return Result 板书截图链接
     */
    public String [] getResult() {
        return this.Result;
    }

    /**
     * Set 板书截图链接
     * @param Result 板书截图链接
     */
    public void setResult(String [] Result) {
        this.Result = Result;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeWhiteBoardSnapshotResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteBoardSnapshotResponse(DescribeWhiteBoardSnapshotResponse source) {
        if (source.WhiteBoardSnapshotMode != null) {
            this.WhiteBoardSnapshotMode = new Long(source.WhiteBoardSnapshotMode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new String(source.Result[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteBoardSnapshotMode", this.WhiteBoardSnapshotMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

