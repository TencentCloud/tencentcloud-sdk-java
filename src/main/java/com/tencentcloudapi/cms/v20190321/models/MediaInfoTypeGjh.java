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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfoTypeGjh extends AbstractModel{

    /**
    * 动作
    */
    @SerializedName("StrAction")
    @Expose
    private String StrAction;

    /**
    * 内容
    */
    @SerializedName("StrContent")
    @Expose
    private String StrContent;

    /**
    * 文件ID
    */
    @SerializedName("StrFileID")
    @Expose
    private String StrFileID;

    /**
    * md5，填了可提高识别率
    */
    @SerializedName("StrMD5")
    @Expose
    private String StrMD5;

    /**
    * Sha
    */
    @SerializedName("StrSha")
    @Expose
    private String StrSha;

    /**
    * 标题
    */
    @SerializedName("StrTitle")
    @Expose
    private String StrTitle;

    /**
    * url
    */
    @SerializedName("StrUrl")
    @Expose
    private String StrUrl;

    /**
    * 大小
    */
    @SerializedName("UiSize")
    @Expose
    private Long UiSize;

    /**
     * Get 动作 
     * @return StrAction 动作
     */
    public String getStrAction() {
        return this.StrAction;
    }

    /**
     * Set 动作
     * @param StrAction 动作
     */
    public void setStrAction(String StrAction) {
        this.StrAction = StrAction;
    }

    /**
     * Get 内容 
     * @return StrContent 内容
     */
    public String getStrContent() {
        return this.StrContent;
    }

    /**
     * Set 内容
     * @param StrContent 内容
     */
    public void setStrContent(String StrContent) {
        this.StrContent = StrContent;
    }

    /**
     * Get 文件ID 
     * @return StrFileID 文件ID
     */
    public String getStrFileID() {
        return this.StrFileID;
    }

    /**
     * Set 文件ID
     * @param StrFileID 文件ID
     */
    public void setStrFileID(String StrFileID) {
        this.StrFileID = StrFileID;
    }

    /**
     * Get md5，填了可提高识别率 
     * @return StrMD5 md5，填了可提高识别率
     */
    public String getStrMD5() {
        return this.StrMD5;
    }

    /**
     * Set md5，填了可提高识别率
     * @param StrMD5 md5，填了可提高识别率
     */
    public void setStrMD5(String StrMD5) {
        this.StrMD5 = StrMD5;
    }

    /**
     * Get Sha 
     * @return StrSha Sha
     */
    public String getStrSha() {
        return this.StrSha;
    }

    /**
     * Set Sha
     * @param StrSha Sha
     */
    public void setStrSha(String StrSha) {
        this.StrSha = StrSha;
    }

    /**
     * Get 标题 
     * @return StrTitle 标题
     */
    public String getStrTitle() {
        return this.StrTitle;
    }

    /**
     * Set 标题
     * @param StrTitle 标题
     */
    public void setStrTitle(String StrTitle) {
        this.StrTitle = StrTitle;
    }

    /**
     * Get url 
     * @return StrUrl url
     */
    public String getStrUrl() {
        return this.StrUrl;
    }

    /**
     * Set url
     * @param StrUrl url
     */
    public void setStrUrl(String StrUrl) {
        this.StrUrl = StrUrl;
    }

    /**
     * Get 大小 
     * @return UiSize 大小
     */
    public Long getUiSize() {
        return this.UiSize;
    }

    /**
     * Set 大小
     * @param UiSize 大小
     */
    public void setUiSize(Long UiSize) {
        this.UiSize = UiSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrAction", this.StrAction);
        this.setParamSimple(map, prefix + "StrContent", this.StrContent);
        this.setParamSimple(map, prefix + "StrFileID", this.StrFileID);
        this.setParamSimple(map, prefix + "StrMD5", this.StrMD5);
        this.setParamSimple(map, prefix + "StrSha", this.StrSha);
        this.setParamSimple(map, prefix + "StrTitle", this.StrTitle);
        this.setParamSimple(map, prefix + "StrUrl", this.StrUrl);
        this.setParamSimple(map, prefix + "UiSize", this.UiSize);

    }
}

