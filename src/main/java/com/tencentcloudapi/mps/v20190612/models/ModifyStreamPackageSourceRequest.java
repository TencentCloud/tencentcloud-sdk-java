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

public class ModifyStreamPackageSourceRequest extends AbstractModel {

    /**
    * Source Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 修改后的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 区分直播Live和点播VOD source类型。	
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * source配置。	
    */
    @SerializedName("PackageConfs")
    @Expose
    private SourcePackageConf [] PackageConfs;

    /**
    * ADS可以根据Source Tag信息，返回更精准的广告。
    */
    @SerializedName("SourceTags")
    @Expose
    private SourceTag [] SourceTags;

    /**
     * Get Source Id。 
     * @return Id Source Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Source Id。
     * @param Id Source Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 修改后的名称。 
     * @return Name 修改后的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 修改后的名称。
     * @param Name 修改后的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 区分直播Live和点播VOD source类型。	 
     * @return Type 区分直播Live和点播VOD source类型。	
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 区分直播Live和点播VOD source类型。	
     * @param Type 区分直播Live和点播VOD source类型。	
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get source配置。	 
     * @return PackageConfs source配置。	
     */
    public SourcePackageConf [] getPackageConfs() {
        return this.PackageConfs;
    }

    /**
     * Set source配置。	
     * @param PackageConfs source配置。	
     */
    public void setPackageConfs(SourcePackageConf [] PackageConfs) {
        this.PackageConfs = PackageConfs;
    }

    /**
     * Get ADS可以根据Source Tag信息，返回更精准的广告。 
     * @return SourceTags ADS可以根据Source Tag信息，返回更精准的广告。
     */
    public SourceTag [] getSourceTags() {
        return this.SourceTags;
    }

    /**
     * Set ADS可以根据Source Tag信息，返回更精准的广告。
     * @param SourceTags ADS可以根据Source Tag信息，返回更精准的广告。
     */
    public void setSourceTags(SourceTag [] SourceTags) {
        this.SourceTags = SourceTags;
    }

    public ModifyStreamPackageSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageSourceRequest(ModifyStreamPackageSourceRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PackageConfs != null) {
            this.PackageConfs = new SourcePackageConf[source.PackageConfs.length];
            for (int i = 0; i < source.PackageConfs.length; i++) {
                this.PackageConfs[i] = new SourcePackageConf(source.PackageConfs[i]);
            }
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "PackageConfs.", this.PackageConfs);
        this.setParamArrayObj(map, prefix + "SourceTags.", this.SourceTags);

    }
}

