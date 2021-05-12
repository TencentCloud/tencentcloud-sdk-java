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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePersonSamplesRequest extends AbstractModel{

    /**
    * 拉取的素材类型，可选值：
<li>UserDefine：用户自定义素材库；</li>
<li>Default：系统默认素材库。</li>

默认值：UserDefine，拉取用户自定义素材库素材。
说明：如果是拉取系统默认素材库，只能使用素材名字或者素材 ID + 素材名字的方式进行拉取，且人脸图片只返回一张。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 素材 ID，数组长度限制：100。
    */
    @SerializedName("PersonIds")
    @Expose
    private String [] PersonIds;

    /**
    * 素材名称，数组长度限制：20。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 素材标签，数组长度限制：20。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：100，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 拉取的素材类型，可选值：
<li>UserDefine：用户自定义素材库；</li>
<li>Default：系统默认素材库。</li>

默认值：UserDefine，拉取用户自定义素材库素材。
说明：如果是拉取系统默认素材库，只能使用素材名字或者素材 ID + 素材名字的方式进行拉取，且人脸图片只返回一张。 
     * @return Type 拉取的素材类型，可选值：
<li>UserDefine：用户自定义素材库；</li>
<li>Default：系统默认素材库。</li>

默认值：UserDefine，拉取用户自定义素材库素材。
说明：如果是拉取系统默认素材库，只能使用素材名字或者素材 ID + 素材名字的方式进行拉取，且人脸图片只返回一张。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 拉取的素材类型，可选值：
<li>UserDefine：用户自定义素材库；</li>
<li>Default：系统默认素材库。</li>

默认值：UserDefine，拉取用户自定义素材库素材。
说明：如果是拉取系统默认素材库，只能使用素材名字或者素材 ID + 素材名字的方式进行拉取，且人脸图片只返回一张。
     * @param Type 拉取的素材类型，可选值：
<li>UserDefine：用户自定义素材库；</li>
<li>Default：系统默认素材库。</li>

默认值：UserDefine，拉取用户自定义素材库素材。
说明：如果是拉取系统默认素材库，只能使用素材名字或者素材 ID + 素材名字的方式进行拉取，且人脸图片只返回一张。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 素材 ID，数组长度限制：100。 
     * @return PersonIds 素材 ID，数组长度限制：100。
     */
    public String [] getPersonIds() {
        return this.PersonIds;
    }

    /**
     * Set 素材 ID，数组长度限制：100。
     * @param PersonIds 素材 ID，数组长度限制：100。
     */
    public void setPersonIds(String [] PersonIds) {
        this.PersonIds = PersonIds;
    }

    /**
     * Get 素材名称，数组长度限制：20。 
     * @return Names 素材名称，数组长度限制：20。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 素材名称，数组长度限制：20。
     * @param Names 素材名称，数组长度限制：20。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 素材标签，数组长度限制：20。 
     * @return Tags 素材标签，数组长度限制：20。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 素材标签，数组长度限制：20。
     * @param Tags 素材标签，数组长度限制：20。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：100，最大值：100。 
     * @return Limit 返回记录条数，默认值：100，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：100，最大值：100。
     * @param Limit 返回记录条数，默认值：100，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePersonSamplesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePersonSamplesRequest(DescribePersonSamplesRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PersonIds != null) {
            this.PersonIds = new String[source.PersonIds.length];
            for (int i = 0; i < source.PersonIds.length; i++) {
                this.PersonIds[i] = new String(source.PersonIds[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "PersonIds.", this.PersonIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

