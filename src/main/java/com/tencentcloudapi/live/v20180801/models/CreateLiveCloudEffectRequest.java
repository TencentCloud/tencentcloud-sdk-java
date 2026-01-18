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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveCloudEffectRequest extends AbstractModel {

    /**
    * <p>用于生成云端特效的 Prompt。示例：飞鸟。Prompt 和 ImageUrl 二选一。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>模板生礼物的模板ID。目前支持的模板ID：queen_accession, wizard_of_oz，red_envelopes，fishermen，captain_america。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>输入我的图片地址，用于生成云端特效。ImageUrl 和 Prompt 二选一。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>指定生成云端特效的方式。默认自动选取。标准方式：text2video，高品质方式：text2video_hq。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>操作者名称。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>用于生成云端特效的 Prompt。示例：飞鸟。Prompt 和 ImageUrl 二选一。</p> 
     * @return Prompt <p>用于生成云端特效的 Prompt。示例：飞鸟。Prompt 和 ImageUrl 二选一。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>用于生成云端特效的 Prompt。示例：飞鸟。Prompt 和 ImageUrl 二选一。</p>
     * @param Prompt <p>用于生成云端特效的 Prompt。示例：飞鸟。Prompt 和 ImageUrl 二选一。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>模板生礼物的模板ID。目前支持的模板ID：queen_accession, wizard_of_oz，red_envelopes，fishermen，captain_america。</p> 
     * @return TemplateId <p>模板生礼物的模板ID。目前支持的模板ID：queen_accession, wizard_of_oz，red_envelopes，fishermen，captain_america。</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板生礼物的模板ID。目前支持的模板ID：queen_accession, wizard_of_oz，red_envelopes，fishermen，captain_america。</p>
     * @param TemplateId <p>模板生礼物的模板ID。目前支持的模板ID：queen_accession, wizard_of_oz，red_envelopes，fishermen，captain_america。</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>输入我的图片地址，用于生成云端特效。ImageUrl 和 Prompt 二选一。</p> 
     * @return ImageUrl <p>输入我的图片地址，用于生成云端特效。ImageUrl 和 Prompt 二选一。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>输入我的图片地址，用于生成云端特效。ImageUrl 和 Prompt 二选一。</p>
     * @param ImageUrl <p>输入我的图片地址，用于生成云端特效。ImageUrl 和 Prompt 二选一。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>指定生成云端特效的方式。默认自动选取。标准方式：text2video，高品质方式：text2video_hq。</p> 
     * @return Type <p>指定生成云端特效的方式。默认自动选取。标准方式：text2video，高品质方式：text2video_hq。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>指定生成云端特效的方式。默认自动选取。标准方式：text2video，高品质方式：text2video_hq。</p>
     * @param Type <p>指定生成云端特效的方式。默认自动选取。标准方式：text2video，高品质方式：text2video_hq。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>操作者名称。</p> 
     * @return Operator <p>操作者名称。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者名称。</p>
     * @param Operator <p>操作者名称。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateLiveCloudEffectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveCloudEffectRequest(CreateLiveCloudEffectRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

