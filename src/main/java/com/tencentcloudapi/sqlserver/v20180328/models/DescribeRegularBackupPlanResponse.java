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

public class DescribeRegularBackupPlanResponse extends AbstractModel {

    /**
    * 常规备份计划
    */
    @SerializedName("SaveModePeriod")
    @Expose
    private String [] SaveModePeriod;

    /**
    * 定期备份计划
    */
    @SerializedName("SaveModeRegular")
    @Expose
    private String [] SaveModeRegular;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 常规备份计划 
     * @return SaveModePeriod 常规备份计划
     */
    public String [] getSaveModePeriod() {
        return this.SaveModePeriod;
    }

    /**
     * Set 常规备份计划
     * @param SaveModePeriod 常规备份计划
     */
    public void setSaveModePeriod(String [] SaveModePeriod) {
        this.SaveModePeriod = SaveModePeriod;
    }

    /**
     * Get 定期备份计划 
     * @return SaveModeRegular 定期备份计划
     */
    public String [] getSaveModeRegular() {
        return this.SaveModeRegular;
    }

    /**
     * Set 定期备份计划
     * @param SaveModeRegular 定期备份计划
     */
    public void setSaveModeRegular(String [] SaveModeRegular) {
        this.SaveModeRegular = SaveModeRegular;
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

    public DescribeRegularBackupPlanResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegularBackupPlanResponse(DescribeRegularBackupPlanResponse source) {
        if (source.SaveModePeriod != null) {
            this.SaveModePeriod = new String[source.SaveModePeriod.length];
            for (int i = 0; i < source.SaveModePeriod.length; i++) {
                this.SaveModePeriod[i] = new String(source.SaveModePeriod[i]);
            }
        }
        if (source.SaveModeRegular != null) {
            this.SaveModeRegular = new String[source.SaveModeRegular.length];
            for (int i = 0; i < source.SaveModeRegular.length; i++) {
                this.SaveModeRegular[i] = new String(source.SaveModeRegular[i]);
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
        this.setParamArraySimple(map, prefix + "SaveModePeriod.", this.SaveModePeriod);
        this.setParamArraySimple(map, prefix + "SaveModeRegular.", this.SaveModeRegular);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

