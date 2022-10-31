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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMigrateJobSpecRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 新实例规格大小，包括：micro、small、medium、large、xlarge、2xlarge
    */
    @SerializedName("NewInstanceClass")
    @Expose
    private String NewInstanceClass;

    /**
     * Get 任务id 
     * @return JobId 任务id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务id
     * @param JobId 任务id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 新实例规格大小，包括：micro、small、medium、large、xlarge、2xlarge 
     * @return NewInstanceClass 新实例规格大小，包括：micro、small、medium、large、xlarge、2xlarge
     */
    public String getNewInstanceClass() {
        return this.NewInstanceClass;
    }

    /**
     * Set 新实例规格大小，包括：micro、small、medium、large、xlarge、2xlarge
     * @param NewInstanceClass 新实例规格大小，包括：micro、small、medium、large、xlarge、2xlarge
     */
    public void setNewInstanceClass(String NewInstanceClass) {
        this.NewInstanceClass = NewInstanceClass;
    }

    public ModifyMigrateJobSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrateJobSpecRequest(ModifyMigrateJobSpecRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.NewInstanceClass != null) {
            this.NewInstanceClass = new String(source.NewInstanceClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "NewInstanceClass", this.NewInstanceClass);

    }
}

