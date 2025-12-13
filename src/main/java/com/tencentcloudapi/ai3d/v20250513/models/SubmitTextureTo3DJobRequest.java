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
    * 源3D模型文件。
Type可选值：OBJ，GLB
    */
    @SerializedName("File3D")
    @Expose
    private File3D File3D;

    /**
    * 文生3D，3D内容的描述，中文正向提示词。
最多支持200个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 3D模型纹理参考图 Base64 数据和参考图图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

    /**
    * 是否开启 PBR材质生成，默认 false。
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
     * Get 源3D模型文件。
Type可选值：OBJ，GLB 
     * @return File3D 源3D模型文件。
Type可选值：OBJ，GLB
     */
    public File3D getFile3D() {
        return this.File3D;
    }

    /**
     * Set 源3D模型文件。
Type可选值：OBJ，GLB
     * @param File3D 源3D模型文件。
Type可选值：OBJ，GLB
     */
    public void setFile3D(File3D File3D) {
        this.File3D = File3D;
    }

    /**
     * Get 文生3D，3D内容的描述，中文正向提示词。
最多支持200个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。 
     * @return Prompt 文生3D，3D内容的描述，中文正向提示词。
最多支持200个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 文生3D，3D内容的描述，中文正向提示词。
最多支持200个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
     * @param Prompt 文生3D，3D内容的描述，中文正向提示词。
最多支持200个 utf-8 字符。
文生3D, image、image_url和 prompt必填其一，且prompt和image/image_url不能同时存在。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 3D模型纹理参考图 Base64 数据和参考图图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。 
     * @return Image 3D模型纹理参考图 Base64 数据和参考图图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set 3D模型纹理参考图 Base64 数据和参考图图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
     * @param Image 3D模型纹理参考图 Base64 数据和参考图图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于128，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
     */
    public void setImage(Image Image) {
        this.Image = Image;
    }

    /**
     * Get 是否开启 PBR材质生成，默认 false。 
     * @return EnablePBR 是否开启 PBR材质生成，默认 false。
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set 是否开启 PBR材质生成，默认 false。
     * @param EnablePBR 是否开启 PBR材质生成，默认 false。
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
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);

    }
}

