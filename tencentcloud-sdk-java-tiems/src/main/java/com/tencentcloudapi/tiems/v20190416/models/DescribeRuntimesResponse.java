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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuntimesResponse extends AbstractModel{

    /**
    * TIEMS支持的运行环境列表
    */
    @SerializedName("Runtimes")
    @Expose
    private Runtime [] Runtimes;

    /**
    * 用户对runtime对权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAccess")
    @Expose
    private Long UserAccess;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get TIEMS支持的运行环境列表 
     * @return Runtimes TIEMS支持的运行环境列表
     */
    public Runtime [] getRuntimes() {
        return this.Runtimes;
    }

    /**
     * Set TIEMS支持的运行环境列表
     * @param Runtimes TIEMS支持的运行环境列表
     */
    public void setRuntimes(Runtime [] Runtimes) {
        this.Runtimes = Runtimes;
    }

    /**
     * Get 用户对runtime对权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAccess 用户对runtime对权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserAccess() {
        return this.UserAccess;
    }

    /**
     * Set 用户对runtime对权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAccess 用户对runtime对权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAccess(Long UserAccess) {
        this.UserAccess = UserAccess;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Runtimes.", this.Runtimes);
        this.setParamSimple(map, prefix + "UserAccess", this.UserAccess);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

