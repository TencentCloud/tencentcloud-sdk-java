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

public class DescribeCollationTimeZoneResponse extends AbstractModel {

    /**
    * 系统字符集排序规则列表
    */
    @SerializedName("Collation")
    @Expose
    private String [] Collation;

    /**
    * 系统时区列表
    */
    @SerializedName("TimeZone")
    @Expose
    private String [] TimeZone;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 系统字符集排序规则列表 
     * @return Collation 系统字符集排序规则列表
     */
    public String [] getCollation() {
        return this.Collation;
    }

    /**
     * Set 系统字符集排序规则列表
     * @param Collation 系统字符集排序规则列表
     */
    public void setCollation(String [] Collation) {
        this.Collation = Collation;
    }

    /**
     * Get 系统时区列表 
     * @return TimeZone 系统时区列表
     */
    public String [] getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 系统时区列表
     * @param TimeZone 系统时区列表
     */
    public void setTimeZone(String [] TimeZone) {
        this.TimeZone = TimeZone;
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

    public DescribeCollationTimeZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCollationTimeZoneResponse(DescribeCollationTimeZoneResponse source) {
        if (source.Collation != null) {
            this.Collation = new String[source.Collation.length];
            for (int i = 0; i < source.Collation.length; i++) {
                this.Collation[i] = new String(source.Collation[i]);
            }
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String[source.TimeZone.length];
            for (int i = 0; i < source.TimeZone.length; i++) {
                this.TimeZone[i] = new String(source.TimeZone[i]);
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
        this.setParamArraySimple(map, prefix + "Collation.", this.Collation);
        this.setParamArraySimple(map, prefix + "TimeZone.", this.TimeZone);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

