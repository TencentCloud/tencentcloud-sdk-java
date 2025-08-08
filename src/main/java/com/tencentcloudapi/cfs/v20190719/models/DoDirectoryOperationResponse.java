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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DoDirectoryOperationResponse extends AbstractModel {

    /**
    * 1:成功  0:失败  创建目录的操作，1表示创建成功，0表示创建失败。  确认目录是否存在的操作，1表示目录存在，0表示目录不存在。  说明：创建目录操作若目录已存在，也会返回创建成功。
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 1:成功  0:失败  创建目录的操作，1表示创建成功，0表示创建失败。  确认目录是否存在的操作，1表示目录存在，0表示目录不存在。  说明：创建目录操作若目录已存在，也会返回创建成功。 
     * @return Result 1:成功  0:失败  创建目录的操作，1表示创建成功，0表示创建失败。  确认目录是否存在的操作，1表示目录存在，0表示目录不存在。  说明：创建目录操作若目录已存在，也会返回创建成功。
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 1:成功  0:失败  创建目录的操作，1表示创建成功，0表示创建失败。  确认目录是否存在的操作，1表示目录存在，0表示目录不存在。  说明：创建目录操作若目录已存在，也会返回创建成功。
     * @param Result 1:成功  0:失败  创建目录的操作，1表示创建成功，0表示创建失败。  确认目录是否存在的操作，1表示目录存在，0表示目录不存在。  说明：创建目录操作若目录已存在，也会返回创建成功。
     */
    public void setResult(Long Result) {
        this.Result = Result;
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

    public DoDirectoryOperationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoDirectoryOperationResponse(DoDirectoryOperationResponse source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

