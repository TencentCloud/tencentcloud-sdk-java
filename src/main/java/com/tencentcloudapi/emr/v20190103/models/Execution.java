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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Execution extends AbstractModel{

    /**
    * 任务类型，目前支持以下类型。
1. “MR”，将通过hadoop jar的方式提交。
2. "HIVE"，将通过hive -f的方式提交。
3. "SPARK"，将通过spark-submit的方式提交。
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 任务参数，提供除提交指令以外的参数。
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
     * Get 任务类型，目前支持以下类型。
1. “MR”，将通过hadoop jar的方式提交。
2. "HIVE"，将通过hive -f的方式提交。
3. "SPARK"，将通过spark-submit的方式提交。 
     * @return JobType 任务类型，目前支持以下类型。
1. “MR”，将通过hadoop jar的方式提交。
2. "HIVE"，将通过hive -f的方式提交。
3. "SPARK"，将通过spark-submit的方式提交。
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 任务类型，目前支持以下类型。
1. “MR”，将通过hadoop jar的方式提交。
2. "HIVE"，将通过hive -f的方式提交。
3. "SPARK"，将通过spark-submit的方式提交。
     * @param JobType 任务类型，目前支持以下类型。
1. “MR”，将通过hadoop jar的方式提交。
2. "HIVE"，将通过hive -f的方式提交。
3. "SPARK"，将通过spark-submit的方式提交。
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 任务参数，提供除提交指令以外的参数。 
     * @return Args 任务参数，提供除提交指令以外的参数。
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 任务参数，提供除提交指令以外的参数。
     * @param Args 任务参数，提供除提交指令以外的参数。
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    public Execution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Execution(Execution source) {
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);

    }
}

