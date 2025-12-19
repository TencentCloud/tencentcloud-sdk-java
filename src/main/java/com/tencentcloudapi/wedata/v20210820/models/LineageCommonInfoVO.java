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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageCommonInfoVO extends AbstractModel {

    /**
    * 当前节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentResource")
    @Expose
    private LineageResouce CurrentResource;

    /**
    * 上游节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentSet")
    @Expose
    private LineageNodeInfoVO [] ParentSet;

    /**
    * 下游节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildSet")
    @Expose
    private LineageNodeInfoVO [] ChildSet;

    /**
    * 下游数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * 上游数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

    /**
    * 父/子节点是否展示上下游数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamCountFlag")
    @Expose
    private Boolean StreamCountFlag;

    /**
     * Get 当前节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentResource 当前节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageResouce getCurrentResource() {
        return this.CurrentResource;
    }

    /**
     * Set 当前节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentResource 当前节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentResource(LineageResouce CurrentResource) {
        this.CurrentResource = CurrentResource;
    }

    /**
     * Get 上游节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentSet 上游节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageNodeInfoVO [] getParentSet() {
        return this.ParentSet;
    }

    /**
     * Set 上游节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentSet 上游节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentSet(LineageNodeInfoVO [] ParentSet) {
        this.ParentSet = ParentSet;
    }

    /**
     * Get 下游节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildSet 下游节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageNodeInfoVO [] getChildSet() {
        return this.ChildSet;
    }

    /**
     * Set 下游节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildSet 下游节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildSet(LineageNodeInfoVO [] ChildSet) {
        this.ChildSet = ChildSet;
    }

    /**
     * Get 下游数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownStreamCount 下游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set 下游数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownStreamCount 下游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get 上游数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpStreamCount 上游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set 上游数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpStreamCount 上游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
    }

    /**
     * Get 父/子节点是否展示上下游数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamCountFlag 父/子节点是否展示上下游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStreamCountFlag() {
        return this.StreamCountFlag;
    }

    /**
     * Set 父/子节点是否展示上下游数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamCountFlag 父/子节点是否展示上下游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamCountFlag(Boolean StreamCountFlag) {
        this.StreamCountFlag = StreamCountFlag;
    }

    public LineageCommonInfoVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageCommonInfoVO(LineageCommonInfoVO source) {
        if (source.CurrentResource != null) {
            this.CurrentResource = new LineageResouce(source.CurrentResource);
        }
        if (source.ParentSet != null) {
            this.ParentSet = new LineageNodeInfoVO[source.ParentSet.length];
            for (int i = 0; i < source.ParentSet.length; i++) {
                this.ParentSet[i] = new LineageNodeInfoVO(source.ParentSet[i]);
            }
        }
        if (source.ChildSet != null) {
            this.ChildSet = new LineageNodeInfoVO[source.ChildSet.length];
            for (int i = 0; i < source.ChildSet.length; i++) {
                this.ChildSet[i] = new LineageNodeInfoVO(source.ChildSet[i]);
            }
        }
        if (source.DownStreamCount != null) {
            this.DownStreamCount = new Long(source.DownStreamCount);
        }
        if (source.UpStreamCount != null) {
            this.UpStreamCount = new Long(source.UpStreamCount);
        }
        if (source.StreamCountFlag != null) {
            this.StreamCountFlag = new Boolean(source.StreamCountFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CurrentResource.", this.CurrentResource);
        this.setParamArrayObj(map, prefix + "ParentSet.", this.ParentSet);
        this.setParamArrayObj(map, prefix + "ChildSet.", this.ChildSet);
        this.setParamSimple(map, prefix + "DownStreamCount", this.DownStreamCount);
        this.setParamSimple(map, prefix + "UpStreamCount", this.UpStreamCount);
        this.setParamSimple(map, prefix + "StreamCountFlag", this.StreamCountFlag);

    }
}

