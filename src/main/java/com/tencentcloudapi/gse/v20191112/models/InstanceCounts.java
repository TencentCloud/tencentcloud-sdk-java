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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceCounts extends AbstractModel{

    /**
    * 活跃的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Active")
    @Expose
    private Long Active;

    /**
    * 期望的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desired")
    @Expose
    private Long Desired;

    /**
    * 空闲的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Idle")
    @Expose
    private Long Idle;

    /**
    * 服务器实例数最大限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxiNum")
    @Expose
    private Long MaxiNum;

    /**
    * 服务器实例数最小限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniNum")
    @Expose
    private Long MiniNum;

    /**
    * 已开始创建，但未激活的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pending")
    @Expose
    private Long Pending;

    /**
    * 结束中的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Terminating")
    @Expose
    private Long Terminating;

    /**
     * Get 活跃的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Active 活跃的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActive() {
        return this.Active;
    }

    /**
     * Set 活跃的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Active 活跃的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActive(Long Active) {
        this.Active = Active;
    }

    /**
     * Get 期望的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desired 期望的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDesired() {
        return this.Desired;
    }

    /**
     * Set 期望的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desired 期望的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesired(Long Desired) {
        this.Desired = Desired;
    }

    /**
     * Get 空闲的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Idle 空闲的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdle() {
        return this.Idle;
    }

    /**
     * Set 空闲的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Idle 空闲的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdle(Long Idle) {
        this.Idle = Idle;
    }

    /**
     * Get 服务器实例数最大限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxiNum 服务器实例数最大限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxiNum() {
        return this.MaxiNum;
    }

    /**
     * Set 服务器实例数最大限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxiNum 服务器实例数最大限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxiNum(Long MaxiNum) {
        this.MaxiNum = MaxiNum;
    }

    /**
     * Get 服务器实例数最小限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniNum 服务器实例数最小限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMiniNum() {
        return this.MiniNum;
    }

    /**
     * Set 服务器实例数最小限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniNum 服务器实例数最小限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniNum(Long MiniNum) {
        this.MiniNum = MiniNum;
    }

    /**
     * Get 已开始创建，但未激活的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pending 已开始创建，但未激活的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPending() {
        return this.Pending;
    }

    /**
     * Set 已开始创建，但未激活的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pending 已开始创建，但未激活的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPending(Long Pending) {
        this.Pending = Pending;
    }

    /**
     * Get 结束中的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Terminating 结束中的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTerminating() {
        return this.Terminating;
    }

    /**
     * Set 结束中的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Terminating 结束中的服务器实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerminating(Long Terminating) {
        this.Terminating = Terminating;
    }

    public InstanceCounts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceCounts(InstanceCounts source) {
        if (source.Active != null) {
            this.Active = new Long(source.Active);
        }
        if (source.Desired != null) {
            this.Desired = new Long(source.Desired);
        }
        if (source.Idle != null) {
            this.Idle = new Long(source.Idle);
        }
        if (source.MaxiNum != null) {
            this.MaxiNum = new Long(source.MaxiNum);
        }
        if (source.MiniNum != null) {
            this.MiniNum = new Long(source.MiniNum);
        }
        if (source.Pending != null) {
            this.Pending = new Long(source.Pending);
        }
        if (source.Terminating != null) {
            this.Terminating = new Long(source.Terminating);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "Desired", this.Desired);
        this.setParamSimple(map, prefix + "Idle", this.Idle);
        this.setParamSimple(map, prefix + "MaxiNum", this.MaxiNum);
        this.setParamSimple(map, prefix + "MiniNum", this.MiniNum);
        this.setParamSimple(map, prefix + "Pending", this.Pending);
        this.setParamSimple(map, prefix + "Terminating", this.Terminating);

    }
}

