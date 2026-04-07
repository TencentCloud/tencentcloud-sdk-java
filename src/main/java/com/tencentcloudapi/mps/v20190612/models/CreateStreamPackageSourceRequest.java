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

public class CreateStreamPackageSourceRequest extends AbstractModel {

    /**
    * 该source所属的location id，必填且唯一绑定一个location。
    */
    @SerializedName("AttachedLocation")
    @Expose
    private String AttachedLocation;

    /**
    * Source名称，在location下面全局唯一。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 区分直播Live和点播VOD source类型，可选值：Live、VOD。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * source具体配置。
    */
    @SerializedName("PackageConfs")
    @Expose
    private SourcePackageConf [] PackageConfs;

    /**
    * sourcetag标签，ADS可以根据Source Tag信息，返回更精准的广告
    */
    @SerializedName("SourceTags")
    @Expose
    private SourceTag [] SourceTags;

    /**
     * Get 该source所属的location id，必填且唯一绑定一个location。 
     * @return AttachedLocation 该source所属的location id，必填且唯一绑定一个location。
     */
    public String getAttachedLocation() {
        return this.AttachedLocation;
    }

    /**
     * Set 该source所属的location id，必填且唯一绑定一个location。
     * @param AttachedLocation 该source所属的location id，必填且唯一绑定一个location。
     */
    public void setAttachedLocation(String AttachedLocation) {
        this.AttachedLocation = AttachedLocation;
    }

    /**
     * Get Source名称，在location下面全局唯一。 
     * @return Name Source名称，在location下面全局唯一。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Source名称，在location下面全局唯一。
     * @param Name Source名称，在location下面全局唯一。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 区分直播Live和点播VOD source类型，可选值：Live、VOD。 
     * @return Type 区分直播Live和点播VOD source类型，可选值：Live、VOD。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 区分直播Live和点播VOD source类型，可选值：Live、VOD。
     * @param Type 区分直播Live和点播VOD source类型，可选值：Live、VOD。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get source具体配置。 
     * @return PackageConfs source具体配置。
     */
    public SourcePackageConf [] getPackageConfs() {
        return this.PackageConfs;
    }

    /**
     * Set source具体配置。
     * @param PackageConfs source具体配置。
     */
    public void setPackageConfs(SourcePackageConf [] PackageConfs) {
        this.PackageConfs = PackageConfs;
    }

    /**
     * Get sourcetag标签，ADS可以根据Source Tag信息，返回更精准的广告 
     * @return SourceTags sourcetag标签，ADS可以根据Source Tag信息，返回更精准的广告
     */
    public SourceTag [] getSourceTags() {
        return this.SourceTags;
    }

    /**
     * Set sourcetag标签，ADS可以根据Source Tag信息，返回更精准的广告
     * @param SourceTags sourcetag标签，ADS可以根据Source Tag信息，返回更精准的广告
     */
    public void setSourceTags(SourceTag [] SourceTags) {
        this.SourceTags = SourceTags;
    }

    public CreateStreamPackageSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageSourceRequest(CreateStreamPackageSourceRequest source) {
        if (source.AttachedLocation != null) {
            this.AttachedLocation = new String(source.AttachedLocation);
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
        this.setParamSimple(map, prefix + "AttachedLocation", this.AttachedLocation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "PackageConfs.", this.PackageConfs);
        this.setParamArrayObj(map, prefix + "SourceTags.", this.SourceTags);

    }
}

