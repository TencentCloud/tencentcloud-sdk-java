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

public class WebhookAssetScope extends AbstractModel {

    /**
    * <p>资产范围类型（对齐 NotifyAssetRange）<br>枚举值：<br>1：全部主机（可剔除）<br>2：自选主机<br>3：按标签选择</p>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>选中的主机 quuid 列表，仅 AssetRange=2 生效</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>排除的主机 quuid 列表，仅 AssetRange=1 生效</p>
    */
    @SerializedName("ExcludedInstanceIds")
    @Expose
    private String [] ExcludedInstanceIds;

    /**
    * <p>安全中心标签 ID 列表，仅 AssetRange=3 生效</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>腾讯云标签列表，仅 AssetRange=3 生效<br>入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private String [] CloudTags;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
     * Get <p>资产范围类型（对齐 NotifyAssetRange）<br>枚举值：<br>1：全部主机（可剔除）<br>2：自选主机<br>3：按标签选择</p> 
     * @return AssetRange <p>资产范围类型（对齐 NotifyAssetRange）<br>枚举值：<br>1：全部主机（可剔除）<br>2：自选主机<br>3：按标签选择</p>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>资产范围类型（对齐 NotifyAssetRange）<br>枚举值：<br>1：全部主机（可剔除）<br>2：自选主机<br>3：按标签选择</p>
     * @param AssetRange <p>资产范围类型（对齐 NotifyAssetRange）<br>枚举值：<br>1：全部主机（可剔除）<br>2：自选主机<br>3：按标签选择</p>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>选中的主机 quuid 列表，仅 AssetRange=2 生效</p> 
     * @return InstanceIds <p>选中的主机 quuid 列表，仅 AssetRange=2 生效</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>选中的主机 quuid 列表，仅 AssetRange=2 生效</p>
     * @param InstanceIds <p>选中的主机 quuid 列表，仅 AssetRange=2 生效</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>排除的主机 quuid 列表，仅 AssetRange=1 生效</p> 
     * @return ExcludedInstanceIds <p>排除的主机 quuid 列表，仅 AssetRange=1 生效</p>
     */
    public String [] getExcludedInstanceIds() {
        return this.ExcludedInstanceIds;
    }

    /**
     * Set <p>排除的主机 quuid 列表，仅 AssetRange=1 生效</p>
     * @param ExcludedInstanceIds <p>排除的主机 quuid 列表，仅 AssetRange=1 生效</p>
     */
    public void setExcludedInstanceIds(String [] ExcludedInstanceIds) {
        this.ExcludedInstanceIds = ExcludedInstanceIds;
    }

    /**
     * Get <p>安全中心标签 ID 列表，仅 AssetRange=3 生效</p> 
     * @return TagIds <p>安全中心标签 ID 列表，仅 AssetRange=3 生效</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>安全中心标签 ID 列表，仅 AssetRange=3 生效</p>
     * @param TagIds <p>安全中心标签 ID 列表，仅 AssetRange=3 生效</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>腾讯云标签列表，仅 AssetRange=3 生效<br>入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空</p> 
     * @return CloudTags <p>腾讯云标签列表，仅 AssetRange=3 生效<br>入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空</p>
     */
    public String [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>腾讯云标签列表，仅 AssetRange=3 生效<br>入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空</p>
     * @param CloudTags <p>腾讯云标签列表，仅 AssetRange=3 生效<br>入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空</p>
     */
    public void setCloudTags(String [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectIds <p>项目ID</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectIds <p>项目ID</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public WebhookAssetScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookAssetScope(WebhookAssetScope source) {
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ExcludedInstanceIds != null) {
            this.ExcludedInstanceIds = new String[source.ExcludedInstanceIds.length];
            for (int i = 0; i < source.ExcludedInstanceIds.length; i++) {
                this.ExcludedInstanceIds[i] = new String(source.ExcludedInstanceIds[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.CloudTags != null) {
            this.CloudTags = new String[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new String(source.CloudTags[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludedInstanceIds.", this.ExcludedInstanceIds);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

