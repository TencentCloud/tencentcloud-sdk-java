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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopTableStatRequest extends AbstractModel{

    /**
    * Project Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 开始时间，时间戳到秒
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 结束时间，时间戳到秒
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get Project Id 
     * @return ProjectId Project Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project Id
     * @param ProjectId Project Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 开始时间，时间戳到秒 
     * @return BeginDate 开始时间，时间戳到秒
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 开始时间，时间戳到秒
     * @param BeginDate 开始时间，时间戳到秒
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 结束时间，时间戳到秒 
     * @return EndDate 结束时间，时间戳到秒
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束时间，时间戳到秒
     * @param EndDate 结束时间，时间戳到秒
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public DescribeTopTableStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopTableStatRequest(DescribeTopTableStatRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

