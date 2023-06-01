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

public class DeleteSampleDetails extends AbstractModel{

    /**
    * 关键词ID
    */
    @SerializedName("SampleID")
    @Expose
    private String SampleID;

    /**
    * 关键词内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 是否删除成功
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
    * 错误信息
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
     * Get 关键词ID 
     * @return SampleID 关键词ID
     */
    public String getSampleID() {
        return this.SampleID;
    }

    /**
     * Set 关键词ID
     * @param SampleID 关键词ID
     */
    public void setSampleID(String SampleID) {
        this.SampleID = SampleID;
    }

    /**
     * Get 关键词内容 
     * @return Content 关键词内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 关键词内容
     * @param Content 关键词内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 是否删除成功 
     * @return Deleted 是否删除成功
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 是否删除成功
     * @param Deleted 是否删除成功
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 错误信息 
     * @return ErrorInfo 错误信息
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 错误信息
     * @param ErrorInfo 错误信息
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    public DeleteSampleDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSampleDetails(DeleteSampleDetails source) {
        if (source.SampleID != null) {
            this.SampleID = new String(source.SampleID);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SampleID", this.SampleID);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);

    }
}

