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
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccountResponse extends AbstractModel {

    /**
    * 删除成功帐号ID列表
    */
    @SerializedName("DelSuccessList")
    @Expose
    private String [] DelSuccessList;

    /**
    * 删除失败帐号ID列表
    */
    @SerializedName("DelFailedList")
    @Expose
    private String [] DelFailedList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除成功帐号ID列表 
     * @return DelSuccessList 删除成功帐号ID列表
     */
    public String [] getDelSuccessList() {
        return this.DelSuccessList;
    }

    /**
     * Set 删除成功帐号ID列表
     * @param DelSuccessList 删除成功帐号ID列表
     */
    public void setDelSuccessList(String [] DelSuccessList) {
        this.DelSuccessList = DelSuccessList;
    }

    /**
     * Get 删除失败帐号ID列表 
     * @return DelFailedList 删除失败帐号ID列表
     */
    public String [] getDelFailedList() {
        return this.DelFailedList;
    }

    /**
     * Set 删除失败帐号ID列表
     * @param DelFailedList 删除失败帐号ID列表
     */
    public void setDelFailedList(String [] DelFailedList) {
        this.DelFailedList = DelFailedList;
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

    public DeleteAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccountResponse(DeleteAccountResponse source) {
        if (source.DelSuccessList != null) {
            this.DelSuccessList = new String[source.DelSuccessList.length];
            for (int i = 0; i < source.DelSuccessList.length; i++) {
                this.DelSuccessList[i] = new String(source.DelSuccessList[i]);
            }
        }
        if (source.DelFailedList != null) {
            this.DelFailedList = new String[source.DelFailedList.length];
            for (int i = 0; i < source.DelFailedList.length; i++) {
                this.DelFailedList[i] = new String(source.DelFailedList[i]);
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
        this.setParamArraySimple(map, prefix + "DelSuccessList.", this.DelSuccessList);
        this.setParamArraySimple(map, prefix + "DelFailedList.", this.DelFailedList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

