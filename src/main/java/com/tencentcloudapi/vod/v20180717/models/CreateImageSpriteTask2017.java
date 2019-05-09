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

public class CreateImageSpriteTask2017  extends AbstractModel{

    /**
    * 截图雪碧图任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 截取雪碧图文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 雪碧图小图总数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 截取雪碧图输出的地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteUrlSet")
    @Expose
    private String [] ImageSpriteUrlSet;

    /**
    * 雪碧图子图位置与时间关系 WebVtt 文件地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * 获取截图雪碧图任务 ID。
     * @return TaskId 截图雪碧图任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置截图雪碧图任务 ID。
     * @param TaskId 截图雪碧图任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取截取雪碧图文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 截取雪碧图文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置截取雪碧图文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 截取雪碧图文件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Definition 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Definition 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取雪碧图小图总数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TotalCount 雪碧图小图总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置雪碧图小图总数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 雪碧图小图总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取截取雪碧图输出的地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageSpriteUrlSet 截取雪碧图输出的地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImageSpriteUrlSet() {
        return this.ImageSpriteUrlSet;
    }

    /**
     * 设置截取雪碧图输出的地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteUrlSet 截取雪碧图输出的地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteUrlSet(String [] ImageSpriteUrlSet) {
        this.ImageSpriteUrlSet = ImageSpriteUrlSet;
    }

    /**
     * 获取雪碧图子图位置与时间关系 WebVtt 文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WebVttUrl 雪碧图子图位置与时间关系 WebVtt 文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * 设置雪碧图子图位置与时间关系 WebVtt 文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebVttUrl 雪碧图子图位置与时间关系 WebVtt 文件地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ImageSpriteUrlSet.", this.ImageSpriteUrlSet);
        this.setParamSimple(map, prefix + "WebVttUrl", this.WebVttUrl);

    }
}

