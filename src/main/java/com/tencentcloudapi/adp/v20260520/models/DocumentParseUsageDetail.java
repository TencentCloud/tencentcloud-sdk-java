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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocumentParseUsageDetail extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>消耗资源数（PU）</p>
    */
    @SerializedName("ConsumptionPu")
    @Expose
    private Float ConsumptionPu;

    /**
    * <p>文档 ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>文档解析方式：离线文档解析、实时文档解析。上报值 OfflineUpload 对应离线文档解析；RealtimeUpload、RealTimeDocParse 对应实时文档解析</p>
    */
    @SerializedName("DocUsageMethod")
    @Expose
    private String DocUsageMethod;

    /**
    * <p>知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>解析页数</p>
    */
    @SerializedName("ParsedPageCount")
    @Expose
    private String ParsedPageCount;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>消耗资源数（PU）</p> 
     * @return ConsumptionPu <p>消耗资源数（PU）</p>
     */
    public Float getConsumptionPu() {
        return this.ConsumptionPu;
    }

    /**
     * Set <p>消耗资源数（PU）</p>
     * @param ConsumptionPu <p>消耗资源数（PU）</p>
     */
    public void setConsumptionPu(Float ConsumptionPu) {
        this.ConsumptionPu = ConsumptionPu;
    }

    /**
     * Get <p>文档 ID</p> 
     * @return DocId <p>文档 ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>文档 ID</p>
     * @param DocId <p>文档 ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>文档解析方式：离线文档解析、实时文档解析。上报值 OfflineUpload 对应离线文档解析；RealtimeUpload、RealTimeDocParse 对应实时文档解析</p> 
     * @return DocUsageMethod <p>文档解析方式：离线文档解析、实时文档解析。上报值 OfflineUpload 对应离线文档解析；RealtimeUpload、RealTimeDocParse 对应实时文档解析</p>
     */
    public String getDocUsageMethod() {
        return this.DocUsageMethod;
    }

    /**
     * Set <p>文档解析方式：离线文档解析、实时文档解析。上报值 OfflineUpload 对应离线文档解析；RealtimeUpload、RealTimeDocParse 对应实时文档解析</p>
     * @param DocUsageMethod <p>文档解析方式：离线文档解析、实时文档解析。上报值 OfflineUpload 对应离线文档解析；RealtimeUpload、RealTimeDocParse 对应实时文档解析</p>
     */
    public void setDocUsageMethod(String DocUsageMethod) {
        this.DocUsageMethod = DocUsageMethod;
    }

    /**
     * Get <p>知识库 ID</p> 
     * @return KbId <p>知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>知识库 ID</p>
     * @param KbId <p>知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>解析页数</p> 
     * @return ParsedPageCount <p>解析页数</p>
     */
    public String getParsedPageCount() {
        return this.ParsedPageCount;
    }

    /**
     * Set <p>解析页数</p>
     * @param ParsedPageCount <p>解析页数</p>
     */
    public void setParsedPageCount(String ParsedPageCount) {
        this.ParsedPageCount = ParsedPageCount;
    }

    public DocumentParseUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentParseUsageDetail(DocumentParseUsageDetail source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ConsumptionPu != null) {
            this.ConsumptionPu = new Float(source.ConsumptionPu);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.DocUsageMethod != null) {
            this.DocUsageMethod = new String(source.DocUsageMethod);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.ParsedPageCount != null) {
            this.ParsedPageCount = new String(source.ParsedPageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ConsumptionPu", this.ConsumptionPu);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "DocUsageMethod", this.DocUsageMethod);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "ParsedPageCount", this.ParsedPageCount);

    }
}

