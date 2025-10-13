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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineagePair extends AbstractModel {

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private LineageResouce Source;

    /**
    * 目标
    */
    @SerializedName("Target")
    @Expose
    private LineageResouce Target;

    /**
    * 血缘加工过程
    */
    @SerializedName("Processes")
    @Expose
    private LineageProcess [] Processes;

    /**
     * Get 来源 
     * @return Source 来源
     */
    public LineageResouce getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(LineageResouce Source) {
        this.Source = Source;
    }

    /**
     * Get 目标 
     * @return Target 目标
     */
    public LineageResouce getTarget() {
        return this.Target;
    }

    /**
     * Set 目标
     * @param Target 目标
     */
    public void setTarget(LineageResouce Target) {
        this.Target = Target;
    }

    /**
     * Get 血缘加工过程 
     * @return Processes 血缘加工过程
     */
    public LineageProcess [] getProcesses() {
        return this.Processes;
    }

    /**
     * Set 血缘加工过程
     * @param Processes 血缘加工过程
     */
    public void setProcesses(LineageProcess [] Processes) {
        this.Processes = Processes;
    }

    public LineagePair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineagePair(LineagePair source) {
        if (source.Source != null) {
            this.Source = new LineageResouce(source.Source);
        }
        if (source.Target != null) {
            this.Target = new LineageResouce(source.Target);
        }
        if (source.Processes != null) {
            this.Processes = new LineageProcess[source.Processes.length];
            for (int i = 0; i < source.Processes.length; i++) {
                this.Processes[i] = new LineageProcess(source.Processes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "Processes.", this.Processes);

    }
}

