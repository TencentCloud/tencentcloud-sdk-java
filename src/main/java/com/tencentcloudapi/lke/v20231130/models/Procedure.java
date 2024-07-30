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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Procedure extends AbstractModel {

    /**
    * 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 调试信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Debugging")
    @Expose
    private ProcedureDebugging Debugging;

    /**
    * 计费资源状态，1：可用，2：不可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 消耗 token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 调试信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Debugging 调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcedureDebugging getDebugging() {
        return this.Debugging;
    }

    /**
     * Set 调试信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Debugging 调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDebugging(ProcedureDebugging Debugging) {
        this.Debugging = Debugging;
    }

    /**
     * Get 计费资源状态，1：可用，2：不可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceStatus 计费资源状态，1：可用，2：不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 计费资源状态，1：可用，2：不可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceStatus 计费资源状态，1：可用，2：不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    public Procedure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Procedure(Procedure source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Debugging != null) {
            this.Debugging = new ProcedureDebugging(source.Debugging);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "Debugging.", this.Debugging);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}

