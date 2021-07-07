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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunVersionFlowItem extends AbstractModel{

    /**
    * 版本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 流量占比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * 流量参数键值对（URL参数/HEADERS参数）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlParam")
    @Expose
    private ObjectKV UrlParam;

    /**
    * 优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefaultPriority")
    @Expose
    private Boolean IsDefaultPriority;

    /**
     * Get 版本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 流量占比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowRatio 流量占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 流量占比
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowRatio 流量占比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowRatio(Long FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    /**
     * Get 流量参数键值对（URL参数/HEADERS参数）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlParam 流量参数键值对（URL参数/HEADERS参数）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectKV getUrlParam() {
        return this.UrlParam;
    }

    /**
     * Set 流量参数键值对（URL参数/HEADERS参数）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlParam 流量参数键值对（URL参数/HEADERS参数）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlParam(ObjectKV UrlParam) {
        this.UrlParam = UrlParam;
    }

    /**
     * Get 优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefaultPriority 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDefaultPriority() {
        return this.IsDefaultPriority;
    }

    /**
     * Set 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefaultPriority 是否是默认兜底版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefaultPriority(Boolean IsDefaultPriority) {
        this.IsDefaultPriority = IsDefaultPriority;
    }

    public CloudBaseRunVersionFlowItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunVersionFlowItem(CloudBaseRunVersionFlowItem source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.UrlParam != null) {
            this.UrlParam = new ObjectKV(source.UrlParam);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.IsDefaultPriority != null) {
            this.IsDefaultPriority = new Boolean(source.IsDefaultPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamObj(map, prefix + "UrlParam.", this.UrlParam);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "IsDefaultPriority", this.IsDefaultPriority);

    }
}

