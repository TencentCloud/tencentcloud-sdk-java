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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReadOnlyGroupDetailsRequest extends AbstractModel {

    /**
    * 主实例ID，格式如：mssql-3l3fgqn7
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 只读组ID，格式如：mssqlrg-3l3fgqn7
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
     * Get 主实例ID，格式如：mssql-3l3fgqn7 
     * @return InstanceId 主实例ID，格式如：mssql-3l3fgqn7
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主实例ID，格式如：mssql-3l3fgqn7
     * @param InstanceId 主实例ID，格式如：mssql-3l3fgqn7
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 只读组ID，格式如：mssqlrg-3l3fgqn7 
     * @return ReadOnlyGroupId 只读组ID，格式如：mssqlrg-3l3fgqn7
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 只读组ID，格式如：mssqlrg-3l3fgqn7
     * @param ReadOnlyGroupId 只读组ID，格式如：mssqlrg-3l3fgqn7
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    public DescribeReadOnlyGroupDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReadOnlyGroupDetailsRequest(DescribeReadOnlyGroupDetailsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);

    }
}

