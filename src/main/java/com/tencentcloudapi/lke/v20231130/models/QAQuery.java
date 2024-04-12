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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QAQuery extends AbstractModel {

    /**
    * 页码


    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量

    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 机器人ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 查询内容

    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 分类ID

    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * 校验状态

    */
    @SerializedName("AcceptStatus")
    @Expose
    private Long [] AcceptStatus;

    /**
    * 发布状态

    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long [] ReleaseStatus;

    /**
    * 文档ID

    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * QAID

    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * 来源

    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 查询答案

    */
    @SerializedName("QueryAnswer")
    @Expose
    private String QueryAnswer;

    /**
     * Get 页码

 
     * @return PageNumber 页码


     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码


     * @param PageNumber 页码


     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量
 
     * @return PageSize 每页数量

     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量

     * @param PageSize 每页数量

     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 机器人ID 
     * @return BotBizId 机器人ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 机器人ID
     * @param BotBizId 机器人ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 查询内容
 
     * @return Query 查询内容

     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询内容

     * @param Query 查询内容

     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 分类ID
 
     * @return CateBizId 分类ID

     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID

     * @param CateBizId 分类ID

     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get 校验状态
 
     * @return AcceptStatus 校验状态

     */
    public Long [] getAcceptStatus() {
        return this.AcceptStatus;
    }

    /**
     * Set 校验状态

     * @param AcceptStatus 校验状态

     */
    public void setAcceptStatus(Long [] AcceptStatus) {
        this.AcceptStatus = AcceptStatus;
    }

    /**
     * Get 发布状态
 
     * @return ReleaseStatus 发布状态

     */
    public Long [] getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set 发布状态

     * @param ReleaseStatus 发布状态

     */
    public void setReleaseStatus(Long [] ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get 文档ID
 
     * @return DocBizId 文档ID

     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档ID

     * @param DocBizId 文档ID

     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get QAID
 
     * @return QaBizId QAID

     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set QAID

     * @param QaBizId QAID

     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get 来源
 
     * @return Source 来源

     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源

     * @param Source 来源

     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 查询答案
 
     * @return QueryAnswer 查询答案

     */
    public String getQueryAnswer() {
        return this.QueryAnswer;
    }

    /**
     * Set 查询答案

     * @param QueryAnswer 查询答案

     */
    public void setQueryAnswer(String QueryAnswer) {
        this.QueryAnswer = QueryAnswer;
    }

    public QAQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QAQuery(QAQuery source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.AcceptStatus != null) {
            this.AcceptStatus = new Long[source.AcceptStatus.length];
            for (int i = 0; i < source.AcceptStatus.length; i++) {
                this.AcceptStatus[i] = new Long(source.AcceptStatus[i]);
            }
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Long[source.ReleaseStatus.length];
            for (int i = 0; i < source.ReleaseStatus.length; i++) {
                this.ReleaseStatus[i] = new Long(source.ReleaseStatus[i]);
            }
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.QueryAnswer != null) {
            this.QueryAnswer = new String(source.QueryAnswer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamArraySimple(map, prefix + "AcceptStatus.", this.AcceptStatus);
        this.setParamArraySimple(map, prefix + "ReleaseStatus.", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "QueryAnswer", this.QueryAnswer);

    }
}

