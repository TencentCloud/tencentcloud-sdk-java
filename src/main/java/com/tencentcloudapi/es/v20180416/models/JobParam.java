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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobParam extends AbstractModel {

    /**
    * 诊断项列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Jobs")
    @Expose
    private String [] Jobs;

    /**
    * 诊断索引
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * 历史诊断时间
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get 诊断项列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Jobs 诊断项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getJobs() {
        return this.Jobs;
    }

    /**
     * Set 诊断项列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Jobs 诊断项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobs(String [] Jobs) {
        this.Jobs = Jobs;
    }

    /**
     * Get 诊断索引 
     * @return Indices 诊断索引
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set 诊断索引
     * @param Indices 诊断索引
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get 历史诊断时间 
     * @return Interval 历史诊断时间
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 历史诊断时间
     * @param Interval 历史诊断时间
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public JobParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobParam(JobParam source) {
        if (source.Jobs != null) {
            this.Jobs = new String[source.Jobs.length];
            for (int i = 0; i < source.Jobs.length; i++) {
                this.Jobs[i] = new String(source.Jobs[i]);
            }
        }
        if (source.Indices != null) {
            this.Indices = new String(source.Indices);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Jobs.", this.Jobs);
        this.setParamSimple(map, prefix + "Indices", this.Indices);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

