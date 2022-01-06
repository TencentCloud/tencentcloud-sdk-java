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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSceneResponse extends AbstractModel{

    /**
    * 场景ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntId")
    @Expose
    private Long IntId;

    /**
    * 录制时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordDuration")
    @Expose
    private Long RecordDuration;

    /**
    * 场景名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 场景触发规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneTrigger")
    @Expose
    private String SceneTrigger;

    /**
    * 存储时长 (天)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoreDuration")
    @Expose
    private Long StoreDuration;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 场景ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntId 场景ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntId() {
        return this.IntId;
    }

    /**
     * Set 场景ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntId 场景ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntId(Long IntId) {
        this.IntId = IntId;
    }

    /**
     * Get 录制时长(秒)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordDuration 录制时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordDuration() {
        return this.RecordDuration;
    }

    /**
     * Set 录制时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordDuration 录制时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordDuration(Long RecordDuration) {
        this.RecordDuration = RecordDuration;
    }

    /**
     * Get 场景名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneName 场景名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneName 场景名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 场景触发规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneTrigger 场景触发规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSceneTrigger() {
        return this.SceneTrigger;
    }

    /**
     * Set 场景触发规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneTrigger 场景触发规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneTrigger(String SceneTrigger) {
        this.SceneTrigger = SceneTrigger;
    }

    /**
     * Get 存储时长 (天)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoreDuration 存储时长 (天)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoreDuration() {
        return this.StoreDuration;
    }

    /**
     * Set 存储时长 (天)
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoreDuration 存储时长 (天)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoreDuration(Long StoreDuration) {
        this.StoreDuration = StoreDuration;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSceneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSceneResponse(DescribeSceneResponse source) {
        if (source.IntId != null) {
            this.IntId = new Long(source.IntId);
        }
        if (source.RecordDuration != null) {
            this.RecordDuration = new Long(source.RecordDuration);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.SceneTrigger != null) {
            this.SceneTrigger = new String(source.SceneTrigger);
        }
        if (source.StoreDuration != null) {
            this.StoreDuration = new Long(source.StoreDuration);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntId", this.IntId);
        this.setParamSimple(map, prefix + "RecordDuration", this.RecordDuration);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "SceneTrigger", this.SceneTrigger);
        this.setParamSimple(map, prefix + "StoreDuration", this.StoreDuration);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

