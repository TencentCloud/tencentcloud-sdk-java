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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncResourceVO extends AbstractModel {

    /**
    * 处理Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * 资源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 自定义信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ParamInfo [] ExtraInfo;

    /**
     * Get 处理Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId 处理Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 处理Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId 处理Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 资源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 自定义信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 自定义信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 自定义信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 自定义信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(ParamInfo [] ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    public AsyncResourceVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncResourceVO(AsyncResourceVO source) {
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ParamInfo[source.ExtraInfo.length];
            for (int i = 0; i < source.ExtraInfo.length; i++) {
                this.ExtraInfo[i] = new ParamInfo(source.ExtraInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamArrayObj(map, prefix + "ExtraInfo.", this.ExtraInfo);

    }
}

