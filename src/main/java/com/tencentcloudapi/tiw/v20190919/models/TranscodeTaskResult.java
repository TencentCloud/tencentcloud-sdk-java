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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeTaskResult extends AbstractModel{

    /**
    * 转码结果地址
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 分辨率
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 标题（一般为文件名）
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 转码页数
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 缩略图URL前缀，比如，该URL前缀为http://example.com/g0jb42ps49vtebjshilb/，那么动态PPT第1页的缩略图URL为
http://example.com/g0jb42ps49vtebjshilb/1.jpg，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
    */
    @SerializedName("ThumbnailUrl")
    @Expose
    private String ThumbnailUrl;

    /**
    * 动态转码缩略图生成分辨率
    */
    @SerializedName("ThumbnailResolution")
    @Expose
    private String ThumbnailResolution;

    /**
    * 转码压缩文件下载的URL，如果发起文档转码请求参数中CompressFileType为空或者不是支持的压缩格式，该参数为空字符串
    */
    @SerializedName("CompressFileUrl")
    @Expose
    private String CompressFileUrl;

    /**
    * 任务失败错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 任务失败错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get 转码结果地址 
     * @return ResultUrl 转码结果地址
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set 转码结果地址
     * @param ResultUrl 转码结果地址
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
    }

    /**
     * Get 分辨率 
     * @return Resolution 分辨率
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率
     * @param Resolution 分辨率
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 标题（一般为文件名） 
     * @return Title 标题（一般为文件名）
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题（一般为文件名）
     * @param Title 标题（一般为文件名）
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 转码页数 
     * @return Pages 转码页数
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 转码页数
     * @param Pages 转码页数
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 缩略图URL前缀，比如，该URL前缀为http://example.com/g0jb42ps49vtebjshilb/，那么动态PPT第1页的缩略图URL为
http://example.com/g0jb42ps49vtebjshilb/1.jpg，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串 
     * @return ThumbnailUrl 缩略图URL前缀，比如，该URL前缀为http://example.com/g0jb42ps49vtebjshilb/，那么动态PPT第1页的缩略图URL为
http://example.com/g0jb42ps49vtebjshilb/1.jpg，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
     */
    public String getThumbnailUrl() {
        return this.ThumbnailUrl;
    }

    /**
     * Set 缩略图URL前缀，比如，该URL前缀为http://example.com/g0jb42ps49vtebjshilb/，那么动态PPT第1页的缩略图URL为
http://example.com/g0jb42ps49vtebjshilb/1.jpg，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
     * @param ThumbnailUrl 缩略图URL前缀，比如，该URL前缀为http://example.com/g0jb42ps49vtebjshilb/，那么动态PPT第1页的缩略图URL为
http://example.com/g0jb42ps49vtebjshilb/1.jpg，其它页以此类推

如果发起文档转码请求参数中带了ThumbnailResolution参数，并且转码类型为动态转码，该参数不为空，其余情况该参数为空字符串
     */
    public void setThumbnailUrl(String ThumbnailUrl) {
        this.ThumbnailUrl = ThumbnailUrl;
    }

    /**
     * Get 动态转码缩略图生成分辨率 
     * @return ThumbnailResolution 动态转码缩略图生成分辨率
     */
    public String getThumbnailResolution() {
        return this.ThumbnailResolution;
    }

    /**
     * Set 动态转码缩略图生成分辨率
     * @param ThumbnailResolution 动态转码缩略图生成分辨率
     */
    public void setThumbnailResolution(String ThumbnailResolution) {
        this.ThumbnailResolution = ThumbnailResolution;
    }

    /**
     * Get 转码压缩文件下载的URL，如果发起文档转码请求参数中CompressFileType为空或者不是支持的压缩格式，该参数为空字符串 
     * @return CompressFileUrl 转码压缩文件下载的URL，如果发起文档转码请求参数中CompressFileType为空或者不是支持的压缩格式，该参数为空字符串
     */
    public String getCompressFileUrl() {
        return this.CompressFileUrl;
    }

    /**
     * Set 转码压缩文件下载的URL，如果发起文档转码请求参数中CompressFileType为空或者不是支持的压缩格式，该参数为空字符串
     * @param CompressFileUrl 转码压缩文件下载的URL，如果发起文档转码请求参数中CompressFileType为空或者不是支持的压缩格式，该参数为空字符串
     */
    public void setCompressFileUrl(String CompressFileUrl) {
        this.CompressFileUrl = CompressFileUrl;
    }

    /**
     * Get 任务失败错误码 
     * @return ErrorCode 任务失败错误码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务失败错误码
     * @param ErrorCode 任务失败错误码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 任务失败错误信息 
     * @return ErrorMsg 任务失败错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 任务失败错误信息
     * @param ErrorMsg 任务失败错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public TranscodeTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskResult(TranscodeTaskResult source) {
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.ThumbnailUrl != null) {
            this.ThumbnailUrl = new String(source.ThumbnailUrl);
        }
        if (source.ThumbnailResolution != null) {
            this.ThumbnailResolution = new String(source.ThumbnailResolution);
        }
        if (source.CompressFileUrl != null) {
            this.CompressFileUrl = new String(source.CompressFileUrl);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "ThumbnailUrl", this.ThumbnailUrl);
        this.setParamSimple(map, prefix + "ThumbnailResolution", this.ThumbnailResolution);
        this.setParamSimple(map, prefix + "CompressFileUrl", this.CompressFileUrl);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

