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

public class AIRecognitionTemplateItem  extends AbstractModel{

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
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取视频内容识别模板唯一标识。
     * @return Definition 视频内容识别模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置视频内容识别模板唯一标识。
     * @param Definition 视频内容识别模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取视频内容识别模板名称。
     * @return Name 视频内容识别模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置视频内容识别模板名称。
     * @param Name 视频内容识别模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取视频内容识别模板描述信息。
     * @return Comment 视频内容识别模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * 设置视频内容识别模板描述信息。
     * @param Comment 视频内容识别模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * 获取头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return HeadTailConfigure 头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HeadTailConfigureInfo getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * 设置头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadTailConfigure 头尾识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadTailConfigure(HeadTailConfigureInfo HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * 获取拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SegmentConfigure 拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SegmentConfigureInfo getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * 设置拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentConfigure 拆条识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentConfigure(SegmentConfigureInfo SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * 获取人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FaceConfigure 人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * 设置人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceConfigure 人脸识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceConfigure(FaceConfigureInfo FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * 获取文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return OcrFullTextConfigure 文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * 设置文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrFullTextConfigure 文本全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * 获取文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return OcrWordsConfigure 文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * 设置文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrWordsConfigure 文本关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * 获取语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AsrFullTextConfigure 语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * 设置语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrFullTextConfigure 语音全文识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfo AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * 获取语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AsrWordsConfigure 语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrWordsConfigureInfo getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * 设置语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrWordsConfigure 语音关键词识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfo AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * 获取物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ObjectConfigure 物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectConfigureInfo getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * 设置物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectConfigure 物体识别控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectConfigure(ObjectConfigureInfo ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * 获取截图时间间隔，单位：秒。
     * @return ScreenshotInterval 截图时间间隔，单位：秒。
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * 设置截图时间间隔，单位：秒。
     * @param ScreenshotInterval 截图时间间隔，单位：秒。
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * 获取模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
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

