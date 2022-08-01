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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorTort extends AbstractModel{

    /**
    * 侵权信息ID
    */
    @SerializedName("TortId")
    @Expose
    private Long TortId;

    /**
    * 侵权标题
    */
    @SerializedName("TortTitle")
    @Expose
    private String TortTitle;

    /**
    * 侵权平台
    */
    @SerializedName("TortPlat")
    @Expose
    private String TortPlat;

    /**
    * 侵权链接
    */
    @SerializedName("TortURL")
    @Expose
    private String TortURL;

    /**
    * 侵权链接发布时间
    */
    @SerializedName("PubTime")
    @Expose
    private String PubTime;

    /**
    * 作者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * xxx
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * 1
    */
    @SerializedName("ObtainStatus")
    @Expose
    private Long ObtainStatus;

    /**
    * 1
    */
    @SerializedName("RightStatus")
    @Expose
    private Long RightStatus;

    /**
    * 1
    */
    @SerializedName("BlockStatus")
    @Expose
    private Long BlockStatus;

    /**
    * 1
    */
    @SerializedName("TortNum")
    @Expose
    private String TortNum;

    /**
    * 1
    */
    @SerializedName("ObtainNote")
    @Expose
    private String ObtainNote;

    /**
    * 1
    */
    @SerializedName("WorkTitle")
    @Expose
    private String WorkTitle;

    /**
     * Get 侵权信息ID 
     * @return TortId 侵权信息ID
     */
    public Long getTortId() {
        return this.TortId;
    }

    /**
     * Set 侵权信息ID
     * @param TortId 侵权信息ID
     */
    public void setTortId(Long TortId) {
        this.TortId = TortId;
    }

    /**
     * Get 侵权标题 
     * @return TortTitle 侵权标题
     */
    public String getTortTitle() {
        return this.TortTitle;
    }

    /**
     * Set 侵权标题
     * @param TortTitle 侵权标题
     */
    public void setTortTitle(String TortTitle) {
        this.TortTitle = TortTitle;
    }

    /**
     * Get 侵权平台 
     * @return TortPlat 侵权平台
     */
    public String getTortPlat() {
        return this.TortPlat;
    }

    /**
     * Set 侵权平台
     * @param TortPlat 侵权平台
     */
    public void setTortPlat(String TortPlat) {
        this.TortPlat = TortPlat;
    }

    /**
     * Get 侵权链接 
     * @return TortURL 侵权链接
     */
    public String getTortURL() {
        return this.TortURL;
    }

    /**
     * Set 侵权链接
     * @param TortURL 侵权链接
     */
    public void setTortURL(String TortURL) {
        this.TortURL = TortURL;
    }

    /**
     * Get 侵权链接发布时间 
     * @return PubTime 侵权链接发布时间
     */
    public String getPubTime() {
        return this.PubTime;
    }

    /**
     * Set 侵权链接发布时间
     * @param PubTime 侵权链接发布时间
     */
    public void setPubTime(String PubTime) {
        this.PubTime = PubTime;
    }

    /**
     * Get 作者 
     * @return Author 作者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 作者
     * @param Author 作者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get xxx 
     * @return DetectTime xxx
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set xxx
     * @param DetectTime xxx
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get 1 
     * @return ObtainStatus 1
     */
    public Long getObtainStatus() {
        return this.ObtainStatus;
    }

    /**
     * Set 1
     * @param ObtainStatus 1
     */
    public void setObtainStatus(Long ObtainStatus) {
        this.ObtainStatus = ObtainStatus;
    }

    /**
     * Get 1 
     * @return RightStatus 1
     */
    public Long getRightStatus() {
        return this.RightStatus;
    }

    /**
     * Set 1
     * @param RightStatus 1
     */
    public void setRightStatus(Long RightStatus) {
        this.RightStatus = RightStatus;
    }

    /**
     * Get 1 
     * @return BlockStatus 1
     */
    public Long getBlockStatus() {
        return this.BlockStatus;
    }

    /**
     * Set 1
     * @param BlockStatus 1
     */
    public void setBlockStatus(Long BlockStatus) {
        this.BlockStatus = BlockStatus;
    }

    /**
     * Get 1 
     * @return TortNum 1
     */
    public String getTortNum() {
        return this.TortNum;
    }

    /**
     * Set 1
     * @param TortNum 1
     */
    public void setTortNum(String TortNum) {
        this.TortNum = TortNum;
    }

    /**
     * Get 1 
     * @return ObtainNote 1
     */
    public String getObtainNote() {
        return this.ObtainNote;
    }

    /**
     * Set 1
     * @param ObtainNote 1
     */
    public void setObtainNote(String ObtainNote) {
        this.ObtainNote = ObtainNote;
    }

    /**
     * Get 1 
     * @return WorkTitle 1
     */
    public String getWorkTitle() {
        return this.WorkTitle;
    }

    /**
     * Set 1
     * @param WorkTitle 1
     */
    public void setWorkTitle(String WorkTitle) {
        this.WorkTitle = WorkTitle;
    }

    public MonitorTort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorTort(MonitorTort source) {
        if (source.TortId != null) {
            this.TortId = new Long(source.TortId);
        }
        if (source.TortTitle != null) {
            this.TortTitle = new String(source.TortTitle);
        }
        if (source.TortPlat != null) {
            this.TortPlat = new String(source.TortPlat);
        }
        if (source.TortURL != null) {
            this.TortURL = new String(source.TortURL);
        }
        if (source.PubTime != null) {
            this.PubTime = new String(source.PubTime);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.ObtainStatus != null) {
            this.ObtainStatus = new Long(source.ObtainStatus);
        }
        if (source.RightStatus != null) {
            this.RightStatus = new Long(source.RightStatus);
        }
        if (source.BlockStatus != null) {
            this.BlockStatus = new Long(source.BlockStatus);
        }
        if (source.TortNum != null) {
            this.TortNum = new String(source.TortNum);
        }
        if (source.ObtainNote != null) {
            this.ObtainNote = new String(source.ObtainNote);
        }
        if (source.WorkTitle != null) {
            this.WorkTitle = new String(source.WorkTitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TortId", this.TortId);
        this.setParamSimple(map, prefix + "TortTitle", this.TortTitle);
        this.setParamSimple(map, prefix + "TortPlat", this.TortPlat);
        this.setParamSimple(map, prefix + "TortURL", this.TortURL);
        this.setParamSimple(map, prefix + "PubTime", this.PubTime);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "ObtainStatus", this.ObtainStatus);
        this.setParamSimple(map, prefix + "RightStatus", this.RightStatus);
        this.setParamSimple(map, prefix + "BlockStatus", this.BlockStatus);
        this.setParamSimple(map, prefix + "TortNum", this.TortNum);
        this.setParamSimple(map, prefix + "ObtainNote", this.ObtainNote);
        this.setParamSimple(map, prefix + "WorkTitle", this.WorkTitle);

    }
}

