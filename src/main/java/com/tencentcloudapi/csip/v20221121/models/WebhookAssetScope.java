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
    * 资产范围类型（对齐 NotifyAssetRange）
枚举值：
1：全部主机（可剔除）
2：自选主机
3：按标签选择
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * 选中的主机 quuid 列表，仅 AssetRange=2 生效
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 排除的主机 quuid 列表，仅 AssetRange=1 生效
    */
    @SerializedName("ExcludedInstanceIds")
    @Expose
    private String [] ExcludedInstanceIds;

    /**
    * 安全中心标签 ID 列表，仅 AssetRange=3 生效
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * 腾讯云标签列表，仅 AssetRange=3 生效
入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空
    */
    @SerializedName("CloudTags")
    @Expose
    private String [] CloudTags;

    /**
     * Get 资产范围类型（对齐 NotifyAssetRange）
枚举值：
1：全部主机（可剔除）
2：自选主机
3：按标签选择 
     * @return AssetRange 资产范围类型（对齐 NotifyAssetRange）
枚举值：
1：全部主机（可剔除）
2：自选主机
3：按标签选择
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set 资产范围类型（对齐 NotifyAssetRange）
枚举值：
1：全部主机（可剔除）
2：自选主机
3：按标签选择
     * @param AssetRange 资产范围类型（对齐 NotifyAssetRange）
枚举值：
1：全部主机（可剔除）
2：自选主机
3：按标签选择
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get 选中的主机 quuid 列表，仅 AssetRange=2 生效 
     * @return InstanceIds 选中的主机 quuid 列表，仅 AssetRange=2 生效
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 选中的主机 quuid 列表，仅 AssetRange=2 生效
     * @param InstanceIds 选中的主机 quuid 列表，仅 AssetRange=2 生效
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 排除的主机 quuid 列表，仅 AssetRange=1 生效 
     * @return ExcludedInstanceIds 排除的主机 quuid 列表，仅 AssetRange=1 生效
     */
    public String [] getExcludedInstanceIds() {
        return this.ExcludedInstanceIds;
    }

    /**
     * Set 排除的主机 quuid 列表，仅 AssetRange=1 生效
     * @param ExcludedInstanceIds 排除的主机 quuid 列表，仅 AssetRange=1 生效
     */
    public void setExcludedInstanceIds(String [] ExcludedInstanceIds) {
        this.ExcludedInstanceIds = ExcludedInstanceIds;
    }

    /**
     * Get 安全中心标签 ID 列表，仅 AssetRange=3 生效 
     * @return TagIds 安全中心标签 ID 列表，仅 AssetRange=3 生效
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set 安全中心标签 ID 列表，仅 AssetRange=3 生效
     * @param TagIds 安全中心标签 ID 列表，仅 AssetRange=3 生效
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get 腾讯云标签列表，仅 AssetRange=3 生效
入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空 
     * @return CloudTags 腾讯云标签列表，仅 AssetRange=3 生效
入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空
     */
    public String [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set 腾讯云标签列表，仅 AssetRange=3 生效
入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空
     * @param CloudTags 腾讯云标签列表，仅 AssetRange=3 生效
入参限制：AssetRange=3 时 TagIds + CloudTags 不能同时为空
     */
    public void setCloudTags(String [] CloudTags) {
        this.CloudTags = CloudTags;
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

    }
}

