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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOnCallFormsResponse extends AbstractModel {

    /**
    * <p>失败删除的排班id</p>
    */
    @SerializedName("FailedOnCallFormIDs")
    @Expose
    private String [] FailedOnCallFormIDs;

    /**
    * <p>成功删除的排班id</p>
    */
    @SerializedName("SuccessOnCallFormIDs")
    @Expose
    private String [] SuccessOnCallFormIDs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>失败删除的排班id</p> 
     * @return FailedOnCallFormIDs <p>失败删除的排班id</p>
     */
    public String [] getFailedOnCallFormIDs() {
        return this.FailedOnCallFormIDs;
    }

    /**
     * Set <p>失败删除的排班id</p>
     * @param FailedOnCallFormIDs <p>失败删除的排班id</p>
     */
    public void setFailedOnCallFormIDs(String [] FailedOnCallFormIDs) {
        this.FailedOnCallFormIDs = FailedOnCallFormIDs;
    }

    /**
     * Get <p>成功删除的排班id</p> 
     * @return SuccessOnCallFormIDs <p>成功删除的排班id</p>
     */
    public String [] getSuccessOnCallFormIDs() {
        return this.SuccessOnCallFormIDs;
    }

    /**
     * Set <p>成功删除的排班id</p>
     * @param SuccessOnCallFormIDs <p>成功删除的排班id</p>
     */
    public void setSuccessOnCallFormIDs(String [] SuccessOnCallFormIDs) {
        this.SuccessOnCallFormIDs = SuccessOnCallFormIDs;
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

    public DeleteOnCallFormsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOnCallFormsResponse(DeleteOnCallFormsResponse source) {
        if (source.FailedOnCallFormIDs != null) {
            this.FailedOnCallFormIDs = new String[source.FailedOnCallFormIDs.length];
            for (int i = 0; i < source.FailedOnCallFormIDs.length; i++) {
                this.FailedOnCallFormIDs[i] = new String(source.FailedOnCallFormIDs[i]);
            }
        }
        if (source.SuccessOnCallFormIDs != null) {
            this.SuccessOnCallFormIDs = new String[source.SuccessOnCallFormIDs.length];
            for (int i = 0; i < source.SuccessOnCallFormIDs.length; i++) {
                this.SuccessOnCallFormIDs[i] = new String(source.SuccessOnCallFormIDs[i]);
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
        this.setParamArraySimple(map, prefix + "FailedOnCallFormIDs.", this.FailedOnCallFormIDs);
        this.setParamArraySimple(map, prefix + "SuccessOnCallFormIDs.", this.SuccessOnCallFormIDs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

