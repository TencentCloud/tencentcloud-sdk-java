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

public class DescribeAssetSyncResponse extends AbstractModel {

    /**
    * <p>返回状态<br>1 更新中<br>2 更新完成<br>3 更新失败<br>4 更新失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>success 成功<br>其他失败</p>
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * <p>0 成功<br>非0 失败</p>
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * <p>已有CVM数量</p>
    */
    @SerializedName("CVMCount")
    @Expose
    private Long CVMCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>返回状态<br>1 更新中<br>2 更新完成<br>3 更新失败<br>4 更新失败</p> 
     * @return Status <p>返回状态<br>1 更新中<br>2 更新完成<br>3 更新失败<br>4 更新失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>返回状态<br>1 更新中<br>2 更新完成<br>3 更新失败<br>4 更新失败</p>
     * @param Status <p>返回状态<br>1 更新中<br>2 更新完成<br>3 更新失败<br>4 更新失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>success 成功<br>其他失败</p> 
     * @return ReturnMsg <p>success 成功<br>其他失败</p>
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set <p>success 成功<br>其他失败</p>
     * @param ReturnMsg <p>success 成功<br>其他失败</p>
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get <p>0 成功<br>非0 失败</p> 
     * @return ReturnCode <p>0 成功<br>非0 失败</p>
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set <p>0 成功<br>非0 失败</p>
     * @param ReturnCode <p>0 成功<br>非0 失败</p>
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get <p>已有CVM数量</p> 
     * @return CVMCount <p>已有CVM数量</p>
     */
    public Long getCVMCount() {
        return this.CVMCount;
    }

    /**
     * Set <p>已有CVM数量</p>
     * @param CVMCount <p>已有CVM数量</p>
     */
    public void setCVMCount(Long CVMCount) {
        this.CVMCount = CVMCount;
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

    public DescribeAssetSyncResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetSyncResponse(DescribeAssetSyncResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.CVMCount != null) {
            this.CVMCount = new Long(source.CVMCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "CVMCount", this.CVMCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

