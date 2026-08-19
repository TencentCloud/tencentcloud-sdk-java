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

public class ModifyAgentConfigSettingRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>日志采集类型列表，可选值：tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
    */
    @SerializedName("LogCollectSettings")
    @Expose
    private String [] LogCollectSettings;

    /**
    * <p>资产选择方式：all-全部付费资产，tag-按标签选择，direct-直接选择</p>
    */
    @SerializedName("AssetSelectionType")
    @Expose
    private String AssetSelectionType;

    /**
    * <p>按标签选择时的标签ID数组（AssetSelectionType=tag时使用）</p>
    */
    @SerializedName("TagIds")
    @Expose
    private String [] TagIds;

    /**
    * <p>直接选择的主机instance_id列表（AssetSelectionType=direct时使用）</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>排除的主机instance_id列表（AssetSelectionType=all时使用）</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>日志采集类型列表，可选值：tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p> 
     * @return LogCollectSettings <p>日志采集类型列表，可选值：tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
     */
    public String [] getLogCollectSettings() {
        return this.LogCollectSettings;
    }

    /**
     * Set <p>日志采集类型列表，可选值：tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
     * @param LogCollectSettings <p>日志采集类型列表，可选值：tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
     */
    public void setLogCollectSettings(String [] LogCollectSettings) {
        this.LogCollectSettings = LogCollectSettings;
    }

    /**
     * Get <p>资产选择方式：all-全部付费资产，tag-按标签选择，direct-直接选择</p> 
     * @return AssetSelectionType <p>资产选择方式：all-全部付费资产，tag-按标签选择，direct-直接选择</p>
     */
    public String getAssetSelectionType() {
        return this.AssetSelectionType;
    }

    /**
     * Set <p>资产选择方式：all-全部付费资产，tag-按标签选择，direct-直接选择</p>
     * @param AssetSelectionType <p>资产选择方式：all-全部付费资产，tag-按标签选择，direct-直接选择</p>
     */
    public void setAssetSelectionType(String AssetSelectionType) {
        this.AssetSelectionType = AssetSelectionType;
    }

    /**
     * Get <p>按标签选择时的标签ID数组（AssetSelectionType=tag时使用）</p> 
     * @return TagIds <p>按标签选择时的标签ID数组（AssetSelectionType=tag时使用）</p>
     */
    public String [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>按标签选择时的标签ID数组（AssetSelectionType=tag时使用）</p>
     * @param TagIds <p>按标签选择时的标签ID数组（AssetSelectionType=tag时使用）</p>
     */
    public void setTagIds(String [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>直接选择的主机instance_id列表（AssetSelectionType=direct时使用）</p> 
     * @return InstanceIDs <p>直接选择的主机instance_id列表（AssetSelectionType=direct时使用）</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>直接选择的主机instance_id列表（AssetSelectionType=direct时使用）</p>
     * @param InstanceIDs <p>直接选择的主机instance_id列表（AssetSelectionType=direct时使用）</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>排除的主机instance_id列表（AssetSelectionType=all时使用）</p> 
     * @return ExcludeInstanceIDs <p>排除的主机instance_id列表（AssetSelectionType=all时使用）</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>排除的主机instance_id列表（AssetSelectionType=all时使用）</p>
     * @param ExcludeInstanceIDs <p>排除的主机instance_id列表（AssetSelectionType=all时使用）</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
    }

    public ModifyAgentConfigSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentConfigSettingRequest(ModifyAgentConfigSettingRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.LogCollectSettings != null) {
            this.LogCollectSettings = new String[source.LogCollectSettings.length];
            for (int i = 0; i < source.LogCollectSettings.length; i++) {
                this.LogCollectSettings[i] = new String(source.LogCollectSettings[i]);
            }
        }
        if (source.AssetSelectionType != null) {
            this.AssetSelectionType = new String(source.AssetSelectionType);
        }
        if (source.TagIds != null) {
            this.TagIds = new String[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new String(source.TagIds[i]);
            }
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "LogCollectSettings.", this.LogCollectSettings);
        this.setParamSimple(map, prefix + "AssetSelectionType", this.AssetSelectionType);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);

    }
}

