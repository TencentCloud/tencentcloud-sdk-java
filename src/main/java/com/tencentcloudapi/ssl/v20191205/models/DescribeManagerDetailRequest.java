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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeManagerDetailRequest extends AbstractModel {

    /**
    * 管理人ID,可以从describeManagers接口获得
    */
    @SerializedName("ManagerId")
    @Expose
    private Long ManagerId;

    /**
    * 分页每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 管理人ID,可以从describeManagers接口获得 
     * @return ManagerId 管理人ID,可以从describeManagers接口获得
     */
    public Long getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 管理人ID,可以从describeManagers接口获得
     * @param ManagerId 管理人ID,可以从describeManagers接口获得
     */
    public void setManagerId(Long ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 分页每页数量 
     * @return Limit 分页每页数量
     * @deprecated
     */
    @Deprecated
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页数量
     * @param Limit 分页每页数量
     * @deprecated
     */
    @Deprecated
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     * @deprecated
     */
    @Deprecated
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     * @deprecated
     */
    @Deprecated
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeManagerDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeManagerDetailRequest(DescribeManagerDetailRequest source) {
        if (source.ManagerId != null) {
            this.ManagerId = new Long(source.ManagerId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

