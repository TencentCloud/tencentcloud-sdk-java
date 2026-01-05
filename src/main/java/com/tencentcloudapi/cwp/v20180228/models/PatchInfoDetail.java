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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PatchInfoDetail extends AbstractModel {

    /**
    * KB编号
    */
    @SerializedName("KBNo")
    @Expose
    private String KBNo;

    /**
    * KB名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 2025-05
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * KB影响的漏洞
    */
    @SerializedName("RelatedCveId")
    @Expose
    private String [] RelatedCveId;

    /**
    * KB说明文档
    */
    @SerializedName("KbDocUrl")
    @Expose
    private String KbDocUrl;

    /**
    * KB id编号
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get KB编号 
     * @return KBNo KB编号
     */
    public String getKBNo() {
        return this.KBNo;
    }

    /**
     * Set KB编号
     * @param KBNo KB编号
     */
    public void setKBNo(String KBNo) {
        this.KBNo = KBNo;
    }

    /**
     * Get KB名称 
     * @return Name KB名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set KB名称
     * @param Name KB名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 2025-05 
     * @return PublishTime 2025-05
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 2025-05
     * @param PublishTime 2025-05
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get KB影响的漏洞 
     * @return RelatedCveId KB影响的漏洞
     */
    public String [] getRelatedCveId() {
        return this.RelatedCveId;
    }

    /**
     * Set KB影响的漏洞
     * @param RelatedCveId KB影响的漏洞
     */
    public void setRelatedCveId(String [] RelatedCveId) {
        this.RelatedCveId = RelatedCveId;
    }

    /**
     * Get KB说明文档 
     * @return KbDocUrl KB说明文档
     */
    public String getKbDocUrl() {
        return this.KbDocUrl;
    }

    /**
     * Set KB说明文档
     * @param KbDocUrl KB说明文档
     */
    public void setKbDocUrl(String KbDocUrl) {
        this.KbDocUrl = KbDocUrl;
    }

    /**
     * Get KB id编号 
     * @return Id KB id编号
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set KB id编号
     * @param Id KB id编号
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public PatchInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatchInfoDetail(PatchInfoDetail source) {
        if (source.KBNo != null) {
            this.KBNo = new String(source.KBNo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.RelatedCveId != null) {
            this.RelatedCveId = new String[source.RelatedCveId.length];
            for (int i = 0; i < source.RelatedCveId.length; i++) {
                this.RelatedCveId[i] = new String(source.RelatedCveId[i]);
            }
        }
        if (source.KbDocUrl != null) {
            this.KbDocUrl = new String(source.KbDocUrl);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KBNo", this.KBNo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamArraySimple(map, prefix + "RelatedCveId.", this.RelatedCveId);
        this.setParamSimple(map, prefix + "KbDocUrl", this.KbDocUrl);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

