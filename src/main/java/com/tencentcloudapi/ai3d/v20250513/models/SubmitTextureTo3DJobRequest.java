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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTextureTo3DJobRequest extends AbstractModel {

    /**
    * <p>源3D模型文件。<br>Type可选值：OBJ，GLB</p>
    */
    @SerializedName("File3D")
    @Expose
    private File3D File3D;

    /**
    * <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>仅选择3.1版本时，多视图功能可用。</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>多视角的模型图片（仅3.1版本支持），视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图；<br>bottom：底视图；<br>left_front：左前45°视图；<br>right_front：右前45°视图；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持200个 utf-8 字符。<br>文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>3D模型纹理参考图 Base64 数据和参考图 Url。</p><ul><li>Base64 和 Url 必须提供一个，如果都提供以 Url 为准。</li><li>图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

    /**
    * <p>是否开启 PBR材质生成，默认 false。</p>
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
     * Get <p>源3D模型文件。<br>Type可选值：OBJ，GLB</p> 
     * @return File3D <p>源3D模型文件。<br>Type可选值：OBJ，GLB</p>
     */
    public File3D getFile3D() {
        return this.File3D;
    }

    /**
     * Set <p>源3D模型文件。<br>Type可选值：OBJ，GLB</p>
     * @param File3D <p>源3D模型文件。<br>Type可选值：OBJ，GLB</p>
     */
    public void setFile3D(File3D File3D) {
        this.File3D = File3D;
    }

    /**
     * Get <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>仅选择3.1版本时，多视图功能可用。</p> 
     * @return Model <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>仅选择3.1版本时，多视图功能可用。</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>仅选择3.1版本时，多视图功能可用。</p>
     * @param Model <p>混元生3D生成模型版本，默认为3.0，可选项：3.0，3.1<br>仅选择3.1版本时，多视图功能可用。</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>多视角的模型图片（仅3.1版本支持），视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图；<br>bottom：底视图；<br>left_front：左前45°视图；<br>right_front：右前45°视图；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p> 
     * @return MultiViewImages <p>多视角的模型图片（仅3.1版本支持），视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图；<br>bottom：底视图；<br>left_front：左前45°视图；<br>right_front：右前45°视图；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set <p>多视角的模型图片（仅3.1版本支持），视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图；<br>bottom：底视图；<br>left_front：左前45°视图；<br>right_front：右前45°视图；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
     * @param MultiViewImages <p>多视角的模型图片（仅3.1版本支持），视角参考值：<br>left：左视图；<br>right：右视图；<br>back：后视图；<br>top：顶视图；<br>bottom：底视图；<br>left_front：左前45°视图；<br>right_front：右前45°视图；</p><p>每个视角仅限制一张图片。<br>●图片大小限制：编码后所有图片大小总和不可超过8M。（base64编码下图片大小总和不超过6M，因base64编码后图片大小会大30%左右）<br>●图片分辨率限制：单边分辨率小于5000且大于128。<br>●支持图片格式：支持jpg或png</p>
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
    }

    /**
     * Get <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持200个 utf-8 字符。<br>文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。</p> 
     * @return Prompt <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持200个 utf-8 字符。<br>文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持200个 utf-8 字符。<br>文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。</p>
     * @param Prompt <p>文生3D，3D内容的描述，中文正向提示词。<br>最多支持200个 utf-8 字符。<br>文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>3D模型纹理参考图 Base64 数据和参考图 Url。</p><ul><li>Base64 和 Url 必须提供一个，如果都提供以 Url 为准。</li><li>图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。</li></ul> 
     * @return Image <p>3D模型纹理参考图 Base64 数据和参考图 Url。</p><ul><li>Base64 和 Url 必须提供一个，如果都提供以 Url 为准。</li><li>图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。</li></ul>
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set <p>3D模型纹理参考图 Base64 数据和参考图 Url。</p><ul><li>Base64 和 Url 必须提供一个，如果都提供以 Url 为准。</li><li>图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。</li></ul>
     * @param Image <p>3D模型纹理参考图 Base64 数据和参考图 Url。</p><ul><li>Base64 和 Url 必须提供一个，如果都提供以 Url 为准。</li><li>图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。</li></ul>
     */
    public void setImage(Image Image) {
        this.Image = Image;
    }

    /**
     * Get <p>是否开启 PBR材质生成，默认 false。</p> 
     * @return EnablePBR <p>是否开启 PBR材质生成，默认 false。</p>
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>是否开启 PBR材质生成，默认 false。</p>
     * @param EnablePBR <p>是否开启 PBR材质生成，默认 false。</p>
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    public SubmitTextureTo3DJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTextureTo3DJobRequest(SubmitTextureTo3DJobRequest source) {
        if (source.File3D != null) {
            this.File3D = new File3D(source.File3D);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.MultiViewImages != null) {
            this.MultiViewImages = new ViewImage[source.MultiViewImages.length];
            for (int i = 0; i < source.MultiViewImages.length; i++) {
                this.MultiViewImages[i] = new ViewImage(source.MultiViewImages[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Image != null) {
            this.Image = new Image(source.Image);
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "File3D.", this.File3D);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "MultiViewImages.", this.MultiViewImages);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);

    }
}

