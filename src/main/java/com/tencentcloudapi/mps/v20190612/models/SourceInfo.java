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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceInfo extends AbstractModel {

    /**
    * 名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * source类型，区分直播Live和点播Vod。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 源配置。
    */
    @SerializedName("PackageConf")
    @Expose
    private SourcePackageConf [] PackageConf;

    /**
    * ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 创建时间戳。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间戳。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Region。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 源标签
    */
    @SerializedName("SourceTags")
    @Expose
    private SourceTag [] SourceTags;

    /**
     * Get 名称。 
     * @return Name 名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称。
     * @param Name 名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get source类型，区分直播Live和点播Vod。 
     * @return Type source类型，区分直播Live和点播Vod。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set source类型，区分直播Live和点播Vod。
     * @param Type source类型，区分直播Live和点播Vod。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 源配置。 
     * @return PackageConf 源配置。
     */
    public SourcePackageConf [] getPackageConf() {
        return this.PackageConf;
    }

    /**
     * Set 源配置。
     * @param PackageConf 源配置。
     */
    public void setPackageConf(SourcePackageConf [] PackageConf) {
        this.PackageConf = PackageConf;
    }

    /**
     * Get ID。 
     * @return Id ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID。
     * @param Id ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 创建时间戳。 
     * @return CreateTime 创建时间戳。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳。
     * @param CreateTime 创建时间戳。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间戳。 
     * @return UpdateTime 更新时间戳。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳。
     * @param UpdateTime 更新时间戳。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Region。 
     * @return Region Region。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region。
     * @param Region Region。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 源标签 
     * @return SourceTags 源标签
     */
    public SourceTag [] getSourceTags() {
        return this.SourceTags;
    }

    /**
     * Set 源标签
     * @param SourceTags 源标签
     */
    public void setSourceTags(SourceTag [] SourceTags) {
        this.SourceTags = SourceTags;
    }

    public SourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInfo(SourceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PackageConf != null) {
            this.PackageConf = new SourcePackageConf[source.PackageConf.length];
            for (int i = 0; i < source.PackageConf.length; i++) {
                this.PackageConf[i] = new SourcePackageConf(source.PackageConf[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SourceTags != null) {
            this.SourceTags = new SourceTag[source.SourceTags.length];
            for (int i = 0; i < source.SourceTags.length; i++) {
                this.SourceTags[i] = new SourceTag(source.SourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "PackageConf.", this.PackageConf);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "SourceTags.", this.SourceTags);

    }
}

