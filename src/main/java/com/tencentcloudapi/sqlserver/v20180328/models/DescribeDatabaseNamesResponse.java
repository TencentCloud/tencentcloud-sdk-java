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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseNamesResponse extends AbstractModel {

    /**
    * 账户关联的数据库总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 数据库名称集合
    */
    @SerializedName("DatabaseNameSet")
    @Expose
    private String [] DatabaseNameSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账户关联的数据库总数 
     * @return TotalCount 账户关联的数据库总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 账户关联的数据库总数
     * @param TotalCount 账户关联的数据库总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 数据库名称集合 
     * @return DatabaseNameSet 数据库名称集合
     */
    public String [] getDatabaseNameSet() {
        return this.DatabaseNameSet;
    }

    /**
     * Set 数据库名称集合
     * @param DatabaseNameSet 数据库名称集合
     */
    public void setDatabaseNameSet(String [] DatabaseNameSet) {
        this.DatabaseNameSet = DatabaseNameSet;
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

    public DescribeDatabaseNamesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseNamesResponse(DescribeDatabaseNamesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DatabaseNameSet != null) {
            this.DatabaseNameSet = new String[source.DatabaseNameSet.length];
            for (int i = 0; i < source.DatabaseNameSet.length; i++) {
                this.DatabaseNameSet[i] = new String(source.DatabaseNameSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "DatabaseNameSet.", this.DatabaseNameSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

