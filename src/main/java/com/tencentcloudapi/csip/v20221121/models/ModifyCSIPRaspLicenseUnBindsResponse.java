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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCSIPRaspLicenseUnBindsResponse extends AbstractModel {

    /**
    * <p>总数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>成功数</p>
    */
    @SerializedName("SuccessNum")
    @Expose
    private Long SuccessNum;

    /**
    * <p>失败数</p>
    */
    @SerializedName("FailedNum")
    @Expose
    private Long FailedNum;

    /**
    * <p>失败明细</p>
    */
    @SerializedName("FailedList")
    @Expose
    private LicenseUnbindFailedItem [] FailedList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总数</p> 
     * @return Total <p>总数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>总数</p>
     * @param Total <p>总数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>成功数</p> 
     * @return SuccessNum <p>成功数</p>
     */
    public Long getSuccessNum() {
        return this.SuccessNum;
    }

    /**
     * Set <p>成功数</p>
     * @param SuccessNum <p>成功数</p>
     */
    public void setSuccessNum(Long SuccessNum) {
        this.SuccessNum = SuccessNum;
    }

    /**
     * Get <p>失败数</p> 
     * @return FailedNum <p>失败数</p>
     */
    public Long getFailedNum() {
        return this.FailedNum;
    }

    /**
     * Set <p>失败数</p>
     * @param FailedNum <p>失败数</p>
     */
    public void setFailedNum(Long FailedNum) {
        this.FailedNum = FailedNum;
    }

    /**
     * Get <p>失败明细</p> 
     * @return FailedList <p>失败明细</p>
     */
    public LicenseUnbindFailedItem [] getFailedList() {
        return this.FailedList;
    }

    /**
     * Set <p>失败明细</p>
     * @param FailedList <p>失败明细</p>
     */
    public void setFailedList(LicenseUnbindFailedItem [] FailedList) {
        this.FailedList = FailedList;
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

    public ModifyCSIPRaspLicenseUnBindsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCSIPRaspLicenseUnBindsResponse(ModifyCSIPRaspLicenseUnBindsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SuccessNum != null) {
            this.SuccessNum = new Long(source.SuccessNum);
        }
        if (source.FailedNum != null) {
            this.FailedNum = new Long(source.FailedNum);
        }
        if (source.FailedList != null) {
            this.FailedList = new LicenseUnbindFailedItem[source.FailedList.length];
            for (int i = 0; i < source.FailedList.length; i++) {
                this.FailedList[i] = new LicenseUnbindFailedItem(source.FailedList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SuccessNum", this.SuccessNum);
        this.setParamSimple(map, prefix + "FailedNum", this.FailedNum);
        this.setParamArrayObj(map, prefix + "FailedList.", this.FailedList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

