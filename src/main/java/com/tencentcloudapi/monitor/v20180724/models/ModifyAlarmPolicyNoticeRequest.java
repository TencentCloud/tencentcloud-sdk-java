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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmPolicyNoticeRequest extends AbstractModel {

    /**
    * 模块名，这里填“monitor”。
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 告警策略 ID，如果该参数与PolicyIds参数同时存在，则以PolicyIds为准。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 告警通知模板 ID 列表。
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * 告警策略ID数组，支持给多个告警策略批量绑定通知模板。最多30个。
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
    * 告警分级通知规则配置
    */
    @SerializedName("HierarchicalNotices")
    @Expose
    private AlarmHierarchicalNotice [] HierarchicalNotices;

    /**
    * 通知内容模板绑定信息
    */
    @SerializedName("NoticeContentTmplBindInfos")
    @Expose
    private NoticeContentTmplBindInfo [] NoticeContentTmplBindInfos;

    /**
     * Get 模块名，这里填“monitor”。 
     * @return Module 模块名，这里填“monitor”。
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，这里填“monitor”。
     * @param Module 模块名，这里填“monitor”。
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 告警策略 ID，如果该参数与PolicyIds参数同时存在，则以PolicyIds为准。 
     * @return PolicyId 告警策略 ID，如果该参数与PolicyIds参数同时存在，则以PolicyIds为准。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略 ID，如果该参数与PolicyIds参数同时存在，则以PolicyIds为准。
     * @param PolicyId 告警策略 ID，如果该参数与PolicyIds参数同时存在，则以PolicyIds为准。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 告警通知模板 ID 列表。 
     * @return NoticeIds 告警通知模板 ID 列表。
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 告警通知模板 ID 列表。
     * @param NoticeIds 告警通知模板 ID 列表。
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get 告警策略ID数组，支持给多个告警策略批量绑定通知模板。最多30个。 
     * @return PolicyIds 告警策略ID数组，支持给多个告警策略批量绑定通知模板。最多30个。
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 告警策略ID数组，支持给多个告警策略批量绑定通知模板。最多30个。
     * @param PolicyIds 告警策略ID数组，支持给多个告警策略批量绑定通知模板。最多30个。
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 告警分级通知规则配置 
     * @return HierarchicalNotices 告警分级通知规则配置
     */
    public AlarmHierarchicalNotice [] getHierarchicalNotices() {
        return this.HierarchicalNotices;
    }

    /**
     * Set 告警分级通知规则配置
     * @param HierarchicalNotices 告警分级通知规则配置
     */
    public void setHierarchicalNotices(AlarmHierarchicalNotice [] HierarchicalNotices) {
        this.HierarchicalNotices = HierarchicalNotices;
    }

    /**
     * Get 通知内容模板绑定信息 
     * @return NoticeContentTmplBindInfos 通知内容模板绑定信息
     */
    public NoticeContentTmplBindInfo [] getNoticeContentTmplBindInfos() {
        return this.NoticeContentTmplBindInfos;
    }

    /**
     * Set 通知内容模板绑定信息
     * @param NoticeContentTmplBindInfos 通知内容模板绑定信息
     */
    public void setNoticeContentTmplBindInfos(NoticeContentTmplBindInfo [] NoticeContentTmplBindInfos) {
        this.NoticeContentTmplBindInfos = NoticeContentTmplBindInfos;
    }

    public ModifyAlarmPolicyNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmPolicyNoticeRequest(ModifyAlarmPolicyNoticeRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
        if (source.HierarchicalNotices != null) {
            this.HierarchicalNotices = new AlarmHierarchicalNotice[source.HierarchicalNotices.length];
            for (int i = 0; i < source.HierarchicalNotices.length; i++) {
                this.HierarchicalNotices[i] = new AlarmHierarchicalNotice(source.HierarchicalNotices[i]);
            }
        }
        if (source.NoticeContentTmplBindInfos != null) {
            this.NoticeContentTmplBindInfos = new NoticeContentTmplBindInfo[source.NoticeContentTmplBindInfos.length];
            for (int i = 0; i < source.NoticeContentTmplBindInfos.length; i++) {
                this.NoticeContentTmplBindInfos[i] = new NoticeContentTmplBindInfo(source.NoticeContentTmplBindInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArrayObj(map, prefix + "HierarchicalNotices.", this.HierarchicalNotices);
        this.setParamArrayObj(map, prefix + "NoticeContentTmplBindInfos.", this.NoticeContentTmplBindInfos);

    }
}

