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

public class AIRecognitionTemplateItem extends AbstractModel{

    /**
    * 视频内容识别模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 视频内容识别模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 视频内容识别模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 人脸识别控制参数。
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfo FaceConfigure;

    /**
    * 文本全文识别控制参数。
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfo OcrFullTextConfigure;

    /**
    * 文本关键词识别控制参数。
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfo OcrWordsConfigure;

    /**
    * 语音全文识别控制参数。
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfo AsrFullTextConfigure;

    /**
    * 语音关键词识别控制参数。
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfo AsrWordsConfigure;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 视频内容识别模板唯一标识。 
     * @return Definition 视频内容识别模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 视频内容识别模板唯一标识。
     * @param Definition 视频内容识别模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 视频内容识别模板名称。 
     * @return Name 视频内容识别模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 视频内容识别模板名称。
     * @param Name 视频内容识别模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 视频内容识别模板描述信息。 
     * @return Comment 视频内容识别模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 视频内容识别模板描述信息。
     * @param Comment 视频内容识别模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 人脸识别控制参数。 
     * @return FaceConfigure 人脸识别控制参数。
     */
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set 人脸识别控制参数。
     * @param FaceConfigure 人脸识别控制参数。
     */
    public void setFaceConfigure(FaceConfigureInfo FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get 文本全文识别控制参数。 
     * @return OcrFullTextConfigure 文本全文识别控制参数。
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set 文本全文识别控制参数。
     * @param OcrFullTextConfigure 文本全文识别控制参数。
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get 文本关键词识别控制参数。 
     * @return OcrWordsConfigure 文本关键词识别控制参数。
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set 文本关键词识别控制参数。
     * @param OcrWordsConfigure 文本关键词识别控制参数。
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get 语音全文识别控制参数。 
     * @return AsrFullTextConfigure 语音全文识别控制参数。
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set 语音全文识别控制参数。
     * @param AsrFullTextConfigure 语音全文识别控制参数。
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfo AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get 语音关键词识别控制参数。 
     * @return AsrWordsConfigure 语音关键词识别控制参数。
     */
    public AsrWordsConfigureInfo getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set 语音关键词识别控制参数。
     * @param AsrWordsConfigure 语音关键词识别控制参数。
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfo AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "FaceConfigure.", this.FaceConfigure);
        this.setParamObj(map, prefix + "OcrFullTextConfigure.", this.OcrFullTextConfigure);
        this.setParamObj(map, prefix + "OcrWordsConfigure.", this.OcrWordsConfigure);
        this.setParamObj(map, prefix + "AsrFullTextConfigure.", this.AsrFullTextConfigure);
        this.setParamObj(map, prefix + "AsrWordsConfigure.", this.AsrWordsConfigure);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

