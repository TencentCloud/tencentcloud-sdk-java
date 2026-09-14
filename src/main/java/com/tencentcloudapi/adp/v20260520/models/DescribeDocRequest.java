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

public class DescribeDocRequest extends AbstractModel {

    /**
    * <p>文档 ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>字段掩码：当前支持的 Path：DocLink.CosUrl，其他未列举的字段默认都返回</p>
    */
    @SerializedName("ReadMask")
    @Expose
    private FieldMask ReadMask;

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
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>字段掩码：当前支持的 Path：DocLink.CosUrl，其他未列举的字段默认都返回</p> 
     * @return ReadMask <p>字段掩码：当前支持的 Path：DocLink.CosUrl，其他未列举的字段默认都返回</p>
     */
    public FieldMask getReadMask() {
        return this.ReadMask;
    }

    /**
     * Set <p>字段掩码：当前支持的 Path：DocLink.CosUrl，其他未列举的字段默认都返回</p>
     * @param ReadMask <p>字段掩码：当前支持的 Path：DocLink.CosUrl，其他未列举的字段默认都返回</p>
     */
    public void setReadMask(FieldMask ReadMask) {
        this.ReadMask = ReadMask;
    }

    public DescribeDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocRequest(DescribeDocRequest source) {
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.ReadMask != null) {
            this.ReadMask = new FieldMask(source.ReadMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "ReadMask.", this.ReadMask);

    }
}

