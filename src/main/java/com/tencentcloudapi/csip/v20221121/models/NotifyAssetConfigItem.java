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

public class NotifyAssetConfigItem extends AbstractModel {

    /**
    * <p>模块名</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>子模块</p>
    */
    @SerializedName("SubModule")
    @Expose
    private String SubModule;

    /**
    * <p>资产范围</p><p>枚举值：</p><ul><li>0： 无含义</li><li>1： 全部</li><li>2： 自选</li><li>3： 按标签</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>选中的实例ID</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>剔除的实例ID</p>
    */
    @SerializedName("ExcludedInstanceIds")
    @Expose
    private String [] ExcludedInstanceIds;

    /**
    * <p>标签ID</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>云标签</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private String [] CloudTags;

    /**
    * <p>总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get <p>模块名</p> 
     * @return Module <p>模块名</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块名</p>
     * @param Module <p>模块名</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>子模块</p> 
     * @return SubModule <p>子模块</p>
     */
    public String getSubModule() {
        return this.SubModule;
    }

    /**
     * Set <p>子模块</p>
     * @param SubModule <p>子模块</p>
     */
    public void setSubModule(String SubModule) {
        this.SubModule = SubModule;
    }

    /**
     * Get <p>资产范围</p><p>枚举值：</p><ul><li>0： 无含义</li><li>1： 全部</li><li>2： 自选</li><li>3： 按标签</li></ul> 
     * @return AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 无含义</li><li>1： 全部</li><li>2： 自选</li><li>3： 按标签</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>资产范围</p><p>枚举值：</p><ul><li>0： 无含义</li><li>1： 全部</li><li>2： 自选</li><li>3： 按标签</li></ul>
     * @param AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>0： 无含义</li><li>1： 全部</li><li>2： 自选</li><li>3： 按标签</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>选中的实例ID</p> 
     * @return InstanceIds <p>选中的实例ID</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>选中的实例ID</p>
     * @param InstanceIds <p>选中的实例ID</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>剔除的实例ID</p> 
     * @return ExcludedInstanceIds <p>剔除的实例ID</p>
     */
    public String [] getExcludedInstanceIds() {
        return this.ExcludedInstanceIds;
    }

    /**
     * Set <p>剔除的实例ID</p>
     * @param ExcludedInstanceIds <p>剔除的实例ID</p>
     */
    public void setExcludedInstanceIds(String [] ExcludedInstanceIds) {
        this.ExcludedInstanceIds = ExcludedInstanceIds;
    }

    /**
     * Get <p>标签ID</p> 
     * @return TagIds <p>标签ID</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>标签ID</p>
     * @param TagIds <p>标签ID</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>云标签</p> 
     * @return CloudTags <p>云标签</p>
     */
    public String [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>云标签</p>
     * @param CloudTags <p>云标签</p>
     */
    public void setCloudTags(String [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>总数</p> 
     * @return TotalCount <p>总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数</p>
     * @param TotalCount <p>总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public NotifyAssetConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotifyAssetConfigItem(NotifyAssetConfigItem source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.SubModule != null) {
            this.SubModule = new String(source.SubModule);
        }
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
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "SubModule", this.SubModule);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludedInstanceIds.", this.ExcludedInstanceIds);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

