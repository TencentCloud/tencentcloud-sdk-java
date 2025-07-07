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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRiskCenterScanTaskRequest extends AbstractModel {

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 0-全扫，1-指定资产扫，2-排除资产扫，3-手动填写扫；1和2则Assets字段必填，3则SelfDefiningAssets必填
    */
    @SerializedName("ScanAssetType")
    @Expose
    private Long ScanAssetType;

    /**
    * 扫描项目；port/poc/weakpass/webcontent/configrisk/exposedserver
    */
    @SerializedName("ScanItem")
    @Expose
    private String [] ScanItem;

    /**
    * 0-周期任务,1-立即扫描,2-定时扫描,3-自定义；0,2,3则ScanPlanContent必填
    */
    @SerializedName("ScanPlanType")
    @Expose
    private Long ScanPlanType;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 扫描资产信息列表
    */
    @SerializedName("Assets")
    @Expose
    private TaskAssetObject [] Assets;

    /**
    * 扫描计划详情
    */
    @SerializedName("ScanPlanContent")
    @Expose
    private String ScanPlanContent;

    /**
    * ip/域名/url数组
    */
    @SerializedName("SelfDefiningAssets")
    @Expose
    private String [] SelfDefiningAssets;

    /**
    * 请求发起源，vss表示漏洞扫描服务，云安全中心的用户请填充csip，默认csip
    */
    @SerializedName("ScanFrom")
    @Expose
    private String ScanFrom;

    /**
    * 高级配置
    */
    @SerializedName("TaskAdvanceCFG")
    @Expose
    private TaskAdvanceCFG TaskAdvanceCFG;

    /**
    * 体检模式，0-标准模式，1-快速模式，2-高级模式，默认标准模式
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * 资产标签
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag Tags;

    /**
    * 任务完成回调webhook地址
    */
    @SerializedName("FinishWebHook")
    @Expose
    private String FinishWebHook;

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 0-全扫，1-指定资产扫，2-排除资产扫，3-手动填写扫；1和2则Assets字段必填，3则SelfDefiningAssets必填 
     * @return ScanAssetType 0-全扫，1-指定资产扫，2-排除资产扫，3-手动填写扫；1和2则Assets字段必填，3则SelfDefiningAssets必填
     */
    public Long getScanAssetType() {
        return this.ScanAssetType;
    }

    /**
     * Set 0-全扫，1-指定资产扫，2-排除资产扫，3-手动填写扫；1和2则Assets字段必填，3则SelfDefiningAssets必填
     * @param ScanAssetType 0-全扫，1-指定资产扫，2-排除资产扫，3-手动填写扫；1和2则Assets字段必填，3则SelfDefiningAssets必填
     */
    public void setScanAssetType(Long ScanAssetType) {
        this.ScanAssetType = ScanAssetType;
    }

    /**
     * Get 扫描项目；port/poc/weakpass/webcontent/configrisk/exposedserver 
     * @return ScanItem 扫描项目；port/poc/weakpass/webcontent/configrisk/exposedserver
     */
    public String [] getScanItem() {
        return this.ScanItem;
    }

    /**
     * Set 扫描项目；port/poc/weakpass/webcontent/configrisk/exposedserver
     * @param ScanItem 扫描项目；port/poc/weakpass/webcontent/configrisk/exposedserver
     */
    public void setScanItem(String [] ScanItem) {
        this.ScanItem = ScanItem;
    }

    /**
     * Get 0-周期任务,1-立即扫描,2-定时扫描,3-自定义；0,2,3则ScanPlanContent必填 
     * @return ScanPlanType 0-周期任务,1-立即扫描,2-定时扫描,3-自定义；0,2,3则ScanPlanContent必填
     */
    public Long getScanPlanType() {
        return this.ScanPlanType;
    }

    /**
     * Set 0-周期任务,1-立即扫描,2-定时扫描,3-自定义；0,2,3则ScanPlanContent必填
     * @param ScanPlanType 0-周期任务,1-立即扫描,2-定时扫描,3-自定义；0,2,3则ScanPlanContent必填
     */
    public void setScanPlanType(Long ScanPlanType) {
        this.ScanPlanType = ScanPlanType;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 扫描资产信息列表 
     * @return Assets 扫描资产信息列表
     */
    public TaskAssetObject [] getAssets() {
        return this.Assets;
    }

    /**
     * Set 扫描资产信息列表
     * @param Assets 扫描资产信息列表
     */
    public void setAssets(TaskAssetObject [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get 扫描计划详情 
     * @return ScanPlanContent 扫描计划详情
     */
    public String getScanPlanContent() {
        return this.ScanPlanContent;
    }

    /**
     * Set 扫描计划详情
     * @param ScanPlanContent 扫描计划详情
     */
    public void setScanPlanContent(String ScanPlanContent) {
        this.ScanPlanContent = ScanPlanContent;
    }

    /**
     * Get ip/域名/url数组 
     * @return SelfDefiningAssets ip/域名/url数组
     */
    public String [] getSelfDefiningAssets() {
        return this.SelfDefiningAssets;
    }

    /**
     * Set ip/域名/url数组
     * @param SelfDefiningAssets ip/域名/url数组
     */
    public void setSelfDefiningAssets(String [] SelfDefiningAssets) {
        this.SelfDefiningAssets = SelfDefiningAssets;
    }

    /**
     * Get 请求发起源，vss表示漏洞扫描服务，云安全中心的用户请填充csip，默认csip 
     * @return ScanFrom 请求发起源，vss表示漏洞扫描服务，云安全中心的用户请填充csip，默认csip
     */
    public String getScanFrom() {
        return this.ScanFrom;
    }

    /**
     * Set 请求发起源，vss表示漏洞扫描服务，云安全中心的用户请填充csip，默认csip
     * @param ScanFrom 请求发起源，vss表示漏洞扫描服务，云安全中心的用户请填充csip，默认csip
     */
    public void setScanFrom(String ScanFrom) {
        this.ScanFrom = ScanFrom;
    }

    /**
     * Get 高级配置 
     * @return TaskAdvanceCFG 高级配置
     */
    public TaskAdvanceCFG getTaskAdvanceCFG() {
        return this.TaskAdvanceCFG;
    }

    /**
     * Set 高级配置
     * @param TaskAdvanceCFG 高级配置
     */
    public void setTaskAdvanceCFG(TaskAdvanceCFG TaskAdvanceCFG) {
        this.TaskAdvanceCFG = TaskAdvanceCFG;
    }

    /**
     * Get 体检模式，0-标准模式，1-快速模式，2-高级模式，默认标准模式 
     * @return TaskMode 体检模式，0-标准模式，1-快速模式，2-高级模式，默认标准模式
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set 体检模式，0-标准模式，1-快速模式，2-高级模式，默认标准模式
     * @param TaskMode 体检模式，0-标准模式，1-快速模式，2-高级模式，默认标准模式
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get 资产标签 
     * @return Tags 资产标签
     */
    public AssetTag getTags() {
        return this.Tags;
    }

    /**
     * Set 资产标签
     * @param Tags 资产标签
     */
    public void setTags(AssetTag Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 任务完成回调webhook地址 
     * @return FinishWebHook 任务完成回调webhook地址
     */
    public String getFinishWebHook() {
        return this.FinishWebHook;
    }

    /**
     * Set 任务完成回调webhook地址
     * @param FinishWebHook 任务完成回调webhook地址
     */
    public void setFinishWebHook(String FinishWebHook) {
        this.FinishWebHook = FinishWebHook;
    }

    public CreateRiskCenterScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRiskCenterScanTaskRequest(CreateRiskCenterScanTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ScanAssetType != null) {
            this.ScanAssetType = new Long(source.ScanAssetType);
        }
        if (source.ScanItem != null) {
            this.ScanItem = new String[source.ScanItem.length];
            for (int i = 0; i < source.ScanItem.length; i++) {
                this.ScanItem[i] = new String(source.ScanItem[i]);
            }
        }
        if (source.ScanPlanType != null) {
            this.ScanPlanType = new Long(source.ScanPlanType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Assets != null) {
            this.Assets = new TaskAssetObject[source.Assets.length];
            for (int i = 0; i < source.Assets.length; i++) {
                this.Assets[i] = new TaskAssetObject(source.Assets[i]);
            }
        }
        if (source.ScanPlanContent != null) {
            this.ScanPlanContent = new String(source.ScanPlanContent);
        }
        if (source.SelfDefiningAssets != null) {
            this.SelfDefiningAssets = new String[source.SelfDefiningAssets.length];
            for (int i = 0; i < source.SelfDefiningAssets.length; i++) {
                this.SelfDefiningAssets[i] = new String(source.SelfDefiningAssets[i]);
            }
        }
        if (source.ScanFrom != null) {
            this.ScanFrom = new String(source.ScanFrom);
        }
        if (source.TaskAdvanceCFG != null) {
            this.TaskAdvanceCFG = new TaskAdvanceCFG(source.TaskAdvanceCFG);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag(source.Tags);
        }
        if (source.FinishWebHook != null) {
            this.FinishWebHook = new String(source.FinishWebHook);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ScanAssetType", this.ScanAssetType);
        this.setParamArraySimple(map, prefix + "ScanItem.", this.ScanItem);
        this.setParamSimple(map, prefix + "ScanPlanType", this.ScanPlanType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Assets.", this.Assets);
        this.setParamSimple(map, prefix + "ScanPlanContent", this.ScanPlanContent);
        this.setParamArraySimple(map, prefix + "SelfDefiningAssets.", this.SelfDefiningAssets);
        this.setParamSimple(map, prefix + "ScanFrom", this.ScanFrom);
        this.setParamObj(map, prefix + "TaskAdvanceCFG.", this.TaskAdvanceCFG);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "FinishWebHook", this.FinishWebHook);

    }
}

