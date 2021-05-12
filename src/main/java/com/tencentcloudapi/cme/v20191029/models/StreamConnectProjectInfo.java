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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamConnectProjectInfo extends AbstractModel{

    /**
    * 转推项目状态，取值有：
<li>Working ：转推中；</li>
<li>Idle ：空闲中。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前转推输入源，取值有：
<li>Main ：主输入源；</li>
<li>Backup ：备输入源。</li>
    */
    @SerializedName("CurrentInputEndpoint")
    @Expose
    private String CurrentInputEndpoint;

    /**
    * 当前转推开始时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
    */
    @SerializedName("CurrentStartTime")
    @Expose
    private String CurrentStartTime;

    /**
    * 当前转推计划结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
    */
    @SerializedName("CurrentStopTime")
    @Expose
    private String CurrentStopTime;

    /**
    * 上一次转推结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Idle 时有效。
    */
    @SerializedName("LastStopTime")
    @Expose
    private String LastStopTime;

    /**
    * 云转推主输入源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainInput")
    @Expose
    private StreamInputInfo MainInput;

    /**
    * 云转推备输入源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupInput")
    @Expose
    private StreamInputInfo BackupInput;

    /**
    * 云转推输出源。
    */
    @SerializedName("OutputSet")
    @Expose
    private StreamConnectOutputInfo [] OutputSet;

    /**
     * Get 转推项目状态，取值有：
<li>Working ：转推中；</li>
<li>Idle ：空闲中。</li> 
     * @return Status 转推项目状态，取值有：
<li>Working ：转推中；</li>
<li>Idle ：空闲中。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 转推项目状态，取值有：
<li>Working ：转推中；</li>
<li>Idle ：空闲中。</li>
     * @param Status 转推项目状态，取值有：
<li>Working ：转推中；</li>
<li>Idle ：空闲中。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前转推输入源，取值有：
<li>Main ：主输入源；</li>
<li>Backup ：备输入源。</li> 
     * @return CurrentInputEndpoint 当前转推输入源，取值有：
<li>Main ：主输入源；</li>
<li>Backup ：备输入源。</li>
     */
    public String getCurrentInputEndpoint() {
        return this.CurrentInputEndpoint;
    }

    /**
     * Set 当前转推输入源，取值有：
<li>Main ：主输入源；</li>
<li>Backup ：备输入源。</li>
     * @param CurrentInputEndpoint 当前转推输入源，取值有：
<li>Main ：主输入源；</li>
<li>Backup ：备输入源。</li>
     */
    public void setCurrentInputEndpoint(String CurrentInputEndpoint) {
        this.CurrentInputEndpoint = CurrentInputEndpoint;
    }

    /**
     * Get 当前转推开始时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。 
     * @return CurrentStartTime 当前转推开始时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
     */
    public String getCurrentStartTime() {
        return this.CurrentStartTime;
    }

    /**
     * Set 当前转推开始时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
     * @param CurrentStartTime 当前转推开始时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
     */
    public void setCurrentStartTime(String CurrentStartTime) {
        this.CurrentStartTime = CurrentStartTime;
    }

    /**
     * Get 当前转推计划结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。 
     * @return CurrentStopTime 当前转推计划结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
     */
    public String getCurrentStopTime() {
        return this.CurrentStopTime;
    }

    /**
     * Set 当前转推计划结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
     * @param CurrentStopTime 当前转推计划结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Working 时有效。
     */
    public void setCurrentStopTime(String CurrentStopTime) {
        this.CurrentStopTime = CurrentStopTime;
    }

    /**
     * Get 上一次转推结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Idle 时有效。 
     * @return LastStopTime 上一次转推结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Idle 时有效。
     */
    public String getLastStopTime() {
        return this.LastStopTime;
    }

    /**
     * Set 上一次转推结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Idle 时有效。
     * @param LastStopTime 上一次转推结束时间， 采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。仅 Status 取值 Idle 时有效。
     */
    public void setLastStopTime(String LastStopTime) {
        this.LastStopTime = LastStopTime;
    }

    /**
     * Get 云转推主输入源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainInput 云转推主输入源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamInputInfo getMainInput() {
        return this.MainInput;
    }

    /**
     * Set 云转推主输入源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainInput 云转推主输入源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainInput(StreamInputInfo MainInput) {
        this.MainInput = MainInput;
    }

    /**
     * Get 云转推备输入源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupInput 云转推备输入源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamInputInfo getBackupInput() {
        return this.BackupInput;
    }

    /**
     * Set 云转推备输入源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupInput 云转推备输入源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupInput(StreamInputInfo BackupInput) {
        this.BackupInput = BackupInput;
    }

    /**
     * Get 云转推输出源。 
     * @return OutputSet 云转推输出源。
     */
    public StreamConnectOutputInfo [] getOutputSet() {
        return this.OutputSet;
    }

    /**
     * Set 云转推输出源。
     * @param OutputSet 云转推输出源。
     */
    public void setOutputSet(StreamConnectOutputInfo [] OutputSet) {
        this.OutputSet = OutputSet;
    }

    public StreamConnectProjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamConnectProjectInfo(StreamConnectProjectInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CurrentInputEndpoint != null) {
            this.CurrentInputEndpoint = new String(source.CurrentInputEndpoint);
        }
        if (source.CurrentStartTime != null) {
            this.CurrentStartTime = new String(source.CurrentStartTime);
        }
        if (source.CurrentStopTime != null) {
            this.CurrentStopTime = new String(source.CurrentStopTime);
        }
        if (source.LastStopTime != null) {
            this.LastStopTime = new String(source.LastStopTime);
        }
        if (source.MainInput != null) {
            this.MainInput = new StreamInputInfo(source.MainInput);
        }
        if (source.BackupInput != null) {
            this.BackupInput = new StreamInputInfo(source.BackupInput);
        }
        if (source.OutputSet != null) {
            this.OutputSet = new StreamConnectOutputInfo[source.OutputSet.length];
            for (int i = 0; i < source.OutputSet.length; i++) {
                this.OutputSet[i] = new StreamConnectOutputInfo(source.OutputSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CurrentInputEndpoint", this.CurrentInputEndpoint);
        this.setParamSimple(map, prefix + "CurrentStartTime", this.CurrentStartTime);
        this.setParamSimple(map, prefix + "CurrentStopTime", this.CurrentStopTime);
        this.setParamSimple(map, prefix + "LastStopTime", this.LastStopTime);
        this.setParamObj(map, prefix + "MainInput.", this.MainInput);
        this.setParamObj(map, prefix + "BackupInput.", this.BackupInput);
        this.setParamArrayObj(map, prefix + "OutputSet.", this.OutputSet);

    }
}

