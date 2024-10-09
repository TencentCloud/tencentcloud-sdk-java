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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitImageAnimateJobRequest extends AbstractModel {

    /**
    * 图片格式：支持PNG、JPG、JPEG格式；
图片分辨率：长边分辨率不超过2056；
图片大小：不超过10M；
图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片base64数据。图片格式：支持PNG、JPG、JPEG格式；图片分辨率：长边分辨率不超过2056；图片大小：不超过10M；图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 动作模板ID。取值说明：ke3 科目三；tuziwu 兔子舞；huajiangwu 划桨舞。

    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 结果视频是否保留模板音频。默认为true
    */
    @SerializedName("EnableAudio")
    @Expose
    private Boolean EnableAudio;

    /**
    * 是否检测输入图人体12个身体部位（头部、颈部、右肩、右肘、右腕、左肩、左肘、左腕、右髋、左髋,、左膝、右膝）。默认不检测。
    */
    @SerializedName("EnableBodyJoins")
    @Expose
    private Boolean EnableBodyJoins;

    /**
    * 最终视频是否保留原图的背景（该模式对于tuziwu、huajiangwu不生效）

    */
    @SerializedName("EnableSegment")
    @Expose
    private Boolean EnableSegment;

    /**
     * Get 图片格式：支持PNG、JPG、JPEG格式；
图片分辨率：长边分辨率不超过2056；
图片大小：不超过10M；
图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内 
     * @return ImageUrl 图片格式：支持PNG、JPG、JPEG格式；
图片分辨率：长边分辨率不超过2056；
图片大小：不超过10M；
图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片格式：支持PNG、JPG、JPEG格式；
图片分辨率：长边分辨率不超过2056；
图片大小：不超过10M；
图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
     * @param ImageUrl 图片格式：支持PNG、JPG、JPEG格式；
图片分辨率：长边分辨率不超过2056；
图片大小：不超过10M；
图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片base64数据。图片格式：支持PNG、JPG、JPEG格式；图片分辨率：长边分辨率不超过2056；图片大小：不超过10M；图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内 
     * @return ImageBase64 图片base64数据。图片格式：支持PNG、JPG、JPEG格式；图片分辨率：长边分辨率不超过2056；图片大小：不超过10M；图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片base64数据。图片格式：支持PNG、JPG、JPEG格式；图片分辨率：长边分辨率不超过2056；图片大小：不超过10M；图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
     * @param ImageBase64 图片base64数据。图片格式：支持PNG、JPG、JPEG格式；图片分辨率：长边分辨率不超过2056；图片大小：不超过10M；图片宽高比：【宽：高】数值在 1:2 到 1:1.2 范围内
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 动作模板ID。取值说明：ke3 科目三；tuziwu 兔子舞；huajiangwu 划桨舞。
 
     * @return TemplateId 动作模板ID。取值说明：ke3 科目三；tuziwu 兔子舞；huajiangwu 划桨舞。

     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 动作模板ID。取值说明：ke3 科目三；tuziwu 兔子舞；huajiangwu 划桨舞。

     * @param TemplateId 动作模板ID。取值说明：ke3 科目三；tuziwu 兔子舞；huajiangwu 划桨舞。

     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 结果视频是否保留模板音频。默认为true 
     * @return EnableAudio 结果视频是否保留模板音频。默认为true
     */
    public Boolean getEnableAudio() {
        return this.EnableAudio;
    }

    /**
     * Set 结果视频是否保留模板音频。默认为true
     * @param EnableAudio 结果视频是否保留模板音频。默认为true
     */
    public void setEnableAudio(Boolean EnableAudio) {
        this.EnableAudio = EnableAudio;
    }

    /**
     * Get 是否检测输入图人体12个身体部位（头部、颈部、右肩、右肘、右腕、左肩、左肘、左腕、右髋、左髋,、左膝、右膝）。默认不检测。 
     * @return EnableBodyJoins 是否检测输入图人体12个身体部位（头部、颈部、右肩、右肘、右腕、左肩、左肘、左腕、右髋、左髋,、左膝、右膝）。默认不检测。
     */
    public Boolean getEnableBodyJoins() {
        return this.EnableBodyJoins;
    }

    /**
     * Set 是否检测输入图人体12个身体部位（头部、颈部、右肩、右肘、右腕、左肩、左肘、左腕、右髋、左髋,、左膝、右膝）。默认不检测。
     * @param EnableBodyJoins 是否检测输入图人体12个身体部位（头部、颈部、右肩、右肘、右腕、左肩、左肘、左腕、右髋、左髋,、左膝、右膝）。默认不检测。
     */
    public void setEnableBodyJoins(Boolean EnableBodyJoins) {
        this.EnableBodyJoins = EnableBodyJoins;
    }

    /**
     * Get 最终视频是否保留原图的背景（该模式对于tuziwu、huajiangwu不生效）
 
     * @return EnableSegment 最终视频是否保留原图的背景（该模式对于tuziwu、huajiangwu不生效）

     */
    public Boolean getEnableSegment() {
        return this.EnableSegment;
    }

    /**
     * Set 最终视频是否保留原图的背景（该模式对于tuziwu、huajiangwu不生效）

     * @param EnableSegment 最终视频是否保留原图的背景（该模式对于tuziwu、huajiangwu不生效）

     */
    public void setEnableSegment(Boolean EnableSegment) {
        this.EnableSegment = EnableSegment;
    }

    public SubmitImageAnimateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitImageAnimateJobRequest(SubmitImageAnimateJobRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.EnableAudio != null) {
            this.EnableAudio = new Boolean(source.EnableAudio);
        }
        if (source.EnableBodyJoins != null) {
            this.EnableBodyJoins = new Boolean(source.EnableBodyJoins);
        }
        if (source.EnableSegment != null) {
            this.EnableSegment = new Boolean(source.EnableSegment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "EnableAudio", this.EnableAudio);
        this.setParamSimple(map, prefix + "EnableBodyJoins", this.EnableBodyJoins);
        this.setParamSimple(map, prefix + "EnableSegment", this.EnableSegment);

    }
}

