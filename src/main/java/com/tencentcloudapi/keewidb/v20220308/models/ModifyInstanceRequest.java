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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel{

    /**
    * 修改实例操作。<ul><li>rename：表示实例重命名。</li><li>modifyProject：修改实例所属项目。</li><li>modifyAutoRenew：修改实例续费模式。</li></ul>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 实例 ID 数组。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例的新名称。
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 实例新的项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 包年包月计费的续费模式。<b>InstanceIds</b>数组和<b>AutoRenews</b>数组中的修改值对应。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
    */
    @SerializedName("AutoRenews")
    @Expose
    private Long [] AutoRenews;

    /**
     * Get 修改实例操作。<ul><li>rename：表示实例重命名。</li><li>modifyProject：修改实例所属项目。</li><li>modifyAutoRenew：修改实例续费模式。</li></ul> 
     * @return Operation 修改实例操作。<ul><li>rename：表示实例重命名。</li><li>modifyProject：修改实例所属项目。</li><li>modifyAutoRenew：修改实例续费模式。</li></ul>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 修改实例操作。<ul><li>rename：表示实例重命名。</li><li>modifyProject：修改实例所属项目。</li><li>modifyAutoRenew：修改实例续费模式。</li></ul>
     * @param Operation 修改实例操作。<ul><li>rename：表示实例重命名。</li><li>modifyProject：修改实例所属项目。</li><li>modifyAutoRenew：修改实例续费模式。</li></ul>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 实例 ID 数组。 
     * @return InstanceIds 实例 ID 数组。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 数组。
     * @param InstanceIds 实例 ID 数组。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例的新名称。 
     * @return InstanceNames 实例的新名称。
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 实例的新名称。
     * @param InstanceNames 实例的新名称。
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 实例新的项目 ID。 
     * @return ProjectId 实例新的项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例新的项目 ID。
     * @param ProjectId 实例新的项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 包年包月计费的续费模式。<b>InstanceIds</b>数组和<b>AutoRenews</b>数组中的修改值对应。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul> 
     * @return AutoRenews 包年包月计费的续费模式。<b>InstanceIds</b>数组和<b>AutoRenews</b>数组中的修改值对应。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
     */
    public Long [] getAutoRenews() {
        return this.AutoRenews;
    }

    /**
     * Set 包年包月计费的续费模式。<b>InstanceIds</b>数组和<b>AutoRenews</b>数组中的修改值对应。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
     * @param AutoRenews 包年包月计费的续费模式。<b>InstanceIds</b>数组和<b>AutoRenews</b>数组中的修改值对应。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
     */
    public void setAutoRenews(Long [] AutoRenews) {
        this.AutoRenews = AutoRenews;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoRenews != null) {
            this.AutoRenews = new Long[source.AutoRenews.length];
            for (int i = 0; i < source.AutoRenews.length; i++) {
                this.AutoRenews[i] = new Long(source.AutoRenews[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "AutoRenews.", this.AutoRenews);

    }
}

