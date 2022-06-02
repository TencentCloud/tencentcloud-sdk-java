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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckEdgeClusterCIDRResponse extends AbstractModel{

    /**
    * 返回码，具体如下
-1 内部错误
0 没冲突
1 vpc 和 serviceCIDR 冲突
2 vpc 和 podCIDR 冲突
3 serviceCIDR  和 podCIDR 冲突
    */
    @SerializedName("ConflictCode")
    @Expose
    private Long ConflictCode;

    /**
    * CIDR冲突描述信息。
    */
    @SerializedName("ConflictMsg")
    @Expose
    private String ConflictMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回码，具体如下
-1 内部错误
0 没冲突
1 vpc 和 serviceCIDR 冲突
2 vpc 和 podCIDR 冲突
3 serviceCIDR  和 podCIDR 冲突 
     * @return ConflictCode 返回码，具体如下
-1 内部错误
0 没冲突
1 vpc 和 serviceCIDR 冲突
2 vpc 和 podCIDR 冲突
3 serviceCIDR  和 podCIDR 冲突
     */
    public Long getConflictCode() {
        return this.ConflictCode;
    }

    /**
     * Set 返回码，具体如下
-1 内部错误
0 没冲突
1 vpc 和 serviceCIDR 冲突
2 vpc 和 podCIDR 冲突
3 serviceCIDR  和 podCIDR 冲突
     * @param ConflictCode 返回码，具体如下
-1 内部错误
0 没冲突
1 vpc 和 serviceCIDR 冲突
2 vpc 和 podCIDR 冲突
3 serviceCIDR  和 podCIDR 冲突
     */
    public void setConflictCode(Long ConflictCode) {
        this.ConflictCode = ConflictCode;
    }

    /**
     * Get CIDR冲突描述信息。 
     * @return ConflictMsg CIDR冲突描述信息。
     */
    public String getConflictMsg() {
        return this.ConflictMsg;
    }

    /**
     * Set CIDR冲突描述信息。
     * @param ConflictMsg CIDR冲突描述信息。
     */
    public void setConflictMsg(String ConflictMsg) {
        this.ConflictMsg = ConflictMsg;
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

    public CheckEdgeClusterCIDRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckEdgeClusterCIDRResponse(CheckEdgeClusterCIDRResponse source) {
        if (source.ConflictCode != null) {
            this.ConflictCode = new Long(source.ConflictCode);
        }
        if (source.ConflictMsg != null) {
            this.ConflictMsg = new String(source.ConflictMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictCode", this.ConflictCode);
        this.setParamSimple(map, prefix + "ConflictMsg", this.ConflictMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

