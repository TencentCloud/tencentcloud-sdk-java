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

public class CreatePersonSampleRequest extends AbstractModel{

    /**
    * 人物名称，长度限制：20 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人物应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容审核，等价于 Review.Face。
3. All：用于内容识别、内容审核，等价于 1+2。
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * 人物描述，长度限制：1024 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 人脸图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像正面人脸较清晰的照片，像素不低于 200*200。
    */
    @SerializedName("FaceContents")
    @Expose
    private String [] FaceContents;

    /**
    * 人物标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 人物名称，长度限制：20 个字符。 
     * @return Name 人物名称，长度限制：20 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人物名称，长度限制：20 个字符。
     * @param Name 人物名称，长度限制：20 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人物应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容审核，等价于 Review.Face。
3. All：用于内容识别、内容审核，等价于 1+2。 
     * @return Usages 人物应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容审核，等价于 Review.Face。
3. All：用于内容识别、内容审核，等价于 1+2。
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set 人物应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容审核，等价于 Review.Face。
3. All：用于内容识别、内容审核，等价于 1+2。
     * @param Usages 人物应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于内容审核，等价于 Review.Face。
3. All：用于内容识别、内容审核，等价于 1+2。
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get 人物描述，长度限制：1024 个字符。 
     * @return Description 人物描述，长度限制：1024 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 人物描述，长度限制：1024 个字符。
     * @param Description 人物描述，长度限制：1024 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 人脸图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像正面人脸较清晰的照片，像素不低于 200*200。 
     * @return FaceContents 人脸图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像正面人脸较清晰的照片，像素不低于 200*200。
     */
    public String [] getFaceContents() {
        return this.FaceContents;
    }

    /**
     * Set 人脸图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像正面人脸较清晰的照片，像素不低于 200*200。
     * @param FaceContents 人脸图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串，仅支持 jpeg、png 图片格式。数组长度限制：5 张图片。
注意：图片必须是单人像正面人脸较清晰的照片，像素不低于 200*200。
     */
    public void setFaceContents(String [] FaceContents) {
        this.FaceContents = FaceContents;
    }

    /**
     * Get 人物标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li> 
     * @return Tags 人物标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 人物标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     * @param Tags 人物标签
<li>数组长度限制：20 个标签；</li>
<li>单个标签长度限制：128 个字符。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "FaceContents.", this.FaceContents);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

