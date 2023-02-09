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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrontabResumeSuspendStrategy extends AbstractModel{

    /**
    * 定时拉起时间：如：周一8点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResumeTime")
    @Expose
    private String ResumeTime;

    /**
    * 定时挂起时间：如：周一20点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuspendTime")
    @Expose
    private String SuspendTime;

    /**
    * 挂起配置：0（默认）：等待任务结束后挂起、1：强制挂起
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuspendStrategy")
    @Expose
    private Long SuspendStrategy;

    /**
     * Get 定时拉起时间：如：周一8点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResumeTime 定时拉起时间：如：周一8点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResumeTime() {
        return this.ResumeTime;
    }

    /**
     * Set 定时拉起时间：如：周一8点
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResumeTime 定时拉起时间：如：周一8点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResumeTime(String ResumeTime) {
        this.ResumeTime = ResumeTime;
    }

    /**
     * Get 定时挂起时间：如：周一20点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuspendTime 定时挂起时间：如：周一20点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuspendTime() {
        return this.SuspendTime;
    }

    /**
     * Set 定时挂起时间：如：周一20点
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuspendTime 定时挂起时间：如：周一20点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuspendTime(String SuspendTime) {
        this.SuspendTime = SuspendTime;
    }

    /**
     * Get 挂起配置：0（默认）：等待任务结束后挂起、1：强制挂起
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuspendStrategy 挂起配置：0（默认）：等待任务结束后挂起、1：强制挂起
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuspendStrategy() {
        return this.SuspendStrategy;
    }

    /**
     * Set 挂起配置：0（默认）：等待任务结束后挂起、1：强制挂起
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuspendStrategy 挂起配置：0（默认）：等待任务结束后挂起、1：强制挂起
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuspendStrategy(Long SuspendStrategy) {
        this.SuspendStrategy = SuspendStrategy;
    }

    public CrontabResumeSuspendStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrontabResumeSuspendStrategy(CrontabResumeSuspendStrategy source) {
        if (source.ResumeTime != null) {
            this.ResumeTime = new String(source.ResumeTime);
        }
        if (source.SuspendTime != null) {
            this.SuspendTime = new String(source.SuspendTime);
        }
        if (source.SuspendStrategy != null) {
            this.SuspendStrategy = new Long(source.SuspendStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResumeTime", this.ResumeTime);
        this.setParamSimple(map, prefix + "SuspendTime", this.SuspendTime);
        this.setParamSimple(map, prefix + "SuspendStrategy", this.SuspendStrategy);

    }
}

