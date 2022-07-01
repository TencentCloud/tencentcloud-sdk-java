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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileUrlsRequest extends AbstractModel{

    /**
    * 文件对应的业务类型，目前支持：
- 模板 "TEMPLATE"
- 文档 "DOCUMENT"
- 印章  “SEAL”
- 流程 "FLOW"
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 业务编号的数组，如模板编号、文档编号、印章编号
最大支持20个资源
    */
    @SerializedName("BusinessIds")
    @Expose
    private String [] BusinessIds;

    /**
    * 操作者信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 下载后的文件命名，只有fileType为zip的时候生效
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型，"JPG", "PDF","ZIP"等
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 指定资源起始偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定资源数量，查询全部资源则传入-1
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24*60*60s(1天)
    */
    @SerializedName("UrlTtl")
    @Expose
    private Long UrlTtl;

    /**
    * 暂不开放
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 暂不开放
    */
    @SerializedName("CcToken")
    @Expose
    private String CcToken;

    /**
     * Get 文件对应的业务类型，目前支持：
- 模板 "TEMPLATE"
- 文档 "DOCUMENT"
- 印章  “SEAL”
- 流程 "FLOW" 
     * @return BusinessType 文件对应的业务类型，目前支持：
- 模板 "TEMPLATE"
- 文档 "DOCUMENT"
- 印章  “SEAL”
- 流程 "FLOW"
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 文件对应的业务类型，目前支持：
- 模板 "TEMPLATE"
- 文档 "DOCUMENT"
- 印章  “SEAL”
- 流程 "FLOW"
     * @param BusinessType 文件对应的业务类型，目前支持：
- 模板 "TEMPLATE"
- 文档 "DOCUMENT"
- 印章  “SEAL”
- 流程 "FLOW"
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 业务编号的数组，如模板编号、文档编号、印章编号
最大支持20个资源 
     * @return BusinessIds 业务编号的数组，如模板编号、文档编号、印章编号
最大支持20个资源
     */
    public String [] getBusinessIds() {
        return this.BusinessIds;
    }

    /**
     * Set 业务编号的数组，如模板编号、文档编号、印章编号
最大支持20个资源
     * @param BusinessIds 业务编号的数组，如模板编号、文档编号、印章编号
最大支持20个资源
     */
    public void setBusinessIds(String [] BusinessIds) {
        this.BusinessIds = BusinessIds;
    }

    /**
     * Get 操作者信息 
     * @return Operator 操作者信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者信息
     * @param Operator 操作者信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 应用相关信息 
     * @return Agent 应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息
     * @param Agent 应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 下载后的文件命名，只有fileType为zip的时候生效 
     * @return FileName 下载后的文件命名，只有fileType为zip的时候生效
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 下载后的文件命名，只有fileType为zip的时候生效
     * @param FileName 下载后的文件命名，只有fileType为zip的时候生效
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型，"JPG", "PDF","ZIP"等 
     * @return FileType 文件类型，"JPG", "PDF","ZIP"等
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，"JPG", "PDF","ZIP"等
     * @param FileType 文件类型，"JPG", "PDF","ZIP"等
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 指定资源起始偏移量，默认0 
     * @return Offset 指定资源起始偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 指定资源起始偏移量，默认0
     * @param Offset 指定资源起始偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定资源数量，查询全部资源则传入-1 
     * @return Limit 指定资源数量，查询全部资源则传入-1
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定资源数量，查询全部资源则传入-1
     * @param Limit 指定资源数量，查询全部资源则传入-1
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24*60*60s(1天) 
     * @return UrlTtl 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24*60*60s(1天)
     */
    public Long getUrlTtl() {
        return this.UrlTtl;
    }

    /**
     * Set 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24*60*60s(1天)
     * @param UrlTtl 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24*60*60s(1天)
     */
    public void setUrlTtl(Long UrlTtl) {
        this.UrlTtl = UrlTtl;
    }

    /**
     * Get 暂不开放 
     * @return Scene 暂不开放
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 暂不开放
     * @param Scene 暂不开放
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 暂不开放 
     * @return CcToken 暂不开放
     */
    public String getCcToken() {
        return this.CcToken;
    }

    /**
     * Set 暂不开放
     * @param CcToken 暂不开放
     */
    public void setCcToken(String CcToken) {
        this.CcToken = CcToken;
    }

    public DescribeFileUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileUrlsRequest(DescribeFileUrlsRequest source) {
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.BusinessIds != null) {
            this.BusinessIds = new String[source.BusinessIds.length];
            for (int i = 0; i < source.BusinessIds.length; i++) {
                this.BusinessIds[i] = new String(source.BusinessIds[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.UrlTtl != null) {
            this.UrlTtl = new Long(source.UrlTtl);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.CcToken != null) {
            this.CcToken = new String(source.CcToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamArraySimple(map, prefix + "BusinessIds.", this.BusinessIds);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "UrlTtl", this.UrlTtl);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "CcToken", this.CcToken);

    }
}

