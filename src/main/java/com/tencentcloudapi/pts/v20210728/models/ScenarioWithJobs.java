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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScenarioWithJobs extends AbstractModel {

    /**
    * <p>Scenario结果</p>
    */
    @SerializedName("Scenario")
    @Expose
    private Scenario Scenario;

    /**
    * <p>job结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Jobs")
    @Expose
    private Job [] Jobs;

    /**
     * Get <p>Scenario结果</p> 
     * @return Scenario <p>Scenario结果</p>
     */
    public Scenario getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>Scenario结果</p>
     * @param Scenario <p>Scenario结果</p>
     */
    public void setScenario(Scenario Scenario) {
        this.Scenario = Scenario;
    }

    /**
     * Get <p>job结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Jobs <p>job结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Job [] getJobs() {
        return this.Jobs;
    }

    /**
     * Set <p>job结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Jobs <p>job结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobs(Job [] Jobs) {
        this.Jobs = Jobs;
    }

    public ScenarioWithJobs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScenarioWithJobs(ScenarioWithJobs source) {
        if (source.Scenario != null) {
            this.Scenario = new Scenario(source.Scenario);
        }
        if (source.Jobs != null) {
            this.Jobs = new Job[source.Jobs.length];
            for (int i = 0; i < source.Jobs.length; i++) {
                this.Jobs[i] = new Job(source.Jobs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Scenario.", this.Scenario);
        this.setParamArrayObj(map, prefix + "Jobs.", this.Jobs);

    }
}

