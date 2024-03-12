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

public class DescribeDatabasesNormalResponse extends AbstractModel {

    /**
    * 表示当前实例下的数据库总个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回数据库的详细配置信息，例如：数据库是否开启CDC、CT等
    */
    @SerializedName("DBList")
    @Expose
    private DbNormalDetail [] DBList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表示当前实例下的数据库总个数 
     * @return TotalCount 表示当前实例下的数据库总个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 表示当前实例下的数据库总个数
     * @param TotalCount 表示当前实例下的数据库总个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回数据库的详细配置信息，例如：数据库是否开启CDC、CT等 
     * @return DBList 返回数据库的详细配置信息，例如：数据库是否开启CDC、CT等
     */
    public DbNormalDetail [] getDBList() {
        return this.DBList;
    }

    /**
     * Set 返回数据库的详细配置信息，例如：数据库是否开启CDC、CT等
     * @param DBList 返回数据库的详细配置信息，例如：数据库是否开启CDC、CT等
     */
    public void setDBList(DbNormalDetail [] DBList) {
        this.DBList = DBList;
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

    public DescribeDatabasesNormalResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabasesNormalResponse(DescribeDatabasesNormalResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DBList != null) {
            this.DBList = new DbNormalDetail[source.DBList.length];
            for (int i = 0; i < source.DBList.length; i++) {
                this.DBList[i] = new DbNormalDetail(source.DBList[i]);
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
        this.setParamArrayObj(map, prefix + "DBList.", this.DBList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

