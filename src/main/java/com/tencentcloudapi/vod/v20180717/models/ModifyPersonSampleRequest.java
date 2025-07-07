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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonSampleRequest extends AbstractModel {

    /**
    * 素材 ID。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 名称，长度限制：128 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述，长度限制：1024 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于不适宜的内容识别，等价于 Review.Face。
3. All：用于内容识别、不适宜的内容识别，等价于 1+2。
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * 五官操作信息。
    */
    @SerializedName("FaceOperationInfo")
    @Expose
    private AiSampleFaceOperation FaceOperationInfo;

    /**
    * 标签操作信息。
    */
    @SerializedName("TagOperationInfo")
    @Expose
    private AiSampleTagOperation TagOperationInfo;

    /**
     * Get 素材 ID。 
     * @return PersonId 素材 ID。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 素材 ID。
     * @param PersonId 素材 ID。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 名称，长度限制：128 个字符。 
     * @return Name 名称，长度限制：128 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称，长度限制：128 个字符。
     * @param Name 名称，长度限制：128 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述，长度限制：1024 个字符。 
     * @return Description 描述，长度限制：1024 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述，长度限制：1024 个字符。
     * @param Description 描述，长度限制：1024 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于不适宜的内容识别，等价于 Review.Face。
3. All：用于内容识别、不适宜的内容识别，等价于 1+2。 
     * @return Usages 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于不适宜的内容识别，等价于 Review.Face。
3. All：用于内容识别、不适宜的内容识别，等价于 1+2。
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于不适宜的内容识别，等价于 Review.Face。
3. All：用于内容识别、不适宜的内容识别，等价于 1+2。
     * @param Usages 素材应用场景，可选值：
1. Recognition：用于内容识别，等价于 Recognition.Face。
2. Review：用于不适宜的内容识别，等价于 Review.Face。
3. All：用于内容识别、不适宜的内容识别，等价于 1+2。
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get 五官操作信息。 
     * @return FaceOperationInfo 五官操作信息。
     */
    public AiSampleFaceOperation getFaceOperationInfo() {
        return this.FaceOperationInfo;
    }

    /**
     * Set 五官操作信息。
     * @param FaceOperationInfo 五官操作信息。
     */
    public void setFaceOperationInfo(AiSampleFaceOperation FaceOperationInfo) {
        this.FaceOperationInfo = FaceOperationInfo;
    }

    /**
     * Get 标签操作信息。 
     * @return TagOperationInfo 标签操作信息。
     */
    public AiSampleTagOperation getTagOperationInfo() {
        return this.TagOperationInfo;
    }

    /**
     * Set 标签操作信息。
     * @param TagOperationInfo 标签操作信息。
     */
    public void setTagOperationInfo(AiSampleTagOperation TagOperationInfo) {
        this.TagOperationInfo = TagOperationInfo;
    }

    public ModifyPersonSampleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPersonSampleRequest(ModifyPersonSampleRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Usages != null) {
            this.Usages = new String[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new String(source.Usages[i]);
            }
        }
        if (source.FaceOperationInfo != null) {
            this.FaceOperationInfo = new AiSampleFaceOperation(source.FaceOperationInfo);
        }
        if (source.TagOperationInfo != null) {
            this.TagOperationInfo = new AiSampleTagOperation(source.TagOperationInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamObj(map, prefix + "FaceOperationInfo.", this.FaceOperationInfo);
        this.setParamObj(map, prefix + "TagOperationInfo.", this.TagOperationInfo);

    }
}

