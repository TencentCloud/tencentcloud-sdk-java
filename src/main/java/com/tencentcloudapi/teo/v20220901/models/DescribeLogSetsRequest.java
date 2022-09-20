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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogSetsRequest extends AbstractModel{

    /**
    * 日志集所属的地域。
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * 日志集ID。
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志集名称。
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
     * Get 日志集所属的地域。 
     * @return LogSetRegion 日志集所属的地域。
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set 日志集所属的地域。
     * @param LogSetRegion 日志集所属的地域。
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    /**
     * Get 日志集ID。 
     * @return LogSetId 日志集ID。
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 日志集ID。
     * @param LogSetId 日志集ID。
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 日志集名称。 
     * @return LogSetName 日志集名称。
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set 日志集名称。
     * @param LogSetName 日志集名称。
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    public DescribeLogSetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogSetsRequest(DescribeLogSetsRequest source) {
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);

    }
}

