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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloneDBInstanceSpecResponse extends AbstractModel{

    /**
    * 可购买的最小规格码。
    */
    @SerializedName("MinSpecCode")
    @Expose
    private String MinSpecCode;

    /**
    * 可购买的最小磁盘容量，单位GB。
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可购买的最小规格码。 
     * @return MinSpecCode 可购买的最小规格码。
     */
    public String getMinSpecCode() {
        return this.MinSpecCode;
    }

    /**
     * Set 可购买的最小规格码。
     * @param MinSpecCode 可购买的最小规格码。
     */
    public void setMinSpecCode(String MinSpecCode) {
        this.MinSpecCode = MinSpecCode;
    }

    /**
     * Get 可购买的最小磁盘容量，单位GB。 
     * @return MinStorage 可购买的最小磁盘容量，单位GB。
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set 可购买的最小磁盘容量，单位GB。
     * @param MinStorage 可购买的最小磁盘容量，单位GB。
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
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

    public DescribeCloneDBInstanceSpecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloneDBInstanceSpecResponse(DescribeCloneDBInstanceSpecResponse source) {
        if (source.MinSpecCode != null) {
            this.MinSpecCode = new String(source.MinSpecCode);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinSpecCode", this.MinSpecCode);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

