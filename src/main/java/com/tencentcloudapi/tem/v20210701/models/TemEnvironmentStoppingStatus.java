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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemEnvironmentStoppingStatus extends AbstractModel{

    /**
    * 需要停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationNumNeedToStop")
    @Expose
    private Long ApplicationNumNeedToStop;

    /**
    * 已经停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppedApplicationNum")
    @Expose
    private Long StoppedApplicationNum;

    /**
    * 停止失败的应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopFailedApplicationNum")
    @Expose
    private Long StopFailedApplicationNum;

    /**
     * Get 需要停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationNumNeedToStop 需要停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplicationNumNeedToStop() {
        return this.ApplicationNumNeedToStop;
    }

    /**
     * Set 需要停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationNumNeedToStop 需要停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationNumNeedToStop(Long ApplicationNumNeedToStop) {
        this.ApplicationNumNeedToStop = ApplicationNumNeedToStop;
    }

    /**
     * Get 已经停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppedApplicationNum 已经停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoppedApplicationNum() {
        return this.StoppedApplicationNum;
    }

    /**
     * Set 已经停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppedApplicationNum 已经停止的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppedApplicationNum(Long StoppedApplicationNum) {
        this.StoppedApplicationNum = StoppedApplicationNum;
    }

    /**
     * Get 停止失败的应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopFailedApplicationNum 停止失败的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStopFailedApplicationNum() {
        return this.StopFailedApplicationNum;
    }

    /**
     * Set 停止失败的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopFailedApplicationNum 停止失败的应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopFailedApplicationNum(Long StopFailedApplicationNum) {
        this.StopFailedApplicationNum = StopFailedApplicationNum;
    }

    public TemEnvironmentStoppingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemEnvironmentStoppingStatus(TemEnvironmentStoppingStatus source) {
        if (source.ApplicationNumNeedToStop != null) {
            this.ApplicationNumNeedToStop = new Long(source.ApplicationNumNeedToStop);
        }
        if (source.StoppedApplicationNum != null) {
            this.StoppedApplicationNum = new Long(source.StoppedApplicationNum);
        }
        if (source.StopFailedApplicationNum != null) {
            this.StopFailedApplicationNum = new Long(source.StopFailedApplicationNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationNumNeedToStop", this.ApplicationNumNeedToStop);
        this.setParamSimple(map, prefix + "StoppedApplicationNum", this.StoppedApplicationNum);
        this.setParamSimple(map, prefix + "StopFailedApplicationNum", this.StopFailedApplicationNum);

    }
}

