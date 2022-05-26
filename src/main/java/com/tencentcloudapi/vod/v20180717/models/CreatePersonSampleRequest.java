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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonSampleRequest extends AbstractModel{

    /**
    * 素材名称，长度限制：20 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容不适宜，等价于 Review.Face。
3. All：包含以上全部，等价于 1+2。
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 素材描述，长度限制：1024 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 素材图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像五官较清晰的照片，像素不低于 200*200。
    */
    @SerializedName("FaceContents")
    @Expose
    private String [] FaceContents;

    /**
    * 素材标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 素材名称，长度限制：20 个字符。 
     * @return Name 素材名称，长度限制：20 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 素材名称，长度限制：20 个字符。
     * @param Name 素材名称，长度限制：20 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容不适宜，等价于 Review.Face。
3. All：包含以上全部，等价于 1+2。 
     * @return Usages 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容不适宜，等价于 Review.Face。
3. All：包含以上全部，等价于 1+2。
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容不适宜，等价于 Review.Face。
3. All：包含以上全部，等价于 1+2。
     * @param Usages 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容不适宜，等价于 Review.Face。
3. All：包含以上全部，等价于 1+2。
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 素材描述，长度限制：1024 个字符。 
     * @return Description 素材描述，长度限制：1024 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 素材描述，长度限制：1024 个字符。
     * @param Description 素材描述，长度限制：1024 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 素材图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像五官较清晰的照片，像素不低于 200*200。 
     * @return FaceContents 素材图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像五官较清晰的照片，像素不低于 200*200。
     */
    public String [] getFaceContents() {
        return this.FaceContents;
    }

    /**
     * Set 素材图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像五官较清晰的照片，像素不低于 200*200。
     * @param FaceContents 素材图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像五官较清晰的照片，像素不低于 200*200。
     */
    public void setFaceContents(String [] FaceContents) {
        this.FaceContents = FaceContents;
    }

    /**
     * Get 素材标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li> 
     * @return Tags 素材标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 素材标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     * @param Tags 素材标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public CreatePersonSampleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonSampleRequest(CreatePersonSampleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Usages != null) {
            this.Usages = new String[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new String(source.Usages[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FaceContents != null) {
            this.FaceContents = new String[source.FaceContents.length];
            for (int i = 0; i < source.FaceContents.length; i++) {
                this.FaceContents[i] = new String(source.FaceContents[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "FaceContents.", this.FaceContents);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

