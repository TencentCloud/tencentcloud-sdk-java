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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceServiceDeploymentRecord extends AbstractModel {

    /**
    * 部署记录 ID。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 部署操作类型，取值：
<li>create：创建；</li>
<li>update：更新；</li>
<li>resume：启用；</li>
<li>stop：停用。</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 部署状态，取值：
<li>processing：部署中；</li>
<li>succeeded：部署成功；</li>
<li>failed：部署失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 部署时长，单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 本次推理服务部署的配置。
    */
    @SerializedName("InferenceServiceConfig")
    @Expose
    private InferenceServiceConfig InferenceServiceConfig;

    /**
    * 部署发起时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 该部署配置是否是当前生效配置，取值：
<li> active：当前生效配置；</li>
<li> inactive：历史版本或异常版本配置。</li>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private String ActiveStatus;

    /**
     * Get 部署记录 ID。 
     * @return RecordId 部署记录 ID。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 部署记录 ID。
     * @param RecordId 部署记录 ID。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 部署操作类型，取值：
<li>create：创建；</li>
<li>update：更新；</li>
<li>resume：启用；</li>
<li>stop：停用。</li> 
     * @return Operation 部署操作类型，取值：
<li>create：创建；</li>
<li>update：更新；</li>
<li>resume：启用；</li>
<li>stop：停用。</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 部署操作类型，取值：
<li>create：创建；</li>
<li>update：更新；</li>
<li>resume：启用；</li>
<li>stop：停用。</li>
     * @param Operation 部署操作类型，取值：
<li>create：创建；</li>
<li>update：更新；</li>
<li>resume：启用；</li>
<li>stop：停用。</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 部署状态，取值：
<li>processing：部署中；</li>
<li>succeeded：部署成功；</li>
<li>failed：部署失败。</li> 
     * @return Status 部署状态，取值：
<li>processing：部署中；</li>
<li>succeeded：部署成功；</li>
<li>failed：部署失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 部署状态，取值：
<li>processing：部署中；</li>
<li>succeeded：部署成功；</li>
<li>failed：部署失败。</li>
     * @param Status 部署状态，取值：
<li>processing：部署中；</li>
<li>succeeded：部署成功；</li>
<li>failed：部署失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 部署时长，单位：秒。 
     * @return Duration 部署时长，单位：秒。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 部署时长，单位：秒。
     * @param Duration 部署时长，单位：秒。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 本次推理服务部署的配置。 
     * @return InferenceServiceConfig 本次推理服务部署的配置。
     */
    public InferenceServiceConfig getInferenceServiceConfig() {
        return this.InferenceServiceConfig;
    }

    /**
     * Set 本次推理服务部署的配置。
     * @param InferenceServiceConfig 本次推理服务部署的配置。
     */
    public void setInferenceServiceConfig(InferenceServiceConfig InferenceServiceConfig) {
        this.InferenceServiceConfig = InferenceServiceConfig;
    }

    /**
     * Get 部署发起时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 部署发起时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 部署发起时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 部署发起时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 该部署配置是否是当前生效配置，取值：
<li> active：当前生效配置；</li>
<li> inactive：历史版本或异常版本配置。</li> 
     * @return ActiveStatus 该部署配置是否是当前生效配置，取值：
<li> active：当前生效配置；</li>
<li> inactive：历史版本或异常版本配置。</li>
     */
    public String getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set 该部署配置是否是当前生效配置，取值：
<li> active：当前生效配置；</li>
<li> inactive：历史版本或异常版本配置。</li>
     * @param ActiveStatus 该部署配置是否是当前生效配置，取值：
<li> active：当前生效配置；</li>
<li> inactive：历史版本或异常版本配置。</li>
     */
    public void setActiveStatus(String ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    public InferenceServiceDeploymentRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceServiceDeploymentRecord(InferenceServiceDeploymentRecord source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.InferenceServiceConfig != null) {
            this.InferenceServiceConfig = new InferenceServiceConfig(source.InferenceServiceConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ActiveStatus != null) {
            this.ActiveStatus = new String(source.ActiveStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "InferenceServiceConfig.", this.InferenceServiceConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ActiveStatus", this.ActiveStatus);

    }
}

