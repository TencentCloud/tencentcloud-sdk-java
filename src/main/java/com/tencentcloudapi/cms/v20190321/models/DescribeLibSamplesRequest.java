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

public class DescribeLibSamplesRequest extends AbstractModel{

    /**
    * 单页条数，最大为100条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 条数偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 词库ID
    */
    @SerializedName("LibID")
    @Expose
    private String LibID;

    /**
    * 词内容过滤
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 违规类型列表过滤
    */
    @SerializedName("EvilTypeList")
    @Expose
    private Long [] EvilTypeList;

    /**
    * 样本词ID列表过滤
    */
    @SerializedName("SampleIDs")
    @Expose
    private String [] SampleIDs;

    /**
     * Get 单页条数，最大为100条 
     * @return Limit 单页条数，最大为100条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数，最大为100条
     * @param Limit 单页条数，最大为100条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 条数偏移量 
     * @return Offset 条数偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 条数偏移量
     * @param Offset 条数偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 词库ID 
     * @return LibID 词库ID
     */
    public String getLibID() {
        return this.LibID;
    }

    /**
     * Set 词库ID
     * @param LibID 词库ID
     */
    public void setLibID(String LibID) {
        this.LibID = LibID;
    }

    /**
     * Get 词内容过滤 
     * @return Content 词内容过滤
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 词内容过滤
     * @param Content 词内容过滤
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 违规类型列表过滤 
     * @return EvilTypeList 违规类型列表过滤
     */
    public Long [] getEvilTypeList() {
        return this.EvilTypeList;
    }

    /**
     * Set 违规类型列表过滤
     * @param EvilTypeList 违规类型列表过滤
     */
    public void setEvilTypeList(Long [] EvilTypeList) {
        this.EvilTypeList = EvilTypeList;
    }

    /**
     * Get 样本词ID列表过滤 
     * @return SampleIDs 样本词ID列表过滤
     */
    public String [] getSampleIDs() {
        return this.SampleIDs;
    }

    /**
     * Set 样本词ID列表过滤
     * @param SampleIDs 样本词ID列表过滤
     */
    public void setSampleIDs(String [] SampleIDs) {
        this.SampleIDs = SampleIDs;
    }

    public DescribeLibSamplesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibSamplesRequest(DescribeLibSamplesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LibID != null) {
            this.LibID = new String(source.LibID);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.EvilTypeList != null) {
            this.EvilTypeList = new Long[source.EvilTypeList.length];
            for (int i = 0; i < source.EvilTypeList.length; i++) {
                this.EvilTypeList[i] = new Long(source.EvilTypeList[i]);
            }
        }
        if (source.SampleIDs != null) {
            this.SampleIDs = new String[source.SampleIDs.length];
            for (int i = 0; i < source.SampleIDs.length; i++) {
                this.SampleIDs[i] = new String(source.SampleIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "LibID", this.LibID);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "EvilTypeList.", this.EvilTypeList);
        this.setParamArraySimple(map, prefix + "SampleIDs.", this.SampleIDs);

    }
}

