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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageSpriteTask2017 extends AbstractModel {

    /**
    * <p>截图雪碧图任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>错误码</p><li>0：成功；</li><li>其他值：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>截取雪碧图文件 ID。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>雪碧图规格，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">雪碧图截图模板</a>。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>雪碧图小图总数量。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>截取雪碧图输出的地址。</p>
    */
    @SerializedName("ImageSpriteUrlSet")
    @Expose
    private String [] ImageSpriteUrlSet;

    /**
    * <p>雪碧图子图位置与时间关系 WebVtt 文件地址。</p>
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get <p>截图雪碧图任务 ID。</p> 
     * @return TaskId <p>截图雪碧图任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>截图雪碧图任务 ID。</p>
     * @param TaskId <p>截图雪碧图任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>错误码</p><li>0：成功；</li><li>其他值：失败。</li> 
     * @return ErrCode <p>错误码</p><li>0：成功；</li><li>其他值：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码</p><li>0：成功；</li><li>其他值：失败。</li>
     * @param ErrCode <p>错误码</p><li>0：成功；</li><li>其他值：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return Message <p>错误信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息。</p>
     * @param Message <p>错误信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>截取雪碧图文件 ID。</p> 
     * @return FileId <p>截取雪碧图文件 ID。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>截取雪碧图文件 ID。</p>
     * @param FileId <p>截取雪碧图文件 ID。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>雪碧图规格，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">雪碧图截图模板</a>。</p> 
     * @return Definition <p>雪碧图规格，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">雪碧图截图模板</a>。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>雪碧图规格，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">雪碧图截图模板</a>。</p>
     * @param Definition <p>雪碧图规格，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">雪碧图截图模板</a>。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>雪碧图小图总数量。</p> 
     * @return TotalCount <p>雪碧图小图总数量。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>雪碧图小图总数量。</p>
     * @param TotalCount <p>雪碧图小图总数量。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>截取雪碧图输出的地址。</p> 
     * @return ImageSpriteUrlSet <p>截取雪碧图输出的地址。</p>
     */
    public String [] getImageSpriteUrlSet() {
        return this.ImageSpriteUrlSet;
    }

    /**
     * Set <p>截取雪碧图输出的地址。</p>
     * @param ImageSpriteUrlSet <p>截取雪碧图输出的地址。</p>
     */
    public void setImageSpriteUrlSet(String [] ImageSpriteUrlSet) {
        this.ImageSpriteUrlSet = ImageSpriteUrlSet;
    }

    /**
     * Get <p>雪碧图子图位置与时间关系 WebVtt 文件地址。</p> 
     * @return WebVttUrl <p>雪碧图子图位置与时间关系 WebVtt 文件地址。</p>
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set <p>雪碧图子图位置与时间关系 WebVtt 文件地址。</p>
     * @param WebVttUrl <p>雪碧图子图位置与时间关系 WebVtt 文件地址。</p>
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
    }

    public CreateImageSpriteTask2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageSpriteTask2017(CreateImageSpriteTask2017 source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ImageSpriteUrlSet != null) {
            this.ImageSpriteUrlSet = new String[source.ImageSpriteUrlSet.length];
            for (int i = 0; i < source.ImageSpriteUrlSet.length; i++) {
                this.ImageSpriteUrlSet[i] = new String(source.ImageSpriteUrlSet[i]);
            }
        }
        if (source.WebVttUrl != null) {
            this.WebVttUrl = new String(source.WebVttUrl);
        }
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

