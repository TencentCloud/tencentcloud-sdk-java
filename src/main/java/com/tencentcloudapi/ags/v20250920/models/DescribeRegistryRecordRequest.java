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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegistryRecordRequest extends AbstractModel {

    /**
    * <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Record ID。</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>Version ID，与 Label 互斥。指定时返回该 Version；均省略时等价于 Label=stable。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Label 名称，与 VersionId 互斥。指定时返回 Label 当前指向的 Version；均省略时等价于 stable。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p> 
     * @return RegistryId <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
     * @param RegistryId <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Record ID。</p> 
     * @return RecordId <p>Record ID。</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Record ID。</p>
     * @param RecordId <p>Record ID。</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>Version ID，与 Label 互斥。指定时返回该 Version；均省略时等价于 Label=stable。</p> 
     * @return VersionId <p>Version ID，与 Label 互斥。指定时返回该 Version；均省略时等价于 Label=stable。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>Version ID，与 Label 互斥。指定时返回该 Version；均省略时等价于 Label=stable。</p>
     * @param VersionId <p>Version ID，与 Label 互斥。指定时返回该 Version；均省略时等价于 Label=stable。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>Label 名称，与 VersionId 互斥。指定时返回 Label 当前指向的 Version；均省略时等价于 stable。</p> 
     * @return Label <p>Label 名称，与 VersionId 互斥。指定时返回 Label 当前指向的 Version；均省略时等价于 stable。</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Label 名称，与 VersionId 互斥。指定时返回 Label 当前指向的 Version；均省略时等价于 stable。</p>
     * @param Label <p>Label 名称，与 VersionId 互斥。指定时返回 Label 当前指向的 Version；均省略时等价于 stable。</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public DescribeRegistryRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistryRecordRequest(DescribeRegistryRecordRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

