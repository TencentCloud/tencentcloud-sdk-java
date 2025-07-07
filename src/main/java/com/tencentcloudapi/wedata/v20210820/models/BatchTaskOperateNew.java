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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchTaskOperateNew extends AbstractModel {

    /**
    * 操作Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
     * Get 操作Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 操作Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 操作Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 操作Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    public BatchTaskOperateNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchTaskOperateNew(BatchTaskOperateNew source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

