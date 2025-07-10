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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocSegment extends AbstractModel {

    /**
    * 片段ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 文件类型(markdown,word,txt)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文档切片类型(segment-文档切片 table-表格)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * 标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 段落内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageContent")
    @Expose
    private String PageContent;

    /**
    * 段落原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgData")
    @Expose
    private String OrgData;

    /**
    * 文章ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * 文档业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 文档链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocUrl")
    @Expose
    private String DocUrl;

    /**
    * 文档的自定义链接
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

    /**
    * 页码信息
    */
    @SerializedName("PageInfos")
    @Expose
    private Long [] PageInfos;

    /**
     * Get 片段ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 片段ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 片段ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 片段ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessId 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessId 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 文件类型(markdown,word,txt)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 文件类型(markdown,word,txt)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型(markdown,word,txt)
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 文件类型(markdown,word,txt)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文档切片类型(segment-文档切片 table-表格)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentType 文档切片类型(segment-文档切片 table-表格)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set 文档切片类型(segment-文档切片 table-表格)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentType 文档切片类型(segment-文档切片 table-表格)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get 标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 段落内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageContent 段落内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPageContent() {
        return this.PageContent;
    }

    /**
     * Set 段落内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageContent 段落内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageContent(String PageContent) {
        this.PageContent = PageContent;
    }

    /**
     * Get 段落原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgData 段落原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgData() {
        return this.OrgData;
    }

    /**
     * Set 段落原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgData 段落原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgData(String OrgData) {
        this.OrgData = OrgData;
    }

    /**
     * Get 文章ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocId 文章ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set 文章ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocId 文章ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get 文档业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocBizId 文档业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocBizId 文档业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 文档链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocUrl 文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocUrl() {
        return this.DocUrl;
    }

    /**
     * Set 文档链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocUrl 文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocUrl(String DocUrl) {
        this.DocUrl = DocUrl;
    }

    /**
     * Get 文档的自定义链接 
     * @return WebUrl 文档的自定义链接
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set 文档的自定义链接
     * @param WebUrl 文档的自定义链接
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
    }

    /**
     * Get 页码信息 
     * @return PageInfos 页码信息
     */
    public Long [] getPageInfos() {
        return this.PageInfos;
    }

    /**
     * Set 页码信息
     * @param PageInfos 页码信息
     */
    public void setPageInfos(Long [] PageInfos) {
        this.PageInfos = PageInfos;
    }

    public DocSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocSegment(DocSegment source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.PageContent != null) {
            this.PageContent = new String(source.PageContent);
        }
        if (source.OrgData != null) {
            this.OrgData = new String(source.OrgData);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.DocUrl != null) {
            this.DocUrl = new String(source.DocUrl);
        }
        if (source.WebUrl != null) {
            this.WebUrl = new String(source.WebUrl);
        }
        if (source.PageInfos != null) {
            this.PageInfos = new Long[source.PageInfos.length];
            for (int i = 0; i < source.PageInfos.length; i++) {
                this.PageInfos[i] = new Long(source.PageInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "PageContent", this.PageContent);
        this.setParamSimple(map, prefix + "OrgData", this.OrgData);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "DocUrl", this.DocUrl);
        this.setParamSimple(map, prefix + "WebUrl", this.WebUrl);
        this.setParamArraySimple(map, prefix + "PageInfos.", this.PageInfos);

    }
}

