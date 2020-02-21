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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Music extends AbstractModel{

    /**
    * 音乐播放链接相对路径，必须通过在正版曲库直通车控制台上登记的域名进行拼接。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 音频文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 音频文件类型
    */
    @SerializedName("FileExtension")
    @Expose
    private String FileExtension;

    /**
    * Song fragment start.试听片段开始时间，试听时长为auditionEnd-auditionBegin
Unit :ms
    */
    @SerializedName("AuditionBegin")
    @Expose
    private Long AuditionBegin;

    /**
    * Song fragment end.试听片段结束时间, 试听时长为auditionEnd-auditionBegin
Unit :ms
    */
    @SerializedName("AuditionEnd")
    @Expose
    private Long AuditionEnd;

    /**
    * 音乐播放链接全路径，前提是在正版曲库直通车控制台添加过域名，否则返回空字符。
如果添加过多个域名只返回第一个添加域名的播放全路径。
    */
    @SerializedName("FullUrl")
    @Expose
    private String FullUrl;

    /**
     * Get 音乐播放链接相对路径，必须通过在正版曲库直通车控制台上登记的域名进行拼接。 
     * @return Url 音乐播放链接相对路径，必须通过在正版曲库直通车控制台上登记的域名进行拼接。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 音乐播放链接相对路径，必须通过在正版曲库直通车控制台上登记的域名进行拼接。
     * @param Url 音乐播放链接相对路径，必须通过在正版曲库直通车控制台上登记的域名进行拼接。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 音频文件大小 
     * @return FileSize 音频文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 音频文件大小
     * @param FileSize 音频文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 音频文件类型 
     * @return FileExtension 音频文件类型
     */
    public String getFileExtension() {
        return this.FileExtension;
    }

    /**
     * Set 音频文件类型
     * @param FileExtension 音频文件类型
     */
    public void setFileExtension(String FileExtension) {
        this.FileExtension = FileExtension;
    }

    /**
     * Get Song fragment start.试听片段开始时间，试听时长为auditionEnd-auditionBegin
Unit :ms 
     * @return AuditionBegin Song fragment start.试听片段开始时间，试听时长为auditionEnd-auditionBegin
Unit :ms
     */
    public Long getAuditionBegin() {
        return this.AuditionBegin;
    }

    /**
     * Set Song fragment start.试听片段开始时间，试听时长为auditionEnd-auditionBegin
Unit :ms
     * @param AuditionBegin Song fragment start.试听片段开始时间，试听时长为auditionEnd-auditionBegin
Unit :ms
     */
    public void setAuditionBegin(Long AuditionBegin) {
        this.AuditionBegin = AuditionBegin;
    }

    /**
     * Get Song fragment end.试听片段结束时间, 试听时长为auditionEnd-auditionBegin
Unit :ms 
     * @return AuditionEnd Song fragment end.试听片段结束时间, 试听时长为auditionEnd-auditionBegin
Unit :ms
     */
    public Long getAuditionEnd() {
        return this.AuditionEnd;
    }

    /**
     * Set Song fragment end.试听片段结束时间, 试听时长为auditionEnd-auditionBegin
Unit :ms
     * @param AuditionEnd Song fragment end.试听片段结束时间, 试听时长为auditionEnd-auditionBegin
Unit :ms
     */
    public void setAuditionEnd(Long AuditionEnd) {
        this.AuditionEnd = AuditionEnd;
    }

    /**
     * Get 音乐播放链接全路径，前提是在正版曲库直通车控制台添加过域名，否则返回空字符。
如果添加过多个域名只返回第一个添加域名的播放全路径。 
     * @return FullUrl 音乐播放链接全路径，前提是在正版曲库直通车控制台添加过域名，否则返回空字符。
如果添加过多个域名只返回第一个添加域名的播放全路径。
     */
    public String getFullUrl() {
        return this.FullUrl;
    }

    /**
     * Set 音乐播放链接全路径，前提是在正版曲库直通车控制台添加过域名，否则返回空字符。
如果添加过多个域名只返回第一个添加域名的播放全路径。
     * @param FullUrl 音乐播放链接全路径，前提是在正版曲库直通车控制台添加过域名，否则返回空字符。
如果添加过多个域名只返回第一个添加域名的播放全路径。
     */
    public void setFullUrl(String FullUrl) {
        this.FullUrl = FullUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileExtension", this.FileExtension);
        this.setParamSimple(map, prefix + "AuditionBegin", this.AuditionBegin);
        this.setParamSimple(map, prefix + "AuditionEnd", this.AuditionEnd);
        this.setParamSimple(map, prefix + "FullUrl", this.FullUrl);

    }
}

