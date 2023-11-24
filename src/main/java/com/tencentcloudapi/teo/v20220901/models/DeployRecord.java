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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecord extends AbstractModel {

    /**
    * 发布版本的详细信息。
    */
    @SerializedName("ConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] ConfigGroupVersionInfos;

    /**
    * 发布时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * 发布状态，取值有：
<li> deploying ：发布中；</li>
<li>failure ：发布失败；</li>
<li>success： 发布成功。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 发布结果信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 发布记录 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 变更说明。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 发布版本的详细信息。 
     * @return ConfigGroupVersionInfos 发布版本的详细信息。
     */
    public ConfigGroupVersionInfo [] getConfigGroupVersionInfos() {
        return this.ConfigGroupVersionInfos;
    }

    /**
     * Set 发布版本的详细信息。
     * @param ConfigGroupVersionInfos 发布版本的详细信息。
     */
    public void setConfigGroupVersionInfos(ConfigGroupVersionInfo [] ConfigGroupVersionInfos) {
        this.ConfigGroupVersionInfos = ConfigGroupVersionInfos;
    }

    /**
     * Get 发布时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return DeployTime 发布时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set 发布时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param DeployTime 发布时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get 发布状态，取值有：
<li> deploying ：发布中；</li>
<li>failure ：发布失败；</li>
<li>success： 发布成功。</li> 
     * @return Status 发布状态，取值有：
<li> deploying ：发布中；</li>
<li>failure ：发布失败；</li>
<li>success： 发布成功。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态，取值有：
<li> deploying ：发布中；</li>
<li>failure ：发布失败；</li>
<li>success： 发布成功。</li>
     * @param Status 发布状态，取值有：
<li> deploying ：发布中；</li>
<li>failure ：发布失败；</li>
<li>success： 发布成功。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 发布结果信息。 
     * @return Message 发布结果信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 发布结果信息。
     * @param Message 发布结果信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 发布记录 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 发布记录 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 发布记录 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 发布记录 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 变更说明。 
     * @return Description 变更说明。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 变更说明。
     * @param Description 变更说明。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DeployRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecord(DeployRecord source) {
        if (source.ConfigGroupVersionInfos != null) {
            this.ConfigGroupVersionInfos = new ConfigGroupVersionInfo[source.ConfigGroupVersionInfos.length];
            for (int i = 0; i < source.ConfigGroupVersionInfos.length; i++) {
                this.ConfigGroupVersionInfos[i] = new ConfigGroupVersionInfo(source.ConfigGroupVersionInfos[i]);
            }
        }
        if (source.DeployTime != null) {
            this.DeployTime = new String(source.DeployTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConfigGroupVersionInfos.", this.ConfigGroupVersionInfos);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

