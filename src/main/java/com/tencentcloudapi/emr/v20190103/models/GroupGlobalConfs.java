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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupGlobalConfs extends AbstractModel {

    /**
    * 伸缩组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupGlobalConf")
    @Expose
    private AutoScaleResourceConf GroupGlobalConf;

    /**
    * 当前伸缩组扩容出来的节点数量。
    */
    @SerializedName("CurrentNodes")
    @Expose
    private Long CurrentNodes;

    /**
    * 当前伸缩组扩容出来的后付费节点数量。
    */
    @SerializedName("CurrentPostPaidNodes")
    @Expose
    private Long CurrentPostPaidNodes;

    /**
    * 当前伸缩组扩容出来的竞价实例节点数量。
    */
    @SerializedName("CurrentSpotPaidNodes")
    @Expose
    private Long CurrentSpotPaidNodes;

    /**
     * Get 伸缩组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupGlobalConf 伸缩组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoScaleResourceConf getGroupGlobalConf() {
        return this.GroupGlobalConf;
    }

    /**
     * Set 伸缩组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupGlobalConf 伸缩组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupGlobalConf(AutoScaleResourceConf GroupGlobalConf) {
        this.GroupGlobalConf = GroupGlobalConf;
    }

    /**
     * Get 当前伸缩组扩容出来的节点数量。 
     * @return CurrentNodes 当前伸缩组扩容出来的节点数量。
     */
    public Long getCurrentNodes() {
        return this.CurrentNodes;
    }

    /**
     * Set 当前伸缩组扩容出来的节点数量。
     * @param CurrentNodes 当前伸缩组扩容出来的节点数量。
     */
    public void setCurrentNodes(Long CurrentNodes) {
        this.CurrentNodes = CurrentNodes;
    }

    /**
     * Get 当前伸缩组扩容出来的后付费节点数量。 
     * @return CurrentPostPaidNodes 当前伸缩组扩容出来的后付费节点数量。
     */
    public Long getCurrentPostPaidNodes() {
        return this.CurrentPostPaidNodes;
    }

    /**
     * Set 当前伸缩组扩容出来的后付费节点数量。
     * @param CurrentPostPaidNodes 当前伸缩组扩容出来的后付费节点数量。
     */
    public void setCurrentPostPaidNodes(Long CurrentPostPaidNodes) {
        this.CurrentPostPaidNodes = CurrentPostPaidNodes;
    }

    /**
     * Get 当前伸缩组扩容出来的竞价实例节点数量。 
     * @return CurrentSpotPaidNodes 当前伸缩组扩容出来的竞价实例节点数量。
     */
    public Long getCurrentSpotPaidNodes() {
        return this.CurrentSpotPaidNodes;
    }

    /**
     * Set 当前伸缩组扩容出来的竞价实例节点数量。
     * @param CurrentSpotPaidNodes 当前伸缩组扩容出来的竞价实例节点数量。
     */
    public void setCurrentSpotPaidNodes(Long CurrentSpotPaidNodes) {
        this.CurrentSpotPaidNodes = CurrentSpotPaidNodes;
    }

    public GroupGlobalConfs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupGlobalConfs(GroupGlobalConfs source) {
        if (source.GroupGlobalConf != null) {
            this.GroupGlobalConf = new AutoScaleResourceConf(source.GroupGlobalConf);
        }
        if (source.CurrentNodes != null) {
            this.CurrentNodes = new Long(source.CurrentNodes);
        }
        if (source.CurrentPostPaidNodes != null) {
            this.CurrentPostPaidNodes = new Long(source.CurrentPostPaidNodes);
        }
        if (source.CurrentSpotPaidNodes != null) {
            this.CurrentSpotPaidNodes = new Long(source.CurrentSpotPaidNodes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "GroupGlobalConf.", this.GroupGlobalConf);
        this.setParamSimple(map, prefix + "CurrentNodes", this.CurrentNodes);
        this.setParamSimple(map, prefix + "CurrentPostPaidNodes", this.CurrentPostPaidNodes);
        this.setParamSimple(map, prefix + "CurrentSpotPaidNodes", this.CurrentSpotPaidNodes);

    }
}

