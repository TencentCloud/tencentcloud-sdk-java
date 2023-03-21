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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportTypeVersion extends AbstractModel{

    /**
    * 检验报告
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 版本2
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
     * Get 检验报告 
     * @return ReportType 检验报告
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 检验报告
     * @param ReportType 检验报告
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 版本2 
     * @return Version 版本2
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 版本2
     * @param Version 版本2
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    public ReportTypeVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTypeVersion(ReportTypeVersion source) {
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

