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

public class CreateImageSpriteTask2017 extends AbstractModel{

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
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 截取雪碧图文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 雪碧图小图总数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 截取雪碧图输出的地址。
    */
    @SerializedName("ImageSpriteUrlSet")
    @Expose
    private String [] ImageSpriteUrlSet;

    /**
    * 雪碧图子图位置与时间关系 WebVtt 文件地址。
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get 截图雪碧图任务 ID。 
     * @return TaskId 截图雪碧图任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 截图雪碧图任务 ID。
     * @param TaskId 截图雪碧图任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 错误码
<li>0：成功；</li>
<li>其他值：失败。</li> 
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息。 
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 截取雪碧图文件 ID。 
     * @return FileId 截取雪碧图文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 截取雪碧图文件 ID。
     * @param FileId 截取雪碧图文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。 
     * @return Definition 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     * @param Definition 雪碧图规格，参见[雪碧图截图模板](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 雪碧图小图总数量。 
     * @return TotalCount 雪碧图小图总数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 雪碧图小图总数量。
     * @param TotalCount 雪碧图小图总数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 截取雪碧图输出的地址。 
     * @return ImageSpriteUrlSet 截取雪碧图输出的地址。
     */
    public String [] getImageSpriteUrlSet() {
        return this.ImageSpriteUrlSet;
    }

    /**
     * Set 截取雪碧图输出的地址。
     * @param ImageSpriteUrlSet 截取雪碧图输出的地址。
     */
    public void setImageSpriteUrlSet(String [] ImageSpriteUrlSet) {
        this.ImageSpriteUrlSet = ImageSpriteUrlSet;
    }

    /**
     * Get 雪碧图子图位置与时间关系 WebVtt 文件地址。 
     * @return WebVttUrl 雪碧图子图位置与时间关系 WebVtt 文件地址。
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set 雪碧图子图位置与时间关系 WebVtt 文件地址。
     * @param WebVttUrl 雪碧图子图位置与时间关系 WebVtt 文件地址。
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
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

