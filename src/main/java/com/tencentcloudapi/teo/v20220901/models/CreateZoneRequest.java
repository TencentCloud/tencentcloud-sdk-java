/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateZoneRequest extends AbstractModel{

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 接入方式，取值有：
<li> full：NS接入；</li>
<li> partial：CNAME接入。</li>不填写使用默认值full。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否跳过站点现有的DNS记录扫描。默认值：false。
    */
    @SerializedName("JumpStart")
    @Expose
    private Boolean JumpStart;

    /**
    * 资源标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 接入方式，取值有：
<li> full：NS接入；</li>
<li> partial：CNAME接入。</li>不填写使用默认值full。 
     * @return Type 接入方式，取值有：
<li> full：NS接入；</li>
<li> partial：CNAME接入。</li>不填写使用默认值full。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 接入方式，取值有：
<li> full：NS接入；</li>
<li> partial：CNAME接入。</li>不填写使用默认值full。
     * @param Type 接入方式，取值有：
<li> full：NS接入；</li>
<li> partial：CNAME接入。</li>不填写使用默认值full。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否跳过站点现有的DNS记录扫描。默认值：false。 
     * @return JumpStart 是否跳过站点现有的DNS记录扫描。默认值：false。
     */
    public Boolean getJumpStart() {
        return this.JumpStart;
    }

    /**
     * Set 是否跳过站点现有的DNS记录扫描。默认值：false。
     * @param JumpStart 是否跳过站点现有的DNS记录扫描。默认值：false。
     */
    public void setJumpStart(Boolean JumpStart) {
        this.JumpStart = JumpStart;
    }

    /**
     * Get 资源标签。 
     * @return Tags 资源标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源标签。
     * @param Tags 资源标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateZoneRequest(CreateZoneRequest source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.JumpStart != null) {
            this.JumpStart = new Boolean(source.JumpStart);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "JumpStart", this.JumpStart);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

