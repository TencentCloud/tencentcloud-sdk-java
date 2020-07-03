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
    * 头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfo HeadTailConfigure;

    /**
    * 拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfo SegmentConfigure;

    /**
    * 人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfo FaceConfigure;

    /**
    * 文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfo OcrFullTextConfigure;

    /**
    * 文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfo OcrWordsConfigure;

    /**
    * 语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfo AsrFullTextConfigure;

    /**
    * 语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfo AsrWordsConfigure;

    /**
    * 物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfo ObjectConfigure;

    /**
    * 截图时间间隔，单位：秒。
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
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
     * Get 头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadTailConfigure 头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HeadTailConfigureInfo getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set 头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadTailConfigure 头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadTailConfigure(HeadTailConfigureInfo HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get 拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentConfigure 拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SegmentConfigureInfo getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set 拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentConfigure 拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentConfigure(SegmentConfigureInfo SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get 人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceConfigure 人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set 人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceConfigure 人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceConfigure(FaceConfigureInfo FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get 文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrFullTextConfigure 文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set 文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrFullTextConfigure 文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get 文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrWordsConfigure 文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set 文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrWordsConfigure 文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get 语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrFullTextConfigure 语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set 语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrFullTextConfigure 语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfo AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get 语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrWordsConfigure 语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrWordsConfigureInfo getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set 语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrWordsConfigure 语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfo AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get 物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectConfigure 物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectConfigureInfo getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set 物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectConfigure 物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectConfigure(ObjectConfigureInfo ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get 截图时间间隔，单位：秒。 
     * @return ScreenshotInterval 截图时间间隔，单位：秒。
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 截图时间间隔，单位：秒。
     * @param ScreenshotInterval 截图时间间隔，单位：秒。
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
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
        this.setParamObj(map, prefix + "HeadTailConfigure.", this.HeadTailConfigure);
        this.setParamObj(map, prefix + "SegmentConfigure.", this.SegmentConfigure);
        this.setParamObj(map, prefix + "FaceConfigure.", this.FaceConfigure);
        this.setParamObj(map, prefix + "OcrFullTextConfigure.", this.OcrFullTextConfigure);
        this.setParamObj(map, prefix + "OcrWordsConfigure.", this.OcrWordsConfigure);
        this.setParamObj(map, prefix + "AsrFullTextConfigure.", this.AsrFullTextConfigure);
        this.setParamObj(map, prefix + "AsrWordsConfigure.", this.AsrWordsConfigure);
        this.setParamObj(map, prefix + "ObjectConfigure.", this.ObjectConfigure);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

