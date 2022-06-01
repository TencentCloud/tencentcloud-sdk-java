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

public class ModifyAIRecognitionTemplateRequest extends AbstractModel{

    /**
    * 视频内容识别模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 视频内容识别模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 视频内容识别模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 视频片头片尾识别控制参数。
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfoForUpdate HeadTailConfigure;

    /**
    * 视频拆条识别控制参数。
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfoForUpdate SegmentConfigure;

    /**
    * 人脸识别控制参数。
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfoForUpdate FaceConfigure;

    /**
    * 文本全文识别控制参数。
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure;

    /**
    * 文本关键词识别控制参数。
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfoForUpdate OcrWordsConfigure;

    /**
    * 语音全文识别控制参数。
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure;

    /**
    * 语音关键词识别控制参数。
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfoForUpdate AsrWordsConfigure;

    /**
    * 物体识别控制参数。
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfoForUpdate ObjectConfigure;

    /**
    * 截帧间隔，单位为秒，最小值为 0.5 秒。
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

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
     * Get 视频内容识别模板名称，长度限制：64 个字符。 
     * @return Name 视频内容识别模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 视频内容识别模板名称，长度限制：64 个字符。
     * @param Name 视频内容识别模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 视频内容识别模板描述信息，长度限制：256 个字符。 
     * @return Comment 视频内容识别模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 视频内容识别模板描述信息，长度限制：256 个字符。
     * @param Comment 视频内容识别模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 视频片头片尾识别控制参数。 
     * @return HeadTailConfigure 视频片头片尾识别控制参数。
     */
    public HeadTailConfigureInfoForUpdate getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set 视频片头片尾识别控制参数。
     * @param HeadTailConfigure 视频片头片尾识别控制参数。
     */
    public void setHeadTailConfigure(HeadTailConfigureInfoForUpdate HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get 视频拆条识别控制参数。 
     * @return SegmentConfigure 视频拆条识别控制参数。
     */
    public SegmentConfigureInfoForUpdate getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set 视频拆条识别控制参数。
     * @param SegmentConfigure 视频拆条识别控制参数。
     */
    public void setSegmentConfigure(SegmentConfigureInfoForUpdate SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get 人脸识别控制参数。 
     * @return FaceConfigure 人脸识别控制参数。
     */
    public FaceConfigureInfoForUpdate getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set 人脸识别控制参数。
     * @param FaceConfigure 人脸识别控制参数。
     */
    public void setFaceConfigure(FaceConfigureInfoForUpdate FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get 文本全文识别控制参数。 
     * @return OcrFullTextConfigure 文本全文识别控制参数。
     */
    public OcrFullTextConfigureInfoForUpdate getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set 文本全文识别控制参数。
     * @param OcrFullTextConfigure 文本全文识别控制参数。
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get 文本关键词识别控制参数。 
     * @return OcrWordsConfigure 文本关键词识别控制参数。
     */
    public OcrWordsConfigureInfoForUpdate getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set 文本关键词识别控制参数。
     * @param OcrWordsConfigure 文本关键词识别控制参数。
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfoForUpdate OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get 语音全文识别控制参数。 
     * @return AsrFullTextConfigure 语音全文识别控制参数。
     */
    public AsrFullTextConfigureInfoForUpdate getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set 语音全文识别控制参数。
     * @param AsrFullTextConfigure 语音全文识别控制参数。
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get 语音关键词识别控制参数。 
     * @return AsrWordsConfigure 语音关键词识别控制参数。
     */
    public AsrWordsConfigureInfoForUpdate getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set 语音关键词识别控制参数。
     * @param AsrWordsConfigure 语音关键词识别控制参数。
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfoForUpdate AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get 物体识别控制参数。 
     * @return ObjectConfigure 物体识别控制参数。
     */
    public ObjectConfigureInfoForUpdate getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set 物体识别控制参数。
     * @param ObjectConfigure 物体识别控制参数。
     */
    public void setObjectConfigure(ObjectConfigureInfoForUpdate ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get 截帧间隔，单位为秒，最小值为 0.5 秒。 
     * @return ScreenshotInterval 截帧间隔，单位为秒，最小值为 0.5 秒。
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 截帧间隔，单位为秒，最小值为 0.5 秒。
     * @param ScreenshotInterval 截帧间隔，单位为秒，最小值为 0.5 秒。
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    public ModifyAIRecognitionTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAIRecognitionTemplateRequest(ModifyAIRecognitionTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.HeadTailConfigure != null) {
            this.HeadTailConfigure = new HeadTailConfigureInfoForUpdate(source.HeadTailConfigure);
        }
        if (source.SegmentConfigure != null) {
            this.SegmentConfigure = new SegmentConfigureInfoForUpdate(source.SegmentConfigure);
        }
        if (source.FaceConfigure != null) {
            this.FaceConfigure = new FaceConfigureInfoForUpdate(source.FaceConfigure);
        }
        if (source.OcrFullTextConfigure != null) {
            this.OcrFullTextConfigure = new OcrFullTextConfigureInfoForUpdate(source.OcrFullTextConfigure);
        }
        if (source.OcrWordsConfigure != null) {
            this.OcrWordsConfigure = new OcrWordsConfigureInfoForUpdate(source.OcrWordsConfigure);
        }
        if (source.AsrFullTextConfigure != null) {
            this.AsrFullTextConfigure = new AsrFullTextConfigureInfoForUpdate(source.AsrFullTextConfigure);
        }
        if (source.AsrWordsConfigure != null) {
            this.AsrWordsConfigure = new AsrWordsConfigureInfoForUpdate(source.AsrWordsConfigure);
        }
        if (source.ObjectConfigure != null) {
            this.ObjectConfigure = new ObjectConfigureInfoForUpdate(source.ObjectConfigure);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "HeadTailConfigure.", this.HeadTailConfigure);
        this.setParamObj(map, prefix + "SegmentConfigure.", this.SegmentConfigure);
        this.setParamObj(map, prefix + "FaceConfigure.", this.FaceConfigure);
        this.setParamObj(map, prefix + "OcrFullTextConfigure.", this.OcrFullTextConfigure);
        this.setParamObj(map, prefix + "OcrWordsConfigure.", this.OcrWordsConfigure);
        this.setParamObj(map, prefix + "AsrFullTextConfigure.", this.AsrFullTextConfigure);
        this.setParamObj(map, prefix + "AsrWordsConfigure.", this.AsrWordsConfigure);
        this.setParamObj(map, prefix + "ObjectConfigure.", this.ObjectConfigure);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);

    }
}

